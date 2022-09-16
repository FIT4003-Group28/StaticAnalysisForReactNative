package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* renamed from: btso  reason: default package */
/* loaded from: classes4.dex */
public final class btso {
    private final Context a;

    public btso(Context context) {
        this.a = context;
    }

    public final boolean a(PackageManager packageManager, String str) {
        if (!packageManager.equals(this.a.getPackageManager())) {
            throw new RuntimeException("PackageManager passed to isPackageGoogleSigned must match that from the Context used to construct this wrapper.");
        }
        return btsj.a(this.a, str);
    }
}
