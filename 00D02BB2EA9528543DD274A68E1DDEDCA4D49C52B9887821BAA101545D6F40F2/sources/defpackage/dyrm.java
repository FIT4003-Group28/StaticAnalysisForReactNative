package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyrm  reason: default package */
/* loaded from: classes6.dex */
public final class dyrm implements Runnable {
    final /* synthetic */ dyro a;

    public dyrm(dyro dyroVar) {
        this.a = dyroVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dyfo b = this.a.c.b();
        try {
            dyro dyroVar = this.a;
            dyex d = dyroVar.f.d(dyroVar.d, dyroVar.e);
            this.a.c.c(b);
            dyro dyroVar2 = this.a;
            synchronized (dyroVar2) {
                if (dyroVar2.b == null) {
                    dyroVar2.i(d);
                    dyroVar2.h();
                }
            }
            dyro dyroVar3 = this.a;
            dyroVar3.f.b.m.execute(new dyrn(dyroVar3));
        } catch (Throwable th) {
            this.a.c.c(b);
            throw th;
        }
    }
}
