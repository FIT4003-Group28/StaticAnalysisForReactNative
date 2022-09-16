package defpackage;
/* compiled from: PG */
/* renamed from: aks  reason: default package */
/* loaded from: classes.dex */
final class aks implements Runnable {
    final /* synthetic */ ale a;

    public aks(ale aleVar) {
        this.a = aleVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gt gtVar = this.a.a;
        if (gtVar != null) {
            gtVar.e();
        }
    }
}
