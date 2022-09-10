package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctxj  reason: default package */
/* loaded from: classes5.dex */
public final class ctxj implements ctxf<dxvg, dxvi, csut, dxtm> {
    private final ctyy a;

    public ctxj(ctyy ctyyVar) {
        this.a = ctyyVar;
    }

    @Override // defpackage.ctxf
    public final dehn<dxvg> a(dxwi dxwiVar) {
        dxvf bZ = dxvg.b.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxwiVar.getClass();
        ((dxvg) bZ.b).a = dxwiVar;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(4);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, csut csutVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(4);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ csut d(dxvi dxviVar) {
        csus b = csut.b();
        ((cstz) b).a = 1;
        return b.a();
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxvi> e(dehn<dxtm> dehnVar, dxvg dxvgVar) {
        final dxvg dxvgVar2 = dxvgVar;
        return deew.g(dehnVar, new defg(dxvgVar2) { // from class: ctxi
            private final dxvg a;

            {
                this.a = dxvgVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxvg dxvgVar3 = this.a;
                dxtm dxtmVar = (dxtm) obj;
                dyeu dyeuVar = dxtmVar.a;
                dyib<dxvg, dxvi> dyibVar = dxtn.c;
                if (dyibVar == null) {
                    synchronized (dxtn.class) {
                        dyibVar = dxtn.c;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.Registration", "Unregister");
                            c.e = true;
                            c.a = dyyq.b(dxvg.b);
                            c.b = dyyq.b(dxvi.a);
                            dyibVar = c.a();
                            dxtn.c = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxtmVar.b), dxvgVar3);
            }
        }, dege.a);
    }
}
