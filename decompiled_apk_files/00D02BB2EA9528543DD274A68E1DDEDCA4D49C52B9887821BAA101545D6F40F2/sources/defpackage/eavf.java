package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eavf  reason: default package */
/* loaded from: classes.dex */
public final class eavf {
    private final HashMap<Locale, Map<String, Map<String, Object>>> a = c();
    private final HashMap<Locale, Map<String, Map<Boolean, Object>>> b = c();

    private static final HashMap c() {
        return new HashMap(7);
    }

    public final synchronized String[] a(Locale locale, String str, String str2) {
        Object[] objArr;
        Object[] objArr2 = null;
        if (locale != null) {
            Map<String, Map<String, Object>> map = this.a.get(locale);
            if (map == null) {
                HashMap<Locale, Map<String, Map<String, Object>>> hashMap = this.a;
                HashMap c = c();
                hashMap.put(locale, c);
                map = c;
            }
            Map<String, Object> map2 = map.get(str);
            if (map2 == null) {
                map2 = c();
                map.put(str, map2);
                Object[][] zoneStrings = eaor.h(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        objArr = null;
                        break;
                    }
                    objArr = zoneStrings[i];
                    if (objArr != null && objArr.length >= 5 && str.equals(objArr[0])) {
                        break;
                    }
                    i++;
                }
                Object[][] zoneStrings2 = eaor.h(locale).getZoneStrings();
                int length2 = zoneStrings2.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        Object[] objArr3 = zoneStrings2[i2];
                        if (objArr3 != null && objArr3.length >= 5 && str.equals(objArr3[0])) {
                            objArr2 = objArr3;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                if (objArr != null && objArr2 != null) {
                    map2.put(objArr[2], new String[]{objArr2[2], objArr2[1]});
                    if (objArr[2].equals(objArr[4])) {
                        map2.put(String.valueOf(objArr[4]).concat("-Summer"), new String[]{objArr2[4], objArr2[3]});
                    } else {
                        map2.put(objArr[4], new String[]{objArr2[4], objArr2[3]});
                    }
                }
            }
            return (String[]) map2.get(str2);
        }
        return null;
    }

    public final synchronized String[] b(Locale locale, String str, boolean z) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale != null) {
            Map<String, Map<Boolean, Object>> map = this.b.get(locale);
            if (map == null) {
                HashMap<Locale, Map<String, Map<Boolean, Object>>> hashMap = this.b;
                HashMap c = c();
                hashMap.put(locale, c);
                map = c;
            }
            Map<Boolean, Object> map2 = map.get(str);
            if (map2 == null) {
                map2 = c();
                map.put(str, map2);
                String[][] zoneStrings = eaor.h(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i];
                    if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i++;
                }
                String[][] zoneStrings2 = eaor.h(locale).getZoneStrings();
                int length2 = zoneStrings2.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        String[] strArr3 = zoneStrings2[i2];
                        if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                            strArr2 = strArr3;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                if (strArr != null && strArr2 != null) {
                    map2.put(Boolean.TRUE, new String[]{strArr2[2], strArr2[1]});
                    map2.put(Boolean.FALSE, new String[]{strArr2[4], strArr2[3]});
                }
            }
            return (String[]) map2.get(Boolean.valueOf(z));
        }
        return null;
    }
}