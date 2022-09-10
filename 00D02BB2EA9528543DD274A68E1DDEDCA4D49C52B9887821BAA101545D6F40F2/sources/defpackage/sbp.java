package defpackage;
/* compiled from: PG */
/* renamed from: sbp  reason: default package */
/* loaded from: classes7.dex */
final class sbp implements set {
    final /* synthetic */ sbs a;

    public sbp(sbs sbsVar) {
        this.a = sbsVar;
    }

    @Override // defpackage.set
    public final void a(boolean z) {
        sbs sbsVar = this.a;
        boolean h = sht.h(sbsVar.a.k().b(), this.a.b.k().b());
        Boolean b = sbsVar.b.b();
        Boolean valueOf = Boolean.valueOf(h);
        if (!b.equals(valueOf)) {
            sbsVar.b.j(valueOf);
            cqkx.p(sbsVar);
        }
        sbs sbsVar2 = this.a;
        sbsVar2.e = sht.u(sbsVar2.a.k().b());
        sbs sbsVar3 = this.a;
        sbsVar3.f = sht.u(sbsVar3.b.k().b());
    }
}
