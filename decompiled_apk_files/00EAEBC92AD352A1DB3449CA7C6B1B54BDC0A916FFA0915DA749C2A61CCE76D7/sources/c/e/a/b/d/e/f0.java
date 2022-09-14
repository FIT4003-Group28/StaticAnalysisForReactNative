package c.e.a.b.d.e;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f0<K, V> extends b0<K, V> {

    /* renamed from: h  reason: collision with root package name */
    static final b0<Object, Object> f3897h = new f0(null, new Object[0], 0);

    /* renamed from: e  reason: collision with root package name */
    private final transient Object f3898e;

    /* renamed from: f  reason: collision with root package name */
    private final transient Object[] f3899f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int f3900g;

    private f0(Object obj, Object[] objArr, int i) {
        this.f3898e = obj;
        this.f3899f = objArr;
        this.f3900g = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f1, code lost:
        r2[r7] = r4;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <K, V> c.e.a.b.d.e.f0<K, V> a(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.e.f0.a(int, java.lang.Object[]):c.e.a.b.d.e.f0");
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
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

    @Override // c.e.a.b.d.e.b0
    final d0<Map.Entry<K, V>> a() {
        return new e0(this, this.f3899f, 0, this.f3900g);
    }

    @Override // c.e.a.b.d.e.b0
    final d0<K> b() {
        return new g0(this, new j0(this.f3899f, 0, this.f3900g));
    }

    @Override // c.e.a.b.d.e.b0
    final x<V> c() {
        return new j0(this.f3899f, 1, this.f3900g);
    }

    @Override // c.e.a.b.d.e.b0, java.util.Map
    public final V get(Object obj) {
        Object obj2 = this.f3898e;
        Object[] objArr = this.f3899f;
        int i = this.f3900g;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (!objArr[0].equals(obj)) {
                return null;
            }
            return (V) objArr[1];
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int a2 = u.a(obj.hashCode());
                while (true) {
                    int i2 = a2 & length;
                    int i3 = bArr[i2] & 255;
                    if (i3 == 255) {
                        return null;
                    }
                    if (objArr[i3].equals(obj)) {
                        return (V) objArr[i3 ^ 1];
                    }
                    a2 = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int a3 = u.a(obj.hashCode());
                while (true) {
                    int i4 = a3 & length2;
                    int i5 = sArr[i4] & 65535;
                    if (i5 == 65535) {
                        return null;
                    }
                    if (objArr[i5].equals(obj)) {
                        return (V) objArr[i5 ^ 1];
                    }
                    a3 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int a4 = u.a(obj.hashCode());
                while (true) {
                    int i6 = a4 & length3;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        return null;
                    }
                    if (objArr[i7].equals(obj)) {
                        return (V) objArr[i7 ^ 1];
                    }
                    a4 = i6 + 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3900g;
    }
}
