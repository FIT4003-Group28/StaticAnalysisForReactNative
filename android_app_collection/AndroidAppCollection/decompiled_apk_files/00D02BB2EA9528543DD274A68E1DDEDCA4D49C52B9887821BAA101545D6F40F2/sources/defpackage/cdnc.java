package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gmm.review.impl.MaterialProgressSpinner;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cdnc  reason: default package */
/* loaded from: classes4.dex */
public final class cdnc extends cdvg<cdnd> {
    public cebd a;
    public befw b;

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(Object obj) {
        if (obj instanceof cdil) {
            q(((cdil) obj).a().a);
        }
    }

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        cebd cebdVar = this.a;
        dbsk.s(cebdVar);
        cdwi b = cdvv.a(this, cebdVar).b(R.id.place_picker_button);
        b.d(dtyb.er);
        b.a(new Runnable(this) { // from class: cdmz
            private final cdnc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final cdnc cdncVar = this.a;
                dlif dlifVar = (dlif) bvrs.e(cdncVar.o, dlif.class, (dssr) dlif.d.cu(7));
                dbsk.s(dlifVar);
                cjdy bZ = cjdz.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cjdz cjdzVar = (cjdz) bZ.b;
                cjdzVar.a |= 1;
                cjdzVar.b = false;
                cjdi aR = cjdi.aR(dlifVar, bZ.bK());
                gga ggaVar = cdncVar.aE;
                dbsk.s(ggaVar);
                ggaVar.D(aR);
                ((cjdh) new au(aR).a(cjdh.class)).a.b(cdncVar, new aa(cdncVar) { // from class: cdna
                    private final cdnc a;

                    {
                        this.a = cdncVar;
                    }

                    @Override // defpackage.aa
                    public final void m(Object obj) {
                        this.a.q((ilo) obj);
                    }
                });
            }
        });
    }

    @Override // defpackage.cdvg
    protected final Class<cdnd> g() {
        return cdnd.class;
    }

    @Override // defpackage.cdvg
    protected final int i() {
        return R.layout.place_picker;
    }

    public final void q(ilo iloVar) {
        befu p = befv.p();
        p.j(bwrs.a(iloVar));
        befv m = p.m();
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        MaterialProgressSpinner materialProgressSpinner = new MaterialProgressSpinner(ggaVar);
        materialProgressSpinner.show();
        befw befwVar = this.b;
        dbsk.s(befwVar);
        ((bdvy) befwVar).f(new cdnb(this, materialProgressSpinner), m);
    }
}
