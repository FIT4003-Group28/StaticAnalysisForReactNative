package defpackage;
/* compiled from: PG */
/* renamed from: acsa  reason: default package */
/* loaded from: classes.dex */
final class acsa implements Runnable {
    final /* synthetic */ arrk a;
    final /* synthetic */ acsb b;

    public acsa(acsb acsbVar, arrk arrkVar) {
        this.b = acsbVar;
        this.a = arrkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acsb acsbVar = this.b;
        acsc acscVar = acsbVar.b;
        acty.b(acscVar.b, acscVar.a, this.a, acsbVar.a);
    }
}
