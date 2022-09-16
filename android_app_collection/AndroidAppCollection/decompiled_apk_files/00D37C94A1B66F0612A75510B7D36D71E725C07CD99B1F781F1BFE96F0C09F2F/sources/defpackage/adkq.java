package defpackage;
/* compiled from: PG */
/* renamed from: adkq  reason: default package */
/* loaded from: classes.dex */
public final class adkq implements airt {
    final /* synthetic */ adkr a;
    private final /* synthetic */ int b;

    public adkq(adkr adkrVar) {
        this.a = adkrVar;
    }

    public adkq(adkr adkrVar, int i) {
        this.b = i;
        this.a = adkrVar;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return this.b != 0 ? new aypg[]{airwVar.G().d.Z(new ayqb(null) { // from class: adko
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                adkq adkqVar = adkq.this;
                int i = adkr.i;
                adkqVar.a.b = (ahhx) obj;
            }
        })} : new aypg[]{airwVar.ao().Z(new adkp(this)), airwVar.al().Z(new adkp(this, 1))};
    }
}
