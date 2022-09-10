package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arzb  reason: default package */
/* loaded from: classes2.dex */
public final class arzb {
    @dzsi
    final Bitmap a;
    final CharSequence b;
    final arzc c;
    final /* synthetic */ arzd d;

    public arzb(@dzsi arzd arzdVar, Bitmap bitmap, CharSequence charSequence, arzc arzcVar) {
        this.d = arzdVar;
        this.a = bitmap;
        this.b = charSequence;
        this.c = arzcVar;
    }

    public final void a(Notification notification) {
        try {
            arzd arzdVar = this.d;
            if (!arzdVar.p) {
                arzdVar.c.startForeground(dpyv.NAVIGATION_STATUS.dm, notification);
                this.d.p = true;
            }
            this.d.f.d(dpyv.NAVIGATION_STATUS.dm, notification);
        } catch (RuntimeException unused) {
        }
    }

    public final RemoteViews b(int i, int i2, int i3) {
        RemoteViews remoteViews = new RemoteViews(this.d.c.getApplication().getPackageName(), i);
        remoteViews.setInt(i2, "setBackgroundColor", this.d.k.a);
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(i3, bitmap);
        } else {
            remoteViews.setImageViewResource(i3, 2131231959);
        }
        return remoteViews;
    }

    public final RemoteViews c() {
        RemoteViews b = b(R.layout.nav_expanded_notification, R.id.notification_container, R.id.nav_notification_icon);
        b.setTextViewText(R.id.dismiss_nav, this.b);
        b.setOnClickPendingIntent(R.id.dismiss_nav, this.d.j);
        return b;
    }
}
