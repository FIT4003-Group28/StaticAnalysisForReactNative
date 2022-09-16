package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: lbe  reason: default package */
/* loaded from: classes3.dex */
public final class lbe extends apwt {
    private final SharedPreferences b;

    public lbe(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.b = sharedPreferences;
    }

    @Override // defpackage.apwt
    public final String a() {
        String string = this.b.getString(etk.COUNTRY, "");
        return !TextUtils.isEmpty(string) ? string.toLowerCase(Locale.ENGLISH) : "";
    }
}
