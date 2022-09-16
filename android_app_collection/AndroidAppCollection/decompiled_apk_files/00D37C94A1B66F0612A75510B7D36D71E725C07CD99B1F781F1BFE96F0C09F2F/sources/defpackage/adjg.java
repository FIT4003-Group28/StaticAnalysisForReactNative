package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: adjg  reason: default package */
/* loaded from: classes.dex */
public final class adjg {
    public final SharedPreferences a;

    public adjg(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final int a() {
        return this.a.getInt("mdx.last_lr_notification_shown_id", -1);
    }

    public final long b() {
        return this.a.getLong("mdx.lr_notification_last_notif_shown_time_ms", 0L);
    }

    public final String c() {
        return this.a.getString("mdx.last_lr_notification_shown_tag", "");
    }

    public final void d() {
        this.a.edit().putInt("mdx.last_lr_notification_shown_id", -1).apply();
        this.a.edit().putString("mdx.last_lr_notification_shown_tag", "").apply();
    }
}
