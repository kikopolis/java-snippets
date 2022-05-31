package test.strings;

import main.strings.NameInverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameInverterTest {
    private NameInverter inverter;
    
    @BeforeEach
    void setUp() {
        inverter = new NameInverter();
    }
    
    @Test
    void invert_null_should_return_empty_string() {
        assertEquals("", inverter.invert(null));
    }
    
    @Test
    void invert_empty_string_should_return_empty_string() {
        assertEquals("", inverter.invert(""));
        assertEquals("", inverter.invert("       "));
    }
    
    @Test
    void invert_only_first_name_should_return_first_name() {
        assertEquals("John", inverter.invert("John"));
        assertEquals("John", inverter.invert("   John         "));
    }
    
    @Test
    void invert_first_and_last_name_should_return_last_comma_first() {
        assertEquals("Smith, John", inverter.invert("John Smith"));
        assertEquals("Smith, John", inverter.invert("John       Smith"));
    }
    
    @Test
    void invert_honorifics_first_and_last_name_should_return_last_comma_first() {
        assertEquals("Smith, John", inverter.invert("Mr. John Smith"));
        assertEquals("Smith, Jane", inverter.invert("Ms. Jane Smith"));
        assertEquals("Smith, Jane", inverter.invert("Mrs. Jane Smith"));
        assertEquals("Smith, Jane", inverter.invert("Dr. Jane Smith"));
    }
    
    @Test
    void invert_postnominals_should_return_last_comma_first_postnominals() {
        assertEquals("Smith, John Sr.", inverter.invert("John Smith Sr."));
        assertEquals("Smith, John Jr. PhD.", inverter.invert("John Smith Jr. PhD."));
    }
    
    @Test
    void invert_with_many_first_names_should_return_last_comma_all_first_names() {
        assertEquals("Smith, John Albert Philip Castor Jr. PhD.", inverter.invert("Mr. John Albert Philip Castor Smith Jr. PhD."));
    }
    
    @Test
    void invert_acceptance_test() {
        assertEquals("Smith, John Sr. PhD.", inverter.invert("Mr.     John       Smith  Sr.      PhD. "));
    }
}