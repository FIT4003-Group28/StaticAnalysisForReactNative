package androidx.core.app;

import android.app.PendingIntent;
import android.support.v4.app.RemoteActionCompat;
import android.support.v4.graphics.drawable.IconCompat;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(bap bapVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) bapVar.C(remoteActionCompat.a);
        remoteActionCompat.b = bapVar.z(remoteActionCompat.b, 2);
        remoteActionCompat.c = bapVar.z(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) bapVar.y(remoteActionCompat.d, 4);
        remoteActionCompat.e = bapVar.v(remoteActionCompat.e, 5);
        remoteActionCompat.f = bapVar.v(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, bap bapVar) {
        bapVar.D(remoteActionCompat.a);
        bapVar.r(remoteActionCompat.b, 2);
        bapVar.r(remoteActionCompat.c, 3);
        bapVar.u(remoteActionCompat.d, 4);
        bapVar.q(remoteActionCompat.e, 5);
        bapVar.q(remoteActionCompat.f, 6);
    }
}
