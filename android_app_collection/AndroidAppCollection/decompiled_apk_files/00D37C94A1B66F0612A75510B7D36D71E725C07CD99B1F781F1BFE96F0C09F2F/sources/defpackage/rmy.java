package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: rmy  reason: default package */
/* loaded from: classes4.dex */
public final class rmy implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ rng e;

    public rmy(rng rngVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.e = rngVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rom o = this.e.w.o();
        AtomicReference atomicReference = this.a;
        String str = this.b;
        String str2 = this.c;
        boolean z = this.d;
        o.n();
        o.a();
        o.t(new roh(o, atomicReference, str, str2, o.e(false), z));
    }
}
