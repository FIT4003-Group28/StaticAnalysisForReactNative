package defpackage;

import android.content.ContentProviderClient;
import android.os.Build;
/* compiled from: PG */
/* renamed from: axfh  reason: default package */
/* loaded from: classes2.dex */
public final class axfh {
    public final ContentProviderClient a;
    public final String b;

    public axfh(ContentProviderClient contentProviderClient, String str) {
        this.a = contentProviderClient;
        this.b = str;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.close();
        } else {
            this.a.release();
        }
    }
}
