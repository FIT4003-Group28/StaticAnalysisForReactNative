package defpackage;

import java.io.DataInput;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: eave  reason: default package */
/* loaded from: classes6.dex */
public final class eave {
    public static eaou a(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != 67) {
            if (readUnsignedByte == 70) {
                eavg eavgVar = new eavg(str, dataInput.readUTF(), (int) b(dataInput), (int) b(dataInput));
                return eavgVar.equals(eaou.b) ? eaou.b : eavgVar;
            } else if (readUnsignedByte == 80) {
                return eavc.g(dataInput, str);
            } else {
                throw new IOException("Invalid encoding");
            }
        }
        return new eauz(eavc.g(dataInput, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(DataInput dataInput) {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i == 1) {
            readUnsignedByte = dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        } else if (i == 2) {
            readUnsignedByte = ((readUnsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
            j = 1000;
        } else if (i == 3) {
            return dataInput.readLong();
        } else {
            readUnsignedByte = (readUnsignedByte2 << 26) >> 26;
            j = 1800000;
        }
        return readUnsignedByte * j;
    }
}
