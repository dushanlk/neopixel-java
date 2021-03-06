package com.github.h0ru5.neopixel;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : rpi_ws281x\clk.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cm_pwm_t extends Structure {
	public int ctl;
	public int div;
	public cm_pwm_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ctl", "div");
	}
	public cm_pwm_t(int ctl, int div) {
		super();
		this.ctl = ctl;
		this.div = div;
	}
	public static class ByReference extends cm_pwm_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cm_pwm_t implements Structure.ByValue {
		
	};
}
