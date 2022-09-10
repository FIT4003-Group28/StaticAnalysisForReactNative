package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pyt  reason: default package */
/* loaded from: classes7.dex */
public final class pyt implements Serializable {
    @dzsi
    private cjsz a;
    @dzsi
    private cjsz b;
    @dzsi
    private cjsz c;
    private transient cjtg d;
    private transient cjtg e;
    private transient zjm f;

    public pyt(cjtg cjtgVar, zjm zjmVar) {
        a(cjtgVar, zjmVar);
    }

    private final void d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(cjtg cjtgVar, zjm zjmVar) {
        this.e = cjtgVar;
        this.f = zjmVar;
        this.d = cjtgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cjtg b() {
        cjtg K = this.f.n().K();
        return K != null ? K : this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(vnk vnkVar, @dzsi int i, jjn jjnVar, btpf btpfVar) {
        cjtg b = b();
        synchronized (vnkVar) {
            vwn d = vnkVar.l().d();
            boolean z = d.a() && !d.t();
            amsy aS = vnkVar.aS();
            boolean z2 = aS != null && aS.s() == dovb.NO_ROUTES_FOUND;
            if (!z && !z2) {
                if (i == 3) {
                    if (vnkVar.g() == dqvj.TRANSIT) {
                        this.b = null;
                        this.c = null;
                        if (this.a == null) {
                            this.a = new cjsz(dtxn.dd);
                        }
                        this.d = this.a;
                    } else {
                        this.a = null;
                        if ((!btpfVar.e || !btpfVar.f) && !jjn.EXPANDED.c(jjnVar)) {
                            if (this.c == null) {
                                this.c = new cjsz(dtxn.dV);
                            }
                            this.d = this.c;
                        } else {
                            if (this.b == null) {
                                this.b = new cjsz(dtxn.de);
                            }
                            this.d = this.b;
                        }
                    }
                } else if (i == 1) {
                    if (this.c == null) {
                        this.c = new cjsz(dtxn.dQ);
                    }
                    this.d = this.c;
                } else {
                    d();
                }
            }
            d();
        }
        return b != b();
    }
}
