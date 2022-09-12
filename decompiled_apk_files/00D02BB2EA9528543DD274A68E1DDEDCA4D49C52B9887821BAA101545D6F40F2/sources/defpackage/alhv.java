package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alhv  reason: default package */
/* loaded from: classes.dex */
public final class alhv {
    @dzsi
    public alht b;
    public final List<alht> a = new ArrayList();
    private final Handler c = new alhs(this, Looper.getMainLooper());

    @Deprecated
    public static alhv a() {
        return ((alhu) btsr.a(alhu.class)).sr();
    }

    public final synchronized void b(alht alhtVar) {
        this.a.add(alhtVar);
    }

    public final synchronized void c(alht alhtVar) {
        this.a.remove(alhtVar);
    }

    public final synchronized void d(alht alhtVar) {
        dbsk.m(this.b == null, "defaultMapTapEventListener is already set.");
        this.b = alhtVar;
    }

    public final synchronized void e() {
        this.b = null;
    }

    public final void f(alhr alhrVar) {
        this.c.obtainMessage(0, alhrVar).sendToTarget();
    }
}
