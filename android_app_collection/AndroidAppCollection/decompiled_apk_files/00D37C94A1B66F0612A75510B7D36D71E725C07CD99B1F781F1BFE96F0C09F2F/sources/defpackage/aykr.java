package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aykr  reason: default package */
/* loaded from: classes2.dex */
final class aykr implements Runnable {
    final /* synthetic */ ayks a;
    private final /* synthetic */ int b;

    public aykr(ayks ayksVar) {
        this.a = ayksVar;
    }

    public aykr(ayks ayksVar, int i) {
        this.b = i;
        this.a = ayksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            ayks ayksVar = this.a;
            ayksVar.b.execute(new aykr(ayksVar, 1));
            return;
        }
        ayks ayksVar2 = this.a;
        if (!ayksVar2.e) {
            ayksVar2.f = null;
            return;
        }
        long a = ayksVar2.a();
        ayks ayksVar3 = this.a;
        if (ayksVar3.d - a > 0) {
            ayksVar3.f = ayksVar3.a.schedule(new aykr(ayksVar3), this.a.d - a, TimeUnit.NANOSECONDS);
            return;
        }
        ayksVar3.e = false;
        ayksVar3.f = null;
        ayksVar3.c.run();
    }
}
