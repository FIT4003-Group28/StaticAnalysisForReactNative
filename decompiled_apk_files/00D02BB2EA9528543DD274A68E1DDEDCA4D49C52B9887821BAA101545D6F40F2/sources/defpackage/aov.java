package defpackage;
/* compiled from: PG */
/* renamed from: aov  reason: default package */
/* loaded from: classes2.dex */
final class aov implements Runnable {
    final /* synthetic */ aoz a;

    public aov(aoz aozVar) {
        this.a = aozVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aoz aozVar = this.a;
        if (aozVar.b == 0) {
            aozVar.c = true;
            aozVar.e.e(i.ON_PAUSE);
        }
        this.a.d();
    }
}
