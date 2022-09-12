package defpackage;

import java.io.DataInput;
/* compiled from: PG */
/* renamed from: bvpf  reason: default package */
/* loaded from: classes4.dex */
public final class bvpf {
    public static int a(DataInput dataInput) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte < 128) {
            return readUnsignedByte;
        }
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = (readUnsignedByte & 127) | ((readUnsignedByte2 & 127) << 7);
        if (readUnsignedByte2 < 128) {
            return i;
        }
        int readUnsignedByte3 = dataInput.readUnsignedByte();
        int i2 = i | ((readUnsignedByte3 & 127) << 14);
        if (readUnsignedByte3 < 128) {
            return i2;
        }
        int readUnsignedByte4 = dataInput.readUnsignedByte();
        int i3 = i2 | ((readUnsignedByte4 & 127) << 21);
        if (readUnsignedByte4 < 128) {
            return i3;
        }
        int readUnsignedByte5 = dataInput.readUnsignedByte();
        int i4 = i3 | ((readUnsignedByte5 & 127) << 28);
        if (readUnsignedByte5 >= 128) {
            while (readUnsignedByte5 >= 128) {
                readUnsignedByte5 = dataInput.readUnsignedByte();
            }
        }
        return i4;
    }

    public static int b(DataInput dataInput) {
        int a = a(dataInput);
        return (-(a & 1)) ^ (a >>> 1);
    }
}
