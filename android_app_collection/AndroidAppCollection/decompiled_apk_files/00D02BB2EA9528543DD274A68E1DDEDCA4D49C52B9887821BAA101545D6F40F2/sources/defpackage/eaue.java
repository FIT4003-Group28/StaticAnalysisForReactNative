package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: eaue  reason: default package */
/* loaded from: classes.dex */
public final class eaue {
    private final ArrayList<Object> a = new ArrayList<>();
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
                obj = new eatr(this.a);
            }
            this.b = obj;
        }
        return obj;
    }

    private static final boolean F(Object obj) {
        if (obj instanceof eauf) {
            return !(obj instanceof eatr) || ((eatr) obj).b != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(StringBuffer stringBuffer, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                stringBuffer.append((char) 65533);
            } else {
                return;
            }
        }
    }

    public final void C(eaop eaopVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        if (i <= 1) {
            o(new eaud(eaopVar, i2, true));
        } else {
            o(new eatw(eaopVar, i2, true, i));
        }
    }

    public final void D(String str, boolean z, int i) {
        o(new eaub(str, str, z, i));
    }

    public final eatp a() {
        Object E = E();
        eauf eaufVar = null;
        eauj eaujVar = (!(E instanceof eauj) || ((E instanceof eatr) && ((eatr) E).a == null)) ? null : (eauj) E;
        if (F(E)) {
            eaufVar = (eauf) E;
        }
        if (eaujVar != null || eaufVar != null) {
            return new eatp(eaujVar, eaufVar);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
    }

    public final eauf b() {
        Object E = E();
        if (F(E)) {
            return (eauf) E;
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public final eaue c(int i, int i2) {
        y(eaop.v, i, i2);
        return this;
    }

    public final eaue d(int i) {
        w(eaop.w, i, 2);
        return this;
    }

    public final eaue e(int i) {
        w(eaop.u, i, 2);
        return this;
    }

    public final eaue f(int i) {
        w(eaop.s, i, 2);
        return this;
    }

    public final eaue g(int i) {
        w(eaop.n, i, 1);
        return this;
    }

    public final eaue h(int i) {
        w(eaop.j, i, 2);
        return this;
    }

    public final eaue i(int i) {
        w(eaop.h, i, 3);
        return this;
    }

    public final eaue j(int i) {
        w(eaop.m, i, 2);
        return this;
    }

    public final eaue k(int i, int i2) {
        C(eaop.l, i, i2);
        return this;
    }

    public final eaue l(int i) {
        w(eaop.i, i, 2);
        return this;
    }

    public final eaue m(int i, int i2) {
        C(eaop.g, i, i2);
        return this;
    }

    public final void o(Object obj) {
        this.b = null;
        this.a.add(obj);
        this.a.add(obj);
    }

    public final void p(eauj eaujVar, eauf eaufVar) {
        this.b = null;
        this.a.add(eaujVar);
        this.a.add(eaufVar);
    }

    public final void q(eaop eaopVar) {
        o(new eaty(eaopVar, true));
    }

    public final void r(eaop eaopVar) {
        o(new eaty(eaopVar, false));
    }

    public final void s(boolean z) {
        o(new eaub(null, "Z", z, 2));
    }

    public final void t(eatp eatpVar) {
        if (eatpVar == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        p(eatpVar.a, eatpVar.b);
    }

    public final void u(eauf eaufVar) {
        p(null, eaufVar);
    }

    public final void v(eauf[] eaufVarArr) {
        int length = eaufVarArr.length;
        eauf[] eaufVarArr2 = new eauf[length];
        int i = 0;
        while (i < length - 1) {
            eauf eaufVar = eaufVarArr[i];
            eaufVarArr2[i] = eaufVar;
            if (eaufVar == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            i++;
        }
        eaufVarArr2[i] = eaufVarArr[i];
        p(null, new eatu(eaufVarArr2));
    }

    public final void w(eaop eaopVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        if (i <= 1) {
            o(new eaud(eaopVar, i2, false));
        } else {
            o(new eatw(eaopVar, i2, false, i));
        }
    }

    public final void x(eaop eaopVar, int i) {
        o(new eats(eaopVar, i));
    }

    public final void y(eaop eaopVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        o(new eatt(eaopVar, i, i2));
    }

    public final void z(char c) {
        o(new eatq(c));
    }

    public final void A(String str) {
        int length = str.length();
        if (length != 0) {
            if (length == 1) {
                o(new eatq(str.charAt(0)));
            } else {
                o(new eatx(str));
            }
        }
    }

    public final void B(eauf eaufVar) {
        if (eaufVar != null) {
            p(null, new eatu(new eauf[]{eaufVar, null}));
            return;
        }
        throw new IllegalArgumentException("No parser supplied");
    }
}
