package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final avk c;
    private CharSequence d;
    private CharSequence e;

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }

    private final void ai(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.d);
            switchCompat.setTextOff(this.e);
            switchCompat.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public void Rk(ave aveVar) {
        super.Rk(aveVar);
        ai(aveVar.C(R.id.switchWidget));
        ag(aveVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        K();
        if (!((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        ai(view.findViewById(R.id.switchWidget));
        ah(view.findViewById(16908304));
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new avk(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, avf.m, i, i2);
        n(kb.h(obtainStyledAttributes, 7, 0));
        o(kb.h(obtainStyledAttributes, 6, 1));
        this.d = kb.h(obtainStyledAttributes, 9, 3);
        d();
        this.e = kb.h(obtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = kb.f(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }
}
