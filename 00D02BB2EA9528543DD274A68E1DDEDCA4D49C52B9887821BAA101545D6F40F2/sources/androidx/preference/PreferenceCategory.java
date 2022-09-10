package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public void Rk(ave aveVar) {
        super.Rk(aveVar);
        if (Build.VERSION.SDK_INT >= 28) {
            aveVar.a.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean h() {
        return !super.z();
    }

    @Override // androidx.preference.Preference
    public final boolean z() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, kb.k(context, R.attr.preferenceCategoryStyle, 16842892), null);
    }
}
