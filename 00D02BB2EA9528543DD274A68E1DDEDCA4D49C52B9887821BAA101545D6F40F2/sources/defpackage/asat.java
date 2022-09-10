package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.apps.gmm.navigation.service.detection.ActivityRecognitionReceiver;
/* compiled from: PG */
/* renamed from: asat  reason: default package */
/* loaded from: classes2.dex */
public final class asat {
    public asat(Application application) {
        PendingIntent.getBroadcast(application, 0, new Intent(application, ActivityRecognitionReceiver.class), 134217728);
    }

    public static void a(@dzsi deig<Void> deigVar) {
        deigVar.j(null);
    }
}
