package defpackage;
/* compiled from: PG */
/* renamed from: aaud  reason: default package */
/* loaded from: classes.dex */
public final class aaud extends aaue {
    public String a;
    public int b;

    public aaud(aaqf aaqfVar, afvn afvnVar) {
        super(aaqfVar, afvnVar);
    }

    @Override // defpackage.aaue, defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa t = super.t();
        if (this.b == 2) {
            aopa createBuilder = asei.a.createBuilder();
            String str = this.a;
            createBuilder.copyOnWrite();
            asei aseiVar = (asei) createBuilder.instance;
            str.getClass();
            aseiVar.b = 1;
            aseiVar.c = str;
            t.copyOnWrite();
            asem asemVar = (asem) t.instance;
            asei aseiVar2 = (asei) createBuilder.mo39build();
            asem asemVar2 = asem.a;
            aseiVar2.getClass();
            asemVar.e = aseiVar2;
            asemVar.b |= 128;
        }
        if (this.b == 3) {
            aopa createBuilder2 = asek.a.createBuilder();
            String str2 = this.a;
            createBuilder2.copyOnWrite();
            asek asekVar = (asek) createBuilder2.instance;
            str2.getClass();
            asekVar.b = 1;
            asekVar.c = str2;
            t.copyOnWrite();
            asem asemVar3 = (asem) t.instance;
            asek asekVar2 = (asek) createBuilder2.mo39build();
            asem asemVar4 = asem.a;
            asekVar2.getClass();
            asemVar3.f = asekVar2;
            asemVar3.b |= 1024;
        }
        return t;
    }

    @Override // defpackage.aaue, defpackage.aapd
    public final void c() {
        super.c();
        zgh.m(this.a);
        boolean z = true;
        if (this.b == 1) {
            z = false;
        }
        aqxo.y(z);
    }
}
