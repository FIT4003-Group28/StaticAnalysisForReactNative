package defpackage;

import android.content.Context;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctwq  reason: default package */
/* loaded from: classes5.dex */
public final class ctwq implements ctxf<dxkk, dxkm, Void, dxkb> {
    private final Context a;
    private final ctyy b;
    private final csvf c;

    public ctwq(Context context, ctyy ctyyVar, csvf csvfVar) {
        this.a = context;
        this.b = ctyyVar;
        this.c = csvfVar;
    }

    @Override // defpackage.ctxf
    public final dehn<dxkk> a(dxwi dxwiVar) {
        dxkj bZ = dxkk.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxwiVar.getClass();
        ((dxkk) bZ.b).a = dxwiVar;
        dspd c = this.b.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        c.getClass();
        ((dxkk) bZ.b).b = c;
        List<Integer> c2 = this.c.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxkk dxkkVar = (dxkk) bZ.b;
        dsrf dsrfVar = dxkkVar.c;
        if (!dsrfVar.a()) {
            dxkkVar.c = dsqw.cg(dsrfVar);
        }
        for (Integer num : c2) {
            dxkkVar.c.h(num.intValue());
        }
        String a = cstk.a(this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        a.getClass();
        ((dxkk) bZ.b).d = a;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.b.b().e());
        r.o(this.b.c().J());
        r.p(uuid.toString());
        r.j(20);
        r.f(i);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, Void r3, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.b.b().e());
        r.o(this.b.c().J());
        r.p(uuid.toString());
        r.j(20);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ Void d(dxkm dxkmVar) {
        return null;
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxkm> e(dehn<dxkb> dehnVar, dxkk dxkkVar) {
        final dxkk dxkkVar2 = dxkkVar;
        return deew.g(dehnVar, new defg(dxkkVar2) { // from class: ctwp
            private final dxkk a;

            {
                this.a = dxkkVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxkk dxkkVar3 = this.a;
                dxkb dxkbVar = (dxkb) obj;
                dyeu dyeuVar = dxkbVar.a;
                dyib<dxkk, dxkm> dyibVar = dxkc.a;
                if (dyibVar == null) {
                    synchronized (dxkc.class) {
                        dyibVar = dxkc.a;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.LighterCapabilities", "RegisterCapabilities");
                            c.e = true;
                            c.a = dyyq.b(dxkk.e);
                            c.b = dyyq.b(dxkm.a);
                            dyibVar = c.a();
                            dxkc.a = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxkbVar.b), dxkkVar3);
            }
        }, dege.a);
    }
}
