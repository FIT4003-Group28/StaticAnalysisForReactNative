package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: asjd  reason: default package */
/* loaded from: classes2.dex */
public final class asjd extends dees<amte> implements degu<GmmLocation> {
    public static final String a = "asjd";
    public final Context b;
    public final btrm c;
    public final bvjj d;
    public final ahjq e;
    public final vwv f;
    @dzsi
    public dehn<GmmLocation> g;
    @dzsi
    public srv h;
    boolean i;
    private final qcx l;
    private final dzsj<srv> m;
    private final vxa n;
    private final vxl o;

    public asjd(Context context, qcx qcxVar, btrm btrmVar, dzsj<srv> dzsjVar, bvjj bvjjVar, ahjq ahjqVar, vxa vxaVar, vwv vwvVar, vxl vxlVar) {
        this.b = context;
        this.l = qcxVar;
        this.c = btrmVar;
        this.m = dzsjVar;
        this.d = bvjjVar;
        this.e = ahjqVar;
        this.n = vxaVar;
        this.f = vwvVar;
        this.o = vxlVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        k(th);
    }

    @Override // defpackage.degu
    /* renamed from: c */
    public final synchronized void b(GmmLocation gmmLocation) {
        if (!this.i) {
            return;
        }
        bvmn bvmnVar = bvmo.a;
        srv a2 = this.m.a();
        this.h = a2;
        dwao d = this.n.d(this.l.y(), this.o.a(this.l.f(), dqvj.DRIVE), 3, vul.NAVIGATION_ONLY);
        amvh g = this.l.g();
        dbsk.s(g);
        dcdc<amvh> h = this.l.h();
        amvg amvgVar = new amvg(g);
        amvgVar.d = gmmLocation.B();
        amvh a3 = amvgVar.a();
        dccx F = dcdc.F();
        F.g(a3);
        F.i(h);
        dcdc f = F.f();
        duqc z = this.l.z();
        if (z == null) {
            z = duqc.f;
        }
        vum vumVar = new vum();
        vumVar.e = dhjx.f;
        vumVar.c(f);
        vumVar.a = d;
        vumVar.d = z;
        vumVar.f = gmmLocation.a();
        vumVar.g = bvsl.a(this.d);
        if (this.l.a().a()) {
            vumVar.o = this.l.a().b();
        }
        a2.k(vumVar.a(), false);
    }

    public final void d() {
        if (this.i) {
            this.c.a(this);
            this.h = null;
            this.g = null;
            this.i = false;
        }
    }

    @Override // defpackage.dees
    protected final synchronized void e() {
        dehn<GmmLocation> dehnVar = this.g;
        if (dehnVar != null) {
            dehnVar.cancel(true);
        }
        d();
    }
}
