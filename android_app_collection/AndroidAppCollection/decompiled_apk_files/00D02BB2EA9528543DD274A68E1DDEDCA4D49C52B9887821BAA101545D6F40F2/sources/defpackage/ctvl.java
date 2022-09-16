package defpackage;

import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctvl  reason: default package */
/* loaded from: classes5.dex */
public final class ctvl implements ctxf<dxtp, dxtr, Void, dxti> {
    private final ctyy a;
    private final List<String> b;

    public ctvl(ctyy ctyyVar, List<String> list) {
        this.a = ctyyVar;
        this.b = list;
    }

    @Override // defpackage.ctxf
    public final dehn<dxtp> a(dxwi dxwiVar) {
        dxto bZ = dxtp.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxwiVar.getClass();
        ((dxtp) bZ.b).a = dxwiVar;
        List<dxwg> g = ctuv.g(this.a, this.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxtp dxtpVar = (dxtp) bZ.b;
        dsrj<dxwg> dsrjVar = dxtpVar.b;
        if (!dsrjVar.a()) {
            dxtpVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(g, dxtpVar.b);
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(13);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, Void r3, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(13);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ Void d(dxtr dxtrVar) {
        return null;
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxtr> e(dehn<dxti> dehnVar, dxtp dxtpVar) {
        final dxtp dxtpVar2 = dxtpVar;
        return deew.g(dehnVar, new defg(dxtpVar2) { // from class: ctvk
            private final dxtp a;

            {
                this.a = dxtpVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxtp dxtpVar3 = this.a;
                dxti dxtiVar = (dxti) obj;
                dyeu dyeuVar = dxtiVar.a;
                dyib<dxtp, dxtr> dyibVar = dxtk.c;
                if (dyibVar == null) {
                    synchronized (dxtk.class) {
                        dyibVar = dxtk.c;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.Messaging", "AckMessages");
                            c.e = true;
                            c.a = dyyq.b(dxtp.c);
                            c.b = dyyq.b(dxtr.a);
                            dyibVar = c.a();
                            dxtk.c = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxtiVar.b), dxtpVar3);
            }
        }, dege.a);
    }
}
