package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: xhp  reason: default package */
/* loaded from: classes7.dex */
public class xhp implements xgv {
    private final gga a;
    private final diif b;
    private final dxio<afha> c;

    public xhp(gga ggaVar, dxio<afha> dxioVar, diif diifVar) {
        this.a = ggaVar;
        this.c = dxioVar;
        this.b = diifVar;
    }

    @Override // defpackage.xgv
    public Boolean b() {
        return true;
    }

    @Override // defpackage.xgv
    public Boolean c() {
        return false;
    }

    @Override // defpackage.xgv
    public Boolean d() {
        return false;
    }

    @Override // defpackage.xgv
    public Boolean e() {
        return true;
    }

    @Override // defpackage.xgv
    public CharSequence f() {
        return this.b.b;
    }

    @Override // defpackage.xgv
    public CharSequence g() {
        diif diifVar = this.b;
        return TextUtils.concat(diifVar.c, " · ", diifVar.d).toString();
    }

    @Override // defpackage.xgv
    public CharSequence h() {
        return "";
    }

    @Override // defpackage.xgv
    @dzsi
    public jic i() {
        dihv dihvVar = this.b.a;
        if (dihvVar == null) {
            dihvVar = dihv.b;
        }
        return new jic(dihvVar.a, ckqc.FIFE_MERGE, 0);
    }

    @Override // defpackage.xgv
    public cqkl j() {
        return cqkl.a;
    }

    @Override // defpackage.xgv
    public cqkl k() {
        try {
            this.c.a().f(this.a, new Intent("android.intent.action.VIEW").setData(Uri.parse(this.b.e)), 4);
        } catch (ActivityNotFoundException unused) {
        }
        return cqkl.a;
    }

    @Override // defpackage.xgv
    public cqkl l() {
        return cqkl.a;
    }

    @Override // defpackage.xgv
    @dzsi
    public cjtd m() {
        cjta b = cjtd.b();
        b.d = dtyc.ea;
        ddes bZ = ddet.D.bZ();
        ddgp bZ2 = ddgr.d.bZ();
        bZ2.a(this.b.f);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddgr ddgrVar = (ddgr) bZ2.b;
        ddgrVar.c = 1;
        ddgrVar.a = 1 | ddgrVar.a;
        ddgr bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        bK.getClass();
        ddetVar.w = bK;
        ddetVar.a |= 536870912;
        b.s(bZ.bK());
        return b.a();
    }

    @Override // defpackage.xgv
    public cjtd n() {
        return cjtd.b;
    }

    @Override // defpackage.xgv
    public cjtd o() {
        return cjtd.b;
    }
}
