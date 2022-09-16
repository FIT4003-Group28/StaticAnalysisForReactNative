package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.PrivateKeyType;
import sun.misc.Unsafe;
/* compiled from: PG */
/* renamed from: aoqw  reason: default package */
/* loaded from: classes.dex */
public final class aoqw implements aorm {
    private static final int[] a = new int[0];
    private static final Unsafe b = aosg.k();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final aoqu g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final aoqi o;
    private final apfu p;

    private aoqw(int[] iArr, Object[] objArr, int i, int i2, aoqu aoquVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, aoqi aoqiVar, apfu apfuVar, aoyt aoytVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = aoquVar instanceof aopi;
        this.j = z;
        boolean z3 = false;
        if (aoytVar != null && (aoquVar instanceof aopd)) {
            z3 = true;
        }
        this.h = z3;
        this.k = z2;
        this.l = iArr2;
        this.m = i3;
        this.n = i4;
        this.o = aoqiVar;
        this.p = apfuVar;
        this.g = aoquVar;
    }

    private final int A(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int s = s(i4);
            if (i == s) {
                return i4;
            }
            if (i < s) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int B(int i) {
        return (i >>> 20) & PrivateKeyType.INVALID;
    }

    private final int C(int i) {
        return this.c[i + 1];
    }

    private static long D(int i) {
        return i & 1048575;
    }

    private static long E(Object obj, long j) {
        return ((Long) aosg.i(obj, j)).longValue();
    }

    private final aopo F(int i) {
        int i2 = i / 3;
        return (aopo) this.d[i2 + i2 + 1];
    }

    private final aorm G(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        aorm aormVar = (aorm) this.d[i3];
        if (aormVar != null) {
            return aormVar;
        }
        aorm a2 = aore.a.a((Class) this.d[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    private final Object H(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private static Field I(Class cls, String str) {
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

    private static List J(Object obj, long j) {
        return (List) aosg.i(obj, j);
    }

    private final void K(Object obj, Object obj2, int i) {
        long D = D(C(i));
        if (!R(obj2, i)) {
            return;
        }
        Object i2 = aosg.i(obj, D);
        Object i3 = aosg.i(obj2, D);
        if (i2 != null && i3 != null) {
            aosg.v(obj, D, aopv.e(i2, i3));
            N(obj, i);
        } else if (i3 == null) {
        } else {
            aosg.v(obj, D, i3);
            N(obj, i);
        }
    }

    private final void L(Object obj, Object obj2, int i) {
        int C = C(i);
        int s = s(i);
        long D = D(C);
        if (!U(obj2, s, i)) {
            return;
        }
        Object i2 = U(obj, s, i) ? aosg.i(obj, D) : null;
        Object i3 = aosg.i(obj2, D);
        if (i2 != null && i3 != null) {
            aosg.v(obj, D, aopv.e(i2, i3));
            O(obj, s, i);
        } else if (i3 == null) {
        } else {
            aosg.v(obj, D, i3);
            O(obj, s, i);
        }
    }

    private final void M(Object obj, int i, aorh aorhVar) {
        if (Q(i)) {
            aosg.v(obj, D(i), aorhVar.x());
        } else if (this.i) {
            aosg.v(obj, D(i), aorhVar.v());
        } else {
            aosg.v(obj, D(i), aorhVar.q());
        }
    }

    private final void N(Object obj, int i) {
        int z = z(i);
        long j = 1048575 & z;
        if (j == 1048575) {
            return;
        }
        aosg.t(obj, j, (1 << (z >>> 20)) | aosg.d(obj, j));
    }

    private final void O(Object obj, int i, int i2) {
        aosg.t(obj, z(i2) & 1048575, i);
    }

    private final boolean P(Object obj, Object obj2, int i) {
        return R(obj, i) == R(obj2, i);
    }

    private static boolean Q(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean R(Object obj, int i) {
        int z = z(i);
        long j = 1048575 & z;
        if (j != 1048575) {
            return (aosg.d(obj, j) & (1 << (z >>> 20))) != 0;
        }
        int C = C(i);
        long D = D(C);
        switch (B(C)) {
            case 0:
                return aosg.b(obj, D) != 0.0d;
            case 1:
                return aosg.c(obj, D) != 0.0f;
            case 2:
                return aosg.f(obj, D) != 0;
            case 3:
                return aosg.f(obj, D) != 0;
            case 4:
                return aosg.d(obj, D) != 0;
            case 5:
                return aosg.f(obj, D) != 0;
            case 6:
                return aosg.d(obj, D) != 0;
            case 7:
                return aosg.x(obj, D);
            case 8:
                Object i2 = aosg.i(obj, D);
                if (i2 instanceof String) {
                    return !((String) i2).isEmpty();
                } else if (!(i2 instanceof aoob)) {
                    throw new IllegalArgumentException();
                } else {
                    return !aoob.b.equals(i2);
                }
            case 9:
                return aosg.i(obj, D) != null;
            case 10:
                return !aoob.b.equals(aosg.i(obj, D));
            case 11:
                return aosg.d(obj, D) != 0;
            case 12:
                return aosg.d(obj, D) != 0;
            case 13:
                return aosg.d(obj, D) != 0;
            case 14:
                return aosg.f(obj, D) != 0;
            case 15:
                return aosg.d(obj, D) != 0;
            case 16:
                return aosg.f(obj, D) != 0;
            case 17:
                return aosg.i(obj, D) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean S(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return R(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean T(Object obj, int i, aorm aormVar) {
        return aormVar.k(aosg.i(obj, D(i)));
    }

    private final boolean U(Object obj, int i, int i2) {
        return aosg.d(obj, (long) (z(i2) & 1048575)) == i;
    }

    private static boolean V(Object obj, long j) {
        return ((Boolean) aosg.i(obj, j)).booleanValue();
    }

    private static final int W(byte[] bArr, int i, int i2, aosj aosjVar, Class cls, aonp aonpVar) {
        aosj aosjVar2 = aosj.DOUBLE;
        switch (aosjVar.ordinal()) {
            case 0:
                aonpVar.c = Double.valueOf(aoyt.l(bArr, i));
                return i + 8;
            case 1:
                aonpVar.c = Float.valueOf(aoyt.m(bArr, i));
                return i + 4;
            case 2:
            case 3:
                int H = aoyt.H(bArr, i, aonpVar);
                aonpVar.c = Long.valueOf(aonpVar.b);
                return H;
            case 4:
            case 12:
            case 13:
                int E = aoyt.E(bArr, i, aonpVar);
                aonpVar.c = Integer.valueOf(aonpVar.a);
                return E;
            case 5:
            case 15:
                aonpVar.c = Long.valueOf(aoyt.J(bArr, i));
                return i + 8;
            case 6:
            case 14:
                aonpVar.c = Integer.valueOf(aoyt.o(bArr, i));
                return i + 4;
            case 7:
                int H2 = aoyt.H(bArr, i, aonpVar);
                aonpVar.c = Boolean.valueOf(aonpVar.b != 0);
                return H2;
            case 8:
                return aoyt.C(bArr, i, aonpVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return aoyt.q(aore.a.a(cls), bArr, i, i2, aonpVar);
            case 11:
                return aoyt.n(bArr, i, aonpVar);
            case 16:
                int E2 = aoyt.E(bArr, i, aonpVar);
                aonpVar.c = Integer.valueOf(aoog.J(aonpVar.a));
                return E2;
            case 17:
                int H3 = aoyt.H(bArr, i, aonpVar);
                aonpVar.c = Long.valueOf(aoog.L(aonpVar.b));
                return H3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0298, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x029a, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r1 = r19;
        r2 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02ae, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02e1, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0304, code lost:
        if (r0 != r15) goto L152;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void X(java.lang.Object r31, byte[] r32, int r33, int r34, defpackage.aonp r35) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoqw.X(java.lang.Object, byte[], int, int, aonp):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x048b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Y(java.lang.Object r18, defpackage.aoom r19) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoqw.Y(java.lang.Object, aoom):void");
    }

    private final void Z(aoom aoomVar, int i, Object obj, int i2) {
        if (obj != null) {
            aoqn h = apdw.h(H(i2));
            aool aoolVar = aoomVar.a;
            Iterator it = ((aoqp) obj).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                aoomVar.a.B(i, 2);
                aoomVar.a.D(aoqo.a(h, entry.getKey(), entry.getValue()));
                aoqo.c(aoomVar.a, h, entry.getKey(), entry.getValue());
            }
        }
    }

    private static final void aa(int i, Object obj, aoom aoomVar) {
        if (obj instanceof String) {
            aoomVar.q(i, (String) obj);
        } else {
            aoomVar.b(i, (aoob) obj);
        }
    }

    private final Object ab(Object obj, int i, Object obj2) {
        aopo F;
        int s = s(i);
        Object i2 = aosg.i(obj, D(C(i)));
        if (i2 == null || (F = F(i)) == null) {
            return obj2;
        }
        aoqn h = apdw.h(H(i));
        Iterator it = ((aoqp) i2).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!F.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = aory.c();
                }
                int a2 = aoqo.a(h, entry.getKey(), entry.getValue());
                aoob aoobVar = aoob.b;
                byte[] bArr = new byte[a2];
                aool ak = aool.ak(bArr);
                try {
                    aoqo.c(ak, h, entry.getKey(), entry.getValue());
                    apfu.o(obj2, s, aoyt.k(ak, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static final int ac(Object obj) {
        return apfu.q(obj).a();
    }

    private static final void ad(Object obj, aoom aoomVar) {
        apfu.q(obj).h(aoomVar);
    }

    static aory d(Object obj) {
        aopi aopiVar = (aopi) obj;
        aory aoryVar = aopiVar.unknownFields;
        if (aoryVar == aory.a) {
            aory c = aory.c();
            aopiVar.unknownFields = c;
            return c;
        }
        return aoryVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aoqw m(defpackage.aoqr r27, defpackage.apfb r28, defpackage.aoqi r29, defpackage.apfu r30, defpackage.aoyt r31, defpackage.apdw r32) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoqw.m(aoqr, apfb, aoqi, apfu, aoyt, apdw):aoqw");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static defpackage.aoqw n(defpackage.aorg r35, defpackage.aoqi r36, defpackage.apfu r37, defpackage.aoyt r38, defpackage.apdw r39) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoqw.n(aorg, aoqi, apfu, aoyt, apdw):aoqw");
    }

    private static double o(Object obj, long j) {
        return ((Double) aosg.i(obj, j)).doubleValue();
    }

    private static float p(Object obj, long j) {
        return ((Float) aosg.i(obj, j)).floatValue();
    }

    private final int q(Object obj) {
        int i;
        int i2;
        int az;
        int e;
        int ac;
        int ae;
        Unsafe unsafe = b;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i4 < this.c.length) {
            int C = C(i4);
            int s = s(i4);
            int B = B(C);
            if (B <= 17) {
                i = this.c[i4 + 2];
                int i8 = i & i3;
                i2 = 1 << (i >>> 20);
                if (i8 != i6) {
                    i7 = unsafe.getInt(obj, i8);
                    i6 = i8;
                }
            } else {
                i = (!this.k || B < aoox.DOUBLE_LIST_PACKED.Z || B > aoox.SINT64_LIST_PACKED.Z) ? 0 : this.c[i4 + 2] & i3;
                i2 = 0;
            }
            long D = D(C);
            switch (B) {
                case 0:
                    if ((i7 & i2) != 0) {
                        az = aool.az(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i7 & i2) != 0) {
                        az = aool.aC(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i7 & i2) != 0) {
                        az = aool.P(s, unsafe.getLong(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i7 & i2) != 0) {
                        az = aool.af(s, unsafe.getLong(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i7 & i2) != 0) {
                        az = aool.N(s, unsafe.getInt(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i7 & i2) != 0) {
                        az = aool.aB(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i7 & i2) != 0) {
                        az = aool.aA(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i7 & i2) != 0) {
                        az = aool.ay(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(obj, D);
                        if (object instanceof aoob) {
                            az = aool.I(s, (aoob) object);
                        } else {
                            az = aool.aa(s, (String) object);
                        }
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i7 & i2) != 0) {
                        az = aorn.i(s, unsafe.getObject(obj, D), G(i4));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i7 & i2) != 0) {
                        az = aool.I(s, (aoob) unsafe.getObject(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i7 & i2) != 0) {
                        az = aool.ad(s, unsafe.getInt(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i7 & i2) != 0) {
                        az = aool.K(s, unsafe.getInt(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i7 & i2) != 0) {
                        az = aool.aD(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i7 & i2) != 0) {
                        az = aool.aE(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i7 & i2) != 0) {
                        az = aool.W(s, unsafe.getInt(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i7 & i2) != 0) {
                        az = aool.Y(s, unsafe.getLong(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i7 & i2) != 0) {
                        az = aool.L(s, (aoqu) unsafe.getObject(obj, D), G(i4));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    az = aorn.u(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 19:
                    az = aorn.t(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 20:
                    az = aorn.w(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 21:
                    az = aorn.A(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 22:
                    az = aorn.v(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 23:
                    az = aorn.u(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 24:
                    az = aorn.t(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 25:
                    az = aorn.r(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 26:
                    az = aorn.m(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 27:
                    az = aorn.j(s, (List) unsafe.getObject(obj, D), G(i4));
                    i5 += az;
                    break;
                case 28:
                    az = aorn.b(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 29:
                    az = aorn.z(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 30:
                    az = aorn.s(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 31:
                    az = aorn.t(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 32:
                    az = aorn.u(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 33:
                    az = aorn.x(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 34:
                    az = aorn.y(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 35:
                    e = aorn.e((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 36:
                    e = aorn.d((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 37:
                    e = aorn.h((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 38:
                    e = aorn.o((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 39:
                    e = aorn.g((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 40:
                    e = aorn.e((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 41:
                    e = aorn.d((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 42:
                    e = aorn.a((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 43:
                    e = aorn.n((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 44:
                    e = aorn.c((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 45:
                    e = aorn.d((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 46:
                    e = aorn.e((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 47:
                    e = aorn.k((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 48:
                    e = aorn.l((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 49:
                    az = aorn.f(s, (List) unsafe.getObject(obj, D), G(i4));
                    i5 += az;
                    break;
                case 50:
                    az = apdw.i(s, unsafe.getObject(obj, D), H(i4));
                    i5 += az;
                    break;
                case 51:
                    if (U(obj, s, i4)) {
                        az = aool.az(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (U(obj, s, i4)) {
                        az = aool.aC(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (U(obj, s, i4)) {
                        az = aool.P(s, E(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (U(obj, s, i4)) {
                        az = aool.af(s, E(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (U(obj, s, i4)) {
                        az = aool.N(s, t(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (U(obj, s, i4)) {
                        az = aool.aB(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (U(obj, s, i4)) {
                        az = aool.aA(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (U(obj, s, i4)) {
                        az = aool.ay(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (U(obj, s, i4)) {
                        Object object2 = unsafe.getObject(obj, D);
                        if (object2 instanceof aoob) {
                            az = aool.I(s, (aoob) object2);
                        } else {
                            az = aool.aa(s, (String) object2);
                        }
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (U(obj, s, i4)) {
                        az = aorn.i(s, unsafe.getObject(obj, D), G(i4));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (U(obj, s, i4)) {
                        az = aool.I(s, (aoob) unsafe.getObject(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (U(obj, s, i4)) {
                        az = aool.ad(s, t(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (U(obj, s, i4)) {
                        az = aool.K(s, t(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (U(obj, s, i4)) {
                        az = aool.aD(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (U(obj, s, i4)) {
                        az = aool.aE(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (U(obj, s, i4)) {
                        az = aool.W(s, t(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (U(obj, s, i4)) {
                        az = aool.Y(s, E(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (U(obj, s, i4)) {
                        az = aool.L(s, (aoqu) unsafe.getObject(obj, D), G(i4));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            i3 = 1048575;
        }
        int ac2 = i5 + ac(obj);
        if (this.h) {
            aoov f = aoyt.f(obj);
            int i9 = 0;
            for (int i10 = 0; i10 < f.b.a(); i10++) {
                Map.Entry f2 = f.b.f(i10);
                i9 += aoov.k((aopf) f2.getKey(), f2.getValue());
            }
            for (Map.Entry entry : f.b.c()) {
                i9 += aoov.k((aopf) entry.getKey(), entry.getValue());
            }
            return ac2 + i9;
        }
        return ac2;
    }

    private final int r(Object obj) {
        int az;
        int e;
        int ac;
        int ae;
        Unsafe unsafe = b;
        int i = 0;
        for (int i2 = 0; i2 < this.c.length; i2 += 3) {
            int C = C(i2);
            int B = B(C);
            int s = s(i2);
            long D = D(C);
            int i3 = (B < aoox.DOUBLE_LIST_PACKED.Z || B > aoox.SINT64_LIST_PACKED.Z) ? 0 : this.c[i2 + 2] & 1048575;
            switch (B) {
                case 0:
                    if (R(obj, i2)) {
                        az = aool.az(s);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (R(obj, i2)) {
                        az = aool.aC(s);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (R(obj, i2)) {
                        az = aool.P(s, aosg.f(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (R(obj, i2)) {
                        az = aool.af(s, aosg.f(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (R(obj, i2)) {
                        az = aool.N(s, aosg.d(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (R(obj, i2)) {
                        az = aool.aB(s);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (R(obj, i2)) {
                        az = aool.aA(s);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (R(obj, i2)) {
                        az = aool.ay(s);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (R(obj, i2)) {
                        Object i4 = aosg.i(obj, D);
                        if (i4 instanceof aoob) {
                            az = aool.I(s, (aoob) i4);
                            break;
                        } else {
                            az = aool.aa(s, (String) i4);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (R(obj, i2)) {
                        az = aorn.i(s, aosg.i(obj, D), G(i2));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (R(obj, i2)) {
                        az = aool.I(s, (aoob) aosg.i(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (R(obj, i2)) {
                        az = aool.ad(s, aosg.d(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (R(obj, i2)) {
                        az = aool.K(s, aosg.d(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (R(obj, i2)) {
                        az = aool.aD(s);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (R(obj, i2)) {
                        az = aool.aE(s);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (R(obj, i2)) {
                        az = aool.W(s, aosg.d(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (R(obj, i2)) {
                        az = aool.Y(s, aosg.f(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (R(obj, i2)) {
                        az = aool.L(s, (aoqu) aosg.i(obj, D), G(i2));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    az = aorn.u(s, J(obj, D));
                    break;
                case 19:
                    az = aorn.t(s, J(obj, D));
                    break;
                case 20:
                    az = aorn.w(s, J(obj, D));
                    break;
                case 21:
                    az = aorn.A(s, J(obj, D));
                    break;
                case 22:
                    az = aorn.v(s, J(obj, D));
                    break;
                case 23:
                    az = aorn.u(s, J(obj, D));
                    break;
                case 24:
                    az = aorn.t(s, J(obj, D));
                    break;
                case 25:
                    az = aorn.r(s, J(obj, D));
                    break;
                case 26:
                    az = aorn.m(s, J(obj, D));
                    break;
                case 27:
                    az = aorn.j(s, J(obj, D), G(i2));
                    break;
                case 28:
                    az = aorn.b(s, J(obj, D));
                    break;
                case 29:
                    az = aorn.z(s, J(obj, D));
                    break;
                case 30:
                    az = aorn.s(s, J(obj, D));
                    break;
                case 31:
                    az = aorn.t(s, J(obj, D));
                    break;
                case 32:
                    az = aorn.u(s, J(obj, D));
                    break;
                case 33:
                    az = aorn.x(s, J(obj, D));
                    break;
                case 34:
                    az = aorn.y(s, J(obj, D));
                    break;
                case 35:
                    e = aorn.e((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    e = aorn.d((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    e = aorn.h((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    e = aorn.o((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    e = aorn.g((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    e = aorn.e((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    e = aorn.d((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    e = aorn.a((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    e = aorn.n((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    e = aorn.c((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    e = aorn.d((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    e = aorn.e((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    e = aorn.k((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    e = aorn.l((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aool.ac(s);
                        ae = aool.ae(e);
                        az = ac + ae + e;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    az = aorn.f(s, J(obj, D), G(i2));
                    break;
                case 50:
                    az = apdw.i(s, aosg.i(obj, D), H(i2));
                    break;
                case 51:
                    if (U(obj, s, i2)) {
                        az = aool.az(s);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (U(obj, s, i2)) {
                        az = aool.aC(s);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (U(obj, s, i2)) {
                        az = aool.P(s, E(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (U(obj, s, i2)) {
                        az = aool.af(s, E(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (U(obj, s, i2)) {
                        az = aool.N(s, t(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (U(obj, s, i2)) {
                        az = aool.aB(s);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (U(obj, s, i2)) {
                        az = aool.aA(s);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (U(obj, s, i2)) {
                        az = aool.ay(s);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (U(obj, s, i2)) {
                        Object i5 = aosg.i(obj, D);
                        if (i5 instanceof aoob) {
                            az = aool.I(s, (aoob) i5);
                            break;
                        } else {
                            az = aool.aa(s, (String) i5);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (U(obj, s, i2)) {
                        az = aorn.i(s, aosg.i(obj, D), G(i2));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (U(obj, s, i2)) {
                        az = aool.I(s, (aoob) aosg.i(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (U(obj, s, i2)) {
                        az = aool.ad(s, t(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (U(obj, s, i2)) {
                        az = aool.K(s, t(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (U(obj, s, i2)) {
                        az = aool.aD(s);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (U(obj, s, i2)) {
                        az = aool.aE(s);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (U(obj, s, i2)) {
                        az = aool.W(s, t(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (U(obj, s, i2)) {
                        az = aool.Y(s, E(obj, D));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (U(obj, s, i2)) {
                        az = aool.L(s, (aoqu) aosg.i(obj, D), G(i2));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i += az;
        }
        return i + ac(obj);
    }

    private final int s(int i) {
        return this.c[i];
    }

    private static int t(Object obj, long j) {
        return ((Integer) aosg.i(obj, j)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    private final int u(Object obj, byte[] bArr, int i, int i2, int i3, long j, aonp aonpVar) {
        Unsafe unsafe = b;
        Object H = H(i3);
        Object object = unsafe.getObject(obj, j);
        if (apdw.j(object)) {
            Object l = apdw.l();
            apdw.k(l, object);
            unsafe.putObject(obj, j, l);
            object = l;
        }
        aoqn h = apdw.h(H);
        aoqp aoqpVar = (aoqp) object;
        int E = aoyt.E(bArr, i, aonpVar);
        int i4 = aonpVar.a;
        if (i4 < 0 || i4 > i2 - E) {
            throw aopx.j();
        }
        int i5 = E + i4;
        Object obj2 = h.b;
        Object obj3 = h.d;
        while (E < i5) {
            int i6 = E + 1;
            byte b2 = bArr[E];
            if (b2 < 0) {
                i6 = aoyt.F(b2, bArr, i6, aonpVar);
                b2 = aonpVar.a;
            }
            int i7 = b2 & 7;
            int i8 = b2 >>> 3;
            if (i8 != 1) {
                if (i8 == 2) {
                    aosj aosjVar = h.c;
                    if (i7 == aosjVar.t) {
                        E = W(bArr, i6, i2, aosjVar, h.d.getClass(), aonpVar);
                        obj3 = aonpVar.c;
                    }
                }
                E = aoyt.I(b2, bArr, i6, i2, aonpVar);
            } else {
                aosj aosjVar2 = h.a;
                if (i7 == aosjVar2.t) {
                    E = W(bArr, i6, i2, aosjVar2, null, aonpVar);
                    obj2 = aonpVar.c;
                } else {
                    E = aoyt.I(b2, bArr, i6, i2, aonpVar);
                }
            }
        }
        if (E != i5) {
            throw aopx.g();
        }
        aoqpVar.put(obj2, obj3);
        return i5;
    }

    private final int v(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, aonp aonpVar) {
        Unsafe unsafe = b;
        long j2 = this.c[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(aoyt.l(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(aoyt.m(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int H = aoyt.H(bArr, i, aonpVar);
                    unsafe.putObject(obj, j, Long.valueOf(aonpVar.b));
                    unsafe.putInt(obj, j2, i4);
                    return H;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int E = aoyt.E(bArr, i, aonpVar);
                    unsafe.putObject(obj, j, Integer.valueOf(aonpVar.a));
                    unsafe.putInt(obj, j2, i4);
                    return E;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(aoyt.J(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(aoyt.o(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int H2 = aoyt.H(bArr, i, aonpVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(aonpVar.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return H2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int E2 = aoyt.E(bArr, i, aonpVar);
                    int i9 = aonpVar.a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) == 0 || aosi.h(bArr, E2, E2 + i9)) {
                        unsafe.putObject(obj, j, new String(bArr, E2, i9, aopv.a));
                        E2 += i9;
                    } else {
                        throw aopx.d();
                    }
                    unsafe.putInt(obj, j2, i4);
                    return E2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int q = aoyt.q(G(i8), bArr, i, i2, aonpVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, aonpVar.c);
                    } else {
                        unsafe.putObject(obj, j, aopv.e(object, aonpVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return q;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int n = aoyt.n(bArr, i, aonpVar);
                    unsafe.putObject(obj, j, aonpVar.c);
                    unsafe.putInt(obj, j2, i4);
                    return n;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int E3 = aoyt.E(bArr, i, aonpVar);
                    int i10 = aonpVar.a;
                    aopo F = F(i8);
                    if (F == null || F.isInRange(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        d(obj).f(i3, Long.valueOf(i10));
                    }
                    return E3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int E4 = aoyt.E(bArr, i, aonpVar);
                    unsafe.putObject(obj, j, Integer.valueOf(aoog.J(aonpVar.a)));
                    unsafe.putInt(obj, j2, i4);
                    return E4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int H3 = aoyt.H(bArr, i, aonpVar);
                    unsafe.putObject(obj, j, Long.valueOf(aoog.L(aonpVar.b)));
                    unsafe.putInt(obj, j2, i4);
                    return H3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int p = aoyt.p(G(i8), bArr, i, i2, (i3 & (-8)) | 4, aonpVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, aonpVar.c);
                    } else {
                        unsafe.putObject(obj, j, aopv.e(object2, aonpVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return p;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0194  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x01df -> B:108:0x01e0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0114 -> B:55:0x0115). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0191 -> B:88:0x0192). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int w(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, defpackage.aonp r29) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoqw.w(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, aonp):int");
    }

    private final int x(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return A(i, 0);
    }

    private final int y(int i, int i2) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return A(i, i2);
    }

    private final int z(int i) {
        return this.c[i + 2];
    }

    @Override // defpackage.aorm
    public final int a(Object obj) {
        return this.j ? r(obj) : q(obj);
    }

    @Override // defpackage.aorm
    public final int b(Object obj) {
        int i;
        int c;
        int length = this.c.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int C = C(i3);
            int s = s(i3);
            long D = D(C);
            int i4 = 37;
            switch (B(C)) {
                case 0:
                    i = i2 * 53;
                    c = aopv.c(Double.doubleToLongBits(aosg.b(obj, D)));
                    i2 = i + c;
                    break;
                case 1:
                    i = i2 * 53;
                    c = Float.floatToIntBits(aosg.c(obj, D));
                    i2 = i + c;
                    break;
                case 2:
                    i = i2 * 53;
                    c = aopv.c(aosg.f(obj, D));
                    i2 = i + c;
                    break;
                case 3:
                    i = i2 * 53;
                    c = aopv.c(aosg.f(obj, D));
                    i2 = i + c;
                    break;
                case 4:
                    i = i2 * 53;
                    c = aosg.d(obj, D);
                    i2 = i + c;
                    break;
                case 5:
                    i = i2 * 53;
                    c = aopv.c(aosg.f(obj, D));
                    i2 = i + c;
                    break;
                case 6:
                    i = i2 * 53;
                    c = aosg.d(obj, D);
                    i2 = i + c;
                    break;
                case 7:
                    i = i2 * 53;
                    c = aopv.a(aosg.x(obj, D));
                    i2 = i + c;
                    break;
                case 8:
                    i = i2 * 53;
                    c = ((String) aosg.i(obj, D)).hashCode();
                    i2 = i + c;
                    break;
                case 9:
                    Object i5 = aosg.i(obj, D);
                    if (i5 != null) {
                        i4 = i5.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    c = aosg.i(obj, D).hashCode();
                    i2 = i + c;
                    break;
                case 11:
                    i = i2 * 53;
                    c = aosg.d(obj, D);
                    i2 = i + c;
                    break;
                case 12:
                    i = i2 * 53;
                    c = aosg.d(obj, D);
                    i2 = i + c;
                    break;
                case 13:
                    i = i2 * 53;
                    c = aosg.d(obj, D);
                    i2 = i + c;
                    break;
                case 14:
                    i = i2 * 53;
                    c = aopv.c(aosg.f(obj, D));
                    i2 = i + c;
                    break;
                case 15:
                    i = i2 * 53;
                    c = aosg.d(obj, D);
                    i2 = i + c;
                    break;
                case 16:
                    i = i2 * 53;
                    c = aopv.c(aosg.f(obj, D));
                    i2 = i + c;
                    break;
                case 17:
                    Object i6 = aosg.i(obj, D);
                    if (i6 != null) {
                        i4 = i6.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
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
                    i = i2 * 53;
                    c = aosg.i(obj, D).hashCode();
                    i2 = i + c;
                    break;
                case 50:
                    i = i2 * 53;
                    c = aosg.i(obj, D).hashCode();
                    i2 = i + c;
                    break;
                case 51:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aopv.c(Double.doubleToLongBits(o(obj, D)));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = Float.floatToIntBits(p(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aopv.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aopv.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aopv.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aopv.a(V(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = ((String) aosg.i(obj, D)).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aosg.i(obj, D).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aosg.i(obj, D).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aopv.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aopv.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aosg.i(obj, D).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + apfu.q(obj).hashCode();
        return this.h ? (hashCode * 53) + aoyt.f(obj).hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x0678, code lost:
        if (r5 == 1048575) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x067a, code lost:
        r31.putInt(r12, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0680, code lost:
        r2 = r7.m;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0686, code lost:
        if (r2 >= r7.n) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0688, code lost:
        r3 = r7.ab(r12, r7.l[r2], r3);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0693, code lost:
        if (r3 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0695, code lost:
        defpackage.apfu.r(r12, (defpackage.aory) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x069a, code lost:
        if (r8 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x069e, code lost:
        if (r0 != r37) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x06a5, code lost:
        throw defpackage.aopx.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x06a8, code lost:
        if (r0 > r37) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x06aa, code lost:
        if (r1 != r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x06ac, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x06b2, code lost:
        throw defpackage.aopx.g();
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x063e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, defpackage.aonp r39) {
        /*
            Method dump skipped, instructions count: 1834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoqw.c(java.lang.Object, byte[], int, int, int, aonp):int");
    }

    @Override // defpackage.aorm
    public final Object e() {
        return ((aopi) this.g).dynamicMethod(aoph.NEW_MUTABLE_INSTANCE);
    }

    @Override // defpackage.aorm
    public final void f(Object obj) {
        int i;
        int i2 = this.m;
        while (true) {
            i = this.n;
            if (i2 >= i) {
                break;
            }
            long D = D(C(this.l[i2]));
            Object i3 = aosg.i(obj, D);
            if (i3 != null) {
                ((aoqp) i3).c();
                aosg.v(obj, D, i3);
            }
            i2++;
        }
        int length = this.l.length;
        while (i < length) {
            this.o.c(obj, this.l[i]);
            i++;
        }
        apfu.t(obj);
        if (this.h) {
            aoyt.j(obj);
        }
    }

    @Override // defpackage.aorm
    public final void h(Object obj, aorh aorhVar, aoos aoosVar) {
        Object valueOf;
        Object l;
        ArrayList arrayList;
        Object X;
        aoosVar.getClass();
        apfu apfuVar = this.p;
        Object obj2 = null;
        aoov aoovVar = null;
        while (true) {
            try {
                int c = aorhVar.c();
                int x = x(c);
                if (x >= 0) {
                    int C = C(x);
                    try {
                        switch (B(C)) {
                            case 0:
                                aosg.r(obj, D(C), aorhVar.a());
                                N(obj, x);
                                break;
                            case 1:
                                aosg.s(obj, D(C), aorhVar.b());
                                N(obj, x);
                                break;
                            case 2:
                                aosg.u(obj, D(C), aorhVar.l());
                                N(obj, x);
                                break;
                            case 3:
                                aosg.u(obj, D(C), aorhVar.o());
                                N(obj, x);
                                break;
                            case 4:
                                aosg.t(obj, D(C), aorhVar.g());
                                N(obj, x);
                                break;
                            case 5:
                                aosg.u(obj, D(C), aorhVar.k());
                                N(obj, x);
                                break;
                            case 6:
                                aosg.t(obj, D(C), aorhVar.f());
                                N(obj, x);
                                break;
                            case 7:
                                aosg.n(obj, D(C), aorhVar.T());
                                N(obj, x);
                                break;
                            case 8:
                                M(obj, C, aorhVar);
                                N(obj, x);
                                break;
                            case 9:
                                if (R(obj, x)) {
                                    aosg.v(obj, D(C), aopv.e(aosg.i(obj, D(C)), aorhVar.u(G(x), aoosVar)));
                                    break;
                                } else {
                                    aosg.v(obj, D(C), aorhVar.u(G(x), aoosVar));
                                    N(obj, x);
                                    break;
                                }
                            case 10:
                                aosg.v(obj, D(C), aorhVar.q());
                                N(obj, x);
                                break;
                            case 11:
                                aosg.t(obj, D(C), aorhVar.j());
                                N(obj, x);
                                break;
                            case 12:
                                int e = aorhVar.e();
                                aopo F = F(x);
                                if (F != null && !F.isInRange(e)) {
                                    obj2 = aorn.W(c, e, obj2);
                                    break;
                                }
                                aosg.t(obj, D(C), e);
                                N(obj, x);
                                break;
                            case 13:
                                aosg.t(obj, D(C), aorhVar.h());
                                N(obj, x);
                                break;
                            case 14:
                                aosg.u(obj, D(C), aorhVar.m());
                                N(obj, x);
                                break;
                            case 15:
                                aosg.t(obj, D(C), aorhVar.i());
                                N(obj, x);
                                break;
                            case 16:
                                aosg.u(obj, D(C), aorhVar.n());
                                N(obj, x);
                                break;
                            case 17:
                                if (R(obj, x)) {
                                    aosg.v(obj, D(C), aopv.e(aosg.i(obj, D(C)), aorhVar.s(G(x), aoosVar)));
                                    break;
                                } else {
                                    aosg.v(obj, D(C), aorhVar.s(G(x), aoosVar));
                                    N(obj, x);
                                    break;
                                }
                            case 18:
                                aorhVar.A(this.o.b(obj, D(C)));
                                break;
                            case 19:
                                aorhVar.E(this.o.b(obj, D(C)));
                                break;
                            case 20:
                                aorhVar.H(this.o.b(obj, D(C)));
                                break;
                            case 21:
                                aorhVar.S(this.o.b(obj, D(C)));
                                break;
                            case 22:
                                aorhVar.G(this.o.b(obj, D(C)));
                                break;
                            case 23:
                                aorhVar.D(this.o.b(obj, D(C)));
                                break;
                            case 24:
                                aorhVar.C(this.o.b(obj, D(C)));
                                break;
                            case 25:
                                aorhVar.y(this.o.b(obj, D(C)));
                                break;
                            case 26:
                                if (Q(C)) {
                                    aorhVar.Q(this.o.b(obj, D(C)));
                                    break;
                                } else {
                                    aorhVar.O(this.o.b(obj, D(C)));
                                    break;
                                }
                            case 27:
                                aorhVar.J(this.o.b(obj, D(C)), G(x), aoosVar);
                                break;
                            case 28:
                                aorhVar.z(this.o.b(obj, D(C)));
                                break;
                            case 29:
                                aorhVar.R(this.o.b(obj, D(C)));
                                break;
                            case 30:
                                List b2 = this.o.b(obj, D(C));
                                aorhVar.B(b2);
                                obj2 = aorn.Y(c, b2, F(x), obj2);
                                break;
                            case 31:
                                aorhVar.K(this.o.b(obj, D(C)));
                                break;
                            case 32:
                                aorhVar.L(this.o.b(obj, D(C)));
                                break;
                            case 33:
                                aorhVar.M(this.o.b(obj, D(C)));
                                break;
                            case 34:
                                aorhVar.N(this.o.b(obj, D(C)));
                                break;
                            case 35:
                                aorhVar.A(this.o.b(obj, D(C)));
                                break;
                            case 36:
                                aorhVar.E(this.o.b(obj, D(C)));
                                break;
                            case 37:
                                aorhVar.H(this.o.b(obj, D(C)));
                                break;
                            case 38:
                                aorhVar.S(this.o.b(obj, D(C)));
                                break;
                            case 39:
                                aorhVar.G(this.o.b(obj, D(C)));
                                break;
                            case 40:
                                aorhVar.D(this.o.b(obj, D(C)));
                                break;
                            case 41:
                                aorhVar.C(this.o.b(obj, D(C)));
                                break;
                            case 42:
                                aorhVar.y(this.o.b(obj, D(C)));
                                break;
                            case 43:
                                aorhVar.R(this.o.b(obj, D(C)));
                                break;
                            case 44:
                                List b3 = this.o.b(obj, D(C));
                                aorhVar.B(b3);
                                obj2 = aorn.Y(c, b3, F(x), obj2);
                                break;
                            case 45:
                                aorhVar.K(this.o.b(obj, D(C)));
                                break;
                            case 46:
                                aorhVar.L(this.o.b(obj, D(C)));
                                break;
                            case 47:
                                aorhVar.M(this.o.b(obj, D(C)));
                                break;
                            case 48:
                                aorhVar.N(this.o.b(obj, D(C)));
                                break;
                            case 49:
                                aorhVar.F(this.o.b(obj, D(C)), G(x), aoosVar);
                                break;
                            case 50:
                                Object H = H(x);
                                long D = D(C(x));
                                Object i = aosg.i(obj, D);
                                if (i == null) {
                                    i = apdw.l();
                                    aosg.v(obj, D, i);
                                } else if (apdw.j(i)) {
                                    Object l2 = apdw.l();
                                    apdw.k(l2, i);
                                    aosg.v(obj, D, l2);
                                    i = l2;
                                }
                                aorhVar.I((aoqp) i, apdw.h(H), aoosVar);
                                break;
                            case 51:
                                aosg.v(obj, D(C), Double.valueOf(aorhVar.a()));
                                O(obj, c, x);
                                break;
                            case 52:
                                aosg.v(obj, D(C), Float.valueOf(aorhVar.b()));
                                O(obj, c, x);
                                break;
                            case 53:
                                aosg.v(obj, D(C), Long.valueOf(aorhVar.l()));
                                O(obj, c, x);
                                break;
                            case 54:
                                aosg.v(obj, D(C), Long.valueOf(aorhVar.o()));
                                O(obj, c, x);
                                break;
                            case 55:
                                aosg.v(obj, D(C), Integer.valueOf(aorhVar.g()));
                                O(obj, c, x);
                                break;
                            case 56:
                                aosg.v(obj, D(C), Long.valueOf(aorhVar.k()));
                                O(obj, c, x);
                                break;
                            case 57:
                                aosg.v(obj, D(C), Integer.valueOf(aorhVar.f()));
                                O(obj, c, x);
                                break;
                            case 58:
                                aosg.v(obj, D(C), Boolean.valueOf(aorhVar.T()));
                                O(obj, c, x);
                                break;
                            case 59:
                                M(obj, C, aorhVar);
                                O(obj, c, x);
                                break;
                            case 60:
                                if (U(obj, c, x)) {
                                    aosg.v(obj, D(C), aopv.e(aosg.i(obj, D(C)), aorhVar.u(G(x), aoosVar)));
                                } else {
                                    aosg.v(obj, D(C), aorhVar.u(G(x), aoosVar));
                                    N(obj, x);
                                }
                                O(obj, c, x);
                                break;
                            case 61:
                                aosg.v(obj, D(C), aorhVar.q());
                                O(obj, c, x);
                                break;
                            case 62:
                                aosg.v(obj, D(C), Integer.valueOf(aorhVar.j()));
                                O(obj, c, x);
                                break;
                            case 63:
                                int e2 = aorhVar.e();
                                aopo F2 = F(x);
                                if (F2 != null && !F2.isInRange(e2)) {
                                    obj2 = aorn.W(c, e2, obj2);
                                    break;
                                }
                                aosg.v(obj, D(C), Integer.valueOf(e2));
                                O(obj, c, x);
                                break;
                            case 64:
                                aosg.v(obj, D(C), Integer.valueOf(aorhVar.h()));
                                O(obj, c, x);
                                break;
                            case 65:
                                aosg.v(obj, D(C), Long.valueOf(aorhVar.m()));
                                O(obj, c, x);
                                break;
                            case 66:
                                aosg.v(obj, D(C), Integer.valueOf(aorhVar.i()));
                                O(obj, c, x);
                                break;
                            case 67:
                                aosg.v(obj, D(C), Long.valueOf(aorhVar.n()));
                                O(obj, c, x);
                                break;
                            case 68:
                                aosg.v(obj, D(C), aorhVar.s(G(x), aoosVar));
                                O(obj, c, x);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = aory.c();
                                }
                                if (apfuVar.n(obj2, aorhVar)) {
                                    break;
                                } else {
                                    for (int i2 = this.m; i2 < this.n; i2++) {
                                        obj2 = ab(obj, this.l[i2], obj2);
                                    }
                                    if (obj2 == null) {
                                        return;
                                    }
                                }
                                break;
                        }
                    } catch (aopw unused) {
                        if (obj2 == null) {
                            obj2 = apfu.s(obj);
                        }
                        if (!apfuVar.n(obj2, aorhVar)) {
                            for (int i3 = this.m; i3 < this.n; i3++) {
                                obj2 = ab(obj, this.l[i3], obj2);
                            }
                            if (obj2 == null) {
                                return;
                            }
                            apfu.r(obj, (aory) obj2);
                            return;
                        }
                    }
                } else if (c == Integer.MAX_VALUE) {
                    for (int i4 = this.m; i4 < this.n; i4++) {
                        obj2 = ab(obj, this.l[i4], obj2);
                    }
                    if (obj2 == null) {
                        return;
                    }
                } else {
                    aopg d = !this.h ? null : aoosVar.d(this.g, c);
                    if (d != null) {
                        if (aoovVar == null) {
                            aoovVar = aoyt.g(obj);
                        }
                        int a2 = d.a();
                        aopf aopfVar = d.d;
                        if (!aopfVar.d || !aopfVar.e) {
                            if (d.b() != aosj.ENUM) {
                                switch (d.b().ordinal()) {
                                    case 0:
                                        valueOf = Double.valueOf(aorhVar.a());
                                        break;
                                    case 1:
                                        valueOf = Float.valueOf(aorhVar.b());
                                        break;
                                    case 2:
                                        valueOf = Long.valueOf(aorhVar.l());
                                        break;
                                    case 3:
                                        valueOf = Long.valueOf(aorhVar.o());
                                        break;
                                    case 4:
                                        valueOf = Integer.valueOf(aorhVar.g());
                                        break;
                                    case 5:
                                        valueOf = Long.valueOf(aorhVar.k());
                                        break;
                                    case 6:
                                        valueOf = Integer.valueOf(aorhVar.f());
                                        break;
                                    case 7:
                                        valueOf = Boolean.valueOf(aorhVar.T());
                                        break;
                                    case 8:
                                        valueOf = aorhVar.v();
                                        break;
                                    case 9:
                                        valueOf = aorhVar.r(d.c.getClass(), aoosVar);
                                        break;
                                    case 10:
                                        valueOf = aorhVar.t(d.c.getClass(), aoosVar);
                                        break;
                                    case 11:
                                        valueOf = aorhVar.q();
                                        break;
                                    case 12:
                                        valueOf = Integer.valueOf(aorhVar.j());
                                        break;
                                    case 13:
                                        throw new IllegalStateException("Shouldn't reach here.");
                                    case 14:
                                        valueOf = Integer.valueOf(aorhVar.h());
                                        break;
                                    case 15:
                                        valueOf = Long.valueOf(aorhVar.m());
                                        break;
                                    case 16:
                                        valueOf = Integer.valueOf(aorhVar.i());
                                        break;
                                    case 17:
                                        valueOf = Long.valueOf(aorhVar.n());
                                        break;
                                    default:
                                        valueOf = null;
                                        break;
                                }
                            } else {
                                int g = aorhVar.g();
                                if (d.d.a.mo283findValueByNumber(g) == null) {
                                    obj2 = aorn.W(a2, g, obj2);
                                } else {
                                    valueOf = Integer.valueOf(g);
                                }
                            }
                            if (d.e()) {
                                aoovVar.m(d.d, valueOf);
                            } else {
                                int ordinal = d.b().ordinal();
                                if ((ordinal == 9 || ordinal == 10) && (l = aoovVar.l(d.d)) != null) {
                                    valueOf = aopv.e(l, valueOf);
                                }
                                aoovVar.n(d.d, valueOf);
                            }
                        } else {
                            aosj aosjVar = aosj.DOUBLE;
                            switch (d.b().ordinal()) {
                                case 0:
                                    arrayList = new ArrayList();
                                    aorhVar.A(arrayList);
                                    X = obj2;
                                    break;
                                case 1:
                                    arrayList = new ArrayList();
                                    aorhVar.E(arrayList);
                                    X = obj2;
                                    break;
                                case 2:
                                    arrayList = new ArrayList();
                                    aorhVar.H(arrayList);
                                    X = obj2;
                                    break;
                                case 3:
                                    arrayList = new ArrayList();
                                    aorhVar.S(arrayList);
                                    X = obj2;
                                    break;
                                case 4:
                                    arrayList = new ArrayList();
                                    aorhVar.G(arrayList);
                                    X = obj2;
                                    break;
                                case 5:
                                    arrayList = new ArrayList();
                                    aorhVar.D(arrayList);
                                    X = obj2;
                                    break;
                                case 6:
                                    arrayList = new ArrayList();
                                    aorhVar.C(arrayList);
                                    X = obj2;
                                    break;
                                case 7:
                                    arrayList = new ArrayList();
                                    aorhVar.y(arrayList);
                                    X = obj2;
                                    break;
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                default:
                                    String valueOf2 = String.valueOf(d.d.c);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 23);
                                    sb.append("Type cannot be packed: ");
                                    sb.append(valueOf2);
                                    throw new IllegalStateException(sb.toString());
                                case 12:
                                    arrayList = new ArrayList();
                                    aorhVar.R(arrayList);
                                    X = obj2;
                                    break;
                                case 13:
                                    ArrayList arrayList2 = new ArrayList();
                                    aorhVar.B(arrayList2);
                                    X = aorn.X(a2, arrayList2, d.d.a, obj2);
                                    arrayList = arrayList2;
                                    break;
                                case 14:
                                    arrayList = new ArrayList();
                                    aorhVar.K(arrayList);
                                    X = obj2;
                                    break;
                                case 15:
                                    arrayList = new ArrayList();
                                    aorhVar.L(arrayList);
                                    X = obj2;
                                    break;
                                case 16:
                                    arrayList = new ArrayList();
                                    aorhVar.M(arrayList);
                                    X = obj2;
                                    break;
                                case 17:
                                    arrayList = new ArrayList();
                                    aorhVar.N(arrayList);
                                    X = obj2;
                                    break;
                            }
                            aoovVar.n(d.d, arrayList);
                            obj2 = X;
                        }
                    } else {
                        if (obj2 == null) {
                            obj2 = apfu.s(obj);
                        }
                        if (!apfuVar.n(obj2, aorhVar)) {
                            for (int i5 = this.m; i5 < this.n; i5++) {
                                obj2 = ab(obj, this.l[i5], obj2);
                            }
                            if (obj2 == null) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i6 = this.m; i6 < this.n; i6++) {
                    obj2 = ab(obj, this.l[i6], obj2);
                }
                if (obj2 != null) {
                    apfu.r(obj, (aory) obj2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.aorm
    public final void i(Object obj, byte[] bArr, int i, int i2, aonp aonpVar) {
        if (this.j) {
            X(obj, bArr, i, i2, aonpVar);
        } else {
            c(obj, bArr, i, i2, 0, aonpVar);
        }
    }

    @Override // defpackage.aorm
    public final boolean j(Object obj, Object obj2) {
        boolean q;
        int length = this.c.length;
        for (int i = 0; i < length; i += 3) {
            int C = C(i);
            long D = D(C);
            switch (B(C)) {
                case 0:
                    if (P(obj, obj2, i) && Double.doubleToLongBits(aosg.b(obj, D)) == Double.doubleToLongBits(aosg.b(obj2, D))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (P(obj, obj2, i) && Float.floatToIntBits(aosg.c(obj, D)) == Float.floatToIntBits(aosg.c(obj2, D))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (P(obj, obj2, i) && aosg.f(obj, D) == aosg.f(obj2, D)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (P(obj, obj2, i) && aosg.f(obj, D) == aosg.f(obj2, D)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (P(obj, obj2, i) && aosg.d(obj, D) == aosg.d(obj2, D)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (P(obj, obj2, i) && aosg.f(obj, D) == aosg.f(obj2, D)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (P(obj, obj2, i) && aosg.d(obj, D) == aosg.d(obj2, D)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (P(obj, obj2, i) && aosg.x(obj, D) == aosg.x(obj2, D)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (P(obj, obj2, i) && aorn.q(aosg.i(obj, D), aosg.i(obj2, D))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (P(obj, obj2, i) && aorn.q(aosg.i(obj, D), aosg.i(obj2, D))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (P(obj, obj2, i) && aorn.q(aosg.i(obj, D), aosg.i(obj2, D))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (P(obj, obj2, i) && aosg.d(obj, D) == aosg.d(obj2, D)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (P(obj, obj2, i) && aosg.d(obj, D) == aosg.d(obj2, D)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (P(obj, obj2, i) && aosg.d(obj, D) == aosg.d(obj2, D)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (P(obj, obj2, i) && aosg.f(obj, D) == aosg.f(obj2, D)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (P(obj, obj2, i) && aosg.d(obj, D) == aosg.d(obj2, D)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (P(obj, obj2, i) && aosg.f(obj, D) == aosg.f(obj2, D)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (P(obj, obj2, i) && aorn.q(aosg.i(obj, D), aosg.i(obj2, D))) {
                        continue;
                    }
                    return false;
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
                    q = aorn.q(aosg.i(obj, D), aosg.i(obj2, D));
                    break;
                case 50:
                    q = aorn.q(aosg.i(obj, D), aosg.i(obj2, D));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long z = z(i) & 1048575;
                    if (aosg.d(obj, z) == aosg.d(obj2, z) && aorn.q(aosg.i(obj, D), aosg.i(obj2, D))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!q) {
                return false;
            }
        }
        if (!apfu.q(obj).equals(apfu.q(obj2))) {
            return false;
        }
        if (!this.h) {
            return true;
        }
        return aoyt.f(obj).equals(aoyt.f(obj2));
    }

    @Override // defpackage.aorm
    public final boolean k(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.m) {
            int i6 = this.l[i5];
            int s = s(i6);
            int C = C(i6);
            int i7 = this.c[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = b.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & C) != 0 && !S(obj, i6, i, i2, i9)) {
                return false;
            }
            int B = B(C);
            if (B != 9 && B != 17) {
                if (B != 27) {
                    if (B == 60 || B == 68) {
                        if (U(obj, s, i6) && !T(obj, C, G(i6))) {
                            return false;
                        }
                    } else if (B != 49) {
                        if (B != 50) {
                            continue;
                        } else {
                            aoqp aoqpVar = (aoqp) aosg.i(obj, D(C));
                            if (!aoqpVar.isEmpty() && apdw.h(H(i6)).c.s == aosk.MESSAGE) {
                                aorm aormVar = null;
                                for (Object obj2 : aoqpVar.values()) {
                                    if (aormVar == null) {
                                        aormVar = aore.a.a(obj2.getClass());
                                    }
                                    if (!aormVar.k(obj2)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                }
                List list = (List) aosg.i(obj, D(C));
                if (!list.isEmpty()) {
                    aorm G = G(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!G.k(list.get(i10))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (S(obj, i6, i, i2, i9) && !T(obj, C, G(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.h || aoyt.f(obj).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0586  */
    @Override // defpackage.aorm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.Object r13, defpackage.aoom r14) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoqw.l(java.lang.Object, aoom):void");
    }

    @Override // defpackage.aorm
    public final void g(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int C = C(i);
            long D = D(C);
            int s = s(i);
            switch (B(C)) {
                case 0:
                    if (R(obj2, i)) {
                        aosg.r(obj, D, aosg.b(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (R(obj2, i)) {
                        aosg.s(obj, D, aosg.c(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (R(obj2, i)) {
                        aosg.u(obj, D, aosg.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (R(obj2, i)) {
                        aosg.u(obj, D, aosg.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (R(obj2, i)) {
                        aosg.t(obj, D, aosg.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (R(obj2, i)) {
                        aosg.u(obj, D, aosg.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (R(obj2, i)) {
                        aosg.t(obj, D, aosg.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (R(obj2, i)) {
                        aosg.n(obj, D, aosg.x(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (R(obj2, i)) {
                        aosg.v(obj, D, aosg.i(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    K(obj, obj2, i);
                    break;
                case 10:
                    if (R(obj2, i)) {
                        aosg.v(obj, D, aosg.i(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (R(obj2, i)) {
                        aosg.t(obj, D, aosg.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (R(obj2, i)) {
                        aosg.t(obj, D, aosg.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (R(obj2, i)) {
                        aosg.t(obj, D, aosg.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (R(obj2, i)) {
                        aosg.u(obj, D, aosg.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (R(obj2, i)) {
                        aosg.t(obj, D, aosg.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (R(obj2, i)) {
                        aosg.u(obj, D, aosg.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    K(obj, obj2, i);
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
                    this.o.d(obj, obj2, D);
                    break;
                case 50:
                    aorn.U(obj, obj2, D);
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
                    if (U(obj2, s, i)) {
                        aosg.v(obj, D, aosg.i(obj2, D));
                        O(obj, s, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    L(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (U(obj2, s, i)) {
                        aosg.v(obj, D, aosg.i(obj2, D));
                        O(obj, s, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    L(obj, obj2, i);
                    break;
            }
        }
        aorn.V(obj, obj2);
        if (this.h) {
            aorn.T(obj, obj2);
        }
    }
}
