package defpackage;

import androidx.preference.TwoStatePreference;
import com.google.android.libraries.youtube.account.inlineauth.settings.QuickPurchaseEnabledPreference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: wdv  reason: default package */
/* loaded from: classes4.dex */
public final class wdv {
    final Set a = Collections.newSetFromMap(new WeakHashMap());

    public final void a(boolean z, boolean z2) {
        if (z) {
            for (QuickPurchaseEnabledPreference quickPurchaseEnabledPreference : this.a) {
                if (z2 && !((TwoStatePreference) quickPurchaseEnabledPreference).a) {
                    quickPurchaseEnabledPreference.d.d(quickPurchaseEnabledPreference.e, true);
                    quickPurchaseEnabledPreference.k(true);
                }
            }
            return;
        }
        for (QuickPurchaseEnabledPreference quickPurchaseEnabledPreference2 : this.a) {
        }
    }
}
