package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zxk  reason: default package */
/* loaded from: classes7.dex */
public final class zxk extends ExpandingScrollView {
    boolean C;

    public zxk(Context context) {
        super(context);
        this.C = false;
    }

    @Override // defpackage.jet
    public final int X() {
        if (zxo.J(getContext())) {
            return 0;
        }
        return this.A;
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.C) {
            this.C = false;
            scrollTo(0, C(this.f));
        }
    }
}
