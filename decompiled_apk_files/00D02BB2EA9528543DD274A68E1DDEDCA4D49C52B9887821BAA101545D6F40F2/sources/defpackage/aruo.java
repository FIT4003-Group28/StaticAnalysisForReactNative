package defpackage;
/* compiled from: PG */
/* renamed from: aruo  reason: default package */
/* loaded from: classes2.dex */
final class aruo implements arus {
    final /* synthetic */ arup a;
    final /* synthetic */ arxm b;

    public aruo(arup arupVar, arxm arxmVar) {
        this.a = arupVar;
        this.b = arxmVar;
    }

    @Override // defpackage.arus
    public final void a(arut arutVar) {
        if (this.a.b.getAndSet(true)) {
            return;
        }
        this.a.a.b();
        this.b.a();
    }

    @Override // defpackage.arus
    public final void b() {
        if (this.a.b.getAndSet(true)) {
            return;
        }
        this.a.a.b();
        this.b.b();
    }
}
