package defpackage;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: auhq  reason: default package */
/* loaded from: classes.dex */
public class auhq {
    public final ckcw a;
    private final Application b;
    private final aukk c;

    public auhq(Application application, ckcw ckcwVar, aukk aukkVar) {
        this.b = application;
        this.a = ckcwVar;
        this.c = aukkVar;
    }

    public static boolean d(int i) {
        return i == dpyv.AREA_TRAFFIC.dm;
    }

    public final boolean a() {
        return in.a(this.b).f();
    }

    public final boolean b(aujb aujbVar) {
        auin w;
        NotificationChannelGroup notificationChannelGroup;
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        this.c.a(false);
        NotificationManager notificationManager = (NotificationManager) this.b.getSystemService("notification");
        return notificationManager == null || (w = aujbVar.w()) == null || (notificationChannelGroup = notificationManager.getNotificationChannelGroup(w.h)) == null || !notificationChannelGroup.isBlocked();
    }

    public final boolean c(aujb aujbVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        this.c.a(false);
        final NotificationManager notificationManager = (NotificationManager) this.b.getSystemService("notification");
        if (notificationManager != null) {
            return dcft.j(aujbVar.a().a(), new dbsl(notificationManager) { // from class: auhp
                private final NotificationManager a;

                {
                    this.a = notificationManager;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    NotificationChannel notificationChannel;
                    auiu auiuVar = (auiu) obj;
                    return (auiuVar == null || (notificationChannel = this.a.getNotificationChannel(auiuVar.a())) == null || notificationChannel.getImportance() == 0) ? false : true;
                }
            });
        }
        return true;
    }

    public final void e(int i) {
        ((ckco) this.a.a(ckht.a)).a(i);
    }

    public final void f(int i) {
        ((ckco) this.a.a(ckht.o)).a(i);
    }

    public final void g(int i) {
        ((ckco) this.a.a(ckht.p)).a(i);
    }

    public final Bitmap h(Bitmap bitmap) {
        Resources resources = this.b.getResources();
        float f = resources.getDisplayMetrics().density * 48.0f;
        int ceil = (int) Math.ceil(f);
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f2 = f / 2.0f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(resources.getColor(R.color.qu_blue_grey_500));
        canvas.drawCircle(f2, f2, f2, paint);
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, ceil, ceil), paint2);
        return createBitmap;
    }
}
