package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcmn  reason: default package */
/* loaded from: classes.dex */
public final class dcmn<K, V> extends dcdn<K, V> {
    public static final dcdn<Object, Object> a = new dcmn(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] d;
    public final transient int e;
    private final transient Object f;

    private dcmn(Object obj, Object[] objArr, int i) {
        this.f = obj;
        this.d = objArr;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> dcmn<K, V> e(int i, Object[] objArr) {
        if (i == 0) {
            return (dcmn) a;
        }
        if (i == 1) {
            dbzb.a(objArr[0], objArr[1]);
            return new dcmn<>(null, objArr, 1);
        }
        dbsk.y(i, objArr.length >> 1);
        return new dcmn<>(i(objArr, i, dcep.J(i), 0), objArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object i(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            if (r10 != r0) goto Le
            r10 = r9[r12]
            r11 = r12 ^ 1
            r9 = r9[r11]
            defpackage.dbzb.a(r10, r9)
            r9 = 0
            return r9
        Le:
            int r0 = r11 + (-1)
            r1 = 128(0x80, float:1.794E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L50
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L1b:
            if (r2 >= r10) goto L4f
            int r1 = r2 + r2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            defpackage.dbzb.a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = defpackage.dccj.a(r5)
        L31:
            r5 = r5 & r0
            r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L3f
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L1b
        L3f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L4a
            int r5 = r5 + 1
            goto L31
        L4a:
            java.lang.IllegalArgumentException r9 = v(r3, r4, r9, r6)
            throw r9
        L4f:
            return r11
        L50:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 > r1) goto L90
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L5a:
            if (r2 >= r10) goto L8f
            int r1 = r2 + r2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            defpackage.dbzb.a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = defpackage.dccj.a(r5)
        L70:
            r5 = r5 & r0
            short r6 = r11[r5]
            char r6 = (char) r6
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r6 != r7) goto L7f
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L5a
        L7f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L8a
            int r5 = r5 + 1
            goto L70
        L8a:
            java.lang.IllegalArgumentException r9 = v(r3, r4, r9, r6)
            throw r9
        L8f:
            return r11
        L90:
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L95:
            if (r2 >= r10) goto Lc5
            int r1 = r2 + r2
            int r1 = r1 + r12
            r4 = r9[r1]
            r5 = r1 ^ 1
            r5 = r9[r5]
            defpackage.dbzb.a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = defpackage.dccj.a(r6)
        Lab:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 != r3) goto Lb5
            r11[r6] = r1
            int r2 = r2 + 1
            goto L95
        Lb5:
            r8 = r9[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto Lc0
            int r6 = r6 + 1
            goto Lab
        Lc0:
            java.lang.IllegalArgumentException r9 = v(r4, r5, r9, r7)
            throw r9
        Lc5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcmn.i(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object j(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            if (!objArr[i2].equals(obj2)) {
                return null;
            }
            return objArr[i2 ^ 1];
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int a2 = dccj.a(obj2.hashCode());
                while (true) {
                    int i3 = a2 & length;
                    int i4 = bArr[i3] & 255;
                    if (i4 == 255) {
                        return null;
                    }
                    if (objArr[i4].equals(obj2)) {
                        return objArr[i4 ^ 1];
                    }
                    a2 = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int a3 = dccj.a(obj2.hashCode());
                while (true) {
                    int i5 = a3 & length2;
                    char c = (char) sArr[i5];
                    if (c == 65535) {
                        return null;
                    }
                    if (objArr[c].equals(obj2)) {
                        return objArr[c ^ 1];
                    }
                    a3 = i5 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int a4 = dccj.a(obj2.hashCode());
                while (true) {
                    int i6 = a4 & length3;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        return null;
                    }
                    if (objArr[i7].equals(obj2)) {
                        return objArr[i7 ^ 1];
                    }
                    a4 = i6 + 1;
                }
            }
        }
    }

    private static IllegalArgumentException v(Object obj, Object obj2, Object[] objArr, int i) {
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

    @Override // defpackage.dcdn
    public final dcep<Map.Entry<K, V>> SM() {
        return new dcmk(this, this.d, 0, this.e);
    }

    @Override // defpackage.dcdn
    public final boolean c() {
        return false;
    }

    @Override // defpackage.dcdn
    public final dcep<K> d() {
        return new dcml(this, new dcmm(this.d, 0, this.e));
    }

    @Override // defpackage.dcdn
    public final dccr<V> g() {
        return new dcmm(this.d, 1, this.e);
    }

    @Override // defpackage.dcdn, java.util.Map
    public final V get(Object obj) {
        return (V) j(this.f, this.d, this.e, 0, obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.e;
    }
}
