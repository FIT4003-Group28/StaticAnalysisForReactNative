package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.apps.gmm.traffic.notification.DismissAreaTrafficWarmUpNotificationBroadcastReceiver;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byeh  reason: default package */
/* loaded from: classes4.dex */
public final class byeh extends itb implements byej {
    public final gga a;
    public final cjqq c;
    private final btrm e;
    private final byps f;
    private final byex g;
    public boolean b = true;
    public int d = 1;

    public byeh(gga ggaVar, btrm btrmVar, byps bypsVar, cjqq cjqqVar, byex byexVar) {
        this.a = ggaVar;
        this.e = btrmVar;
        this.f = bypsVar;
        this.c = cjqqVar;
        this.g = byexVar;
    }

    @Override // defpackage.itb
    public final void Nt() {
        aujb h;
        super.Nt();
        btrm btrmVar = this.e;
        dceq a = dcet.a();
        a.b(alho.class, new byei(0, alho.class, this, bvrj.UI_THREAD));
        a.b(afwq.class, new byei(1, afwq.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        byps bypsVar = this.f;
        dbsk.s(bypsVar);
        byoi byoiVar = (byoi) bypsVar;
        if (!byoiVar.d && !byoiVar.c.m(bvjk.df, false) && (h = byoiVar.b.a().h(dpyv.AREA_TRAFFIC_WARM_UP.dm)) != null && h.f()) {
            augc b = byoiVar.e.a().b(dpyv.AREA_TRAFFIC_WARM_UP.dm, h);
            String string = byoiVar.a.getString(R.string.AREA_TRAFFIC_NOTIFICATION_WARM_UP_NOTIFICATION_TITLE);
            String string2 = byoiVar.a.getString(R.string.AREA_TRAFFIC_NOTIFICATION_WARM_UP_NOTIFICATION_BODY);
            b.E(bynu.d(byoiVar.a), auhw.ACTIVITY);
            b.f = string;
            b.g = string2;
            b.D(byoiVar.a.getResources().getColor(R.color.quantum_googblue));
            Resources resources = byoiVar.a.getResources();
            b.m = bvlf.a(bvly.a().b(resources, R.raw.traffic_icon_gray_circle), resources.getDimensionPixelSize(17104901), resources.getDimensionPixelSize(17104902), Bitmap.Config.ARGB_8888);
            ia iaVar = new ia();
            iaVar.f(string);
            iaVar.e(string2);
            b.s = iaVar;
            b.B(auoe.k(ddcu.d).i(1, 2131232820, byoiVar.a.getString(R.string.SETTINGS), bynu.d(byoiVar.a), auhw.ACTIVITY, true));
            Intent intent = new Intent(byoiVar.a, DismissAreaTrafficWarmUpNotificationBroadcastReceiver.class);
            intent.setAction("com.google.android.apps.gmm.traffic.notification.DISMISS_AREA_TRAFFIC_WARM_UP_NOTIFICATION");
            b.m(intent, auhw.BROADCAST);
            b.C(true);
            byoiVar.b.a().j(b.a());
            byoiVar.d = true;
        }
    }

    @Override // defpackage.itb
    public final void Po() {
        this.e.a(this);
        super.Po();
    }

    @Override // defpackage.byej
    public final void e(boolean z) {
        this.b = z;
    }

    @Override // defpackage.byej
    public final boolean f() {
        if (this.a.K() instanceof byky) {
            this.a.g().e();
            return true;
        }
        return false;
    }

    @Override // defpackage.byej
    public final void i(amwb amwbVar, akra akraVar, akqs akqsVar) {
        this.a.D(byky.g(amwbVar, akraVar, akqsVar, false));
    }

    @Override // defpackage.byej
    public final void j(boolean z, @dzsi dljj dljjVar) {
        byet byetVar = (byet) this.a.z(byet.class);
        if (byetVar == null || byetVar.ar || byetVar.as) {
            this.a.D(byet.i(this.g, z, dljjVar, false, false, null, null, false));
        }
    }
}
