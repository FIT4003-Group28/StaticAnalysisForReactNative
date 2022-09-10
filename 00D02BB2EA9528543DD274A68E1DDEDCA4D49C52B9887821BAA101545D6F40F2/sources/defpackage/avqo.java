package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: avqo  reason: default package */
/* loaded from: classes3.dex */
public final class avqo implements avqf {
    public static final /* synthetic */ int e = 0;
    private static final ddbc f = ddbc.e(2000, 3);
    public final dzsj<bvef> a;
    public final dehq b;
    public final awfh c;
    public final avzj d;

    public avqo(dzsj<bvef> dzsjVar, awfh awfhVar, dehq dehqVar, avzj avzjVar) {
        this.a = dzsjVar;
        this.c = awfhVar;
        this.b = dehqVar;
        this.d = avzjVar;
    }

    @Override // defpackage.avqf
    public final dehn<dvfo> a(final dvfk dvfkVar, final dlsw dlswVar, final ahnc ahncVar) {
        return deee.h(deee.h(deew.g(deew.h(degp.q(deee.h(degp.q(ddbn.d(new dbty(this, dlswVar) { // from class: avqk
            private final avqo a;
            private final dlsw b;

            {
                this.a = this;
                this.b = dlswVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                final avqo avqoVar = this.a;
                final dlsw dlswVar2 = this.b;
                return avqoVar.b.c(new Callable(avqoVar, dlswVar2) { // from class: avqn
                    private final avqo a;
                    private final dlsw b;

                    {
                        this.a = avqoVar;
                        this.b = dlswVar2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        avqo avqoVar2 = this.a;
                        return avqoVar2.d.c(this.b);
                    }
                });
            }
        }, f, avql.a, this.b)), ddaw.class, avqm.a, dege.a)), new dbrn(this, ahncVar) { // from class: avqg
            private final avqo a;
            private final ahnc b;

            {
                this.a = this;
                this.b = ahncVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                avqo avqoVar = this.a;
                ahnc ahncVar2 = this.b;
                btlu btluVar = (btlu) obj;
                bvef a = avqoVar.a.a();
                if (ahncVar2 != null) {
                    a.a().f = ahncVar2;
                }
                a.a().e = btluVar;
                if (avqoVar.c.b()) {
                    boolean z = !btlu.p(btluVar);
                    buac a2 = a.a();
                    btyq btyqVar = a.a().a().a;
                    dsqp dsqpVar = (dsqp) btyqVar.cu(5);
                    dsqpVar.bC(btyqVar);
                    btyp btypVar = (btyp) dsqpVar;
                    if (btypVar.c) {
                        btypVar.bF();
                        btypVar.c = false;
                    }
                    btyq btyqVar2 = (btyq) btypVar.b;
                    btyqVar2.a |= 1;
                    btyqVar2.b = z;
                    a2.a = btypVar.bK();
                }
                return new awng(a.c(), avqoVar.b);
            }
        }, this.b), new defg(dvfkVar) { // from class: avqh
            private final dvfk a;

            {
                this.a = dvfkVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dvfk dvfkVar2 = this.a;
                awng awngVar = (awng) obj;
                int i = avqo.e;
                awnf awnfVar = new awnf();
                final btzc b = awngVar.a.b(dvfkVar2, awnfVar, awngVar.b);
                final dees deesVar = awnfVar.a;
                deesVar.Pk(new Runnable(deesVar, b) { // from class: awne
                    private final dehn a;
                    private final btzc b;

                    {
                        this.a = deesVar;
                        this.b = b;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dehn dehnVar = this.a;
                        btzc btzcVar = this.b;
                        if (dehnVar.isCancelled()) {
                            btzcVar.a();
                        }
                    }
                }, awngVar.b);
                return deesVar;
            }
        }, this.b), avzi.class, avqi.a, this.b), btzz.class, avqj.a, this.b);
    }
}
