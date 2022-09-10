package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ato  reason: default package */
/* loaded from: classes2.dex */
public final class ato implements aue<EditTextPreference> {
    public static ato a;

    @Override // defpackage.aue
    public final /* bridge */ /* synthetic */ CharSequence a(EditTextPreference editTextPreference) {
        EditTextPreference editTextPreference2 = editTextPreference;
        return TextUtils.isEmpty(editTextPreference2.g) ? editTextPreference2.j.getString(R.string.not_set) : editTextPreference2.g;
    }
}
