package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xsq  reason: default package */
/* loaded from: classes7.dex */
final class xsq implements cqfd {
    @Override // defpackage.cqfd
    public final boolean a(View view) {
        xzp xzpVar = (xzp) cqjz.o(view);
        if (xzpVar != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int paddingRight = view.getPaddingRight();
            View a = cqhu.a(view.getRootView(), zei.a);
            int measuredHeight = a != null ? a.getMeasuredHeight() : 0;
            if (xzpVar.w().booleanValue()) {
                measuredHeight += cqrt.d(R.dimen.directions_details_bottom_padding).e(view.getContext());
            }
            view.setPadding(paddingLeft, paddingTop, paddingRight, measuredHeight);
            return true;
        }
        return true;
    }
}
