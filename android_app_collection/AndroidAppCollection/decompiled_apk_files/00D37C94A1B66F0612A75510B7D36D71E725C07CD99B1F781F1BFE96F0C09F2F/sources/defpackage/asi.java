package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.widget.RemoteViews;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: asi  reason: default package */
/* loaded from: classes2.dex */
public class asi extends fk {
    public int[] a = null;
    public MediaSessionCompat$Token f;

    @Override // defpackage.fk
    public void b(fd fdVar) {
        Notification.Builder builder = ((fl) fdVar).b;
        Notification.MediaStyle a = asf.a();
        asf.b(a, this.a, this.f);
        asf.d(builder, a);
    }

    public int c(int i) {
        return i <= 3 ? R.layout.notification_template_big_media_narrow : R.layout.notification_template_big_media;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final RemoteViews d() {
        int min = Math.min(this.b.b.size(), 5);
        RemoteViews g = g(c(min), false);
        g.removeAllViews(R.id.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                g.addView(R.id.media_actions, e((ff) this.b.b.get(i)));
            }
        }
        g.setViewVisibility(R.id.cancel_action, 8);
        return g;
    }

    public final RemoteViews e(ff ffVar) {
        PendingIntent pendingIntent = ffVar.g;
        RemoteViews remoteViews = new RemoteViews(this.b.a.getPackageName(), (int) R.layout.notification_media_action);
        remoteViews.setImageViewResource(R.id.action0, ffVar.e);
        if (pendingIntent != null) {
            remoteViews.setOnClickPendingIntent(R.id.action0, ffVar.g);
        }
        ase.a(remoteViews, R.id.action0, ffVar.f);
        return remoteViews;
    }

    @Override // defpackage.fk
    public RemoteViews h() {
        return null;
    }

    @Override // defpackage.fk
    public RemoteViews i() {
        return null;
    }
}
