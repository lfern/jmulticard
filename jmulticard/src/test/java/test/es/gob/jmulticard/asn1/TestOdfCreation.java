package test.es.gob.jmulticard.asn1;

import org.junit.Test;

import es.gob.jmulticard.asn1.der.pkcs15.Odf;

/** Pruebas de de ODF PKCS#15.
 * @author Tom&aacute;s Garc&iacute;a-Mer&aacute;s */
public final class TestOdfCreation {

	private static final byte[] SAMPLE_ODF = new byte[] {
		(byte) 0xA0, (byte) 0x06, (byte) 0x30, (byte) 0x04, (byte) 0x04, (byte) 0x02, (byte) 0x44, (byte) 0x00,
		(byte) 0xA1, (byte) 0x06, (byte) 0x30, (byte) 0x04, (byte) 0x04, (byte) 0x02, (byte) 0x44, (byte) 0x01,
		(byte) 0xA4, (byte) 0x06, (byte) 0x30, (byte) 0x04, (byte) 0x04, (byte) 0x02, (byte) 0x44, (byte) 0x04,
		(byte) 0xA7, (byte) 0x06, (byte) 0x30, (byte) 0x04, (byte) 0x04, (byte) 0x02, (byte) 0x44, (byte) 0x07,
		(byte) 0xA8, (byte) 0x06, (byte) 0x30, (byte) 0x04, (byte) 0x04, (byte) 0x02, (byte) 0x44, (byte) 0x08,
		(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00
	};

	/** Prueba de an&aacute;lisis de ODF de ejemplo.
	 * @throws Exception En cualquier error. */
	@SuppressWarnings("static-method")
	@Test
	public void testOdf() throws Exception {
		final Odf odf = new Odf();
		odf.setDerValue(SAMPLE_ODF);
		System.out.println(odf);
	}

}
