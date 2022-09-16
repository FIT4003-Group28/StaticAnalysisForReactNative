package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gmm.transit.TransitStationService;
/* compiled from: PG */
/* renamed from: byvs  reason: default package */
/* loaded from: classes4.dex */
public final class byvs {
    private final Application a;

    public byvs(Application application) {
        this.a = application;
    }

    public final PendingIntent a(Intent intent, int i) {
        return PendingIntent.getBroadcast(this.a, 0, intent, i);
    }

    public final PendingIntent b(String str, int i) {
        return a(new Intent(str, Uri.EMPTY, this.a, TransitStationService.class), i);
    }
}
