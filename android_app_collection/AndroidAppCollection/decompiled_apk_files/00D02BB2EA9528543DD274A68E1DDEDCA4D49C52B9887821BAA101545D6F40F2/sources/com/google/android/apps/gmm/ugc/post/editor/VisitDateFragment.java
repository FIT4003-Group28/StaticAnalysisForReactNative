package com.google.android.apps.gmm.ugc.post.editor;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gmm.ugc.post.editor.VisitDateFragment;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class VisitDateFragment extends cdvg<cdog> {
    public cebd a;
    public bqtv b;
    public bqrv c;

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        cebd cebdVar = this.a;
        dbsk.s(cebdVar);
        cdvv a = cdvv.a(this, cebdVar);
        cdwi b = a.b(R.id.visit_date_button);
        b.b(w().h);
        b.d(dtyf.H);
        b.a(new Runnable(this) { // from class: cdnz
            private final VisitDateFragment a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final VisitDateFragment visitDateFragment = this.a;
                bqtv bqtvVar = visitDateFragment.b;
                dbsk.s(bqtvVar);
                eapy h = visitDateFragment.w().f.h();
                dbsk.s(h);
                bqtvVar.h(h);
                bqrv bqrvVar = visitDateFragment.c;
                dbsk.s(bqrvVar);
                ilo h2 = visitDateFragment.w().d.h();
                dbsk.s(h2);
                bqrvVar.d(h2.ai(), visitDateFragment.b, new Runnable(visitDateFragment) { // from class: cdoa
                    private final VisitDateFragment a;

                    {
                        this.a = visitDateFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VisitDateFragment visitDateFragment2 = this.a;
                        z<eapy> zVar = visitDateFragment2.w().e;
                        bqtv bqtvVar2 = visitDateFragment2.b;
                        dbsk.s(bqtvVar2);
                        zVar.g(bqtvVar2.g());
                    }
                });
            }
        });
        cdwi b2 = a.b(R.id.visit_date_internal);
        cdog cdogVar = (cdog) this.ai;
        dbsk.s(cdogVar);
        b2.e(cdogVar.g);
    }

    @Override // defpackage.cdvg
    protected final Class<cdog> g() {
        return cdog.class;
    }

    @Override // defpackage.cdvg
    protected final int i() {
        return R.layout.visit_date;
    }
}
