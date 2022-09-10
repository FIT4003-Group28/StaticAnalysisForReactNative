package defpackage;
/* compiled from: PG */
/* renamed from: vmk  reason: default package */
/* loaded from: classes7.dex */
final class vmk implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ vml b;

    public vmk(vml vmlVar, int i) {
        this.b = vmlVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vml vmlVar = this.b;
        if (((efh) vmlVar.b).b) {
            cztq a = cztt.a(vmlVar.g);
            a.c = this.b.a.getString(this.a);
            a.d(cztr.LONG);
            a.c();
        }
    }
}
