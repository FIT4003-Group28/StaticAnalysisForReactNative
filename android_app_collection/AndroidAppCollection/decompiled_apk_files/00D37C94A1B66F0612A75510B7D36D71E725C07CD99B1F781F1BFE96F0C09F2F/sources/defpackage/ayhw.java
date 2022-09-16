package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayhw  reason: default package */
/* loaded from: classes2.dex */
final class ayhw implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayhy b;

    public ayhw(ayhy ayhyVar, Status status) {
        this.b = ayhyVar;
        this.a = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.c.p.a == axyt.SHUTDOWN) {
            return;
        }
        ayjt ayjtVar = this.b.c.o;
        ayhy ayhyVar = this.b;
        ayez ayezVar = ayhyVar.a;
        if (ayjtVar == ayezVar) {
            ayhyVar.c.o = null;
            this.b.c.f.b();
            this.b.c.b(axyt.IDLE);
            return;
        }
        ayia ayiaVar = ayhyVar.c;
        if (ayiaVar.n != ayezVar) {
            return;
        }
        boolean z = false;
        aqxo.B(ayiaVar.p.a == axyt.CONNECTING, "Expected state is CONNECTING, actual state is %s", this.b.c.p.a);
        ayhv ayhvVar = this.b.c.f;
        int i = ayhvVar.c + 1;
        ayhvVar.c = i;
        if (i >= ((axzc) ayhvVar.a.get(ayhvVar.b)).b.size()) {
            ayhvVar.b++;
            ayhvVar.c = 0;
        }
        ayhv ayhvVar2 = this.b.c.f;
        if (ayhvVar2.b >= ayhvVar2.a.size()) {
            this.b.c.n = null;
            this.b.c.f.b();
            ayia ayiaVar2 = this.b.c;
            Status status = this.a;
            ayiaVar2.e.d();
            aqxo.q(!status.f(), "The error status must not be OK");
            ayiaVar2.d(new axyu(axyt.TRANSIENT_FAILURE, status));
            if (ayiaVar2.r == null) {
                ayiaVar2.r = bapv.k();
            }
            long a = ayiaVar2.r.a() - ayiaVar2.h.a(TimeUnit.NANOSECONDS);
            ayiaVar2.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", ayia.k(status), Long.valueOf(a));
            if (ayiaVar2.i == null) {
                z = true;
            }
            aqxo.z(z, "previous reconnectTask is not done");
            ayiaVar2.i = ayiaVar2.e.a(new ayhm(ayiaVar2, 1), a, TimeUnit.NANOSECONDS, ayiaVar2.b);
            return;
        }
        this.b.c.h();
    }
}
