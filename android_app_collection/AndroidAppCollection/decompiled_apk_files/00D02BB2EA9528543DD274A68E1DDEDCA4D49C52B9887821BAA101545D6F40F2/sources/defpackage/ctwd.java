package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctwd  reason: default package */
/* loaded from: classes5.dex */
public final class ctwd implements ctxf<dxlu, dxlw, ctfl, dxlj> {
    private final ctyy a;
    private final int b;
    private final String c;
    private final Context d;
    private final Map<String, ctuk> e;
    private final ctxo f;

    public ctwd(ctyy ctyyVar, int i, String str, Context context, Map<String, ctuk> map, ctxo ctxoVar) {
        this.a = ctyyVar;
        this.b = i;
        this.c = str;
        this.d = context;
        this.e = map;
        this.f = ctxoVar;
    }

    @Override // defpackage.ctxf
    public final dehn<dxlu> a(dxwi dxwiVar) {
        dxlt bZ = dxlu.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxlu dxluVar = (dxlu) bZ.b;
        dxwiVar.getClass();
        dxluVar.a = dxwiVar;
        dxluVar.b = 0L;
        ((dxlu) bZ.b).c = 0L;
        int i = this.b;
        dxlu dxluVar2 = (dxlu) bZ.b;
        dxluVar2.d = i;
        dxluVar2.f = true;
        String str = this.c;
        if (str != null) {
            str.getClass();
            ((dxlu) bZ.b).e = str;
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
        r.j(24);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, ctfl ctflVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(24);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ ctfl d(dxlw dxlwVar) {
        dxlw dxlwVar2 = dxlwVar;
        ArrayList arrayList = new ArrayList();
        Iterator<dxku> it = dxlwVar2.a.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                ctem ctemVar = new ctem();
                String str2 = dxlwVar2.b;
                if (str2 == null) {
                    throw new NullPointerException("Null nextPageToken");
                }
                ctemVar.a = str2;
                ctemVar.b = dcdc.r(arrayList);
                if (ctemVar.a == null) {
                    str = " nextPageToken";
                }
                if (ctemVar.b == null) {
                    str = str.concat(" conversations");
                }
                if (str.isEmpty()) {
                    return new cten(ctemVar.a, ctemVar.b);
                }
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            dxku next = it.next();
            Context context = this.d;
            ctyy ctyyVar = this.a;
            Map<String, ctuk> map = this.e;
            ctxo ctxoVar = this.f;
            dccx F = dcdc.F();
            for (dxks dxksVar : next.b) {
                dbsg<cufb> a = ctun.a(dxksVar);
                if (a.a()) {
                    F.g(a.b());
                }
            }
            dccx F2 = dcdc.F();
            dxkw dxkwVar = next.c;
            if (dxkwVar == null) {
                dxkwVar = dxkw.b;
            }
            for (dxla dxlaVar : dxkwVar.a) {
                dbsg<cufh> a2 = ctuo.a(dxlaVar, ctyyVar, context, map, ctxoVar);
                if (a2.a()) {
                    F2.g(a2.b());
                }
            }
            cuct cuctVar = new cuct();
            dxmq dxmqVar = next.a;
            if (dxmqVar == null) {
                dxmqVar = dxmq.d;
            }
            ConversationId a3 = ctuq.a(ctyyVar, dxmqVar);
            if (a3 == null) {
                throw new NullPointerException("Null conversationId");
            }
            cuctVar.a = a3;
            cucv cucvVar = new cucv();
            dcdc<cufh> f = F2.f();
            if (f == null) {
                throw new NullPointerException("Null cloudMessages");
            }
            cucvVar.a = f;
            String str3 = cucvVar.a == null ? " cloudMessages" : str;
            if (!str3.isEmpty()) {
                throw new IllegalStateException(str3.length() != 0 ? "Missing required properties:".concat(str3) : new String("Missing required properties:"));
            }
            cuctVar.b = new cucw(cucvVar.a);
            dcdc<cufb> f2 = F.f();
            if (f2 == null) {
                throw new NullPointerException("Null annotations");
            }
            cuctVar.c = f2;
            if (cuctVar.a == null) {
                str = " conversationId";
            }
            if (cuctVar.b == null) {
                str = str.concat(" cloudConversationMetadata");
            }
            if (cuctVar.c == null) {
                str = String.valueOf(str).concat(" annotations");
            }
            if (!str.isEmpty()) {
                String valueOf2 = String.valueOf(str);
                throw new IllegalStateException(valueOf2.length() != 0 ? "Missing required properties:".concat(valueOf2) : new String("Missing required properties:"));
            }
            arrayList.add(new cucu(cuctVar.a, cuctVar.b, cuctVar.c));
        }
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxlw> e(dehn<dxlj> dehnVar, dxlu dxluVar) {
        final dxlu dxluVar2 = dxluVar;
        return deew.g(dehnVar, new defg(dxluVar2) { // from class: ctwc
            private final dxlu a;

            {
                this.a = dxluVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxlu dxluVar3 = this.a;
                dxlj dxljVar = (dxlj) obj;
                dyeu dyeuVar = dxljVar.a;
                dyib<dxlu, dxlw> dyibVar = dxlk.a;
                if (dyibVar == null) {
                    synchronized (dxlk.class) {
                        dyibVar = dxlk.a;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "ListConversations");
                            c.e = true;
                            c.a = dyyq.b(dxlu.g);
                            c.b = dyyq.b(dxlw.c);
                            dyibVar = c.a();
                            dxlk.a = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxljVar.b), dxluVar3);
            }
        }, dege.a);
    }
}
