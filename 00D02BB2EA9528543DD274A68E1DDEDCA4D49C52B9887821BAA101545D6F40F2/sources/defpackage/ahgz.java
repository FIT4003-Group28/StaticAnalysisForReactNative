package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahgz  reason: default package */
/* loaded from: classes2.dex */
public class ahgz implements agww, agbt {
    @dzsi
    public agwv a;
    private final gga b;
    private final agaw c;
    private final dehq d;
    private final dehq e;
    private final ilo f;
    private final cjta g;

    public ahgz(cqhn cqhnVar, gga ggaVar, agaw agawVar, dehq dehqVar, dehq dehqVar2, agbv<akqi> agbvVar, ilo iloVar, cjta cjtaVar) {
        this.b = ggaVar;
        this.c = agawVar;
        this.d = dehqVar;
        this.e = dehqVar2;
        this.f = iloVar;
        this.g = cjtaVar;
        agbvVar.a(iloVar.ai(), this);
    }

    @Override // defpackage.agww
    public CharSequence b() {
        ahgy k = k();
        if (k != null) {
            ahap ahapVar = (ahap) k;
            int i = ahapVar.a;
            if (i == 0) {
                String str = ahapVar.b;
                dbsk.s(str);
                return str;
            }
            return this.b.getString(i);
        }
        return this.b.getString(R.string.DEFAULT_LIST_WANT_TO_GO);
    }

    @Override // defpackage.agww
    public cqtd c() {
        ahgy k = k();
        if (k != null) {
            return iup.e(((ahap) k).c);
        }
        return iup.e(R.raw.localstream_bookmark_want_to_go_overlay_svg);
    }

    @Override // defpackage.agww
    public cqss d() {
        ahgy k = k();
        return k != null ? ((ahap) k).d : ibm.L();
    }

    @Override // defpackage.agww
    public Boolean e() {
        return Boolean.valueOf(k() != null);
    }

    @Override // defpackage.agww
    public Boolean f() {
        return Boolean.valueOf(agaw.f(this.f));
    }

    @Override // defpackage.agww
    public CharSequence g() {
        return this.b.getString(true != e().booleanValue() ? R.string.LOCALSTREAM_ACCESSIBILITY_SAVE_PLACE_IN_LIST : R.string.LOCALSTREAM_ACCESSIBILITY_REMOVE_PLACE_FROM_LIST, new Object[]{this.f.n(), b()});
    }

    @Override // defpackage.agww
    public cjtd h(boolean z) {
        cjta cjtaVar = this.g;
        ddho ddhoVar = (!e().booleanValue() || ahgy.f.equals(k())) ? z ? dtxu.bR : dtxu.co : z ? dtxu.bQ : dtxu.cn;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = e().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        return cjtaVar.c(ddhoVar, bZ.bK());
    }

    @Override // defpackage.agww
    public cqkl i() {
        if (!(!e().booleanValue())) {
            this.c.c(this.f);
            return cqkl.a;
        }
        final agaw agawVar = this.c;
        final ilo iloVar = this.f;
        final baab baabVar = baab.WANT_TO_GO;
        final deig d = deig.d();
        Runnable runnable = new Runnable(agawVar, iloVar, d, baabVar) { // from class: agam
            private final agaw a;
            private final ilo b;
            private final deig c;
            private final baab d;

            {
                this.a = agawVar;
                this.b = iloVar;
                this.c = d;
                this.d = baabVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final agaw agawVar2 = this.a;
                final ilo iloVar2 = this.b;
                final deig deigVar = this.c;
                final baab baabVar2 = this.d;
                if (!agawVar2.f.a().j().l() || !agaw.f(iloVar2)) {
                    gga ggaVar = agawVar2.b;
                    cjxu.m(ggaVar, ggaVar.getString(R.string.FAILED_TO_SAVE_PLACE));
                    deigVar.j(false);
                    return;
                }
                agawVar2.i.a().a(new bvqg(agawVar2, baabVar2, iloVar2, deigVar) { // from class: agas
                    private final agaw a;
                    private final baab b;
                    private final ilo c;
                    private final deig d;

                    {
                        this.a = agawVar2;
                        this.b = baabVar2;
                        this.c = iloVar2;
                        this.d = deigVar;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        final agaw agawVar3 = this.a;
                        baab baabVar3 = this.b;
                        final ilo iloVar3 = this.c;
                        final deig deigVar2 = this.d;
                        Boolean bool = (Boolean) obj;
                        bvqj.c(agawVar3.h.a().i(baabVar3), new bvqg(agawVar3, iloVar3, deigVar2) { // from class: agat
                            private final agaw a;
                            private final ilo b;
                            private final deig c;

                            {
                                this.a = agawVar3;
                                this.b = iloVar3;
                                this.c = deigVar2;
                            }

                            @Override // defpackage.bvqg
                            public final void NU(Object obj2) {
                                final agaw agawVar4 = this.a;
                                final ilo iloVar4 = this.b;
                                deig deigVar3 = this.c;
                                final baad baadVar = (baad) obj2;
                                if (baadVar == null) {
                                    return;
                                }
                                boolean h = baadVar.h(azxb.f(iloVar4.ai(), iloVar4.aj()));
                                baal d2 = agawVar4.h.a().d(baadVar, iloVar4);
                                if (!h) {
                                    baadVar.b(d2);
                                    agawVar4.h.a().j(baadVar);
                                    bvqd.a(agawVar4.k.d(new Runnable(agawVar4, iloVar4, baadVar) { // from class: agau
                                        private final agaw a;
                                        private final ilo b;
                                        private final baad c;

                                        {
                                            this.a = agawVar4;
                                            this.b = iloVar4;
                                            this.c = baadVar;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            agaw agawVar5 = this.a;
                                            ilo iloVar5 = this.b;
                                            baad baadVar2 = this.c;
                                            if (!agawVar5.b.aZ) {
                                                return;
                                            }
                                            cztq a = cztt.a(agawVar5.c.a());
                                            gga ggaVar2 = agawVar5.b;
                                            a.c = ggaVar2.getString(R.string.SAVED_IN_LIST, new Object[]{baadVar2.E(ggaVar2)});
                                            a.f(agawVar5.b.getString(R.string.LOCALSTREAM_CHANGE_SAVED_LIST), new View.OnClickListener(agawVar5, baadVar2, iloVar5) { // from class: agan
                                                private final agaw a;
                                                private final baad b;
                                                private final ilo c;

                                                {
                                                    this.a = agawVar5;
                                                    this.b = baadVar2;
                                                    this.c = iloVar5;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    final agaw agawVar6 = this.a;
                                                    final baad baadVar3 = this.b;
                                                    final ilo iloVar6 = this.c;
                                                    agawVar6.j.execute(new Runnable(agawVar6, baadVar3, iloVar6) { // from class: agaq
                                                        private final agaw a;
                                                        private final baad b;
                                                        private final ilo c;

                                                        {
                                                            this.a = agawVar6;
                                                            this.b = baadVar3;
                                                            this.c = iloVar6;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            final agaw agawVar7 = this.a;
                                                            baad baadVar4 = this.b;
                                                            final ilo iloVar7 = this.c;
                                                            baadVar4.e(agawVar7.h.a().d(baadVar4, iloVar7));
                                                            agawVar7.h.a().j(baadVar4);
                                                            agawVar7.l.b(iloVar7.ai());
                                                            agawVar7.k.execute(new Runnable(agawVar7, iloVar7) { // from class: agar
                                                                private final agaw a;
                                                                private final ilo b;

                                                                {
                                                                    this.a = agawVar7;
                                                                    this.b = iloVar7;
                                                                }

                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    agaw agawVar8 = this.a;
                                                                    ilo iloVar8 = this.b;
                                                                    if (agawVar8.b.aZ) {
                                                                        agawVar8.c(iloVar8);
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                            a.d(cztr.LONG);
                                            a.c();
                                        }
                                    }, 300L, TimeUnit.MILLISECONDS), agawVar4.j);
                                    agawVar4.l.b(iloVar4.ai());
                                }
                                deigVar3.j(true);
                            }
                        }, dege.a);
                    }
                });
            }
        };
        if (agawVar.f.a().j().l()) {
            agawVar.j.execute(runnable);
        } else {
            agawVar.g.a(akeu.j(new agav(agawVar, runnable, d)).b());
        }
        bvqj.c(d, new bvqg(this) { // from class: ahgw
            private final ahgz a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ahgz ahgzVar = this.a;
                Boolean bool = (Boolean) obj;
                dbsk.s(bool);
                if (bool.booleanValue()) {
                    ahgzVar.a = agwv.SAVE_COMPLETED;
                    cqkx.p(ahgzVar);
                }
            }
        }, this.d);
        return cqkl.a;
    }

    @Override // defpackage.agww
    @dzsi
    public agwv j(@dzsi agwv agwvVar) {
        agwv agwvVar2 = this.a;
        this.a = null;
        return agwvVar2;
    }

    @dzsi
    final ahgy k() {
        azwv b = this.c.b(this.f);
        dcep<azwu> n = b != null ? b.n() : dcmr.a;
        for (azwu azwuVar : n) {
            if (azwuVar.b() == baab.FAVORITES) {
                return ahgy.e;
            }
        }
        for (azwu azwuVar2 : n) {
            if (azwuVar2.b() == baab.WANT_TO_GO) {
                return ahgy.f;
            }
        }
        azwv b2 = this.c.b(this.f);
        if (b2 == null || !b2.f()) {
            for (azwu azwuVar3 : n) {
                if (azwuVar3.b() == baab.CUSTOM && azwuVar3.d()) {
                    return ahgy.i(azwuVar3.c());
                }
            }
            return null;
        }
        return ahgy.g;
    }

    @Override // defpackage.agbt
    /* renamed from: l */
    public void a(akqi akqiVar) {
        bvqd.a(this.d.d(new Runnable(this) { // from class: ahgx
            private final ahgz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        }, 225L, TimeUnit.MILLISECONDS), this.e);
    }
}
