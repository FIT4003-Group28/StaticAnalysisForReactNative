package defpackage;
/* compiled from: PG */
/* renamed from: ayiu  reason: default package */
/* loaded from: classes2.dex */
final class ayiu implements Runnable {
    final /* synthetic */ ayah a;
    final /* synthetic */ axyt b;
    final /* synthetic */ ayiv c;

    public ayiu(ayiv ayivVar, ayah ayahVar, axyt axytVar) {
        this.c = ayivVar;
        this.a = ayahVar;
        this.b = axytVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayiv ayivVar = this.c;
        ayji ayjiVar = ayivVar.c;
        if (ayivVar != ayjiVar.s) {
            return;
        }
        ayjiVar.m(this.a);
        if (this.b == axyt.SHUTDOWN) {
            return;
        }
        this.c.c.G.b(2, "Entering {0} state with picker: {1}", this.b, this.a);
        this.c.c.q.a(this.b);
    }
}
