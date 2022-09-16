package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctvp  reason: default package */
/* loaded from: classes5.dex */
public final class ctvp implements ctxf<dxlm, dxlo, ctfj, dxlj> {
    private final long a;
    private final ctyy b;

    public ctvp(long j, ctyy ctyyVar) {
        this.a = j;
        this.b = ctyyVar;
    }

    @Override // defpackage.ctxf
    public final dehn<dxlm> a(dxwi dxwiVar) {
        dxll bZ = dxlm.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxlm dxlmVar = (dxlm) bZ.b;
        dxwiVar.getClass();
        dxlmVar.a = dxwiVar;
        dxlmVar.b = this.a;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.b.b().e());
        r.o(this.b.c().J());
        r.p(uuid.toString());
        r.j(25);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, ctfj ctfjVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.b.b().e());
        r.o(this.b.c().J());
        r.p(uuid.toString());
        r.j(25);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ ctfj d(dxlo dxloVar) {
        dxlo dxloVar2 = dxloVar;
        ctek ctekVar = new ctek();
        ctekVar.a = Long.valueOf(dxloVar2.b);
        int i = dxloVar2.a;
        int i2 = 2;
        int i3 = 1;
        if (i != 0) {
            i2 = i != 1 ? i != 2 ? 0 : 4 : 3;
        }
        if (i2 != 0) {
            i3 = i2;
        }
        ctekVar.b = Integer.valueOf(dxom.a(i3));
        String str = ctekVar.a == null ? " earliestCloudMessageTimestampUs" : "";
        if (ctekVar.b == null) {
            str = str.concat(" resultType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctel(ctekVar.a.longValue(), ctekVar.b.intValue());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxlo> e(dehn<dxlj> dehnVar, dxlm dxlmVar) {
        final dxlm dxlmVar2 = dxlmVar;
        return deew.g(dehnVar, new defg(dxlmVar2) { // from class: ctvo
            private final dxlm a;

            {
                this.a = dxlmVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxlm dxlmVar3 = this.a;
                dxlj dxljVar = (dxlj) obj;
                dyeu dyeuVar = dxljVar.a;
                dyib<dxlm, dxlo> dyibVar = dxlk.d;
                if (dyibVar == null) {
                    synchronized (dxlk.class) {
                        dyibVar = dxlk.d;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "CheckBootstrapRequired");
                            c.e = true;
                            c.a = dyyq.b(dxlm.c);
                            c.b = dyyq.b(dxlo.c);
                            dyibVar = c.a();
                            dxlk.d = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxljVar.b), dxlmVar3);
            }
        }, dege.a);
    }
}
