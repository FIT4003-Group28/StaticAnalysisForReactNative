package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgym  reason: default package */
/* loaded from: classes4.dex */
public abstract class cgym extends chal implements cgvw, cgvq {
    protected boolean a;
    protected final Resources b;

    public cgym(Resources resources, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, cgum cgumVar) {
        super(cgskVar, bwrsVar, list, dwqlVar, chakVar, cgumVar);
        this.a = false;
        this.b = resources;
    }

    @Override // defpackage.cgwg
    public void B() {
        this.a = false;
        a();
    }

    @Override // defpackage.cgvq
    public void RE(boolean z) {
        this.a = z;
    }

    protected abstract void a();

    @dzsi
    protected abstract dnet c();

    protected abstract int d();

    @Override // defpackage.cgvw
    @dzsi
    public dnet m() {
        if (this.a) {
            dner bZ = dnet.h.bZ();
            int d = d();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnet dnetVar = (dnet) bZ.b;
            dnetVar.a |= 1;
            dnetVar.b = d;
            dneu bZ2 = dnfe.p.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnfe dnfeVar = (dnfe) bZ2.b;
            dnfeVar.a |= 1;
            dnfeVar.b = true;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnet dnetVar2 = (dnet) bZ.b;
            dnfe bK = bZ2.bK();
            bK.getClass();
            dnetVar2.d = bK;
            dnetVar2.a |= 4;
            return bZ.bK();
        }
        return c();
    }

    public Boolean r() {
        return Boolean.valueOf(this.n.a);
    }

    @Override // defpackage.cgvw
    public jht s() {
        jhu h = jhv.h();
        jhm b = jhm.b(R.string.UGC_TASKS_SUGGEST_EDIT_REPORT_MENU_NOT_RELEVANT);
        b.d(new View.OnClickListener(this) { // from class: cgyl
            private final cgym a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cgym cgymVar = this.a;
                cgymVar.RE(true);
                cgymVar.u(cgwf.EDIT_COMPLETED);
            }
        });
        h.d(b.c());
        return h.b();
    }

    @Override // defpackage.chal, defpackage.cgwg
    public void u(cgwf cgwfVar) {
        this.j = cgwfVar;
        if (this.a) {
            this.l.K(this);
        } else {
            this.l.G(this);
        }
        cqkx.p(this);
    }
}
