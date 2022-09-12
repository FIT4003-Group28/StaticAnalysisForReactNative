package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aku  reason: default package */
/* loaded from: classes2.dex */
final class aku implements akv {
    private static final Locale[] b = new Locale[0];
    private final Locale[] a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        akt.c();
    }

    public aku(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.a = b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = localeArr.length;
            if (i < length) {
                Locale locale = localeArr[i];
                if (locale != null) {
                    if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        arrayList.add(locale2);
                        sb.append(locale2.getLanguage());
                        String country = locale2.getCountry();
                        if (country != null && !country.isEmpty()) {
                            sb.append('-');
                            sb.append(locale2.getCountry());
                        }
                        if (i < length - 1) {
                            sb.append(',');
                        }
                        hashSet.add(locale2);
                    }
                    i++;
                } else {
                    throw new NullPointerException("list[" + i + "] is null");
                }
            } else {
                this.a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
                sb.toString();
                return;
            }
        }
    }

    @Override // defpackage.akv
    public final Object a() {
        return null;
    }

    @Override // defpackage.akv
    public final Locale b() {
        Locale[] localeArr = this.a;
        if (localeArr.length > 0) {
            return localeArr[0];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aku)) {
            return false;
        }
        Locale[] localeArr = ((aku) obj).a;
        if (this.a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.a;
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
            Locale[] localeArr = this.a;
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
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.a.length - 1) {
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
