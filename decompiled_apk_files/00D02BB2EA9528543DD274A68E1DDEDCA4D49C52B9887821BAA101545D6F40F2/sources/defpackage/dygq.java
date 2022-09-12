package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dygq  reason: default package */
/* loaded from: classes6.dex */
public final class dygq {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final ddae b = dyhw.c;

    public static <T> dyhs<T> a(String str, dygp<T> dygpVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return dyhs.e(str, z, dygpVar);
    }

    public static dyhw b(byte[]... bArr) {
        return new dyhw(bArr.length >> 1, bArr);
    }

    public static byte[][] c(dyhw dyhwVar) {
        byte[][] bArr = new byte[dyhwVar.e()];
        Object[] objArr = dyhwVar.d;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, dyhwVar.e());
        } else {
            for (int i = 0; i < dyhwVar.e; i++) {
                int i2 = i + i;
                bArr[i2] = dyhwVar.a(i);
                bArr[i2 + 1] = dyhwVar.c(i);
            }
        }
        return bArr;
    }

    public static int d(dyhw dyhwVar) {
        return dyhwVar.e;
    }

    public static Object[] e(dyhw dyhwVar) {
        Object[] objArr = new Object[dyhwVar.e()];
        for (int i = 0; i < dyhwVar.e; i++) {
            int i2 = i + i;
            objArr[i2] = dyhwVar.a(i);
            int i3 = i2 + 1;
            Object b2 = dyhwVar.b(i);
            if (b2 instanceof byte[]) {
                objArr[i3] = b2;
            } else {
                dyht dyhtVar = (dyht) b2;
                throw null;
            }
        }
        return objArr;
    }

    public static dyhw f(int i, Object[] objArr) {
        return new dyhw(i, objArr);
    }
}
