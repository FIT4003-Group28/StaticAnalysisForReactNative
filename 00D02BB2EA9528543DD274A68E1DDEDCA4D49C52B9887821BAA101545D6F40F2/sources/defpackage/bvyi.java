package defpackage;
/* compiled from: PG */
/* renamed from: bvyi  reason: default package */
/* loaded from: classes4.dex */
public final class bvyi implements dbrn<alax, alax> {
    final /* synthetic */ bvyk a;
    private final dehn<alax> b;

    public bvyi(bvyk bvykVar, dehn<alax> dehnVar) {
        this.a = bvykVar;
        this.b = dehnVar;
    }

    @Override // defpackage.dbrn
    @dzsi
    public final /* bridge */ /* synthetic */ alax a(alax alaxVar) {
        alax alaxVar2 = alaxVar;
        bvrj.UI_THREAD.c();
        dehn<alax> dehnVar = this.b;
        bvyk bvykVar = this.a;
        if (dehnVar != bvykVar.f) {
            alaxVar2.c();
            return null;
        } else if (!bvykVar.i) {
            return alaxVar2;
        } else {
            alaxVar2.a();
            return alaxVar2;
        }
    }
}
