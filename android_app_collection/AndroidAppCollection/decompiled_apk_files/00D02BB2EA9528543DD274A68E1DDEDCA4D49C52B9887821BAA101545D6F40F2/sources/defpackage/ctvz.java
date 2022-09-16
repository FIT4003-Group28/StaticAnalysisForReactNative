package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctvz  reason: default package */
/* loaded from: classes5.dex */
public final class ctvz implements ctxf<dxke, dxkg, ctff, dxkb> {
    private final ctyy a;
    private final ConversationId b;
    private final csvf c;

    public ctvz(ctyy ctyyVar, ConversationId conversationId, csvf csvfVar) {
        this.a = ctyyVar;
        this.b = conversationId;
        this.c = csvfVar;
    }

    @Override // defpackage.ctxf
    public final dehn<dxke> a(dxwi dxwiVar) {
        dxkd bZ = dxke.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxwiVar.getClass();
        ((dxke) bZ.b).a = dxwiVar;
        dxmq b = ctuq.b(this.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        b.getClass();
        ((dxke) bZ.b).d = b;
        dspd c = this.a.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        c.getClass();
        ((dxke) bZ.b).b = c;
        List<Integer> c2 = this.c.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxke dxkeVar = (dxke) bZ.b;
        dsrf dsrfVar = dxkeVar.c;
        if (!dsrfVar.a()) {
            dxkeVar.c = dsqw.cg(dsrfVar);
        }
        for (Integer num : c2) {
            dxkeVar.c.h(num.intValue());
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
        r.j(21);
        r.f(i);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, ctff ctffVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(21);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ ctff d(dxkg dxkgVar) {
        cteg ctegVar = new cteg();
        dxki dxkiVar = dxkgVar.a;
        if (dxkiVar == null) {
            dxkiVar = dxki.b;
        }
        ctegVar.a = dcdc.r(dxkiVar.a);
        String str = ctegVar.a == null ? " conversationCapabilities" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cteh(ctegVar.a);
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxkg> e(dehn<dxkb> dehnVar, dxke dxkeVar) {
        final dxke dxkeVar2 = dxkeVar;
        return deew.g(dehnVar, new defg(dxkeVar2) { // from class: ctvy
            private final dxke a;

            {
                this.a = dxkeVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxke dxkeVar3 = this.a;
                dxkb dxkbVar = (dxkb) obj;
                dyeu dyeuVar = dxkbVar.a;
                dyib<dxke, dxkg> dyibVar = dxkc.b;
                if (dyibVar == null) {
                    synchronized (dxkc.class) {
                        dyibVar = dxkc.b;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.LighterCapabilities", "GetConversationProperties");
                            c.e = true;
                            c.a = dyyq.b(dxke.e);
                            c.b = dyyq.b(dxkg.b);
                            dyibVar = c.a();
                            dxkc.b = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxkbVar.b), dxkeVar3);
            }
        }, dege.a);
    }
}
