package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.maps.R;
import java.util.LinkedHashSet;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: btbx  reason: default package */
/* loaded from: classes4.dex */
public final class btbx extends bszv {
    public Context ad;
    public btbg ae;
    public bwqv af;

    private final Preference aS(Locale locale) {
        Preference preference = new Preference(this.ad);
        preference.C(locale.toString());
        preference.s(locale.getDisplayName(locale));
        preference.k(locale.getDisplayName());
        preference.G(true);
        preference.o = new btbw(this, locale);
        return preference;
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return bb().getString(R.string.APP_LANGUAGE_SETTINGS_PAGE_TITLE);
    }

    @Override // defpackage.bszv
    public final ddho aR() {
        return dtxj.bf;
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        this.b.d(bvjj.a);
        PreferenceScreen b = this.b.b(this.ad);
        btbv btbvVar = new btbv(this.ad);
        btbvVar.s(bb().getString(R.string.APP_LANGUAGE_SETTINGS_PAGE_CATEGORY_SUGGESTED));
        btbvVar.w(2131232526);
        btbvVar.C("app_language_suggested");
        b.aj(btbvVar);
        btbv btbvVar2 = new btbv(this.ad);
        btbvVar2.s(bb().getString(R.string.APP_LANGUAGE_SETTINGS_PAGE_CATEGORY_ALL));
        btbvVar2.w(2131232311);
        btbvVar2.C("app_language_all");
        b.aj(btbvVar2);
        Preference aS = aS(Locale.getDefault());
        aS.w(2131232242);
        btbvVar.aj(aS);
        btbg btbgVar = this.ae;
        LinkedHashSet<Locale> linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(btbgVar.b);
        for (String str : btbgVar.e.getLanguageSettingParameters().c) {
            btbp btbpVar = btbgVar.f;
            dbsg<Locale> b2 = btbp.b(str);
            if (b2.a()) {
                linkedHashSet.add(b2.b());
            }
        }
        linkedHashSet.remove(Locale.getDefault());
        for (Locale locale : linkedHashSet) {
            btbvVar.aj(aS(locale));
        }
        dcdc<Locale> dcdcVar = btbg.a;
        if (dcdcVar.isEmpty()) {
            dcdcVar.add(Locale.getDefault());
        }
        for (Locale locale2 : dcdcVar) {
            btbvVar2.aj(aS(locale2));
        }
        e(b);
    }
}
