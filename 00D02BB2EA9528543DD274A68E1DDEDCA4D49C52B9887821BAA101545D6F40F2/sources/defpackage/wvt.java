package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: wvt  reason: default package */
/* loaded from: classes7.dex */
public final class wvt extends geb {
    public cqkj c;
    public wzs d;
    public bvjj e;
    public cqkf<wyq> g;

    public static wvt w() {
        wvt wvtVar = new wvt();
        wvtVar.B(new Bundle());
        return wvtVar;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<wyq> cqkfVar = this.g;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.geb
    protected final View q(Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(J());
        wzs wzsVar = this.d;
        dbsk.s(wzsVar);
        wvq wvqVar = new wvq(this);
        Activity activity = (Activity) ((dxjd) wzsVar.a).a;
        wzs.a(activity, 1);
        wzs.a(wvqVar, 2);
        wzr wzrVar = new wzr(activity, wvqVar);
        cqkj cqkjVar = this.c;
        dbsk.s(cqkjVar);
        cqkf<wyq> c = cqkjVar.c(new wyc(), linearLayout);
        this.g = c;
        c.e(wzrVar);
        return linearLayout;
    }

    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        ExpandingScrollView expandingScrollView = ((geb) this).b;
        expandingScrollView.setViewHeaderHeightCallableForSizingCollapsedState(new Callable(this) { // from class: wvr
            private final wvt a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqkf<wyq> cqkfVar = this.a.g;
                return Integer.valueOf(cqkfVar != null ? cqkfVar.c().getHeight() : 0);
            }
        });
        expandingScrollView.setExpandingStateTransition(jkc.o, jkc.o);
        expandingScrollView.setExpandingState(jjn.COLLAPSED, true);
        expandingScrollView.setAccessibilityDelegate(new wvs());
    }
}
