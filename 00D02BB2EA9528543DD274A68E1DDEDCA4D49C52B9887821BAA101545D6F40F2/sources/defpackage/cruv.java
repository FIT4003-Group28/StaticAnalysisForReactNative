package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.geophotouploader.UploadService;
/* compiled from: PG */
/* renamed from: cruv  reason: default package */
/* loaded from: classes5.dex */
public final class cruv {
    public static void a(Context context, Intent intent, cruu cruuVar) {
        b(context, intent);
        context.bindService(new Intent(context, UploadService.class), new crut(cruuVar, context), 1);
    }

    public static void b(Context context, Intent intent) {
        if (ako.a()) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }
}
