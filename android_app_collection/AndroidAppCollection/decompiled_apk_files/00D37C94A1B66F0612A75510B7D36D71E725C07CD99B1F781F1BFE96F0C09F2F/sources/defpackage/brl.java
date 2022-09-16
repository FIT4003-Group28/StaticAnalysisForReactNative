package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: brl  reason: default package */
/* loaded from: classes2.dex */
public final class brl extends bla {
    final Context c;

    public brl(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.bla
    public final void a(blv blvVar) {
        if (this.b >= 10) {
            blvVar.l(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
