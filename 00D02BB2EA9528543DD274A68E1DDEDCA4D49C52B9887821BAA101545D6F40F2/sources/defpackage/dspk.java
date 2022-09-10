package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dspk  reason: default package */
/* loaded from: classes.dex */
public final class dspk implements dssw {
    private final dspj a;
    private int b;
    private int c;
    private int d = 0;

    private dspk(dspj dspjVar) {
        dsrk.i(dspjVar, "input");
        this.a = dspjVar;
        dspjVar.d = this;
    }

    private final void U(int i) {
        if (dsut.a(this.b) == i) {
            return;
        }
        throw dsrm.f();
    }

    private final <T> T V(dstc<T> dstcVar, dsqa dsqaVar) {
        dspj dspjVar;
        int q = this.a.q();
        dspj dspjVar2 = this.a;
        if (dspjVar2.a >= 100) {
            throw dsrm.g();
        }
        int B = dspjVar2.B(q);
        T a = dstcVar.a();
        this.a.a++;
        dstcVar.f(a, this, dsqaVar);
        dstcVar.j(a);
        this.a.b(0);
        dspjVar.a--;
        this.a.C(B);
        return a;
    }

    private final <T> T W(dstc<T> dstcVar, dsqa dsqaVar) {
        int i = this.c;
        this.c = dsut.c(dsut.b(this.b), 4);
        try {
            T a = dstcVar.a();
            dstcVar.f(a, this, dsqaVar);
            dstcVar.j(a);
            if (this.b == this.c) {
                return a;
            }
            throw dsrm.i();
        } finally {
            this.c = i;
        }
    }

    private final Object X(dsur dsurVar, Class<?> cls, dsqa dsqaVar) {
        dsur dsurVar2 = dsur.DOUBLE;
        switch (dsurVar.ordinal()) {
            case 0:
                return Double.valueOf(d());
            case 1:
                return Float.valueOf(e());
            case 2:
                return Long.valueOf(g());
            case 3:
                return Long.valueOf(f());
            case 4:
                return Integer.valueOf(h());
            case 5:
                return Long.valueOf(i());
            case 6:
                return Integer.valueOf(j());
            case 7:
                return Boolean.valueOf(k());
            case 8:
                return m();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return o(cls, dsqaVar);
            case 11:
                return s();
            case 12:
                return Integer.valueOf(t());
            case 13:
                return Integer.valueOf(u());
            case 14:
                return Integer.valueOf(v());
            case 15:
                return Long.valueOf(w());
            case 16:
                return Integer.valueOf(x());
            case 17:
                return Long.valueOf(y());
        }
    }

    private final void Y(int i) {
        if (this.a.E() == i) {
            return;
        }
        throw dsrm.a();
    }

    private static final void Z(int i) {
        if ((i & 3) == 0) {
            return;
        }
        throw dsrm.i();
    }

    private static final void aa(int i) {
        if ((i & 7) == 0) {
            return;
        }
        throw dsrm.i();
    }

    public static dspk n(dspj dspjVar) {
        dspk dspkVar = dspjVar.d;
        return dspkVar != null ? dspkVar : new dspk(dspjVar);
    }

    @Override // defpackage.dssw
    public final void A(List<Float> list) {
        int a;
        int a2;
        if (!(list instanceof dsqk)) {
            int a3 = dsut.a(this.b);
            if (a3 == 2) {
                int q = this.a.q();
                Z(q);
                int E = this.a.E() + q;
                do {
                    list.add(Float.valueOf(this.a.e()));
                } while (this.a.E() < E);
                return;
            } else if (a3 != 5) {
                throw dsrm.f();
            } else {
                do {
                    list.add(Float.valueOf(this.a.e()));
                    if (this.a.D()) {
                        return;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            }
        }
        dsqk dsqkVar = (dsqk) list;
        int a4 = dsut.a(this.b);
        if (a4 == 2) {
            int q2 = this.a.q();
            Z(q2);
            int E2 = this.a.E() + q2;
            do {
                dsqkVar.g(this.a.e());
            } while (this.a.E() < E2);
        } else if (a4 != 5) {
            throw dsrm.f();
        } else {
            do {
                dsqkVar.g(this.a.e());
                if (this.a.D()) {
                    return;
                }
                a2 = this.a.a();
            } while (a2 == this.b);
            this.d = a2;
        }
    }

    @Override // defpackage.dssw
    public final void B(List<Long> list) {
        int a;
        int a2;
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            int a3 = dsut.a(this.b);
            if (a3 == 0) {
                do {
                    dsrxVar.d(this.a.f());
                    if (this.a.D()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int E = this.a.E() + this.a.q();
                do {
                    dsrxVar.d(this.a.f());
                } while (this.a.E() < E);
                Y(E);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a4 = dsut.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Long.valueOf(this.a.f()));
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int E2 = this.a.E() + this.a.q();
            do {
                list.add(Long.valueOf(this.a.f()));
            } while (this.a.E() < E2);
            Y(E2);
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void C(List<Long> list) {
        int a;
        int a2;
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            int a3 = dsut.a(this.b);
            if (a3 == 0) {
                do {
                    dsrxVar.d(this.a.g());
                    if (this.a.D()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int E = this.a.E() + this.a.q();
                do {
                    dsrxVar.d(this.a.g());
                } while (this.a.E() < E);
                Y(E);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a4 = dsut.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Long.valueOf(this.a.g()));
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int E2 = this.a.E() + this.a.q();
            do {
                list.add(Long.valueOf(this.a.g()));
            } while (this.a.E() < E2);
            Y(E2);
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void D(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof dsqz) {
            dsqz dsqzVar = (dsqz) list;
            int a3 = dsut.a(this.b);
            if (a3 == 0) {
                do {
                    dsqzVar.h(this.a.h());
                    if (this.a.D()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int E = this.a.E() + this.a.q();
                do {
                    dsqzVar.h(this.a.h());
                } while (this.a.E() < E);
                Y(E);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a4 = dsut.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Integer.valueOf(this.a.h()));
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int E2 = this.a.E() + this.a.q();
            do {
                list.add(Integer.valueOf(this.a.h()));
            } while (this.a.E() < E2);
            Y(E2);
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void E(List<Long> list) {
        int a;
        int a2;
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            int a3 = dsut.a(this.b);
            if (a3 == 1) {
                do {
                    dsrxVar.d(this.a.i());
                    if (this.a.D()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int q = this.a.q();
                aa(q);
                int E = this.a.E() + q;
                do {
                    dsrxVar.d(this.a.i());
                } while (this.a.E() < E);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a4 = dsut.a(this.b);
        if (a4 == 1) {
            do {
                list.add(Long.valueOf(this.a.i()));
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int q2 = this.a.q();
            aa(q2);
            int E2 = this.a.E() + q2;
            do {
                list.add(Long.valueOf(this.a.i()));
            } while (this.a.E() < E2);
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void F(List<Integer> list) {
        int a;
        int a2;
        if (!(list instanceof dsqz)) {
            int a3 = dsut.a(this.b);
            if (a3 == 2) {
                int q = this.a.q();
                Z(q);
                int E = this.a.E() + q;
                do {
                    list.add(Integer.valueOf(this.a.j()));
                } while (this.a.E() < E);
                return;
            } else if (a3 != 5) {
                throw dsrm.f();
            } else {
                do {
                    list.add(Integer.valueOf(this.a.j()));
                    if (this.a.D()) {
                        return;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            }
        }
        dsqz dsqzVar = (dsqz) list;
        int a4 = dsut.a(this.b);
        if (a4 == 2) {
            int q2 = this.a.q();
            Z(q2);
            int E2 = this.a.E() + q2;
            do {
                dsqzVar.h(this.a.j());
            } while (this.a.E() < E2);
        } else if (a4 != 5) {
            throw dsrm.f();
        } else {
            do {
                dsqzVar.h(this.a.j());
                if (this.a.D()) {
                    return;
                }
                a2 = this.a.a();
            } while (a2 == this.b);
            this.d = a2;
        }
    }

    @Override // defpackage.dssw
    public final void G(List<Boolean> list) {
        int a;
        int a2;
        if (list instanceof dsoq) {
            dsoq dsoqVar = (dsoq) list;
            int a3 = dsut.a(this.b);
            if (a3 == 0) {
                do {
                    dsoqVar.d(this.a.k());
                    if (this.a.D()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int E = this.a.E() + this.a.q();
                do {
                    dsoqVar.d(this.a.k());
                } while (this.a.E() < E);
                Y(E);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a4 = dsut.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Boolean.valueOf(this.a.k()));
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int E2 = this.a.E() + this.a.q();
            do {
                list.add(Boolean.valueOf(this.a.k()));
            } while (this.a.E() < E2);
            Y(E2);
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void H(List<String> list) {
        J(list, false);
    }

    @Override // defpackage.dssw
    public final void I(List<String> list) {
        J(list, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dssw
    public final <T> void K(List<T> list, dstc<T> dstcVar, dsqa dsqaVar) {
        int a;
        if (dsut.a(this.b) == 2) {
            int i = this.b;
            do {
                list.add(V(dstcVar, dsqaVar));
                if (this.a.D() || this.d != 0) {
                    return;
                }
                a = this.a.a();
            } while (a == i);
            this.d = a;
            return;
        }
        throw dsrm.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dssw
    public final <T> void L(List<T> list, dstc<T> dstcVar, dsqa dsqaVar) {
        int a;
        if (dsut.a(this.b) == 3) {
            int i = this.b;
            do {
                list.add(W(dstcVar, dsqaVar));
                if (this.a.D() || this.d != 0) {
                    return;
                }
                a = this.a.a();
            } while (a == i);
            this.d = a;
            return;
        }
        throw dsrm.f();
    }

    @Override // defpackage.dssw
    public final void M(List<dspd> list) {
        int a;
        if (dsut.a(this.b) == 2) {
            do {
                list.add(s());
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
            return;
        }
        throw dsrm.f();
    }

    @Override // defpackage.dssw
    public final void N(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof dsqz) {
            dsqz dsqzVar = (dsqz) list;
            int a3 = dsut.a(this.b);
            if (a3 == 0) {
                do {
                    dsqzVar.h(this.a.q());
                    if (this.a.D()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int E = this.a.E() + this.a.q();
                do {
                    dsqzVar.h(this.a.q());
                } while (this.a.E() < E);
                Y(E);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a4 = dsut.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Integer.valueOf(this.a.q()));
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int E2 = this.a.E() + this.a.q();
            do {
                list.add(Integer.valueOf(this.a.q()));
            } while (this.a.E() < E2);
            Y(E2);
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void O(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof dsqz) {
            dsqz dsqzVar = (dsqz) list;
            int a3 = dsut.a(this.b);
            if (a3 == 0) {
                do {
                    dsqzVar.h(this.a.r());
                    if (this.a.D()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int E = this.a.E() + this.a.q();
                do {
                    dsqzVar.h(this.a.r());
                } while (this.a.E() < E);
                Y(E);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a4 = dsut.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Integer.valueOf(this.a.r()));
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int E2 = this.a.E() + this.a.q();
            do {
                list.add(Integer.valueOf(this.a.r()));
            } while (this.a.E() < E2);
            Y(E2);
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void P(List<Integer> list) {
        int a;
        int a2;
        if (!(list instanceof dsqz)) {
            int a3 = dsut.a(this.b);
            if (a3 == 2) {
                int q = this.a.q();
                Z(q);
                int E = this.a.E() + q;
                do {
                    list.add(Integer.valueOf(this.a.s()));
                } while (this.a.E() < E);
                return;
            } else if (a3 != 5) {
                throw dsrm.f();
            } else {
                do {
                    list.add(Integer.valueOf(this.a.s()));
                    if (this.a.D()) {
                        return;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            }
        }
        dsqz dsqzVar = (dsqz) list;
        int a4 = dsut.a(this.b);
        if (a4 == 2) {
            int q2 = this.a.q();
            Z(q2);
            int E2 = this.a.E() + q2;
            do {
                dsqzVar.h(this.a.s());
            } while (this.a.E() < E2);
        } else if (a4 != 5) {
            throw dsrm.f();
        } else {
            do {
                dsqzVar.h(this.a.s());
                if (this.a.D()) {
                    return;
                }
                a2 = this.a.a();
            } while (a2 == this.b);
            this.d = a2;
        }
    }

    @Override // defpackage.dssw
    public final void Q(List<Long> list) {
        int a;
        int a2;
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            int a3 = dsut.a(this.b);
            if (a3 == 1) {
                do {
                    dsrxVar.d(this.a.t());
                    if (this.a.D()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int q = this.a.q();
                aa(q);
                int E = this.a.E() + q;
                do {
                    dsrxVar.d(this.a.t());
                } while (this.a.E() < E);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a4 = dsut.a(this.b);
        if (a4 == 1) {
            do {
                list.add(Long.valueOf(this.a.t()));
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int q2 = this.a.q();
            aa(q2);
            int E2 = this.a.E() + q2;
            do {
                list.add(Long.valueOf(this.a.t()));
            } while (this.a.E() < E2);
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void R(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof dsqz) {
            dsqz dsqzVar = (dsqz) list;
            int a3 = dsut.a(this.b);
            if (a3 == 0) {
                do {
                    dsqzVar.h(this.a.u());
                    if (this.a.D()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int E = this.a.E() + this.a.q();
                do {
                    dsqzVar.h(this.a.u());
                } while (this.a.E() < E);
                Y(E);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a4 = dsut.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Integer.valueOf(this.a.u()));
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int E2 = this.a.E() + this.a.q();
            do {
                list.add(Integer.valueOf(this.a.u()));
            } while (this.a.E() < E2);
            Y(E2);
        } else {
            throw dsrm.f();
        }
    }

    @Override // defpackage.dssw
    public final void S(List<Long> list) {
        int a;
        int a2;
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            int a3 = dsut.a(this.b);
            if (a3 == 0) {
                do {
                    dsrxVar.d(this.a.v());
                    if (this.a.D()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int E = this.a.E() + this.a.q();
                do {
                    dsrxVar.d(this.a.v());
                } while (this.a.E() < E);
                Y(E);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a4 = dsut.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Long.valueOf(this.a.v()));
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int E2 = this.a.E() + this.a.q();
            do {
                list.add(Long.valueOf(this.a.v()));
            } while (this.a.E() < E2);
            Y(E2);
        } else {
            throw dsrm.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dssw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void T(java.util.Map<K, V> r8, defpackage.dssb<K, V> r9, defpackage.dsqa r10) {
        /*
            r7 = this;
            r0 = 2
            r7.U(r0)
            dspj r1 = r7.a
            int r1 = r1.q()
            dspj r2 = r7.a
            int r1 = r2.B(r1)
            K r2 = r9.b
            V r3 = r9.d
        L14:
            int r4 = r7.a()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            dspj r5 = r7.a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.D()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.c()     // Catch: defpackage.dsrl -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            dsrm r4 = new dsrm     // Catch: defpackage.dsrl -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: defpackage.dsrl -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: defpackage.dsrl -> L4f java.lang.Throwable -> L65
        L3a:
            dsur r4 = r9.c     // Catch: defpackage.dsrl -> L4f java.lang.Throwable -> L65
            V r5 = r9.d     // Catch: defpackage.dsrl -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: defpackage.dsrl -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.X(r4, r5, r10)     // Catch: defpackage.dsrl -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            dsur r4 = r9.a     // Catch: defpackage.dsrl -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.X(r4, r5, r5)     // Catch: defpackage.dsrl -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.c()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            dsrm r8 = new dsrm     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            dspj r8 = r7.a
            r8.C(r1)
            return
        L65:
            r8 = move-exception
            dspj r9 = r7.a
            r9.C(r1)
            goto L6d
        L6c:
            throw r8
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dspk.T(java.util.Map, dssb, dsqa):void");
    }

    @Override // defpackage.dssw
    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = this.a.a();
            this.b = i;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return dsut.b(i);
    }

    @Override // defpackage.dssw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dssw
    public final boolean c() {
        int i;
        if (this.a.D() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.c(i);
    }

    @Override // defpackage.dssw
    public final double d() {
        U(1);
        return this.a.d();
    }

    @Override // defpackage.dssw
    public final float e() {
        U(5);
        return this.a.e();
    }

    @Override // defpackage.dssw
    public final long f() {
        U(0);
        return this.a.f();
    }

    @Override // defpackage.dssw
    public final long g() {
        U(0);
        return this.a.g();
    }

    @Override // defpackage.dssw
    public final int h() {
        U(0);
        return this.a.h();
    }

    @Override // defpackage.dssw
    public final long i() {
        U(1);
        return this.a.i();
    }

    @Override // defpackage.dssw
    public final int j() {
        U(5);
        return this.a.j();
    }

    @Override // defpackage.dssw
    public final boolean k() {
        U(0);
        return this.a.k();
    }

    @Override // defpackage.dssw
    public final String l() {
        U(2);
        return this.a.l();
    }

    @Override // defpackage.dssw
    public final String m() {
        U(2);
        return this.a.m();
    }

    @Override // defpackage.dssw
    public final <T> T o(Class<T> cls, dsqa dsqaVar) {
        U(2);
        return (T) V(dsst.a.a(cls), dsqaVar);
    }

    @Override // defpackage.dssw
    public final <T> T p(dstc<T> dstcVar, dsqa dsqaVar) {
        U(2);
        return (T) V(dstcVar, dsqaVar);
    }

    @Override // defpackage.dssw
    public final <T> T q(Class<T> cls, dsqa dsqaVar) {
        U(3);
        return (T) W(dsst.a.a(cls), dsqaVar);
    }

    @Override // defpackage.dssw
    public final <T> T r(dstc<T> dstcVar, dsqa dsqaVar) {
        U(3);
        return (T) W(dstcVar, dsqaVar);
    }

    @Override // defpackage.dssw
    public final dspd s() {
        U(2);
        return this.a.p();
    }

    @Override // defpackage.dssw
    public final int t() {
        U(0);
        return this.a.q();
    }

    @Override // defpackage.dssw
    public final int u() {
        U(0);
        return this.a.r();
    }

    @Override // defpackage.dssw
    public final int v() {
        U(5);
        return this.a.s();
    }

    @Override // defpackage.dssw
    public final long w() {
        U(1);
        return this.a.t();
    }

    @Override // defpackage.dssw
    public final int x() {
        U(0);
        return this.a.u();
    }

    @Override // defpackage.dssw
    public final long y() {
        U(0);
        return this.a.v();
    }

    @Override // defpackage.dssw
    public final void z(List<Double> list) {
        int a;
        int a2;
        if (list instanceof dspr) {
            dspr dsprVar = (dspr) list;
            int a3 = dsut.a(this.b);
            if (a3 == 1) {
                do {
                    dsprVar.f(this.a.d());
                    if (this.a.D()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int q = this.a.q();
                aa(q);
                int E = this.a.E() + q;
                do {
                    dsprVar.f(this.a.d());
                } while (this.a.E() < E);
                return;
            } else {
                throw dsrm.f();
            }
        }
        int a4 = dsut.a(this.b);
        if (a4 == 1) {
            do {
                list.add(Double.valueOf(this.a.d()));
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int q2 = this.a.q();
            aa(q2);
            int E2 = this.a.E() + q2;
            do {
                list.add(Double.valueOf(this.a.d()));
            } while (this.a.E() < E2);
        } else {
            throw dsrm.f();
        }
    }

    public final void J(List<String> list, boolean z) {
        int a;
        int a2;
        if (dsut.a(this.b) != 2) {
            throw dsrm.f();
        }
        if (!(list instanceof dsrt) || z) {
            do {
                list.add(z ? m() : l());
                if (this.a.D()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
            return;
        }
        dsrt dsrtVar = (dsrt) list;
        do {
            dsrtVar.f(s());
            if (this.a.D()) {
                return;
            }
            a2 = this.a.a();
        } while (a2 == this.b);
        this.d = a2;
    }
}
