package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aooh  reason: default package */
/* loaded from: classes.dex */
public final class aooh implements aorh {
    private final aoog a;
    private int b;
    private int c;
    private int d = 0;

    private aooh(aoog aoogVar) {
        aopv.i(aoogVar, "input");
        this.a = aoogVar;
        aoogVar.d = this;
    }

    private final Object P(aosj aosjVar, Class cls, aoos aoosVar) {
        aosj aosjVar2 = aosj.DOUBLE;
        switch (aosjVar.ordinal()) {
            case 0:
                return Double.valueOf(a());
            case 1:
                return Float.valueOf(b());
            case 2:
                return Long.valueOf(l());
            case 3:
                return Long.valueOf(o());
            case 4:
                return Integer.valueOf(g());
            case 5:
                return Long.valueOf(k());
            case 6:
                return Integer.valueOf(f());
            case 7:
                return Boolean.valueOf(T());
            case 8:
                return x();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return t(cls, aoosVar);
            case 11:
                return q();
            case 12:
                return Integer.valueOf(j());
            case 13:
                return Integer.valueOf(e());
            case 14:
                return Integer.valueOf(h());
            case 15:
                return Long.valueOf(m());
            case 16:
                return Integer.valueOf(i());
            case 17:
                return Long.valueOf(n());
        }
    }

    private final Object V(aorm aormVar, aoos aoosVar) {
        int i = this.c;
        this.c = aosl.c(aosl.a(this.b), 4);
        try {
            Object e = aormVar.e();
            aormVar.h(e, this, aoosVar);
            aormVar.f(e);
            if (this.b == this.c) {
                return e;
            }
            throw aopx.g();
        } finally {
            this.c = i;
        }
    }

    private final Object W(aorm aormVar, aoos aoosVar) {
        aoog aoogVar;
        int o = this.a.o();
        aoog aoogVar2 = this.a;
        if (aoogVar2.a >= aoogVar2.b) {
            throw aopx.h();
        }
        int f = aoogVar2.f(o);
        Object e = aormVar.e();
        this.a.a++;
        aormVar.h(e, this, aoosVar);
        aormVar.f(e);
        this.a.B(0);
        aoogVar.a--;
        this.a.C(f);
        return e;
    }

    private final void X(int i) {
        if (this.a.e() == i) {
            return;
        }
        throw aopx.j();
    }

    private final void Y(int i) {
        if (aosl.b(this.b) == i) {
            return;
        }
        throw aopx.a();
    }

    private static final void Z(int i) {
        if ((i & 3) == 0) {
            return;
        }
        throw aopx.g();
    }

    private static final void aa(int i) {
        if ((i & 7) == 0) {
            return;
        }
        throw aopx.g();
    }

    public static aooh p(aoog aoogVar) {
        aooh aoohVar = aoogVar.d;
        return aoohVar != null ? aoohVar : new aooh(aoogVar);
    }

    @Override // defpackage.aorh
    public final void A(List list) {
        int n;
        int n2;
        if (list instanceof aoon) {
            aoon aoonVar = (aoon) list;
            int b = aosl.b(this.b);
            if (b == 1) {
                do {
                    aoonVar.f(this.a.b());
                    if (this.a.E()) {
                        return;
                    }
                    n2 = this.a.n();
                } while (n2 == this.b);
                this.d = n2;
                return;
            } else if (b == 2) {
                int o = this.a.o();
                aa(o);
                int e = this.a.e() + o;
                do {
                    aoonVar.f(this.a.b());
                } while (this.a.e() < e);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.b);
        if (b2 == 1) {
            do {
                list.add(Double.valueOf(this.a.b()));
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
        } else if (b2 == 2) {
            int o2 = this.a.o();
            aa(o2);
            int e2 = this.a.e() + o2;
            do {
                list.add(Double.valueOf(this.a.b()));
            } while (this.a.e() < e2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void B(List list) {
        int n;
        int n2;
        if (list instanceof aopj) {
            aopj aopjVar = (aopj) list;
            int b = aosl.b(this.b);
            if (b == 0) {
                do {
                    aopjVar.g(this.a.g());
                    if (this.a.E()) {
                        return;
                    }
                    n2 = this.a.n();
                } while (n2 == this.b);
                this.d = n2;
                return;
            } else if (b == 2) {
                int e = this.a.e() + this.a.o();
                do {
                    aopjVar.g(this.a.g());
                } while (this.a.e() < e);
                X(e);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.g()));
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
        } else if (b2 == 2) {
            int e2 = this.a.e() + this.a.o();
            do {
                list.add(Integer.valueOf(this.a.g()));
            } while (this.a.e() < e2);
            X(e2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void C(List list) {
        int n;
        int n2;
        if (!(list instanceof aopj)) {
            int b = aosl.b(this.b);
            if (b == 2) {
                int o = this.a.o();
                Z(o);
                int e = this.a.e() + o;
                do {
                    list.add(Integer.valueOf(this.a.h()));
                } while (this.a.e() < e);
                return;
            } else if (b != 5) {
                throw aopx.a();
            } else {
                do {
                    list.add(Integer.valueOf(this.a.h()));
                    if (this.a.E()) {
                        return;
                    }
                    n = this.a.n();
                } while (n == this.b);
                this.d = n;
                return;
            }
        }
        aopj aopjVar = (aopj) list;
        int b2 = aosl.b(this.b);
        if (b2 == 2) {
            int o2 = this.a.o();
            Z(o2);
            int e2 = this.a.e() + o2;
            do {
                aopjVar.g(this.a.h());
            } while (this.a.e() < e2);
        } else if (b2 != 5) {
            throw aopx.a();
        } else {
            do {
                aopjVar.g(this.a.h());
                if (this.a.E()) {
                    return;
                }
                n2 = this.a.n();
            } while (n2 == this.b);
            this.d = n2;
        }
    }

    @Override // defpackage.aorh
    public final void D(List list) {
        int n;
        int n2;
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            int b = aosl.b(this.b);
            if (b == 1) {
                do {
                    aoqjVar.f(this.a.p());
                    if (this.a.E()) {
                        return;
                    }
                    n2 = this.a.n();
                } while (n2 == this.b);
                this.d = n2;
                return;
            } else if (b == 2) {
                int o = this.a.o();
                aa(o);
                int e = this.a.e() + o;
                do {
                    aoqjVar.f(this.a.p());
                } while (this.a.e() < e);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.b);
        if (b2 == 1) {
            do {
                list.add(Long.valueOf(this.a.p()));
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
        } else if (b2 == 2) {
            int o2 = this.a.o();
            aa(o2);
            int e2 = this.a.e() + o2;
            do {
                list.add(Long.valueOf(this.a.p()));
            } while (this.a.e() < e2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void E(List list) {
        int n;
        int n2;
        if (!(list instanceof aooy)) {
            int b = aosl.b(this.b);
            if (b == 2) {
                int o = this.a.o();
                Z(o);
                int e = this.a.e() + o;
                do {
                    list.add(Float.valueOf(this.a.c()));
                } while (this.a.e() < e);
                return;
            } else if (b != 5) {
                throw aopx.a();
            } else {
                do {
                    list.add(Float.valueOf(this.a.c()));
                    if (this.a.E()) {
                        return;
                    }
                    n = this.a.n();
                } while (n == this.b);
                this.d = n;
                return;
            }
        }
        aooy aooyVar = (aooy) list;
        int b2 = aosl.b(this.b);
        if (b2 == 2) {
            int o2 = this.a.o();
            Z(o2);
            int e2 = this.a.e() + o2;
            do {
                aooyVar.h(this.a.c());
            } while (this.a.e() < e2);
        } else if (b2 != 5) {
            throw aopx.a();
        } else {
            do {
                aooyVar.h(this.a.c());
                if (this.a.E()) {
                    return;
                }
                n2 = this.a.n();
            } while (n2 == this.b);
            this.d = n2;
        }
    }

    @Override // defpackage.aorh
    public final void F(List list, aorm aormVar, aoos aoosVar) {
        int n;
        if (aosl.b(this.b) == 3) {
            int i = this.b;
            do {
                list.add(V(aormVar, aoosVar));
                if (this.a.E() || this.d != 0) {
                    return;
                }
                n = this.a.n();
            } while (n == i);
            this.d = n;
            return;
        }
        throw aopx.a();
    }

    @Override // defpackage.aorh
    public final void G(List list) {
        int n;
        int n2;
        if (list instanceof aopj) {
            aopj aopjVar = (aopj) list;
            int b = aosl.b(this.b);
            if (b == 0) {
                do {
                    aopjVar.g(this.a.i());
                    if (this.a.E()) {
                        return;
                    }
                    n2 = this.a.n();
                } while (n2 == this.b);
                this.d = n2;
                return;
            } else if (b == 2) {
                int e = this.a.e() + this.a.o();
                do {
                    aopjVar.g(this.a.i());
                } while (this.a.e() < e);
                X(e);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.i()));
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
        } else if (b2 == 2) {
            int e2 = this.a.e() + this.a.o();
            do {
                list.add(Integer.valueOf(this.a.i()));
            } while (this.a.e() < e2);
            X(e2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void H(List list) {
        int n;
        int n2;
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            int b = aosl.b(this.b);
            if (b == 0) {
                do {
                    aoqjVar.f(this.a.q());
                    if (this.a.E()) {
                        return;
                    }
                    n2 = this.a.n();
                } while (n2 == this.b);
                this.d = n2;
                return;
            } else if (b == 2) {
                int e = this.a.e() + this.a.o();
                do {
                    aoqjVar.f(this.a.q());
                } while (this.a.e() < e);
                X(e);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Long.valueOf(this.a.q()));
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
        } else if (b2 == 2) {
            int e2 = this.a.e() + this.a.o();
            do {
                list.add(Long.valueOf(this.a.q()));
            } while (this.a.e() < e2);
            X(e2);
        } else {
            throw aopx.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        return;
     */
    @Override // defpackage.aorh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(java.util.Map r8, defpackage.aoqn r9, defpackage.aoos r10) {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            aoog r1 = r7.a
            int r1 = r1.o()
            aoog r2 = r7.a
            int r1 = r2.f(r1)
            java.lang.Object r2 = r9.b
            java.lang.Object r3 = r9.d
        L14:
            int r4 = r7.c()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            aoog r5 = r7.a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.E()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.U()     // Catch: defpackage.aopw -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            aopx r4 = new aopx     // Catch: defpackage.aopw -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: defpackage.aopw -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: defpackage.aopw -> L4f java.lang.Throwable -> L65
        L3a:
            aosj r4 = r9.c     // Catch: defpackage.aopw -> L4f java.lang.Throwable -> L65
            java.lang.Object r5 = r9.d     // Catch: defpackage.aopw -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: defpackage.aopw -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.P(r4, r5, r10)     // Catch: defpackage.aopw -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            aosj r4 = r9.a     // Catch: defpackage.aopw -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.P(r4, r5, r5)     // Catch: defpackage.aopw -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.U()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            aopx r8 = new aopx     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            aoog r8 = r7.a
            r8.C(r1)
            return
        L65:
            r8 = move-exception
            aoog r9 = r7.a
            r9.C(r1)
            goto L6d
        L6c:
            throw r8
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aooh.I(java.util.Map, aoqn, aoos):void");
    }

    @Override // defpackage.aorh
    public final void J(List list, aorm aormVar, aoos aoosVar) {
        int n;
        if (aosl.b(this.b) == 2) {
            int i = this.b;
            do {
                list.add(W(aormVar, aoosVar));
                if (this.a.E() || this.d != 0) {
                    return;
                }
                n = this.a.n();
            } while (n == i);
            this.d = n;
            return;
        }
        throw aopx.a();
    }

    @Override // defpackage.aorh
    public final void K(List list) {
        int n;
        int n2;
        if (!(list instanceof aopj)) {
            int b = aosl.b(this.b);
            if (b == 2) {
                int o = this.a.o();
                Z(o);
                int e = this.a.e() + o;
                do {
                    list.add(Integer.valueOf(this.a.l()));
                } while (this.a.e() < e);
                return;
            } else if (b != 5) {
                throw aopx.a();
            } else {
                do {
                    list.add(Integer.valueOf(this.a.l()));
                    if (this.a.E()) {
                        return;
                    }
                    n = this.a.n();
                } while (n == this.b);
                this.d = n;
                return;
            }
        }
        aopj aopjVar = (aopj) list;
        int b2 = aosl.b(this.b);
        if (b2 == 2) {
            int o2 = this.a.o();
            Z(o2);
            int e2 = this.a.e() + o2;
            do {
                aopjVar.g(this.a.l());
            } while (this.a.e() < e2);
        } else if (b2 != 5) {
            throw aopx.a();
        } else {
            do {
                aopjVar.g(this.a.l());
                if (this.a.E()) {
                    return;
                }
                n2 = this.a.n();
            } while (n2 == this.b);
            this.d = n2;
        }
    }

    @Override // defpackage.aorh
    public final void L(List list) {
        int n;
        int n2;
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            int b = aosl.b(this.b);
            if (b == 1) {
                do {
                    aoqjVar.f(this.a.u());
                    if (this.a.E()) {
                        return;
                    }
                    n2 = this.a.n();
                } while (n2 == this.b);
                this.d = n2;
                return;
            } else if (b == 2) {
                int o = this.a.o();
                aa(o);
                int e = this.a.e() + o;
                do {
                    aoqjVar.f(this.a.u());
                } while (this.a.e() < e);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.b);
        if (b2 == 1) {
            do {
                list.add(Long.valueOf(this.a.u()));
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
        } else if (b2 == 2) {
            int o2 = this.a.o();
            aa(o2);
            int e2 = this.a.e() + o2;
            do {
                list.add(Long.valueOf(this.a.u()));
            } while (this.a.e() < e2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void M(List list) {
        int n;
        int n2;
        if (list instanceof aopj) {
            aopj aopjVar = (aopj) list;
            int b = aosl.b(this.b);
            if (b == 0) {
                do {
                    aopjVar.g(this.a.m());
                    if (this.a.E()) {
                        return;
                    }
                    n2 = this.a.n();
                } while (n2 == this.b);
                this.d = n2;
                return;
            } else if (b == 2) {
                int e = this.a.e() + this.a.o();
                do {
                    aopjVar.g(this.a.m());
                } while (this.a.e() < e);
                X(e);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.m()));
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
        } else if (b2 == 2) {
            int e2 = this.a.e() + this.a.o();
            do {
                list.add(Integer.valueOf(this.a.m()));
            } while (this.a.e() < e2);
            X(e2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void N(List list) {
        int n;
        int n2;
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            int b = aosl.b(this.b);
            if (b == 0) {
                do {
                    aoqjVar.f(this.a.v());
                    if (this.a.E()) {
                        return;
                    }
                    n2 = this.a.n();
                } while (n2 == this.b);
                this.d = n2;
                return;
            } else if (b == 2) {
                int e = this.a.e() + this.a.o();
                do {
                    aoqjVar.f(this.a.v());
                } while (this.a.e() < e);
                X(e);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Long.valueOf(this.a.v()));
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
        } else if (b2 == 2) {
            int e2 = this.a.e() + this.a.o();
            do {
                list.add(Long.valueOf(this.a.v()));
            } while (this.a.e() < e2);
            X(e2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void O(List list) {
        w(list, false);
    }

    @Override // defpackage.aorh
    public final void Q(List list) {
        w(list, true);
    }

    @Override // defpackage.aorh
    public final void R(List list) {
        int n;
        int n2;
        if (list instanceof aopj) {
            aopj aopjVar = (aopj) list;
            int b = aosl.b(this.b);
            if (b == 0) {
                do {
                    aopjVar.g(this.a.o());
                    if (this.a.E()) {
                        return;
                    }
                    n2 = this.a.n();
                } while (n2 == this.b);
                this.d = n2;
                return;
            } else if (b == 2) {
                int e = this.a.e() + this.a.o();
                do {
                    aopjVar.g(this.a.o());
                } while (this.a.e() < e);
                X(e);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.o()));
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
        } else if (b2 == 2) {
            int e2 = this.a.e() + this.a.o();
            do {
                list.add(Integer.valueOf(this.a.o()));
            } while (this.a.e() < e2);
            X(e2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void S(List list) {
        int n;
        int n2;
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            int b = aosl.b(this.b);
            if (b == 0) {
                do {
                    aoqjVar.f(this.a.w());
                    if (this.a.E()) {
                        return;
                    }
                    n2 = this.a.n();
                } while (n2 == this.b);
                this.d = n2;
                return;
            } else if (b == 2) {
                int e = this.a.e() + this.a.o();
                do {
                    aoqjVar.f(this.a.w());
                } while (this.a.e() < e);
                X(e);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Long.valueOf(this.a.w()));
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
        } else if (b2 == 2) {
            int e2 = this.a.e() + this.a.o();
            do {
                list.add(Long.valueOf(this.a.w()));
            } while (this.a.e() < e2);
            X(e2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final boolean T() {
        Y(0);
        return this.a.F();
    }

    @Override // defpackage.aorh
    public final boolean U() {
        int i;
        if (this.a.E() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.G(i);
    }

    @Override // defpackage.aorh
    public final double a() {
        Y(1);
        return this.a.b();
    }

    @Override // defpackage.aorh
    public final float b() {
        Y(5);
        return this.a.c();
    }

    @Override // defpackage.aorh
    public final int c() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = this.a.n();
            this.b = i;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return aosl.a(i);
    }

    @Override // defpackage.aorh
    public final int d() {
        return this.b;
    }

    @Override // defpackage.aorh
    public final int e() {
        Y(0);
        return this.a.g();
    }

    @Override // defpackage.aorh
    public final int f() {
        Y(5);
        return this.a.h();
    }

    @Override // defpackage.aorh
    public final int g() {
        Y(0);
        return this.a.i();
    }

    @Override // defpackage.aorh
    public final int h() {
        Y(5);
        return this.a.l();
    }

    @Override // defpackage.aorh
    public final int i() {
        Y(0);
        return this.a.m();
    }

    @Override // defpackage.aorh
    public final int j() {
        Y(0);
        return this.a.o();
    }

    @Override // defpackage.aorh
    public final long k() {
        Y(1);
        return this.a.p();
    }

    @Override // defpackage.aorh
    public final long l() {
        Y(0);
        return this.a.q();
    }

    @Override // defpackage.aorh
    public final long m() {
        Y(1);
        return this.a.u();
    }

    @Override // defpackage.aorh
    public final long n() {
        Y(0);
        return this.a.v();
    }

    @Override // defpackage.aorh
    public final long o() {
        Y(0);
        return this.a.w();
    }

    @Override // defpackage.aorh
    public final aoob q() {
        Y(2);
        return this.a.x();
    }

    @Override // defpackage.aorh
    public final Object r(Class cls, aoos aoosVar) {
        Y(3);
        return V(aore.a.a(cls), aoosVar);
    }

    @Override // defpackage.aorh
    public final Object s(aorm aormVar, aoos aoosVar) {
        Y(3);
        return V(aormVar, aoosVar);
    }

    @Override // defpackage.aorh
    public final Object t(Class cls, aoos aoosVar) {
        Y(2);
        return W(aore.a.a(cls), aoosVar);
    }

    @Override // defpackage.aorh
    public final Object u(aorm aormVar, aoos aoosVar) {
        Y(2);
        return W(aormVar, aoosVar);
    }

    @Override // defpackage.aorh
    public final String v() {
        Y(2);
        return this.a.z();
    }

    @Override // defpackage.aorh
    public final String x() {
        Y(2);
        return this.a.A();
    }

    @Override // defpackage.aorh
    public final void y(List list) {
        int n;
        int n2;
        if (list instanceof aons) {
            aons aonsVar = (aons) list;
            int b = aosl.b(this.b);
            if (b == 0) {
                do {
                    aonsVar.f(this.a.F());
                    if (this.a.E()) {
                        return;
                    }
                    n2 = this.a.n();
                } while (n2 == this.b);
                this.d = n2;
                return;
            } else if (b == 2) {
                int e = this.a.e() + this.a.o();
                do {
                    aonsVar.f(this.a.F());
                } while (this.a.e() < e);
                X(e);
                return;
            } else {
                throw aopx.a();
            }
        }
        int b2 = aosl.b(this.b);
        if (b2 == 0) {
            do {
                list.add(Boolean.valueOf(this.a.F()));
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
        } else if (b2 == 2) {
            int e2 = this.a.e() + this.a.o();
            do {
                list.add(Boolean.valueOf(this.a.F()));
            } while (this.a.e() < e2);
            X(e2);
        } else {
            throw aopx.a();
        }
    }

    @Override // defpackage.aorh
    public final void z(List list) {
        int n;
        if (aosl.b(this.b) == 2) {
            do {
                list.add(q());
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
            return;
        }
        throw aopx.a();
    }

    public final void w(List list, boolean z) {
        int n;
        int n2;
        if (aosl.b(this.b) != 2) {
            throw aopx.a();
        }
        if (!(list instanceof aoqf) || z) {
            do {
                list.add(z ? x() : v());
                if (this.a.E()) {
                    return;
                }
                n = this.a.n();
            } while (n == this.b);
            this.d = n;
            return;
        }
        aoqf aoqfVar = (aoqf) list;
        do {
            aoqfVar.i(q());
            if (this.a.E()) {
                return;
            }
            n2 = this.a.n();
        } while (n2 == this.b);
        this.d = n2;
    }
}
