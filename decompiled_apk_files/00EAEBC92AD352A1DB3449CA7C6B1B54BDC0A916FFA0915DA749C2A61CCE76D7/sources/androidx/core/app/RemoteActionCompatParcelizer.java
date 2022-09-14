package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1477a = (IconCompat) aVar.a((androidx.versionedparcelable.a) remoteActionCompat.f1477a, 1);
        remoteActionCompat.f1478b = aVar.a(remoteActionCompat.f1478b, 2);
        remoteActionCompat.f1479c = aVar.a(remoteActionCompat.f1479c, 3);
        remoteActionCompat.f1480d = (PendingIntent) aVar.a((androidx.versionedparcelable.a) remoteActionCompat.f1480d, 4);
        remoteActionCompat.f1481e = aVar.a(remoteActionCompat.f1481e, 5);
        remoteActionCompat.f1482f = aVar.a(remoteActionCompat.f1482f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.a(false, false);
        aVar.b(remoteActionCompat.f1477a, 1);
        aVar.b(remoteActionCompat.f1478b, 2);
        aVar.b(remoteActionCompat.f1479c, 3);
        aVar.b(remoteActionCompat.f1480d, 4);
        aVar.b(remoteActionCompat.f1481e, 5);
        aVar.b(remoteActionCompat.f1482f, 6);
    }
}
