package defpackage;
/* compiled from: PG */
/* renamed from: bmzu  reason: default package */
/* loaded from: classes3.dex */
public final class bmzu implements bzpu {
    final bmzo a;
    final /* synthetic */ bmzv b;

    public bmzu(bmzv bmzvVar, bmzo bmzoVar) {
        this.b = bmzvVar;
        this.a = bmzoVar;
    }

    @Override // defpackage.bzpu
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.bzpu
    public final void b() {
        bmzv bmzvVar = this.b;
        bmzd bmzdVar = new bmzd(bmzvVar.c, bmzvVar.d, this.a);
        bmzt bmztVar = new bmzt(bmzdVar);
        this.a.k(bmztVar);
        this.a.j(bmztVar);
        bmzdVar.show();
    }
}
