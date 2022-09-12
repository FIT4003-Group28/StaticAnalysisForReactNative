package defpackage;

import android.app.Application;
import android.widget.RemoteViews;
/* compiled from: PG */
/* renamed from: bzvn  reason: default package */
/* loaded from: classes4.dex */
public final class bzvn {
    public static final dcqe a = dcqe.c("bzvn");

    public static void a(RemoteViews remoteViews, int i, int i2, Application application) {
        int b = jmj.b(application, 18.0f);
        remoteViews.setInt(i, "setMaxWidth", b);
        remoteViews.setInt(i, "setMaxHeight", b);
        remoteViews.setImageViewResource(i, i2);
        remoteViews.setViewVisibility(i, 0);
    }
}
