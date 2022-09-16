package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aot  reason: default package */
/* loaded from: classes.dex */
public final class aot {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public aot(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public aot(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    public static aot b(String str) {
        byte[] bytes = (str + (char) 0).getBytes(aow.h);
        return new aot(2, bytes.length, bytes);
    }

    public static aot c(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aow.e[4]]);
        wrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            wrap.putInt((int) jArr[i]);
        }
        return new aot(4, 1, wrap.array());
    }

    public static aot d(aov aovVar, ByteOrder byteOrder) {
        aov[] aovVarArr = {aovVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aow.e[5]]);
        wrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            aov aovVar2 = aovVarArr[i];
            wrap.putInt((int) aovVar2.a);
            wrap.putInt((int) aovVar2.b);
        }
        return new aot(5, 1, wrap.array());
    }

    public static aot e(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aow.e[3]]);
        wrap.order(byteOrder);
        for (int i2 = 0; i2 <= 0; i2++) {
            wrap.putShort((short) iArr[i2]);
        }
        return new aot(3, 1, wrap.array());
    }

    public final int a(ByteOrder byteOrder) {
        Object f = f(byteOrder);
        if (f == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (f instanceof String) {
            return Integer.parseInt((String) f);
        }
        if (f instanceof long[]) {
            long[] jArr = (long[]) f;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        } else if (f instanceof int[]) {
            int[] iArr = (int[]) f;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        } else {
            throw new NumberFormatException("Couldn't find a integer value");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x019b: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:150:0x019b */
    /* JADX WARN: Removed duplicated region for block: B:180:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.nio.ByteOrder r11) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aot.f(java.nio.ByteOrder):java.lang.Object");
    }

    public final String g(ByteOrder byteOrder) {
        Object f = f(byteOrder);
        if (f == null) {
            return null;
        }
        if (f instanceof String) {
            return (String) f;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (f instanceof long[]) {
            long[] jArr = (long[]) f;
            while (true) {
                int length = jArr.length;
                if (i < length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != length) {
                        sb.append(",");
                    }
                } else {
                    return sb.toString();
                }
            }
        } else if (f instanceof int[]) {
            int[] iArr = (int[]) f;
            while (true) {
                int length2 = iArr.length;
                if (i < length2) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != length2) {
                        sb.append(",");
                    }
                } else {
                    return sb.toString();
                }
            }
        } else if (f instanceof double[]) {
            double[] dArr = (double[]) f;
            while (true) {
                int length3 = dArr.length;
                if (i < length3) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != length3) {
                        sb.append(",");
                    }
                } else {
                    return sb.toString();
                }
            }
        } else if (!(f instanceof aov[])) {
            return null;
        } else {
            aov[] aovVarArr = (aov[]) f;
            while (true) {
                int length4 = aovVarArr.length;
                if (i < length4) {
                    sb.append(aovVarArr[i].a);
                    sb.append('/');
                    sb.append(aovVarArr[i].b);
                    i++;
                    if (i != length4) {
                        sb.append(",");
                    }
                } else {
                    return sb.toString();
                }
            }
        }
    }

    public final String toString() {
        return "(" + aow.d[this.a] + ", data length:" + this.d.length + ")";
    }
}
