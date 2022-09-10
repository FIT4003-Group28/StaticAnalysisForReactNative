package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.KeyPair;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ctwu  reason: default package */
/* loaded from: classes5.dex */
public final class ctwu implements ctxf<dxuy, dxva, ctfv, dxtm> {
    private final cttg a;
    private final ContactId b;
    private final csuo c;
    private final String d;
    private final csun e;
    private final dehn<KeyPair> f;

    public ctwu(ContactId contactId, csvf csvfVar, csuo csuoVar, String str, csun csunVar, dehn<KeyPair> dehnVar) {
        this.a = new cttg(csvfVar);
        this.b = contactId;
        this.c = csuoVar;
        this.d = str;
        this.e = csunVar;
        this.f = dehnVar;
    }

    @Override // defpackage.ctxf
    public final dehn<dxuy> a(final dxwi dxwiVar) {
        final cttg cttgVar = this.a;
        ContactId contactId = this.b;
        csuo csuoVar = this.c;
        final String str = this.d;
        csun csunVar = this.e;
        final dehn<KeyPair> dehnVar = this.f;
        final dxvs a = cttg.a(contactId);
        final dehn<String> d = cttg.d(csuoVar);
        final dehn<String> c = cttg.c(csunVar, a.b, a.c, null);
        return deha.m(d, dehnVar, c).b(new Callable(cttgVar, dxwiVar, a, d, str, c, dehnVar) { // from class: ctta
            private final cttg a;
            private final dxwi b;
            private final dxvs c;
            private final dehn d;
            private final String e;
            private final dehn f;
            private final dehn g;

            {
                this.a = cttgVar;
                this.b = dxwiVar;
                this.c = a;
                this.d = d;
                this.e = str;
                this.f = c;
                this.g = dehnVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cttg cttgVar2 = this.a;
                dxwi dxwiVar2 = this.b;
                dxvs dxvsVar = this.c;
                dehn dehnVar2 = this.d;
                String str2 = this.e;
                dehn dehnVar3 = this.f;
                dehn dehnVar4 = this.g;
                dxux bZ = dxuy.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dxuy dxuyVar = (dxuy) bZ.b;
                dxwiVar2.getClass();
                dxuyVar.a = dxwiVar2;
                dxvsVar.getClass();
                dxuyVar.b = dxvsVar;
                dxur b = cttgVar2.b((String) deha.r(dehnVar2), str2, (String) deha.r(dehnVar3), ((KeyPair) deha.r(dehnVar4)).getPublic());
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                b.getClass();
                ((dxuy) bZ.b).c = b;
                return bZ.bK();
            }
        }, dege.a);
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.b);
        r.p(uuid.toString());
        r.j(2);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, ctfv ctfvVar, ctog ctogVar, long j) {
        ctxn a;
        ctfv ctfvVar2 = ctfvVar;
        if (ctfvVar2.b().a()) {
            ctxm r = ctxn.r();
            r.g(10003);
            r.n(ctfvVar2.b().b().b().e());
            r.o(ctfvVar2.b().b().c().J());
            r.p(uuid.toString());
            r.j(2);
            r.f(1);
            r.e(j);
            a = r.a();
        } else {
            ctxm r2 = ctxn.r();
            r2.g(10003);
            r2.n(this.b);
            r2.p(uuid.toString());
            r2.j(2);
            r2.f(2);
            r2.e(j);
            a = r2.a();
        }
        ctogVar.b(a);
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ ctfv d(dxva dxvaVar) {
        dxva dxvaVar2 = dxvaVar;
        if (dxvaVar2.b != null) {
            try {
                boolean z = dxvaVar2.a;
                ctyv f = ctyy.f();
                ctza g = ctzb.g();
                g.f(this.b);
                f.f(g);
                f.d(dxvaVar2.c);
                f.e(z ? ctyx.VALID : ctyx.INVALID);
                ctyy a = f.a();
                ctzm f2 = ctzp.f();
                dxvm dxvmVar = dxvaVar2.b;
                if (dxvmVar == null) {
                    dxvmVar = dxvm.c;
                }
                f2.c(cstp.b(dxvmVar.a.G()));
                f2.d((KeyPair) deha.r(this.f));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                cstd.a();
                long micros = timeUnit.toMicros(System.currentTimeMillis());
                dxvm dxvmVar2 = dxvaVar2.b;
                if (dxvmVar2 == null) {
                    dxvmVar2 = dxvm.c;
                }
                ((cucn) f2).a = Long.valueOf(micros + dxvmVar2.b);
                cstd.a();
                ((cucn) f2).b = Long.valueOf(System.currentTimeMillis());
                ctzp a2 = f2.a();
                ctfu d = ctfv.d();
                d.c(true != z ? 2 : 0);
                d.d(a);
                d.b(a2);
                return d.a();
            } catch (ExecutionException unused) {
                cstl.a("RegRpcHandler");
            }
        }
        ctfu d2 = ctfv.d();
        d2.c(1);
        return d2.a();
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxva> e(dehn<dxtm> dehnVar, dxuy dxuyVar) {
        final dxuy dxuyVar2 = dxuyVar;
        return deew.g(dehnVar, new defg(dxuyVar2) { // from class: ctwt
            private final dxuy a;

            {
                this.a = dxuyVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxuy dxuyVar3 = this.a;
                dxtm dxtmVar = (dxtm) obj;
                dyeu dyeuVar = dxtmVar.a;
                dyib<dxuy, dxva> dyibVar = dxtn.a;
                if (dyibVar == null) {
                    synchronized (dxtn.class) {
                        dyibVar = dxtn.a;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.Registration", "Register");
                            c.e = true;
                            c.a = dyyq.b(dxuy.d);
                            c.b = dyyq.b(dxva.d);
                            dyibVar = c.a();
                            dxtn.a = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxtmVar.b), dxuyVar3);
            }
        }, dege.a);
    }
}
