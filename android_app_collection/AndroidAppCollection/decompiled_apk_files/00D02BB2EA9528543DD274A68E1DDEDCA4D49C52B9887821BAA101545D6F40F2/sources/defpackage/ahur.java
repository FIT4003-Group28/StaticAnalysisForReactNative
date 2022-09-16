package defpackage;
/* compiled from: PG */
/* renamed from: ahur  reason: default package */
/* loaded from: classes2.dex */
final class ahur implements akey {
    final /* synthetic */ ahwe a;
    final /* synthetic */ ahuu b;

    public ahur(ahuu ahuuVar, ahwe ahweVar) {
        this.b = ahuuVar;
        this.a = ahweVar;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        bvrj.UI_THREAD.c();
        this.b.e.p(true);
        this.b.r(this.a);
    }

    @Override // defpackage.akey
    public final void b() {
        bvrj.UI_THREAD.c();
        this.b.e.p(false);
        this.b.r(this.a);
    }
}
