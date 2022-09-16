package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bown  reason: default package */
/* loaded from: classes3.dex */
final class bown implements aket {
    private final bwrs<ilo> a;
    private final dnqb b;

    public bown(bwrs<ilo> bwrsVar, dnqb dnqbVar) {
        this.a = bwrsVar;
        this.b = dnqbVar;
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        bwqv rD = ((bwqz) btsr.a(bwqz.class)).rD();
        bwrs<ilo> bwrsVar = this.a;
        dnqb dnqbVar = this.b;
        bnxi bnxiVar = new bnxi();
        Bundle w = bnxi.w(rD, bwrsVar);
        rD.c(w, "ENTRYPOINT_TYPE_KEY", dnqbVar);
        bnxiVar.B(w);
        ggaVar.D(bnxiVar);
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
    }
}
