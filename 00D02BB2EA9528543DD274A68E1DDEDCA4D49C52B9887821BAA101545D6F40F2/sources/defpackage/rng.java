package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rng  reason: default package */
/* loaded from: classes7.dex */
public final class rng implements rnh {
    final /* synthetic */ rni a;
    private final gfq b;

    public rng(rni rniVar, gfq gfqVar) {
        this.a = rniVar;
        this.b = gfqVar;
    }

    @Override // defpackage.rnh
    public final void a(rzp rzpVar) {
        rnv.a();
        if (this.b.e(rnz.class)) {
            this.a.a.g().g(this.b.h(this.b.f(rnz.class)), 0);
            return;
        }
        rni rniVar = this.a;
        rnz rnzVar = new rnz();
        rnzVar.B(rzpVar.i());
        rniVar.a(rnzVar);
    }
}
