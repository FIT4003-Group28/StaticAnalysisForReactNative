package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: acup  reason: default package */
/* loaded from: classes.dex */
public final class acup {
    public final int a;
    private final Map b;
    private final boolean c;

    public acup(boolean z, Map map, int i, String str) {
        this.c = z;
        this.b = map;
        this.a = i;
        if (!z || map.containsKey(Integer.valueOf(i))) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 72);
        sb.append("Invalid VeType: ");
        sb.append(i);
        sb.append(". Please use a valid veType defined in class ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof acup) && this.a == ((acup) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        if (this.c) {
            return (String) this.b.get(Integer.valueOf(this.a));
        }
        return String.valueOf(this.a);
    }
}
