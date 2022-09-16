package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.GridLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mhr  reason: default package */
/* loaded from: classes3.dex */
final class mhr implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ aqea b;
    final /* synthetic */ mhs c;

    public mhr(mhs mhsVar, ViewGroup viewGroup, aqea aqeaVar) {
        this.c = mhsVar;
        this.a = viewGroup;
        this.b = aqeaVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        Resources resources = this.c.n.getResources();
        Context context = this.c.n;
        asxl asxlVar = this.b.p;
        if (asxlVar == null) {
            asxlVar = asxl.a;
        }
        ampq e = mix.e(context, asxlVar, resources.getDimensionPixelSize(R.dimen.compact_movie_horizontal_padding), resources.getDimensionPixelSize(R.dimen.compact_movie_menu_offset));
        if (this.b.r) {
            final ViewGroup viewGroup = this.a;
            int intValue = ((Integer) e.b(new ampg() { // from class: mhq
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    return Integer.valueOf((((Integer) obj).intValue() - viewGroup.getMeasuredWidth()) / 2);
                }
            }).e(0)).intValue();
            zgd.t(this.a, zgd.b(zgd.l(intValue), zgd.k(intValue + resources.getDimensionPixelSize(R.dimen.compact_movie_horizontal_padding))), GridLayout.LayoutParams.class);
        } else {
            zgd.t(this.a, zgd.r(((Integer) e.e(Integer.valueOf(resources.getDimensionPixelSize(R.dimen.list_item_thumbnail_width)))).intValue()), GridLayout.LayoutParams.class);
        }
        return false;
    }
}
