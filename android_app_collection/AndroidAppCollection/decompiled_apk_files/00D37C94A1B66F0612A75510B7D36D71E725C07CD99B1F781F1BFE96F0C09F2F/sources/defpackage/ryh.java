package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ryh  reason: default package */
/* loaded from: classes4.dex */
public final class ryh extends b {
    public static final anay d;
    private static final amup o = amup.n("accountlinking-pa.googleapis.com", aotp.ENVIRONMENT_PROD, "staging-accountlinking-pa.sandbox.googleapis.com", aotp.ENVIRONMENT_STAGING, "stagingqual-accountlinking-pa.sandbox.googleapis.com", aotp.ENVIRONMENT_TEST_STAGING, "autopush-accountlinking-pa.googleapis.com", aotp.ENVIRONMENT_AUTOPUSH);
    private static final amup p;
    public final ryl e;
    public int f;
    public final rzy g;
    public final rzy h;
    public final rzy i;
    public final t j;
    public final rzo k;
    public aots l;
    public boolean m;
    public String n;
    private final Set q;
    private final qqh r;
    private sqx s;

    static {
        amum amumVar = new amum();
        amumVar.f(aots.STATE_ACCOUNT_SELECTION, aotq.EVENT_ACCOUNT_SELECTION_CANCEL);
        amumVar.f(aots.STATE_PROVIDER_CONSENT, aotq.EVENT_PROVIDER_CONSENT_CANCEL);
        amumVar.f(aots.STATE_ACCOUNT_CREATION, aotq.EVENT_ACCOUNT_CREATION_CANCEL);
        amumVar.f(aots.STATE_LINKING_INFO, aotq.EVENT_LINKING_INFO_CANCEL_LINKING);
        amumVar.f(aots.STATE_USAGE_NOTICE, aotq.EVENT_USAGE_NOTICE_CANCEL_LINKING);
        p = amumVar.b();
        d = sbs.e();
    }

    public ryh(Application application, ryl rylVar, rzs rzsVar) {
        super(application);
        this.q = amyv.e();
        this.l = aots.STATE_START;
        this.m = false;
        this.e = rylVar;
        this.f = 0;
        this.g = new rzy();
        this.i = new rzy();
        this.j = new t();
        this.h = new rzy();
        rzr rzrVar = (rzr) rzsVar;
        this.k = new rzo(application, rzrVar.a, rzrVar.b, ampq.i(rylVar.f), ampq.i(rylVar.p));
        this.r = new qqh(application.getApplicationContext(), "OAUTH_INTEGRATIONS", rylVar.c.name);
    }

    private final aopa m() {
        aopa createBuilder = aoty.a.createBuilder();
        String packageName = this.a.getPackageName();
        createBuilder.copyOnWrite();
        aoty aotyVar = (aoty) createBuilder.instance;
        packageName.getClass();
        aotyVar.b |= 64;
        aotyVar.h = packageName;
        createBuilder.copyOnWrite();
        aoty aotyVar2 = (aoty) createBuilder.instance;
        aotyVar2.b |= 8;
        aotyVar2.e = "100";
        String str = this.e.i;
        createBuilder.copyOnWrite();
        aoty aotyVar3 = (aoty) createBuilder.instance;
        str.getClass();
        aotyVar3.b |= 32;
        aotyVar3.g = str;
        createBuilder.copyOnWrite();
        aoty aotyVar4 = (aoty) createBuilder.instance;
        aotyVar4.f = ((aotp) o.getOrDefault(this.e.g, aotp.ENVIRONMENT_UNKNOWN)).getNumber();
        aotyVar4.b |= 16;
        return createBuilder;
    }

    private final sqx n() {
        if (this.s == null) {
            azyv azyvVar = new azyv();
            Context applicationContext = this.a.getApplicationContext();
            applicationContext.getClass();
            this.s = new sqx(applicationContext.getApplicationContext(), new sqb(azyvVar));
        }
        return this.s;
    }

    public final void d(String str) {
        rzo rzoVar = this.k;
        ryl rylVar = this.e;
        int i = rylVar.e;
        Account account = rylVar.c;
        String str2 = rylVar.i;
        ArrayList arrayList = new ArrayList(rylVar.l);
        aopa createBuilder = aofd.a.createBuilder();
        aofx d2 = rzoVar.d(i);
        createBuilder.copyOnWrite();
        d2.getClass();
        ((aofd) createBuilder.instance).b = d2;
        createBuilder.copyOnWrite();
        str2.getClass();
        ((aofd) createBuilder.instance).c = str2;
        createBuilder.copyOnWrite();
        aofd aofdVar = (aofd) createBuilder.instance;
        aopu aopuVar = aofdVar.d;
        if (!aopuVar.c()) {
            aofdVar.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) arrayList, (List) aofdVar.d);
        aopa createBuilder2 = aofu.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((aofu) createBuilder2.instance).b = 3;
        createBuilder2.copyOnWrite();
        str.getClass();
        ((aofu) createBuilder2.instance).c = str;
        aofu aofuVar = (aofu) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aofuVar.getClass();
        ((aofd) createBuilder.instance).e = aofuVar;
        final aofd aofdVar2 = (aofd) createBuilder.mo39build();
        anlz.A(rzoVar.b(account, new rzn() { // from class: rzi
            @Override // defpackage.rzn
            public final ankt a(aymy aymyVar) {
                aofd aofdVar3 = aofd.this;
                axye axyeVar = aymyVar.a;
                ayax ayaxVar = aoex.b;
                if (ayaxVar == null) {
                    synchronized (aoex.class) {
                        ayaxVar = aoex.b;
                        if (ayaxVar == null) {
                            ayau a = ayax.a();
                            a.c = ayaw.UNARY;
                            a.d = ayax.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "DepositGoogleCredential");
                            a.b();
                            a.a = aymw.b(aofd.a);
                            a.b = aymw.b(aofe.a);
                            ayaxVar = a.a();
                            aoex.b = ayaxVar;
                        }
                    }
                }
                return aynh.a(axyeVar.a(ayaxVar, aymyVar.b), aofdVar3);
            }
        }), new rye(this, str), anjk.a);
    }

    public final void e(Throwable th, rxx rxxVar, String str) {
        rxv f = sbs.f(th);
        ((anav) ((anav) d.k().h(th)).i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "handleGrpcFailure", 389, "AccountLinkingViewModel.java")).u("A gRPC error occurred when finishing flow: \"%s\", with error message: \"%s\"", rxxVar, str);
        if (f.a == 2) {
            f(aotq.EVENT_NETWORK_ERROR);
        }
        k(rwd.g(f.a, f.getMessage()));
    }

    public final void f(aotq aotqVar) {
        aopa m = m();
        aots aotsVar = aots.STATE_ERROR;
        m.copyOnWrite();
        aoty aotyVar = (aoty) m.instance;
        aoty aotyVar2 = aoty.a;
        aotyVar.c = aotsVar.getNumber();
        aotyVar.b |= 1;
        qqe a = this.r.a(((aoty) m.mo39build()).toByteArray());
        a.l = n();
        a.c(aotqVar.getNumber());
        a.d(this.e.e);
        a.b();
    }

    public final void g() {
        aotq aotqVar = (aotq) p.get(this.l);
        aotqVar.getClass();
        aopa m = m();
        aots aotsVar = this.l;
        m.copyOnWrite();
        aoty aotyVar = (aoty) m.instance;
        aoty aotyVar2 = aoty.a;
        aotyVar.c = aotsVar.getNumber();
        aotyVar.b |= 1;
        qqe a = this.r.a(((aoty) m.mo39build()).toByteArray());
        a.l = n();
        a.c(aotqVar.getNumber());
        a.d(this.e.e);
        a.b();
    }

    public final void h(aotq aotqVar) {
        aopa m = m();
        aots aotsVar = this.l;
        m.copyOnWrite();
        aoty aotyVar = (aoty) m.instance;
        aoty aotyVar2 = aoty.a;
        aotyVar.c = aotsVar.getNumber();
        aotyVar.b |= 1;
        qqe a = this.r.a(((aoty) m.mo39build()).toByteArray());
        a.l = n();
        a.c(aotqVar.getNumber());
        a.d(this.e.e);
        a.b();
    }

    public final void i(aots aotsVar) {
        aopa m = m();
        m.copyOnWrite();
        aoty aotyVar = (aoty) m.instance;
        aoty aotyVar2 = aoty.a;
        aotyVar.c = aotsVar.getNumber();
        aotyVar.b |= 1;
        aots aotsVar2 = this.l;
        m.copyOnWrite();
        aoty aotyVar3 = (aoty) m.instance;
        aotyVar3.d = aotsVar2.getNumber();
        aotyVar3.b |= 2;
        this.l = aotsVar;
        qqe a = this.r.a(((aoty) m.mo39build()).toByteArray());
        a.l = n();
        a.c(1);
        a.d(this.e.e);
        a.b();
    }

    public final void j(ryp rypVar, String str) {
        ryi g;
        if (ryp.a.contains(Integer.valueOf(rypVar.d))) {
            g = rwd.g(3, "Linking denied by user.");
        } else if (ryp.b.contains(Integer.valueOf(rypVar.d))) {
            g = rwd.g(4, "Linking cancelled by user.");
        } else {
            g = rwd.g(1, str);
        }
        k(g);
    }

    public final void k(final ryi ryiVar) {
        anlz.w(this.q).qY(new Runnable() { // from class: ryb
            @Override // java.lang.Runnable
            public final void run() {
                ryh ryhVar = ryh.this;
                ryhVar.i.i(ryiVar);
            }
        }, anjk.a);
    }

    public final void l(int i, int i2, int i3, String str) {
        Set set = this.q;
        rzo rzoVar = this.k;
        ryl rylVar = this.e;
        int i4 = rylVar.e;
        Account account = rylVar.c;
        String str2 = rylVar.i;
        Integer valueOf = Integer.valueOf(i3);
        aopa createBuilder = aoey.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aoey) createBuilder.instance).b = i - 2;
        if (i2 != 0) {
            createBuilder.copyOnWrite();
            aoey aoeyVar = (aoey) createBuilder.instance;
            if (i2 != 1) {
                aoeyVar.c = i2 - 2;
            } else {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }
        int intValue = valueOf.intValue();
        createBuilder.copyOnWrite();
        ((aoey) createBuilder.instance).d = intValue;
        if (str != null) {
            createBuilder.copyOnWrite();
            ((aoey) createBuilder.instance).e = str;
        }
        aopa createBuilder2 = aofv.a.createBuilder();
        aofx d2 = rzoVar.d(i4);
        createBuilder2.copyOnWrite();
        d2.getClass();
        ((aofv) createBuilder2.instance).b = d2;
        createBuilder2.copyOnWrite();
        str2.getClass();
        ((aofv) createBuilder2.instance).c = str2;
        createBuilder2.copyOnWrite();
        aoey aoeyVar2 = (aoey) createBuilder.mo39build();
        aoeyVar2.getClass();
        ((aofv) createBuilder2.instance).d = aoeyVar2;
        final aofv aofvVar = (aofv) createBuilder2.mo39build();
        set.add(rzoVar.b(account, new rzn() { // from class: rzl
            @Override // defpackage.rzn
            public final ankt a(aymy aymyVar) {
                aofv aofvVar2 = aofv.this;
                axye axyeVar = aymyVar.a;
                ayax ayaxVar = aoex.g;
                if (ayaxVar == null) {
                    synchronized (aoex.class) {
                        ayaxVar = aoex.g;
                        if (ayaxVar == null) {
                            ayau a = ayax.a();
                            a.c = ayaw.UNARY;
                            a.d = ayax.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "ReportAppFlipOutcome");
                            a.b();
                            a.a = aymw.b(aofv.a);
                            a.b = aymw.b(aofw.a);
                            ayaxVar = a.a();
                            aoex.g = ayaxVar;
                        }
                    }
                }
                return aynh.a(axyeVar.a(ayaxVar, aymyVar.b), aofvVar2);
            }
        }));
    }
}
