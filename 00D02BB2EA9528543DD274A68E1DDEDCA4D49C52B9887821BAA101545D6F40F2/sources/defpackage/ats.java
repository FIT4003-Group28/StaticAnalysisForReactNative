package defpackage;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ats  reason: default package */
/* loaded from: classes2.dex */
public final class ats implements aue<ListPreference> {
    public static ats a;

    @Override // defpackage.aue
    public final /* bridge */ /* synthetic */ CharSequence a(ListPreference listPreference) {
        ListPreference listPreference2 = listPreference;
        return TextUtils.isEmpty(listPreference2.n()) ? listPreference2.j.getString(R.string.not_set) : listPreference2.n();
    }
}
