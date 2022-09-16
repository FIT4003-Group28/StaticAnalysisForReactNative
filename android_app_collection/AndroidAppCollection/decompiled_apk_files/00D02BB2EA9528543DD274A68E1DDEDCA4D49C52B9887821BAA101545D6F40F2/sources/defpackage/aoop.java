package defpackage;
/* compiled from: PG */
/* renamed from: aoop  reason: default package */
/* loaded from: classes2.dex */
final class aoop implements egq {
    final /* synthetic */ aoou a;

    public aoop(aoou aoouVar) {
        this.a = aoouVar;
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        aotw aotwVar = this.a.f;
        if (!aotwVar.j) {
            aotwVar.j = true;
            aotwVar.c.a().ab(aotwVar.f);
            if (!aotwVar.k.a()) {
                aotwVar.a(aotwVar.c.a().n().i);
            }
            if (aotwVar.b.a()) {
                aotwVar.b();
            } else {
                aotwVar.d(true);
            }
            aotwVar.f();
        }
        if (eguVar.j != jjn.FULLY_EXPANDED) {
            aoou aoouVar = this.a;
            aoouVar.af.a(aoouVar.ao.b());
        }
    }
}
