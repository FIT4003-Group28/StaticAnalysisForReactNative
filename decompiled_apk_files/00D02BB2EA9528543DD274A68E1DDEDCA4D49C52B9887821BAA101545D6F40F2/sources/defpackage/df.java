package defpackage;

import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: df  reason: default package */
/* loaded from: classes6.dex */
public final class df extends cw {
    public Map<String, String> a;
    public Map<String, String> b;
    private final Map<String, de> e = new HashMap();
    private static final ResourceBundle d = new cl();
    public static final df c = new df();

    private df() {
    }

    public final void a() {
        Map<String, String> map;
        Map<String, String> emptyMap;
        Map<String, String> emptyMap2;
        synchronized (this) {
            map = this.a;
        }
        if (map == null) {
            try {
                ResourceBundle resourceBundle = d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                emptyMap = new TreeMap<>();
                for (Object[] objArr2 : objArr) {
                    emptyMap.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                emptyMap2 = new TreeMap<>();
                for (Object[] objArr4 : objArr3) {
                    emptyMap2.put((String) objArr4[0], (String) objArr4[1]);
                }
            } catch (MissingResourceException unused) {
                emptyMap = Collections.emptyMap();
                emptyMap2 = Collections.emptyMap();
            }
            synchronized (this) {
                if (this.a == null) {
                    this.a = emptyMap;
                    this.b = emptyMap2;
                }
            }
        }
    }

    public final de b(String str) {
        boolean containsKey;
        Object[][] objArr;
        de deVar;
        synchronized (this.e) {
            containsKey = this.e.containsKey(str);
            objArr = null;
            deVar = containsKey ? this.e.get(str) : null;
        }
        if (!containsKey) {
            try {
                Object[][] objArr2 = (Object[][]) d.getObject("rules");
                int length = objArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Object[] objArr3 = objArr2[i];
                    if (str.equals(objArr3[0])) {
                        objArr = (Object[][]) objArr3[1];
                        break;
                    }
                    i++;
                }
                StringBuilder sb = new StringBuilder();
                for (Object[] objArr4 : objArr) {
                    if (sb.length() > 0) {
                        sb.append("; ");
                    }
                    sb.append((String) objArr4[0]);
                    sb.append(": ");
                    sb.append((String) objArr4[1]);
                }
                deVar = de.a(sb.toString());
            } catch (ParseException | MissingResourceException unused) {
            }
            synchronized (this.e) {
                if (this.e.containsKey(str)) {
                    deVar = this.e.get(str);
                } else {
                    this.e.put(str, deVar);
                }
            }
        }
        return deVar;
    }
}
