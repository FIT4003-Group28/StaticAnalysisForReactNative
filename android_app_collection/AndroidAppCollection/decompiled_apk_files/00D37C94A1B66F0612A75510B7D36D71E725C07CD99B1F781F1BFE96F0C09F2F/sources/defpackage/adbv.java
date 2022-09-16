package defpackage;
/* compiled from: PG */
/* renamed from: adbv  reason: default package */
/* loaded from: classes.dex */
public final class adbv implements adny {
    public final adoa a;
    private final tdb b;

    public adbv(adoa adoaVar, tdb tdbVar) {
        this.a = adoaVar;
        this.b = tdbVar;
    }

    public final void a(boolean z) {
        aopa createBuilder = atco.a.createBuilder();
        int i = true != z ? 2 : 4;
        createBuilder.copyOnWrite();
        atco atcoVar = (atco) createBuilder.instance;
        atcoVar.c = i - 1;
        atcoVar.b |= 1;
        this.b.b("/app/mdx", ((atco) createBuilder.mo39build()).toByteArray());
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        a(true);
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        a(false);
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
    }
}
