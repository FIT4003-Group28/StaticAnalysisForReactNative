package defpackage;
/* compiled from: PG */
/* renamed from: afhg  reason: default package */
/* loaded from: classes.dex */
final class afhg implements Runnable {
    final /* synthetic */ afhh a;

    public afhg(afhh afhhVar) {
        this.a = afhhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        afhh afhhVar = this.a;
        if (!afhhVar.i || (runnable = afhhVar.g) == null || afhhVar.h == null) {
            return;
        }
        runnable.run();
        this.a.h.postDelayed(this, 2000L);
    }
}
