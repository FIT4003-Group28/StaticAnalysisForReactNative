package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: ulc  reason: default package */
/* loaded from: classes4.dex */
public final class ulc {
    public static final ulc a = new ulc();
    public boolean b = false;
    public long c = -1;

    private ulc() {
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        if (z) {
            return;
        }
        this.c = SystemClock.elapsedRealtime();
    }
}
