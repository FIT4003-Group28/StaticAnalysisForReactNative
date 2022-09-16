package defpackage;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.GridLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mib  reason: default package */
/* loaded from: classes3.dex */
final class mib implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ mic a;

    public mib(mic micVar) {
        this.a = micVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.a.getViewTreeObserver().removeOnPreDrawListener(this);
        mic micVar = this.a;
        Context context = micVar.b;
        asxl asxlVar = micVar.d.k;
        if (asxlVar == null) {
            asxlVar = asxl.a;
        }
        ampq e = mix.e(context, asxlVar, this.a.c.getDimensionPixelSize(R.dimen.compact_show_horizontal_padding), this.a.c.getDimensionPixelSize(R.dimen.compact_show_menu_offset));
        mic micVar2 = this.a;
        zgd.t(micVar2.a, zgd.r(((Integer) e.e(Integer.valueOf(micVar2.c.getDimensionPixelSize(R.dimen.list_item_thumbnail_width)))).intValue()), GridLayout.LayoutParams.class);
        return false;
    }
}
