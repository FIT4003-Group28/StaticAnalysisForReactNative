package defpackage;

import java.util.Arrays;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dyva  reason: default package */
/* loaded from: classes6.dex */
public final class dyva {
    public final String a;
    public final Map<String, ?> b;

    public dyva(String str, Map<String, ?> map) {
        dbsk.t(str, "policyName");
        this.a = str;
        dbsk.t(map, "rawConfigValue");
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dyva) {
            dyva dyvaVar = (dyva) obj;
            if (this.a.equals(dyvaVar.a) && this.b.equals(dyvaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("policyName", this.a);
        b.b("rawConfigValue", this.b);
        return b.toString();
    }
}
