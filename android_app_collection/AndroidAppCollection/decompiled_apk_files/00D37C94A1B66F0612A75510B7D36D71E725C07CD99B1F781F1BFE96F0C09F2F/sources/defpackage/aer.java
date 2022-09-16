package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aer  reason: default package */
/* loaded from: classes.dex */
public final class aer {
    public final Intent a;
    public final Bundle b;

    public aer(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public final void a(Context context, Uri uri) {
        this.a.setData(uri);
        akd.c(context, this.a, this.b);
    }
}
