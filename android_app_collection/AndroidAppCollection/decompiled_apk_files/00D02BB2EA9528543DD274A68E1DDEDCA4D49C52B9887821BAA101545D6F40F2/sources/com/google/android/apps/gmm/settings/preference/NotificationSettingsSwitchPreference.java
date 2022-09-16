package com.google.android.apps.gmm.settings.preference;

import android.content.Context;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NotificationSettingsSwitchPreference extends SwitchPreferenceCompat {
    public NotificationSettingsSwitchPreference(final auhi auhiVar, Context context, aujb aujbVar) {
        super(context);
        auix b = aujbVar.b();
        dbsk.s(b);
        final int i = aujbVar.a;
        boolean z = false;
        this.t = false;
        C(String.valueOf(i));
        this.u = Boolean.valueOf(auhiVar.t(i) == aufs.ENABLED ? true : z);
        t(b.b);
        x(b.c);
        J(new aub(auhiVar, i) { // from class: btlb
            private final auhi a;
            private final int b;

            {
                this.a = auhiVar;
                this.b = i;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference, Object obj) {
                this.a.d(this.b, ((Boolean) obj).booleanValue() ? aufs.ENABLED : aufs.DISABLED);
                return true;
            }
        });
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        TextView textView = (TextView) aveVar.C(16908310);
        if (textView != null) {
            textView.setSingleLine(false);
        }
    }
}
