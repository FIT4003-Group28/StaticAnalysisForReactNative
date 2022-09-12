package defpackage;
/* compiled from: PG */
/* renamed from: abbc  reason: default package */
/* loaded from: classes2.dex */
final class abbc extends akvn<aktj<?, ?>> {
    final /* synthetic */ bvrb a;
    final /* synthetic */ Runnable b;

    public abbc(bvrb bvrbVar, Runnable runnable) {
        this.a = bvrbVar;
        this.b = runnable;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        this.a.b(this.b, bvrj.UI_THREAD);
    }
}
