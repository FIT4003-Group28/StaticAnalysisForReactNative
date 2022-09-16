package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final bkj c;
    private CharSequence d;
    private CharSequence e;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        this.c = new bkj(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkf.m, R.attr.switchPreferenceCompatStyle, 0);
        o(ft.j(obtainStyledAttributes, 7, 0));
        l(ft.j(obtainStyledAttributes, 6, 1));
        this.d = ft.j(obtainStyledAttributes, 9, 3);
        d();
        this.e = ft.j(obtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = ft.k(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }

    private final void ad(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.c = this.d;
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.c();
            }
            switchCompat.d = this.e;
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.b();
            }
            switchCompat.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void qB(bke bkeVar) {
        super.qB(bkeVar);
        ad(bkeVar.E(R.id.switchWidget));
        ac(bkeVar);
    }

    @Override // androidx.preference.Preference
    public final void qC(View view) {
        D();
        if (!((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        ad(view.findViewById(R.id.switchWidget));
        ab(view.findViewById(16908304));
    }
}
