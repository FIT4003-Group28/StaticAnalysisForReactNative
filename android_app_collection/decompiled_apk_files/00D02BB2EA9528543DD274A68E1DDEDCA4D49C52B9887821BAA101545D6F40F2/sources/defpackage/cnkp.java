package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: cnkp  reason: default package */
/* loaded from: classes.dex */
public final class cnkp {
    public final cnkq a;
    final /* synthetic */ cnkq b;
    private long c;

    public cnkp(cnkq cnkqVar, cnkq cnkqVar2) {
        this.b = cnkqVar;
        this.a = cnkqVar2;
        a();
    }

    public final void a() {
        this.c = SystemClock.elapsedRealtime();
    }

    public final long b() {
        return SystemClock.elapsedRealtime() - this.c;
    }
}
