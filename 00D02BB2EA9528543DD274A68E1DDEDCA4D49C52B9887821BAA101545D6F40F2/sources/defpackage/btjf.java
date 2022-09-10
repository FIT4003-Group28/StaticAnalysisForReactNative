package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btjf  reason: default package */
/* loaded from: classes4.dex */
public final class btjf implements btjs {
    public final arag a;
    public final bsvm b;
    public final cjqy c;
    public boolean d;
    private final apkd e;
    private final btjt f;
    private final Preference g;

    public btjf(Context context, arag aragVar, apkd apkdVar, btjt btjtVar, bsvm bsvmVar, cjqy cjqyVar) {
        this.a = aragVar;
        this.e = apkdVar;
        this.f = btjtVar;
        this.b = bsvmVar;
        this.c = cjqyVar;
        Preference preference = new Preference(context);
        this.g = preference;
        preference.x(R.string.SETTINGS_ITEM_LOCATION_REPORTING_DESCRIPTION_REVISED);
        preference.o = new btje(this);
        this.d = false;
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.g);
    }

    @Override // defpackage.btjs
    public final Preference b() {
        return this.g;
    }

    @Override // defpackage.btjs
    public final void c() {
        boolean a = this.e.a();
        this.d = a;
        if (a) {
            this.g.t(R.string.SETTINGS_ITEM_LOCATION_REPORTING_TITLE_STATUS_ON);
        } else {
            this.g.s(this.f.a(R.string.SETTINGS_ITEM_LOCATION_REPORTING_TITLE_STATUS_OFF));
        }
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
    }
}
