package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bakz  reason: default package */
/* loaded from: classes2.dex */
public final class bakz {
    private final ArrayList a = new ArrayList();
    private Object b;

    private final Object E() {
        Object obj = this.b;
        if (obj == null) {
            if (this.a.size() == 2) {
                Object obj2 = this.a.get(0);
                Object obj3 = this.a.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new bakm(this.a);
            }
            this.b = obj;
        }
        return obj;
    }

    private static final boolean F(Object obj) {
        if (obj instanceof bala) {
            return !(obj instanceof bakm) || ((bakm) obj).b != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(StringBuffer stringBuffer, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                stringBuffer.append((char) 65533);
            } else {
                return;
            }
        }
    }

    public final void A(int i) {
        l(bahp.w, i, 2);
    }

    public final void B(int i) {
        l(bahp.m, i, 2);
    }

    public final void C(int i, int i2) {
        r(bahp.l, i, i2);
    }

    public final void D(int i, int i2) {
        r(bahp.g, i, i2);
    }

    public final bakk a() {
        Object E = E();
        bala balaVar = null;
        bale baleVar = (!(E instanceof bale) || ((E instanceof bakm) && ((bakm) E).a == null)) ? null : (bale) E;
        if (F(E)) {
            balaVar = (bala) E;
        }
        if (baleVar != null || balaVar != null) {
            return new bakk(baleVar, balaVar);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
    }

    public final bala b() {
        Object E = E();
        if (F(E)) {
            return (bala) E;
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public final void d(Object obj) {
        this.b = null;
        this.a.add(obj);
        this.a.add(obj);
    }

    public final void e(bale baleVar, bala balaVar) {
        this.b = null;
        this.a.add(baleVar);
        this.a.add(balaVar);
    }

    public final void f(bahp bahpVar) {
        d(new bakt(bahpVar, true));
    }

    public final void g(bahp bahpVar) {
        d(new bakt(bahpVar, false));
    }

    public final void h(boolean z) {
        d(new bakw(null, "Z", z, 2));
    }

    public final void i(bakk bakkVar) {
        if (bakkVar == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        e(bakkVar.a, bakkVar.b);
    }

    public final void j(bala balaVar) {
        e(null, balaVar);
    }

    public final void k(bala[] balaVarArr) {
        int length = balaVarArr.length;
        bala[] balaVarArr2 = new bala[length];
        int i = 0;
        while (i < length - 1) {
            bala balaVar = balaVarArr[i];
            balaVarArr2[i] = balaVar;
            if (balaVar == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            i++;
        }
        balaVarArr2[i] = balaVarArr[i];
        e(null, new bakp(balaVarArr2));
    }

    public final void l(bahp bahpVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        if (i <= 1) {
            d(new baky(bahpVar, i2, false));
        } else {
            d(new bakr(bahpVar, i2, false, i));
        }
    }

    public final void m(bahp bahpVar, int i) {
        d(new bakn(bahpVar, i));
    }

    public final void n(bahp bahpVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        d(new bako(bahpVar, i, i2));
    }

    public final void o(char c) {
        d(new bakl(c));
    }

    public final void p(String str) {
        int length = str.length();
        if (length != 0) {
            if (length == 1) {
                d(new bakl(str.charAt(0)));
            } else {
                d(new baks(str));
            }
        }
    }

    public final void r(bahp bahpVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        if (i <= 1) {
            d(new baky(bahpVar, i2, true));
        } else {
            d(new bakr(bahpVar, i2, true, i));
        }
    }

    public final void s(String str, boolean z, int i) {
        d(new bakw(str, str, z, i));
    }

    public final void t(int i) {
        l(bahp.j, i, 2);
    }

    public final void u(int i) {
        l(bahp.n, i, 1);
    }

    public final void v(int i) {
        l(bahp.h, i, 3);
    }

    public final void w(int i, int i2) {
        n(bahp.v, i, i2);
    }

    public final void x(int i) {
        l(bahp.s, i, 2);
    }

    public final void y(int i) {
        l(bahp.u, i, 2);
    }

    public final void z(int i) {
        l(bahp.i, i, 2);
    }

    public final void q(bala balaVar) {
        if (balaVar != null) {
            e(null, new bakp(new bala[]{balaVar, null}));
            return;
        }
        throw new IllegalArgumentException("No parser supplied");
    }
}
