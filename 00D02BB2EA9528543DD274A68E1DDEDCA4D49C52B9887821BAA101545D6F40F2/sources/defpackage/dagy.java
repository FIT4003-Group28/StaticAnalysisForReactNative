package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import com.google.android.apps.maps.R;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dagy  reason: default package */
/* loaded from: classes5.dex */
final class dagy implements dahw {
    final /* synthetic */ dahe a;

    public dagy(dahe daheVar) {
        this.a = daheVar;
    }

    @Override // defpackage.dahw
    public final void a(TextInputLayout textInputLayout) {
        AutoCompleteTextView g = dahe.g(textInputLayout.a);
        dahe daheVar = this.a;
        int i = daheVar.k.j;
        if (i == 2) {
            g.setDropDownBackgroundDrawable(daheVar.h);
        } else if (i == 1) {
            g.setDropDownBackgroundDrawable(daheVar.g);
        }
        dahe daheVar2 = this.a;
        if (!dahe.h(g)) {
            TextInputLayout textInputLayout2 = daheVar2.k;
            int i2 = textInputLayout2.j;
            if (i2 == 1 || i2 == 2) {
                dadr dadrVar = textInputLayout2.i;
                int c = dacz.c(g, R.attr.colorControlHighlight);
                int[][] iArr = {new int[]{16842919}, new int[0]};
                if (i2 == 2) {
                    int c2 = dacz.c(g, R.attr.colorSurface);
                    dadr dadrVar2 = new dadr(dadrVar.P());
                    int b = czxb.b(c, c2, 0.1f);
                    dadrVar2.Q(new ColorStateList(iArr, new int[]{b, 0}));
                    dadrVar2.setTint(c2);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{b, c2});
                    dadr dadrVar3 = new dadr(dadrVar.P());
                    dadrVar3.setTint(-1);
                    od.U(g, new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, dadrVar2, dadrVar3), dadrVar}));
                } else {
                    int i3 = daheVar2.k.k;
                    od.U(g, new RippleDrawable(new ColorStateList(iArr, new int[]{czxb.b(c, i3, 0.1f), i3}), dadrVar, dadrVar));
                }
            } else {
                throw new IllegalStateException();
            }
        }
        dahe daheVar3 = this.a;
        g.setOnTouchListener(new dahb(daheVar3, g));
        g.setOnFocusChangeListener(daheVar3.b);
        g.setOnDismissListener(new dahc(daheVar3));
        g.setThreshold(0);
        g.removeTextChangedListener(this.a.a);
        g.addTextChangedListener(this.a.a);
        textInputLayout.setEndIconCheckable(true);
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!dahe.h(g)) {
            od.m(this.a.m, 2);
        }
        textInputLayout.setTextInputAccessibilityDelegate(this.a.c);
        textInputLayout.setEndIconVisible(true);
    }
}
