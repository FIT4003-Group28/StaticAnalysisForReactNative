package defpackage;

import android.app.Activity;
import android.text.Html;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmhp  reason: default package */
/* loaded from: classes3.dex */
public class bmhp implements bega, bmhy {
    private final eeu a;
    private final vtn b;
    private final dxio<qbt> c;
    private List<bmid> d = dcdc.e();

    public bmhp(Activity activity, eeu eeuVar, vtn vtnVar, dxio<qbt> dxioVar) {
        this.a = eeuVar;
        this.b = vtnVar;
        this.c = dxioVar;
    }

    @Override // defpackage.bmhy
    public List<bmid> a() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [bmie] */
    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c;
        if (bwrsVar == null || (c = bwrsVar.c()) == null || !c.ba()) {
            return;
        }
        this.d = dchl.f(c.bP().e.size());
        dopk bP = c.bP();
        for (int i = 0; i < bP.e.size(); i++) {
            eeu eeuVar = this.a;
            vtn vtnVar = this.b;
            dxio<qbt> dxioVar = this.c;
            String str = null;
            if (i >= 0 && i < bP.e.size()) {
                doph dophVar = bP.e.get(i);
                if (dophVar.d.size() != 0) {
                    List<zef> a = zrp.a(dophVar, vtnVar, null, null, null);
                    if ((dophVar.a & 1) != 0) {
                        str = Html.fromHtml(dophVar.b).toString();
                    }
                    jhk c2 = xkg.c(dophVar);
                    dool b = dool.b(dophVar.e);
                    if (b == null) {
                        b = dool.SHORT;
                    }
                    str = new bmie(eeuVar, dxioVar, str, c2, b, Collections.unmodifiableList(a), bP, dophVar.f);
                }
            }
            if (str != null) {
                this.d.add(str);
            }
        }
        this.d = Collections.unmodifiableList(this.d);
        this.b.k(c.bQ());
    }

    @Override // defpackage.bega
    public void u() {
        this.d = dcdc.e();
    }

    @Override // defpackage.bega
    public Boolean w() {
        boolean z = false;
        if (a() != null && !a().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
