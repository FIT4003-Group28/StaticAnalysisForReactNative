package defpackage;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aytq  reason: default package */
/* loaded from: classes2.dex */
final class aytq implements Runnable {
    final aypf a;
    final ayns b;
    final /* synthetic */ ayts c;
    private final AtomicBoolean d;

    public aytq(ayts aytsVar, AtomicBoolean atomicBoolean, aypf aypfVar, ayns aynsVar) {
        this.c = aytsVar;
        this.d = atomicBoolean;
        this.a = aypfVar;
        this.b = aynsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.compareAndSet(false, true)) {
            this.a.c();
            ayns aynsVar = this.b;
            ayts aytsVar = this.c;
            aynsVar.b(new TimeoutException(azom.c(aytsVar.b, aytsVar.c)));
        }
    }
}
