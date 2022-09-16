package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
/* compiled from: PG */
/* renamed from: anak  reason: default package */
/* loaded from: classes.dex */
public final class anak {
    public static final byte[] a = {0};

    private anak() {
    }

    public static byte[] a(byte[] bArr, int i) {
        Deflater deflater = new Deflater();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr, 0, i);
            deflaterOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
            deflater.end();
        }
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        Inflater inflater = new Inflater();
        inflater.setInput(bArr, 0, i);
        try {
            try {
                byte[] bArr2 = new byte[i2];
                inflater.inflate(bArr2);
                return bArr2;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } finally {
            inflater.end();
        }
    }
}
