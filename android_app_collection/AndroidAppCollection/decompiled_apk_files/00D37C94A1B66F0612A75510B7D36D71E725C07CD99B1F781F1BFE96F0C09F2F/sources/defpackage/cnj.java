package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cnj  reason: default package */
/* loaded from: classes2.dex */
public final class cnj implements cng {
    public final Map b;
    public volatile Map c;

    public cnj(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cnj) {
            return this.b.equals(((cnj) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("LazyHeaders{headers=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
