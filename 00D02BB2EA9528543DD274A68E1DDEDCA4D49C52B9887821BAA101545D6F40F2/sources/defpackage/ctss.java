package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ctss  reason: default package */
/* loaded from: classes5.dex */
public final class ctss {
    public final Context a;
    public final ctmu b;
    public final ctog c;
    public final ctto d;
    public ctec e;
    public csup f;
    public final Map<String, String> g;

    public ctss(Context context, aqan aqanVar, ctmu ctmuVar, cuim cuimVar) {
        ctto cttoVar = new ctto(context, aqanVar, cuimVar);
        this.g = new HashMap();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.d = cttoVar;
        this.b = ctmuVar;
        this.c = ctog.a(applicationContext);
    }

    public static final <ResultT> dehn<ResultT> h(defg<Void, ResultT> defgVar) {
        try {
            return defgVar.a(null);
        } catch (Exception e) {
            return deha.b(e);
        }
    }

    private final <RequestT, ResponseT, ResultT, StubT> dehn<ResultT> l(final UUID uuid, final int i, final ctxf<RequestT, ResponseT, ResultT, StubT> ctxfVar, final dehn<ctsu<StubT>> dehnVar, final ContactId contactId, ctmn ctmnVar, final boolean z, final ctyy ctyyVar, final ctzp ctzpVar) {
        dehn<Boolean> n;
        cstq.a();
        if (!cswe.a(this.a).aq.f().booleanValue()) {
            cstq.a();
            if (this.e == null) {
                return deha.b(new RuntimeException("tachyonRegistrationHandler is null"));
            }
            if (this.f == null) {
                return deha.b(new RuntimeException("oAuthTokenProvider is null"));
            }
            final dehn<ResultT> j = j(d(uuid, i, ctxfVar, z ? e(dehnVar, contactId) : dehnVar, ctyyVar, ctzpVar), contactId, 6);
            if (i == 1 || i == 2) {
                n = n(j, contactId, z);
            } else if (i != 0 || ctyyVar == null) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Invalid RequestType: ");
                sb.append(i);
                return deha.b(new RuntimeException(sb.toString()));
            } else {
                n = f(j, ctyyVar, z);
            }
            final dehn<Boolean> dehnVar2 = n;
            dehn<ResultT> a = deha.k(dehnVar2).a(new deff(this, dehnVar2, uuid, i, ctxfVar, z, dehnVar, contactId, ctyyVar, ctzpVar, j) { // from class: ctsf
                private final ctss a;
                private final dehn b;
                private final UUID c;
                private final int d;
                private final ctxf e;
                private final boolean f;
                private final dehn g;
                private final ContactId h;
                private final ctyy i;
                private final ctzp j;
                private final dehn k;

                {
                    this.a = this;
                    this.b = dehnVar2;
                    this.c = uuid;
                    this.d = i;
                    this.e = ctxfVar;
                    this.f = z;
                    this.g = dehnVar;
                    this.h = contactId;
                    this.i = ctyyVar;
                    this.j = ctzpVar;
                    this.k = j;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    ctss ctssVar = this.a;
                    dehn dehnVar3 = this.b;
                    UUID uuid2 = this.c;
                    int i2 = this.d;
                    ctxf ctxfVar2 = this.e;
                    boolean z2 = this.f;
                    dehn dehnVar4 = this.g;
                    ContactId contactId2 = this.h;
                    ctyy ctyyVar2 = this.i;
                    ctzp ctzpVar2 = this.j;
                    dehn dehnVar5 = this.k;
                    if (((Boolean) deha.r(dehnVar3)).booleanValue()) {
                        if (z2) {
                            dehnVar4 = ctssVar.e(dehnVar4, contactId2);
                        }
                        return ctssVar.d(uuid2, i2, ctxfVar2, dehnVar4, ctyyVar2, ctzpVar2);
                    }
                    return dehnVar5;
                }
            }, dege.a);
            return ctmnVar.b().a() == 0 ? a : g(a, new ctso(this, ctmnVar, uuid, i, ctxfVar, z, dehnVar, contactId, ctyyVar, ctzpVar));
        }
        return c(ctyyVar, contactId, new defg(this, uuid, i, ctxfVar, z, dehnVar, contactId, ctyyVar, ctzpVar) { // from class: ctsh
            private final ctss a;
            private final UUID b;
            private final int c;
            private final ctxf d;
            private final boolean e;
            private final dehn f;
            private final ContactId g;
            private final ctyy h;
            private final ctzp i;

            {
                this.a = this;
                this.b = uuid;
                this.c = i;
                this.d = ctxfVar;
                this.e = z;
                this.f = dehnVar;
                this.g = contactId;
                this.h = ctyyVar;
                this.i = ctzpVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                ctss ctssVar = this.a;
                UUID uuid2 = this.b;
                int i2 = this.c;
                ctxf ctxfVar2 = this.d;
                boolean z2 = this.e;
                dehn dehnVar3 = this.f;
                ContactId contactId2 = this.g;
                Void r10 = (Void) obj;
                return ctssVar.d(uuid2, i2, ctxfVar2, z2 ? ctssVar.e(dehnVar3, contactId2) : dehnVar3, this.h, this.i);
            }
        }, i, ctmnVar, z);
    }

    private final <RequestT> dehn<RequestT> m(final UUID uuid, final dbrn<dxwi, dehn<RequestT>> dbrnVar, final ctyy ctyyVar) {
        final dehn f = deha.f(new deff(this, ctyyVar) { // from class: ctrs
            private final ctss a;
            private final ctyy b;

            {
                this.a = this;
                this.b = ctyyVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                ctss ctssVar = this.a;
                return ctssVar.e.d(this.b, false);
            }
        }, dege.a);
        return deha.m(f).a(new deff(this, f, dbrnVar, uuid, ctyyVar) { // from class: ctrt
            private final ctss a;
            private final dehn b;
            private final dbrn c;
            private final UUID d;
            private final ctyy e;

            {
                this.a = this;
                this.b = f;
                this.c = dbrnVar;
                this.d = uuid;
                this.e = ctyyVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                ctss ctssVar = this.a;
                dehn dehnVar = this.b;
                dbrn dbrnVar2 = this.c;
                UUID uuid2 = this.d;
                ctyy ctyyVar2 = this.e;
                ctzp ctzpVar = (ctzp) deha.r(dehnVar);
                if (ctzpVar == null) {
                    return deha.b(new dyjc(dyjb.i));
                }
                dxwh b = ctth.b(ctssVar.a, deca.c(ctzpVar.a()), uuid2);
                dxvs a = ctum.a(ctyyVar2.b().e());
                if (b.c) {
                    b.bF();
                    b.c = false;
                }
                dxwi dxwiVar = dxwi.e;
                a.getClass();
                ((dxwi) b.b).d = a;
                return (dehn) dbrnVar2.a(b.bK());
            }
        }, dege.a);
    }

    private final <ResultT> dehn<Boolean> n(final dehn<ResultT> dehnVar, final ContactId contactId, final boolean z) {
        return deha.k(dehnVar).a(new deff(this, dehnVar, contactId, z) { // from class: ctrv
            private final ctss a;
            private final dehn b;
            private final ContactId c;
            private final boolean d;

            {
                this.a = this;
                this.b = dehnVar;
                this.c = contactId;
                this.d = z;
            }

            @Override // defpackage.deff
            public final dehn a() {
                ctss ctssVar = this.a;
                dehn dehnVar2 = this.b;
                ContactId contactId2 = this.c;
                boolean z2 = this.d;
                try {
                    deha.r(dehnVar2);
                } catch (Throwable th) {
                    if (dyjb.c(th).p == dyjb.i.p) {
                        if (contactId2.c() == ContactId.ContactType.EMAIL && z2) {
                            try {
                                String remove = ctssVar.g.remove(contactId2.a());
                                if (!TextUtils.isEmpty(remove)) {
                                    ctssVar.f.a(remove);
                                }
                            } catch (Exception e) {
                                String valueOf = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                                sb.append("Failed to clear OAuth token with Exception: ");
                                sb.append(valueOf);
                                sb.toString();
                                cstl.a("Backend");
                            }
                        }
                        return deha.a(true);
                    }
                }
                return deha.a(false);
            }
        }, dege.a);
    }

    public final <RequestT, ResponseT, ResultT, StubT> dehn<ResultT> a(UUID uuid, ctxf<RequestT, ResponseT, ResultT, StubT> ctxfVar, dehn<ctsu<StubT>> dehnVar, ctyy ctyyVar, ctmn ctmnVar, boolean z) {
        return l(uuid, 0, ctxfVar, dehnVar, ctyyVar.b().e(), ctmnVar, z, ctyyVar, null);
    }

    public final <RequestT, ResponseT, ResultT, StubT> dehn<ResultT> b(UUID uuid, ctxf<RequestT, ResponseT, ResultT, StubT> ctxfVar, dehn<ctsu<StubT>> dehnVar, ContactId contactId, ctmn ctmnVar, boolean z) {
        return l(uuid, 1, ctxfVar, dehnVar, contactId, ctmnVar, z, null, null);
    }

    public final <ResultT> dehn<ResultT> c(final ctyy ctyyVar, final ContactId contactId, final defg<Void, ResultT> defgVar, int i, ctmn ctmnVar, boolean z) {
        if (this.e == null) {
            return deha.b(new RuntimeException("tachyonRegistrationHandler is null"));
        }
        if (this.f == null) {
            return deha.b(new RuntimeException("oAuthTokenProvider is null"));
        }
        final dehn<ResultT> j = j(h(defgVar), contactId, 6);
        if (z) {
            final dehn a = deha.k(j).a(new deff(this, j, contactId, ctyyVar) { // from class: ctry
                private final ctss a;
                private final dehn b;
                private final ContactId c;
                private final ctyy d;

                {
                    this.a = this;
                    this.b = j;
                    this.c = contactId;
                    this.d = ctyyVar;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    ctss ctssVar = this.a;
                    dehn dehnVar = this.b;
                    ContactId contactId2 = this.c;
                    ctyy ctyyVar2 = this.d;
                    try {
                        deha.r(dehnVar);
                    } catch (Throwable th) {
                        if (dyjb.c(th).p == dyjb.i.p && contactId2.c() == ContactId.ContactType.EMAIL) {
                            try {
                                String remove = ctssVar.g.remove(contactId2.a());
                                if (!TextUtils.isEmpty(remove)) {
                                    ctssVar.f.a(remove);
                                    return deha.a(true);
                                }
                            } catch (Exception e) {
                                String valueOf = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                                sb.append("Failed to clear OAuth token with Exception: ");
                                sb.append(valueOf);
                                sb.toString();
                                cstl.a("Backend");
                                ctxm r = ctxn.r();
                                r.g(10024);
                                r.n(contactId2);
                                if (ctyyVar2 != null) {
                                    r.o(ctyyVar2.c().J());
                                }
                                ctssVar.c.b(r.a());
                            }
                        }
                    }
                    return deha.a(false);
                }
            }, dege.a);
            j = deha.k(a).a(new deff(this, a, defgVar, j) { // from class: ctsi
                private final ctss a;
                private final dehn b;
                private final defg c;
                private final dehn d;

                {
                    this.a = this;
                    this.b = a;
                    this.c = defgVar;
                    this.d = j;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    return ((Boolean) deha.r(this.b)).booleanValue() ? ctss.h(this.c) : this.d;
                }
            }, dege.a);
        }
        if (i == 0 && ctyyVar != null) {
            final dehn a2 = deha.k(j).a(new deff(this, j, ctyyVar) { // from class: ctrz
                private final ctss a;
                private final dehn b;
                private final ctyy c;

                {
                    this.a = this;
                    this.b = j;
                    this.c = ctyyVar;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    ctss ctssVar = this.a;
                    dehn dehnVar = this.b;
                    ctyy ctyyVar2 = this.c;
                    try {
                        deha.r(dehnVar);
                    } catch (Throwable th) {
                        if (dyjb.c(th).p == dyjb.i.p) {
                            return ctssVar.e.d(ctyyVar2, true);
                        }
                    }
                    return deha.a(null);
                }
            }, dege.a);
            final dehn b = deha.k(a2).b(new Callable(a2) { // from class: ctsa
                private final dehn a;

                {
                    this.a = a2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    try {
                        if (((ctzp) deha.r(this.a)) != null) {
                            return true;
                        }
                    } catch (Exception unused) {
                        cstl.a("Backend");
                    }
                    return false;
                }
            }, dege.a);
            j = deha.k(b).a(new deff(this, b, defgVar, j) { // from class: ctsj
                private final ctss a;
                private final dehn b;
                private final defg c;
                private final dehn d;

                {
                    this.a = this;
                    this.b = b;
                    this.c = defgVar;
                    this.d = j;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    return ((Boolean) deha.r(this.b)).booleanValue() ? ctss.h(this.c) : this.d;
                }
            }, dege.a);
        } else if (i != 1 && i != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid RequestType: ");
            sb.append(0);
            return deha.b(new RuntimeException(sb.toString()));
        }
        return ctmnVar.b().a() == 0 ? j : g(j, new ctsp(this, ctmnVar, defgVar));
    }

    public final <RequestT, ResponseT, ResultT, StubT> dehn<ResultT> d(final UUID uuid, int i, final ctxf<RequestT, ResponseT, ResultT, StubT> ctxfVar, final dehn<ctsu<StubT>> dehnVar, ctyy ctyyVar, ctzp ctzpVar) {
        dehn<RequestT> dehnVar2;
        if (i == 1) {
            ctxfVar.getClass();
            dehnVar2 = (dehn) new dbrn(ctxfVar) { // from class: ctsk
                private final ctxf a;

                {
                    this.a = ctxfVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return this.a.a((dxwi) obj);
                }
            }.a(ctth.a(this.a, uuid).bK());
        } else if (i == 0 && ctyyVar != null) {
            ctxfVar.getClass();
            dehnVar2 = m(uuid, new dbrn(ctxfVar) { // from class: ctsl
                private final ctxf a;

                {
                    this.a = ctxfVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return this.a.a((dxwi) obj);
                }
            }, ctyyVar);
        } else if (i != 2 || ctyyVar == null || ctzpVar == null) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid RequestType: ");
            sb.append(i);
            return deha.b(new RuntimeException(sb.toString()));
        } else {
            ctxfVar.getClass();
            dbrn dbrnVar = new dbrn(ctxfVar) { // from class: ctsm
                private final ctxf a;

                {
                    this.a = ctxfVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return this.a.a((dxwi) obj);
                }
            };
            dxwh b = ctth.b(this.a, deca.c(ctzpVar.a()), uuid);
            dxvs a = ctum.a(ctyyVar.b().e());
            if (b.c) {
                b.bF();
                b.c = false;
            }
            dxwi dxwiVar = dxwi.e;
            a.getClass();
            ((dxwi) b.b).d = a;
            dehnVar2 = (dehn) dbrnVar.a(b.bK());
        }
        final deig d = deig.d();
        final dehn h = deew.h(deew.g(dehnVar2, new defg(uuid, d, ctxfVar, dehnVar) { // from class: ctrl
            private final UUID a;
            private final deig b;
            private final ctxf c;
            private final dehn d;

            {
                this.a = uuid;
                this.b = d;
                this.c = ctxfVar;
                this.d = dehnVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                UUID uuid2 = this.a;
                deig deigVar = this.b;
                ctxf ctxfVar2 = this.c;
                dehn dehnVar3 = this.d;
                String valueOf = String.valueOf(uuid2);
                String simpleName = obj.getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(simpleName).length());
                sb2.append("request(requestId=");
                sb2.append(valueOf);
                sb2.append("): ");
                sb2.append(simpleName);
                sb2.toString();
                cstl.a("Backend");
                String valueOf2 = String.valueOf(uuid2);
                String valueOf3 = String.valueOf(obj);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 21 + String.valueOf(valueOf3).length());
                sb3.append("request(requestId=");
                sb3.append(valueOf2);
                sb3.append("): ");
                sb3.append(valueOf3);
                sb3.toString();
                cstl.a("Backend");
                deigVar.j(Long.valueOf(SystemClock.elapsedRealtime()));
                return ctxfVar2.e(deew.h(dehnVar3, ctse.a, dege.a), obj);
            }
        }, dege.a), new dbrn(uuid, ctxfVar) { // from class: ctrm
            private final UUID a;
            private final ctxf b;

            {
                this.a = uuid;
                this.b = ctxfVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                UUID uuid2 = this.a;
                ctxf ctxfVar2 = this.b;
                String valueOf = String.valueOf(uuid2);
                String simpleName = obj.getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 22 + String.valueOf(simpleName).length());
                sb2.append("response(requestId=");
                sb2.append(valueOf);
                sb2.append("): ");
                sb2.append(simpleName);
                sb2.toString();
                cstl.a("Backend");
                String valueOf2 = String.valueOf(uuid2);
                String valueOf3 = String.valueOf(obj);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 22 + String.valueOf(valueOf3).length());
                sb3.append("response(requestId=");
                sb3.append(valueOf2);
                sb3.append("): ");
                sb3.append(valueOf3);
                sb3.toString();
                cstl.a("Backend");
                return ctxfVar2.d(obj);
            }
        }, dege.a);
        return deha.k(h).a(new deff(this, d, h, ctxfVar, uuid) { // from class: ctrn
            private final ctss a;
            private final deig b;
            private final dehn c;
            private final ctxf d;
            private final UUID e;

            {
                this.a = this;
                this.b = d;
                this.c = h;
                this.d = ctxfVar;
                this.e = uuid;
            }

            @Override // defpackage.deff
            public final dehn a() {
                ctss ctssVar = this.a;
                deig deigVar = this.b;
                dehn dehnVar3 = this.c;
                ctxf ctxfVar2 = this.d;
                UUID uuid2 = this.e;
                long micros = deigVar.isDone() ? TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) deigVar.get()).longValue()) : 0L;
                try {
                    ctxfVar2.c(uuid2, deha.r(dehnVar3), ctssVar.c, micros);
                } catch (Exception e) {
                    ctxfVar2.b(uuid2, cttj.a().b(ctssVar.a, e.getCause()), dyjb.c(e.getCause()), ctssVar.c, micros);
                }
                return dehnVar3;
            }
        }, dege.a);
    }

    public final <StubT> dehn<ctsu<StubT>> e(final dehn<ctsu<StubT>> dehnVar, final ContactId contactId) {
        return deha.f(new deff(this, contactId, dehnVar) { // from class: ctrr
            private final ctss a;
            private final ContactId b;
            private final dehn c;

            {
                this.a = this;
                this.b = contactId;
                this.c = dehnVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                ctss ctssVar = this.a;
                ContactId contactId2 = this.b;
                dehn dehnVar2 = this.c;
                if (contactId2.c() == ContactId.ContactType.EMAIL) {
                    try {
                        final String b = ctssVar.f.b(new Account(contactId2.a(), "com.google"));
                        if (TextUtils.isEmpty(b)) {
                            throw new dyjd(dyjb.i.g("Failed to generate OAuthToken"));
                        }
                        ctssVar.g.put(contactId2.a(), b);
                        return deew.h(dehnVar2, new dbrn(b) { // from class: ctsc
                            private final String a;

                            {
                                this.a = b;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj) {
                                return ((ctsu) obj).a(this.a);
                            }
                        }, dege.a);
                    } catch (Exception e) {
                        cmra cmraVar = new cmra(e);
                        if (!(e instanceof IOException)) {
                            throw new dyjd(dyjb.i.f(cmraVar));
                        }
                        throw new dyjd(dyjb.l.f(cmraVar));
                    }
                }
                return dehnVar2;
            }
        }, dege.a);
    }

    public final <ResultT> dehn<Boolean> f(dehn<ResultT> dehnVar, final ctyy ctyyVar, boolean z) {
        final dehn<Boolean> n = n(dehnVar, ctyyVar.b().e(), z);
        final dehn a = deha.k(n).a(new deff(this, n, ctyyVar) { // from class: ctrw
            private final ctss a;
            private final dehn b;
            private final ctyy c;

            {
                this.a = this;
                this.b = n;
                this.c = ctyyVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                ctss ctssVar = this.a;
                dehn dehnVar2 = this.b;
                ctyy ctyyVar2 = this.c;
                if (((Boolean) deha.r(dehnVar2)).booleanValue()) {
                    return ctssVar.e.d(ctyyVar2, true);
                }
                return deha.a(null);
            }
        }, dege.a);
        return deha.k(a).b(new Callable(a) { // from class: ctrx
            private final dehn a;

            {
                this.a = a;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    if (((ctzp) deha.r(this.a)) != null) {
                        return true;
                    }
                } catch (Exception unused) {
                    cstl.a("Backend");
                }
                return false;
            }
        }, dege.a);
    }

    protected final void finalize() {
        ctto cttoVar = this.d;
        cttoVar.a.unregisterReceiver(cttoVar.b);
        try {
            dyeu dyeuVar = cttoVar.c;
            if (!(dyeuVar instanceof dyhi)) {
                return;
            }
            ((dyhi) dyeuVar).f();
        } catch (Exception unused) {
            cstl.a("StubFactory");
        }
    }

    public final <ResultT> dehn<ResultT> g(final dehn<ResultT> dehnVar, final ctml<ResultT> ctmlVar) {
        return deha.k(dehnVar).a(new deff(this, dehnVar, ctmlVar) { // from class: ctsb
            private final ctss a;
            private final dehn b;
            private final ctml c;

            {
                this.a = this;
                this.b = dehnVar;
                this.c = ctmlVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                ctss ctssVar = this.a;
                dehn dehnVar2 = this.b;
                ctml ctmlVar2 = this.c;
                try {
                    deha.r(dehnVar2);
                    return dehnVar2;
                } catch (Throwable th) {
                    dyjb c = dyjb.c(th);
                    ctmu ctmuVar = ctssVar.b;
                    if (ctmu.a(c)) {
                        deig d = deig.d();
                        deha.q(dehnVar2, new ctmt(ctmuVar, ctmlVar2, d), dege.a);
                        return d;
                    }
                    String valueOf = String.valueOf(c);
                    StringBuilder sb = new StringBuilder(63 + String.valueOf(valueOf).length());
                    sb.append("Non retryable error, Retry Category:");
                    sb.append("CLIENT_BLOCKING_RPC");
                    sb.append(" Status:");
                    sb.append(valueOf);
                    sb.toString();
                    cstl.a("RetryManager");
                    return dehnVar2;
                }
            }
        }, dege.a);
    }

    public final <RequestT, ResponseT, ResultT, StubT> dehn<ResultT> i(UUID uuid, ctxf<RequestT, ResponseT, ResultT, StubT> ctxfVar, dehn<ctsu<StubT>> dehnVar, ctyy ctyyVar, ctzp ctzpVar, ctmn ctmnVar) {
        return l(uuid, 2, ctxfVar, dehnVar, ctyyVar.b().e(), ctmnVar, true, ctyyVar, ctzpVar);
    }

    public final <ResultT> dehn<ResultT> j(final dehn<ResultT> dehnVar, final ContactId contactId, final int i) {
        return deha.k(dehnVar).a(new deff(this, dehnVar, i, contactId) { // from class: ctrk
            private final ctss a;
            private final dehn b;
            private final ContactId c;
            private final int d;

            {
                this.a = this;
                this.b = dehnVar;
                this.d = i;
                this.c = contactId;
            }

            @Override // defpackage.deff
            public final dehn a() {
                ctss ctssVar = this.a;
                dehn dehnVar2 = this.b;
                int i2 = this.d;
                ContactId contactId2 = this.c;
                try {
                    deha.r(dehnVar2);
                } catch (Throwable th) {
                    if (cttj.a().c(th) == i2) {
                        cstl.a("Backend");
                        ctssVar.e.f(contactId2);
                    }
                }
                return dehnVar2;
            }
        }, dege.a);
    }

    public final <RequestT extends dssj, ResponseT extends dssj, ResultT, StubT extends dyyv<StubT>> dehn<Void> k(final UUID uuid, final ctfw<ResultT> ctfwVar, final ctwo ctwoVar, final dehn<ctsu<StubT>> dehnVar, final ctyy ctyyVar) {
        cstq.a();
        if (ctyyVar == null) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid RequestType: ");
            sb.append(0);
            return deha.b(new RuntimeException(sb.toString()));
        }
        ctwoVar.getClass();
        dehn m = m(uuid, new dbrn() { // from class: ctro
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dxwi dxwiVar = (dxwi) obj;
                dxuc bZ = dxud.b.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dxwiVar.getClass();
                ((dxud) bZ.b).a = dxwiVar;
                return deha.a(bZ.bK());
            }
        }, ctyyVar);
        final deig d = deig.d();
        final dehn g = deew.g(m, new defg(this, ctwoVar, dehnVar, d, ctfwVar, uuid, ctyyVar) { // from class: ctrp
            private final ctss a;
            private final dehn b;
            private final deig c;
            private final ctfw d;
            private final UUID e;
            private final ctyy f;
            private final ctwo g;

            {
                this.a = this;
                this.g = ctwoVar;
                this.b = dehnVar;
                this.c = d;
                this.d = ctfwVar;
                this.e = uuid;
                this.f = ctyyVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                ctss ctssVar = this.a;
                ctwo ctwoVar2 = this.g;
                dehn dehnVar2 = this.b;
                deig deigVar = this.c;
                ctfw ctfwVar2 = this.d;
                UUID uuid2 = this.e;
                ctyy ctyyVar2 = this.f;
                dehn h = deew.h(dehnVar2, ctsd.a, dege.a);
                final ctsr ctsrVar = new ctsr(ctssVar, deigVar, ctfwVar2, ctwoVar2, uuid2, ctyyVar2);
                final dxud dxudVar = (dxud) ((dssj) obj);
                return deew.h(h, new dbrn(dxudVar, ctsrVar) { // from class: ctwl
                    private final dxud a;
                    private final dyzk b;

                    {
                        this.a = dxudVar;
                        this.b = ctsrVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        dxud dxudVar2 = this.a;
                        dyzk dyzkVar = this.b;
                        dxtj dxtjVar = (dxtj) obj2;
                        dyeu dyeuVar = dxtjVar.a;
                        dyib<dxud, dxup> dyibVar = dxtk.a;
                        if (dyibVar == null) {
                            synchronized (dxtk.class) {
                                dyibVar = dxtk.a;
                                if (dyibVar == null) {
                                    dyhx c = dyib.c();
                                    c.c = dyhz.SERVER_STREAMING;
                                    c.d = dyib.b("google.internal.communications.instantmessaging.v1.Messaging", "ReceiveMessages");
                                    c.e = true;
                                    c.a = dyyq.b(dxud.b);
                                    c.b = dyyq.b(dxup.c);
                                    dyibVar = c.a();
                                    dxtk.a = dyibVar;
                                }
                            }
                        }
                        dyzf.a(dyeuVar.a(dyibVar, dxtjVar.b), dxudVar2, dyzkVar);
                        return null;
                    }
                }, dege.a);
            }
        }, dege.a);
        return deha.k(g).a(new deff(this, d, g, ctwoVar, uuid) { // from class: ctrq
            private final ctss a;
            private final deig b;
            private final dehn c;
            private final UUID d;
            private final ctwo e;

            {
                this.a = this;
                this.b = d;
                this.c = g;
                this.e = ctwoVar;
                this.d = uuid;
            }

            @Override // defpackage.deff
            public final dehn a() {
                ctss ctssVar = this.a;
                deig deigVar = this.b;
                dehn dehnVar2 = this.c;
                ctwo ctwoVar2 = this.e;
                UUID uuid2 = this.d;
                long micros = deigVar.isDone() ? TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) deigVar.get()).longValue()) : 0L;
                try {
                    Void r8 = (Void) deha.r(dehnVar2);
                    ctog ctogVar = ctssVar.c;
                    ctxm r = ctxn.r();
                    r.g(10003);
                    r.n(ctwoVar2.a.b().e());
                    r.o(ctwoVar2.a.c().J());
                    r.p(uuid2.toString());
                    r.j(11);
                    r.f(1);
                    r.e(micros);
                    ctogVar.b(r.a());
                } catch (Exception e) {
                    int b = cttj.a().b(ctssVar.a, e.getCause());
                    int i = dyjb.c(e.getCause()).p.r;
                    ctog ctogVar2 = ctssVar.c;
                    ctxm r2 = ctxn.r();
                    r2.g(10003);
                    r2.n(ctwoVar2.a.b().e());
                    r2.o(ctwoVar2.a.c().J());
                    r2.p(uuid2.toString());
                    r2.j(11);
                    r2.m(Integer.valueOf(i));
                    r2.f(b);
                    r2.e(micros);
                    ctogVar2.b(r2.a());
                }
                return dehnVar2;
            }
        }, dege.a);
    }
}
