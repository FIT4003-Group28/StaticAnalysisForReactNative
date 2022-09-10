package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btiu  reason: default package */
/* loaded from: classes4.dex */
public final class btiu implements btjs {
    public final gga a;
    public final bexz b;
    public final cjqy c;
    public final degu<dpri> d;
    private final SwitchPreferenceCompat e;
    private final bexy f;

    public btiu(gga ggaVar, Context context, beya beyaVar, cjqy cjqyVar) {
        btir btirVar = new btir(this);
        this.f = btirVar;
        this.d = new btis(this);
        this.a = ggaVar;
        this.b = beyaVar.a(btirVar);
        this.c = cjqyVar;
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context);
        this.e = switchPreferenceCompat;
        switchPreferenceCompat.ae();
        switchPreferenceCompat.t(R.string.LOCAL_FOLLOW_SETTING_PRIMARY);
        switchPreferenceCompat.x(R.string.LOCAL_FOLLOW_SETTING_SUBSTRING);
        switchPreferenceCompat.n = new btit(this);
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.e);
    }

    @Override // defpackage.btjs
    public final /* bridge */ /* synthetic */ Preference b() {
        return this.e;
    }

    @Override // defpackage.btjs
    public final void c() {
        this.e.m(this.b.b());
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
    }
}
