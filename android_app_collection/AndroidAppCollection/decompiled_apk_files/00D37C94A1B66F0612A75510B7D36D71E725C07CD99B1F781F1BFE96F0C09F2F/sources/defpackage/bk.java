package defpackage;

import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: bk  reason: default package */
/* loaded from: classes2.dex */
public final class bk extends bb {
    public Map b;
    public Map c;
    private final Map e = new HashMap();
    private static final ResourceBundle d = new aq();
    public static final bk a = new bk();

    private bk() {
    }

    public final bj c(String str) {
        boolean containsKey;
        Object[][] objArr;
        bj bjVar;
        synchronized (this.e) {
            containsKey = this.e.containsKey(str);
            objArr = null;
            bjVar = containsKey ? (bj) this.e.get(str) : null;
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
                bjVar = bj.b(sb.toString());
            } catch (ParseException | MissingResourceException unused) {
            }
            synchronized (this.e) {
                if (this.e.containsKey(str)) {
                    bjVar = (bj) this.e.get(str);
                } else {
                    this.e.put(str, bjVar);
                }
            }
        }
        return bjVar;
    }

    public final void d() {
        Map map;
        Map emptyMap;
        Map emptyMap2;
        synchronized (this) {
            map = this.b;
        }
        if (map == null) {
            try {
                ResourceBundle resourceBundle = d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                emptyMap = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    emptyMap.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                emptyMap2 = new TreeMap();
                for (Object[] objArr4 : objArr3) {
                    emptyMap2.put((String) objArr4[0], (String) objArr4[1]);
                }
            } catch (MissingResourceException unused) {
                emptyMap = Collections.emptyMap();
                emptyMap2 = Collections.emptyMap();
            }
            synchronized (this) {
                if (this.b == null) {
                    this.b = emptyMap;
                    this.c = emptyMap2;
                }
            }
        }
    }
}
