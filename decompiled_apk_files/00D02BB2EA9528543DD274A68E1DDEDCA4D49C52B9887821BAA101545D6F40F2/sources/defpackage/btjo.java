package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btjo  reason: default package */
/* loaded from: classes4.dex */
public final class btjo implements btjs {
    public final cjqy a;
    public final axvy b;
    private final SwitchPreferenceCompat c;

    public btjo(Context context, cjqy cjqyVar, axvy axvyVar) {
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context);
        this.c = switchPreferenceCompat;
        this.a = cjqyVar;
        this.b = axvyVar;
        switchPreferenceCompat.t(R.string.SETTINGS_ITEM_REGULAR_ROUTES_TITLE);
        switchPreferenceCompat.x(R.string.SETTINGS_ITEM_REGULAR_ROUTES_DESCRIPTION);
        switchPreferenceCompat.n = new btjn(this);
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
        this.c.m(this.b.a());
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
    }
}
