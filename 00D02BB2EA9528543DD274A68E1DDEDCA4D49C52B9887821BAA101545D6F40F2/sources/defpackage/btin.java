package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btin  reason: default package */
/* loaded from: classes4.dex */
public final class btin implements btjs {
    public final axwq a;
    public final cjqy b;
    private final SwitchPreferenceCompat c;

    public btin(Context context, cjqy cjqyVar, axwq axwqVar) {
        this.b = cjqyVar;
        this.a = axwqVar;
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context);
        this.c = switchPreferenceCompat;
        switchPreferenceCompat.t(R.string.SETTINGS_ITEM_GOOGLE_CONTACTS_TITLE);
        switchPreferenceCompat.x(R.string.SETTINGS_ITEM_GOOGLE_CONTACTS_DESCRIPTION);
        switchPreferenceCompat.n = new btim(this);
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
        this.c.m(this.a.x().g());
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
    }
}
