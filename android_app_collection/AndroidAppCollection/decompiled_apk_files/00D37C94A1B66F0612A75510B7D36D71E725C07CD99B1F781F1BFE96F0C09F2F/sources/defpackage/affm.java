package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: affm  reason: default package */
/* loaded from: classes.dex */
final class affm implements affo {
    private long a;

    @Override // defpackage.affo
    public final void a() {
        this.a = SystemClock.elapsedRealtimeNanos();
    }

    @Override // defpackage.affo
    public final void b() {
        if (this.a != 0) {
            afki afkiVar = afki.ABR;
            SystemClock.elapsedRealtimeNanos();
            this.a = 0L;
        }
    }
}
