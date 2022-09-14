package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: ahs  reason: default package */
/* loaded from: classes2.dex */
public final class ahs {
    public final Intent a;

    public ahs(Intent intent) {
        this.a = intent;
    }

    public final void a(Context context, Uri uri) {
        this.a.setData(uri);
        akm.i(context, this.a);
    }
}
