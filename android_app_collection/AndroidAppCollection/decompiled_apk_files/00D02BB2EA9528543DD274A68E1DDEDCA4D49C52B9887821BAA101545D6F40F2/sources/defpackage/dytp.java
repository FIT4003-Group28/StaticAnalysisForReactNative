package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dytp  reason: default package */
/* loaded from: classes6.dex */
final class dytp implements Runnable {
    final /* synthetic */ dytr a;

    public dytp(dytr dytrVar) {
        this.a = dytrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dytr dytrVar = this.a;
        if (!dytrVar.e) {
            dytrVar.f = null;
            return;
        }
        long a = dytrVar.a();
        dytr dytrVar2 = this.a;
        if (dytrVar2.d - a > 0) {
            dytrVar2.f = dytrVar2.a.schedule(new dytq(dytrVar2), this.a.d - a, TimeUnit.NANOSECONDS);
            return;
        }
        dytrVar2.e = false;
        dytrVar2.f = null;
        dytrVar2.c.run();
    }
}
