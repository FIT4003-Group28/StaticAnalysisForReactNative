package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: bdd  reason: default package */
/* loaded from: classes3.dex */
final class bdd extends bw {
    public bdd() {
        super(3, 4);
    }

    @Override // defpackage.bw
    public final void a(avu avuVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            avuVar.h("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }
}
