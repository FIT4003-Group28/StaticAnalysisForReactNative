package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aoyt  reason: default package */
/* loaded from: classes.dex */
public final class aoyt {
    public static int A(byte[] bArr, int i, aopu aopuVar, aonp aonpVar) {
        aoqj aoqjVar = (aoqj) aopuVar;
        int E = E(bArr, i, aonpVar);
        int i2 = aonpVar.a + E;
        while (E < i2) {
            E = H(bArr, E, aonpVar);
            aoqjVar.f(aonpVar.b);
        }
        if (E == i2) {
            return E;
        }
        throw aopx.j();
    }

    public static int B(byte[] bArr, int i, aonp aonpVar) {
        int E = E(bArr, i, aonpVar);
        int i2 = aonpVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                aonpVar.c = "";
                return E;
            }
            aonpVar.c = new String(bArr, E, i2, aopv.a);
            return E + i2;
        }
        throw aopx.f();
    }

    public static int C(byte[] bArr, int i, aonp aonpVar) {
        int E = E(bArr, i, aonpVar);
        int i2 = aonpVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                aonpVar.c = "";
                return E;
            }
            aonpVar.c = aosi.g(bArr, E, i2);
            return E + i2;
        }
        throw aopx.f();
    }

    public static int D(int i, byte[] bArr, int i2, int i3, aory aoryVar, aonp aonpVar) {
        if (aosl.a(i) != 0) {
            int b = aosl.b(i);
            if (b == 0) {
                int H = H(bArr, i2, aonpVar);
                aoryVar.f(i, Long.valueOf(aonpVar.b));
                return H;
            } else if (b == 1) {
                aoryVar.f(i, Long.valueOf(J(bArr, i2)));
                return i2 + 8;
            } else if (b == 2) {
                int E = E(bArr, i2, aonpVar);
                int i4 = aonpVar.a;
                if (i4 < 0) {
                    throw aopx.f();
                }
                if (i4 > bArr.length - E) {
                    throw aopx.j();
                }
                if (i4 == 0) {
                    aoryVar.f(i, aoob.b);
                } else {
                    aoryVar.f(i, aoob.y(bArr, E, i4));
                }
                return E + i4;
            } else if (b != 3) {
                if (b == 5) {
                    aoryVar.f(i, Integer.valueOf(o(bArr, i2)));
                    return i2 + 4;
                }
                throw aopx.c();
            } else {
                int i5 = (i & (-8)) | 4;
                aory c = aory.c();
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int E2 = E(bArr, i2, aonpVar);
                    int i7 = aonpVar.a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = E2;
                        break;
                    }
                    i6 = i7;
                    i2 = D(i7, bArr, E2, i3, c, aonpVar);
                }
                if (i2 > i3 || i6 != i5) {
                    throw aopx.g();
                }
                aoryVar.f(i, c);
                return i2;
            }
        }
        throw aopx.c();
    }

    public static int E(byte[] bArr, int i, aonp aonpVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            aonpVar.a = b;
            return i2;
        }
        return F(b, bArr, i2, aonpVar);
    }

    public static int F(int i, byte[] bArr, int i2, aonp aonpVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aonpVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aonpVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aonpVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aonpVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                aonpVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int G(int i, byte[] bArr, int i2, int i3, aopu aopuVar, aonp aonpVar) {
        aopj aopjVar = (aopj) aopuVar;
        int E = E(bArr, i2, aonpVar);
        aopjVar.g(aonpVar.a);
        while (E < i3) {
            int E2 = E(bArr, E, aonpVar);
            if (i != aonpVar.a) {
                break;
            }
            E = E(bArr, E2, aonpVar);
            aopjVar.g(aonpVar.a);
        }
        return E;
    }

    public static int H(byte[] bArr, int i, aonp aonpVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            aonpVar.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        aonpVar.b = j2;
        return i3;
    }

    public static int I(int i, byte[] bArr, int i2, int i3, aonp aonpVar) {
        if (aosl.a(i) != 0) {
            int b = aosl.b(i);
            if (b == 0) {
                return H(bArr, i2, aonpVar);
            }
            if (b == 1) {
                return i2 + 8;
            }
            if (b == 2) {
                return E(bArr, i2, aonpVar) + aonpVar.a;
            }
            if (b != 3) {
                if (b != 5) {
                    throw aopx.c();
                }
                return i2 + 4;
            }
            int i4 = (i & (-8)) | 4;
            int i5 = 0;
            while (i2 < i3) {
                i2 = E(bArr, i2, aonpVar);
                i5 = aonpVar.a;
                if (i5 == i4) {
                    break;
                }
                i2 = I(i5, bArr, i2, i3, aonpVar);
            }
            if (i2 <= i3 && i5 == i4) {
                return i2;
            }
            throw aopx.g();
        }
        throw aopx.c();
    }

    public static long J(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int K(String str, int i) {
        while (i < str.length() && str.charAt(i) != '-') {
            i++;
        }
        return i;
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int d(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int e(Map.Entry entry) {
        return ((aopf) entry.getKey()).b;
    }

    public static aoov f(Object obj) {
        return ((aopd) obj).l;
    }

    public static aoov g(Object obj) {
        return ((aopd) obj).d();
    }

    public static void h(aorh aorhVar, Object obj, aoos aoosVar, aoov aoovVar) {
        aopg aopgVar = (aopg) obj;
        aoovVar.n(aopgVar.d, aorhVar.t(aopgVar.c.getClass(), aoosVar));
    }

    public static void i(aoom aoomVar, Map.Entry entry) {
        aopf aopfVar = (aopf) entry.getKey();
        if (aopfVar.d) {
            aosj aosjVar = aosj.DOUBLE;
            switch (aopfVar.c.ordinal()) {
                case 0:
                    aorn.D(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 1:
                    aorn.H(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 2:
                    aorn.K(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 3:
                    aorn.S(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 4:
                    aorn.J(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 5:
                    aorn.G(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 6:
                    aorn.F(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 7:
                    aorn.B(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 8:
                    aorn.Q(aopfVar.b, (List) entry.getValue(), aoomVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    aorn.I(aopfVar.b, (List) entry.getValue(), aoomVar, aore.a.a(list.get(0).getClass()));
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    aorn.L(aopfVar.b, (List) entry.getValue(), aoomVar, aore.a.a(list2.get(0).getClass()));
                    return;
                case 11:
                    aorn.C(aopfVar.b, (List) entry.getValue(), aoomVar);
                    return;
                case 12:
                    aorn.R(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 13:
                    aorn.J(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 14:
                    aorn.M(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 15:
                    aorn.N(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 16:
                    aorn.O(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                case 17:
                    aorn.P(aopfVar.b, (List) entry.getValue(), aoomVar, aopfVar.e);
                    return;
                default:
                    return;
            }
        }
        aosj aosjVar2 = aosj.DOUBLE;
        switch (aopfVar.c.ordinal()) {
            case 0:
                aoomVar.c(aopfVar.b, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                aoomVar.g(aopfVar.b, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                aoomVar.j(aopfVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                aoomVar.s(aopfVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                aoomVar.i(aopfVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                aoomVar.f(aopfVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                aoomVar.e(aopfVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                aoomVar.a(aopfVar.b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                aoomVar.q(aopfVar.b, (String) entry.getValue());
                return;
            case 9:
                aoomVar.h(aopfVar.b, entry.getValue(), aore.a.a(entry.getValue().getClass()));
                return;
            case 10:
                aoomVar.k(aopfVar.b, entry.getValue(), aore.a.a(entry.getValue().getClass()));
                return;
            case 11:
                aoomVar.b(aopfVar.b, (aoob) entry.getValue());
                return;
            case 12:
                aoomVar.r(aopfVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                aoomVar.i(aopfVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                aoomVar.m(aopfVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                aoomVar.n(aopfVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                aoomVar.o(aopfVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                aoomVar.p(aopfVar.b, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    public static final void j(Object obj) {
        f(obj).f();
    }

    public static final aoob k(aool aoolVar, byte[] bArr) {
        aoolVar.an();
        return new aonz(bArr);
    }

    public static double l(byte[] bArr, int i) {
        return Double.longBitsToDouble(J(bArr, i));
    }

    public static float m(byte[] bArr, int i) {
        return Float.intBitsToFloat(o(bArr, i));
    }

    public static int n(byte[] bArr, int i, aonp aonpVar) {
        int E = E(bArr, i, aonpVar);
        int i2 = aonpVar.a;
        if (i2 < 0) {
            throw aopx.f();
        }
        if (i2 > bArr.length - E) {
            throw aopx.j();
        }
        if (i2 == 0) {
            aonpVar.c = aoob.b;
            return E;
        }
        aonpVar.c = aoob.y(bArr, E, i2);
        return E + i2;
    }

    public static int o(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int p(aorm aormVar, byte[] bArr, int i, int i2, int i3, aonp aonpVar) {
        aoqw aoqwVar = (aoqw) aormVar;
        Object e = aoqwVar.e();
        int c = aoqwVar.c(e, bArr, i, i2, i3, aonpVar);
        aoqwVar.f(e);
        aonpVar.c = e;
        return c;
    }

    public static int q(aorm aormVar, byte[] bArr, int i, int i2, aonp aonpVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = F(i4, bArr, i3, aonpVar);
            i4 = aonpVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw aopx.j();
        }
        Object e = aormVar.e();
        int i6 = i4 + i5;
        aormVar.i(e, bArr, i5, i6, aonpVar);
        aormVar.f(e);
        aonpVar.c = e;
        return i6;
    }

    public static int r(aorm aormVar, int i, byte[] bArr, int i2, int i3, aopu aopuVar, aonp aonpVar) {
        int q = q(aormVar, bArr, i2, i3, aonpVar);
        aopuVar.add(aonpVar.c);
        while (q < i3) {
            int E = E(bArr, q, aonpVar);
            if (i != aonpVar.a) {
                break;
            }
            q = q(aormVar, bArr, E, i3, aonpVar);
            aopuVar.add(aonpVar.c);
        }
        return q;
    }

    public static int s(byte[] bArr, int i, aopu aopuVar, aonp aonpVar) {
        aons aonsVar = (aons) aopuVar;
        int E = E(bArr, i, aonpVar);
        int i2 = aonpVar.a + E;
        while (E < i2) {
            E = H(bArr, E, aonpVar);
            aonsVar.f(aonpVar.b != 0);
        }
        if (E == i2) {
            return E;
        }
        throw aopx.j();
    }

    public static int t(byte[] bArr, int i, aopu aopuVar, aonp aonpVar) {
        aoon aoonVar = (aoon) aopuVar;
        int E = E(bArr, i, aonpVar);
        int i2 = aonpVar.a + E;
        while (E < i2) {
            aoonVar.f(l(bArr, E));
            E += 8;
        }
        if (E == i2) {
            return E;
        }
        throw aopx.j();
    }

    public static int u(byte[] bArr, int i, aopu aopuVar, aonp aonpVar) {
        aopj aopjVar = (aopj) aopuVar;
        int E = E(bArr, i, aonpVar);
        int i2 = aonpVar.a + E;
        while (E < i2) {
            aopjVar.g(o(bArr, E));
            E += 4;
        }
        if (E == i2) {
            return E;
        }
        throw aopx.j();
    }

    public static int v(byte[] bArr, int i, aopu aopuVar, aonp aonpVar) {
        aoqj aoqjVar = (aoqj) aopuVar;
        int E = E(bArr, i, aonpVar);
        int i2 = aonpVar.a + E;
        while (E < i2) {
            aoqjVar.f(J(bArr, E));
            E += 8;
        }
        if (E == i2) {
            return E;
        }
        throw aopx.j();
    }

    public static int w(byte[] bArr, int i, aopu aopuVar, aonp aonpVar) {
        aooy aooyVar = (aooy) aopuVar;
        int E = E(bArr, i, aonpVar);
        int i2 = aonpVar.a + E;
        while (E < i2) {
            aooyVar.h(m(bArr, E));
            E += 4;
        }
        if (E == i2) {
            return E;
        }
        throw aopx.j();
    }

    public static int x(byte[] bArr, int i, aopu aopuVar, aonp aonpVar) {
        aopj aopjVar = (aopj) aopuVar;
        int E = E(bArr, i, aonpVar);
        int i2 = aonpVar.a + E;
        while (E < i2) {
            E = E(bArr, E, aonpVar);
            aopjVar.g(aoog.J(aonpVar.a));
        }
        if (E == i2) {
            return E;
        }
        throw aopx.j();
    }

    public static int y(byte[] bArr, int i, aopu aopuVar, aonp aonpVar) {
        aoqj aoqjVar = (aoqj) aopuVar;
        int E = E(bArr, i, aonpVar);
        int i2 = aonpVar.a + E;
        while (E < i2) {
            E = H(bArr, E, aonpVar);
            aoqjVar.f(aoog.L(aonpVar.b));
        }
        if (E == i2) {
            return E;
        }
        throw aopx.j();
    }

    public static int z(byte[] bArr, int i, aopu aopuVar, aonp aonpVar) {
        aopj aopjVar = (aopj) aopuVar;
        int E = E(bArr, i, aonpVar);
        int i2 = aonpVar.a + E;
        while (E < i2) {
            E = E(bArr, E, aonpVar);
            aopjVar.g(aonpVar.a);
        }
        if (E == i2) {
            return E;
        }
        throw aopx.j();
    }
}
