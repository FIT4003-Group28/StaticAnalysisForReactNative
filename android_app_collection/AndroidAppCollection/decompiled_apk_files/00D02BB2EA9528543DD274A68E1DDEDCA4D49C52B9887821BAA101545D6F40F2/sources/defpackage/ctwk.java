package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctwk  reason: default package */
/* loaded from: classes5.dex */
public final class ctwk implements ctxf<dxtz, dxub, ctfp, dxti> {
    private final ctyy a;
    private final Context b;
    private final Map<String, ctuk> c;

    public ctwk(ctyy ctyyVar, Context context, Map<String, ctuk> map) {
        this.a = ctyyVar;
        this.b = context;
        this.c = map;
    }

    @Override // defpackage.ctxf
    public final dehn<dxtz> a(dxwi dxwiVar) {
        dxty bZ = dxtz.b.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxwiVar.getClass();
        ((dxtz) bZ.b).a = dxwiVar;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(10);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, ctfp ctfpVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(10);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ ctfp d(dxub dxubVar) {
        dxub dxubVar2 = dxubVar;
        cteq cteqVar = new cteq();
        cteqVar.b(true);
        cteqVar.a(Collections.emptyList());
        dsrj<dxtx> dsrjVar = dxubVar2.a;
        ctyy ctyyVar = this.a;
        Context context = this.b;
        cteqVar.a = ctuv.b(dsrjVar, ctyyVar, context, this.c, ctog.a(context));
        cteqVar.a(ctuv.c(dxubVar2.a));
        cteqVar.b(dxubVar2.b);
        String str = cteqVar.a == null ? " tachyonMessages" : "";
        if (cteqVar.b == null) {
            str = str.concat(" ackIds");
        }
        if (cteqVar.c == null) {
            str = String.valueOf(str).concat(" pulledAll");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cter(cteqVar.a, cteqVar.b, cteqVar.c.booleanValue());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxub> e(dehn<dxti> dehnVar, dxtz dxtzVar) {
        final dxtz dxtzVar2 = dxtzVar;
        return deew.g(dehnVar, new defg(dxtzVar2) { // from class: ctwj
            private final dxtz a;

            {
                this.a = dxtzVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxtz dxtzVar3 = this.a;
                dxti dxtiVar = (dxti) obj;
                dyeu dyeuVar = dxtiVar.a;
                dyib<dxtz, dxub> dyibVar = dxtk.b;
                if (dyibVar == null) {
                    synchronized (dxtk.class) {
                        dyibVar = dxtk.b;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.Messaging", "PullMessages");
                            c.e = true;
                            c.a = dyyq.b(dxtz.b);
                            c.b = dyyq.b(dxub.c);
                            dyibVar = c.a();
                            dxtk.b = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxtiVar.b), dxtzVar3);
            }
        }, dege.a);
    }
}
