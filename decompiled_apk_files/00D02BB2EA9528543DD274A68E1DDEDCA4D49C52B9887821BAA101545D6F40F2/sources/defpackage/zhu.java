package defpackage;
/* compiled from: PG */
/* renamed from: zhu  reason: default package */
/* loaded from: classes7.dex */
final class zhu implements akey {
    final /* synthetic */ Runnable a;

    public zhu(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        this.a.run();
    }

    @Override // defpackage.akey
    public final void b() {
    }
}
