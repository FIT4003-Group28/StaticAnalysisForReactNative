package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final bki c;
    private CharSequence d;
    private CharSequence e;

    public SwitchPreference(Context context) {
        this(context, null);
    }

    private final void ad(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void qB(bke bkeVar) {
        super.qB(bkeVar);
        ad(bkeVar.E(16908352));
        ac(bkeVar);
    }

    @Override // androidx.preference.Preference
    public final void qC(View view) {
        D();
        if (!((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        ad(view.findViewById(16908352));
        ab(view.findViewById(16908304));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ft.d(context, R.attr.switchPreferenceStyle, 16843629));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new bki(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkf.l, i, i2);
        o(ft.j(obtainStyledAttributes, 7, 0));
        l(ft.j(obtainStyledAttributes, 6, 1));
        this.d = ft.j(obtainStyledAttributes, 9, 3);
        d();
        this.e = ft.j(obtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = ft.k(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }
}
