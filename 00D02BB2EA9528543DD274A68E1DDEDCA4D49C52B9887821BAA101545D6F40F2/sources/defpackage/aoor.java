package defpackage;
/* compiled from: PG */
/* renamed from: aoor  reason: default package */
/* loaded from: classes2.dex */
final class aoor implements aoqa {
    final /* synthetic */ aoou a;
    private boolean b;

    public aoor(aoou aoouVar) {
        this.a = aoouVar;
    }

    @Override // defpackage.aoqa
    public final void a() {
        aoou aoouVar = this.a;
        if (!aoouVar.aD) {
            return;
        }
        if (this.b != aoouVar.ao.h().booleanValue()) {
            this.a.g();
            cqkx.p(this.a.ao);
            this.b = !this.b;
        }
        aoou aoouVar2 = this.a;
        aoouVar2.af.a(aoouVar2.ao.b());
    }
}
