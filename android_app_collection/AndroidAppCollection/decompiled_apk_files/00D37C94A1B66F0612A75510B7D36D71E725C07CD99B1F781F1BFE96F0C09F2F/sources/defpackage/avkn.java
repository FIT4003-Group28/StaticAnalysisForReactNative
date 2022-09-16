package defpackage;
/* compiled from: PG */
/* renamed from: avkn  reason: default package */
/* loaded from: classes2.dex */
public final class avkn extends abga {
    public final aopa a;

    private avkn() {
        avkq avkqVar = avkq.a;
        throw null;
    }

    public avkn(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.abga
    public final /* bridge */ /* synthetic */ aajj a(aajl aajlVar) {
        return new avkp((avkq) this.a.mo39build(), aajlVar);
    }

    public final void b(avkl avklVar) {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        avkq avkqVar = (avkq) aopaVar.instance;
        avkq avkqVar2 = avkq.a;
        avkqVar.e = avklVar.i;
        avkqVar.c |= 2;
    }
}
