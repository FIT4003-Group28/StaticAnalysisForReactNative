package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: geh  reason: default package */
/* loaded from: classes6.dex */
public abstract class geh extends geb {
    public static final cqjg c = cqjg.a();
    public cqkj d;
    private final Callable<Integer> e = new Callable(this) { // from class: ged
        private final geh a;

        {
            this.a = this;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            View d = cqkx.d(((geb) this.a).a, geh.c);
            return Integer.valueOf(d != null ? d.getHeight() : 0);
        }
    };

    @Override // defpackage.geb
    protected final View q(Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(J());
        this.d.c(new geg(), linearLayout).e(new gef(this) { // from class: gee
            private final geh a;

            {
                this.a = this;
            }

            @Override // defpackage.gef
            public Iterable a() {
                return this.a.w();
            }
        });
        return linearLayout;
    }

    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        ExpandingScrollView expandingScrollView = ((geb) this).b;
        expandingScrollView.setViewHeaderHeightCallableForSizingCollapsedState(this.e);
        expandingScrollView.setExpandingState(jjn.COLLAPSED, true);
        expandingScrollView.setExpandingStateTransition(jkc.o, jkc.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Iterable<jbf> w();
}
