package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
/* compiled from: PG */
/* renamed from: bsnj  reason: default package */
/* loaded from: classes4.dex */
public final class bsnj implements egq {
    private final Activity a;
    private final brcj b;
    private final bsoi c;
    private final cklq d;
    private final ckmp e;
    private final ckml f;
    private final brpm g;
    private final brlk h;

    public bsnj(Activity activity, cklq cklqVar, ckmp ckmpVar, ckml ckmlVar, brpm brpmVar, brlk brlkVar, brcj brcjVar, bsoi bsoiVar) {
        this.a = activity;
        this.d = cklqVar;
        this.e = ckmpVar;
        this.f = ckmlVar;
        this.b = brcjVar;
        this.c = bsoiVar;
        this.g = brpmVar;
        this.h = brlkVar;
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.b.h(false, true);
        this.b.d();
        this.c.d(true, !this.h.f());
        this.c.I(eguVar.j);
        this.c.F = (ExtendedFloatingActionButton) cqkx.e(this.a.findViewById(R.id.on_map_action_button), brhz.a, ExtendedFloatingActionButton.class);
        bsoi bsoiVar = this.c;
        brla.a(bsoiVar.F, bsoiVar.a.getApplicationContext());
        brpm brpmVar = this.g;
        brlu e = this.h.e();
        dbsk.s(e);
        brpmVar.a(e);
        this.d.c(cklt.TRAVERSAL_RESULTS_LIST);
        this.f.e(ckoi.SEARCH_LIST);
        this.e.c(ckmk.GMM_COMPONENT_TRANSITION_SEARCH_TRAVERSAL_RESULTS_LIST, ckmo.INTERNAL);
    }
}
