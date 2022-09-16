package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: brf  reason: default package */
/* loaded from: classes2.dex */
final class brf extends bla {
    public brf() {
        super(3, 4);
    }

    @Override // defpackage.bla
    public final void a(blv blvVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            blvVar.g("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }
}
