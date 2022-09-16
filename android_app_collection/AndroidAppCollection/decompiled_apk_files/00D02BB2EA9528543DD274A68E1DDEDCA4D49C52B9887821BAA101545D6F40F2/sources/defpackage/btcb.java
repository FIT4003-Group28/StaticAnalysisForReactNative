package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: btcb  reason: default package */
/* loaded from: classes4.dex */
public final class btcb extends geb {
    public bwqv ad;
    public btco ae;
    public cqkf<btcq> af;
    public cqkj c;
    public gga d;
    public bvjj e;
    public btvo g;

    @Override // defpackage.ges
    public final void Nv() {
        ((btcc) btsx.b(btcc.class, this)).dn(this);
    }

    @Override // defpackage.gen
    protected final void aX() {
        this.e.S(bvjk.T, true);
    }

    @Override // defpackage.geb, defpackage.gen
    public final Dialog i(Bundle bundle) {
        Dialog i = super.i(bundle);
        i.requestWindowFeature(1);
        return i;
    }

    @Override // defpackage.geb
    protected final View q(Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(J());
        this.af = this.c.c(new btcl(), frameLayout);
        List<Locale> h = this.ae.b.h();
        if (h == null) {
            h = dcdc.e();
        }
        this.af.e(new btct(this.d, this.e, this.g, this.ad, h));
        return frameLayout;
    }

    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        ExpandingScrollView expandingScrollView = ((geb) this).b;
        expandingScrollView.setExpandedHeightCallable(new Callable(this) { // from class: btca
            private final btcb a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqkf<btcq> cqkfVar = this.a.af;
                return Integer.valueOf(cqkfVar != null ? cqkfVar.c().getHeight() : 0);
            }
        });
        expandingScrollView.setExpandingStateTransition(jkc.p, jkc.p);
        expandingScrollView.setExpandingState(jjn.EXPANDED, true);
    }
}
