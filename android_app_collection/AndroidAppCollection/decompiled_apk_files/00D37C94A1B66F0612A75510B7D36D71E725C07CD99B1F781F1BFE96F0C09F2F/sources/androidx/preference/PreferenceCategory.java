package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ft.d(context, R.attr.preferenceCategoryStyle, 16842892), null);
    }

    @Override // androidx.preference.Preference
    public final boolean T() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.T();
    }

    @Override // androidx.preference.Preference
    public final void qB(bke bkeVar) {
        super.qB(bkeVar);
        if (Build.VERSION.SDK_INT >= 28) {
            bkeVar.a.setAccessibilityHeading(true);
        }
    }
}
