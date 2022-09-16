package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mtj  reason: default package */
/* loaded from: classes3.dex */
final class mtj implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ aqen a;
    final /* synthetic */ mtk b;

    public mtj(mtk mtkVar, aqen aqenVar) {
        this.b = mtkVar;
        this.a = aqenVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.a.getViewTreeObserver().removeOnPreDrawListener(this);
        Resources resources = this.b.g.getResources();
        int i = zew.i(resources.getDisplayMetrics(), 16);
        int i2 = zew.i(resources.getDisplayMetrics(), 8);
        Context context = this.b.g;
        asxl asxlVar = this.a.n;
        if (asxlVar == null) {
            asxlVar = asxl.a;
        }
        zgd.t(this.b.a, zgd.r(((Integer) mix.e(context, asxlVar, i, i2).e(Integer.valueOf(resources.getDimensionPixelSize(R.dimen.list_item_thumbnail_width)))).intValue()), LinearLayout.LayoutParams.class);
        return false;
    }
}
