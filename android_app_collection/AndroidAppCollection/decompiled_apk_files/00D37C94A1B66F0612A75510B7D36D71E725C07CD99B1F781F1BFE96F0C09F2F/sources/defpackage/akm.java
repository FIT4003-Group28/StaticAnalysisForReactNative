package defpackage;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: akm  reason: default package */
/* loaded from: classes.dex */
public final class akm {
    private final ako a;

    static {
        a(new Locale[0]);
    }

    private akm(ako akoVar) {
        this.a = akoVar;
    }

    public static akm a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b(new LocaleList(localeArr));
        }
        return new akm(new akn(localeArr));
    }

    public static akm b(LocaleList localeList) {
        return new akm(new akp(localeList));
    }

    public final Locale d() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof akm) && this.a.equals(((akm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
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
}
