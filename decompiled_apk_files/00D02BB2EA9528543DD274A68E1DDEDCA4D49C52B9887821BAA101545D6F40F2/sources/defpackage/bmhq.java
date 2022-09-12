package defpackage;

import com.google.android.apps.gmm.directions.api.GmmNotice;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmhq  reason: default package */
/* loaded from: classes3.dex */
public class bmhq implements cqkp, bega {
    private final vtn a;
    private final btvo b;
    private final xiy c;
    private final zrt d;
    private List<zcv> f = dcdc.e();
    @dzsi
    private xiv e = null;

    public bmhq(vtn vtnVar, btvo btvoVar, xiy xiyVar, zrt zrtVar) {
        this.a = vtnVar;
        this.b = btvoVar;
        this.c = xiyVar;
        this.d = zrtVar;
    }

    public List<zcv> a() {
        return this.f;
    }

    @dzsi
    public xiv b() {
        return this.e;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            u();
        } else if (!iloVar.ba()) {
        } else {
            this.a.k(iloVar.bQ());
            if (this.b.getTransitPagesParameters().h) {
                this.f = dcdc.e();
                this.e = this.c.a(GmmNotice.g(iloVar.bP().l), null, cjtd.a(dtyc.eF));
                return;
            }
            this.f = zrs.t(this.d, GmmNotice.g(iloVar.bP().l), new xdn(), cjtd.a(dtxy.mA));
            this.e = null;
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.e = null;
        this.f = dcdc.e();
    }

    @Override // defpackage.bega
    public Boolean w() {
        xiv xivVar = this.e;
        boolean z = true;
        if ((xivVar == null || xivVar.a() == null) && this.f.isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
