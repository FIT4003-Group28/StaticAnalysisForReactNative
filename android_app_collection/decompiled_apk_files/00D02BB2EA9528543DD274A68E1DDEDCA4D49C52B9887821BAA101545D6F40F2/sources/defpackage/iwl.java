package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: iwl  reason: default package */
/* loaded from: classes.dex */
public class iwl implements izi {
    private final gga b;
    private final btrm c;
    private cjtd a = cjtd.a(dtxv.H);
    private boolean d = true;
    @dzsi
    private iwk e = null;

    public iwl(gga ggaVar, eeu eeuVar, dzsj<afwt> dzsjVar, dzsj<axxi> dzsjVar2, dxio<apyz> dxioVar, btrm btrmVar, dxio<bvkx> dxioVar2, dxio<axwq> dxioVar3, acyp acypVar, @dzsi bzmm bzmmVar, @dzsi axxk axxkVar) {
        this.b = ggaVar;
        this.c = btrmVar;
    }

    public void a() {
        if (this.e == null) {
            iwk iwkVar = new iwk(this);
            this.e = iwkVar;
            btrm btrmVar = this.c;
            dbsk.s(iwkVar);
            dceq a = dcet.a();
            a.b(gdu.class, new iwm(gdu.class, iwkVar, bvrj.UI_THREAD));
            btrmVar.g(iwkVar, a.a());
        }
    }

    public void b() {
        iwk iwkVar = this.e;
        if (iwkVar != null) {
            this.c.a(iwkVar);
            this.e = null;
        }
    }

    @Override // defpackage.izi
    @dzsi
    public cqtd c() {
        if (!this.d) {
            return null;
        }
        return cqrt.f(2131231588);
    }

    @Override // defpackage.izi
    public Boolean d() {
        return true;
    }

    @Override // defpackage.izi
    public cqkl e() {
        if (this.b.g().J()) {
            return cqkl.a;
        }
        this.b.s();
        return cqkl.a;
    }

    @Override // defpackage.izi
    public CharSequence f() {
        return this.b.getResources().getString(R.string.BACK_BUTTON);
    }

    public void g(cjtd cjtdVar) {
        this.a = cjtdVar;
    }

    @Override // defpackage.izi
    public cjtd h() {
        if (i().booleanValue()) {
            cjta c = cjtd.c(this.a);
            c.g(cjrx.a(ddcu.y.a));
            return c.a();
        }
        return this.a;
    }

    @Override // defpackage.izi
    public Boolean i() {
        return false;
    }

    public void j(boolean z) {
        if (this.d != z) {
            this.d = z;
            cqkx.p(this);
        }
    }
}
