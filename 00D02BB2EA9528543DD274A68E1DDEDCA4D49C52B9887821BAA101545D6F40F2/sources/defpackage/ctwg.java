package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctwg  reason: default package */
/* loaded from: classes5.dex */
public final class ctwg implements ctxf<dxly, dxma, ctfn, dxlj> {
    private final ctyy a;
    private final int b;
    private final dcdc<ConversationId> c;
    private final String d;
    private final Context e;
    private final Map<String, ctuk> f;
    private final ctxo g;

    public ctwg(ctyy ctyyVar, int i, String str, dcdc<ConversationId> dcdcVar, Context context, Map<String, ctuk> map, ctxo ctxoVar) {
        this.a = ctyyVar;
        this.b = i;
        this.c = dcdcVar;
        this.d = str;
        this.e = context;
        this.f = map;
        this.g = ctxoVar;
    }

    @Override // defpackage.ctxf
    public final dehn<dxly> a(dxwi dxwiVar) {
        dxlx bZ = dxly.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxwiVar.getClass();
        ((dxly) bZ.b).a = dxwiVar;
        dcdc a = cstr.a(this.c, ctwe.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxly dxlyVar = (dxly) bZ.b;
        dsrj<dxmq> dsrjVar = dxlyVar.b;
        if (!dsrjVar.a()) {
            dxlyVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(a, dxlyVar.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxly) bZ.b).c = 0L;
        ((dxly) bZ.b).d = 0L;
        int i = this.b;
        dxly dxlyVar2 = (dxly) bZ.b;
        dxlyVar2.e = i;
        String str = this.d;
        if (str != null) {
            str.getClass();
            dxlyVar2.f = str;
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
        r.j(26);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, ctfn ctfnVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(26);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ ctfn d(dxma dxmaVar) {
        dxma dxmaVar2 = dxmaVar;
        dccx F = dcdc.F();
        for (dxla dxlaVar : dxmaVar2.a) {
            dbsg<cufh> a = ctuo.a(dxlaVar, this.a, this.e, this.f, this.g);
            if (a.a()) {
                F.g(a.b());
            }
        }
        cteo cteoVar = new cteo();
        dcdc<cufh> f = F.f();
        if (f != null) {
            cteoVar.b = f;
            String str = dxmaVar2.b;
            if (str == null) {
                throw new NullPointerException("Null nextPageToken");
            }
            cteoVar.a = str;
            String str2 = cteoVar.a == null ? " nextPageToken" : "";
            if (cteoVar.b == null) {
                str2 = str2.concat(" messages");
            }
            if (str2.isEmpty()) {
                return new ctep(cteoVar.a, cteoVar.b);
            }
            String valueOf = String.valueOf(str2);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null messages");
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxma> e(dehn<dxlj> dehnVar, dxly dxlyVar) {
        final dxly dxlyVar2 = dxlyVar;
        return deew.g(dehnVar, new defg(dxlyVar2) { // from class: ctwf
            private final dxly a;

            {
                this.a = dxlyVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxly dxlyVar3 = this.a;
                dxlj dxljVar = (dxlj) obj;
                dyeu dyeuVar = dxljVar.a;
                dyib<dxly, dxma> dyibVar = dxlk.b;
                if (dyibVar == null) {
                    synchronized (dxlk.class) {
                        dyibVar = dxlk.b;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "ListMessages");
                            c.e = true;
                            c.a = dyyq.b(dxly.g);
                            c.b = dyyq.b(dxma.c);
                            dyibVar = c.a();
                            dxlk.b = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxljVar.b), dxlyVar3);
            }
        }, dege.a);
    }
}
