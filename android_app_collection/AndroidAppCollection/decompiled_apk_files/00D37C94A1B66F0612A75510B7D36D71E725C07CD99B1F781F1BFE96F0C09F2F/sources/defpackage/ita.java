package defpackage;
/* compiled from: PG */
/* renamed from: ita  reason: default package */
/* loaded from: classes3.dex */
public final class ita implements aatg {
    private final axnm a;
    private final aadd b;

    public ita(axnm axnmVar, aadd aaddVar, aacz aaczVar) {
        this.a = axnmVar;
        this.b = aaddVar;
        if (!eog.av(aaczVar)) {
            axnmVar.get();
        }
    }

    @Override // defpackage.aatg
    public final void a(aatf aatfVar) {
        arhd a = this.b.a();
        if (a != null) {
            asxp asxpVar = a.e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if (!asxpVar.af) {
                return;
            }
            aopa createBuilder = arlm.a.createBuilder();
            int i = true != ((ehh) this.a.get()).b().i ? 3 : 2;
            createBuilder.copyOnWrite();
            arlm arlmVar = (arlm) createBuilder.instance;
            arlmVar.c = i - 1;
            arlmVar.b |= 1;
            arlm arlmVar2 = (arlm) createBuilder.mo39build();
            aopa createBuilder2 = arls.a.createBuilder();
            createBuilder2.copyOnWrite();
            arls arlsVar = (arls) createBuilder2.instance;
            arlmVar2.getClass();
            arlsVar.c = arlmVar2;
            arlsVar.b |= 2;
            aatfVar.x = (arls) createBuilder2.mo39build();
        }
    }
}
