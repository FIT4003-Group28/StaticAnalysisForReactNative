package com.google.android.apps.youtube.app.bedtime;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.preference.DialogPreference;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class BedtimeReminderPreference extends DialogPreference {
    public ajry g;
    ajru h;

    public BedtimeReminderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = R.layout.setting_compat_custom_preference;
        ((egv) awwc.u(context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : context, egv.class)).kp(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void C() {
        super.P();
        ajru ajruVar = this.h;
        if (ajruVar != null) {
            ajruVar.qZ(null);
        }
    }

    @Override // androidx.preference.Preference
    public final void qB(bke bkeVar) {
        super.qB(bkeVar);
        if (this.h == null) {
            this.h = ((eia) this.g).b((ViewGroup) bkeVar.a);
            ((ViewGroup) bkeVar.a).addView(this.h.a());
        }
        this.h.oK(new ajrs(), new lku(null));
    }
}
