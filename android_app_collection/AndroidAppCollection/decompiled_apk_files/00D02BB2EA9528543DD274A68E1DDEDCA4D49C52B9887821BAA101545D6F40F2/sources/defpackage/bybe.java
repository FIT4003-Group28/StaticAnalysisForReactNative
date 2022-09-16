package defpackage;
/* compiled from: PG */
/* renamed from: bybe  reason: default package */
/* loaded from: classes4.dex */
final class bybe extends dbus<String, dehn<amfu>> {
    final /* synthetic */ bybf a;

    public bybe(bybf bybfVar) {
        this.a = bybfVar;
    }

    @Override // defpackage.dbus
    public final /* bridge */ /* synthetic */ dehn<amfu> b(String str) {
        deig d = deig.d();
        this.a.d.b(new bybc(this, str, d), bvrj.BACKGROUND_THREADPOOL);
        return d;
    }

    public final void c(String str) {
        this.a.d.b(new bybd(this, str), bvrj.UI_THREAD);
    }
}
