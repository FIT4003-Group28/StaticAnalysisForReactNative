package defpackage;
/* compiled from: PG */
/* renamed from: aauc  reason: default package */
/* loaded from: classes.dex */
public final class aauc extends aaue {
    public String a;

    public aauc(aaqf aaqfVar, afvn afvnVar) {
        super(aaqfVar, afvnVar);
    }

    @Override // defpackage.aaue, defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa t = super.t();
        aopa createBuilder = asel.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asel aselVar = (asel) createBuilder.instance;
        str.getClass();
        aselVar.b |= 1;
        aselVar.c = str;
        t.copyOnWrite();
        asem asemVar = (asem) t.instance;
        asel aselVar2 = (asel) createBuilder.mo39build();
        asem asemVar2 = asem.a;
        aselVar2.getClass();
        asemVar.g = aselVar2;
        asemVar.b |= 16384;
        return t;
    }

    @Override // defpackage.aaue, defpackage.aapd
    public final void c() {
        super.c();
        zgh.m(this.a);
    }
}
