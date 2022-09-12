package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: bbea  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbea<T extends cqkp> extends geb {
    private cqkf<T> c;
    public cqkj e;

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<T> cqkfVar = this.c;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.Qe();
    }

    protected abstract cqiw<T> bn();

    protected abstract T bo();

    @Override // defpackage.geb
    protected final View q(Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(J());
        cqkf<T> c = this.e.c(bn(), frameLayout);
        this.c = c;
        c.e(bo());
        return frameLayout;
    }

    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        ExpandingScrollView expandingScrollView = ((geb) this).b;
        expandingScrollView.setViewHeaderHeightCallableForSizingCollapsedState(new bbdz(this));
        expandingScrollView.setExpandingStateTransition(jkc.o, jkc.o);
        expandingScrollView.setExpandingState(jjn.COLLAPSED, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract cqjg w();
}
