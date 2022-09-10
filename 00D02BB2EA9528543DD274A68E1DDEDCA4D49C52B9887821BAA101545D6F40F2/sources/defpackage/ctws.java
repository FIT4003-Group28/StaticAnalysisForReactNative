package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.KeyPair;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ctws  reason: default package */
/* loaded from: classes5.dex */
public final class ctws implements ctxf<dxuu, dxuw, ctft, dxtm> {
    private final ctyy a;
    private final cttg b;
    private final csuo c;
    private final String d;
    private final KeyPair e;
    private final long f;

    public ctws(ctyy ctyyVar, csvf csvfVar, csuo csuoVar, String str, KeyPair keyPair, long j) {
        this.a = ctyyVar;
        this.b = new cttg(csvfVar);
        this.c = csuoVar;
        this.d = str;
        this.e = keyPair;
        this.f = j;
    }

    @Override // defpackage.ctxf
    public final dehn<dxuu> a(final dxwi dxwiVar) {
        final cttg cttgVar = this.b;
        ContactId e = this.a.b().e();
        csuo csuoVar = this.c;
        final String str = this.d;
        final long j = this.f;
        final KeyPair keyPair = this.e;
        final dxvs a = cttg.a(e);
        final dehn<String> d = cttg.d(csuoVar);
        return deha.m(d).b(new Callable(cttgVar, dxwiVar, j, keyPair, a, d, str) { // from class: cttc
            private final cttg a;
            private final dxwi b;
            private final long c;
            private final KeyPair d;
            private final dxvs e;
            private final dehn f;
            private final String g;

            {
                this.a = cttgVar;
                this.b = dxwiVar;
                this.c = j;
                this.d = keyPair;
                this.e = a;
                this.f = d;
                this.g = str;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cttg cttgVar2 = this.a;
                dxwi dxwiVar2 = this.b;
                long j2 = this.c;
                KeyPair keyPair2 = this.d;
                dxvs dxvsVar = this.e;
                dehn dehnVar = this.f;
                String str2 = this.g;
                dspd a2 = csvm.a(String.format(Locale.US, "%s:%d", ctuf.a(dxwiVar2.a).toString().toLowerCase(Locale.US), Long.valueOf(j2)), keyPair2);
                dxus bZ = dxuu.g.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dxuu dxuuVar = (dxuu) bZ.b;
                dxuuVar.c = j2;
                dxwiVar2.getClass();
                dxuuVar.a = dxwiVar2;
                dxvsVar.getClass();
                dxuuVar.b = dxvsVar;
                dxur b = cttgVar2.b((String) deha.r(dehnVar), str2, null, keyPair2.getPublic());
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                b.getClass();
                ((dxuu) bZ.b).f = b;
                if (a2 == null) {
                    return bZ.bK();
                }
                ((dxuu) bZ.b).d = dxut.a(4);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                a2.getClass();
                ((dxuu) bZ.b).e = a2;
                return bZ.bK();
            }
        }, dege.a);
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(1);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, ctft ctftVar, ctog ctogVar, long j) {
        ctft ctftVar2 = ctftVar;
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(ctftVar2.a().b().b().e());
        r.o(ctftVar2.a().b().c().J());
        r.p(uuid.toString());
        r.e(j);
        if (ctftVar2.d() == 2 && ctftVar2.a().a()) {
            r.j(1);
            r.f(1);
        } else if (ctftVar2.d() == 4) {
            r.j(1);
            r.f(3);
        } else {
            r.n(this.a.b().e());
            r.o(this.a.c().J());
            r.j(1);
            r.f(2);
        }
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ ctft d(dxuw dxuwVar) {
        dxuw dxuwVar2 = dxuwVar;
        if (dxuwVar2.a == null) {
            if (!dxuwVar2.b) {
                ctfs e = ctft.e();
                ((cteu) e).d = 3;
                return e.a();
            }
            cstl.a("RegRefreshRpcHandler");
            ctfs e2 = ctft.e();
            cteu cteuVar = (cteu) e2;
            cteuVar.d = 4;
            cteuVar.c = dbsg.i(Long.valueOf(dxuwVar2.c));
            return e2.a();
        }
        ctyv f = ctyy.f();
        ctza g = ctzb.g();
        g.f(this.a.b().e());
        f.f(g);
        f.d(dxuwVar2.d);
        f.e(ctyx.VALID);
        ctyy a = f.a();
        ctzm f2 = ctzp.f();
        dxvm dxvmVar = dxuwVar2.a;
        if (dxvmVar == null) {
            dxvmVar = dxvm.c;
        }
        f2.c(cstp.b(dxvmVar.a.G()));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cstd.a();
        long micros = timeUnit.toMicros(System.currentTimeMillis());
        dxvm dxvmVar2 = dxuwVar2.a;
        if (dxvmVar2 == null) {
            dxvmVar2 = dxvm.c;
        }
        Long valueOf = Long.valueOf(micros + dxvmVar2.b);
        cucn cucnVar = (cucn) f2;
        cucnVar.a = valueOf;
        cstd.a();
        cucnVar.b = Long.valueOf(System.currentTimeMillis());
        f2.d(this.e);
        ctzp a2 = f2.a();
        ctfs e3 = ctft.e();
        cteu cteuVar2 = (cteu) e3;
        cteuVar2.d = 2;
        cteuVar2.a = dbsg.i(a);
        cteuVar2.b = dbsg.i(a2);
        return e3.a();
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxuw> e(dehn<dxtm> dehnVar, dxuu dxuuVar) {
        final dxuu dxuuVar2 = dxuuVar;
        return deew.g(dehnVar, new defg(dxuuVar2) { // from class: ctwr
            private final dxuu a;

            {
                this.a = dxuuVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxuu dxuuVar3 = this.a;
                dxtm dxtmVar = (dxtm) obj;
                dyeu dyeuVar = dxtmVar.a;
                dyib<dxuu, dxuw> dyibVar = dxtn.b;
                if (dyibVar == null) {
                    synchronized (dxtn.class) {
                        dyibVar = dxtn.b;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.Registration", "RegisterRefresh");
                            c.e = true;
                            c.a = dyyq.b(dxuu.g);
                            c.b = dyyq.b(dxuw.e);
                            dyibVar = c.a();
                            dxtn.b = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxtmVar.b), dxuuVar3);
            }
        }, dege.a);
    }
}
