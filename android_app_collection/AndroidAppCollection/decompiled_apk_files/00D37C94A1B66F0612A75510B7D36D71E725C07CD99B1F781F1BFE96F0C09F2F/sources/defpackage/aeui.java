package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aeui  reason: default package */
/* loaded from: classes.dex */
public final class aeui {
    public final String a;
    private final Map b;

    public aeui(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static Map e(pwu pwuVar) {
        HashMap hashMap = new HashMap();
        String s = pwuVar.s();
        while (!TextUtils.isEmpty(s)) {
            String[] split = s.split(": ");
            if (split.length >= 2) {
                hashMap.put(split[0], split[1]);
            }
            s = pwuVar.s();
        }
        return hashMap;
    }

    public final Double a(String str) {
        try {
            if (!this.b.containsKey(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble((String) this.b.get(str)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Integer b(String str) {
        try {
            if (!this.b.containsKey(str)) {
                return null;
            }
            return Integer.valueOf((String) this.b.get(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Long c(String str) {
        try {
            if (!this.b.containsKey(str)) {
                return null;
            }
            return Long.valueOf((String) this.b.get(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final String d(String str) {
        return (String) this.b.get(str);
    }

    public final String toString() {
        String str = this.a;
        int size = this.b.size();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("EmbeddedMetadata(scheme='");
        sb.append(str);
        sb.append("', numKeys=");
        sb.append(size);
        sb.append(")");
        return sb.toString();
    }
}
