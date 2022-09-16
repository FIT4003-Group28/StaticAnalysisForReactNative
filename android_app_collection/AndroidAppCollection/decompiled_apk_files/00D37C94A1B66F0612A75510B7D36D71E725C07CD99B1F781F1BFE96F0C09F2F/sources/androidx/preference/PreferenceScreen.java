package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean d;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ft.d(context, R.attr.preferenceScreenStyle, 16842891));
        this.d = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public final boolean ad() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        bjz bjzVar;
        if (this.t != null || this.u != null || k() == 0 || (bjzVar = this.k.e) == null) {
            return;
        }
        bjzVar.aH();
    }
}
