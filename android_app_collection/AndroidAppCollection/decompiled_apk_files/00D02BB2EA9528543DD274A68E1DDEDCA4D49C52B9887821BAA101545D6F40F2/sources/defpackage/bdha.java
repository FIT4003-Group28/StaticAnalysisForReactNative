package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bdha  reason: default package */
/* loaded from: classes3.dex */
public final class bdha extends itb implements bdhl {
    private final bdgx a;
    private final btvo b;
    private final dxio<akfc> c;

    public bdha(bdgx bdgxVar, btvo btvoVar, dxio<akfc> dxioVar) {
        this.a = bdgxVar;
        this.b = btvoVar;
        this.c = dxioVar;
    }

    @Override // defpackage.bdhl
    public final void e(final gfw gfwVar, bdhg bdhgVar) {
        boolean z = false;
        if (!this.b.getEnableFeatureParameters().aC) {
            int j = bdhgVar.j();
            if (j == 0) {
                throw null;
            }
            if (j == 2) {
                z = true;
            }
        }
        bdgx bdgxVar = this.a;
        ily ilyVar = new ily();
        ilyVar.k(bdhgVar.a());
        cknz cknzVar = new cknz(ilyVar.d(), new bdgv(z));
        bwrs a = bwrs.a(bdhgVar);
        final bdgy bdgyVar = new bdgy();
        Bundle bundle = new Bundle();
        bdgxVar.a.c(bundle, "photoUrlManager", cknzVar);
        bdgxVar.a.c(bundle, "option", a);
        bdgyVar.B(bundle);
        this.c.a().a(akeu.j(new akeo(gfwVar, bdgyVar) { // from class: bdgz
            private final gfw a;
            private final bdgy b;

            {
                this.a = gfwVar;
                this.b = bdgyVar;
            }

            @Override // defpackage.akeo
            public final void a(gga ggaVar, btlu btluVar) {
                this.a.aZ(this.b);
            }

            @Override // defpackage.akeo
            public final void b(gga ggaVar, btlu btluVar) {
            }
        }).b());
    }
}
