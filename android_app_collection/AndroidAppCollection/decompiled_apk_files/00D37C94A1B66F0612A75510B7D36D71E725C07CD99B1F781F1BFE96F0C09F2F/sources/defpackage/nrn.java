package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: nrn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nrn implements ayqb {
    public final /* synthetic */ nrt a;
    private final /* synthetic */ int b;

    public /* synthetic */ nrn(nrt nrtVar, int i) {
        this.b = i;
        this.a = nrtVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        jo joVar;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                nrt nrtVar = this.a;
                nsr nsrVar = (nsr) obj;
                if (nrtVar.g == null || nrtVar.i == null || nrtVar.j == null) {
                    return;
                }
                nsr nsrVar2 = nsr.FULL_BLEED;
                int ordinal = nsrVar.ordinal();
                if (ordinal != 0) {
                    joVar = ordinal != 1 ? null : nrtVar.j;
                } else {
                    joVar = nrtVar.i;
                }
                lj.M(nrtVar.g, joVar);
                return;
            }
            nrt nrtVar2 = this.a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ViewGroup viewGroup = nrtVar2.f;
            if (viewGroup == null) {
                return;
            }
            if (booleanValue) {
                ((GradientDrawable) viewGroup.getBackground()).setCornerRadii(nrtVar2.k);
                return;
            } else {
                ((GradientDrawable) viewGroup.getBackground()).setCornerRadii(nrtVar2.l);
                return;
            }
        }
        nrt nrtVar3 = this.a;
        boolean booleanValue2 = ((Boolean) obj).booleanValue();
        aynx aynxVar = nrtVar3.h;
        View view = nrtVar3.g;
        if (view == null || aynxVar == null) {
            return;
        }
        if (booleanValue2) {
            view.setVisibility(0);
            nrtVar3.g.setZ(1.0f);
            nrtVar3.e.c();
            aypf aypfVar = nrtVar3.e;
            aynx U = nrtVar3.d.U(aynxVar, lum.f);
            final nsw nswVar = nrtVar3.b;
            nswVar.getClass();
            aynx C = U.C(new ayqe() { // from class: nrp
                @Override // defpackage.ayqe
                public final Object a(Object obj2) {
                    return nsw.this.c((nsr) obj2);
                }
            });
            final nsv nsvVar = nrtVar3.a;
            nsvVar.getClass();
            aypfVar.d(C.Z(new ayqb() { // from class: nro
                @Override // defpackage.ayqb
                public final void a(Object obj2) {
                    nsv.this.a((nsr) obj2);
                }
            }));
            nrtVar3.e.d(aynxVar.Z(new nrn(nrtVar3, 1)));
            return;
        }
        view.setVisibility(8);
        nrtVar3.e.c();
    }
}
