package defpackage;

import android.content.Context;
import androidx.preference.EditTextPreference;
/* compiled from: PG */
/* renamed from: bszg  reason: default package */
/* loaded from: classes4.dex */
final class bszg extends EditTextPreference {
    public bszg(Context context) {
        super(context, null);
    }

    @Override // androidx.preference.Preference
    public final CharSequence l() {
        return ((EditTextPreference) this).g;
    }
}
