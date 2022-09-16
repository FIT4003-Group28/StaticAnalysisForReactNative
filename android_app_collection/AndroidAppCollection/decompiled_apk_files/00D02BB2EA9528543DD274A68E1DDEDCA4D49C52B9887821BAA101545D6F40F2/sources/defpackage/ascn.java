package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ascn  reason: default package */
/* loaded from: classes2.dex */
final class ascn implements jkh {
    final /* synthetic */ ascu a;

    public ascn(ascu ascuVar) {
        this.a = ascuVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        ascu ascuVar = this.a;
        if (!ascuVar.aD) {
            return;
        }
        ascuVar.am.c = jjnVar2;
        if (jjnVar == jjn.EXPANDED && jjnVar2 == jjn.COLLAPSED) {
            ((ckcn) this.a.ar.a(ckhi.aV)).a();
        }
        if (!this.a.b.M(jjnVar2).booleanValue()) {
            return;
        }
        cqkx.p(this.a.b);
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        View view = this.a.P;
        dbsk.s(view);
        view.findViewById(R.id.arrival_dashboard_grippy).setAlpha(jjnVar == jjn.EXPANDED ? 0.0f : 1.0f);
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        if (jjnVar != jjn.COLLAPSED || f <= 0.9d) {
            return;
        }
        View view = this.a.P;
        dbsk.s(view);
        view.findViewById(R.id.arrival_dashboard_grippy).setAlpha((1.0f - f) * 10.0f);
    }
}
