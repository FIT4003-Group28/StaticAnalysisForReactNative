package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
/* compiled from: PG */
/* renamed from: lgt  reason: default package */
/* loaded from: classes3.dex */
public final class lgt {
    private final Context a;

    public lgt(Context context) {
        this.a = context;
    }

    public final Intent a() {
        return new Intent(this.a, SettingsActivity.class);
    }
}
