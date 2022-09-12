package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: duhx  reason: default package */
/* loaded from: classes6.dex */
public final class duhx {
    public final Map<String, List<String>> a = new HashMap();

    public final void a(String str, String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        dbsk.a(z);
        dbsk.s(str2);
        String lowerCase = str.toLowerCase(Locale.US);
        this.a.put(lowerCase, new ArrayList());
        this.a.get(lowerCase).add(str2);
    }

    public final Set<String> b() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    public final List<String> c(String str) {
        List<String> list = this.a.get(str.toLowerCase(Locale.US));
        return list == null ? dcdc.e() : list;
    }

    public final String d(String str) {
        if (!this.a.containsKey(str.toLowerCase(Locale.US))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : this.a.get(str.toLowerCase(Locale.US))) {
            if (str2 != null) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.a.entrySet());
        Collections.sort(arrayList, duhw.a);
        StringBuilder sb = new StringBuilder("{");
        dbrz.e(", ").l().b(sb, arrayList.iterator());
        sb.append('}');
        return sb.toString();
    }
}
