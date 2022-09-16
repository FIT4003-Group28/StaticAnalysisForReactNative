package defpackage;
/* compiled from: PG */
/* renamed from: acrv  reason: default package */
/* loaded from: classes.dex */
final class acrv implements Runnable {
    final /* synthetic */ arrk a;
    final /* synthetic */ acrw b;

    public acrv(acrw acrwVar, arrk arrkVar) {
        this.b = acrwVar;
        this.a = arrkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acrw acrwVar = this.b;
        acrx acrxVar = acrwVar.f;
        acty.b(acrxVar.b, acrxVar.a, this.a, acrwVar.e);
    }
}
