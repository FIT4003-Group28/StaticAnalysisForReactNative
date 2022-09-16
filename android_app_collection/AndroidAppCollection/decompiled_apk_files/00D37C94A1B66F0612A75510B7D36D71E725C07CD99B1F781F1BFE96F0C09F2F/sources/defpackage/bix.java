package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bix  reason: default package */
/* loaded from: classes2.dex */
final class bix extends Preference {
    private long a;

    public bix(Context context, List list, long j) {
        super(context);
        this.B = R.layout.expand_button;
        H(po.b(this.j, R.drawable.ic_arrow_down_24dp));
        this.r = R.drawable.ic_arrow_down_24dp;
        L(R.string.expand_button_title);
        J(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence = preference.q;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.E)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                str = str == null ? charSequence : this.j.getString(R.string.summary_collapsed_preference_list, str, charSequence);
            }
        }
        n(str);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final long jQ() {
        return this.a;
    }

    @Override // androidx.preference.Preference
    public final void qB(bke bkeVar) {
        super.qB(bkeVar);
        bkeVar.v = false;
    }
}
