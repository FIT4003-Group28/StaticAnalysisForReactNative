package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwtq  reason: default package */
/* loaded from: classes4.dex */
public final class bwtq extends bwtr {
    @Override // defpackage.bwtr, defpackage.ges
    public final void Oo(View view) {
        String Rp;
        bxdn bxdnVar = this.e;
        if (bxdnVar == null) {
            return;
        }
        String q = bxdnVar.q();
        if (q != null) {
            Rp = Rq(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_INNERSPACE, q);
        } else {
            Rp = Rp(R.string.ACCESSIBILITY_INNERSPACE_ANNOUNCE);
        }
        this.am.b(view, Rp);
    }

    @Override // defpackage.bwtr, defpackage.ges
    public final ddho p() {
        return dtxs.ad;
    }
}
