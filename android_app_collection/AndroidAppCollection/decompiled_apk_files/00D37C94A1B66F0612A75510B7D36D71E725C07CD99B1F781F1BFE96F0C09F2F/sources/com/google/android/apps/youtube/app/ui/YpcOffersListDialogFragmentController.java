package com.google.android.apps.youtube.app.ui;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class YpcOffersListDialogFragmentController extends DialogFragmentController {
    private final ajgz a;
    private final ajgy b;

    public YpcOffersListDialogFragmentController(dt dtVar, ajgz ajgzVar) {
        super(dtVar, "YpcOffersListDialogFragment");
        this.b = new ajgy() { // from class: luc
            @Override // defpackage.ajgy
            public final void lL() {
                YpcOffersListDialogFragmentController.this.k();
            }
        };
        this.a = ajgzVar;
    }

    public final void g(apzg apzgVar) {
        if (i() != null) {
            k();
        }
        apzgVar.getClass();
        irh irhVar = new irh();
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
        irhVar.ae(bundle);
        aqxo.y(true);
        j(irhVar);
    }

    public final void h(irh irhVar) {
        if (akzj.f(irhVar, i())) {
            this.a.d(this.b);
            super.m();
        }
    }

    @Override // com.google.android.apps.youtube.app.common.dialog.DialogFragmentController
    public final void n() {
        this.a.a(this.b);
        super.n();
    }
}
