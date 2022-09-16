package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: aeuc  reason: default package */
/* loaded from: classes.dex */
public final class aeuc {
    final aeub a;
    private Object b = null;
    private long c = -1000;

    public aeuc(aeub aeubVar) {
        this.a = aeubVar;
    }

    public final synchronized void a(Object obj, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b != obj || elapsedRealtime - this.c >= 1000) {
            this.a.i("lcdi", str);
            this.b = obj;
            this.c = elapsedRealtime;
        }
    }
}
