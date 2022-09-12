package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vyj  reason: default package */
/* loaded from: classes7.dex */
final class vyj {
    public static RemoteViews a(Context context, vyi vyiVar, CharSequence charSequence) {
        String packageName = context.getPackageName();
        vyi vyiVar2 = vyi.TITLE;
        RemoteViews remoteViews = new RemoteViews(packageName, vyiVar.c);
        remoteViews.setTextViewText(R.id.text, charSequence);
        return remoteViews;
    }

    public static RemoteViews b(Context context, Bitmap bitmap, String str, int i) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
        remoteViews.setImageViewBitmap(R.id.icon_image, bitmap);
        if (str != null) {
            remoteViews.setCharSequence(R.id.icon_image, "setContentDescription", str);
        }
        return remoteViews;
    }
}
