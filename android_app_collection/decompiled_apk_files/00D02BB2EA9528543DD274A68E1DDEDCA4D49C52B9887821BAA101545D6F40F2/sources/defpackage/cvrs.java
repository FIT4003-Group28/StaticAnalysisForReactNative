package defpackage;

import android.content.Context;
import android.provider.Settings;
/* compiled from: PG */
/* renamed from: cvrs  reason: default package */
/* loaded from: classes5.dex */
public final class cvrs {
    private final Context a;

    public cvrs(Context context) {
        this.a = context;
    }

    public final boolean a() {
        return Settings.Global.getInt(this.a.getContentResolver(), "multi_cb") == 1;
    }
}
