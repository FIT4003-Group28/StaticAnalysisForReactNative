package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.KeyPair;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ctxc  reason: default package */
/* loaded from: classes5.dex */
public final class ctxc implements ctxf<dxvc, dxve, ctfv, dxtm> {
    private final cttg a;
    private final ContactId b;
    private final csuo c;
    private final String d;
    private final csun e;
    private final dehn<KeyPair> f;

    public ctxc(ContactId contactId, csvf csvfVar, csuo csuoVar, String str, csun csunVar, dehn<KeyPair> dehnVar) {
        this.a = new cttg(csvfVar);
        this.b = contactId;
        this.c = csuoVar;
        this.d = str;
        this.e = csunVar;
        this.f = dehnVar;
    }

    @Override // defpackage.ctxf
    public final dehn<dxvc> a(final dxwi dxwiVar) {
        final cttg cttgVar = this.a;
        final ContactId contactId = this.b;
        csuo csuoVar = this.c;
        final String str = this.d;
        csun csunVar = this.e;
        final dehn<KeyPair> dehnVar = this.f;
        dxvs a = cttg.a(contactId);
        final dehn<String> d = cttg.d(csuoVar);
        final dehn<String> c = cttg.c(csunVar, null, a.c, ctuf.a(dxwiVar.a));
        return deha.m(d, dehnVar, c).b(new Callable(cttgVar, dxwiVar, contactId, d, str, c, dehnVar) { // from class: cttb
            private final cttg a;
            private final dxwi b;
            private final ContactId c;
            private final dehn d;
            private final String e;
            private final dehn f;
            private final dehn g;

            {
                this.a = cttgVar;
                this.b = dxwiVar;
                this.c = contactId;
                this.d = d;
                this.e = str;
                this.f = c;
                this.g = dehnVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cttg cttgVar2 = this.a;
                dxwi dxwiVar2 = this.b;
                ContactId contactId2 = this.c;
                dehn dehnVar2 = this.d;
                String str2 = this.e;
                dehn dehnVar3 = this.f;
                dehn dehnVar4 = this.g;
                dxvb bZ = dxvc.e.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dxwiVar2.getClass();
                ((dxvc) bZ.b).a = dxwiVar2;
                String b = contactId2.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                b.getClass();
                ((dxvc) bZ.b).d = b;
                ((dxvc) bZ.b).c = eacv.a(2);
                dxur b2 = cttgVar2.b((String) deha.r(dehnVar2), str2, (String) deha.r(dehnVar3), ((KeyPair) deha.r(dehnVar4)).getPublic());
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                b2.getClass();
                ((dxvc) bZ.b).b = b2;
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
        r.j(3);
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
            r.j(3);
            r.f(1);
            r.e(j);
            a = r.a();
        } else {
            ctxm r2 = ctxn.r();
            r2.g(10003);
            r2.n(this.b);
            r2.p(uuid.toString());
            r2.j(3);
            r2.f(2);
            r2.e(j);
            a = r2.a();
        }
        ctogVar.b(a);
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ ctfv d(dxve dxveVar) {
        dxve dxveVar2 = dxveVar;
        if (dxveVar2.b != null) {
            try {
                ctyv f = ctyy.f();
                ctza g = ctzb.g();
                g.f(this.b);
                f.f(g);
                f.d(dxveVar2.a);
                f.e(ctyx.VALID);
                ctyy a = f.a();
                ctzm f2 = ctzp.f();
                dxvm dxvmVar = dxveVar2.b;
                if (dxvmVar == null) {
                    dxvmVar = dxvm.c;
                }
                f2.c(cstp.b(dxvmVar.a.G()));
                f2.d((KeyPair) deha.r(this.f));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                cstd.a();
                long micros = timeUnit.toMicros(System.currentTimeMillis());
                dxvm dxvmVar2 = dxveVar2.b;
                if (dxvmVar2 == null) {
                    dxvmVar2 = dxvm.c;
                }
                ((cucn) f2).a = Long.valueOf(micros + dxvmVar2.b);
                cstd.a();
                ((cucn) f2).b = Long.valueOf(System.currentTimeMillis());
                ctzp a2 = f2.a();
                ctfu d = ctfv.d();
                d.c(0);
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
    public final /* bridge */ /* synthetic */ dehn<dxve> e(dehn<dxtm> dehnVar, dxvc dxvcVar) {
        final dxvc dxvcVar2 = dxvcVar;
        return this.b.c() != ContactId.ContactType.EMAIL ? deha.b(new dyjd(dyjb.e)) : deew.g(dehnVar, new defg(dxvcVar2) { // from class: ctxb
            private final dxvc a;

            {
                this.a = dxvcVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxvc dxvcVar3 = this.a;
                dxtm dxtmVar = (dxtm) obj;
                dyeu dyeuVar = dxtmVar.a;
                dyib<dxvc, dxve> dyibVar = dxtn.d;
                if (dyibVar == null) {
                    synchronized (dxtn.class) {
                        dyibVar = dxtn.d;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.Registration", "SignInGaia");
                            c.e = true;
                            c.a = dyyq.b(dxvc.e);
                            c.b = dyyq.b(dxve.c);
                            dyibVar = c.a();
                            dxtn.d = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxtmVar.b), dxvcVar3);
            }
        }, dege.a);
    }
}
