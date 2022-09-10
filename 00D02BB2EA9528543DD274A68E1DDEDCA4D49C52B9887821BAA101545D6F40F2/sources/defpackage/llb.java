package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: llb  reason: default package */
/* loaded from: classes7.dex */
public final class llb {
    static final long[] a = {0};
    public static final /* synthetic */ int c = 0;
    public String b = "";
    private final Context d;
    private final jzv e;
    private final dxio<aukk> f;
    private final cjqq g;
    private final bvrb h;

    public llb(Context context, jzv jzvVar, dxio<aukk> dxioVar, cjqq cjqqVar, bvrb bvrbVar) {
        this.d = context;
        this.e = jzvVar;
        this.f = dxioVar;
        this.g = cjqqVar;
        this.h = bvrbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(amub amubVar) {
        ib ibVar;
        if (!vxi.e(amubVar.J)) {
            this.b = "";
            return;
        }
        String str = new atca(this.d, amubVar).a;
        if (str.isEmpty() || this.b.equals(str)) {
            return;
        }
        this.b = str;
        cjta b = cjtd.b();
        b.d = dtxm.bY;
        Intent intent = new Intent();
        intent.putExtra("IS_ROUTE_OPTIONS_NOTIFICATION_INTENT", true);
        final NotificationManager notificationManager = (NotificationManager) this.d.getSystemService("notification");
        if (ako.a()) {
            ibVar = new ib(this.d, "OtherChannel");
            this.f.a().a(false);
            ibVar.G = "OtherChannel";
        } else {
            ibVar = new ib(this.d);
        }
        ib ibVar2 = ibVar;
        ibVar2.l(str);
        ibVar2.k(this.d.getString(R.string.CAR_ROUTE_OPTIONS_NOTIFICATION_CHANGE));
        ibVar2.t(2131232784);
        ibVar2.B = this.d.getResources().getColor(R.color.quantum_googblue);
        ibVar2.C = 1;
        ibVar2.y(a);
        ibVar2.k = 1;
        ibVar2.w = true;
        this.e.d(dpyv.CAR_ROUTE_OPTIONS.dm, ibVar2, intent, str, this.d.getString(R.string.CAR_ROUTE_OPTIONS_NOTIFICATION_CHANGE));
        notificationManager.notify(dpyv.CAR_ROUTE_OPTIONS.dm, ibVar2.b());
        this.g.g().d(b.a());
        this.h.a(new Runnable(notificationManager) { // from class: lla
            private final NotificationManager a;

            {
                this.a = notificationManager;
            }

            @Override // java.lang.Runnable
            public final void run() {
                NotificationManager notificationManager2 = this.a;
                int i = llb.c;
                notificationManager2.cancel(dpyv.CAR_ROUTE_OPTIONS.dm);
            }
        }, bvrj.UI_THREAD, TimeUnit.SECONDS.toMillis(8L));
    }
}
