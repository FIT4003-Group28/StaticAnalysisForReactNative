package defpackage;
/* compiled from: PG */
/* renamed from: vuc  reason: default package */
/* loaded from: classes4.dex */
final class vuc implements Runnable {
    final /* synthetic */ vvg a;
    final /* synthetic */ boolean b;
    final /* synthetic */ vue c;

    public vuc(vue vueVar, vvg vvgVar, boolean z) {
        this.c = vueVar;
        this.a = vvgVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.q(this.a, this.b);
        this.a.d();
    }
}
