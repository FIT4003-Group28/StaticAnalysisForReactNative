package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ceen  reason: default package */
/* loaded from: classes4.dex */
public final class ceen extends itb implements ceet {
    public final gga a;
    public final akfa b;
    public final akfc c;
    public final dxio<axjh> d;
    private final bwqv e;
    private final cese f;

    public ceen(gga ggaVar, bwqv bwqvVar, dxio<akfa> dxioVar, akfc akfcVar, dxio<axjh> dxioVar2, cese ceseVar) {
        this.a = ggaVar;
        this.e = bwqvVar;
        this.b = dxioVar.a();
        this.c = akfcVar;
        this.d = dxioVar2;
        this.f = ceseVar;
    }

    private final void o(cerx cerxVar, final ceek ceekVar) {
        btlu j = this.b.j();
        ceru ceruVar = (ceru) cerxVar;
        String str = ceruVar.a;
        if (ceruVar.b) {
            if (dbsj.d(str)) {
                if (q(cerxVar)) {
                    return;
                }
                if (!j.l()) {
                    if (ceruVar.h == 1) {
                        p(cerxVar);
                        return;
                    } else {
                        this.c.k(new ceel(this, ceekVar), "");
                        return;
                    }
                }
                str = j.d;
            }
            ceekVar.a(str);
        } else if (q(cerxVar)) {
        } else {
            ceel ceelVar = new ceel(this, new ceek(ceekVar) { // from class: ceej
                private final ceek a;

                {
                    this.a = ceekVar;
                }

                @Override // defpackage.ceek
                public final void a(String str2) {
                    this.a.a(null);
                }
            });
            if (!dbsj.d(str)) {
                if (!j.l() || !j.d.equals(str)) {
                    this.c.f(str, ceelVar);
                } else {
                    ceekVar.a(null);
                }
            } else if (j.l()) {
                ceekVar.a(null);
            } else if (ceruVar.h == 1) {
                p(cerxVar);
            } else {
                this.c.k(ceelVar, "");
            }
        }
    }

    private final void p(cerx cerxVar) {
        this.a.D(akef.i(this.e, new ceem(cerxVar), R.string.CONTRIBUTIONS_LOGIN_PROMPT_TITLE, R.string.CONTRIBUTIONS_LOGIN_PROMPT_BODY));
    }

    private final boolean q(cerx cerxVar) {
        if (btlu.i(this.b.j()) != btlt.INCOGNITO) {
            return false;
        }
        bwqv bwqvVar = this.e;
        afdr i = afdt.i();
        i.g(R.string.YOUR_PROFILE_SIDE_MENU_BUTTON);
        i.b(R.string.PROFILE_INCOGNITO_MESSAGE);
        i.c(new ceem(cerxVar));
        this.a.D(afaw.aR(bwqvVar, i.a()));
        return true;
    }

    @Override // defpackage.ceet
    public final boolean e() {
        return this.f.a();
    }

    @Override // defpackage.ceet
    public final boolean f() {
        return this.f.b();
    }

    @Override // defpackage.ceet
    public final void i(@dzsi String str) {
        j(str, false, null);
    }

    @Override // defpackage.ceet
    public final void j(@dzsi String str, boolean z, @dzsi final dpyv dpyvVar) {
        if (!e()) {
            return;
        }
        btlu j = this.b.j();
        boolean z2 = false;
        boolean z3 = str == null || (j.l() && str.equals(j.d));
        if (!z && !z3) {
            z2 = true;
        }
        o(new ceru(1, str, z2, false, null, null, null, null, dpyvVar), new ceek(this, dpyvVar) { // from class: ceed
            private final ceen a;
            private final dpyv b;

            {
                this.a = this;
                this.b = dpyvVar;
            }

            @Override // defpackage.ceek
            public final void a(String str2) {
                this.a.a.D(ceec.g(str2, this.b));
            }
        });
    }

    @Override // defpackage.ceet
    public final void k(final dhtc dhtcVar, @dzsi final gfw gfwVar) {
        ceek ceekVar;
        if (e()) {
            dqkn dqknVar = dhtcVar.b;
            if (dqknVar == null) {
                dqknVar = dqkn.e;
            }
            ceru ceruVar = new ceru(3, dqknVar.d, false, false, null, null, bvrt.b(dhtcVar), null, null);
            if (gfwVar != null) {
                ceekVar = new ceek(gfwVar, dhtcVar) { // from class: ceee
                    private final gfw a;
                    private final dhtc b;

                    {
                        this.a = gfwVar;
                        this.b = dhtcVar;
                    }

                    @Override // defpackage.ceek
                    public final void a(String str) {
                        this.a.aZ(cedu.g(this.b));
                    }
                };
            } else {
                ceekVar = new ceek(this, dhtcVar) { // from class: ceef
                    private final ceen a;
                    private final dhtc b;

                    {
                        this.a = this;
                        this.b = dhtcVar;
                    }

                    @Override // defpackage.ceek
                    public final void a(String str) {
                        this.a.a.D(cedu.g(this.b));
                    }
                };
            }
            o(ceruVar, ceekVar);
        }
    }

    @Override // defpackage.ceet
    public final void l(@dzsi String str, final drds drdsVar, boolean z, final cees ceesVar) {
        ceek ceekVar;
        if (!e()) {
            return;
        }
        final gfw c = ceesVar.c();
        ceru ceruVar = new ceru(2, str, z, ceesVar.f(), drdsVar, null, bvrt.b(ceesVar.a()), bvrt.b(ceesVar.d()), ceesVar.b());
        if (c != null) {
            ceekVar = new ceek(c, drdsVar, ceesVar) { // from class: ceeg
                private final gfw a;
                private final drds b;
                private final cees c;

                {
                    this.a = c;
                    this.b = drdsVar;
                    this.c = ceesVar;
                }

                @Override // defpackage.ceek
                public final void a(String str2) {
                    this.a.aZ(cedy.g(str2, this.b, this.c));
                }
            };
        } else {
            ceekVar = new ceek(this, ceesVar, drdsVar) { // from class: ceeh
                private final ceen a;
                private final cees b;
                private final drds c;

                {
                    this.a = this;
                    this.b = ceesVar;
                    this.c = drdsVar;
                }

                @Override // defpackage.ceek
                public final void a(String str2) {
                    ceen ceenVar = this.a;
                    cees ceesVar2 = this.b;
                    drds drdsVar2 = this.c;
                    if (!ceesVar2.f() || !ceenVar.n(str2)) {
                        ceenVar.a.D(cedy.g(str2, drdsVar2, ceesVar2));
                        return;
                    }
                    ceec g = ceec.g(str2, null);
                    ceenVar.a.D(g);
                    g.aZ(cedy.g(str2, drdsVar2, ceesVar2));
                }
            };
        }
        o(ceruVar, ceekVar);
    }

    @Override // defpackage.ceet
    public final void m(final String str, final axok axokVar, @dzsi final dpyv dpyvVar) {
        if (!e()) {
            return;
        }
        o(new ceru(4, str, false, true, null, axokVar, null, null, dpyvVar), new ceek(this, str, dpyvVar, axokVar) { // from class: ceei
            private final ceen a;
            private final String b;
            private final dpyv c;
            private final axok d;

            {
                this.a = this;
                this.b = str;
                this.c = dpyvVar;
                this.d = axokVar;
            }

            @Override // defpackage.ceek
            public final void a(String str2) {
                ceen ceenVar = this.a;
                String str3 = this.b;
                dpyv dpyvVar2 = this.c;
                axok axokVar2 = this.d;
                btlu j = ceenVar.b.j();
                if (!j.l() || !str3.equals(j.j())) {
                    return;
                }
                if (ceenVar.n(str2)) {
                    ceenVar.a.D(ceec.g(str2, null));
                    ceenVar.a.g().aq();
                }
                dqkm bZ = dqkn.e.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqkn dqknVar = (dqkn) bZ.b;
                str3.getClass();
                dqknVar.a |= 4;
                dqknVar.d = str3;
                String e = dbsj.e(j.v());
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqkn dqknVar2 = (dqkn) bZ.b;
                e.getClass();
                dqknVar2.a |= 1;
                dqknVar2.b = e;
                dqkn bK = bZ.bK();
                if (dpyvVar2 == null) {
                    ceenVar.d.a().k(bK, axokVar2);
                } else {
                    ceenVar.d.a().m(bK, axokVar2, dpyvVar2);
                }
            }
        });
    }

    public final boolean n(@dzsi String str) {
        gga ggaVar = this.a;
        if (!ggaVar.aY) {
            return true;
        }
        ggaVar.g().aq();
        fd K = this.a.K();
        if (!(K instanceof ceec)) {
            return true;
        }
        ceec ceecVar = (ceec) K;
        if (str == null) {
            if (ceecVar.ao == null) {
                return false;
            }
        } else if (str.equals(ceecVar.ao)) {
            return false;
        }
        return true;
    }
}
