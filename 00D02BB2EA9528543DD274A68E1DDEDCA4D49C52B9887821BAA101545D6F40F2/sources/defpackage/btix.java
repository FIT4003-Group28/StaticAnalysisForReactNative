package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: btix  reason: default package */
/* loaded from: classes4.dex */
public final class btix implements btjs {
    private static final dcqe c = dcqe.c("btix");
    public final arag a;
    public final cjqy b;
    private final apkd d;
    private final btjt e;
    private final Preference f;
    private PreferenceGroup g;

    public btix(Context context, arag aragVar, apkd apkdVar, btjt btjtVar, cjqy cjqyVar) {
        this.a = aragVar;
        this.d = apkdVar;
        this.e = btjtVar;
        this.b = cjqyVar;
        Preference preference = new Preference(context);
        this.f = preference;
        preference.s(btjtVar.a(R.string.SETTINGS_ITEM_LOCATION_ACCURACY_TITLE));
        preference.o = new btiw(this);
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        this.g = preferenceGroup;
    }

    @Override // defpackage.btjs
    public final Preference b() {
        return this.f;
    }

    @Override // defpackage.btjs
    public final void c() {
        int i = 0;
        if (this.g == null) {
            bvoo.h("attachTo must be called before refresh", new Object[0]);
            return;
        }
        dbsg<Integer> b = this.d.b();
        if (!b.a() || b.b().intValue() == 0 || b.b().intValue() == 3) {
            this.g.ak(this.f);
            return;
        }
        Preference preference = this.f;
        btjt btjtVar = this.e;
        int intValue = b.b().intValue();
        if (intValue == 1) {
            i = R.string.SETTINGS_ITEM_LOCATION_ACCURACY_STATUS_DEVICE_ONLY;
        } else if (intValue == 2) {
            i = R.string.SETTINGS_ITEM_LOCATION_ACCURACY_STATUS_BATTERY_SAVING;
        } else if (intValue == 3) {
            i = R.string.SETTINGS_ITEM_LOCATION_ACCURACY_STATUS_HIGH_ACCURACY;
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) btjtVar.a.getString(R.string.SETTINGS_ITEM_LOCATION_ACCURACY_DESCRIPTION)).append((CharSequence) "\n\n");
        bvsv a = btjtVar.b.a(btjtVar.a.getString(i).toUpperCase(Locale.getDefault()));
        a.i();
        a.l(ibm.x().b(btjtVar.a));
        preference.k(append.append((CharSequence) a.c()));
        this.g.aj(this.f);
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
    }
}
