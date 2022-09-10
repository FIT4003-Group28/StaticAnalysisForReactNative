package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean e;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, kb.k(context, R.attr.preferenceScreenStyle, 16842891));
        this.e = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public final boolean ai() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        auz auzVar;
        if (this.r != null || this.s != null || n() == 0 || (auzVar = this.k.g) == null) {
            return;
        }
        auzVar.q();
    }
}
