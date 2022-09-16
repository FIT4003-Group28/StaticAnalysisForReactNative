package defpackage;
/* compiled from: PG */
/* renamed from: aflz  reason: default package */
/* loaded from: classes2.dex */
final class aflz implements Runnable {
    final /* synthetic */ dvzj a;
    final /* synthetic */ afma b;

    public aflz(afma afmaVar, dvzj dvzjVar) {
        this.b = afmaVar;
        this.a = dvzjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.a(ckls.EXTERNAL_INVOCATION);
        this.b.a.a().a(new bgej(this.a, null).a, new afly(), bvrj.UI_THREAD);
    }
}
