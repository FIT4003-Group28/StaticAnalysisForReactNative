package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: cvxi  reason: default package */
/* loaded from: classes5.dex */
public final class cvxi {
    public static final cvxi c = new cvxi();
    public boolean a = false;
    public long b = -1;

    private cvxi() {
    }

    public final void a(boolean z) {
        if (z == this.a) {
            return;
        }
        this.a = z;
        if (z) {
            return;
        }
        this.b = SystemClock.elapsedRealtime();
    }
}
