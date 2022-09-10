package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctxh  reason: default package */
/* loaded from: classes5.dex */
public final class ctxh implements ctxf<dxjx, dxjz, Void, dxjm> {
    private final ctyy a;
    private final ConversationId b;

    public ctxh(ctyy ctyyVar, ConversationId conversationId) {
        this.a = ctyyVar;
        this.b = conversationId;
    }

    @Override // defpackage.ctxf
    public final dehn<dxjx> a(dxwi dxwiVar) {
        dxjw bZ = dxjx.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxwiVar.getClass();
        ((dxjx) bZ.b).a = dxwiVar;
        dxmq b = ctuq.b(this.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        b.getClass();
        ((dxjx) bZ.b).b = b;
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
        r.j(7);
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
        r.j(7);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ Void d(dxjz dxjzVar) {
        return null;
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxjz> e(dehn<dxjm> dehnVar, dxjx dxjxVar) {
        final dxjx dxjxVar2 = dxjxVar;
        return deew.g(dehnVar, new defg(dxjxVar2) { // from class: ctxg
            private final dxjx a;

            {
                this.a = dxjxVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxjx dxjxVar3 = this.a;
                dxjm dxjmVar = (dxjm) obj;
                dyeu dyeuVar = dxjmVar.a;
                dyib<dxjx, dxjz> dyibVar = dxjn.b;
                if (dyibVar == null) {
                    synchronized (dxjn.class) {
                        dyibVar = dxjn.b;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.LighterBlock", "UnblockConversation");
                            c.e = true;
                            c.a = dyyq.b(dxjx.c);
                            c.b = dyyq.b(dxjz.a);
                            dyibVar = c.a();
                            dxjn.b = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxjmVar.b), dxjxVar3);
            }
        }, dege.a);
    }
}
