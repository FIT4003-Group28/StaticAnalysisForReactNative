package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
/* compiled from: PG */
/* renamed from: yhc  reason: default package */
/* loaded from: classes7.dex */
public final class yhc extends ExpandingScrollView {
    public yhc(Context context) {
        super(context);
        setExposurePercentage(jjn.EXPANDED, 50.0f);
        setExposurePercentage(jjn.COLLAPSED, 20.0f);
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View a;
        View a2;
        super.onLayout(z, i, i2, i3, i4);
        View a3 = cqhu.a(this, yhm.a);
        Integer num = null;
        if (a3 != null && (a = cqhu.a(this, yhm.b)) != null && (a2 = cqhu.a(a3, yhq.a)) != null && a2.getHeight() > 0) {
            num = Integer.valueOf(Math.min((a3.getHeight() - a.getHeight()) + a2.getHeight(), C(jjn.FULLY_EXPANDED)));
        }
        if (num == null) {
            setExposurePercentage(jjn.EXPANDED, 50.0f);
        } else {
            setExposurePixels(jjn.EXPANDED, num.intValue());
        }
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, defpackage.jke
    public void setTwoThirdsHeight(int i) {
    }
}
