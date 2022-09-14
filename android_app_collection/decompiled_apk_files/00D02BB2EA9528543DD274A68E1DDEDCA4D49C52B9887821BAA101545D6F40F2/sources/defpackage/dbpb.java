package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dbpb  reason: default package */
/* loaded from: classes5.dex */
final class dbpb extends dbug {
    @Override // defpackage.dbug
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
