package com.github.h0ru5.neopixel;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : rpi_ws281x\pwm.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class pwm_pin_tables_t extends Structure {
	public int count;
	/** C type : const pwm_pin_table_t* */
	public com.github.h0ru5.neopixel.pwm_pin_table_t.ByReference pins;
	public pwm_pin_tables_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("count", "pins");
	}
	/** @param pins C type : const pwm_pin_table_t* */
	public pwm_pin_tables_t(int count, com.github.h0ru5.neopixel.pwm_pin_table_t.ByReference pins) {
		super();
		this.count = count;
		this.pins = pins;
	}
	public static class ByReference extends pwm_pin_tables_t implements Structure.ByReference {
		
	};
	public static class ByValue extends pwm_pin_tables_t implements Structure.ByValue {
		
	};
}
