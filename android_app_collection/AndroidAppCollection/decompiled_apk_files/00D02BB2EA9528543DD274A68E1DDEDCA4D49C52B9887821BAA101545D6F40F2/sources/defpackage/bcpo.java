package defpackage;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: bcpo  reason: default package */
/* loaded from: classes3.dex */
public final class bcpo {
    @dzsi
    public static final Uri a(Context context, String str, String str2) {
        final deig d = deig.d();
        MediaScannerConnection.scanFile(context, new String[]{str}, new String[]{str2}, new MediaScannerConnection.OnScanCompletedListener(d) { // from class: bcpn
            private final deig a;

            {
                this.a = d;
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str3, Uri uri) {
                this.a.j(uri);
            }
        });
        try {
            return (Uri) d.get(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }
}
