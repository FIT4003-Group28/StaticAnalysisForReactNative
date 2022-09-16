package com.google.android.apps.youtube.app.settings;

import android.content.Context;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DigestNotificationPreference extends Preference {
    private final lkn a;
    private final aurg b;
    private final acth c;
    private lkm d;

    public DigestNotificationPreference(Context context, lkn lknVar, acth acthVar, aurg aurgVar) {
        super(context);
        this.a = lknVar;
        this.c = acthVar;
        this.b = aurgVar;
        I("daily_digest_notification_preference");
        this.B = R.layout.setting_compat_custom_preference;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void C() {
        super.P();
        lkm lkmVar = this.d;
        if (lkmVar != null) {
            lkmVar.qZ(null);
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
        this.d.oK(new ajrs(), (lkw) lkz.a(this.b));
        this.c.oi().n(new acte(this.b.p));
    }
}
