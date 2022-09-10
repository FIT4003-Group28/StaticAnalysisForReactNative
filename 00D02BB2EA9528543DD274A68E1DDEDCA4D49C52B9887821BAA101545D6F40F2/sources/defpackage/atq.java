package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atq  reason: default package */
/* loaded from: classes2.dex */
public final class atq extends Preference {
    private long a;

    public atq(Context context, List<Preference> list, long j) {
        super(context);
        this.y = R.layout.expand_button;
        w(R.drawable.ic_arrow_down_24dp);
        t(R.string.expand_button_title);
        r(999);
        ArrayList arrayList = new ArrayList();
        String str = null;
        for (Preference preference : list) {
            CharSequence u = preference.u();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(u)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.B)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(u)) {
                str = str == null ? u : this.j.getString(R.string.summary_collapsed_preference_list, str, u);
            }
        }
        k(str);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final long Ng() {
        return this.a;
    }

    @Override // androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        aveVar.u = false;
    }
}
