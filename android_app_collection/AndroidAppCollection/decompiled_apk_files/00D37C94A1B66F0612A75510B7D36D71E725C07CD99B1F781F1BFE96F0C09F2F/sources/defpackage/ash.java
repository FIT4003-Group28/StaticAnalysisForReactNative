package defpackage;

import android.app.Notification;
import android.os.Build;
import android.widget.RemoteViews;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ash  reason: default package */
/* loaded from: classes2.dex */
public final class ash extends asi {
    private final void k(RemoteViews remoteViews) {
        fi fiVar = this.b;
        int i = fiVar.z;
        if (i == 0) {
            i = fiVar.a.getResources().getColor(R.color.notification_material_background_media_default_color);
        }
        remoteViews.setInt(R.id.status_bar_latest_event_content, "setBackgroundColor", i);
    }

    @Override // defpackage.asi, defpackage.fk
    public final void b(fd fdVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            Notification.Builder builder = ((fl) fdVar).b;
            Notification.DecoratedMediaCustomViewStyle a = asg.a();
            asf.b(a, this.a, this.f);
            asf.d(builder, a);
            return;
        }
        super.b(fdVar);
    }

    @Override // defpackage.asi
    public final int c(int i) {
        return i <= 3 ? R.layout.notification_template_big_media_narrow_custom : R.layout.notification_template_big_media_custom;
    }

    @Override // defpackage.asi, defpackage.fk
    public final RemoteViews i() {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        fi fiVar = this.b;
        RemoteViews remoteViews = fiVar.C;
        if (remoteViews == null && fiVar.D == null) {
            return null;
        }
        RemoteViews g = g(remoteViews != null ? R.layout.notification_template_media_custom : R.layout.notification_template_media, true);
        int size = this.b.b.size();
        int[] iArr = this.a;
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        g.removeAllViews(R.id.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                if (i >= size) {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i), Integer.valueOf(size - 1)));
                }
                g.addView(R.id.media_actions, super.e((ff) this.b.b.get(this.a[i])));
            }
        }
        g.setViewVisibility(R.id.end_padder, 0);
        g.setViewVisibility(R.id.cancel_action, 8);
        if (remoteViews != null) {
            f(g, this.b.C);
        }
        k(g);
        return g;
    }

    @Override // defpackage.fk
    public final RemoteViews j() {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.b.C) == null) {
            return null;
        }
        RemoteViews d = d();
        f(d, remoteViews);
        k(d);
        return d;
    }

    @Override // defpackage.asi, defpackage.fk
    public final RemoteViews h() {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        fi fiVar = this.b;
        RemoteViews remoteViews = fiVar.D;
        if (remoteViews == null) {
            remoteViews = fiVar.C;
        }
        if (remoteViews == null) {
            return null;
        }
        RemoteViews d = d();
        f(d, remoteViews);
        k(d);
        return d;
    }
}
