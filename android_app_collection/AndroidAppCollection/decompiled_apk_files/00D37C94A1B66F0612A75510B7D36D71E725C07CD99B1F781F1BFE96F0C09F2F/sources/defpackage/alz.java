package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
/* compiled from: PG */
/* renamed from: alz  reason: default package */
/* loaded from: classes.dex */
public final class alz {
    public final aly a;

    public alz(aly alyVar) {
        this.a = alyVar;
    }

    public alz(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new alw(uri, clipDescription, uri2);
        } else {
            this.a = new alx(uri, clipDescription, uri2);
        }
    }
}
