package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: betl  reason: default package */
/* loaded from: classes3.dex */
public class betl implements betc {
    private final gga a;
    private final beqf b;
    private final btvo c;
    private final ccln d;
    private final cjtd e;
    @dzsi
    private final jic f;
    private final bwrs<ilo> g;
    private final boolean h;
    @dzsi
    private final betb i;

    public betl(gga ggaVar, beqf beqfVar, btvo btvoVar, betk betkVar, ccln cclnVar, bwrs<ilo> bwrsVar, boolean z, @dzsi beqn beqnVar, int i) {
        dgev dgevVar;
        dgev dgevVar2;
        this.g = bwrsVar;
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        dbsk.s(iloVar);
        this.a = ggaVar;
        this.b = beqfVar;
        this.c = btvoVar;
        betj betjVar = null;
        this.f = cclnVar.i.size() > 0 ? new jic(cclnVar.i.get(0).h, jfv.b(cclnVar.i.get(0)), 0) : null;
        cjta c = cjtd.c(iloVar.bZ());
        c.d = z ? dtxl.ab : dtxy.hU;
        if (cclnVar.b == 10) {
            dgevVar = (dgev) cclnVar.c;
        } else {
            dgevVar = dgev.g;
        }
        if ((dgevVar.a & 2048) != 0) {
            if (cclnVar.b == 10) {
                dgevVar2 = (dgev) cclnVar.c;
            } else {
                dgevVar2 = dgev.g;
            }
            c.g(dgevVar2.f);
        }
        if (k(btvoVar, z)) {
            c.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        this.e = c.a();
        this.d = cclnVar;
        this.h = z;
        if (l(btvoVar, cclnVar)) {
            gga a = betkVar.a.a();
            betk.a(a, 1);
            cqhn a2 = betkVar.b.a();
            betk.a(a2, 2);
            bvrb a3 = betkVar.c.a();
            betk.a(a3, 3);
            dxio a4 = ((dxjh) betkVar.d).a();
            betk.a(a4, 4);
            akfc a5 = betkVar.e.a();
            betk.a(a5, 5);
            cztz a6 = betkVar.f.a();
            betk.a(a6, 6);
            betk.a(iloVar, 7);
            betk.a(cclnVar, 8);
            btvo a7 = betkVar.g.a();
            betk.a(a7, 10);
            betjVar = new betj(a, a2, a3, a4, a5, a6, iloVar, cclnVar, beqnVar, a7, i);
        }
        this.i = betjVar;
        if ((cclnVar.a & 256) != 0) {
            dgep dgepVar = cclnVar.l;
            beqfVar.b(dgepVar == null ? dgep.f : dgepVar);
        }
    }

    private final void j() {
        Toast.makeText(this.a, (int) R.string.UNKNOWN_ERROR, 0).show();
    }

    private static boolean k(btvo btvoVar, boolean z) {
        return z && btvoVar.getDealsParameters().b();
    }

    private static boolean l(btvo btvoVar, ccln cclnVar) {
        dgev dgevVar;
        if (!btvoVar.getDealsParameters().d().equals(dkik.UNKNOWN_SAVING_BUTTON_LAYOUT_TYPE)) {
            if (cclnVar.b == 10) {
                dgevVar = (dgev) cclnVar.c;
            } else {
                dgevVar = dgev.g;
            }
            return !dgevVar.b.isEmpty();
        }
        return false;
    }

    @Override // defpackage.betc
    @dzsi
    public jic a() {
        return this.f;
    }

    @Override // defpackage.betc
    public String b() {
        dgev dgevVar;
        ccln cclnVar = this.d;
        if (cclnVar.b == 10) {
            dgevVar = (dgev) cclnVar.c;
        } else {
            dgevVar = dgev.g;
        }
        dger dgerVar = dgevVar.e;
        if (dgerVar == null) {
            dgerVar = dger.c;
        }
        return dgerVar.a;
    }

    @Override // defpackage.betc
    public String c() {
        return this.d.f;
    }

    @Override // defpackage.betc
    public String d() {
        dgev dgevVar;
        ccln cclnVar = this.d;
        if (cclnVar.b == 10) {
            dgevVar = (dgev) cclnVar.c;
        } else {
            dgevVar = dgev.g;
        }
        return dgevVar.c;
    }

    @Override // defpackage.betc
    public cjtd f() {
        return this.e;
    }

    @Override // defpackage.betc
    public Integer g() {
        return Integer.valueOf(true != k(this.c, this.h) ? 0 : 8);
    }

    @Override // defpackage.betc
    @dzsi
    public betb h() {
        return this.i;
    }

    @Override // defpackage.betc
    public Boolean i() {
        return Boolean.valueOf(l(this.c, this.d));
    }

    @Override // defpackage.betc
    public cqkl e() {
        ccln cclnVar = this.d;
        if ((cclnVar.a & 256) == 0) {
            j();
            bvoo.j(new bvon("%s: Offer id: %s", "Missing detail page link data", this.d.d));
            return cqkl.a;
        }
        dgep dgepVar = cclnVar.l;
        if (dgepVar == null) {
            dgepVar = dgep.f;
        }
        if (this.b.c(dgepVar, 7, this.g, dcdc.r(this.d.i)) != 2) {
            j();
        }
        return cqkl.a;
    }
}
