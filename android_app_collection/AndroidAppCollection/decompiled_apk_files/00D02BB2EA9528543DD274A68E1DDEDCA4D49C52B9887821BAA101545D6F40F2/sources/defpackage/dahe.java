package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.apps.maps.R;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dahe  reason: default package */
/* loaded from: classes5.dex */
public final class dahe extends dahf {
    public final TextWatcher a;
    public final View.OnFocusChangeListener b;
    public final dahv c;
    public boolean d;
    public boolean e;
    public long f;
    public StateListDrawable g;
    public dadr h;
    public AccessibilityManager i;
    public ValueAnimator j;
    private final dahw n;
    private final dahx o;
    private ValueAnimator p;

    public dahe(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.a = new dagv(this);
        this.b = new dagw(this);
        this.c = new dagx(this, this.k);
        this.n = new dagy(this);
        this.o = new dagz(this);
        this.d = false;
        this.e = false;
        this.f = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView g(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        return (AutoCompleteTextView) editText;
    }

    public static boolean h(EditText editText) {
        return editText.getKeyListener() != null;
    }

    private final dadr j(float f, float f2, float f3, int i) {
        dadw a = dadx.a();
        a.f(f);
        a.h(f);
        a.c(f2);
        a.d(f2);
        dadx b = a.b();
        dadr O = dadr.O(this.l, f3);
        O.setShapeAppearanceModel(b);
        dadq dadqVar = O.w;
        if (dadqVar.i == null) {
            dadqVar.i = new Rect();
        }
        O.w.i.set(0, i, 0, i);
        O.invalidateSelf();
        return O;
    }

    private final ValueAnimator k(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(czum.a);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new dagu(this));
        return ofFloat;
    }

    @Override // defpackage.dahf
    public final void a() {
        float dimensionPixelOffset = this.l.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.l.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.l.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        dadr j = j(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        dadr j2 = j(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.h = j;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.g = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, j);
        this.g.addState(new int[0], j2);
        this.k.setEndIconDrawable(sl.b(this.l, R.drawable.mtrl_dropdown_arrow));
        TextInputLayout textInputLayout = this.k;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.k.setEndIconOnClickListener(new daha(this));
        this.k.p(this.n);
        this.k.o(this.o);
        this.j = k(67, 0.0f, 1.0f);
        ValueAnimator k = k(50, 1.0f, 0.0f);
        this.p = k;
        k.addListener(new dahd(this));
        this.i = (AccessibilityManager) this.l.getSystemService("accessibility");
    }

    public final void e(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (f()) {
            this.d = false;
        }
        if (this.d) {
            this.d = false;
            return;
        }
        i(!this.e);
        if (this.e) {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
            return;
        }
        autoCompleteTextView.dismissDropDown();
    }

    public final boolean f() {
        long currentTimeMillis = System.currentTimeMillis() - this.f;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public final void i(boolean z) {
        if (this.e != z) {
            this.e = z;
            this.j.cancel();
            this.p.start();
        }
    }

    @Override // defpackage.dahf
    public final boolean l() {
        return true;
    }

    @Override // defpackage.dahf
    public final boolean m(int i) {
        return i != 0;
    }
}
