package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: biy  reason: default package */
/* loaded from: classes2.dex */
public final class biy implements bji {
    public static biy a;
    public static biy b;
    private final /* synthetic */ int c;

    public biy() {
    }

    public biy(int i) {
        this.c = i;
    }

    @Override // defpackage.bji
    public final /* bridge */ /* synthetic */ CharSequence a(Preference preference) {
        if (this.c == 0) {
            ListPreference listPreference = (ListPreference) preference;
            if (TextUtils.isEmpty(listPreference.l())) {
                return listPreference.j.getString(R.string.not_set);
            }
            return listPreference.l();
        }
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.g) ? editTextPreference.j.getString(R.string.not_set) : editTextPreference.g;
    }
}
