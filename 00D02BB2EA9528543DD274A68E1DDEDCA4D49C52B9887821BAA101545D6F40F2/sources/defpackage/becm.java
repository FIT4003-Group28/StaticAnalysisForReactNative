package defpackage;
/* compiled from: PG */
/* renamed from: becm  reason: default package */
/* loaded from: classes3.dex */
public final class becm extends bvxb<dfuy, dfva> {
    public final gga a;
    public final begg b;
    public final apyz c;
    public final bkgz d;
    public boolean e = false;

    public becm(gga ggaVar, begg beggVar, apyz apyzVar, bkgz bkgzVar) {
        this.a = ggaVar;
        this.b = beggVar;
        this.c = apyzVar;
        this.d = bkgzVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "placeaction.easc";
    }

    @Override // defpackage.bvxb
    @dzsi
    protected final /* bridge */ /* synthetic */ dfva e(dfuy dfuyVar) {
        final dfuy dfuyVar2 = dfuyVar;
        this.a.runOnUiThread(new Runnable(this, dfuyVar2) { // from class: becl
            private final becm a;
            private final dfuy b;

            {
                this.a = this;
                this.b = dfuyVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                becm becmVar = this.a;
                dfuy dfuyVar3 = this.b;
                becmVar.a.g().f();
                if (becmVar.e) {
                    ilo iloVar = (ilo) bwrs.b(becmVar.b.e());
                    if (iloVar == null) {
                        return;
                    }
                    becmVar.c.m(iloVar, apzb.CHATTY_POST);
                } else if (becmVar.d.a()) {
                    becmVar.b.B(dfuyVar3.a);
                } else {
                    becmVar.b.t();
                }
            }
        });
        return dfva.a;
    }

    @Override // defpackage.bvxb
    protected final /* bridge */ /* synthetic */ dfuy j(byte[] bArr) {
        return (dfuy) dsqw.cq(dfuy.b, bArr);
    }
}
