package com.github.h0ru5.neopixel;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : rpi_ws281x\dma.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class dma_t extends Structure {
	public int cs;
	public int conblk_ad;
	public int ti;
	public int source_ad;
	public int dest_ad;
	public int txfr_len;
	public int stride;
	public int nextconbk;
	public int debug;
	public dma_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("cs", "conblk_ad", "ti", "source_ad", "dest_ad", "txfr_len", "stride", "nextconbk", "debug");
	}
	public dma_t(int cs, int conblk_ad, int ti, int source_ad, int dest_ad, int txfr_len, int stride, int nextconbk, int debug) {
		super();
		this.cs = cs;
		this.conblk_ad = conblk_ad;
		this.ti = ti;
		this.source_ad = source_ad;
		this.dest_ad = dest_ad;
		this.txfr_len = txfr_len;
		this.stride = stride;
		this.nextconbk = nextconbk;
		this.debug = debug;
	}
	public static class ByReference extends dma_t implements Structure.ByReference {
		
	};
	public static class ByValue extends dma_t implements Structure.ByValue {
		
	};
}
