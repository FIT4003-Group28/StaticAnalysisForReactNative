package defpackage;
/* compiled from: PG */
/* renamed from: bcob  reason: default package */
/* loaded from: classes3.dex */
final class bcob implements apnj {
    final /* synthetic */ bcoc a;

    public bcob(bcoc bcocVar) {
        this.a = bcocVar;
    }

    @Override // defpackage.apnj
    public final void a(boolean z, int i) {
        Runnable runnable = this.a.p;
        if (runnable != null && i == 4) {
            runnable.run();
            i = 4;
        }
        boolean z2 = false;
        if (z && i == 2) {
            z2 = true;
        }
        bcoc bcocVar = this.a;
        if (bcocVar.a != z2) {
            bcocVar.a = z2;
            cqkx.p(bcocVar);
        }
    }
}
