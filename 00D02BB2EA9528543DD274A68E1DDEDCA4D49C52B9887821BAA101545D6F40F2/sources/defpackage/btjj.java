package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btjj  reason: default package */
/* loaded from: classes4.dex */
public final class btjj implements btjs {
    public final Preference a;
    public final gga b;
    public final cjqy c;
    public final aogw d;
    public final bvrb e;
    private final anhn f;

    public btjj(Context context, gga ggaVar, cjqy cjqyVar, aogw aogwVar, anhn anhnVar, bvrb bvrbVar) {
        this.b = ggaVar;
        this.c = cjqyVar;
        this.d = aogwVar;
        this.f = anhnVar;
        this.e = bvrbVar;
        Preference preference = new Preference(context);
        this.a = preference;
        preference.t(R.string.RECEIPTS_SETTING_TITLE);
        preference.x(R.string.RECEIPTS_SETTING_BODY);
        preference.o = new btji(this);
        preference.B(false);
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.a);
    }

    @Override // defpackage.btjs
    public final Preference b() {
        return this.a;
    }

    @Override // defpackage.btjs
    public final void c() {
        this.f.b(new btjh(this));
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
    }
}
