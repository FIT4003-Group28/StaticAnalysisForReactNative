package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: akn  reason: default package */
/* loaded from: classes.dex */
final class akn implements ako {
    private static final Locale[] a = new Locale[0];
    private final Locale[] b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        akm.c();
    }

    public akn(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.b = a;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException("list[" + i + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                locale2.getLanguage();
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    locale2.getCountry();
                }
                hashSet.add(locale2);
            }
        }
        this.b = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
    }

    @Override // defpackage.ako
    public final Object a() {
        return null;
    }

    @Override // defpackage.ako
    public final Locale b() {
        Locale[] localeArr = this.b;
        if (localeArr.length > 0) {
            return localeArr[0];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akn)) {
            return false;
        }
        Locale[] localeArr = ((akn) obj).b;
        if (this.b.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.b;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.b;
            if (i2 < localeArr.length) {
                i = (i * 31) + localeArr[i2].hashCode();
                i2++;
            } else {
                return i;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.b;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.b.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
