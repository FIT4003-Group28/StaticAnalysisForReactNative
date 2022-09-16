package androidx.core.app;

import android.app.PendingIntent;
import android.support.v4.app.RemoteActionCompat;
import android.support.v4.graphics.drawable.IconCompat;
/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(bpe bpeVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) bpeVar.t(remoteActionCompat.a);
        remoteActionCompat.b = bpeVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = bpeVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) bpeVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = bpeVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = bpeVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, bpe bpeVar) {
        bpeVar.u(remoteActionCompat.a);
        bpeVar.g(remoteActionCompat.b, 2);
        bpeVar.g(remoteActionCompat.c, 3);
        bpeVar.i(remoteActionCompat.d, 4);
        bpeVar.f(remoteActionCompat.e, 5);
        bpeVar.f(remoteActionCompat.f, 6);
    }
}
