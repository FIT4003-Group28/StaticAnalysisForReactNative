package defpackage;
/* compiled from: PG */
/* renamed from: vud  reason: default package */
/* loaded from: classes4.dex */
final class vud implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ vue b;

    public vud(vue vueVar, int i) {
        this.b = vueVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vue vueVar = this.b;
        if (vueVar.n != null) {
            vueVar.s(this.a);
        }
    }
}
