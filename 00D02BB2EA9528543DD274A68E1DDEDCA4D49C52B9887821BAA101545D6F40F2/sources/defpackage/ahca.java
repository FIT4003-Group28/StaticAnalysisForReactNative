package defpackage;
/* compiled from: PG */
/* renamed from: ahca  reason: default package */
/* loaded from: classes2.dex */
final class ahca implements degu<diqz> {
    final /* synthetic */ ahcc a;

    public ahca(ahcc ahccVar) {
        this.a = ahccVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.i(agyx.ERROR);
        cqkx.p(this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(diqz diqzVar) {
        diqz diqzVar2 = diqzVar;
        ahcc ahccVar = this.a;
        ahccVar.e = ahccVar.a.a(ahccVar.d, dkzq.POSITIVE, diqzVar2.d);
        ahcc ahccVar2 = this.a;
        ahccVar2.f = ahccVar2.a.a(ahccVar2.d, dkzq.NEGATIVE, diqzVar2.e);
        this.a.i(agyx.LOADED);
        cqkx.p(this.a);
    }
}
