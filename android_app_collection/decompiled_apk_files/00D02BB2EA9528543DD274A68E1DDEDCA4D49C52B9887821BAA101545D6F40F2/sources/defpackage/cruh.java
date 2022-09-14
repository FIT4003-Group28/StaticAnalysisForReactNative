package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.maps.R;
import com.google.android.libraries.geophotouploader.NotificationReceiverService;
import com.google.android.libraries.geophotouploader.WaitForWifiWorker;
/* compiled from: PG */
/* renamed from: cruh  reason: default package */
/* loaded from: classes5.dex */
public final class cruh {
    public final NotificationManager a;
    public final Context b;
    @dzsi
    public final crxx c;
    public crwb d;
    public final crxq e;
    @dzsi
    public crua f;
    private boolean g = false;
    private final cruw h;

    public cruh(Context context, crwb crwbVar, @dzsi crxx crxxVar, cruw cruwVar) {
        this.b = context;
        this.c = crxxVar;
        this.d = crwbVar;
        this.h = cruwVar;
        this.a = (NotificationManager) context.getSystemService("notification");
        this.e = new crxq(context);
    }

    public final void a(Service service, String str) {
        b(service, str, false);
    }

    public final void b(Service service, String str, boolean z) {
        if (!this.g || z) {
            ib e = e(str);
            e.s(0, 0, true);
            Notification b = e.b();
            if (!this.g) {
                this.g = true;
                service.startForeground(116741324, b);
            } else if (!z) {
            } else {
                this.a.notify(116741324, b);
            }
        }
    }

    public final void c(Service service) {
        if (this.g) {
            this.g = false;
            service.stopForeground(true);
        }
    }

    public final boolean d(int i, int i2) {
        crwd crwdVar = this.d.g;
        if (crwdVar == null) {
            crwdVar = crwd.f;
        }
        if (!crwdVar.e || !this.d.e || this.e.b(true)) {
            return false;
        }
        ib e = e(this.b.getResources().getQuantityString(i2 > 0 ? R.plurals.PHOTO_AND_VIDEO_UPLOAD_PENDING_TASK_TITLE : R.plurals.UPLOAD_PENDING_TASK_TITLE, i, Integer.valueOf(i)));
        crwd crwdVar2 = this.d.g;
        if (crwdVar2 == null) {
            crwdVar2 = crwd.f;
        }
        if (crwdVar2.d) {
            f(e);
        }
        crwd crwdVar3 = this.d.g;
        if (crwdVar3 == null) {
            crwdVar3 = crwd.f;
        }
        if (crwdVar3.e) {
            e.e(0, this.b.getString(R.string.UPLOAD_NOW), g("geo.uploader.upload_now_action", 3));
        }
        crua cruaVar = this.f;
        if (cruaVar != null) {
            e.s(100, (int) (cruaVar.h * 100.0d), false);
        }
        this.a.notify(116741324, e.b());
        cruw cruwVar = this.h;
        crwb crwbVar = this.d;
        bbo bboVar = new bbo();
        bboVar.e("geo.uploader.gpu_config_key", datl.a(crwbVar.bS()));
        bbp a = bboVar.a();
        bbk bbkVar = new bbk();
        bbkVar.c = 3;
        cruwVar.a.d("geo.uploader.wait_for_wifi_task", 1, new bca(WaitForWifiWorker.class).d("geo.uploader.wait_for_wifi_task").b(bbkVar.a()).c(a).f());
        return true;
    }

    public final ib e(String str) {
        ib ibVar = new ib(this.b);
        crwd crwdVar = this.d.g;
        if (crwdVar == null) {
            crwdVar = crwd.f;
        }
        ibVar.t(crwdVar.b);
        ibVar.l(str);
        if (ako.a()) {
            crwd crwdVar2 = this.d.g;
            if (crwdVar2 == null) {
                crwdVar2 = crwd.f;
            }
            if ((crwdVar2.a & 2) != 0) {
                crwd crwdVar3 = this.d.g;
                if (crwdVar3 == null) {
                    crwdVar3 = crwd.f;
                }
                ibVar.G = crwdVar3.c;
            }
        }
        return ibVar;
    }

    public final void f(ib ibVar) {
        ibVar.e(0, this.b.getString(17039360), g("geo.uploader.cancel_upload_action", 1));
    }

    public final PendingIntent g(String str, int i) {
        return PendingIntent.getService(this.b, i, new Intent().setAction(str).setClass(this.b, NotificationReceiverService.class).putExtra("geo.uploader.gpu_config_key", this.d.bS()), 134217728);
    }
}
