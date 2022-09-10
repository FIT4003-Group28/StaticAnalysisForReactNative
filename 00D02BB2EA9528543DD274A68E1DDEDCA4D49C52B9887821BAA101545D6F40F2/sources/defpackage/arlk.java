package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: arlk  reason: default package */
/* loaded from: classes2.dex */
public final class arlk {
    public final ff a;
    public final ScheduledExecutorService b;
    public final dxio<dbsg<arkd>> c;
    public final arla d;
    public final dnl e;
    public final Object f = new Object();
    @dzsi
    public dzak g = null;

    public arlk(ff ffVar, dehq dehqVar, dxio<dbsg<arkd>> dxioVar, arla arlaVar, dnl dnlVar) {
        this.a = ffVar;
        this.b = dehqVar;
        this.c = dxioVar;
        this.d = arlaVar;
        this.e = dnlVar;
    }

    public final void a() {
        synchronized (this.f) {
            dnl dnlVar = this.e;
            if (dnlVar.e) {
                dnlVar.b();
                dzak dzakVar = this.g;
                dbsk.s(dzakVar);
                dzbd.e((AtomicReference) dzakVar);
                this.g = null;
            }
        }
    }
}
