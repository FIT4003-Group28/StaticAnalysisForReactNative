package defpackage;

import android.app.Application;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzro  reason: default package */
/* loaded from: classes4.dex */
public final class bzro {
    private final Application a;

    public bzro(Application application) {
        this.a = application;
    }

    public final void a(augc augcVar, int i, @dzsi bzrn bzrnVar, CharSequence charSequence, CharSequence charSequence2) {
        RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), (int) R.layout.icon_in_front_of_title_notification);
        int b = jmj.b(this.a, 18.0f);
        remoteViews.setInt(R.id.icon_in_front_of_title_notification_icon_before_title, "setMaxWidth", b);
        remoteViews.setInt(R.id.icon_in_front_of_title_notification_icon_before_title, "setMaxHeight", b);
        remoteViews.setImageViewResource(R.id.icon_in_front_of_title_notification_icon_before_title, i);
        remoteViews.setViewVisibility(R.id.icon_in_front_of_title_notification_icon_before_title, 0);
        if (bzrnVar == null || bzrnVar.b().isEmpty()) {
            remoteViews.setViewVisibility(R.id.icon_in_front_of_title_notification_text_before_title, 8);
        } else {
            remoteViews.setTextViewText(R.id.icon_in_front_of_title_notification_text_before_title, bzrnVar.b());
            remoteViews.setTextColor(R.id.icon_in_front_of_title_notification_text_before_title, bzrnVar.a());
            remoteViews.setViewVisibility(R.id.icon_in_front_of_title_notification_text_before_title, 0);
        }
        remoteViews.setTextViewText(R.id.icon_in_front_of_title_notification_title, charSequence);
        remoteViews.setTextViewText(R.id.icon_in_front_of_title_notification_subtitle, charSequence2);
        RemoteViews clone = remoteViews.clone();
        clone.setInt(R.id.icon_in_front_of_title_notification_subtitle, "setMaxLines", 2);
        augcVar.k(remoteViews, new auoc[0]);
        augcVar.i(clone, new auoc[0]);
        augcVar.s = new ic();
    }
}
