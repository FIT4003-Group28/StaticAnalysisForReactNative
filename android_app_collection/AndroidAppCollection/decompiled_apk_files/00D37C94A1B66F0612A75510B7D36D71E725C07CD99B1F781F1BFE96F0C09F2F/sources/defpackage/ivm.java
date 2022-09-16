package defpackage;
/* compiled from: PG */
/* renamed from: ivm  reason: default package */
/* loaded from: classes3.dex */
final class ivm implements akev {
    final /* synthetic */ Runnable a;
    final /* synthetic */ ivn b;

    public ivm(ivn ivnVar, Runnable runnable) {
        this.b = ivnVar;
        this.a = runnable;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akff akffVar = (akff) obj;
        this.a.run();
        this.b.d = null;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        ivn ivnVar = this.b;
        ivnVar.b.b(ivnVar.c.h);
        this.b.d = (akff) obj;
    }
}
