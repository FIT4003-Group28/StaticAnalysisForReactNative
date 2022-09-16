package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
/* compiled from: PG */
/* renamed from: ohp  reason: default package */
/* loaded from: classes3.dex */
public final class ohp {
    private final Context a;

    public ohp(Context context) {
        this.a = context;
    }

    public final Intent a() {
        return new Intent(this.a, WatchWhileActivity.class);
    }
}
