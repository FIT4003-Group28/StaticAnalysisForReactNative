package com.google.android.apps.youtube.app.settings;

import android.content.Context;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class QuietHoursNotificationPreference extends Preference {
    private final lkt a;
    private final aurg b;
    private final acth c;
    private lks d;

    public QuietHoursNotificationPreference(Context context, lkt lktVar, acth acthVar, aurg aurgVar) {
        super(context);
        this.a = lktVar;
        this.c = acthVar;
        this.b = aurgVar;
        I("quiet_hours_notification_preference");
        this.B = R.layout.setting_compat_custom_preference;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void C() {
        super.P();
        lks lksVar = this.d;
        if (lksVar != null) {
            lksVar.qZ(null);
            this.d = null;
        }
    }

    @Override // androidx.preference.Preference
    public final void qB(bke bkeVar) {
        super.qB(bkeVar);
        if (this.d == null) {
            this.d = this.a.b((ViewGroup) bkeVar.a);
            ((ViewGroup) bkeVar.a).addView(this.d.a());
        }
        this.d.oK(new ajrs(), (lkx) lkz.a(this.b));
        this.c.oi().n(new acte(this.b.p));
    }
}
