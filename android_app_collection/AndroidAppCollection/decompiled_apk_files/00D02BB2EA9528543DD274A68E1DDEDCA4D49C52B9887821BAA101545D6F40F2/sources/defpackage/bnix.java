package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bnix  reason: default package */
/* loaded from: classes3.dex */
public class bnix implements bnii {
    private final Context a;
    private final bniu b;
    private final jkf c;
    @dzsi
    private cjtd d;
    private String e;
    private cqtd f;
    private int g;
    private boolean j;
    private dbsg<bmoe> k;
    private final akfa m;
    private final bvjj n;
    private final ckcw o;
    private jjn h = jjn.COLLAPSED;
    private boolean i = false;
    @dzsi
    private bwrs<ilo> l = null;

    public bnix(Application application, jkf jkfVar, akfa akfaVar, bvjj bvjjVar, ckcw ckcwVar, bniu bniuVar, @dzsi cjtd cjtdVar, boolean z) {
        this.j = false;
        this.a = application;
        this.b = bniuVar;
        this.c = jkfVar;
        this.d = cjtdVar;
        M(bniuVar.a(), bniuVar.l());
        this.k = dbpy.a;
        this.m = akfaVar;
        this.n = bvjjVar;
        this.o = ckcwVar;
        this.j = z;
    }

    private final boolean N() {
        return this.k.b().i() == bmod.AT_THE_PLACE_HIGH_CONFIDENCE;
    }

    private final boolean O() {
        return this.k.b().i() == bmod.CHECKED_IN_AT_THE_PLACE;
    }

    private final boolean P() {
        dwvb dwvbVar;
        btlu j = this.m.j();
        if (btlu.i(j).equals(btlt.GOOGLE) && (dwvbVar = (dwvb) this.n.N(bvjk.ga, j, (dssr) dwvb.e.cu(7), dwvb.e)) != null) {
            dvnk dvnkVar = dwvbVar.d;
            if (dvnkVar == null) {
                dvnkVar = dvnk.b;
            }
            return dvnkVar.a && this.b.o() && this.k.a();
        }
        return false;
    }

    @Override // defpackage.izl
    public cqss A() {
        if (P()) {
            if (O()) {
                return irg.b();
            }
            if (N()) {
                return ibm.x();
            }
        }
        return irg.a();
    }

    @Override // defpackage.izl
    public cqss B() {
        return f().booleanValue() ? irg.l() : irg.h();
    }

    @Override // defpackage.izl
    public cqss C() {
        return f().booleanValue() ? irg.a() : irg.d();
    }

    @Override // defpackage.izl
    public cqss D() {
        return irg.g();
    }

    @Override // defpackage.izl
    public whc E() {
        return null;
    }

    @Override // defpackage.izl
    public izk F() {
        return new izj();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r2.e != false) goto L13;
     */
    @Override // defpackage.bnii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean G(defpackage.ckgz r6) {
        /*
            r5 = this;
            bwrs<ilo> r0 = r5.l
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto La
            return r2
        La:
            java.io.Serializable r0 = r0.c()
            ilo r0 = (defpackage.ilo) r0
            if (r0 != 0) goto L13
            return r2
        L13:
            ckcw r2 = r5.o
            java.lang.Object r6 = r2.a(r6)
            ckco r6 = (defpackage.ckco) r6
            dnwf r2 = r0.bX()
            dnem r2 = r2.p
            if (r2 != 0) goto L25
            dnem r2 = defpackage.dnem.h
        L25:
            int r2 = r2.a
            r3 = 2
            r2 = r2 & r3
            r4 = 1
            if (r2 == 0) goto L2e
        L2c:
            r1 = 1
            goto L3d
        L2e:
            dnwf r2 = r0.bX()
            dnem r2 = r2.p
            if (r2 != 0) goto L38
            dnem r2 = defpackage.dnem.h
        L38:
            boolean r2 = r2.e
            if (r2 == 0) goto L3d
            goto L2c
        L3d:
            boolean r2 = r5.P()
            dnwf r0 = r0.bX()
            dnem r0 = r0.p
            if (r0 != 0) goto L4b
            dnem r0 = defpackage.dnem.h
        L4b:
            boolean r0 = r0.f
            if (r2 == 0) goto L65
            boolean r2 = r5.O()
            if (r2 == 0) goto L58
            r3 = 9
            goto L73
        L58:
            if (r1 == 0) goto L5f
            if (r4 == r0) goto L5d
            goto L73
        L5d:
            r3 = 1
            goto L73
        L5f:
            if (r4 == r0) goto L63
            r3 = 4
            goto L73
        L63:
            r3 = 3
            goto L73
        L65:
            if (r1 == 0) goto L6d
            if (r4 == r0) goto L6b
            r3 = 6
            goto L73
        L6b:
            r3 = 5
            goto L73
        L6d:
            if (r4 == r0) goto L72
            r3 = 8
            goto L73
        L72:
            r3 = 7
        L73:
            int r0 = defpackage.ckgl.a(r3)
            r6.a(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnix.G(ckgz):java.lang.Boolean");
    }

    public void H(@dzsi bwrs<ilo> bwrsVar) {
        this.l = bwrsVar;
        cqkx.p(this);
    }

    public void I(boolean z) {
        if (this.i != z) {
            this.i = z;
            cqkx.p(this);
        }
    }

    public void J(bmoe bmoeVar) {
        this.k = dbsg.i(bmoeVar);
    }

    public void K(jjn jjnVar) {
        this.h = jjnVar;
    }

    public void L(@dzsi cjtd cjtdVar) {
        this.d = cjtdVar;
    }

    public void M(String str, cqtd cqtdVar) {
        if (cqtdVar.equals(cqrt.f(2131231728))) {
            this.e = str;
            this.f = cqtdVar;
            this.g = 0;
        } else if (cqtdVar.equals(cqrt.f(2131231581))) {
            this.e = this.a.getString(R.string.ACCESSIBILITY_ADD_STOP);
            this.f = cqrt.i(cqtdVar, irg.a());
            this.g = R.id.placepage_directions_button;
        } else if (cqtdVar.equals(cqrt.f(R.drawable.ic_add_parking))) {
            this.e = this.a.getString(R.string.ADD_PARKING);
            this.f = cqrt.i(cqtdVar, irg.a());
            this.g = R.id.placepage_directions_button;
        } else {
            this.e = this.a.getString(R.string.NAVIGATION);
            this.f = cqrt.g(2131231608, irg.a());
            this.g = R.id.placepage_directions_button;
        }
    }

    @Override // defpackage.izl
    public Boolean a() {
        boolean z = true;
        if (y().booleanValue()) {
            if (this.i || this.b.o()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (this.a.getResources().getConfiguration().orientation == 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izl
    public Boolean b() {
        throw new UnsupportedOperationException("This is not used in Place, yet.");
    }

    @Override // defpackage.izl
    public Boolean c() {
        return false;
    }

    @Override // defpackage.izl
    public Integer d() {
        ilo c;
        int i = 0;
        Boolean bool = false;
        if (!this.j) {
            bwrs<ilo> bwrsVar = this.l;
            if (bwrsVar == null || (c = bwrsVar.c()) == null) {
                bool = true;
            } else if (!P() || c.f) {
                bool = Boolean.valueOf(!c.bd());
            }
        }
        if (true != bool.booleanValue()) {
            i = 4;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.izl
    public Boolean e() {
        return false;
    }

    @Override // defpackage.izl
    public Boolean f() {
        return false;
    }

    @Override // defpackage.izl
    public View.OnLayoutChangeListener g() {
        return null;
    }

    @Override // defpackage.izl
    public cqkl h(cjqm cjqmVar) {
        if (P()) {
            if (O()) {
                return cqkl.a;
            }
            if (N()) {
                this.k.b().j(ckgn.I_AM_HERE_PLACEHSEET_FOOTER, ddda.gj);
                this.c.setExpandingState(jjn.EXPANDED, false);
                this.c.setExpandingState(jjn.FULLY_EXPANDED, false);
                return cqkl.a;
            }
        }
        return this.b.d(cjqmVar);
    }

    @Override // defpackage.izl
    public cqkl i(cjqm cjqmVar) {
        return (!P() || (!N() && !O())) ? this.b.j(cjqmVar) : cqkl.a;
    }

    @Override // defpackage.izl
    public Boolean j() {
        if (!P() || (!O() && !N())) {
            return this.b.k();
        }
        return false;
    }

    @Override // defpackage.izl
    public cqkl k() {
        this.c.v();
        return cqkl.a;
    }

    @Override // defpackage.izl
    public cqkl l() {
        return cqkl.a;
    }

    @Override // defpackage.izl
    @dzsi
    public cjtd m() {
        return this.d;
    }

    @Override // defpackage.izl
    @dzsi
    public cjtd n() {
        ddho ddhoVar = y().booleanValue() ? dtxy.kJ : dtxy.kI;
        ilo iloVar = (ilo) bwrs.b(this.l);
        if (iloVar != null) {
            cjta c = cjtd.c(iloVar.bZ());
            c.d = ddhoVar;
            return c.a();
        }
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.izl
    public cjtd o() {
        return null;
    }

    @Override // defpackage.izl
    public String p() {
        if (P()) {
            if (O()) {
                return this.a.getString(R.string.MAPS_ACTIVITY_YOU_ARE_HERE);
            }
            if (N()) {
                return this.a.getString(R.string.I_AM_HERE_BUTTON);
            }
        }
        return this.e;
    }

    @Override // defpackage.izl
    @dzsi
    public String q() {
        return p();
    }

    @Override // defpackage.izl
    public String r() {
        return this.a.getString(R.string.PLACE_MORE_INFO);
    }

    @Override // defpackage.izl
    public String s() {
        return this.a.getString(R.string.BOTTOM_SHEET_SHOW_MAP);
    }

    @Override // defpackage.izl
    public String t() {
        return null;
    }

    @Override // defpackage.izl
    public CharSequence u() {
        return null;
    }

    @Override // defpackage.izl
    public cqtd v() {
        if (P()) {
            if (O()) {
                return cqrt.j(cqrt.f(2131232564), irg.u());
            }
            if (N()) {
                return cqrt.h(2131231586, ibm.x());
            }
        }
        return this.f;
    }

    @Override // defpackage.izl
    public cqtd w() {
        if (y().booleanValue()) {
            return cqrt.g(2131232773, ibm.x());
        }
        return cqrt.g(2131232725, ibm.p());
    }

    @Override // defpackage.izl
    public cqtd x() {
        return null;
    }

    @Override // defpackage.izl
    public Boolean y() {
        return Boolean.valueOf(this.h.b());
    }

    @Override // defpackage.izl
    public Integer z() {
        return Integer.valueOf(this.g);
    }
}
