package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.gmm.reportaproblem.common.service.DismissNotificationBroadcastReceiver;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: pcv  reason: default package */
/* loaded from: classes7.dex */
public final class pcv implements pcx<dlfh> {
    public static final int a = auiy.EDIT_PUBLISHED.a().intValue();
    private final Application b;
    private final bokp c;
    private final auhi d;
    private final dxio<akfa> e;
    private final auhj f;

    public pcv(Application application, bokp bokpVar, auhi auhiVar, dxio<akfa> dxioVar, auhj auhjVar) {
        this.b = application;
        this.c = bokpVar;
        this.d = auhiVar;
        this.e = dxioVar;
        this.f = auhjVar;
    }

    private final augc f(pau pauVar, @dzsi String str, boolean z) {
        btlu n = this.e.a().n(pauVar.b);
        String packageName = this.b.getPackageName();
        Intent intent = new Intent();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 22);
        sb.append(packageName);
        sb.append(".");
        sb.append("EditPublishedActivity");
        Intent putExtra = intent.setComponent(new ComponentName(packageName, sb.toString())).putExtra("feature_id", str).putExtra("gaia_id", pauVar.b).putExtra("is_place_removed", z);
        Intent putExtra2 = new Intent(this.b, DismissNotificationBroadcastReceiver.class).setAction("com.google.android.apps.gmm.reportaproblem.common.service.DISMISS_NOTIFICATION").putExtra("gaia_id", pauVar.b);
        augc b = this.f.b(dpyv.EDIT_PUBLISHED.dm, this.d.g(dpyv.EDIT_PUBLISHED.dm));
        b.R = pauVar;
        b.S = n;
        b.E(putExtra, auhw.ACTIVITY);
        b.m(putExtra2, auhw.BROADCAST);
        b.v = -1;
        b.e();
        b.C(true);
        b.I();
        b.D(this.b.getResources().getColor(R.color.quantum_googblue));
        return b;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return i == a;
    }

    @Override // defpackage.pcx
    public final dssr<dlfh> b() {
        return (dssr) dlfh.q.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(dlfh dlfhVar) {
        return dpyv.EDIT_PUBLISHED.dm;
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, dlfh dlfhVar) {
        e(pauVar, dlfhVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:3|4|5|6|7|8|9|(1:11)|(20:13|14|15|16|17|18|(3:23|20|21)|24|25|(1:27)|28|29|(1:31)|32|33|34|35|36|37|38)|53|(1:55)(1:62)|56|(1:61)(1:58)|59|33|34|35|36|37|38) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(defpackage.pau r22, defpackage.dlfh r23) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcv.e(pau, dlfh):void");
    }
}
