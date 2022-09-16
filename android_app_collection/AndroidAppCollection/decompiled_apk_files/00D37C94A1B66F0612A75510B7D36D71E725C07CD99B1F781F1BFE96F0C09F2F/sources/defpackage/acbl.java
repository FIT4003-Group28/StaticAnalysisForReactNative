package defpackage;

import android.media.MediaScannerConnection;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: acbl  reason: default package */
/* loaded from: classes.dex */
final class acbl implements MediaScannerConnection.OnScanCompletedListener {
    final /* synthetic */ acbv a;

    public acbl(acbv acbvVar) {
        this.a = acbvVar;
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        this.a.a(uri);
    }
}
