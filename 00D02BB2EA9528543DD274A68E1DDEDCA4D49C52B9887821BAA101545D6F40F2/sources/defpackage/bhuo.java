package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bhuo  reason: default package */
/* loaded from: classes3.dex */
public final class bhuo extends ges {
    public cjxo a;
    @dzsi
    private dnvu ad;
    @dzsi
    private String ae;
    @dzsi
    private bhwz af;
    public bwqv b;
    public bhyp c;
    public cqkj d;
    public efg e;
    final bhun f = new bhun(this);
    @dzsi
    private bwrs<ilo> g;

    public static bhuo g(bwqv bwqvVar, @dzsi dnvu dnvuVar, String str, bwrs<ilo> bwrsVar) {
        Bundle bundle = new Bundle();
        if (dnvuVar != null) {
            bwqvVar.c(bundle, "PERSON_RESULTS_KEY", bvrt.b(dnvuVar));
        }
        bundle.putString("CONTACT_NAME_KEY", str);
        bwqvVar.c(bundle, "PLACEMARK_REF_KEY", bwrsVar);
        bhuo bhuoVar = new bhuo();
        bhuoVar.B(bundle);
        return bhuoVar;
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((bhup) btsx.b(bhup.class, this)).cN(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        cqkf c = this.d.c(new bhws(), viewGroup);
        bhwz bhwzVar = this.af;
        dbsk.s(bhwzVar);
        c.e(bhwzVar);
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            this.ad = (dnvu) bvrt.f((bvrt) this.b.d(bvrt.class, this.o, "PERSON_RESULTS_KEY"), (dssr) dnvu.f.cu(7), dnvu.f);
            this.ae = this.o.getString("CONTACT_NAME_KEY");
            try {
                this.g = this.b.e(ilo.class, this.o, "PLACEMARK_REF_KEY");
                bhyp bhypVar = this.c;
                dnvu dnvuVar = this.ad;
                String str = this.ae;
                dbsk.s(str);
                bwrs<ilo> bwrsVar = this.g;
                dbsk.s(bwrsVar);
                bhun bhunVar = this.f;
                ff ffVar = (ff) ((dxjd) bhypVar.a).a;
                bhyp.a(ffVar, 1);
                bvrb a = bhypVar.b.a();
                bhyp.a(a, 2);
                axwq a2 = bhypVar.c.a();
                bhyp.a(a2, 3);
                buom a3 = bhypVar.d.a();
                bhyp.a(a3, 4);
                bvaz a4 = bhypVar.e.a();
                bhyp.a(a4, 5);
                bhyp.a(this, 6);
                bhyp.a(str, 8);
                bhyp.a(bwrsVar, 9);
                bhyp.a(bhunVar, 10);
                this.af = new bhyo(ffVar, a, a2, a3, a4, this, dnvuVar, str, bwrsVar, bhunVar);
            } catch (IOException e) {
                throw new RuntimeException("ContactsFragment cannot be created without a placemark", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("If ContactsFragment stored person results, they must be retrieved successfully to create ContactsFragment", e2);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (btpf.a(J())) {
            this.a.a(7);
        }
        efg efgVar = this.e;
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        if (btpf.a(J())) {
            this.a.b();
        }
        super.u();
    }
}
