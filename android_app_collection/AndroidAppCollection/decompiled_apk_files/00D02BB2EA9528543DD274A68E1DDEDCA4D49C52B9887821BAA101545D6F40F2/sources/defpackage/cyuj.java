package defpackage;

import android.telephony.PhoneNumberUtils;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cyuj  reason: default package */
/* loaded from: classes5.dex */
public final class cyuj extends cyxd {
    private final Locale a;

    public cyuj(Locale locale) {
        this.a = locale;
    }

    public static final String c(String str) {
        String str2;
        if (!dbsj.d(str)) {
            try {
                str2 = PhoneNumberUtils.normalizeNumber(str);
            } catch (NoSuchMethodError unused) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final String a(String str) {
        String str2;
        if (!dbsj.d(str)) {
            try {
                str2 = PhoneNumberUtils.formatNumber(str, this.a.getCountry());
            } catch (NoSuchMethodError unused) {
                str2 = null;
            }
            return str2 == null ? str : str2;
        }
        return "";
    }

    public final String b(String str) {
        String str2;
        if (!dbsj.d(str)) {
            try {
                str2 = PhoneNumberUtils.formatNumberToE164(str, this.a.getCountry());
            } catch (NoSuchMethodError unused) {
                str2 = null;
            }
            return str2 == null ? dudm.a(str).c : str2;
        }
        return "";
    }
}
