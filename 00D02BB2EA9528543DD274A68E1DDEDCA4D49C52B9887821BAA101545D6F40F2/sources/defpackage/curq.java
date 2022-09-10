package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: curq  reason: default package */
/* loaded from: classes5.dex */
public final class curq implements cvdi {
    public cvcy a;
    public aqex b;
    private final cvdj c;

    public curq(cvdj cvdjVar) {
        cvdjVar.setPresenter((cvdi) this);
        this.c = cvdjVar;
    }

    @Override // defpackage.cuvu
    public final void A() {
        this.a = null;
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    @Override // defpackage.cvdi
    public final void a() {
        aqex aqexVar;
        cvcy cvcyVar = this.a;
        if (cvcyVar == null) {
            return;
        }
        dbsg<cugu> a = cvcyVar.a();
        if (!a.a() || (aqexVar = this.b) == null) {
            return;
        }
        aqexVar.a.j(a.b());
    }

    public final void b() {
        cvcy cvcyVar = this.a;
        boolean z = false;
        if (cvcyVar != null && cvcyVar.a().a() && this.a.a().b().g().equals(cugo.OUTGOING_FAILED_SEND) && this.b != null) {
            z = true;
        }
        cvdj cvdjVar = this.c;
        if (cvdjVar instanceof View) {
            ((View) cvdjVar).setClickable(z);
        }
    }

    @Override // defpackage.cuvu
    public final void z() {
        cvcy cvcyVar = this.a;
        if (cvcyVar == null) {
            cstl.a("RichCardPresenter");
            return;
        }
        final curt curtVar = (curt) this.c;
        curtVar.c.removeAllViews();
        curtVar.setPadding(0, 0, 0, 0);
        if (!cvcyVar.a().a()) {
            return;
        }
        cugu b = cvcyVar.a().b();
        int o = b.o();
        int i = o - 1;
        if (o == 0) {
            throw null;
        }
        if (i == 0) {
            curtVar.d.setVisibility(0);
            curtVar.setGravity(8388611);
            curtVar.c.setLayoutGravity(8388611);
        } else if (i == 1) {
            if (!cvcyVar.d() || cvcyVar.c() == 1 || cvcyVar.c() == 0) {
                curtVar.setPadding(0, curtVar.getContext().getResources().getDimensionPixelSize(R.dimen.top_padding_outgoing_message), 0, 0);
            }
            curtVar.d.setVisibility(8);
            curtVar.setGravity(8388613);
            curtVar.c.setLayoutGravity(8388613);
        }
        dbsg<cupx> a = cumv.a(cvcyVar.a().b());
        cufj b2 = cvcyVar.b();
        curtVar.d.setTopLabelText(b2.b().c(""));
        curtVar.d.a.setContentDescription(b2.c().c(""));
        if (!b2.k().a()) {
            qf.a(curtVar.d.a, curtVar.h);
        } else {
            int b3 = b2.k().b().b();
            if (b3 == 0) {
                qf.a(curtVar.d.a, curtVar.h);
                curtVar.d.setBotIconVisibility(8);
            } else if (b3 == 1) {
                qf.a(curtVar.d.a, curtVar.i);
                curtVar.d.setBotIconVisibility(8);
            } else if (b3 == 2) {
                qf.a(curtVar.d.a, curtVar.j);
                if (b2.b().a()) {
                    curtVar.d.setBotIconVisibility(0);
                }
            }
        }
        if (a.a()) {
            curtVar.c.a(a.b(), curtVar.f, curtVar.g, curtVar.k, curtVar.e, b);
        }
        curtVar.a.a(cvcyVar);
        curtVar.b.a(cvcyVar);
        cstn.a(b.h(), new mw(curtVar) { // from class: curr
            private final curt a;

            {
                this.a = curtVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.setContentDescription((String) obj);
            }
        });
    }
}
