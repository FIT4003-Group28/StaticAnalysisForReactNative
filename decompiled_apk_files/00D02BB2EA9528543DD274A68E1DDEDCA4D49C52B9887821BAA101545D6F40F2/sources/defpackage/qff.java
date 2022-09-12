package defpackage;

import android.app.Activity;
import android.text.TextWatcher;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: qff  reason: default package */
/* loaded from: classes7.dex */
public class qff implements izs {
    private static final qfe c = new qfe();
    public final Activity a;
    private final bxeq e;
    private final qey f;
    private final qfd g;
    @dzsi
    private jmm j;
    @dzsi
    private TextWatcher k;
    private float l = 1.0f;
    public CharSequence b = "";
    private final izp h = new ixg();
    private final izi i = new qfc(this);

    public qff(bxeq bxeqVar, qey qeyVar, Activity activity, qfd qfdVar, cqhu cqhuVar, cqhn cqhnVar) {
        this.e = bxeqVar;
        this.f = qeyVar;
        this.g = qfdVar;
        this.a = activity;
    }

    @Override // defpackage.izs
    public Boolean A() {
        return Boolean.valueOf(ae().c() != null);
    }

    @Override // defpackage.izs
    public Boolean B() {
        return false;
    }

    @Override // defpackage.izs
    public void C(boolean z) {
    }

    @Override // defpackage.izs
    public Integer D() {
        return Integer.valueOf(this.b.length());
    }

    @Override // defpackage.izs
    public String E() {
        return this.a.getResources().getString(R.string.DIRECTIONS_CHOOSE_END_POINT);
    }

    @Override // defpackage.izs
    public Boolean F() {
        return false;
    }

    @Override // defpackage.izs
    public Integer G() {
        return 33554435;
    }

    @Override // defpackage.izs
    public Integer H() {
        return Integer.valueOf((int) ImageMetadata.LENS_FILTER_DENSITY);
    }

    @Override // defpackage.izs
    public void I(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // defpackage.izs
    public Boolean L() {
        return true;
    }

    @Override // defpackage.izs
    public boolean M(boolean z) {
        return false;
    }

    @Override // defpackage.izs
    public izp N() {
        return this.h;
    }

    @Override // defpackage.izs
    public Boolean O() {
        return N().a();
    }

    @Override // defpackage.izs
    @dzsi
    public bryd P() {
        return null;
    }

    @Override // defpackage.izs
    public void Q(@dzsi jbv jbvVar) {
        throw null;
    }

    @Override // defpackage.izs
    @dzsi
    public jbv R() {
        return null;
    }

    @Override // defpackage.izs
    public boolean S() {
        return false;
    }

    @Override // defpackage.izs
    public izg U() {
        return null;
    }

    @Override // defpackage.izs
    public cjtd V() {
        return izq.a();
    }

    @Override // defpackage.izs
    public Boolean W() {
        return izq.c();
    }

    @Override // defpackage.izs
    public String X() {
        return "";
    }

    @Override // defpackage.izs
    public cjtd Y() {
        return cjtd.b;
    }

    @Override // defpackage.izs
    public izd Z() {
        return null;
    }

    @Override // defpackage.izs
    /* renamed from: a */
    public String d() {
        return this.b.toString();
    }

    @Override // defpackage.izs
    public Boolean aa() {
        return izq.b();
    }

    @Override // defpackage.izs
    public iyz ab() {
        return null;
    }

    @Override // defpackage.izs
    public Integer ac() {
        return null;
    }

    @Override // defpackage.izs
    public void ad(int i, float f) {
    }

    @Override // defpackage.izs
    public izi ae() {
        return this.i;
    }

    @Override // defpackage.izs
    public izh af() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(CharSequence charSequence) {
        dhjx bK;
        dbsk.a(charSequence != null);
        String e = dbsj.e(charSequence.toString());
        String e2 = dbsj.e(d());
        qey qeyVar = this.f;
        String e3 = dbsj.e(e);
        if (!dbsj.e(qeyVar.e.d()).equals(e3)) {
            bxkz d = bxkz.d(e3, e3.codePointCount(0, e3.length()), qeyVar.a.e());
            bxky bxkyVar = (bxky) d;
            qeyVar.e.e(bxkyVar.a);
            qeyVar.e.e = true;
            if (!dbsj.d(bxkyVar.a) || qeyVar.e.t()) {
                GmmLocation a = qeyVar.d.a().a();
                if (a == null) {
                    bK = null;
                } else {
                    dhjw bZ = dhjx.f.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dhjx dhjxVar = (dhjx) bZ.b;
                    dhjxVar.a |= 8;
                    dhjxVar.e = 30.0f;
                    dhjy bZ2 = dhjz.e.bZ();
                    double latitude = a.getLatitude();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dhjz dhjzVar = (dhjz) bZ2.b;
                    dhjzVar.a |= 2;
                    dhjzVar.c = latitude;
                    double longitude = a.getLongitude();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dhjz dhjzVar2 = (dhjz) bZ2.b;
                    dhjzVar2.a |= 1;
                    dhjzVar2.b = longitude;
                    double altitude = a.getAltitude();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dhjz dhjzVar3 = (dhjz) bZ2.b;
                    dhjzVar3.a |= 4;
                    dhjzVar3.d = altitude;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dhjx dhjxVar2 = (dhjx) bZ.b;
                    dhjz bK2 = bZ2.bK();
                    bK2.getClass();
                    dhjxVar2.b = bK2;
                    dhjxVar2.a |= 1;
                    dhka bZ3 = dhkb.e.bZ();
                    float bearing = a.getBearing();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dhkb dhkbVar = (dhkb) bZ3.b;
                    int i = dhkbVar.a | 1;
                    dhkbVar.a = i;
                    dhkbVar.b = bearing;
                    int i2 = i | 2;
                    dhkbVar.a = i2;
                    dhkbVar.c = 0.0f;
                    dhkbVar.a = i2 | 4;
                    dhkbVar.d = 0.0f;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dhjx dhjxVar3 = (dhjx) bZ.b;
                    dhkb bK3 = bZ3.bK();
                    bK3.getClass();
                    dhjxVar3.c = bK3;
                    dhjxVar3.a |= 2;
                    dhkc bZ4 = dhkd.d.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dhkd dhkdVar = (dhkd) bZ4.b;
                    int i3 = dhkdVar.a | 1;
                    dhkdVar.a = i3;
                    dhkdVar.b = 1000;
                    dhkdVar.a = i3 | 2;
                    dhkdVar.c = 1000;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dhjx dhjxVar4 = (dhjx) bZ.b;
                    dhkd bK4 = bZ4.bK();
                    bK4.getClass();
                    dhjxVar4.d = bK4;
                    dhjxVar4.a |= 4;
                    bK = bZ.bK();
                }
                dhjx dhjxVar5 = bK;
                if (dhjxVar5 != null) {
                    bxkx bxkxVar = new bxkx();
                    bxkxVar.a(d);
                    bxer bxerVar = qeyVar.c;
                    bxla b = qeyVar.e.b();
                    akqs j = qeyVar.e.j();
                    dovx l = qeyVar.e.l();
                    boolean t = qeyVar.e.t();
                    dwjm dwjmVar = dwjm.DEFAULT_SEARCH;
                    bxko bxkoVar = qeyVar.e;
                    boolean z = bxkoVar.i;
                    boolean z2 = bxkoVar.b().a() == 27;
                    bxko bxkoVar2 = qeyVar.e;
                    ((bxef) bxerVar).e(b, d, dhjxVar5, j, l, false, t, bxkxVar, dwjmVar, z, z2, false);
                }
            } else {
                btrm btrmVar = qeyVar.b;
                bxla b2 = qeyVar.e.b();
                dcdc e4 = dcdc.e();
                dcdc.e();
                btrmVar.b(new bxev(b2, e4));
            }
        }
        this.b = e;
        if (e.isEmpty() || e2.isEmpty()) {
            cqjz<?> b3 = cqhu.b(this.a.findViewById(16908290), hqv.c);
            if (b3 != null) {
                b3.j();
            }
            cqkx.p(af());
        }
    }

    @Override // defpackage.izs
    public cqkl c() {
        this.g.e();
        return cqkl.a;
    }

    @Override // defpackage.izs
    public TextWatcher e() {
        if (this.k == null) {
            this.k = new qfb(this);
        }
        return this.k;
    }

    public void f(CharSequence charSequence) {
        this.e.i(charSequence.toString(), dnqh.p);
    }

    @Override // defpackage.izs
    public jmm g() {
        if (this.j == null) {
            this.j = new jmm(new jml(this) { // from class: qfa
                private final qff a;

                {
                    this.a = this;
                }

                @Override // defpackage.jml
                public final void a(CharSequence charSequence) {
                    this.a.f(charSequence);
                }
            });
        }
        return this.j;
    }

    @Override // defpackage.izs
    public cqkl k() {
        cqkx.p(this);
        this.b = "";
        cqkx.p(this);
        b(this.b.toString());
        return cqkl.a;
    }

    @Override // defpackage.izs
    public Boolean l() {
        return Boolean.valueOf(!dbsj.d(d()));
    }

    @Override // defpackage.izs
    @dzsi
    public cjtd m() {
        return null;
    }

    @Override // defpackage.izs
    public Boolean n() {
        return false;
    }

    @Override // defpackage.izs
    public Float p() {
        return Float.valueOf(n().booleanValue() ? 0.0f : 1.0f);
    }

    @Override // defpackage.izs
    public cqtv q() {
        return cqrp.d(Math.ceil((this.l * 5.0f) + 1.0f));
    }

    @Override // defpackage.izs
    public void r(float f) {
        if (this.l == f) {
            return;
        }
        this.l = dece.c(f, 0.0f, 1.0f);
        cqkx.p(this);
    }

    @Override // defpackage.izs
    public Boolean s() {
        return false;
    }

    @Override // defpackage.izs
    public cqss u() {
        return iuy.j();
    }

    @Override // defpackage.izs
    public Boolean v() {
        return false;
    }

    @Override // defpackage.izs
    public Boolean w() {
        return true;
    }

    @Override // defpackage.izs
    public Boolean x() {
        return true;
    }

    @Override // defpackage.izs
    public Boolean y() {
        return false;
    }

    @Override // defpackage.izs
    public Boolean z() {
        return false;
    }
}
