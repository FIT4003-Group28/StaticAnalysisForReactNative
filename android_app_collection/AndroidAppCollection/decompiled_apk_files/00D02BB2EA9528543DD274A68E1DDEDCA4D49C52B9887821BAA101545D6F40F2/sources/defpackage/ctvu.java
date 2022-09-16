package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctvu  reason: default package */
/* loaded from: classes5.dex */
public final class ctvu implements ctxf<dxlq, dxls, ctfd, dxlj> {
    private final dcdc<ConversationId> a;
    private final ctyy b;
    private final long c;

    public ctvu(dcdc<ConversationId> dcdcVar, long j, ctyy ctyyVar) {
        this.a = dcdcVar;
        this.b = ctyyVar;
        this.c = j;
    }

    @Override // defpackage.ctxf
    public final dehn<dxlq> a(dxwi dxwiVar) {
        dxlp bZ = dxlq.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxwiVar.getClass();
        ((dxlq) bZ.b).a = dxwiVar;
        dcdc a = cstr.a(this.a, ctvs.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxlq dxlqVar = (dxlq) bZ.b;
        dsrj<dxmq> dsrjVar = dxlqVar.b;
        if (!dsrjVar.a()) {
            dxlqVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(a, dxlqVar.b);
        long j = this.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxlq) bZ.b).c = j;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        dcdc<ConversationId> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ctxm r = ctxn.r();
            r.g(10003);
            r.n(this.b.b().e());
            r.o(this.b.c().J());
            r.p(uuid.toString());
            r.d(dcdcVar.get(i2));
            r.m(Integer.valueOf(dyjbVar.p.r));
            r.j(22);
            r.f(i);
            r.e(j);
            ctogVar.b(r.a());
        }
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, ctfd ctfdVar, ctog ctogVar, long j) {
        dcdc<ConversationId> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            ctxm r = ctxn.r();
            r.g(10003);
            r.n(this.b.b().e());
            r.o(this.b.c().J());
            r.p(uuid.toString());
            r.d(dcdcVar.get(i));
            r.j(22);
            r.f(1);
            r.e(j);
            ctogVar.b(r.a());
        }
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ ctfd d(dxls dxlsVar) {
        ctee cteeVar = new ctee();
        cteeVar.b = 2;
        cteeVar.a = Long.valueOf(dxlsVar.a);
        String str = cteeVar.a == null ? " timestampUsec" : "";
        if (cteeVar.b == 0) {
            str = str.concat(" status");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctef(cteeVar.a.longValue(), cteeVar.b);
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxls> e(dehn<dxlj> dehnVar, dxlq dxlqVar) {
        final dxlq dxlqVar2 = dxlqVar;
        return deew.g(dehnVar, new defg(dxlqVar2) { // from class: ctvt
            private final dxlq a;

            {
                this.a = dxlqVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxlq dxlqVar3 = this.a;
                dxlj dxljVar = (dxlj) obj;
                dyeu dyeuVar = dxljVar.a;
                dyib<dxlq, dxls> dyibVar = dxlk.c;
                if (dyibVar == null) {
                    synchronized (dxlk.class) {
                        dyibVar = dxlk.c;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "DeleteConversations");
                            c.e = true;
                            c.a = dyyq.b(dxlq.d);
                            c.b = dyyq.b(dxls.b);
                            dyibVar = c.a();
                            dxlk.c = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxljVar.b), dxlqVar3);
            }
        }, dege.a);
    }
}
