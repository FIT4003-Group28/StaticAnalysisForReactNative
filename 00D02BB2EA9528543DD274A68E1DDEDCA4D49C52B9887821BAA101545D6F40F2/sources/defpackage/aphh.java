package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aphh  reason: default package */
/* loaded from: classes2.dex */
public final class aphh implements jkh {
    private final View a;

    public aphh(gga ggaVar) {
        this.a = ggaVar.findViewById(R.id.qu_mylocation_container);
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        if (this.a == null) {
            return;
        }
        if (jjnVar2 == jjn.EXPANDED || jjnVar2 == jjn.FULLY_EXPANDED) {
            this.a.setImportantForAccessibility(4);
        } else {
            this.a.setImportantForAccessibility(1);
        }
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
    }
}
