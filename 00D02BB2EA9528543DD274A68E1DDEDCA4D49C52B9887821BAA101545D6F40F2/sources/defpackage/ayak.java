package defpackage;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayak  reason: default package */
/* loaded from: classes3.dex */
public final class ayak {
    public static final dcqe a = dcqe.c("ayak");
    public final gga b;
    public final bwqv c;
    public final bvrb d;
    public final cjqy e;
    public final ayay f;
    public final dxio<ache> g;
    public final dxio<axwi> h;
    public final dxio<axwk> i;
    public final dxio<axwq> j;
    public final dxio<axyz> k;
    public final cqkj l;
    private final dxio<axwo> m;
    private final dxio<dvme> n;

    public ayak(gga ggaVar, bwqv bwqvVar, bvrb bvrbVar, cjqy cjqyVar, ayay ayayVar, dxio<ache> dxioVar, dxio<axwi> dxioVar2, dxio<axwo> dxioVar3, dxio<axwk> dxioVar4, dxio<axwq> dxioVar5, dxio<axyz> dxioVar6, dxio<dvme> dxioVar7, cqkj cqkjVar) {
        this.b = ggaVar;
        this.c = bwqvVar;
        this.d = bvrbVar;
        this.e = cjqyVar;
        this.f = ayayVar;
        this.g = dxioVar;
        this.h = dxioVar2;
        this.m = dxioVar3;
        this.i = dxioVar4;
        this.j = dxioVar5;
        this.k = dxioVar6;
        this.n = dxioVar7;
        this.l = cqkjVar;
    }

    public static ddho c(@dzsi baad baadVar) {
        if (baadVar == null) {
            return dtxy.dR;
        }
        baab baabVar = baab.FAVORITES;
        int ordinal = baadVar.o().ordinal();
        if (ordinal == 0) {
            return dtxy.dQ;
        }
        if (ordinal == 1) {
            return dtxy.dS;
        }
        if (ordinal == 2) {
            return dtxy.dR;
        }
        if (ordinal == 5) {
            return dtxy.dP;
        }
        String valueOf = String.valueOf(baadVar.o());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Unsupported list type ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    private final void l(dccx<jho> dccxVar, @dzsi final baad baadVar) {
        boolean Y;
        if (baadVar == null) {
            Y = this.i.a().c();
        } else {
            Y = baadVar.Y();
        }
        final boolean z = !Y;
        int i = z ? R.string.LIST_SHOW_ON_MAP : R.string.LIST_HIDE_ON_MAP;
        jhm jhmVar = new jhm();
        jhmVar.l = i;
        jhmVar.a = this.b.getString(i);
        jhmVar.b = this.b.getString(i);
        jhmVar.g = new jhn(this, baadVar, z) { // from class: axzy
            private final ayak a;
            private final baad b;
            private final boolean c;

            {
                this.a = this;
                this.b = baadVar;
                this.c = z;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                final ayak ayakVar = this.a;
                final baad baadVar2 = this.b;
                final boolean z2 = this.c;
                new ayaj(ayakVar, baadVar2, z2) { // from class: axzz
                    private final ayak a;
                    private final baad b;
                    private final boolean c;

                    {
                        this.a = ayakVar;
                        this.b = baadVar2;
                        this.c = z2;
                    }

                    @Override // defpackage.ayaj
                    public final void a() {
                        ddho ddhoVar;
                        ayak ayakVar2 = this.a;
                        baad baadVar3 = this.b;
                        boolean z3 = this.c;
                        if (!ayakVar2.b.aZ) {
                            return;
                        }
                        if (baadVar3 != null) {
                            baadVar3.Z();
                            ayakVar2.i.a().g(baadVar3);
                        } else {
                            ayakVar2.i.a().d();
                        }
                        if (baadVar3 == null) {
                            ddhoVar = dtyb.dA;
                        } else {
                            baab baabVar = baab.FAVORITES;
                            int ordinal = baadVar3.o().ordinal();
                            if (ordinal == 0) {
                                ddhoVar = dtyb.dz;
                            } else if (ordinal == 1) {
                                ddhoVar = dtyb.dB;
                            } else if (ordinal == 2) {
                                ddhoVar = dtyb.dA;
                            } else if (ordinal != 5) {
                                bvoo.h("Unsupported list type '%s'", baadVar3.o());
                                ddhoVar = null;
                            } else {
                                ddhoVar = dtyb.dy;
                            }
                        }
                        if (ddhoVar == null) {
                            return;
                        }
                        ayakVar2.e.i(cjqg.a(z3, cjtd.a(ddhoVar)));
                    }
                }.a();
            }
        };
        dccxVar.g(jhmVar.c());
    }

    private final void m(dccx<jho> dccxVar, final ayaj ayajVar) {
        jhm jhmVar = new jhm();
        jhmVar.l = R.string.LIST_SHARING_OPTIONS;
        jhmVar.a = this.b.getString(R.string.LIST_SHARING_OPTIONS);
        jhmVar.b = this.b.getString(R.string.LIST_SHARING_OPTIONS);
        jhmVar.f = cjtd.a(dtxy.ei);
        jhmVar.g = new jhn(ayajVar) { // from class: ayab
            private final ayaj a;

            {
                this.a = ayajVar;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                this.a.a();
            }
        };
        dccxVar.g(jhmVar.c());
    }

    private final void n(dccx<jho> dccxVar, final baad baadVar) {
        if (!baadVar.C()) {
            return;
        }
        jhm jhmVar = new jhm();
        jhmVar.l = R.string.LIST_REFRESH_OPTION;
        jhmVar.a = this.b.getString(R.string.LIST_REFRESH_OPTION);
        jhmVar.b = this.b.getString(R.string.LIST_REFRESH_OPTION);
        jhmVar.f = cjtd.a(dtyg.E);
        jhmVar.g = new jhn(this, baadVar) { // from class: ayad
            private final ayak a;
            private final baad b;

            {
                this.a = this;
                this.b = baadVar;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                final ayak ayakVar = this.a;
                final baad baadVar2 = this.b;
                new ayaj(ayakVar, baadVar2) { // from class: ayae
                    private final ayak a;
                    private final baad b;

                    {
                        this.a = ayakVar;
                        this.b = baadVar2;
                    }

                    @Override // defpackage.ayaj
                    public final void a() {
                        ayak ayakVar2 = this.a;
                        baad baadVar3 = this.b;
                        if (!ayakVar2.b.aZ || !ayakVar2.f.e()) {
                            return;
                        }
                        ayakVar2.k.a().c(baadVar3.n());
                        ayakVar2.j.a().s(axzw.a);
                    }
                }.a();
            }
        };
        dccxVar.g(jhmVar.c());
    }

    private final void o(dccx<jho> dccxVar, final ayaj ayajVar) {
        jhm jhmVar = new jhm();
        jhmVar.l = R.string.EDIT_LIST;
        jhmVar.a = this.b.getString(R.string.EDIT_LIST);
        jhmVar.b = this.b.getString(R.string.EDIT_LIST);
        jhmVar.f = cjtd.a(dtyg.C);
        jhmVar.g = new jhn(ayajVar) { // from class: ayaf
            private final ayaj a;

            {
                this.a = ayajVar;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                this.a.a();
            }
        };
        dccxVar.g(jhmVar.c());
    }

    public final dcdc<jho> a() {
        dccx<jho> F = dcdc.F();
        l(F, null);
        o(F, i(null));
        return F.f();
    }

    public final dcdc<jho> b(final baad baadVar, boolean z) {
        dccx<jho> F = dcdc.F();
        if ((baadVar.y() || !baadVar.j().contains(baaj.EXPERIENCE)) && (!baadVar.X() || !baadVar.ab())) {
            if (baadVar.q()) {
                l(F, baadVar);
                o(F, i(baadVar));
                if (!z) {
                    k(F, true, baadVar);
                }
                m(F, g(baadVar));
                if (z) {
                    n(F, baadVar);
                }
            } else if (baadVar.y()) {
                l(F, baadVar);
                o(F, i(baadVar));
                if (!z) {
                    k(F, true, baadVar);
                }
                m(F, g(baadVar));
                if (z) {
                    n(F, baadVar);
                }
                if (!baadVar.D()) {
                    final ayaj ayajVar = new ayaj(this, baadVar) { // from class: axzo
                        private final ayak a;
                        private final baad b;

                        {
                            this.a = this;
                            this.b = baadVar;
                        }

                        @Override // defpackage.ayaj
                        public final void a() {
                            final ayak ayakVar = this.a;
                            final baad baadVar2 = this.b;
                            if (!ayakVar.b.aZ) {
                                return;
                            }
                            iii iiiVar = new iii();
                            iiiVar.a = ayakVar.b.getString(R.string.LEAVE_LIST_CONFIRM_DIALOG_TITLE);
                            iiiVar.b = ayakVar.b.getString(R.string.LEAVE_LIST_CONFIRM_DIALOG_TEXT);
                            iiiVar.d(ayakVar.b.getString(R.string.LEAVE_LIST_CONFIRM_DIALOG_POSITIVE_SHORT), new View.OnClickListener(ayakVar, baadVar2) { // from class: axzt
                                private final ayak a;
                                private final baad b;

                                {
                                    this.a = ayakVar;
                                    this.b = baadVar2;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ayak ayakVar2 = this.a;
                                    ayakVar2.h.a().o(this.b);
                                }
                            }, cjtd.a(dtxy.eH));
                            iiiVar.c(ayakVar.b.getString(R.string.GO_BACK_BUTTON), null, cjtd.a(dtxy.eG));
                            iiiVar.a(ayakVar.b, ayakVar.l).k();
                        }
                    };
                    jhm jhmVar = new jhm();
                    jhmVar.l = R.string.LEAVE_LIST;
                    jhmVar.a = this.b.getString(R.string.LEAVE_LIST);
                    jhmVar.b = this.b.getString(R.string.LEAVE_LIST);
                    jhmVar.f = cjtd.a(dtyg.D);
                    jhmVar.g = new jhn(ayajVar) { // from class: axzn
                        private final ayaj a;

                        {
                            this.a = ayajVar;
                        }

                        @Override // defpackage.jhn
                        public final void a(View view, cjqm cjqmVar) {
                            this.a.a();
                        }
                    };
                    F.g(jhmVar.c());
                } else {
                    final ayaj ayajVar2 = new ayaj(this, baadVar) { // from class: axzm
                        private final ayak a;
                        private final baad b;

                        {
                            this.a = this;
                            this.b = baadVar;
                        }

                        @Override // defpackage.ayaj
                        public final void a() {
                            final ayak ayakVar = this.a;
                            final baad baadVar2 = this.b;
                            if (!ayakVar.b.aZ) {
                                return;
                            }
                            iii iiiVar = new iii();
                            iiiVar.a = ayakVar.b.getString(R.string.DELETE_LIST_CONFIRM_DIALOG_TITLE);
                            iiiVar.b = ayakVar.b.getString(R.string.DELETE_LIST_CONFIRM_DIALOG_TEXT);
                            iiiVar.d(ayakVar.b.getString(R.string.DELETE_LIST_CONFIRM_DIALOG_POSITIVE), new View.OnClickListener(ayakVar, baadVar2) { // from class: axzv
                                private final ayak a;
                                private final baad b;

                                {
                                    this.a = ayakVar;
                                    this.b = baadVar2;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ayak ayakVar2 = this.a;
                                    ayakVar2.h.a().r(this.b);
                                }
                            }, cjtd.a(dtxy.eF));
                            iiiVar.c(ayakVar.b.getString(R.string.GO_BACK_BUTTON), null, cjtd.a(dtxy.eE));
                            iiiVar.a(ayakVar.b, ayakVar.l).k();
                        }
                    };
                    jhm jhmVar2 = new jhm();
                    jhmVar2.l = R.string.DELETE_LIST;
                    jhmVar2.a = this.b.getString(R.string.DELETE_LIST);
                    jhmVar2.b = this.b.getString(R.string.DELETE_LIST);
                    jhmVar2.f = cjtd.a(dtyg.B);
                    jhmVar2.g = new jhn(ayajVar2) { // from class: axzl
                        private final ayaj a;

                        {
                            this.a = ayajVar2;
                        }

                        @Override // defpackage.jhn
                        public final void a(View view, cjqm cjqmVar) {
                            this.a.a();
                        }
                    };
                    F.g(jhmVar2.c());
                }
            } else if (baadVar.z()) {
                l(F, baadVar);
                if (!z) {
                    k(F, false, baadVar);
                    final ayaj ayajVar3 = new ayaj(this, baadVar) { // from class: axzq
                        private final ayak a;
                        private final baad b;

                        {
                            this.a = this;
                            this.b = baadVar;
                        }

                        @Override // defpackage.ayaj
                        public final void a() {
                            ayak ayakVar = this.a;
                            baad baadVar2 = this.b;
                            if (!ayakVar.b.aZ || !ayakVar.f.e()) {
                                return;
                            }
                            deha.q(ayakVar.h.a().n(baadVar2), new ayai(ayakVar, ayakVar.j(R.string.UNFOLLOWING_LIST)), ayakVar.d.h());
                        }
                    };
                    int i = true != this.n.a().o ? R.string.UNFOLLOW_LIST : R.string.REMOVE_LIST;
                    jhm jhmVar3 = new jhm();
                    jhmVar3.l = i;
                    jhmVar3.a = this.b.getString(i);
                    jhmVar3.b = this.b.getString(i);
                    jhmVar3.f = cjtd.a(dtxy.eA);
                    jhmVar3.g = new jhn(ayajVar3) { // from class: axzp
                        private final ayaj a;

                        {
                            this.a = ayajVar3;
                        }

                        @Override // defpackage.jhn
                        public final void a(View view, cjqm cjqmVar) {
                            this.a.a();
                        }
                    };
                    F.g(jhmVar3.c());
                }
            } else if (!z) {
                k(F, false, baadVar);
            } else if (!baadVar.y()) {
                n(F, baadVar);
            }
        }
        if (this.n.a().p) {
            jhm jhmVar4 = new jhm();
            jhmVar4.l = R.string.SEND_FEEDBACK;
            jhmVar4.a = this.b.getString(R.string.SEND_FEEDBACK);
            jhmVar4.b = this.b.getString(R.string.SEND_FEEDBACK);
            jhmVar4.f = cjtd.a(dtxy.eh);
            jhmVar4.g = new jhn(this) { // from class: axzr
                private final ayak a;

                {
                    this.a = this;
                }

                @Override // defpackage.jhn
                public final void a(View view, cjqm cjqmVar) {
                    final ayak ayakVar = this.a;
                    new ayaj(ayakVar) { // from class: axzs
                        private final ayak a;

                        {
                            this.a = ayakVar;
                        }

                        @Override // defpackage.ayaj
                        public final void a() {
                            ayak ayakVar2 = this.a;
                            if (!ayakVar2.b.aZ) {
                                return;
                            }
                            ayakVar2.g.a().k(false, true, achc.LOCAL_DISCOVERY, null);
                        }
                    }.a();
                }
            };
            F.g(jhmVar4.c());
        }
        return F.f();
    }

    public final ayaj d(@dzsi final baad baadVar) {
        return new ayaj(this, baadVar) { // from class: axzu
            private final ayak a;
            private final baad b;

            {
                this.a = this;
                this.b = baadVar;
            }

            @Override // defpackage.ayaj
            public final void a() {
                ayak ayakVar = this.a;
                baad baadVar2 = this.b;
                gga ggaVar = ayakVar.b;
                if (!ggaVar.aZ) {
                    return;
                }
                if (baadVar2 == null) {
                    ggaVar.D(azrm.aR(ayakVar.c, true, ggaVar.getString(R.string.ADD_PLACE_TO_LIST_HINT)));
                } else {
                    ggaVar.D(azrm.aS(ayakVar.c, bwrs.a(baadVar2), true, ayakVar.b.getString(R.string.ADD_PLACE_TO_LIST_HINT), true));
                }
            }
        };
    }

    public final ayaj e(final baad baadVar, final ddho ddhoVar) {
        return new ayaj(this, baadVar, ddhoVar) { // from class: ayaa
            private final ayak a;
            private final baad b;
            private final ddho c;

            {
                this.a = this;
                this.b = baadVar;
                this.c = ddhoVar;
            }

            @Override // defpackage.ayaj
            public final void a() {
                ayak ayakVar = this.a;
                baad baadVar2 = this.b;
                ddho ddhoVar2 = this.c;
                if (!ayakVar.b.aZ || !ayakVar.f.e()) {
                    return;
                }
                if (baadVar2.w()) {
                    ayakVar.f(baadVar2, ddhoVar2);
                    return;
                }
                iii iiiVar = new iii();
                iiiVar.a = ayakVar.b.getString(R.string.SHARE_LIST_CONFIRMATION_DIALOG_TITLE);
                iiiVar.b = ayakVar.b.getString(R.string.SHARE_LIST_CONFIRMATION_DIALOG_MESSAGE);
                iiiVar.d(ayakVar.b.getString(R.string.CONTINUE_BUTTON), new View.OnClickListener(ayakVar, baadVar2, ddhoVar2) { // from class: axzx
                    private final ayak a;
                    private final baad b;
                    private final ddho c;

                    {
                        this.a = ayakVar;
                        this.b = baadVar2;
                        this.c = ddhoVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.f(this.b, this.c);
                    }
                }, cjtd.a(dtxy.eJ));
                iiiVar.c(ayakVar.b.getString(R.string.CANCEL_BUTTON), null, cjtd.a(dtxy.eI));
                iiiVar.a(ayakVar.b, ayakVar.l).k();
            }
        };
    }

    public final void f(baad baadVar, ddho ddhoVar) {
        deha.q(this.m.a().l(baadVar, ddhoVar), new ayag(this, j(R.string.SHARING_LIST)), this.d.h());
    }

    public final ayaj g(final baad baadVar) {
        return new ayaj(this, baadVar) { // from class: ayac
            private final ayak a;
            private final baad b;

            {
                this.a = this;
                this.b = baadVar;
            }

            @Override // defpackage.ayaj
            public final void a() {
                ayak ayakVar = this.a;
                baad baadVar2 = this.b;
                if (!ayakVar.b.aZ || !ayakVar.f.e()) {
                    return;
                }
                gga ggaVar = ayakVar.b;
                bwqv bwqvVar = ayakVar.c;
                bwrs a2 = bwrs.a(baadVar2);
                azcw azcwVar = new azcw();
                Bundle bundle = new Bundle();
                bwqvVar.c(bundle, "arg_local_list", a2);
                azcwVar.B(bundle);
                ggaVar.D(azcwVar);
            }
        };
    }

    public final ayaj h(@dzsi final bwrs<baad> bwrsVar) {
        return new ayaj(this, bwrsVar) { // from class: axzk
            private final ayak a;
            private final bwrs b;

            {
                this.a = this;
                this.b = bwrsVar;
            }

            @Override // defpackage.ayaj
            public final void a() {
                ayak ayakVar = this.a;
                bwrs bwrsVar2 = this.b;
                if (!ayakVar.b.aZ) {
                    return;
                }
                if (bwrsVar2.c() == null) {
                    gga ggaVar = ayakVar.b;
                    ayrr ayrrVar = new ayrr();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_starred_places_list", true);
                    ayrrVar.B(bundle);
                    ggaVar.D(ayrrVar);
                    return;
                }
                ayakVar.b.D(ayrr.g(ayakVar.c, bwrsVar2));
            }
        };
    }

    public final ayaj i(@dzsi baad baadVar) {
        return h(bwrs.a(baadVar));
    }

    public final ProgressDialog j(int i) {
        ProgressDialog progressDialog = new ProgressDialog(this.b, 0);
        progressDialog.setMessage(this.b.getString(i));
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
        return progressDialog;
    }

    private final void k(dccx<jho> dccxVar, boolean z, final baad baadVar) {
        final ddho ddhoVar = z ? dtxy.es : dtxy.et;
        jhm jhmVar = new jhm();
        jhmVar.l = R.string.SHARE_LIST;
        jhmVar.a = this.b.getString(R.string.SHARE_LIST);
        jhmVar.b = this.b.getString(R.string.SHARE_LIST);
        jhmVar.f = cjtd.a(ddhoVar);
        jhmVar.g = new jhn(this, baadVar, ddhoVar) { // from class: axzj
            private final ayak a;
            private final baad b;
            private final ddho c;

            {
                this.a = this;
                this.b = baadVar;
                this.c = ddhoVar;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                this.a.e(this.b, this.c).a();
            }
        };
        dccxVar.g(jhmVar.c());
    }
}
