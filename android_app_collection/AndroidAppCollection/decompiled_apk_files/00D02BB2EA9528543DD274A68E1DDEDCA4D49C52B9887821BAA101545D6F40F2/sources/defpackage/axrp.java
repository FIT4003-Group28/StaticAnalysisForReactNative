package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axrp  reason: default package */
/* loaded from: classes.dex */
final class axrp implements axrw {
    final /* synthetic */ axrw a;
    final /* synthetic */ axrw b;
    final /* synthetic */ axrs c;

    public axrp(axrs axrsVar, axrw axrwVar, axrw axrwVar2) {
        this.c = axrsVar;
        this.a = axrwVar;
        this.b = axrwVar2;
    }

    @Override // defpackage.axrw
    public final void a(int i) {
        if (i != -1) {
            if (i != 0) {
                return;
            }
            this.c.d.i(cjtd.a(dtxu.db));
            this.c.f.run();
            this.b.a(0);
            this.c.h.a.a(new aqzy());
        } else if (this.c.a.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            this.c.d.i(cjtd.a(dtxu.dc));
            if (!((gga) this.c.a).aZ) {
                return;
            }
            axrw axrwVar = this.a;
            axqx axqxVar = new axqx();
            axqxVar.b = axrwVar;
            Bundle bundle = new Bundle();
            bundle.putString("PERMISSION_TYPE_KEY", "android.permission.ACCESS_FINE_LOCATION");
            axqxVar.B(bundle);
            ff ffVar = this.c.a;
            boolean a = gei.a(gga.L(ffVar), axqxVar);
            ffVar.g().aq();
            if (a) {
                this.c.e.g().d(cjtd.a(dtxu.cM));
            } else {
                this.b.a(-1);
            }
        } else {
            cjqy cjqyVar = this.c.d;
            cjte cjteVar = new cjte(deaf.TAP);
            cjta b = cjtd.b();
            b.d = dtxu.dd;
            ddzy bZ = deab.c.bZ();
            deaa deaaVar = deaa.TOGGLE_ON;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deab deabVar = (deab) bZ.b;
            deabVar.b = deaaVar.d;
            deabVar.a |= 1;
            b.a = bZ.bK();
            cjqyVar.m(cjteVar, b.a());
            this.c.b.S(bvjk.h, true);
            axrs axrsVar = this.c;
            ff ffVar2 = axrsVar.a;
            bvrj.UI_THREAD.c();
            axrsVar.e.g().d(cjtd.a(dtxu.cY));
            cztq a2 = cztt.a(axrsVar.c.a());
            a2.e(R.string.APP_PERMISSION_DENIED, new Object[0]);
            cztq a3 = a2.a(R.string.LEARN_MORE, new axrq(axrsVar, ffVar2));
            a3.d(cztr.LONG);
            a3.c();
            this.b.a(-1);
        }
    }
}
