package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dgp  reason: default package */
/* loaded from: classes3.dex */
public abstract class dgp {
    public float c;
    public Map a = null;
    public ArrayList b = null;
    public long d = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract float a(long j);

    public final int d() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final dgp e() {
        if (d() > 1) {
            throw new RuntimeException("Trying to get single input of node with multiple inputs!");
        }
        return f("default_input");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final dgp f(String str) {
        String str2;
        dgp g = g(str);
        if (g == null) {
            Map map = this.a;
            if (map != null) {
                Iterator it = map.keySet().iterator();
                String str3 = "";
                while (it.hasNext()) {
                    String valueOf = String.valueOf(str3);
                    String str4 = (String) it.next();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(str4).length());
                    sb.append(valueOf);
                    sb.append("'");
                    sb.append(str4);
                    sb.append("'");
                    str3 = sb.toString();
                    if (!it.hasNext()) {
                        str3 = String.valueOf(str3).concat(", ");
                    }
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 2);
                sb2.append("[");
                sb2.append(str3);
                sb2.append("]");
                str2 = sb2.toString();
            } else {
                str2 = "[]";
            }
            StringBuilder sb3 = new StringBuilder(str.length() + 64 + String.valueOf(str2).length());
            sb3.append("Tried to get non-existent input '");
            sb3.append(str);
            sb3.append("'. Node only has these inputs: ");
            sb3.append(str2);
            throw new RuntimeException(sb3.toString());
        }
        return g;
    }

    public final dgp g(String str) {
        Map map = this.a;
        if (map == null) {
            return null;
        }
        return (dgp) map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Collection h() {
        Map map = this.a;
        if (map == null) {
            return Collections.emptySet();
        }
        return map.values();
    }
}
