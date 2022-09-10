package com.google.android.apps.gmm.settings.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Toast;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class IntEditTextPreference extends CustomEditTextPreference {
    @dzsi
    private aub i;

    public IntEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    public final void J(aub aubVar) {
        this.i = aubVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final String V(String str) {
        return Integer.toString(X(0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void ad(String str) {
        af(Integer.parseInt(str));
    }

    @Override // androidx.preference.Preference
    public final boolean I(Object obj) {
        try {
            int parseInt = Integer.parseInt((String) obj);
            aub aubVar = this.i;
            return aubVar == null || aubVar.a(this, Integer.valueOf(parseInt));
        } catch (NumberFormatException unused) {
            Toast.makeText(this.j, "Invalid numeric value", 0).show();
            return false;
        }
    }
}
