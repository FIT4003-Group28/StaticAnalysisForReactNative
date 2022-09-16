package defpackage;
/* compiled from: PG */
/* renamed from: avip  reason: default package */
/* loaded from: classes2.dex */
public final class avip extends abga {
    private final aopa a;

    private avip() {
        avis avisVar = avis.a;
        throw null;
    }

    public avip(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.abga
    public final /* bridge */ /* synthetic */ aajj a(aajl aajlVar) {
        return c();
    }

    public final void b(aviu aviuVar) {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        avis avisVar = (avis) aopaVar.instance;
        avis avisVar2 = avis.a;
        aviuVar.getClass();
        avisVar.d = aviuVar;
        avisVar.b |= 2;
    }

    public final avir c() {
        return new avir((avis) this.a.mo39build());
    }
}
