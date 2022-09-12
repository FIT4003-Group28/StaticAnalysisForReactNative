package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: dbpc  reason: default package */
/* loaded from: classes5.dex */
public final class dbpc {
    public static final dbug a;

    static {
        dbug dbpbVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            dbpbVar = new dbpa();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            dbpbVar = new dbpb();
        }
        a = dbpbVar;
    }
}
