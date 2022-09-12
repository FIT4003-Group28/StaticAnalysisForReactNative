package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chnl  reason: default package */
/* loaded from: classes4.dex */
public final class chnl extends itb implements chnm {
    public final dxio<akfc> a;
    public final cavs b;
    private final btvo c;
    private final chnu d;
    private final dxio<akfa> e;
    private final chsh f;
    private final cese g;
    private final chsf h;

    public chnl(chnu chnuVar, btvo btvoVar, dxio<akfa> dxioVar, dxio<akfc> dxioVar2, cese ceseVar, chsh chshVar, cavs cavsVar, chsf chsfVar) {
        this.d = chnuVar;
        this.c = btvoVar;
        this.e = dxioVar;
        this.a = dxioVar2;
        this.g = ceseVar;
        this.f = chshVar;
        this.b = cavsVar;
        this.h = chsfVar;
    }

    @Override // defpackage.chnm
    public final boolean B() {
        dhpt dhptVar = this.c.getContributionsPageParameters().h;
        if (dhptVar == null) {
            dhptVar = dhpt.w;
        }
        return dhptVar.m;
    }

    @Override // defpackage.chnm
    public final void C(@dzsi drry drryVar, @dzsi dpyv dpyvVar) {
        chtq q;
        Integer num;
        dcdc<drrv> r;
        btlu j = this.e.a().j();
        if (j.l()) {
            if (drryVar == null || drryVar.a.size() == 0) {
                q = chtq.q(drrx.UNKNOWN_MODE);
            } else {
                q = chtq.q(drry.b.a(Integer.valueOf(drryVar.a.f(0))));
            }
            chtq chtqVar = q;
            dqjy j2 = chtqVar.j();
            if (this.h.d(chtqVar)) {
                dhpt dhptVar = this.c.getContributionsPageParameters().h;
                if (dhptVar == null) {
                    dhptVar = dhpt.w;
                }
                num = Integer.valueOf(!dhptVar.p ? 1 : 0);
            } else {
                num = null;
            }
            if (j2 != null) {
                if (drryVar == null) {
                    r = dcdc.f(drrv.c);
                } else {
                    r = dcdc.r(drryVar.c);
                }
                dcdc<drrv> dcdcVar = r;
                chsh chshVar = this.f;
                dbsg<dpyv> j3 = dbsg.j(dpyvVar);
                chshVar.d.Pz(chsq.f(j, chtqVar, null, j3, dcdcVar), chshVar.a(j, chtqVar, null, j3, dcdcVar, num));
            } else if (!chtqVar.k()) {
            } else {
                chsh chshVar2 = this.f;
                chshVar2.e.Pz(chsa.d(j, null, null), chshVar2.b(null, null));
            }
        }
    }

    @Override // defpackage.chnm
    public final void e(final int i) {
        Object obj;
        btlu j = this.e.a().j();
        dbsg h = dbsg.j(this.d.a).h(new dbrn(i) { // from class: chnh
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj2) {
                int i2 = this.a;
                chuc chucVar = (chuc) obj2;
                dsqp dsqpVar = (dsqp) chucVar.cu(5);
                dsqpVar.bC(chucVar);
                chub chubVar = (chub) dsqpVar;
                int max = Math.max(i2, chucVar.b);
                if (chubVar.c) {
                    chubVar.bF();
                    chubVar.c = false;
                }
                chuc chucVar2 = (chuc) chubVar.b;
                chucVar2.a |= 1;
                chucVar2.b = max;
                return chubVar.bK();
            }
        });
        if (j.l()) {
            obj = dbsg.j(j.j()).h(new dbrn(i) { // from class: chni
                private final int a;

                {
                    this.a = i;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj2) {
                    int i2 = this.a;
                    String str = (String) obj2;
                    chub bZ = chuc.f.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    chuc chucVar = (chuc) bZ.b;
                    chucVar.a |= 1;
                    chucVar.b = i2;
                    dpoj a = chnr.a();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    chuc chucVar2 = (chuc) bZ.b;
                    a.getClass();
                    chucVar2.c = a;
                    int i3 = chucVar2.a | 2;
                    chucVar2.a = i3;
                    str.getClass();
                    chucVar2.a = i3 | 4;
                    chucVar2.d = str;
                    return bZ.bK();
                }
            });
        } else {
            obj = dbpy.a;
        }
        dbsg d = h.d(obj);
        if (d.a()) {
            this.d.a = (chuc) d.b();
        }
    }

    @Override // defpackage.chnm
    public final void f() {
        m(null, null, false, null, dwyd.UNKNOWN_ENTRY_POINT);
    }

    @Override // defpackage.chnm
    public final void i(drry drryVar) {
        m(drryVar, null, false, null, dwyd.UNKNOWN_ENTRY_POINT);
    }

    @Override // defpackage.chnm
    public final void j(@dzsi drry drryVar, @dzsi byte[] bArr, @dzsi dpyv dpyvVar, @dzsi dwyd dwydVar) {
        m(drryVar, bArr, false, dpyvVar, dwydVar);
    }

    @Override // defpackage.chnm
    public final void k() {
        m(null, null, true, null, dwyd.UNKNOWN_ENTRY_POINT);
    }

    @Override // defpackage.chnm
    public final void l(String str) {
        if (str.isEmpty()) {
            return;
        }
        this.a.a().f(str, new chnj(this, str));
    }

    public final void m(@dzsi drry drryVar, @dzsi byte[] bArr, boolean z, @dzsi dpyv dpyvVar, @dzsi dwyd dwydVar) {
        aker i = akeu.i(new chnk(drryVar, bArr, z, dpyvVar, dwydVar, s()));
        aken a = i.a();
        a.d(R.string.CONTRIBUTE_SIDE_MENU_BUTTON);
        a.c(R.string.CREATOR_ZONE_INCOGNITO_MESSAGE);
        this.a.a().b(i.b());
    }

    @Override // defpackage.chnm
    public final boolean n() {
        return this.c.getContributionsPageParameters().f;
    }

    @Override // defpackage.chnm
    public final boolean o() {
        return n() && this.c.getContributionsPageParameters().g;
    }

    @Override // defpackage.chnm
    public final boolean p() {
        return o();
    }

    @Override // defpackage.chnm
    public final boolean q() {
        dhpt dhptVar = this.c.getContributionsPageParameters().h;
        if (dhptVar == null) {
            dhptVar = dhpt.w;
        }
        return dhptVar.i;
    }

    @Override // defpackage.chnm
    public final boolean r() {
        dhpt dhptVar = this.c.getContributionsPageParameters().h;
        if (dhptVar == null) {
            dhptVar = dhpt.w;
        }
        return dhptVar.j;
    }

    @Override // defpackage.chnm
    public final boolean s() {
        dhpt dhptVar = this.c.getContributionsPageParameters().h;
        if (dhptVar == null) {
            dhptVar = dhpt.w;
        }
        return dhptVar.k;
    }

    @Override // defpackage.chnm
    public final boolean t() {
        dhpt dhptVar = this.c.getContributionsPageParameters().h;
        if (dhptVar == null) {
            dhptVar = dhpt.w;
        }
        return dhptVar.l && this.g.a();
    }
}
