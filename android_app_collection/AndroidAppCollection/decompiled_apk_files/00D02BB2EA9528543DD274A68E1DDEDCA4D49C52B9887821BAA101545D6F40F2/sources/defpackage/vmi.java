package defpackage;
/* compiled from: PG */
/* renamed from: vmi  reason: default package */
/* loaded from: classes7.dex */
public final class vmi implements degu<Boolean> {
    final /* synthetic */ Runnable a;
    final /* synthetic */ vml b;

    public vmi(vml vmlVar, Runnable runnable) {
        this.b = vmlVar;
        this.a = runnable;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 == null || !bool2.booleanValue()) {
            return;
        }
        this.b.f.b(this.a, bvrj.UI_THREAD);
    }
}
