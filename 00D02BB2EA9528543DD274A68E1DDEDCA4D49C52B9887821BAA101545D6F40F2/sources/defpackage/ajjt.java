package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.apps.gmm.locationsharing.reporting.ActivityRecognitionBroadcastReceiver;
/* compiled from: PG */
/* renamed from: ajjt  reason: default package */
/* loaded from: classes2.dex */
public final class ajjt {
    public static final dcqe a = dcqe.c("ajjt");
    private final cojh b;
    private final ajzq c;
    @dzsi
    private final ahwo d;
    private final PendingIntent e;
    private dbsg<eaow> f = dbpy.a;

    public ajjt(Application application, ajzq ajzqVar, @dzsi ahwo ahwoVar) {
        this.b = coje.a(application);
        this.d = ahwoVar;
        this.c = ajzqVar;
        this.e = PendingIntent.getBroadcast(application, 0, new Intent(application, ActivityRecognitionBroadcastReceiver.class), 134217728);
    }

    public static boolean c(int i) {
        return (i == 4 || i == 3 || i == 5) ? false : true;
    }

    public static void d(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
                return;
            case 6:
            default:
                StringBuilder sb = new StringBuilder(17);
                sb.append("wtf - ");
                sb.append(i);
                sb.toString();
                return;
        }
    }

    public final synchronized void a(eaow eaowVar) {
        if (eaowVar.q(eaow.d(1L))) {
            bvoo.h("Can't listen for activity updates more frequently than once a second. Requested rate %s", eaowVar);
            b();
        } else if (this.f.a() && this.f.b().equals(eaowVar)) {
        } else {
            if (!this.c.a().e()) {
                b();
                return;
            }
            this.f = dbsg.i(eaowVar);
            this.b.a(eaowVar.b, this.e).m(ajjq.a);
            ahwo ahwoVar = this.d;
            if (ahwoVar == null) {
                return;
            }
            ahwoVar.b();
        }
    }

    public final synchronized void b() {
        if (this.f.a()) {
            this.f = dbpy.a;
            this.b.b(this.e).m(ajjr.a);
            ahwo ahwoVar = this.d;
            if (ahwoVar == null) {
                return;
            }
            this.f.h(ajjs.a);
            ahwoVar.b();
        }
    }
}
