package defpackage;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import com.google.android.apps.gmm.messaging.common.ConfigurableCurvularLayoutView;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aqkb  reason: default package */
/* loaded from: classes2.dex */
public class aqkb implements aqjp {
    private static final dcqe k = dcqe.c("aqkb");
    public final Activity a;
    public final cqhn b;
    public final aqgo c;
    public final dxio<aqov> d;
    public final dxio<apyz> e;
    public final dxio<apyu> f;
    public aqka g;
    public aqks h;
    @dzsi
    public dcep<String> i;
    @dzsi
    public cqkf<aqoh> j;
    private final aqeg<cvav, cvbp> l;
    private final dxio<aqps> m;
    private final dxio<aqkt> n;
    private final dxio<akfa> o;
    private final dxio<aprv> p;
    @dzsi
    private crzm<Set<String>> q;
    @dzsi
    private crzp<Set<String>> r;
    @dzsi
    private ctyy s;

    public aqkb(Activity activity, apzy apzyVar, cqhn cqhnVar, aqeh aqehVar, aqgo aqgoVar, dxio<aqps> dxioVar, dxio<aqov> dxioVar2, final dxio<apyu> dxioVar3, dxio<aqkt> dxioVar4, dxio<apyz> dxioVar5, dxio<akfa> dxioVar6, dxio<aprv> dxioVar7, ges gesVar, k kVar) {
        this.a = activity;
        this.b = cqhnVar;
        this.c = aqgoVar;
        this.m = dxioVar;
        this.d = dxioVar2;
        this.f = dxioVar3;
        this.n = dxioVar4;
        this.e = dxioVar5;
        this.o = dxioVar6;
        this.p = dxioVar7;
        this.l = aqehVar.a(kVar, cvbp.class, aqjo.a);
        if (apzyVar.i(null)) {
            aqka aqkaVar = new aqka(dxioVar3);
            this.g = aqkaVar;
            aqkaVar.c.b(gesVar, new aa(this, dxioVar3) { // from class: aqjq
                private final aqkb a;
                private final dxio b;

                {
                    this.a = this;
                    this.b = dxioVar3;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    aqkb aqkbVar = this.a;
                    dxio dxioVar8 = this.b;
                    Pair pair = (Pair) obj;
                    if (pair.first == null) {
                        return;
                    }
                    btlu btluVar = (btlu) pair.first;
                    dbsk.s(btluVar);
                    dcep<String> dcepVar = (dcep) pair.second;
                    if (dcepVar != null) {
                        aqkbVar.g((apyu) dxioVar8.a(), btluVar, dcepVar);
                    }
                    cqkx.p(aqkbVar);
                }
            });
        }
    }

    private final void j() {
        crzp<Set<String>> crzpVar;
        crzm<Set<String>> crzmVar = this.q;
        if (crzmVar != null && (crzpVar = this.r) != null) {
            crzmVar.c(crzpVar);
        }
        this.q = null;
        this.r = null;
        this.i = null;
        aqka aqkaVar = this.g;
        if (aqkaVar != null) {
            aqkaVar.a.g(null);
            aqkaVar.b.g(dcmr.a);
        }
    }

    @Override // defpackage.aqjp
    public Boolean a() {
        aqka aqkaVar = this.g;
        boolean z = true;
        if (aqkaVar != null) {
            Pair<btlu, dcep<String>> h = aqkaVar.c.h();
            if (h == null) {
                return false;
            }
            if (h.second == null || ((dcep) h.second).size() <= 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        dcep<String> dcepVar = this.i;
        if (dcepVar == null || dcepVar.size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aqjp
    public aqqm b() {
        return this.m.a();
    }

    @Override // defpackage.aqjp
    public cjtd c() {
        return cjtd.a(dtxv.bH);
    }

    @Override // defpackage.aqjp
    public aqek<cvbp> d() {
        return this.l.e;
    }

    @Override // defpackage.aqjp
    public cjtd e() {
        dcep<String> dcepVar = this.i;
        ddho ddhoVar = dtxv.bI;
        String str = null;
        if (dcepVar != null && dcepVar.size() == 1) {
            str = (String) dcft.c(dcepVar);
        }
        return aqdb.a(ddhoVar, str).a();
    }

    public void f(ctyy ctyyVar) {
        if (aqda.d(ctyyVar) != 2) {
            bvoo.h("Expected merchant account in setAccount()", new Object[0]);
        } else if (ctyyVar.equals(this.s)) {
        } else {
            this.s = ctyyVar;
            j();
            final btlu j = this.o.a().j();
            if (this.q == null && j != null && j.l()) {
                aqka aqkaVar = this.g;
                if (aqkaVar != null) {
                    aqkaVar.a.g(j);
                }
                this.q = new crzy(this.p.a().c(j), aqjs.a);
                crzp<Set<String>> crzpVar = new crzp(this, j) { // from class: aqjt
                    private final aqkb a;
                    private final btlu b;

                    {
                        this.a = this;
                        this.b = j;
                    }

                    @Override // defpackage.crzp
                    public final void On(crzm crzmVar) {
                        aqkb aqkbVar = this.a;
                        btlu btluVar = this.b;
                        Set set = (Set) crzmVar.l();
                        if (dbsd.a(aqkbVar.i, set)) {
                            return;
                        }
                        aqkbVar.h();
                        aqkbVar.i = set == null ? null : dcep.K(set);
                        aqka aqkaVar2 = aqkbVar.g;
                        if (aqkaVar2 != null) {
                            dcep<String> dcepVar = aqkbVar.i;
                            if (dcepVar == null) {
                                dcepVar = dcmr.a;
                            }
                            aqkaVar2.b.g(dcepVar);
                            return;
                        }
                        if (aqkbVar.i != null) {
                            dcep<String> dcepVar2 = aqkbVar.i;
                            dbsk.s(dcepVar2);
                            aqkbVar.g(aqkbVar.f.a(), btluVar, dcepVar2);
                        }
                        aqkbVar.a.runOnUiThread(new apzx(aqkbVar));
                    }
                };
                this.r = crzpVar;
                this.q.d(crzpVar, dege.a);
            }
            this.a.runOnUiThread(new apzx(this));
        }
    }

    public final void g(apyu apyuVar, btlu btluVar, dcep<String> dcepVar) {
        if (dcepVar.size() == 1) {
            final String str = (String) dcft.c(dcepVar);
            final ctyy ctyyVar = this.s;
            if (ctyyVar != null) {
                aqks a = this.n.a().a(btluVar, str);
                this.h = a;
                cqkf<aqoh> cqkfVar = this.j;
                if (cqkfVar != null) {
                    cqkfVar.e(a);
                }
                this.l.a(new aqef(this, ctyyVar, str) { // from class: aqjr
                    private final aqkb a;
                    private final ctyy b;
                    private final String c;

                    {
                        this.a = this;
                        this.b = ctyyVar;
                        this.c = str;
                    }

                    @Override // defpackage.aqef
                    public final cuvu a(View view) {
                        final aqkb aqkbVar = this.a;
                        ctyy ctyyVar2 = this.b;
                        final String str2 = this.c;
                        return aqkbVar.d.a().a(ctyyVar2, (cvbp) view, new dbsl(aqkbVar, str2) { // from class: aqju
                            private final aqkb a;
                            private final String b;

                            {
                                this.a = aqkbVar;
                                this.b = str2;
                            }

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                aqkb aqkbVar2 = this.a;
                                String str3 = this.b;
                                return aqkbVar2.c.a((cufw) obj, str3);
                            }
                        }, new cvau(aqkbVar) { // from class: aqjv
                            private final aqkb a;

                            {
                                this.a = aqkbVar;
                            }

                            @Override // defpackage.cvau
                            public final void a(ConversationId conversationId) {
                                apza i = apzc.i();
                                i.b(conversationId);
                                i.d(apzb.INBOX_IN_UPDATES_TAB);
                                this.a.e.a().n(i.e(), false);
                            }
                        }, new mw(aqkbVar) { // from class: aqjw
                            private final aqkb a;

                            {
                                this.a = aqkbVar;
                            }

                            @Override // defpackage.mw
                            public final void a(Object obj) {
                                aqkb aqkbVar2 = this.a;
                                aqog aqogVar = new aqog();
                                aqks aqksVar = aqkbVar2.h;
                                dbsk.s(aqksVar);
                                aqkbVar2.j = ((ConfigurableCurvularLayoutView) obj).a(aqogVar, aqksVar);
                            }
                        });
                    }
                });
            }
        } else if (dcepVar.size() > 1 && this.s != null && dcepVar.size() > 1) {
            ctyy ctyyVar2 = this.s;
            dbsk.s(ctyyVar2);
            this.m.a().b(ctyyVar2, dcepVar);
        }
        dcpd<String> it = dcepVar.iterator();
        while (it.hasNext()) {
            it.next();
            apyuVar.j();
        }
    }

    public final void h() {
        aqks aqksVar = this.h;
        if (aqksVar != null) {
            aqksVar.m();
        }
        this.i = dcmr.a;
        this.m.a().c();
    }

    public void i() {
        this.s = null;
        h();
        j();
        cqkf<aqoh> cqkfVar = this.j;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }
}
