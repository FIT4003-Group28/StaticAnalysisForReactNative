package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
/* compiled from: PG */
/* renamed from: bvjo  reason: default package */
/* loaded from: classes4.dex */
public final class bvjo {
    public static Preference a(Context context) {
        return new bvjn(context);
    }

    public static TwoStatePreference b(Context context, bvjk bvjkVar, String str) {
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context);
        switchPreferenceCompat.C(bvjkVar.toString());
        switchPreferenceCompat.u = false;
        switchPreferenceCompat.s(str);
        switchPreferenceCompat.t = true;
        return switchPreferenceCompat;
    }
}
