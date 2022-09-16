package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: afel  reason: default package */
/* loaded from: classes2.dex */
public final class afel extends geb {
    public cqkj c;
    public afet d;
    @dzsi
    public cqkf<afer> e = null;

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<afer> cqkfVar = this.e;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.e = null;
        }
        super.Qe();
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxn.eF;
    }

    @Override // defpackage.geb
    protected final View q(Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(J());
        cqkf<afer> c = this.c.c(new afeq(), linearLayout);
        this.e = c;
        c.e(this.d);
        return linearLayout;
    }

    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        ExpandingScrollView expandingScrollView = ((geb) this).b;
        expandingScrollView.setViewHeaderHeightCallableForSizingCollapsedState(new Callable(this) { // from class: afej
            private final afel a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqkf<afer> cqkfVar = this.a.e;
                return Integer.valueOf(cqkfVar != null ? cqkfVar.c().getHeight() : 0);
            }
        });
        expandingScrollView.setExpandingStateTransition(jkc.o, jkc.o);
        expandingScrollView.setExpandingState(jjn.COLLAPSED, true);
        expandingScrollView.setAccessibilityDelegate(new afek());
    }
}
