package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adi  reason: default package */
/* loaded from: classes2.dex */
public final class adi implements View.OnLayoutChangeListener {
    final /* synthetic */ adv a;

    public adi(adv advVar) {
        this.a = advVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        adv advVar = this.a;
        if (advVar.j.getWidth() > 1) {
            Resources resources = advVar.getContext().getResources();
            int paddingLeft = advVar.b.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = afm.a(advVar);
            int dimensionPixelSize = advVar.p ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
            advVar.a.getDropDownBackground().getPadding(rect);
            if (a) {
                i9 = -rect.left;
            } else {
                i9 = paddingLeft - (rect.left + dimensionPixelSize);
            }
            advVar.a.setDropDownHorizontalOffset(i9);
            advVar.a.setDropDownWidth((((advVar.j.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
