package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkjz  reason: default package */
/* loaded from: classes3.dex */
public class bkjz implements bkju, bega {
    public final btvo a;
    private final gga b;
    private final bkjv c;
    private dcdc<bkjt> d = dcdc.e();
    private cjtd e = cjtd.b;

    public bkjz(gga ggaVar, btvo btvoVar, bkjv bkjvVar) {
        this.b = ggaVar;
        this.a = btvoVar;
        this.c = bkjvVar;
    }

    @Override // defpackage.bkju
    public String a() {
        return this.b.getString(R.string.RELATED_TO_YOUR_SEARCH_TITLE);
    }

    @Override // defpackage.bkju
    public dcdc<cqix<?>> b() {
        dccx F = dcdc.F();
        dcdc<bkjt> dcdcVar = this.d;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(cqgr.fT(new bkjs(), dcdcVar.get(i)));
        }
        return F.f();
    }

    @Override // defpackage.bkju
    public cjtd c() {
        return this.e;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilf ilfVar;
        dvwz dvwzVar;
        bkka a;
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null || (ilfVar = iloVar.I) == null) {
            u();
            return;
        }
        dvwr dvwrVar = (dvwr) bvrt.f(ilfVar.a(), (dssr) dvwr.b.cu(7), dvwr.b);
        if (dvwrVar == null || !dcbg.b(dvwrVar.a).o(bkjx.a).p(bkjy.a) || new dsrh(this.a.getPlaceSheetParameters().al().a, dvmo.b).isEmpty()) {
            u();
            return;
        }
        dcdc z = dcbg.b(dvwrVar.a).o(new dbsl(this) { // from class: bkjw
            private final bkjz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                bkjz bkjzVar = this.a;
                dvwp dvwpVar = (dvwp) obj;
                if (!dvwpVar.e) {
                    dsrh dsrhVar = new dsrh(bkjzVar.a.getPlaceSheetParameters().al().a, dvmo.b);
                    drci b = drci.b(dvwpVar.f);
                    if (b == null) {
                        b = drci.UNKNOWN_PLACE_ANNOTATION_JUSTIFICATION_TYPE;
                    }
                    return dsrhVar.contains(b);
                }
                return false;
            }
        }).x(this.a.getPlaceSheetParameters().am()).z();
        bkjv bkjvVar = this.c;
        dccx F = dcdc.F();
        int size = z.size();
        for (int i = 0; i < size; i++) {
            dvwp dvwpVar = (dvwp) z.get(i);
            drci drciVar = drci.UNKNOWN_PLACE_ANNOTATION_JUSTIFICATION_TYPE;
            drci b = drci.b(dvwpVar.f);
            if (b == null) {
                b = drci.UNKNOWN_PLACE_ANNOTATION_JUSTIFICATION_TYPE;
            }
            if (b.ordinal() == 1) {
                int i2 = dvwpVar.b;
                String str = "";
                if (i2 == 2) {
                    dqie dqieVar = (dqie) dvwpVar.c;
                    bkkb bkkbVar = bkjvVar.a;
                    dgly dglyVar = dqieVar.c;
                    if (dglyVar == null) {
                        dglyVar = dgly.c;
                    }
                    CharSequence a2 = acls.a(dglyVar);
                    if (dqieVar.a == 3) {
                        str = (String) dqieVar.b;
                    }
                    String str2 = str;
                    dgly dglyVar2 = dqieVar.c;
                    if (dglyVar2 == null) {
                        dglyVar2 = dgly.c;
                    }
                    a = bkkbVar.a(a2, str2, dglyVar2, bkjv.a(dvwpVar), bwrsVar);
                } else {
                    if (i2 != 1) {
                        dvwzVar = dvwz.d;
                    } else {
                        dvwzVar = (dvwz) dvwpVar.c;
                    }
                    bkkb bkkbVar2 = bkjvVar.a;
                    String g = dbrz.e("  •  ").g(dvwzVar.c);
                    if ((1 & dvwzVar.a) != 0) {
                        str = dvwzVar.b;
                    }
                    a = bkkbVar2.a(g, str, null, bkjv.a(dvwpVar), bwrsVar);
                }
                F.g(a);
            }
        }
        this.d = F.f();
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.lI;
        this.e = c.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.d = dcdc.e();
        this.e = cjtd.b;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!this.d.isEmpty());
    }
}
