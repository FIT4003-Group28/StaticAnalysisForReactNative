package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bhkw  reason: default package */
/* loaded from: classes3.dex */
public class bhkw extends bhkz implements bega {
    private static final cqtv f = cqrp.d(112.0d);
    private static final Integer g = 20;
    @dzsi
    public bwrs<ilo> a;

    public bhkw(Resources resources, cjqy cjqyVar, dxio<bbut> dxioVar, btvo btvoVar) {
        super(resources, cjqyVar, btvoVar, dxioVar);
    }

    @Override // defpackage.acts, defpackage.actl
    public Boolean a() {
        ilo iloVar = (ilo) bwrs.b(this.a);
        if (iloVar == null) {
            return false;
        }
        return Boolean.valueOf(iloVar.aX(this.b.getEnableFeatureParameters()));
    }

    public boolean c() {
        return this.b.getPlaceSheetParameters().o() && !j().isEmpty();
    }

    @Override // defpackage.actl
    @dzsi
    public acli d() {
        return acli.a(dtxy.nC);
    }

    @Override // defpackage.actl
    @dzsi
    public acli e() {
        return acli.a(dtxy.nD);
    }

    @Override // defpackage.actl
    @dzsi
    public acli f() {
        return acli.a(dtxy.nC);
    }

    @Override // defpackage.actl
    public String g() {
        return this.e.getString(R.string.MENU_PHOTO_CAROUSEL_TITLE);
    }

    @Override // defpackage.actl
    @dzsi
    public acli h() {
        return acli.a(dtxy.nF);
    }

    @Override // defpackage.actl
    @dzsi
    public acli i() {
        return null;
    }

    @Override // defpackage.acts, defpackage.actl
    public cqvf n() {
        return cqrt.l(R.string.ADD_MENU_LABEL);
    }

    @Override // defpackage.acts, defpackage.actl
    public Boolean o() {
        return false;
    }

    @Override // defpackage.acts, defpackage.actl
    public Boolean p() {
        if (j().size() == 1) {
            return false;
        }
        return super.p();
    }

    @Override // defpackage.acts, defpackage.actl
    public Boolean q() {
        if (!a().booleanValue() || j().size() == 2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.acts, defpackage.actl
    public cqtv s() {
        return f;
    }

    @Override // defpackage.bega
    public void t(@dzsi bwrs<ilo> bwrsVar) {
        this.a = bwrsVar;
        View.OnClickListener onClickListener = (bwrs.b(bwrsVar) == null || !a().booleanValue()) ? null : new View.OnClickListener(this) { // from class: bhkv
            private final bhkw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bhkw bhkwVar = this.a;
                ilo iloVar = (ilo) bwrs.b(bhkwVar.a);
                if (iloVar != null) {
                    bbuz m = bbve.m();
                    m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
                    m.e(dwyd.PLACE_PAGE);
                    ((bbsu) m).b = iloVar;
                    bhkwVar.c.a().j(m.a());
                }
            }
        };
        if (bwrsVar == null) {
            y(dcdc.e(), null, null);
        } else {
            y(B(bwrsVar, dtxy.nE), null, onClickListener);
        }
    }

    @Override // defpackage.bega
    public void u() {
        t(null);
    }

    @Override // defpackage.acts, defpackage.actl
    public cqtv v() {
        return cqrp.d(g.intValue());
    }

    @Override // defpackage.bega
    public Boolean w() {
        ilo iloVar = (ilo) bwrs.b(this.a);
        boolean z = false;
        if (!c() && iloVar != null && z().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
