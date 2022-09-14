package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqev  reason: default package */
/* loaded from: classes2.dex */
public final class aqev extends ges implements egq {
    private static final dcqe am = dcqe.c("aqev");
    private static final dcdc<ckhf> an = dcdc.h(ckgs.c, ckgs.d, ckgs.k);
    private static final ckme ao = ckme.PRIMARY_MAP;
    public efg a;
    public bvkx ad;
    public eeu ae;
    public fzc af;
    public bvjj ag;
    public btvo ah;
    public aqer ai;
    public aqfv aj;
    @dzsi
    public apzc ak;
    public int al;
    private boolean ap = false;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private aqfu at;
    @dzsi
    private cqkf<aqcc> au;
    public cqkj b;
    public dxio<aqaa> c;
    public dxio<hwd> d;
    public ckmm e;
    public ckcw f;
    public akfa g;

    @dzsi
    private static final cuzt w(@dzsi View view) {
        if (view == null) {
            return null;
        }
        return (cuzt) cqhu.a(view, aqem.b);
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((aqew) btsx.b(aqew.class, this)).cb(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        aqfu aqfuVar = this.at;
        if (aqfuVar != null) {
            aqfuVar.p();
        }
        cqkf<aqcc> cqkfVar = this.au;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.au = null;
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bbuf) {
            bbuf bbufVar = (bbuf) obj;
            ArrayList arrayList = new ArrayList();
            for (bbtm bbtmVar : bbufVar.a()) {
                arrayList.add(bbtmVar.z());
            }
            aqfu aqfuVar = this.at;
            if (aqfuVar != null && aqfuVar.n.a().c()) {
                aqfuVar.z.addAll(arrayList);
                aqfuVar.x();
                cjqy cjqyVar = aqfuVar.u;
                cjst d = cjsu.d();
                d.d(ddda.aX);
                cjry e = cjrz.e();
                e.b(ddcu.n);
                d.f(e.a());
                cjqyVar.l(d.e());
            }
            bbufVar.a().size();
        }
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        ckha ckhaVar;
        if (this.aD) {
            if (!this.as) {
                this.e.e(cwsv.a("MessagingConversationStartedEvent"));
                dcdc<ckhf> dcdcVar = an;
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    ckhf ckhfVar = dcdcVar.get(i);
                    if (this.al == 1) {
                        ((ckhe) this.f.a(ckhfVar)).c();
                    } else {
                        ((ckhe) this.f.a(ckhfVar)).e();
                    }
                }
                apzc apzcVar = this.ak;
                dbsk.s(apzcVar);
                if (apzcVar.a() == apzb.START_CONVERSATION_INTENT && this.al == 1) {
                    if (this.aq) {
                        ckhaVar = ckgs.l;
                    } else {
                        ckhaVar = ckgs.m;
                    }
                    ckcy ckcyVar = bvmo.g;
                    ckcyVar.a(ckhaVar);
                    ckcyVar.c(ckhaVar);
                    apzc apzcVar2 = this.ak;
                    if (apzcVar2 != null && apzcVar2.f().a()) {
                        apzc apzcVar3 = this.ak;
                        dbsk.s(apzcVar3);
                        Long b = apzcVar3.f().b();
                        ckha ckhaVar2 = this.aq ? ckgs.r : ckgs.s;
                        ckha ckhaVar3 = this.af.a(ao) ? ckgs.u : ckgs.t;
                        if (b.longValue() > 0) {
                            Long valueOf = Long.valueOf(Calendar.getInstance().getTimeInMillis() - b.longValue());
                            ((ckcp) this.f.a(ckhaVar2)).a(valueOf.longValue());
                            ((ckcp) this.f.a(ckhaVar3)).a(valueOf.longValue());
                        }
                    }
                }
                this.as = true;
            }
            if (!this.ah.getBusinessMessagingParameters().v) {
                return;
            }
            this.d.a().q(false);
            this.d.a().j();
            this.ad.n(bvku.d(durz.EIT_BUSINESS_MESSAGING_START_CONVERSATION, null, false));
            this.ad.n(bvku.d(durz.EIT_BUSINESS_MESSAGING_NOTIFICATION, null, false));
            this.ad.n(bvku.d(durz.EIT_BUSINESS_MESSAGING_MAPS_ONLY, null, false));
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        aqev aqevVar;
        cqkf<aqcc> e = this.b.e(new aqem());
        this.au = e;
        View c = e.c();
        apzc apzcVar = this.ak;
        if (apzcVar == null) {
            bvoo.h("Open conversation params not found on creating view.", new Object[0]);
            aqevVar = this;
        } else {
            aqfv aqfvVar = this.aj;
            cuxm cuxmVar = new cuxm(this) { // from class: aqes
                private final aqev a;

                {
                    this.a = this;
                }

                @Override // defpackage.cuxm
                public final void a() {
                    this.a.g();
                }
            };
            cuxl cuxlVar = new cuxl(this) { // from class: aqet
                private final aqev a;

                {
                    this.a = this;
                }

                @Override // defpackage.cuxl
                public final void a() {
                    aqev aqevVar2 = this.a;
                    apzc apzcVar2 = aqevVar2.ak;
                    dbsk.s(apzcVar2);
                    apzb a = apzcVar2.a();
                    ((ckco) aqevVar2.f.a(ckgs.y)).a(a.q);
                    aqevVar2.q(ckgs.z, bvjk.bn, a);
                    if (a == apzb.START_CONVERSATION_INTENT) {
                        ((ckco) aqevVar2.f.a(ckgs.p)).a(aqevVar2.i());
                        ((ckco) aqevVar2.f.a(ckgs.q)).a(apzw.c(aqevVar2.al));
                    }
                }
            };
            cuzt w = w(c);
            boolean z = this.aq;
            gga a = aqfvVar.a.a();
            aqfv.a(a, 1);
            bvjj a2 = aqfvVar.b.a();
            aqfv.a(a2, 2);
            btvo a3 = aqfvVar.c.a();
            aqfv.a(a3, 3);
            bvrb a4 = aqfvVar.d.a();
            aqfv.a(a4, 4);
            dxio a5 = ((dxjh) aqfvVar.e).a();
            aqfv.a(a5, 5);
            dxio a6 = ((dxjh) aqfvVar.f).a();
            aqfv.a(a6, 6);
            dxio a7 = ((dxjh) aqfvVar.g).a();
            aqfv.a(a7, 7);
            dxio a8 = ((dxjh) aqfvVar.h).a();
            aqfv.a(a8, 8);
            dxio a9 = ((dxjh) aqfvVar.i).a();
            aqfv.a(a9, 9);
            dxio a10 = ((dxjh) aqfvVar.j).a();
            aqfv.a(a10, 10);
            dxio a11 = ((dxjh) aqfvVar.k).a();
            aqfv.a(a11, 11);
            dxio a12 = ((dxjh) aqfvVar.l).a();
            aqfv.a(a12, 12);
            dxio a13 = ((dxjh) aqfvVar.m).a();
            aqfv.a(a13, 13);
            dxio a14 = ((dxjh) aqfvVar.n).a();
            aqfv.a(a14, 14);
            dxio a15 = ((dxjh) aqfvVar.o).a();
            aqfv.a(a15, 15);
            dxio a16 = ((dxjh) aqfvVar.p).a();
            aqfv.a(a16, 16);
            dxio a17 = ((dxjh) aqfvVar.q).a();
            aqfv.a(a17, 17);
            dxio a18 = ((dxjh) aqfvVar.r).a();
            aqfv.a(a18, 18);
            dxio a19 = ((dxjh) aqfvVar.s).a();
            aqfv.a(a19, 19);
            dxio a20 = ((dxjh) aqfvVar.t).a();
            aqfv.a(a20, 20);
            aqrl a21 = aqfvVar.u.a();
            aqfv.a(a21, 21);
            auur a22 = aqfvVar.v.a();
            aqfv.a(a22, 22);
            auut a23 = aqfvVar.w.a();
            aqfv.a(a23, 23);
            cjqy a24 = aqfvVar.x.a();
            aqfv.a(a24, 24);
            cjqq a25 = aqfvVar.y.a();
            aqfv.a(a25, 25);
            apyv a26 = aqfvVar.z.a();
            aqfv.a(a26, 26);
            Executor a27 = aqfvVar.A.a();
            aqfv.a(a27, 27);
            dxio a28 = ((dxjh) aqfvVar.B).a();
            aqfv.a(a28, 28);
            dxio a29 = ((dxjh) aqfvVar.C).a();
            aqfv.a(a29, 29);
            aqfv.a(apzcVar, 30);
            aqfv.a(this, 34);
            aqfu aqfuVar = new aqfu(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, apzcVar, cuxmVar, cuxlVar, w, this, z);
            aqevVar = this;
            aqevVar.at = aqfuVar;
        }
        cqkf<aqcc> cqkfVar = aqevVar.au;
        dbsk.s(cqkfVar);
        cqkfVar.e(aqevVar.at);
        return c;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        aqfu aqfuVar = this.at;
        if (aqfuVar != null) {
            bvqj.c(aqfuVar.t(), new bvqg(this) { // from class: aqeu
                private final aqev a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    aqev aqevVar = this.a;
                    dbsg dbsgVar = (dbsg) obj;
                    if (dbsgVar == null || !dbsgVar.a()) {
                        return;
                    }
                    aqevVar.c.a().a((ConversationId) dbsgVar.b());
                }
            }, dege.a);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        aqfu aqfuVar = this.at;
        if (aqfuVar != null) {
            aqfuVar.q();
        }
        this.c.a().a(null);
        if (!this.ar) {
            apzc apzcVar = this.ak;
            dbsk.s(apzcVar);
            apzb a = apzcVar.a();
            ((ckco) this.f.a(ckgs.w)).a(a.q);
            q(ckgs.x, bvjk.bm, a);
            if (a == apzb.START_CONVERSATION_INTENT) {
                ((ckco) this.f.a(ckgs.n)).a(i());
                ((ckco) this.f.a(ckgs.o)).a(apzw.c(this.al));
            }
            this.ar = true;
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        aqfu aqfuVar = this.at;
        if (aqfuVar == null || !aqfuVar.o()) {
            g();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            ggaVar.g().f();
            if (!this.ap) {
                return;
            }
            final aqer aqerVar = this.ai;
            aqfu aqfuVar = this.at;
            ConversationId conversationId = null;
            final ctyy f = aqfuVar != null ? aqfuVar.s().f() : null;
            aqfu aqfuVar2 = this.at;
            if (aqfuVar2 != null) {
                conversationId = aqfuVar2.r().f();
            }
            if (!aqerVar.b.a() || !aqerVar.a.a()) {
                aqerVar.f.a().f();
                return;
            }
            if (conversationId != null && f != null) {
                ContactId a = conversationId.a();
                if (cstg.a(a.a()).equals(cstg.a(f.b().e().a())) && a.c().equals(f.b().e().c()) && aqda.d(f) == aqda.e(conversationId.a())) {
                    int e = aqda.e(conversationId.a());
                    boolean z = false;
                    if (e != 1) {
                        if (e == 2) {
                            if (aqda.e(conversationId.a()) == 2) {
                                z = true;
                            }
                            dbsk.l(z);
                            final btlu j = aqerVar.c.a().j();
                            if (j == null || !j.l()) {
                                aqerVar.g.a().a();
                                return;
                            }
                            apsi<Set<String>> l = aqerVar.d.a().c(j).l();
                            if (l == null || l.a().size() <= 0) {
                                aqerVar.g.a().a();
                                return;
                            } else if (l.a().size() == 1) {
                                aqerVar.a();
                                return;
                            } else {
                                aqerVar.e.a().c().c(f, conversationId).k(new cusr(aqerVar, j, f) { // from class: aqeq
                                    private final aqer a;
                                    private final btlu b;
                                    private final ctyy c;

                                    {
                                        this.a = aqerVar;
                                        this.b = j;
                                        this.c = f;
                                    }

                                    @Override // defpackage.cusr
                                    public final void a(Object obj) {
                                        String str;
                                        aqer aqerVar2 = this.a;
                                        btlu btluVar = this.b;
                                        ctyy ctyyVar = this.c;
                                        String b = aqco.b(((cufp) obj).i().get("gmbl"));
                                        if (b == null) {
                                            aqerVar2.a();
                                            return;
                                        }
                                        apsi<dbsg<apsg>> l2 = aqerVar2.d.a().e(b, btluVar).l();
                                        String str2 = null;
                                        if (l2 == null || !l2.a().a()) {
                                            str = null;
                                        } else {
                                            apsg b2 = l2.a().b();
                                            str2 = b2.b();
                                            str = b2.c();
                                        }
                                        apzd f2 = apze.f();
                                        f2.f(str2);
                                        f2.e(str);
                                        f2.d(b);
                                        f2.c(true);
                                        f2.b(apzb.INBOX_IN_UPDATES_TAB);
                                        aqerVar2.f.a().k(f2.a(), ctyyVar.b().e());
                                    }
                                });
                                return;
                            }
                        }
                        aqerVar.f.a().f();
                        return;
                    }
                    cjot a2 = aqerVar.g.a();
                    apzu bZ = apzv.c.bZ();
                    apzq bZ2 = apzt.e.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    apzt apztVar = (apzt) bZ2.b;
                    apztVar.b = 1;
                    apztVar.a |= 1;
                    int i = apzb.INBOX_IN_UPDATES_TAB.q;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    apzt apztVar2 = (apzt) bZ2.b;
                    apztVar2.a = 2 | apztVar2.a;
                    apztVar2.c = i;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    apzv apzvVar = (apzv) bZ.b;
                    apzt bK = bZ2.bK();
                    bK.getClass();
                    apzvVar.b = bK;
                    apzvVar.a |= 1;
                    a2.b(bZ.bK());
                    return;
                }
            }
            aqerVar.f.a().f();
        }
    }

    public final int i() {
        int i = 1;
        if (true != this.aq) {
            i = 2;
        }
        return ckgq.a(i);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.ak = (apzc) this.o.getSerializable("openConversationParams");
        this.al = apzw.b(this.o.getString("accountSelectionFlowType"));
        this.ap = this.o.getBoolean("openInboxOnTapBack");
        if (bundle == null) {
            this.aq = ((efh) this.ae).f;
            return;
        }
        this.aq = bundle.getBoolean("isColdActivityStart");
        this.ar = bundle.getBoolean("hasRecordedStartCounterMetrics");
        this.as = bundle.getBoolean("hasRecordedStartPerformanceMetrics");
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxv.du;
    }

    public final void q(ckgz ckgzVar, bvjk bvjkVar, apzb apzbVar) {
        String a;
        aqfu aqfuVar = this.at;
        if (aqfuVar == null) {
            return;
        }
        dbsg<ConversationId> r = aqfuVar.r();
        if (!r.a()) {
            String str = ckgzVar.b;
            return;
        }
        ConversationId b = r.b();
        if (b.c() == ConversationId.IdType.ONE_TO_ONE) {
            a = b.e().a();
        } else {
            a = b.d().a();
        }
        btlu j = this.g.j();
        Set<String> E = this.ag.E(bvjkVar, j, new HashSet());
        if (E.contains(a)) {
            return;
        }
        ((ckco) this.f.a(ckgzVar)).a(apzbVar.q);
        E.add(a);
        this.ag.ag(bvjkVar, j, E);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.F(null);
        egjVar.j(false);
        egjVar.J(this);
        this.a.a(egjVar.a());
        aqfu aqfuVar = this.at;
        if (aqfuVar != null) {
            aqfuVar.m();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putBoolean("isColdActivityStart", this.aq);
        bundle.putBoolean("hasRecordedStartCounterMetrics", this.ar);
        bundle.putBoolean("hasRecordedStartPerformanceMetrics", this.as);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) ggaVar.getSystemService("input_method");
            cuzt w = w(this.P);
            if (w != null) {
                inputMethodManager.hideSoftInputFromWindow(w.getWindowToken(), 0);
            }
        }
        aqfu aqfuVar = this.at;
        if (aqfuVar != null) {
            aqfuVar.n();
        }
    }
}
