package defpackage;
/* compiled from: PG */
/* renamed from: bpci  reason: default package */
/* loaded from: classes3.dex */
final class bpci implements Runnable {
    final /* synthetic */ bpcj a;

    public bpci(bpcj bpcjVar) {
        this.a = bpcjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bpcq bpcqVar = this.a.a;
        if (bpcqVar.f.aD) {
            bpcqVar.k.a();
            this.a.a.f.q();
        }
    }
}
