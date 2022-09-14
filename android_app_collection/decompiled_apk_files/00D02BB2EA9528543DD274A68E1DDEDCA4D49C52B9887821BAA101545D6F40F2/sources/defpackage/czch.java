package defpackage;

import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: czch  reason: default package */
/* loaded from: classes5.dex */
public final class czch implements cyuc {
    public final ClientConfigInternal a;
    public final cyhd b;
    public final cych c;
    public final ClientVersion d;
    public final cyph e;
    public final dbtp f;
    private final dehp g;
    private final Object h = new Object();
    private final Object i = new Object();
    private dehn<cyli> j = null;
    private dehn<Void> k = null;

    public czch(dehp dehpVar, ClientConfigInternal clientConfigInternal, cyhd cyhdVar, cych cychVar, ClientVersion clientVersion, cyph cyphVar) {
        this.g = dehpVar;
        this.a = clientConfigInternal;
        this.b = cyhdVar;
        this.c = cychVar;
        this.d = clientVersion;
        this.e = cyphVar;
        dbtp b = cyphVar.b();
        b.e();
        this.f = b;
    }

    public static dued e(ClientConfigInternal clientConfigInternal) {
        return clientConfigInternal.i.c(clientConfigInternal.h);
    }

    @Override // defpackage.cyuc
    public final dehn<cyts> a(final cytq cytqVar) {
        if (cytqVar.f.y && !cytqVar.b.isEmpty() && (!dyaz.b() || this.c.c == cycg.SUCCESS_LOGGED_IN)) {
            dbtp b = this.e.b();
            dehn<cyli> f = deha.f(new deff(this, cytqVar) { // from class: czbz
                private final czch a;
                private final cytq b;

                {
                    this.a = this;
                    this.b = cytqVar;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    czch czchVar = this.a;
                    cytq cytqVar2 = this.b;
                    cylx b2 = czchVar.b.b();
                    dsge bZ = dsgf.e.bZ();
                    dued e = czch.e(cytqVar2.f);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dsgf dsgfVar = (dsgf) bZ.b;
                    dsgfVar.b = e.cg;
                    dsgfVar.a |= 1;
                    dsgl bZ2 = dsgm.c.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dsgm dsgmVar = (dsgm) bZ2.b;
                    dsgmVar.b = 2;
                    dsgmVar.a |= 1;
                    dsgm bK = bZ2.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dsgf dsgfVar2 = (dsgf) bZ.b;
                    bK.getClass();
                    dsgfVar2.d = bK;
                    int i = dsgfVar2.a | 4;
                    dsgfVar2.a = i;
                    String str = cytqVar2.b;
                    str.getClass();
                    dsgfVar2.a = i | 2;
                    dsgfVar2.c = str;
                    cylt e2 = cylu.e();
                    e2.b(czchVar.c);
                    e2.c(czchVar.b.a());
                    e2.d(czchVar.a);
                    ((cyim) e2).a = czchVar.d;
                    return b2.i(bZ.bK(), e2.a());
                }
            }, this.g);
            deha.q(f, new czce(this, cytqVar, this.e.b()), dege.a);
            synchronized (this.h) {
                dehn<cyli> dehnVar = this.j;
                if (dehnVar != null) {
                    dehnVar.cancel(true);
                }
                this.j = f;
            }
            dehn<cyts> h = deew.h(f, new dbrn() { // from class: czca
                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    dccx F = dcdc.F();
                    dsgh dsghVar = ((cyli) obj).a;
                    if (dsghVar == null) {
                        dsghVar = dsgh.c;
                    }
                    for (dsgk dsgkVar : dsghVar.a) {
                        cywm cywmVar = new cywm(dsgkVar);
                        cywmVar.e(cygl.PAPI_AUTOCOMPLETE);
                        F.g(cywmVar);
                    }
                    cytr c = cyts.c();
                    c.b(F.f());
                    c.e = cyes.SUCCESS;
                    c.f = cyer.PEOPLE_API_AUTOCOMPLETE;
                    cydr e = AutocompletionCallbackMetadata.e();
                    cybv cybvVar = (cybv) e;
                    cybvVar.a = 5;
                    e.b(cyds.WAITED_FOR_RESULTS);
                    cybvVar.b = 1;
                    c.d = e.a();
                    return c.a();
                }
            }, dege.a);
            if (dyaz.f()) {
                deha.q(h, new czcg(this, b, cytqVar, h), dege.a);
            }
            return h;
        }
        cytr c = cyts.c();
        c.b(dcdc.e());
        c.e = cyes.SKIPPED;
        c.f = cyer.PEOPLE_API_AUTOCOMPLETE;
        cydr e = AutocompletionCallbackMetadata.e();
        cybv cybvVar = (cybv) e;
        cybvVar.a = 5;
        e.b(cyds.DID_NOT_WAIT_FOR_RESULTS);
        cybvVar.b = 3;
        c.d = e.a();
        return deha.a(c.a());
    }

    @Override // defpackage.cyuc
    public final cyer b() {
        return cyer.PEOPLE_API_AUTOCOMPLETE;
    }

    @Override // defpackage.cyuc
    public final dehn<Void> c() {
        return dehk.a;
    }

    @Override // defpackage.cyuc
    public final void d(cydz cydzVar) {
        dehn dehnVar;
        if (((ClientConfigInternal) cydzVar).q) {
            if (!this.a.y || (dyaz.b() && this.c.c != cycg.SUCCESS_LOGGED_IN)) {
                dehnVar = dehk.a;
            } else {
                synchronized (this.i) {
                    dbtp dbtpVar = this.f;
                    if (dbtpVar.a && dbtpVar.d(TimeUnit.MILLISECONDS) < dyaz.a.a().l()) {
                        dehnVar = dehk.a;
                    } else {
                        dehn<Void> dehnVar2 = this.k;
                        if (dehnVar2 == null || dehnVar2.isDone()) {
                            dehn f = deha.f(new deff(this) { // from class: czcb
                                private final czch a;

                                {
                                    this.a = this;
                                }

                                @Override // defpackage.deff
                                public final dehn a() {
                                    czch czchVar = this.a;
                                    cylx b = czchVar.b.b();
                                    dsij bZ = dsik.d.bZ();
                                    dued e = czch.e(czchVar.a);
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    dsik dsikVar = (dsik) bZ.b;
                                    dsikVar.b = e.cg;
                                    dsikVar.a |= 1;
                                    dsgl bZ2 = dsgm.c.bZ();
                                    if (bZ2.c) {
                                        bZ2.bF();
                                        bZ2.c = false;
                                    }
                                    dsgm dsgmVar = (dsgm) bZ2.b;
                                    dsgmVar.b = 2;
                                    dsgmVar.a |= 1;
                                    dsgm bK = bZ2.bK();
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    dsik dsikVar2 = (dsik) bZ.b;
                                    bK.getClass();
                                    dsikVar2.c = bK;
                                    dsikVar2.a |= 2;
                                    cylt e2 = cylu.e();
                                    e2.b(czchVar.c);
                                    e2.c(czchVar.b.a());
                                    e2.d(czchVar.a);
                                    ((cyim) e2).a = czchVar.d;
                                    return b.j(bZ.bK(), e2.a());
                                }
                            }, this.g);
                            deha.q(f, new czcf(this, this.e.b()), dege.a);
                            this.k = deew.h(f, new dbrn(this) { // from class: czcc
                                private final czch a;

                                {
                                    this.a = this;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj) {
                                    dsim dsimVar = (dsim) obj;
                                    dbtp dbtpVar2 = this.a.f;
                                    dbtpVar2.e();
                                    dbtpVar2.f();
                                    return null;
                                }
                            }, dege.a);
                        }
                        dehnVar = this.k;
                    }
                }
            }
            deha.q(dehnVar, new czcd(this), dege.a);
        }
    }
}
