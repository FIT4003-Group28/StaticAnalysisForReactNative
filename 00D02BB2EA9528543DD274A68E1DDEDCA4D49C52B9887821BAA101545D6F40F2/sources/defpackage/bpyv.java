package defpackage;
/* compiled from: PG */
/* renamed from: bpyv  reason: default package */
/* loaded from: classes4.dex */
final class bpyv implements Runnable {
    final /* synthetic */ bpyx a;

    public bpyv(bpyx bpyxVar) {
        this.a = bpyxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bpzj bpzjVar = this.a.ah;
        akqq a = bpzjVar.d.a();
        if (a != null) {
            bpzjVar.g.c(a);
            bpzjVar.e.b(new bpzg(bpzjVar, a), bvrj.UI_THREAD);
        }
        this.a.aj.d();
        this.a.ad.b(this);
    }
}
