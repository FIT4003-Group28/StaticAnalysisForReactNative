package defpackage;
/* compiled from: PG */
/* renamed from: kkf  reason: default package */
/* loaded from: classes3.dex */
final class kkf implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ kkh b;
    final /* synthetic */ int c;

    public kkf(kkh kkhVar, int i, boolean z) {
        this.b = kkhVar;
        this.c = i;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kkg kkgVar;
        byte[] bArr;
        this.b.a.r(this.c, this.a);
        kkh kkhVar = this.b;
        int i = this.c;
        if (!kkhVar.f || (kkgVar = kkhVar.i) == null || (bArr = kkgVar.b) == null || bArr.length <= 0 || i == 3 || i == 1) {
            return;
        }
        kkhVar.f = false;
        kkhVar.b.u(new acte(bArr), null);
    }
}
