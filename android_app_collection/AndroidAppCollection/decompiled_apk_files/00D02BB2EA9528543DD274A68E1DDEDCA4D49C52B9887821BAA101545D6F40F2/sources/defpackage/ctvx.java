package defpackage;

import android.text.TextUtils;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctvx  reason: default package */
/* loaded from: classes5.dex */
public final class ctvx implements ctxf<dxjt, dxjv, csuc, dxjm> {
    public final ctyy a;
    private final int b;
    private final String c;

    public ctvx(ctyy ctyyVar, int i, String str) {
        this.a = ctyyVar;
        this.b = i;
        this.c = str;
    }

    @Override // defpackage.ctxf
    public final dehn<dxjt> a(dxwi dxwiVar) {
        dxjs bZ = dxjt.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxjt dxjtVar = (dxjt) bZ.b;
        dxwiVar.getClass();
        dxjtVar.a = dxwiVar;
        dxjtVar.b = this.b;
        if (!TextUtils.isEmpty(this.c)) {
            String str = this.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            str.getClass();
            ((dxjt) bZ.b).c = str;
        }
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(8);
        r.f(i);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, csuc csucVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(8);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ csuc d(dxjv dxjvVar) {
        dxjv dxjvVar2 = dxjvVar;
        csub c = csuc.c();
        c.c(dxjvVar2.b);
        c.b(dcdc.r(dchl.k(dxjvVar2.a, new dbrn(this) { // from class: ctvw
            private final ctvx a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return ctuq.a(this.a.a, (dxmq) obj);
            }
        })));
        return c.a();
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxjv> e(dehn<dxjm> dehnVar, dxjt dxjtVar) {
        final dxjt dxjtVar2 = dxjtVar;
        return deew.g(dehnVar, new defg(dxjtVar2) { // from class: ctvv
            private final dxjt a;

            {
                this.a = dxjtVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxjt dxjtVar3 = this.a;
                dxjm dxjmVar = (dxjm) obj;
                dyeu dyeuVar = dxjmVar.a;
                dyib<dxjt, dxjv> dyibVar = dxjn.c;
                if (dyibVar == null) {
                    synchronized (dxjn.class) {
                        dyibVar = dxjn.c;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.LighterBlock", "GetBlockedConversations");
                            c.e = true;
                            c.a = dyyq.b(dxjt.d);
                            c.b = dyyq.b(dxjv.c);
                            dyibVar = c.a();
                            dxjn.c = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxjmVar.b), dxjtVar3);
            }
        }, dege.a);
    }
}
