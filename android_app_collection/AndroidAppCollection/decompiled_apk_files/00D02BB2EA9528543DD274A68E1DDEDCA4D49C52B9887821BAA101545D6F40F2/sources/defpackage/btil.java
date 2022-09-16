package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
/* compiled from: PG */
/* renamed from: btil  reason: default package */
/* loaded from: classes4.dex */
public final class btil implements btjs {
    public final cjqy a;
    public final bvjj b;
    private final SwitchPreferenceCompat c;

    public btil(Context context, cjqy cjqyVar, bvjj bvjjVar) {
        this.a = cjqyVar;
        this.b = bvjjVar;
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context);
        this.c = switchPreferenceCompat;
        switchPreferenceCompat.t(anfx.SETTINGS_ITEM_DETECTED_PARKING_LOCATION_TITLE);
        switchPreferenceCompat.x(anfx.SETTINGS_ITEM_DETECTED_PARKING_LOCATION_DESCRIPTION);
        switchPreferenceCompat.n = new btik(this);
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.c);
    }

    @Override // defpackage.btjs
    public final /* bridge */ /* synthetic */ Preference b() {
        return this.c;
    }

    @Override // defpackage.btjs
    public final void c() {
        this.c.m(this.b.m(bvjk.cX, false));
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
    }
}
