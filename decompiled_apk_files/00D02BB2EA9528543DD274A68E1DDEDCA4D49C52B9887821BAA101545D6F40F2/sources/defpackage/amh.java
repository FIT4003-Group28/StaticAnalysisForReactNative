package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
/* compiled from: PG */
/* renamed from: amh  reason: default package */
/* loaded from: classes2.dex */
public final class amh {
    public amh(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            new amg(uri, clipDescription, uri2);
        }
    }

    public amh() {
    }
}
