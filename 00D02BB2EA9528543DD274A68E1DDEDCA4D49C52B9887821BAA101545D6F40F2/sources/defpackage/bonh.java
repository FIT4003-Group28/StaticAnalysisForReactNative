package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bonh  reason: default package */
/* loaded from: classes3.dex */
public class bonh implements bopw {
    private static final dcep<dory> g = dcep.E(dory.AUTO_FILLED, dory.REVERSE_GEOCODED, dory.SUGGEST_SELECTION, dory.PRE_FILLED);
    public final ges a;
    public final bokg b;
    public final bnxs c;
    @dzsi
    public final cpmy d;
    @dzsi
    public final cpnn e;
    private final String h;
    @dzsi
    private final bnyg i;
    @dzsi
    private final ahjq j;
    @dzsi
    private dhjz l;
    private boolean n;
    private final boolean o;
    private final jcb p;
    private final bnxw q;
    @dzsi
    private jca r;
    @dzsi
    private final bonv s;
    private boolean k = false;
    private boolean m = false;

    public bonh(ges gesVar, String str, @dzsi bnyg bnygVar, bokg bokgVar, @dzsi ahjq ahjqVar, bnxs bnxsVar, bnxw bnxwVar, @dzsi cpmy cpmyVar, @dzsi cpnn cpnnVar, @dzsi bonv bonvVar, boolean z, boolean z2, jmx jmxVar) {
        this.n = false;
        this.a = gesVar;
        this.b = bokgVar;
        this.h = str;
        gesVar.Rp(R.string.AAP_ADDRESS_HINT);
        this.i = bnygVar;
        this.j = ahjqVar;
        this.c = bnxsVar;
        this.q = bnxwVar;
        this.d = cpmyVar;
        this.e = cpnnVar;
        this.s = bonvVar;
        this.o = z;
        this.n = z2;
        GmmLocation a = ahjqVar != null ? ahjqVar.a() : null;
        if (a != null && a.getAccuracy() > 0.0f && a.getAccuracy() <= 20.0f) {
            dhjy bZ = dhjz.e.bZ();
            double latitude = a.getLatitude();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ.b;
            dhjzVar.a |= 2;
            dhjzVar.c = latitude;
            double longitude = a.getLongitude();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar2 = (dhjz) bZ.b;
            dhjzVar2.a |= 1;
            dhjzVar2.b = longitude;
            this.l = bZ.bK();
        } else {
            this.l = null;
        }
        this.p = new jcb();
    }

    private final cpms M() {
        cpmr d = cpms.d();
        d.b(true != a().booleanValue() ? 0 : 48);
        d.c(bvom.a(Locale.getDefault()));
        return d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(dory doryVar, String str, String str2, boolean z) {
        this.b.k = doryVar == null ? dory.UNSPECIFIED : doryVar;
        bokg bokgVar = this.b;
        bokgVar.m = str;
        bokgVar.l = str2;
        if (doryVar != dory.FEEDBACK_SERVICE) {
            this.b.f(null);
        }
        if (z) {
            this.b.a = true;
        }
    }

    public void A(boolean z) {
        this.m = false;
    }

    public dory B() {
        return this.b.k;
    }

    public boolean C() {
        return !g.contains(B());
    }

    @Override // defpackage.bopw
    @dzsi
    public jca D() {
        if (this.r == null) {
            cpml e = cpmm.e();
            cpmn cpmnVar = (cpmn) e;
            cpmnVar.a = new bone(this);
            cpmnVar.b = new bonf(this);
            cpmnVar.d = this.e;
            cpmnVar.c = new bong(this);
            this.r = new jca(e.a());
        }
        return this.r;
    }

    @Override // defpackage.bopw
    @dzsi
    /* renamed from: E */
    public bnxs K() {
        return this.c;
    }

    @Override // defpackage.bopw
    @dzsi
    /* renamed from: F */
    public bnxw J() {
        return this.q;
    }

    @Override // defpackage.bopw
    public jcb G() {
        return new jcb(M());
    }

    public Boolean H() {
        bokg bokgVar = this.b;
        return Boolean.valueOf(!bokgVar.e.contentEquals(bokgVar.c()));
    }

    public void I(dhjx dhjxVar, @dzsi akqs akqsVar) {
        bnxs bnxsVar = this.c;
        bnxsVar.b = dhjxVar;
        bnxsVar.c = akqsVar;
    }

    @Override // defpackage.bopw
    public Boolean a() {
        boolean z = false;
        if (this.o && !t() && this.l != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bopw
    public Boolean b() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.bopw
    public cqkl c() {
        if (!this.a.aD || this.k || !a().booleanValue()) {
            return cqkl.a;
        }
        ahjq ahjqVar = this.j;
        GmmLocation a = ahjqVar != null ? ahjqVar.a() : null;
        if (a != null && a.getAccuracy() > 0.0f && a.getAccuracy() <= 20.0f) {
            dhjy bZ = dhjz.e.bZ();
            double latitude = a.getLatitude();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ.b;
            dhjzVar.a |= 2;
            dhjzVar.c = latitude;
            double longitude = a.getLongitude();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar2 = (dhjz) bZ.b;
            dhjzVar2.a |= 1;
            dhjzVar2.b = longitude;
            this.l = bZ.bK();
        }
        dhjz dhjzVar3 = this.l;
        if (dhjzVar3 == null) {
            return cqkl.a;
        }
        this.m = true;
        y(dhjzVar3, false);
        return cqkl.a;
    }

    @Override // defpackage.bopw
    public Boolean d() {
        return Boolean.valueOf(this.k);
    }

    public void e(boolean z) {
        this.k = false;
    }

    @Override // defpackage.boqm
    public cqtd f() {
        return cqrt.f(2131231717);
    }

    @Override // defpackage.boqm
    public String g() {
        return this.h;
    }

    @Override // defpackage.boqm
    public String h() {
        throw null;
    }

    @Override // defpackage.boqm
    @dzsi
    public String i() {
        return this.b.h.booleanValue() ? m() : k();
    }

    @Override // defpackage.boqm
    public Boolean j() {
        throw null;
    }

    @Override // defpackage.boqm
    @dzsi
    public String k() {
        return this.b.e;
    }

    @Override // defpackage.boqm
    public Boolean l() {
        return Boolean.valueOf(!dbsj.d(m()));
    }

    @Override // defpackage.boqm
    @dzsi
    public String m() {
        return this.b.f;
    }

    @Override // defpackage.boqm
    public Boolean n() {
        return this.b.h;
    }

    @Override // defpackage.boqm
    public cjtd o() {
        throw null;
    }

    @Override // defpackage.boqm
    public Boolean p() {
        return this.b.i;
    }

    @Override // defpackage.boqm
    @dzsi
    public String q() {
        return this.b.j;
    }

    public void r(boolean z) {
        this.b.i = true;
    }

    public void s(String str) {
        this.b.j = str;
    }

    public boolean t() {
        return this.b.a;
    }

    public void u(String str, dory doryVar, String str2, String str3, boolean z) {
        N(doryVar, str2, str3, z);
        v(str);
    }

    public final void v(String str) {
        String i = i();
        if (i == null || !i.contentEquals(str)) {
            bokg bokgVar = this.b;
            bokgVar.j = "";
            bokgVar.i = false;
            bokg bokgVar2 = this.b;
            bokgVar2.f = str;
            boolean contentEquals = bokgVar2.f.contentEquals(bokgVar2.e);
            boolean z = true;
            this.b.h = Boolean.valueOf(!contentEquals);
            this.p.a = M();
            bonv bonvVar = this.s;
            if (bonvVar != null && !bonvVar.h) {
                if (!l().booleanValue() || !H().booleanValue()) {
                    z = false;
                }
                bonvVar.i = z;
            }
            if (this.k) {
                this.k = false;
            }
            cqkx.p(this);
        }
    }

    public void w(String str) {
        this.b.e = str;
    }

    @dzsi
    public dhjz x() {
        return this.l;
    }

    public void y(@dzsi dhjz dhjzVar, boolean z) {
        if (this.i == null) {
            return;
        }
        this.k = true;
        cqkx.p(this);
        if (dhjzVar == null) {
            return;
        }
        bnyg bnygVar = this.i;
        dwhe bZ = dwhf.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwhf dwhfVar = (dwhf) bZ.b;
        dhjzVar.getClass();
        dwhfVar.b = dhjzVar;
        dwhfVar.a |= 1;
        dwhf dwhfVar2 = (dwhf) bZ.b;
        dwhfVar2.e = 1;
        dwhfVar2.a |= 8;
        dhjx Z = bnygVar.b.Z();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwhf dwhfVar3 = (dwhf) bZ.b;
        Z.getClass();
        dwhfVar3.c = Z;
        dwhfVar3.a |= 2;
        bnygVar.c.a(bZ.bK(), new bnye(bnygVar, z));
    }

    public boolean z() {
        return this.m;
    }
}
