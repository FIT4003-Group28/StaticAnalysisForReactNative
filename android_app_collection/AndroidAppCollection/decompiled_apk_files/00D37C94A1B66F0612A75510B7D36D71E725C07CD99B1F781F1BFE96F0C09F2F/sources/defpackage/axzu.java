package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: axzu  reason: default package */
/* loaded from: classes2.dex */
public final class axzu {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final aneg b = ayat.b;

    public static int a(ayat ayatVar) {
        return ayatVar.d;
    }

    public static ayaq b(String str, axzt axztVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return ayaq.d(str, z, axztVar);
    }

    public static ayat c(byte[]... bArr) {
        return new ayat(bArr.length >> 1, bArr);
    }

    public static ayat d(int i, Object[] objArr) {
        return new ayat(i, objArr);
    }

    public static Object[] e(ayat ayatVar) {
        Object[] objArr = new Object[ayatVar.a()];
        for (int i = 0; i < ayatVar.d; i++) {
            int i2 = i + i;
            objArr[i2] = ayatVar.g(i);
            int i3 = i2 + 1;
            Object c = ayatVar.c(i);
            if (c instanceof byte[]) {
                objArr[i3] = c;
            } else {
                azos azosVar = (azos) c;
                throw null;
            }
        }
        return objArr;
    }

    public static byte[][] f(ayat ayatVar) {
        byte[][] bArr = new byte[ayatVar.a()];
        Object[] objArr = ayatVar.c;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, ayatVar.a());
        } else {
            for (int i = 0; i < ayatVar.d; i++) {
                int i2 = i + i;
                bArr[i2] = ayatVar.g(i);
                bArr[i2 + 1] = ayatVar.h(i);
            }
        }
        return bArr;
    }
}
