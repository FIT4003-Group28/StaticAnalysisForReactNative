package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amoj  reason: default package */
/* loaded from: classes.dex */
final class amoj extends amqu {
    @Override // defpackage.amqu
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
