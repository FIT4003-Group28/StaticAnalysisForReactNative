package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctvn  reason: default package */
/* loaded from: classes5.dex */
public final class ctvn implements ctxf<dxjp, dxjr, Void, dxjm> {
    private final ctyy a;
    private final ConversationId b;
    private final boolean c;

    public ctvn(ctyy ctyyVar, ConversationId conversationId, boolean z) {
        this.a = ctyyVar;
        this.b = conversationId;
        this.c = z;
    }

    @Override // defpackage.ctxf
    public final dehn<dxjp> a(dxwi dxwiVar) {
        dxjo bZ = dxjp.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxjp dxjpVar = (dxjp) bZ.b;
        dxwiVar.getClass();
        dxjpVar.a = dxwiVar;
        dxjpVar.c = this.c;
        dxmq b = ctuq.b(this.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        b.getClass();
        ((dxjp) bZ.b).b = b;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.d(this.b);
        r.j(6);
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
        r.d(this.b);
        r.j(6);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ Void d(dxjr dxjrVar) {
        return null;
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxjr> e(dehn<dxjm> dehnVar, dxjp dxjpVar) {
        final dxjp dxjpVar2 = dxjpVar;
        return deew.g(dehnVar, new defg(dxjpVar2) { // from class: ctvm
            private final dxjp a;

            {
                this.a = dxjpVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxjp dxjpVar3 = this.a;
                dxjm dxjmVar = (dxjm) obj;
                dyeu dyeuVar = dxjmVar.a;
                dyib<dxjp, dxjr> dyibVar = dxjn.a;
                if (dyibVar == null) {
                    synchronized (dxjn.class) {
                        dyibVar = dxjn.a;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.LighterBlock", "BlockConversation");
                            c.e = true;
                            c.a = dyyq.b(dxjp.d);
                            c.b = dyyq.b(dxjr.a);
                            dyibVar = c.a();
                            dxjn.a = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxjmVar.b), dxjpVar3);
            }
        }, dege.a);
    }
}
