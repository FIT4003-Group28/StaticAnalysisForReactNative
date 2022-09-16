package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p6<T> implements b7<T> {
    private static final int[] q = new int[0];
    private static final Unsafe r = a8.c();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f4345a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f4346b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4347c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4348d;

    /* renamed from: e  reason: collision with root package name */
    private final k6 f4349e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f4350f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f4351g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f4352h;
    private final int[] i;
    private final int j;
    private final int k;
    private final s6 l;
    private final u5 m;
    private final u7<?, ?> n;
    private final r4<?> o;
    private final h6 p;

    private p6(int[] iArr, Object[] objArr, int i, int i2, k6 k6Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, s6 s6Var, u5 u5Var, u7<?, ?> u7Var, r4<?> r4Var, h6 h6Var) {
        this.f4345a = iArr;
        this.f4346b = objArr;
        this.f4347c = i;
        this.f4348d = i2;
        boolean z3 = k6Var instanceof b5;
        this.f4351g = z;
        this.f4350f = r4Var != null && r4Var.a(k6Var);
        this.f4352h = false;
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = s6Var;
        this.m = u5Var;
        this.n = u7Var;
        this.o = r4Var;
        this.f4349e = k6Var;
        this.p = h6Var;
    }

    private final int a(int i, int i2) {
        if (i < this.f4347c || i > this.f4348d) {
            return -1;
        }
        return b(i, i2);
    }

    private static <UT, UB> int a(u7<UT, UB> u7Var, T t) {
        return u7Var.d(u7Var.a(t));
    }

    private final int a(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, q3 q3Var) {
        Object valueOf;
        Object valueOf2;
        int b2;
        long j2;
        int i9;
        Object valueOf3;
        Unsafe unsafe = r;
        long j3 = this.f4345a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    valueOf = Double.valueOf(r3.c(bArr, i));
                    unsafe.putObject(t, j, valueOf);
                    b2 = i + 8;
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    valueOf2 = Float.valueOf(r3.d(bArr, i));
                    unsafe.putObject(t, j, valueOf2);
                    b2 = i + 4;
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    b2 = r3.b(bArr, i, q3Var);
                    j2 = q3Var.f4368b;
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    b2 = r3.a(bArr, i, q3Var);
                    i9 = q3Var.f4367a;
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    valueOf = Long.valueOf(r3.b(bArr, i));
                    unsafe.putObject(t, j, valueOf);
                    b2 = i + 8;
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    valueOf2 = Integer.valueOf(r3.a(bArr, i));
                    unsafe.putObject(t, j, valueOf2);
                    b2 = i + 4;
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    b2 = r3.b(bArr, i, q3Var);
                    valueOf3 = Boolean.valueOf(q3Var.f4368b != 0);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    b2 = r3.a(bArr, i, q3Var);
                    int i10 = q3Var.f4367a;
                    if (i10 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t, j, valueOf3);
                        unsafe.putInt(t, j3, i4);
                        return b2;
                    } else if ((i6 & 536870912) != 0 && !c8.a(bArr, b2, b2 + i10)) {
                        throw j5.f();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, b2, i10, e5.f4123a));
                        b2 += i10;
                        unsafe.putInt(t, j3, i4);
                        return b2;
                    }
                }
                return i;
            case 60:
                if (i5 == 2) {
                    b2 = r3.a(a(i8), bArr, i, i2, q3Var);
                    Object object = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j) : null;
                    valueOf3 = q3Var.f4369c;
                    if (object != null) {
                        valueOf3 = e5.a(object, valueOf3);
                    }
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    b2 = r3.e(bArr, i, q3Var);
                    valueOf3 = q3Var.f4369c;
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int a2 = r3.a(bArr, i, q3Var);
                    int i11 = q3Var.f4367a;
                    f5 c2 = c(i8);
                    if (c2 != null && !c2.a(i11)) {
                        e(t).a(i3, Long.valueOf(i11));
                        return a2;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i11));
                    b2 = a2;
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    b2 = r3.a(bArr, i, q3Var);
                    i9 = h4.a(q3Var.f4367a);
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    b2 = r3.b(bArr, i, q3Var);
                    j2 = h4.a(q3Var.f4368b);
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    b2 = r3.a(a(i8), bArr, i, i2, (i3 & (-8)) | 4, q3Var);
                    Object object2 = unsafe.getInt(t, j3) == i4 ? unsafe.getObject(t, j) : null;
                    valueOf3 = q3Var.f4369c;
                    if (object2 != null) {
                        valueOf3 = e5.a(object2, valueOf3);
                    }
                    unsafe.putObject(t, j, valueOf3);
                    unsafe.putInt(t, j3, i4);
                    return b2;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x026e, code lost:
        if (r30.f4368b != 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0270, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0272, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0273, code lost:
        r11.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0276, code lost:
        if (r4 >= r20) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0278, code lost:
        r6 = c.e.a.b.d.g.r3.a(r18, r4, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x027e, code lost:
        if (r21 != r30.f4367a) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0280, code lost:
        r4 = c.e.a.b.d.g.r3.b(r18, r6, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0288, code lost:
        if (r30.f4368b == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
        if (r4 == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
        r11.add(c.e.a.b.d.g.v3.f4474c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0148, code lost:
        r11.add(c.e.a.b.d.g.v3.a(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0150, code lost:
        if (r1 >= r20) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0152, code lost:
        r4 = c.e.a.b.d.g.r3.a(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0158, code lost:
        if (r21 != r30.f4367a) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015a, code lost:
        r1 = c.e.a.b.d.g.r3.a(r18, r4, r30);
        r4 = r30.f4367a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0160, code lost:
        if (r4 < 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
        if (r4 > (r18.length - r1)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
        if (r4 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016d, code lost:
        throw c.e.a.b.d.g.j5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0172, code lost:
        throw c.e.a.b.d.g.j5.b();
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01cf -> B:94:0x01ae). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x01fd -> B:117:0x0201). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0213 -> B:112:0x01ea). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0272 -> B:153:0x0273). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x0288 -> B:151:0x0270). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0148 -> B:69:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0166 -> B:67:0x0142). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01b9 -> B:97:0x01bd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, c.e.a.b.d.g.q3 r30) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.p6.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, c.e.a.b.d.g.q3):int");
    }

    private final <K, V> int a(T t, byte[] bArr, int i, int i2, int i3, long j, q3 q3Var) {
        Unsafe unsafe = r;
        Object b2 = b(i3);
        Object object = unsafe.getObject(t, j);
        if (this.p.b(object)) {
            Object e2 = this.p.e(b2);
            this.p.a(e2, object);
            unsafe.putObject(t, j, e2);
        }
        this.p.d(b2);
        throw null;
    }

    private final b7 a(int i) {
        int i2 = (i / 3) << 1;
        b7 b7Var = (b7) this.f4346b[i2];
        if (b7Var != null) {
            return b7Var;
        }
        b7<T> a2 = y6.a().a((Class) ((Class) this.f4346b[i2 + 1]));
        this.f4346b[i2] = a2;
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> p6<T> a(Class<T> cls, i6 i6Var, s6 s6Var, u5 u5Var, u7<?, ?> u7Var, r4<?> r4Var, h6 h6Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt;
        int i7;
        char charAt2;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        char c2;
        int i13;
        char charAt3;
        int i14;
        char charAt4;
        int i15;
        char charAt5;
        char charAt6;
        char charAt7;
        char charAt8;
        char charAt9;
        char charAt10;
        int i16;
        int i17;
        int[] iArr2;
        int i18;
        int objectFieldOffset;
        Class<?> cls2;
        int i19;
        int i20;
        int i21;
        Field a2;
        char charAt11;
        int i22;
        Field a3;
        Field a4;
        int i23;
        char charAt12;
        int i24;
        char charAt13;
        int i25;
        char charAt14;
        char charAt15;
        if (!(i6Var instanceof z6)) {
            ((n7) i6Var).f();
            throw null;
        }
        z6 z6Var = (z6) i6Var;
        boolean z = z6Var.f() == b5.f.j;
        String a5 = z6Var.a();
        int length = a5.length();
        if (a5.charAt(0) >= 55296) {
            int i26 = 1;
            while (true) {
                i = i26 + 1;
                if (a5.charAt(i26) < 55296) {
                    break;
                }
                i26 = i;
            }
        } else {
            i = 1;
        }
        int i27 = i + 1;
        int charAt16 = a5.charAt(i);
        if (charAt16 >= 55296) {
            int i28 = charAt16 & 8191;
            int i29 = 13;
            while (true) {
                i2 = i27 + 1;
                charAt15 = a5.charAt(i27);
                if (charAt15 < 55296) {
                    break;
                }
                i28 |= (charAt15 & 8191) << i29;
                i29 += 13;
                i27 = i2;
            }
            charAt16 = i28 | (charAt15 << i29);
        } else {
            i2 = i27;
        }
        if (charAt16 == 0) {
            iArr = q;
            i10 = 0;
            i12 = 0;
            c2 = 0;
            charAt = 0;
            charAt2 = 0;
            i11 = 0;
            i9 = 0;
        } else {
            int i30 = i2 + 1;
            char charAt17 = a5.charAt(i2);
            if (charAt17 >= 55296) {
                int i31 = charAt17 & 8191;
                int i32 = 13;
                while (true) {
                    i3 = i30 + 1;
                    charAt10 = a5.charAt(i30);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i31 |= (charAt10 & 8191) << i32;
                    i32 += 13;
                    i30 = i3;
                }
                i4 = (charAt10 << i32) | i31;
            } else {
                i3 = i30;
                i4 = charAt17;
            }
            int i33 = i3 + 1;
            int charAt18 = a5.charAt(i3);
            if (charAt18 >= 55296) {
                int i34 = charAt18 & 8191;
                int i35 = 13;
                while (true) {
                    i5 = i33 + 1;
                    charAt9 = a5.charAt(i33);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i34 |= (charAt9 & 8191) << i35;
                    i35 += 13;
                    i33 = i5;
                }
                charAt18 = i34 | (charAt9 << i35);
            } else {
                i5 = i33;
            }
            int i36 = i5 + 1;
            char charAt19 = a5.charAt(i5);
            if (charAt19 >= 55296) {
                int i37 = charAt19 & 8191;
                int i38 = 13;
                while (true) {
                    i6 = i36 + 1;
                    charAt8 = a5.charAt(i36);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i37 |= (charAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i6;
                }
                charAt19 = (charAt8 << i38) | i37;
            } else {
                i6 = i36;
            }
            int i39 = i6 + 1;
            charAt = a5.charAt(i6);
            if (charAt >= 55296) {
                int i40 = charAt & 8191;
                int i41 = 13;
                while (true) {
                    i7 = i39 + 1;
                    charAt7 = a5.charAt(i39);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i40 |= (charAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i7;
                }
                charAt = (charAt7 << i41) | i40;
            } else {
                i7 = i39;
            }
            int i42 = i7 + 1;
            charAt2 = a5.charAt(i7);
            if (charAt2 >= 55296) {
                int i43 = charAt2 & 8191;
                int i44 = 13;
                while (true) {
                    i8 = i42 + 1;
                    charAt6 = a5.charAt(i42);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i43 |= (charAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i8;
                }
                charAt2 = (charAt6 << i44) | i43;
            } else {
                i8 = i42;
            }
            int i45 = i8 + 1;
            char charAt20 = a5.charAt(i8);
            if (charAt20 >= 55296) {
                int i46 = charAt20 & 8191;
                int i47 = 13;
                while (true) {
                    i15 = i45 + 1;
                    charAt5 = a5.charAt(i45);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i46 |= (charAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i15;
                }
                charAt20 = (charAt5 << i47) | i46;
                i45 = i15;
            }
            int i48 = i45 + 1;
            int charAt21 = a5.charAt(i45);
            if (charAt21 >= 55296) {
                int i49 = charAt21 & 8191;
                int i50 = 13;
                while (true) {
                    i14 = i48 + 1;
                    charAt4 = a5.charAt(i48);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i49 |= (charAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i14;
                }
                charAt21 = i49 | (charAt4 << i50);
                i48 = i14;
            }
            int i51 = i48 + 1;
            int charAt22 = a5.charAt(i48);
            if (charAt22 >= 55296) {
                int i52 = 13;
                int i53 = charAt22 & 8191;
                int i54 = i51;
                while (true) {
                    i13 = i54 + 1;
                    charAt3 = a5.charAt(i54);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i53 |= (charAt3 & 8191) << i52;
                    i52 += 13;
                    i54 = i13;
                }
                charAt22 = i53 | (charAt3 << i52);
                i51 = i13;
            }
            int i55 = i51;
            i9 = i4;
            i10 = charAt20;
            i11 = charAt22;
            iArr = new int[charAt22 + charAt20 + charAt21];
            i12 = (i4 << 1) + charAt18;
            c2 = charAt19;
            i2 = i55;
        }
        Unsafe unsafe = r;
        Object[] b2 = z6Var.b();
        Class<?> cls3 = z6Var.l().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr = new Object[charAt2 << 1];
        int i56 = i11 + i10;
        int i57 = i11;
        int i58 = i56;
        int i59 = 0;
        int i60 = 0;
        while (i2 < length) {
            int i61 = i2 + 1;
            int charAt23 = a5.charAt(i2);
            char c3 = 55296;
            if (charAt23 >= 55296) {
                int i62 = 13;
                int i63 = charAt23 & 8191;
                int i64 = i61;
                while (true) {
                    i25 = i64 + 1;
                    charAt14 = a5.charAt(i64);
                    if (charAt14 < c3) {
                        break;
                    }
                    i63 |= (charAt14 & 8191) << i62;
                    i62 += 13;
                    i64 = i25;
                    c3 = 55296;
                }
                charAt23 = i63 | (charAt14 << i62);
                i16 = i25;
            } else {
                i16 = i61;
            }
            int i65 = i16 + 1;
            int charAt24 = a5.charAt(i16);
            int i66 = length;
            char c4 = 55296;
            if (charAt24 >= 55296) {
                int i67 = 13;
                int i68 = charAt24 & 8191;
                int i69 = i65;
                while (true) {
                    i24 = i69 + 1;
                    charAt13 = a5.charAt(i69);
                    if (charAt13 < c4) {
                        break;
                    }
                    i68 |= (charAt13 & 8191) << i67;
                    i67 += 13;
                    i69 = i24;
                    c4 = 55296;
                }
                charAt24 = i68 | (charAt13 << i67);
                i17 = i24;
            } else {
                i17 = i65;
            }
            int i70 = i11;
            int i71 = charAt24 & 255;
            char c5 = charAt;
            if ((charAt24 & 1024) != 0) {
                iArr[i59] = i60;
                i59++;
            }
            int i72 = i59;
            if (i71 >= 51) {
                int i73 = i17 + 1;
                int charAt25 = a5.charAt(i17);
                char c6 = 55296;
                if (charAt25 >= 55296) {
                    int i74 = charAt25 & 8191;
                    int i75 = 13;
                    while (true) {
                        i23 = i73 + 1;
                        charAt12 = a5.charAt(i73);
                        if (charAt12 < c6) {
                            break;
                        }
                        i74 |= (charAt12 & 8191) << i75;
                        i75 += 13;
                        i73 = i23;
                        c6 = 55296;
                    }
                    charAt25 = i74 | (charAt12 << i75);
                    i73 = i23;
                }
                int i76 = i71 - 51;
                int i77 = i73;
                if (i76 == 9 || i76 == 17) {
                    i22 = 1;
                    objArr[((i60 / 3) << 1) + 1] = b2[i12];
                    i12++;
                } else {
                    if (i76 == 12 && !z) {
                        objArr[((i60 / 3) << 1) + 1] = b2[i12];
                        i12++;
                    }
                    i22 = 1;
                }
                int i78 = charAt25 << i22;
                Object obj = b2[i78];
                if (obj instanceof Field) {
                    a3 = (Field) obj;
                } else {
                    a3 = a(cls3, (String) obj);
                    b2[i78] = a3;
                }
                iArr2 = iArr3;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(a3);
                int i79 = i78 + 1;
                Object obj2 = b2[i79];
                if (obj2 instanceof Field) {
                    a4 = (Field) obj2;
                } else {
                    a4 = a(cls3, (String) obj2);
                    b2[i79] = a4;
                }
                i19 = (int) unsafe.objectFieldOffset(a4);
                cls2 = cls3;
                objectFieldOffset = objectFieldOffset2;
                i20 = i77;
                i21 = 0;
            } else {
                iArr2 = iArr3;
                int i80 = i12 + 1;
                Field a6 = a(cls3, (String) b2[i12]);
                if (i71 == 9 || i71 == 17) {
                    objArr[((i60 / 3) << 1) + 1] = a6.getType();
                } else {
                    if (i71 == 27 || i71 == 49) {
                        i18 = i80 + 1;
                        objArr[((i60 / 3) << 1) + 1] = b2[i80];
                    } else if (i71 == 12 || i71 == 30 || i71 == 44) {
                        if (!z) {
                            i18 = i80 + 1;
                            objArr[((i60 / 3) << 1) + 1] = b2[i80];
                        }
                    } else if (i71 == 50) {
                        int i81 = i57 + 1;
                        iArr[i57] = i60;
                        int i82 = (i60 / 3) << 1;
                        i18 = i80 + 1;
                        objArr[i82] = b2[i80];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i82 + 1] = b2[i18];
                            i18++;
                        }
                        i57 = i81;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(a6);
                    if ((charAt24 & 4096) == 4096 || i71 > 17) {
                        cls2 = cls3;
                        i19 = 1048575;
                        i20 = i17;
                        i21 = 0;
                    } else {
                        int i83 = i17 + 1;
                        int charAt26 = a5.charAt(i17);
                        if (charAt26 >= 55296) {
                            int i84 = charAt26 & 8191;
                            int i85 = 13;
                            while (true) {
                                i20 = i83 + 1;
                                charAt11 = a5.charAt(i83);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i84 |= (charAt11 & 8191) << i85;
                                i85 += 13;
                                i83 = i20;
                            }
                            charAt26 = i84 | (charAt11 << i85);
                        } else {
                            i20 = i83;
                        }
                        int i86 = (i9 << 1) + (charAt26 / 32);
                        Object obj3 = b2[i86];
                        if (obj3 instanceof Field) {
                            a2 = (Field) obj3;
                        } else {
                            a2 = a(cls3, (String) obj3);
                            b2[i86] = a2;
                        }
                        cls2 = cls3;
                        i19 = (int) unsafe.objectFieldOffset(a2);
                        i21 = charAt26 % 32;
                    }
                    if (i71 >= 18 && i71 <= 49) {
                        iArr[i58] = objectFieldOffset;
                        i58++;
                    }
                    i12 = i18;
                }
                i18 = i80;
                objectFieldOffset = (int) unsafe.objectFieldOffset(a6);
                if ((charAt24 & 4096) == 4096) {
                }
                cls2 = cls3;
                i19 = 1048575;
                i20 = i17;
                i21 = 0;
                if (i71 >= 18) {
                    iArr[i58] = objectFieldOffset;
                    i58++;
                }
                i12 = i18;
            }
            int i87 = i60 + 1;
            iArr2[i60] = charAt23;
            int i88 = i87 + 1;
            String str = a5;
            iArr2[i87] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i71 << 20) | objectFieldOffset;
            int i89 = i88 + 1;
            iArr2[i88] = (i21 << 20) | i19;
            iArr3 = iArr2;
            cls3 = cls2;
            i11 = i70;
            length = i66;
            charAt = c5;
            i2 = i20;
            i59 = i72;
            i60 = i89;
            a5 = str;
        }
        return new p6<>(iArr3, objArr, c2, charAt, z6Var.l(), z, false, iArr, i11, i56, s6Var, u5Var, u7Var, r4Var, h6Var);
    }

    private final <K, V, UT, UB> UB a(int i, int i2, Map<K, V> map, f5 f5Var, UB ub, u7<UT, UB> u7Var) {
        this.p.d(b(i));
        throw null;
    }

    private final <UT, UB> UB a(Object obj, int i, UB ub, u7<UT, UB> u7Var) {
        f5 c2;
        int i2 = this.f4345a[i];
        Object f2 = a8.f(obj, d(i) & 1048575);
        if (f2 == null || (c2 = c(i)) == null) {
            return ub;
        }
        a(i, i2, this.p.a(f2), c2, (f5) ub, (u7<UT, f5>) u7Var);
        throw null;
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static List<?> a(Object obj, long j) {
        return (List) a8.f(obj, j);
    }

    private static void a(int i, Object obj, o8 o8Var) {
        if (obj instanceof String) {
            o8Var.a(i, (String) obj);
        } else {
            o8Var.a(i, (v3) obj);
        }
    }

    private final <K, V> void a(o8 o8Var, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        this.p.d(b(i2));
        throw null;
    }

    private static <UT, UB> void a(u7<UT, UB> u7Var, T t, o8 o8Var) {
        u7Var.a((u7<UT, UB>) u7Var.a(t), o8Var);
    }

    private final void a(T t, T t2, int i) {
        long d2 = d(i) & 1048575;
        if (!a((p6<T>) t2, i)) {
            return;
        }
        Object f2 = a8.f(t, d2);
        Object f3 = a8.f(t2, d2);
        if (f2 != null && f3 != null) {
            a8.a(t, d2, e5.a(f2, f3));
            b((p6<T>) t, i);
        } else if (f3 == null) {
        } else {
            a8.a(t, d2, f3);
            b((p6<T>) t, i);
        }
    }

    private final boolean a(T t, int i) {
        int e2 = e(i);
        long j = e2 & 1048575;
        if (j != 1048575) {
            return (a8.a(t, j) & (1 << (e2 >>> 20))) != 0;
        }
        int d2 = d(i);
        long j2 = d2 & 1048575;
        switch ((d2 & 267386880) >>> 20) {
            case 0:
                return a8.e(t, j2) != 0.0d;
            case 1:
                return a8.d(t, j2) != 0.0f;
            case 2:
                return a8.b(t, j2) != 0;
            case 3:
                return a8.b(t, j2) != 0;
            case 4:
                return a8.a(t, j2) != 0;
            case 5:
                return a8.b(t, j2) != 0;
            case 6:
                return a8.a(t, j2) != 0;
            case 7:
                return a8.c(t, j2);
            case 8:
                Object f2 = a8.f(t, j2);
                if (f2 instanceof String) {
                    return !((String) f2).isEmpty();
                } else if (!(f2 instanceof v3)) {
                    throw new IllegalArgumentException();
                } else {
                    return !v3.f4474c.equals(f2);
                }
            case 9:
                return a8.f(t, j2) != null;
            case 10:
                return !v3.f4474c.equals(a8.f(t, j2));
            case 11:
                return a8.a(t, j2) != 0;
            case 12:
                return a8.a(t, j2) != 0;
            case 13:
                return a8.a(t, j2) != 0;
            case 14:
                return a8.b(t, j2) != 0;
            case 15:
                return a8.a(t, j2) != 0;
            case 16:
                return a8.b(t, j2) != 0;
            case 17:
                return a8.f(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean a(T t, int i, int i2) {
        return a8.a(t, (long) (e(i2) & 1048575)) == i;
    }

    private final boolean a(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? a((p6<T>) t, i) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(Object obj, int i, b7 b7Var) {
        return b7Var.b(a8.f(obj, i & 1048575));
    }

    private static <T> double b(T t, long j) {
        return ((Double) a8.f(t, j)).doubleValue();
    }

    private final int b(int i, int i2) {
        int length = (this.f4345a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f4345a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final Object b(int i) {
        return this.f4346b[(i / 3) << 1];
    }

    private final void b(T t, int i) {
        int e2 = e(i);
        long j = 1048575 & e2;
        if (j == 1048575) {
            return;
        }
        a8.a((Object) t, j, (1 << (e2 >>> 20)) | a8.a(t, j));
    }

    private final void b(T t, int i, int i2) {
        a8.a((Object) t, e(i2) & 1048575, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0476  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(T r17, c.e.a.b.d.g.o8 r18) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.p6.b(java.lang.Object, c.e.a.b.d.g.o8):void");
    }

    private final void b(T t, T t2, int i) {
        int d2 = d(i);
        int i2 = this.f4345a[i];
        long j = d2 & 1048575;
        if (!a((p6<T>) t2, i2, i)) {
            return;
        }
        Object f2 = a8.f(t, j);
        Object f3 = a8.f(t2, j);
        if (f2 != null && f3 != null) {
            a8.a(t, j, e5.a(f2, f3));
            b((p6<T>) t, i2, i);
        } else if (f3 == null) {
        } else {
            a8.a(t, j, f3);
            b((p6<T>) t, i2, i);
        }
    }

    private static <T> float c(T t, long j) {
        return ((Float) a8.f(t, j)).floatValue();
    }

    private final f5 c(int i) {
        return (f5) this.f4346b[((i / 3) << 1) + 1];
    }

    private final boolean c(T t, T t2, int i) {
        return a((p6<T>) t, i) == a((p6<T>) t2, i);
    }

    private final int d(int i) {
        return this.f4345a[i + 1];
    }

    private static <T> int d(T t, long j) {
        return ((Integer) a8.f(t, j)).intValue();
    }

    private final int e(int i) {
        return this.f4345a[i + 2];
    }

    private static <T> long e(T t, long j) {
        return ((Long) a8.f(t, j)).longValue();
    }

    private static t7 e(Object obj) {
        b5 b5Var = (b5) obj;
        t7 t7Var = b5Var.zzb;
        if (t7Var == t7.d()) {
            t7 e2 = t7.e();
            b5Var.zzb = e2;
            return e2;
        }
        return t7Var;
    }

    private final int f(int i) {
        if (i < this.f4347c || i > this.f4348d) {
            return -1;
        }
        return b(i, 0);
    }

    private static <T> boolean f(T t, long j) {
        return ((Boolean) a8.f(t, j)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e0, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // c.e.a.b.d.g.b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(T r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.p6.a(java.lang.Object):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04bd, code lost:
        if (r0 == r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04bf, code lost:
        r27.putInt(r11, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04c5, code lost:
        r0 = r8.j;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04cb, code lost:
        if (r0 >= r8.k) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04cd, code lost:
        r8.a((java.lang.Object) r11, r8.i[r0], (int) r1, (c.e.a.b.d.g.u7<UT, int>) r8.n);
        r1 = r1;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04db, code lost:
        if (r1 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04dd, code lost:
        r8.n.b((java.lang.Object) r11, (T) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04e4, code lost:
        if (r6 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04e6, code lost:
        if (r2 != r32) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04ed, code lost:
        throw c.e.a.b.d.g.j5.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04ee, code lost:
        if (r2 > r32) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04f0, code lost:
        if (r3 != r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04f2, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04f7, code lost:
        throw c.e.a.b.d.g.j5.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(T r29, byte[] r30, int r31, int r32, int r33, c.e.a.b.d.g.q3 r34) {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.p6.a(java.lang.Object, byte[], int, int, int, c.e.a.b.d.g.q3):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0464 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x08c3  */
    @Override // c.e.a.b.d.g.b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(T r13, c.e.a.b.d.g.o8 r14) {
        /*
            Method dump skipped, instructions count: 2538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.p6.a(java.lang.Object, c.e.a.b.d.g.o8):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ec, code lost:
        if (r0 == r5) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02f0, code lost:
        r8 = 1048575;
        r10 = -1;
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r2 = r20;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0358, code lost:
        if (r0 == r15) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x035a, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    @Override // c.e.a.b.d.g.b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(T r32, byte[] r33, int r34, int r35, c.e.a.b.d.g.q3 r36) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.p6.a(java.lang.Object, byte[], int, int, c.e.a.b.d.g.q3):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b0, code lost:
        if (java.lang.Double.doubleToLongBits(c.e.a.b.d.g.a8.e(r10, r6)) == java.lang.Double.doubleToLongBits(c.e.a.b.d.g.a8.e(r11, r6))) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (c.e.a.b.d.g.d7.a(c.e.a.b.d.g.a8.f(r10, r6), c.e.a.b.d.g.a8.f(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (c.e.a.b.d.g.d7.a(c.e.a.b.d.g.a8.f(r10, r6), c.e.a.b.d.g.a8.f(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (c.e.a.b.d.g.a8.b(r10, r6) == c.e.a.b.d.g.a8.b(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (c.e.a.b.d.g.a8.a(r10, r6) == c.e.a.b.d.g.a8.a(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (c.e.a.b.d.g.a8.b(r10, r6) == c.e.a.b.d.g.a8.b(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
        if (c.e.a.b.d.g.a8.a(r10, r6) == c.e.a.b.d.g.a8.a(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
        if (c.e.a.b.d.g.a8.a(r10, r6) == c.e.a.b.d.g.a8.a(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (c.e.a.b.d.g.a8.a(r10, r6) == c.e.a.b.d.g.a8.a(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (c.e.a.b.d.g.d7.a(c.e.a.b.d.g.a8.f(r10, r6), c.e.a.b.d.g.a8.f(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
        if (c.e.a.b.d.g.d7.a(c.e.a.b.d.g.a8.f(r10, r6), c.e.a.b.d.g.a8.f(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
        if (c.e.a.b.d.g.d7.a(c.e.a.b.d.g.a8.f(r10, r6), c.e.a.b.d.g.a8.f(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
        if (c.e.a.b.d.g.a8.c(r10, r6) == c.e.a.b.d.g.a8.c(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
        if (c.e.a.b.d.g.a8.a(r10, r6) == c.e.a.b.d.g.a8.a(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0145, code lost:
        if (c.e.a.b.d.g.a8.b(r10, r6) == c.e.a.b.d.g.a8.b(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0156, code lost:
        if (c.e.a.b.d.g.a8.a(r10, r6) == c.e.a.b.d.g.a8.a(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0169, code lost:
        if (c.e.a.b.d.g.a8.b(r10, r6) == c.e.a.b.d.g.a8.b(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017c, code lost:
        if (c.e.a.b.d.g.a8.b(r10, r6) == c.e.a.b.d.g.a8.b(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0195, code lost:
        if (java.lang.Float.floatToIntBits(c.e.a.b.d.g.a8.d(r10, r6)) == java.lang.Float.floatToIntBits(c.e.a.b.d.g.a8.d(r11, r6))) goto L84;
     */
    @Override // c.e.a.b.d.g.b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.p6.a(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // c.e.a.b.d.g.b7
    public final void b(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f4345a.length; i += 3) {
                int d2 = d(i);
                long j = 1048575 & d2;
                int i2 = this.f4345a[i];
                switch ((d2 & 267386880) >>> 20) {
                    case 0:
                        if (a((p6<T>) t2, i)) {
                            a8.a(t, j, a8.e(t2, j));
                            b((p6<T>) t, i);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (a((p6<T>) t2, i)) {
                            a8.a((Object) t, j, a8.d(t2, j));
                            b((p6<T>) t, i);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a((Object) t, j, a8.b(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 3:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a((Object) t, j, a8.b(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 4:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a((Object) t, j, a8.a(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 5:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a((Object) t, j, a8.b(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 6:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a((Object) t, j, a8.a(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 7:
                        if (a((p6<T>) t2, i)) {
                            a8.a(t, j, a8.c(t2, j));
                            b((p6<T>) t, i);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a(t, j, a8.f(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 9:
                    case 17:
                        a(t, t2, i);
                        break;
                    case 10:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a(t, j, a8.f(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 11:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a((Object) t, j, a8.a(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 12:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a((Object) t, j, a8.a(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 13:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a((Object) t, j, a8.a(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 14:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a((Object) t, j, a8.b(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 15:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a((Object) t, j, a8.a(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 16:
                        if (!a((p6<T>) t2, i)) {
                            break;
                        }
                        a8.a((Object) t, j, a8.b(t2, j));
                        b((p6<T>) t, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.m.a(t, t2, j);
                        break;
                    case 50:
                        d7.a(this.p, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a((p6<T>) t2, i2, i)) {
                            break;
                        }
                        a8.a(t, j, a8.f(t2, j));
                        b((p6<T>) t, i2, i);
                        break;
                    case 60:
                    case 68:
                        b(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a((p6<T>) t2, i2, i)) {
                            break;
                        }
                        a8.a(t, j, a8.f(t2, j));
                        b((p6<T>) t, i2, i);
                        break;
                }
            }
            d7.a(this.n, t, t2);
            if (!this.f4350f) {
                return;
            }
            d7.a(this.o, t, t2);
            return;
        }
        throw new NullPointerException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.e.a.b.d.g.b7
    public final boolean b(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i5 >= this.j) {
                return !this.f4350f || this.o.a(t).e();
            }
            int i6 = this.i[i5];
            int i7 = this.f4345a[i6];
            int d2 = d(i6);
            int i8 = this.f4345a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                i2 = i9 != 1048575 ? r.getInt(t, i9) : i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if (((268435456 & d2) != 0) && !a((p6<T>) t, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & d2) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (a((p6<T>) t, i7, i6) && !a(t, d2, a(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 == 50 && !this.p.c(a8.f(t, d2 & 1048575)).isEmpty()) {
                            this.p.d(b(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) a8.f(t, d2 & 1048575);
                if (!list.isEmpty()) {
                    b7 a2 = a(i6);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        } else if (!a2.b(list.get(i12))) {
                            z = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (a((p6<T>) t, i6, i, i2, i10) && !a(t, d2, a(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
    }

    @Override // c.e.a.b.d.g.b7
    public final void c(T t) {
        int i;
        int i2 = this.j;
        while (true) {
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long d2 = d(this.i[i2]) & 1048575;
            Object f2 = a8.f(t, d2);
            if (f2 != null) {
                this.p.f(f2);
                a8.a(t, d2, f2);
            }
            i2++;
        }
        int length = this.i.length;
        while (i < length) {
            this.m.a(t, this.i[i]);
            i++;
        }
        this.n.b(t);
        if (this.f4350f) {
            this.o.c(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0181, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0193, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a5, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b6, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c7, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d8, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e9, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fa, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020b, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x020d, code lost:
        r2.putInt(r20, r14, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0211, code lost:
        r3 = (c.e.a.b.d.g.j4.e(r3) + c.e.a.b.d.g.j4.g(r5)) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0331, code lost:
        if ((r5 instanceof c.e.a.b.d.g.v3) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0334, code lost:
        r3 = c.e.a.b.d.g.j4.b(r3, (java.lang.String) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0418, code lost:
        if (a((c.e.a.b.d.g.p6<T>) r20, r15, r3) != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0438, code lost:
        if (a((c.e.a.b.d.g.p6<T>) r20, r15, r3) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0440, code lost:
        if (a((c.e.a.b.d.g.p6<T>) r20, r15, r3) != false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0460, code lost:
        if (a((c.e.a.b.d.g.p6<T>) r20, r15, r3) != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0468, code lost:
        if (a((c.e.a.b.d.g.p6<T>) r20, r15, r3) != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0478, code lost:
        if ((r4 instanceof c.e.a.b.d.g.v3) != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0480, code lost:
        if (a((c.e.a.b.d.g.p6<T>) r20, r15, r3) != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0488, code lost:
        if (a((c.e.a.b.d.g.p6<T>) r20, r15, r3) != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0513, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0525, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0537, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0549, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x055b, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x056d, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x057f, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0591, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x05a2, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x05b3, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x05c4, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x05d5, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x05e6, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x05f7, code lost:
        if (r19.f4352h != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x05f9, code lost:
        r2.putInt(r20, r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x05fd, code lost:
        r9 = (c.e.a.b.d.g.j4.e(r15) + c.e.a.b.d.g.j4.g(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x06b2, code lost:
        if ((r12 & r18) != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x06b4, code lost:
        r4 = c.e.a.b.d.g.j4.c(r15, (c.e.a.b.d.g.k6) r2.getObject(r20, r9), a(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x06df, code lost:
        if ((r12 & r18) != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x06e1, code lost:
        r4 = c.e.a.b.d.g.j4.h(r15, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x06ea, code lost:
        if ((r12 & r18) != 0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x06ec, code lost:
        r9 = c.e.a.b.d.g.j4.j(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x070e, code lost:
        if ((r12 & r18) != 0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0710, code lost:
        r4 = r2.getObject(r20, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0714, code lost:
        r4 = c.e.a.b.d.g.j4.c(r15, (c.e.a.b.d.g.v3) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x071d, code lost:
        if ((r12 & r18) != 0) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x071f, code lost:
        r4 = c.e.a.b.d.g.d7.a(r15, r2.getObject(r20, r9), a(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0737, code lost:
        if ((r4 instanceof c.e.a.b.d.g.v3) != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x073a, code lost:
        r4 = c.e.a.b.d.g.j4.b(r15, (java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0744, code lost:
        if ((r12 & r18) != 0) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0746, code lost:
        r4 = c.e.a.b.d.g.j4.b(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x074e, code lost:
        if ((r12 & r18) != 0) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0750, code lost:
        r9 = c.e.a.b.d.g.j4.i(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        if ((r5 instanceof c.e.a.b.d.g.v3) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0127, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014b, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015d, code lost:
        if (r19.f4352h != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016f, code lost:
        if (r19.f4352h != false) goto L104;
     */
    @Override // c.e.a.b.d.g.b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(T r20) {
        /*
            Method dump skipped, instructions count: 2342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.p6.d(java.lang.Object):int");
    }

    @Override // c.e.a.b.d.g.b7
    public final T f() {
        return (T) this.l.a(this.f4349e);
    }
}
