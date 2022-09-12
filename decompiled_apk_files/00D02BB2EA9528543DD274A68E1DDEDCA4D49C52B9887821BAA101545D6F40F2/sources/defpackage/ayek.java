package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
/* compiled from: PG */
/* renamed from: ayek  reason: default package */
/* loaded from: classes3.dex */
final class ayek extends ExpandingScrollView {
    public ayek(Context context) {
        super(context);
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, defpackage.jkj
    public final int C(jjn jjnVar) {
        if (jjnVar == jjn.HIDDEN) {
            return -100;
        }
        return super.C(jjnVar);
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, defpackage.jke
    public void setTwoThirdsHeight(int i) {
        super.setTwoThirdsHeight(i + 80);
    }
}
