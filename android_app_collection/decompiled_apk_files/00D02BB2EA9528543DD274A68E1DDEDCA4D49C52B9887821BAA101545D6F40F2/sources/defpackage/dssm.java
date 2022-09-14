package defpackage;

import com.google.android.filament.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dssm  reason: default package */
/* loaded from: classes.dex */
public final class dssm<T> implements dstc<T> {
    private static final int[] a = new int[0];
    private static final Unsafe b = dsui.r();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final dssj g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int[] k;
    private final int l;
    private final int m;
    private final dsrw n;
    private final dstx<?, ?> o;
    private final dsqb<?> p;
    private final dsse q;

    private dssm(int[] iArr, Object[] objArr, int i, int i2, dssj dssjVar, boolean z, int[] iArr2, int i3, int i4, dsrw dsrwVar, dstx dstxVar, dsqb dsqbVar, dsse dsseVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = dssjVar instanceof dsqw;
        this.j = z;
        boolean z2 = false;
        if (dsqbVar != null && dsqbVar.a(dssjVar)) {
            z2 = true;
        }
        this.h = z2;
        this.k = iArr2;
        this.l = i3;
        this.m = i4;
        this.n = dsrwVar;
        this.o = dstxVar;
        this.p = dsqbVar;
        this.g = dssjVar;
        this.q = dsseVar;
    }

    private final <UT, UB> UB A(Object obj, int i, UB ub, dstx<UT, UB> dstxVar) {
        dsrd z;
        int D = D(i);
        Object l = dsui.l(obj, I(E(i)));
        if (l == null || (z = z(i)) == null) {
            return ub;
        }
        dssb<?, ?> a2 = dsse.a(y(i));
        Iterator it = ((dssd) l).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z.a(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = dstxVar.f();
                }
                dsoy M = dspd.M(dssc.c(a2, entry.getKey(), entry.getValue()));
                try {
                    dssc.b(M.a, a2, entry.getKey(), entry.getValue());
                    dstxVar.d(ub, D, M.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean B(Object obj, int i, dstc dstcVar) {
        return dstcVar.k(dsui.l(obj, I(i)));
    }

    private final void C(Object obj, int i, dssw dsswVar) {
        if (H(i)) {
            dsui.m(obj, I(i), dsswVar.m());
        } else if (this.i) {
            dsui.m(obj, I(i), dsswVar.l());
        } else {
            dsui.m(obj, I(i), dsswVar.s());
        }
    }

    private final int D(int i) {
        return this.c[i];
    }

    private final int E(int i) {
        return this.c[i + 1];
    }

    private final int F(int i) {
        return this.c[i + 2];
    }

    private static int G(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean H(int i) {
        return (i & 536870912) != 0;
    }

    private static long I(int i) {
        return i & 1048575;
    }

    private static <T> double J(T t, long j) {
        return ((Double) dsui.l(t, j)).doubleValue();
    }

    private static <T> float K(T t, long j) {
        return ((Float) dsui.l(t, j)).floatValue();
    }

    private static <T> int L(T t, long j) {
        return ((Integer) dsui.l(t, j)).intValue();
    }

    private static <T> long M(T t, long j) {
        return ((Long) dsui.l(t, j)).longValue();
    }

    private static <T> boolean N(T t, long j) {
        return ((Boolean) dsui.l(t, j)).booleanValue();
    }

    private final boolean O(T t, T t2, int i) {
        return Q(t, i) == Q(t2, i);
    }

    private final boolean P(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return Q(t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean Q(T t, int i) {
        int F = F(i);
        long j = 1048575 & F;
        if (j != 1048575) {
            return (dsui.b(t, j) & (1 << (F >>> 20))) != 0;
        }
        int E = E(i);
        long I = I(E);
        switch (G(E)) {
            case 0:
                return dsui.j(t, I) != dcyn.a;
            case 1:
                return dsui.h(t, I) != 0.0f;
            case 2:
                return dsui.d(t, I) != 0;
            case 3:
                return dsui.d(t, I) != 0;
            case 4:
                return dsui.b(t, I) != 0;
            case 5:
                return dsui.d(t, I) != 0;
            case 6:
                return dsui.b(t, I) != 0;
            case 7:
                return dsui.f(t, I);
            case 8:
                Object l = dsui.l(t, I);
                if (l instanceof String) {
                    return !((String) l).isEmpty();
                } else if (!(l instanceof dspd)) {
                    throw new IllegalArgumentException();
                } else {
                    return !dspd.b.equals(l);
                }
            case 9:
                return dsui.l(t, I) != null;
            case 10:
                return !dspd.b.equals(dsui.l(t, I));
            case 11:
                return dsui.b(t, I) != 0;
            case 12:
                return dsui.b(t, I) != 0;
            case 13:
                return dsui.b(t, I) != 0;
            case 14:
                return dsui.d(t, I) != 0;
            case 15:
                return dsui.b(t, I) != 0;
            case 16:
                return dsui.d(t, I) != 0;
            case 17:
                return dsui.l(t, I) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void R(T t, int i) {
        int F = F(i);
        long j = 1048575 & F;
        if (j == 1048575) {
            return;
        }
        dsui.c(t, j, (1 << (F >>> 20)) | dsui.b(t, j));
    }

    private final boolean S(T t, int i, int i2) {
        return dsui.b(t, (long) (F(i2) & 1048575)) == i;
    }

    private final void T(T t, int i, int i2) {
        dsui.c(t, F(i2) & 1048575, i);
    }

    private final int U(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return W(i, 0);
    }

    private final int V(int i, int i2) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return W(i, i2);
    }

    private final int W(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int D = D(i4);
            if (i == D) {
                return i4;
            }
            if (i < D) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static final int X(byte[] bArr, int i, int i2, dsur dsurVar, Class<?> cls, dsol dsolVar) {
        dsur dsurVar2 = dsur.DOUBLE;
        switch (dsurVar.ordinal()) {
            case 0:
                dsolVar.c = Double.valueOf(dsom.f(bArr, i));
                return i + 8;
            case 1:
                dsolVar.c = Float.valueOf(dsom.g(bArr, i));
                return i + 4;
            case 2:
            case 3:
                int c = dsom.c(bArr, i, dsolVar);
                dsolVar.c = Long.valueOf(dsolVar.b);
                return c;
            case 4:
            case 12:
            case 13:
                int a2 = dsom.a(bArr, i, dsolVar);
                dsolVar.c = Integer.valueOf(dsolVar.a);
                return a2;
            case 5:
            case 15:
                dsolVar.c = Long.valueOf(dsom.e(bArr, i));
                return i + 8;
            case 6:
            case 14:
                dsolVar.c = Integer.valueOf(dsom.d(bArr, i));
                return i + 4;
            case 7:
                int c2 = dsom.c(bArr, i, dsolVar);
                dsolVar.c = Boolean.valueOf(dsolVar.b != 0);
                return c2;
            case 8:
                return dsom.i(bArr, i, dsolVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return dsom.k(dsst.a.a(cls), bArr, i, i2, dsolVar);
            case 11:
                return dsom.j(bArr, i, dsolVar);
            case 16:
                int a3 = dsom.a(bArr, i, dsolVar);
                dsolVar.c = Integer.valueOf(dspj.L(dsolVar.a));
                return a3;
            case 17:
                int c3 = dsom.c(bArr, i, dsolVar);
                dsolVar.c = Long.valueOf(dspj.M(dsolVar.b));
                return c3;
        }
    }

    private static final <UT, UB> int Y(dstx<UT, UB> dstxVar, T t) {
        return dstxVar.p(dstxVar.i(t));
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Z(T r31, byte[] r32, int r33, int r34, defpackage.dsol r35) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dssm.Z(java.lang.Object, byte[], int, int, dsol):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0491  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aa(T r18, defpackage.dspq r19) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dssm.aa(java.lang.Object, dspq):void");
    }

    private final <K, V> void ab(dspq dspqVar, int i, Object obj, int i2) {
        if (obj != null) {
            dssb<?, ?> a2 = dsse.a(y(i2));
            dspp dsppVar = dspqVar.a;
            for (Map.Entry<K, V> entry : ((dssd) obj).entrySet()) {
                dspqVar.a.aB(i, 2);
                dspqVar.a.s(dssc.c(a2, entry.getKey(), entry.getValue()));
                dssc.b(dspqVar.a, a2, entry.getKey(), entry.getValue());
            }
        }
    }

    private static final void ac(int i, Object obj, dspq dspqVar) {
        if (obj instanceof String) {
            dspqVar.l(i, (String) obj);
        } else {
            dspqVar.m(i, (dspd) obj);
        }
    }

    private static final <UT, UB> void ad(dstx<UT, UB> dstxVar, T t, dspq dspqVar) {
        dstxVar.r(dstxVar.i(t), dspqVar);
    }

    static dsty g(Object obj) {
        dsqw dsqwVar = (dsqw) obj;
        dsty dstyVar = dsqwVar.bD;
        if (dstyVar == dsty.a) {
            dsty a2 = dsty.a();
            dsqwVar.bD = a2;
            return a2;
        }
        return dstyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> defpackage.dssm<T> l(defpackage.dssv r35, defpackage.dssp r36, defpackage.dsrw r37, defpackage.dstx<?, ?> r38, defpackage.dsqb<?> r39, defpackage.dsse r40) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dssm.l(dssv, dssp, dsrw, dstx, dsqb, dsse):dssm");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> dssm<T> m(dssg dssgVar, dssp dsspVar, dsrw dsrwVar, dstx<?, ?> dstxVar, dsqb<?> dsqbVar, dsse dsseVar) {
        if (dssgVar instanceof dssv) {
            return l((dssv) dssgVar, dsspVar, dsrwVar, dstxVar, dsqbVar, dsseVar);
        }
        dstr dstrVar = (dstr) dssgVar;
        throw null;
    }

    private static Field o(Class<?> cls, String str) {
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

    private final void p(T t, T t2, int i) {
        long I = I(E(i));
        if (!Q(t2, i)) {
            return;
        }
        Object l = dsui.l(t, I);
        Object l2 = dsui.l(t2, I);
        if (l != null && l2 != null) {
            dsui.m(t, I, dsrk.g(l, l2));
            R(t, i);
        } else if (l2 == null) {
        } else {
            dsui.m(t, I, l2);
            R(t, i);
        }
    }

    private final void q(T t, T t2, int i) {
        int E = E(i);
        int D = D(i);
        long I = I(E);
        if (!S(t2, D, i)) {
            return;
        }
        Object l = S(t, D, i) ? dsui.l(t, I) : null;
        Object l2 = dsui.l(t2, I);
        if (l != null && l2 != null) {
            dsui.m(t, I, dsrk.g(l, l2));
            T(t, D, i);
        } else if (l2 == null) {
        } else {
            dsui.m(t, I, l2);
            T(t, D, i);
        }
    }

    private final int r(T t) {
        int i;
        int at;
        int j;
        int Y;
        int aa;
        Unsafe unsafe = b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1048575;
        for (int i5 = 0; i5 < this.c.length; i5 += 3) {
            int E = E(i5);
            int D = D(i5);
            int G = G(E);
            if (G <= 17) {
                int i6 = this.c[i5 + 2];
                int i7 = i6 & 1048575;
                i = 1 << (i6 >>> 20);
                if (i7 != i4) {
                    i3 = unsafe.getInt(t, i7);
                    i4 = i7;
                }
            } else {
                i = 0;
            }
            long I = I(E);
            switch (G) {
                case 0:
                    if ((i3 & i) != 0) {
                        at = dspp.at(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i3 & i) != 0) {
                        at = dspp.aw(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i3 & i) != 0) {
                        at = dspp.R(D, unsafe.getLong(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i3 & i) != 0) {
                        at = dspp.S(D, unsafe.getLong(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i3 & i) != 0) {
                        at = dspp.O(D, unsafe.getInt(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i3 & i) != 0) {
                        at = dspp.av(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i3 & i) != 0) {
                        at = dspp.au(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i3 & i) != 0) {
                        at = dspp.as(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i3 & i) != 0) {
                        Object object = unsafe.getObject(t, I);
                        if (object instanceof dspd) {
                            at = dspp.W(D, (dspd) object);
                        } else {
                            at = dspp.V(D, (String) object);
                        }
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i3 & i) != 0) {
                        at = dstd.m(D, unsafe.getObject(t, I), x(i5));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i3 & i) != 0) {
                        at = dspp.W(D, (dspd) unsafe.getObject(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i3 & i) != 0) {
                        at = dspp.P(D, unsafe.getInt(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i3 & i) != 0) {
                        at = dspp.U(D, unsafe.getInt(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i3 & i) != 0) {
                        at = dspp.ax(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i3 & i) != 0) {
                        at = dspp.ay(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i3 & i) != 0) {
                        at = dspp.Q(D, unsafe.getInt(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i3 & i) != 0) {
                        at = dspp.T(D, unsafe.getLong(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i3 & i) != 0) {
                        at = dspp.aq(D, (dssj) unsafe.getObject(t, I), x(i5));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    at = dstd.z(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case 19:
                    at = dstd.y(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case 20:
                    at = dstd.B(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case 21:
                    at = dstd.F(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case 22:
                    at = dstd.A(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case 23:
                    at = dstd.z(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case 24:
                    at = dstd.y(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case 25:
                    at = dstd.w(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case 26:
                    at = dstd.l(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case 27:
                    at = dstd.n(D, (List) unsafe.getObject(t, I), x(i5));
                    i2 += at;
                    break;
                case 28:
                    at = dstd.o(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case 29:
                    at = dstd.E(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    at = dstd.x(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    at = dstd.y(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    at = dstd.z(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    at = dstd.C(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    at = dstd.D(D, (List) unsafe.getObject(t, I));
                    i2 += at;
                    break;
                case 35:
                    j = dstd.j((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    j = dstd.i((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    j = dstd.b((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    j = dstd.c((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    j = dstd.f((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    j = dstd.j((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    j = dstd.i((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    j = dstd.k((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    j = dstd.g((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    j = dstd.e((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    j = dstd.i((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    j = dstd.j((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    j = dstd.h((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    j = dstd.d((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i2 += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    at = dstd.p(D, (List) unsafe.getObject(t, I), x(i5));
                    i2 += at;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    at = dsse.b(D, unsafe.getObject(t, I), y(i5));
                    i2 += at;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (S(t, D, i5)) {
                        at = dspp.at(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (S(t, D, i5)) {
                        at = dspp.aw(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (S(t, D, i5)) {
                        at = dspp.R(D, M(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (S(t, D, i5)) {
                        at = dspp.S(D, M(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (S(t, D, i5)) {
                        at = dspp.O(D, L(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (S(t, D, i5)) {
                        at = dspp.av(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (S(t, D, i5)) {
                        at = dspp.au(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (S(t, D, i5)) {
                        at = dspp.as(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (S(t, D, i5)) {
                        Object object2 = unsafe.getObject(t, I);
                        if (object2 instanceof dspd) {
                            at = dspp.W(D, (dspd) object2);
                        } else {
                            at = dspp.V(D, (String) object2);
                        }
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (S(t, D, i5)) {
                        at = dstd.m(D, unsafe.getObject(t, I), x(i5));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (S(t, D, i5)) {
                        at = dspp.W(D, (dspd) unsafe.getObject(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (S(t, D, i5)) {
                        at = dspp.P(D, L(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (S(t, D, i5)) {
                        at = dspp.U(D, L(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (S(t, D, i5)) {
                        at = dspp.ax(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (S(t, D, i5)) {
                        at = dspp.ay(D);
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (S(t, D, i5)) {
                        at = dspp.Q(D, L(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (S(t, D, i5)) {
                        at = dspp.T(D, M(t, I));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (S(t, D, i5)) {
                        at = dspp.aq(D, (dssj) unsafe.getObject(t, I), x(i5));
                        i2 += at;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int Y2 = i2 + Y(this.o, t);
        if (this.h) {
            dsqh<?> b2 = this.p.b(t);
            int i8 = 0;
            for (int i9 = 0; i9 < b2.a.b(); i9++) {
                Map.Entry<?, Object> c = b2.a.c(i9);
                i8 += dsqh.o((dsqu) c.getKey(), c.getValue());
            }
            for (Map.Entry<?, Object> entry : b2.a.d()) {
                i8 += dsqh.o((dsqu) entry.getKey(), entry.getValue());
            }
            return Y2 + i8;
        }
        return Y2;
    }

    private final int s(T t) {
        int at;
        int j;
        int Y;
        int aa;
        Unsafe unsafe = b;
        int i = 0;
        for (int i2 = 0; i2 < this.c.length; i2 += 3) {
            int E = E(i2);
            int G = G(E);
            int D = D(i2);
            long I = I(E);
            if (G >= dsqj.DOUBLE_LIST_PACKED.Z && G <= dsqj.SINT64_LIST_PACKED.Z) {
                int i3 = this.c[i2 + 2];
            }
            switch (G) {
                case 0:
                    if (Q(t, i2)) {
                        at = dspp.at(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (Q(t, i2)) {
                        at = dspp.aw(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (Q(t, i2)) {
                        at = dspp.R(D, dsui.d(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (Q(t, i2)) {
                        at = dspp.S(D, dsui.d(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (Q(t, i2)) {
                        at = dspp.O(D, dsui.b(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (Q(t, i2)) {
                        at = dspp.av(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (Q(t, i2)) {
                        at = dspp.au(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (Q(t, i2)) {
                        at = dspp.as(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (Q(t, i2)) {
                        Object l = dsui.l(t, I);
                        if (l instanceof dspd) {
                            at = dspp.W(D, (dspd) l);
                        } else {
                            at = dspp.V(D, (String) l);
                        }
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (Q(t, i2)) {
                        at = dstd.m(D, dsui.l(t, I), x(i2));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (Q(t, i2)) {
                        at = dspp.W(D, (dspd) dsui.l(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (Q(t, i2)) {
                        at = dspp.P(D, dsui.b(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (Q(t, i2)) {
                        at = dspp.U(D, dsui.b(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (Q(t, i2)) {
                        at = dspp.ax(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (Q(t, i2)) {
                        at = dspp.ay(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (Q(t, i2)) {
                        at = dspp.Q(D, dsui.b(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (Q(t, i2)) {
                        at = dspp.T(D, dsui.d(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (Q(t, i2)) {
                        at = dspp.aq(D, (dssj) dsui.l(t, I), x(i2));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    at = dstd.z(D, t(t, I));
                    i += at;
                    break;
                case 19:
                    at = dstd.y(D, t(t, I));
                    i += at;
                    break;
                case 20:
                    at = dstd.B(D, t(t, I));
                    i += at;
                    break;
                case 21:
                    at = dstd.F(D, t(t, I));
                    i += at;
                    break;
                case 22:
                    at = dstd.A(D, t(t, I));
                    i += at;
                    break;
                case 23:
                    at = dstd.z(D, t(t, I));
                    i += at;
                    break;
                case 24:
                    at = dstd.y(D, t(t, I));
                    i += at;
                    break;
                case 25:
                    at = dstd.w(D, t(t, I));
                    i += at;
                    break;
                case 26:
                    at = dstd.l(D, t(t, I));
                    i += at;
                    break;
                case 27:
                    at = dstd.n(D, t(t, I), x(i2));
                    i += at;
                    break;
                case 28:
                    at = dstd.o(D, t(t, I));
                    i += at;
                    break;
                case 29:
                    at = dstd.E(D, t(t, I));
                    i += at;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    at = dstd.x(D, t(t, I));
                    i += at;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    at = dstd.y(D, t(t, I));
                    i += at;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    at = dstd.z(D, t(t, I));
                    i += at;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    at = dstd.C(D, t(t, I));
                    i += at;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    at = dstd.D(D, t(t, I));
                    i += at;
                    break;
                case 35:
                    j = dstd.j((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    j = dstd.i((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    j = dstd.b((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    j = dstd.c((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    j = dstd.f((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    j = dstd.j((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    j = dstd.i((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    j = dstd.k((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    j = dstd.g((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    j = dstd.e((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    j = dstd.i((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    j = dstd.j((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    j = dstd.h((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    j = dstd.d((List) unsafe.getObject(t, I));
                    if (j > 0) {
                        Y = dspp.Y(D);
                        aa = dspp.aa(j);
                        i += Y + aa + j;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    at = dstd.p(D, t(t, I), x(i2));
                    i += at;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    at = dsse.b(D, dsui.l(t, I), y(i2));
                    i += at;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (S(t, D, i2)) {
                        at = dspp.at(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (S(t, D, i2)) {
                        at = dspp.aw(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (S(t, D, i2)) {
                        at = dspp.R(D, M(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (S(t, D, i2)) {
                        at = dspp.S(D, M(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (S(t, D, i2)) {
                        at = dspp.O(D, L(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (S(t, D, i2)) {
                        at = dspp.av(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (S(t, D, i2)) {
                        at = dspp.au(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (S(t, D, i2)) {
                        at = dspp.as(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (S(t, D, i2)) {
                        Object l2 = dsui.l(t, I);
                        if (l2 instanceof dspd) {
                            at = dspp.W(D, (dspd) l2);
                        } else {
                            at = dspp.V(D, (String) l2);
                        }
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (S(t, D, i2)) {
                        at = dstd.m(D, dsui.l(t, I), x(i2));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (S(t, D, i2)) {
                        at = dspp.W(D, (dspd) dsui.l(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (S(t, D, i2)) {
                        at = dspp.P(D, L(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (S(t, D, i2)) {
                        at = dspp.U(D, L(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (S(t, D, i2)) {
                        at = dspp.ax(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (S(t, D, i2)) {
                        at = dspp.ay(D);
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (S(t, D, i2)) {
                        at = dspp.Q(D, L(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (S(t, D, i2)) {
                        at = dspp.T(D, M(t, I));
                        i += at;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (S(t, D, i2)) {
                        at = dspp.aq(D, (dssj) dsui.l(t, I), x(i2));
                        i += at;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i + Y(this.o, t);
    }

    private static List<?> t(Object obj, long j) {
        return (List) dsui.l(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0196  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x01e1 -> B:108:0x01e2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0116 -> B:55:0x0117). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0193 -> B:88:0x0194). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int u(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, defpackage.dsol r29) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dssm.u(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, dsol):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Map, dssd] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    private final <K, V> int v(T t, byte[] bArr, int i, int i2, int i3, long j, dsol dsolVar) {
        Unsafe unsafe = b;
        Object y = y(i3);
        Object object = unsafe.getObject(t, j);
        if (dsse.c(object)) {
            Object e = dsse.e();
            dsse.d(e, object);
            unsafe.putObject(t, j, e);
            object = e;
        }
        dssb<?, ?> a2 = dsse.a(y);
        ?? r11 = (dssd) object;
        int a3 = dsom.a(bArr, i, dsolVar);
        int i4 = dsolVar.a;
        if (i4 < 0 || i4 > i2 - a3) {
            throw dsrm.a();
        }
        int i5 = a3 + i4;
        K k = a2.b;
        V v = a2.d;
        while (a3 < i5) {
            int i6 = a3 + 1;
            byte b2 = bArr[a3];
            if (b2 < 0) {
                i6 = dsom.b(b2, bArr, i6, dsolVar);
                b2 = dsolVar.a;
            }
            int i7 = b2 & 7;
            int i8 = b2 >>> 3;
            if (i8 != 1) {
                if (i8 == 2) {
                    dsur dsurVar = a2.c;
                    if (i7 == dsurVar.t) {
                        a3 = X(bArr, i6, i2, dsurVar, a2.d.getClass(), dsolVar);
                        v = dsolVar.c;
                    }
                }
                a3 = dsom.y(b2, bArr, i6, i2, dsolVar);
            } else {
                dsur dsurVar2 = a2.a;
                if (i7 == dsurVar2.t) {
                    a3 = X(bArr, i6, i2, dsurVar2, null, dsolVar);
                    k = dsolVar.c;
                } else {
                    a3 = dsom.y(b2, bArr, i6, i2, dsolVar);
                }
            }
        }
        if (a3 != i5) {
            throw dsrm.i();
        }
        r11.put(k, v);
        return i5;
    }

    private final int w(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, dsol dsolVar) {
        Unsafe unsafe = b;
        long j2 = this.c[i8 + 2] & 1048575;
        switch (i7) {
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(dsom.f(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(dsom.g(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                if (i5 == 0) {
                    int c = dsom.c(bArr, i, dsolVar);
                    unsafe.putObject(t, j, Long.valueOf(dsolVar.b));
                    unsafe.putInt(t, j2, i4);
                    return c;
                }
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                if (i5 == 0) {
                    int a2 = dsom.a(bArr, i, dsolVar);
                    unsafe.putObject(t, j, Integer.valueOf(dsolVar.a));
                    unsafe.putInt(t, j2, i4);
                    return a2;
                }
                break;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(dsom.e(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(dsom.d(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                if (i5 == 0) {
                    int c2 = dsom.c(bArr, i, dsolVar);
                    unsafe.putObject(t, j, Boolean.valueOf(dsolVar.b != 0));
                    unsafe.putInt(t, j2, i4);
                    return c2;
                }
                break;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (i5 == 2) {
                    int a3 = dsom.a(bArr, i, dsolVar);
                    int i9 = dsolVar.a;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) == 0 || dsuo.a(bArr, a3, a3 + i9)) {
                        unsafe.putObject(t, j, new String(bArr, a3, i9, dsrk.a));
                        a3 += i9;
                    } else {
                        throw dsrm.j();
                    }
                    unsafe.putInt(t, j2, i4);
                    return a3;
                }
                break;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                if (i5 == 2) {
                    int k = dsom.k(x(i8), bArr, i, i2, dsolVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, dsolVar.c);
                    } else {
                        unsafe.putObject(t, j, dsrk.g(object, dsolVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return k;
                }
                break;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                if (i5 == 2) {
                    int j3 = dsom.j(bArr, i, dsolVar);
                    unsafe.putObject(t, j, dsolVar.c);
                    unsafe.putInt(t, j2, i4);
                    return j3;
                }
                break;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                if (i5 == 0) {
                    int a4 = dsom.a(bArr, i, dsolVar);
                    int i10 = dsolVar.a;
                    dsrd z = z(i8);
                    if (z == null || z.a(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        unsafe.putInt(t, j2, i4);
                    } else {
                        g(t).e(i3, Long.valueOf(i10));
                    }
                    return a4;
                }
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                if (i5 == 0) {
                    int a5 = dsom.a(bArr, i, dsolVar);
                    unsafe.putObject(t, j, Integer.valueOf(dspj.L(dsolVar.a)));
                    unsafe.putInt(t, j2, i4);
                    return a5;
                }
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (i5 == 0) {
                    int c3 = dsom.c(bArr, i, dsolVar);
                    unsafe.putObject(t, j, Long.valueOf(dspj.M(dsolVar.b)));
                    unsafe.putInt(t, j2, i4);
                    return c3;
                }
                break;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                if (i5 == 3) {
                    int l = dsom.l(x(i8), bArr, i, i2, (i3 & (-8)) | 4, dsolVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, dsolVar.c);
                    } else {
                        unsafe.putObject(t, j, dsrk.g(object2, dsolVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return l;
                }
                break;
        }
        return i;
    }

    private final dstc x(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        dstc dstcVar = (dstc) this.d[i3];
        if (dstcVar != null) {
            return dstcVar;
        }
        dstc<T> a2 = dsst.a.a((Class) this.d[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    private final Object y(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final dsrd z(int i) {
        int i2 = i / 3;
        return (dsrd) this.d[i2 + i2 + 1];
    }

    @Override // defpackage.dstc
    public final T a() {
        return (T) ((dsqw) this.g).cu(4);
    }

    @Override // defpackage.dstc
    public final boolean b(T t, T t2) {
        boolean q;
        int length = this.c.length;
        for (int i = 0; i < length; i += 3) {
            int E = E(i);
            long I = I(E);
            switch (G(E)) {
                case 0:
                    if (O(t, t2, i) && Double.doubleToLongBits(dsui.j(t, I)) == Double.doubleToLongBits(dsui.j(t2, I))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (O(t, t2, i) && Float.floatToIntBits(dsui.h(t, I)) == Float.floatToIntBits(dsui.h(t2, I))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (O(t, t2, i) && dsui.d(t, I) == dsui.d(t2, I)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (O(t, t2, i) && dsui.d(t, I) == dsui.d(t2, I)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (O(t, t2, i) && dsui.b(t, I) == dsui.b(t2, I)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (O(t, t2, i) && dsui.d(t, I) == dsui.d(t2, I)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (O(t, t2, i) && dsui.b(t, I) == dsui.b(t2, I)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (O(t, t2, i) && dsui.f(t, I) == dsui.f(t2, I)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (O(t, t2, i) && dstd.q(dsui.l(t, I), dsui.l(t2, I))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (O(t, t2, i) && dstd.q(dsui.l(t, I), dsui.l(t2, I))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (O(t, t2, i) && dstd.q(dsui.l(t, I), dsui.l(t2, I))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (O(t, t2, i) && dsui.b(t, I) == dsui.b(t2, I)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (O(t, t2, i) && dsui.b(t, I) == dsui.b(t2, I)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (O(t, t2, i) && dsui.b(t, I) == dsui.b(t2, I)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (O(t, t2, i) && dsui.d(t, I) == dsui.d(t2, I)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (O(t, t2, i) && dsui.b(t, I) == dsui.b(t2, I)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (O(t, t2, i) && dsui.d(t, I) == dsui.d(t2, I)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (O(t, t2, i) && dstd.q(dsui.l(t, I), dsui.l(t2, I))) {
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
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case 35:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    q = dstd.q(dsui.l(t, I), dsui.l(t2, I));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    q = dstd.q(dsui.l(t, I), dsui.l(t2, I));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    long F = F(i) & 1048575;
                    if (dsui.b(t, F) == dsui.b(t2, F) && dstd.q(dsui.l(t, I), dsui.l(t2, I))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!q) {
                return false;
            }
        }
        if (!this.o.i(t).equals(this.o.i(t2))) {
            return false;
        }
        if (!this.h) {
            return true;
        }
        return this.p.b(t).equals(this.p.b(t2));
    }

    @Override // defpackage.dstc
    public final int c(T t) {
        int i;
        int c;
        int length = this.c.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int E = E(i3);
            int D = D(i3);
            long I = I(E);
            int i4 = 37;
            switch (G(E)) {
                case 0:
                    i = i2 * 53;
                    c = dsrk.c(Double.doubleToLongBits(dsui.j(t, I)));
                    i2 = i + c;
                    break;
                case 1:
                    i = i2 * 53;
                    c = Float.floatToIntBits(dsui.h(t, I));
                    i2 = i + c;
                    break;
                case 2:
                    i = i2 * 53;
                    c = dsrk.c(dsui.d(t, I));
                    i2 = i + c;
                    break;
                case 3:
                    i = i2 * 53;
                    c = dsrk.c(dsui.d(t, I));
                    i2 = i + c;
                    break;
                case 4:
                    i = i2 * 53;
                    c = dsui.b(t, I);
                    i2 = i + c;
                    break;
                case 5:
                    i = i2 * 53;
                    c = dsrk.c(dsui.d(t, I));
                    i2 = i + c;
                    break;
                case 6:
                    i = i2 * 53;
                    c = dsui.b(t, I);
                    i2 = i + c;
                    break;
                case 7:
                    i = i2 * 53;
                    c = dsrk.d(dsui.f(t, I));
                    i2 = i + c;
                    break;
                case 8:
                    i = i2 * 53;
                    c = ((String) dsui.l(t, I)).hashCode();
                    i2 = i + c;
                    break;
                case 9:
                    Object l = dsui.l(t, I);
                    if (l != null) {
                        i4 = l.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    c = dsui.l(t, I).hashCode();
                    i2 = i + c;
                    break;
                case 11:
                    i = i2 * 53;
                    c = dsui.b(t, I);
                    i2 = i + c;
                    break;
                case 12:
                    i = i2 * 53;
                    c = dsui.b(t, I);
                    i2 = i + c;
                    break;
                case 13:
                    i = i2 * 53;
                    c = dsui.b(t, I);
                    i2 = i + c;
                    break;
                case 14:
                    i = i2 * 53;
                    c = dsrk.c(dsui.d(t, I));
                    i2 = i + c;
                    break;
                case 15:
                    i = i2 * 53;
                    c = dsui.b(t, I);
                    i2 = i + c;
                    break;
                case 16:
                    i = i2 * 53;
                    c = dsrk.c(dsui.d(t, I));
                    i2 = i + c;
                    break;
                case 17:
                    Object l2 = dsui.l(t, I);
                    if (l2 != null) {
                        i4 = l2.hashCode();
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
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case 35:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    i = i2 * 53;
                    c = dsui.l(t, I).hashCode();
                    i2 = i + c;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    i = i2 * 53;
                    c = dsui.l(t, I).hashCode();
                    i2 = i + c;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = dsrk.c(Double.doubleToLongBits(J(t, I)));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = Float.floatToIntBits(K(t, I));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = dsrk.c(M(t, I));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = dsrk.c(M(t, I));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = L(t, I);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = dsrk.c(M(t, I));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = L(t, I);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = dsrk.d(N(t, I));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = ((String) dsui.l(t, I)).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = dsui.l(t, I).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = dsui.l(t, I).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = L(t, I);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = L(t, I);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = L(t, I);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = dsrk.c(M(t, I));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = L(t, I);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = dsrk.c(M(t, I));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (S(t, D, i3)) {
                        i = i2 * 53;
                        c = dsui.l(t, I).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.o.i(t).hashCode();
        return this.h ? (hashCode * 53) + this.p.b(t).hashCode() : hashCode;
    }

    @Override // defpackage.dstc
    public final int e(T t) {
        return this.j ? s(t) : r(t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        r0 = r17.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r0 >= r17.m) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        r14 = A(r18, r17.k[r0], r14, r11);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r14 == null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
        r11.k(r18, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x065a A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #3 {all -> 0x008b, blocks: (B:29:0x006e, B:169:0x0631, B:182:0x0654, B:184:0x065a, B:194:0x0679, B:195:0x067e), top: B:221:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06a4 A[LOOP:4: B:208:0x06a0->B:210:0x06a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06b1  */
    @Override // defpackage.dstc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(T r18, defpackage.dssw r19, defpackage.dsqa r20) {
        /*
            Method dump skipped, instructions count: 1862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dssm.f(java.lang.Object, dssw, dsqa):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x067a, code lost:
        if (r5 == 1048575) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x067c, code lost:
        r31.putInt(r12, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0682, code lost:
        r2 = r7.l;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0688, code lost:
        if (r2 >= r7.m) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x068a, code lost:
        r3 = (defpackage.dsty) r7.A(r12, r7.k[r2], r3, r7.o);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0699, code lost:
        if (r3 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x069b, code lost:
        r7.o.k(r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x06a0, code lost:
        if (r8 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x06a4, code lost:
        if (r0 != r37) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x06ab, code lost:
        throw defpackage.dsrm.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x06ae, code lost:
        if (r0 > r37) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x06b0, code lost:
        if (r1 != r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x06b2, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x06b8, code lost:
        throw defpackage.dsrm.i();
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0640  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(T r34, byte[] r35, int r36, int r37, int r38, defpackage.dsol r39) {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dssm.h(java.lang.Object, byte[], int, int, int, dsol):int");
    }

    @Override // defpackage.dstc
    public final void i(T t, byte[] bArr, int i, int i2, dsol dsolVar) {
        if (this.j) {
            Z(t, bArr, i, i2, dsolVar);
        } else {
            h(t, bArr, i, i2, 0, dsolVar);
        }
    }

    @Override // defpackage.dstc
    public final void j(T t) {
        int i;
        int i2 = this.l;
        while (true) {
            i = this.m;
            if (i2 >= i) {
                break;
            }
            long I = I(E(this.k[i2]));
            Object l = dsui.l(t, I);
            if (l != null) {
                ((dssd) l).b();
                dsui.m(t, I, l);
            }
            i2++;
        }
        int length = this.k.length;
        while (i < length) {
            this.n.b(t, this.k[i]);
            i++;
        }
        this.o.l(t);
        if (this.h) {
            this.p.d(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20, types: [dstc] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v8, types: [dstc] */
    @Override // defpackage.dstc
    public final boolean k(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.l) {
            int i6 = this.k[i5];
            int D = D(i6);
            int E = E(i6);
            int i7 = this.c[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = b.getInt(t, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & E) != 0 && !P(t, i6, i, i2, i9)) {
                return false;
            }
            int G = G(E);
            if (G != 9 && G != 17) {
                if (G != 27) {
                    if (G == 60 || G == 68) {
                        if (S(t, D, i6) && !B(t, E, x(i6))) {
                            return false;
                        }
                    } else if (G != 49) {
                        if (G != 50) {
                            continue;
                        } else {
                            dssd dssdVar = (dssd) dsui.l(t, I(E));
                            if (!dssdVar.isEmpty() && dsse.a(y(i6)).c.s == dsus.MESSAGE) {
                                dstc<T> dstcVar = 0;
                                for (Object obj : dssdVar.values()) {
                                    if (dstcVar == null) {
                                        dstcVar = dsst.a.a(obj.getClass());
                                    }
                                    boolean k = dstcVar.k(obj);
                                    dstcVar = dstcVar;
                                    if (!k) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                }
                List list = (List) dsui.l(t, I(E));
                if (!list.isEmpty()) {
                    ?? x = x(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!x.k(list.get(i10))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (P(t, i6, i, i2, i9) && !B(t, E, x(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.h || this.p.b(t).e();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x058c  */
    @Override // defpackage.dstc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(T r13, defpackage.dspq r14) {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dssm.n(java.lang.Object, dspq):void");
    }

    @Override // defpackage.dstc
    public final void d(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int E = E(i);
            long I = I(E);
            int D = D(i);
            switch (G(E)) {
                case 0:
                    if (Q(t2, i)) {
                        dsui.k(t, I, dsui.j(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (Q(t2, i)) {
                        dsui.i(t, I, dsui.h(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (Q(t2, i)) {
                        dsui.e(t, I, dsui.d(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (Q(t2, i)) {
                        dsui.e(t, I, dsui.d(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (Q(t2, i)) {
                        dsui.c(t, I, dsui.b(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (Q(t2, i)) {
                        dsui.e(t, I, dsui.d(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (Q(t2, i)) {
                        dsui.c(t, I, dsui.b(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (Q(t2, i)) {
                        dsui.g(t, I, dsui.f(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (Q(t2, i)) {
                        dsui.m(t, I, dsui.l(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    p(t, t2, i);
                    break;
                case 10:
                    if (Q(t2, i)) {
                        dsui.m(t, I, dsui.l(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (Q(t2, i)) {
                        dsui.c(t, I, dsui.b(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (Q(t2, i)) {
                        dsui.c(t, I, dsui.b(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (Q(t2, i)) {
                        dsui.c(t, I, dsui.b(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (Q(t2, i)) {
                        dsui.e(t, I, dsui.d(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (Q(t2, i)) {
                        dsui.c(t, I, dsui.b(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (Q(t2, i)) {
                        dsui.e(t, I, dsui.d(t2, I));
                        R(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    p(t, t2, i);
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
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case 35:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    this.n.c(t, t2, I);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    dstd.Y(t, t2, I);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (S(t2, D, i)) {
                        dsui.m(t, I, dsui.l(t2, I));
                        T(t, D, i);
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    q(t, t2, i);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (S(t2, D, i)) {
                        dsui.m(t, I, dsui.l(t2, I));
                        T(t, D, i);
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    q(t, t2, i);
                    break;
            }
        }
        dstd.s(this.o, t, t2);
        if (this.h) {
            dstd.r(this.p, t, t2);
        }
    }
}
