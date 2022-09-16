package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: alpq  reason: default package */
/* loaded from: classes.dex */
final class alpq implements alqp {
    final /* synthetic */ alpx a;

    public alpq(alpx alpxVar) {
        this.a = alpxVar;
    }

    @Override // defpackage.alqp
    public final void a(TextInputLayout textInputLayout) {
        AutoCompleteTextView a = alpx.a(textInputLayout.a);
        alpx alpxVar = this.a;
        int i = alpxVar.k.j;
        if (i == 2) {
            a.setDropDownBackgroundDrawable(alpxVar.h);
        } else if (i == 1) {
            a.setDropDownBackgroundDrawable(alpxVar.g);
        }
        alpx alpxVar2 = this.a;
        if (!alpx.h(a)) {
            TextInputLayout textInputLayout2 = alpxVar2.k;
            int i2 = textInputLayout2.j;
            if (i2 == 1 || i2 == 2) {
                almx almxVar = textInputLayout2.i;
                int k = almu.k(a, R.attr.colorControlHighlight);
                int[][] iArr = {new int[]{16842919}, new int[0]};
                if (i2 == 2) {
                    int k2 = almu.k(a, R.attr.colorSurface);
                    almx almxVar2 = new almx(almxVar.i());
                    int z = amxp.z(k, k2, 0.1f);
                    almxVar2.l(new ColorStateList(iArr, new int[]{z, 0}));
                    almxVar2.setTint(k2);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{z, k2});
                    almx almxVar3 = new almx(almxVar.i());
                    almxVar3.setTint(-1);
                    lj.O(a, new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, almxVar2, almxVar3), almxVar}));
                } else {
                    int i3 = alpxVar2.k.k;
                    lj.O(a, new RippleDrawable(new ColorStateList(iArr, new int[]{amxp.z(k, i3, 0.1f), i3}), almxVar, almxVar));
                }
            } else {
                throw new IllegalStateException();
            }
        }
        alpx alpxVar3 = this.a;
        a.setOnTouchListener(new alpu(alpxVar3, a));
        a.setOnFocusChangeListener(alpxVar3.b);
        a.setOnDismissListener(new alpv(alpxVar3));
        a.setThreshold(0);
        a.removeTextChangedListener(this.a.a);
        a.addTextChangedListener(this.a.a);
        textInputLayout.m(true);
        textInputLayout.x(null);
        if (!alpx.h(a)) {
            lj.V(this.a.m, 2);
        }
        textInputLayout.N(this.a.c);
        textInputLayout.u(true);
    }
}
