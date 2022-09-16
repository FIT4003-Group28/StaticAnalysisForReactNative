package defpackage;
/* compiled from: PG */
/* renamed from: ole  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ole implements ayqe {
    public final /* synthetic */ ayqe a;
    public final /* synthetic */ ayqe b;
    private final /* synthetic */ int c;

    public /* synthetic */ ole(ayqe ayqeVar, ayqe ayqeVar2) {
        this.a = ayqeVar;
        this.b = ayqeVar2;
    }

    public /* synthetic */ ole(ayqe ayqeVar, ayqe ayqeVar2, int i) {
        this.c = i;
        this.a = ayqeVar;
        this.b = ayqeVar2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        if (this.c == 0) {
            ayoi V = ((ayoi) obj).V(new ole(this.a, this.b, 1));
            olg olgVar = olg.a;
            ayqw ayqwVar = ayqw.a;
            ayrd.b(ayqwVar, "collectionSupplier is null");
            azet azetVar = new azet(V, olgVar, ayqwVar);
            azqc.i();
            amum h = amup.h();
            return (amup) azetVar.am(ayrb.f(h), zhq.b).E(olg.d).U();
        }
        return ampr.a(this.a.a(obj), this.b.a(obj));
    }
}
