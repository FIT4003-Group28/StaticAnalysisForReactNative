package defpackage;
/* compiled from: PG */
/* renamed from: eaod  reason: default package */
/* loaded from: classes6.dex */
public final class eaod {
    protected final byte[][] a = new byte[eaob.values().length];
    protected final char[][] b = new char[eaoc.values().length];

    public final byte[] a(eaob eaobVar) {
        int ordinal = eaobVar.ordinal();
        byte[][] bArr = this.a;
        byte[] bArr2 = bArr[ordinal];
        if (bArr2 == null) {
            return new byte[eaobVar.d];
        }
        bArr[ordinal] = null;
        return bArr2;
    }

    public final void b(eaob eaobVar, byte[] bArr) {
        this.a[eaobVar.ordinal()] = bArr;
    }

    public final char[] c(eaoc eaocVar) {
        return d(eaocVar, 0);
    }

    public final char[] d(eaoc eaocVar, int i) {
        eaoc eaocVar2 = eaoc.TOKEN_BUFFER;
        int i2 = eaocVar.e;
        if (i2 > i) {
            i = i2;
        }
        int ordinal = eaocVar.ordinal();
        char[][] cArr = this.b;
        char[] cArr2 = cArr[ordinal];
        if (cArr2 == null || cArr2.length < i) {
            return new char[i];
        }
        cArr[ordinal] = null;
        return cArr2;
    }

    public final void e(eaoc eaocVar, char[] cArr) {
        this.b[eaocVar.ordinal()] = cArr;
    }
}
