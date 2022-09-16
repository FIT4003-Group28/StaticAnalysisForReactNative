package defpackage;
/* compiled from: PG */
/* renamed from: axtq  reason: default package */
/* loaded from: classes3.dex */
public final class axtq<T> extends btrh<T> {
    public axtq(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        alho alhoVar = (alho) obj;
        final axtp axtpVar = ((axta) this.a).a;
        if (axtpVar.w()) {
            if (!axtpVar.q.a().q() && axtpVar.q.a().p() == null) {
                return;
            }
            alaq alaqVar = alhoVar.a;
            if (!(alaqVar instanceof alap)) {
                return;
            }
            final alap alapVar = (alap) alaqVar;
            if (alapVar.k || alapVar.l) {
                return;
            }
            if (axtpVar.q.a().q()) {
                axtpVar.h.b(new Runnable(axtpVar, alapVar) { // from class: axsj
                    private final axtp a;
                    private final alap b;

                    {
                        this.a = axtpVar;
                        this.b = alapVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dcdc e;
                        axtp axtpVar2 = this.a;
                        final alap alapVar2 = this.b;
                        try {
                            e = axtpVar2.c.g(azxm.e);
                        } catch (axxc unused) {
                            e = dcdc.e();
                        }
                        int size = e.size();
                        if (dcbg.b(e).p(new dbsl(alapVar2) { // from class: axsk
                            private final alap a;

                            {
                                this.a = alapVar2;
                            }

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj2) {
                                alap alapVar3 = this.a;
                                azxk azxkVar = (azxk) obj2;
                                dvvi dvviVar = axtp.a;
                                return azxb.f(azxkVar.b(), azxkVar.d()).h(azxb.f(axtp.T(alapVar3), alapVar3.r.S()));
                            }
                        })) {
                            axtpVar2.h.b(new axst(axtpVar2, alapVar2, size), bvrj.UI_THREAD);
                        }
                    }
                }, bvrj.BACKGROUND_THREADPOOL);
            } else if (axtpVar.q.a().p() == null) {
            } else {
                baad p = axtpVar.q.a().p();
                dbsk.s(p);
                if (!p.h(azxb.f(axtp.T(alapVar), alapVar.r.S())) || axtpVar.r.a().n(axtp.W(alapVar)).booleanValue()) {
                    return;
                }
                axtpVar.V(alapVar, p.E(axtpVar.b), baae.a(p.t()), p.k());
            }
        }
    }
}
