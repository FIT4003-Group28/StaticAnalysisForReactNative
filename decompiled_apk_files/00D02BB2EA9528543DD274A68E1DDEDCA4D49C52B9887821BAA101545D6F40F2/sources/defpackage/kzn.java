package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kzn  reason: default package */
/* loaded from: classes7.dex */
public final class kzn implements ntq {
    final /* synthetic */ kzt a;

    public kzn(kzt kztVar) {
        this.a = kztVar;
    }

    @Override // defpackage.ntq
    public final void a(boolean z) {
        if (z) {
            this.a.g.d();
            this.a.c.d.cancel();
            this.a.c.e.start();
            kzt kztVar = this.a;
            kztVar.q.b(kztVar.A);
        } else {
            this.a.c.e.cancel();
            this.a.c.d.start();
            this.a.q.b(null);
        }
        this.a.g.b.f(z);
    }
}
