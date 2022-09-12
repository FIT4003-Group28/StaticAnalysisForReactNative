package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deol  reason: default package */
/* loaded from: classes6.dex */
public final class deol extends deon {
    private final ContentResolver a;
    private final Context b;

    public deol(Context context) {
        this.b = context;
        this.a = context.getContentResolver();
    }

    @Override // defpackage.deon
    public final void a(String str, Uri uri) {
        ContentProviderClient acquireUnstableContentProviderClient = this.a.acquireUnstableContentProviderClient(uri);
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("slice_uri", uri);
            bundle.putString("provider_pkg", this.b.getPackageName());
            bundle.putString("pkg", str);
            acquireUnstableContentProviderClient.call("grant_perms", null, bundle);
        } catch (RemoteException unused) {
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }
}
