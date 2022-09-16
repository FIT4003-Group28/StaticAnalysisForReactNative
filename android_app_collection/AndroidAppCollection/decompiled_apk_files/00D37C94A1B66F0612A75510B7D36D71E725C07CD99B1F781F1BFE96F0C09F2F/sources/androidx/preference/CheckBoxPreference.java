package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final bis c;

    public CheckBoxPreference(Context context) {
        this(context, null);
    }

    private final void ad(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public void qB(bke bkeVar) {
        super.qB(bkeVar);
        ad(bkeVar.E(16908289));
        ac(bkeVar);
    }

    @Override // androidx.preference.Preference
    public final void qC(View view) {
        D();
        if (!((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        ad(view.findViewById(16908289));
        ab(view.findViewById(16908304));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ft.d(context, R.attr.checkBoxPreferenceStyle, 16842895));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new bis(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkf.b, i, i2);
        o(ft.j(obtainStyledAttributes, 5, 0));
        l(ft.j(obtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).b = ft.k(obtainStyledAttributes, 3, 2, false);
        obtainStyledAttributes.recycle();
    }
}
