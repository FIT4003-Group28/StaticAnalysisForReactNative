package defpackage;
/* compiled from: PG */
/* renamed from: bnak  reason: default package */
/* loaded from: classes3.dex */
public final class bnak extends befr<bnes> {
    public bnak(bnes bnesVar) {
        super(bnesVar, 2, 2);
    }

    @Override // defpackage.befz
    public final void a(cqiv cqivVar) {
        bnev a = ((bnes) this.a).a();
        if (!a.a().booleanValue()) {
            cqivVar.a(new bndb(), a.e());
            return;
        }
        cqivVar.a(new bnbn(), (bnes) this.a);
        cqivVar.a(new bncy(), a.c());
        cqivVar.f(new bnco(), a.d());
        cqivVar.a(new bndb(), a.e());
    }
}
