package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yqp  reason: default package */
/* loaded from: classes4.dex */
public final class yqp {
    public static final yqp a = new yqp(Collections.emptyList());
    public final Collection b;

    public yqp(Collection collection) {
        this.b = collection;
    }

    public static abhq c() {
        return new abhq();
    }

    public final String a(String str) {
        for (Map.Entry entry : this.b) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    public final Map b() {
        yqo yqoVar = new yqo(this.b.size());
        for (Map.Entry entry : this.b) {
            yqoVar.put((String) entry.getKey(), (String) entry.getValue());
        }
        return Collections.unmodifiableMap(yqoVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yqp)) {
            return false;
        }
        return this.b.equals(((yqp) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
