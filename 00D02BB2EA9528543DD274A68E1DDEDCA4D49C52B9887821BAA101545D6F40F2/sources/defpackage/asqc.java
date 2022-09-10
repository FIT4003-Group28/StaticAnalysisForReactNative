package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: asqc  reason: default package */
/* loaded from: classes2.dex */
final class asqc implements cqfd {
    @Override // defpackage.cqfd
    public final boolean a(View view) {
        Context context = view.getContext();
        int e = cjxh.d.e(context);
        int intValue = asqh.e(context).intValue();
        int measuredHeight = view.getMeasuredHeight();
        if (context.getResources().getConfiguration().orientation != 2) {
            measuredHeight -= context.getResources().getDimensionPixelOffset(R.dimen.navigation_header_with_grippy_height_port);
        }
        int i = intValue + e;
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getTop() + e + (((measuredHeight - e) / i) * i) + cqrp.d(4.0d).NR(context));
        return true;
    }
}
