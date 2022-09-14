package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bdi  reason: default package */
/* loaded from: classes3.dex */
public final class bdi extends bw {
    final Context c;

    public bdi(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.bw
    public final void a(avu avuVar) {
        if (this.b >= 10) {
            avuVar.m(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
