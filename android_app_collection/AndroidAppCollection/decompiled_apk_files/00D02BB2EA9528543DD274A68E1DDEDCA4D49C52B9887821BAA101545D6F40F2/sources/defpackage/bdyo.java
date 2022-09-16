package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdyo  reason: default package */
/* loaded from: classes3.dex */
final class bdyo implements jkh {
    private final btvo a;
    private final bdwp b;

    public bdyo(btvo btvoVar, bdwp bdwpVar) {
        this.a = btvoVar;
        this.b = bdwpVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        bfgt x;
        bruz ap;
        View findViewById;
        bnjo bnjoVar = this.b.i;
        if (bnjoVar == null || !bnjoVar.ae().booleanValue() || (x = bnjoVar.x()) == null || (ap = x.ap()) == null || (findViewById = this.b.findViewById(R.id.business_place_card)) == null) {
            return;
        }
        View a = cqhu.a(findViewById, brtf.f);
        View a2 = cqhu.a(findViewById, brtf.g);
        if (a == null || a2 == null) {
            return;
        }
        if (this.a.getPlaceSheetParameters().ap() == 5) {
            if (jjnVar == jjn.HIDDEN) {
                float height = a.getHeight() * (f - 1.0f);
                a2.setTranslationY(height);
                ap.u(cqrp.c(height));
            } else {
                a2.setTranslationY(0.0f);
                ap.u(cqrp.c(dcyn.a));
            }
        }
        Integer num = 0;
        if (!ap.v().booleanValue()) {
            num = 8;
        } else if (a2.getTranslationY() <= (-a.getHeight())) {
            num = 4;
        }
        a.setVisibility(num.intValue());
        ap.x(num);
    }
}
