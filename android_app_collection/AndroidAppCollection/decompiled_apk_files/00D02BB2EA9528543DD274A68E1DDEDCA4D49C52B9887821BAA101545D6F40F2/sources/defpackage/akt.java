package defpackage;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: akt  reason: default package */
/* loaded from: classes2.dex */
public final class akt {
    private final akv a;

    static {
        b(new Locale[0]);
    }

    private akt(akv akvVar) {
        this.a = akvVar;
    }

    public static akt a(LocaleList localeList) {
        return new akt(new akw(localeList));
    }

    public static akt b(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a(new LocaleList(localeArr));
        }
        return new akt(new aku(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        String[] split = "en-Latn".split("-", -1);
        int length = split.length;
        if (length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (length > 1) {
            new Locale(split[0], split[1]);
        } else if (length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public final Locale d() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof akt) && this.a.equals(((akt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
