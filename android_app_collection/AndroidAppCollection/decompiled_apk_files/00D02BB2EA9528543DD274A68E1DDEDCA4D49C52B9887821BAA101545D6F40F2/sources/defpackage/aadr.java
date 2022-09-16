package defpackage;
/* compiled from: PG */
/* renamed from: aadr  reason: default package */
/* loaded from: classes2.dex */
final class aadr implements aacf {
    final /* synthetic */ aadt a;

    public aadr(aadt aadtVar) {
        this.a = aadtVar;
    }

    @Override // defpackage.aacf
    public final void a(aaco aacoVar) {
        this.a.b(aacoVar);
        aaaz aaazVar = (aaaz) this.a.d;
        if (aaazVar.a == null) {
            return;
        }
        aaazVar.i().al.add(aacoVar);
        aadd aaddVar = aaazVar.i().au;
        dbsk.s(aaddVar);
        aaddVar.a.k(aacoVar);
        cqkx.p(aaddVar);
        aacc aaccVar = aaazVar.i().av;
        dbsk.s(aaccVar);
        aaccVar.a(aacoVar);
        aaar aaarVar = aaazVar.i().ar;
        dbsk.s(aaarVar);
        aaarVar.a(aacoVar);
    }
}
