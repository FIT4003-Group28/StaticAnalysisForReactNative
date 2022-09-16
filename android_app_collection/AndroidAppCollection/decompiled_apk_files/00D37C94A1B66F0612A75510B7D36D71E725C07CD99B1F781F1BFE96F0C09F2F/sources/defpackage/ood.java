package defpackage;
/* compiled from: PG */
/* renamed from: ood  reason: default package */
/* loaded from: classes3.dex */
public final class ood implements abea {
    private final ony a;
    private final aacz b;

    public ood(aacz aaczVar, ony onyVar) {
        this.b = aaczVar;
        this.a = onyVar;
    }

    @Override // defpackage.abea
    public final void nq(abed abedVar) {
        if (!eog.bb(this.b)) {
            return;
        }
        aopa createBuilder = asgp.a.createBuilder();
        boolean g = this.a.g();
        createBuilder.copyOnWrite();
        asgp asgpVar = (asgp) createBuilder.instance;
        asgpVar.b |= 1;
        asgpVar.c = g;
        int a = this.a.a();
        createBuilder.copyOnWrite();
        asgp asgpVar2 = (asgp) createBuilder.instance;
        asgpVar2.b |= 2;
        asgpVar2.d = a;
        abedVar.t = (asgp) createBuilder.mo39build();
    }
}
