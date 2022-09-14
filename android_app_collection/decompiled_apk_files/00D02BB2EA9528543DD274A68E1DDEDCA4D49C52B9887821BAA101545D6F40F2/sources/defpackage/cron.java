package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cron  reason: default package */
/* loaded from: classes5.dex */
final class cron {
    private final Context a;

    public cron(Context context) {
        this.a = context;
    }

    public final boolean a() {
        return akm.d(this.a, "android.permission.BLUETOOTH") == 0;
    }
}
