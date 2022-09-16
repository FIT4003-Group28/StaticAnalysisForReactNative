package defpackage;
/* compiled from: PG */
/* renamed from: amyc  reason: default package */
/* loaded from: classes.dex */
public final class amyc extends amup {
    public static final amup b = new amyc(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] c;
    public final transient int d;
    private final transient Object e;

    private amyc(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.c = objArr;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amyc a(int i, Object[] objArr) {
        if (i == 0) {
            return (amyc) b;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            Object obj2 = objArr[1];
            obj2.getClass();
            araa.t(obj, obj2);
            return new amyc(null, objArr, 1);
        }
        aqxo.H(i, objArr.length >> 1);
        return new amyc(r(objArr, i, amvn.f(i), 0), objArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object r(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amyc.r(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object s(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            obj4.getClass();
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int F = arey.F(obj2.hashCode());
                while (true) {
                    int i3 = F & length;
                    int i4 = bArr[i3] & 255;
                    if (i4 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i4])) {
                        return objArr[i4 ^ 1];
                    }
                    F = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int F2 = arey.F(obj2.hashCode());
                while (true) {
                    int i5 = F2 & length2;
                    char c = (char) sArr[i5];
                    if (c == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[c])) {
                        return objArr[c ^ 1];
                    }
                    F2 = i5 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int F3 = arey.F(obj2.hashCode());
                while (true) {
                    int i6 = F3 & length3;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i7])) {
                        return objArr[i7 ^ 1];
                    }
                    F3 = i6 + 1;
                }
            }
        }
    }

    private static IllegalArgumentException t(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.amup
    public final amub d() {
        return new amyb(this.c, 1, this.d);
    }

    @Override // defpackage.amup
    public final amvn g() {
        return new amya(this, new amyb(this.c, 0, this.d));
    }

    @Override // defpackage.amup, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object s = s(this.e, this.c, this.d, 0, obj);
        if (s == null) {
            return null;
        }
        return s;
    }

    @Override // defpackage.amup
    public final amvn sd() {
        return new amxz(this, this.c, 0, this.d);
    }

    @Override // defpackage.amup
    public final void sf() {
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.d;
    }
}
