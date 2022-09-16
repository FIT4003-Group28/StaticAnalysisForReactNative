package defpackage;

import java.io.Serializable;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bajq  reason: default package */
/* loaded from: classes2.dex */
public abstract class bajq implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    protected abstract long a();

    protected bahl b() {
        throw null;
    }

    public abstract bahn c();

    public final int d() {
        return c().a(a());
    }

    public final String e(Locale locale) {
        return c().k(a(), locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bajq)) {
            return false;
        }
        bajq bajqVar = (bajq) obj;
        return d() == bajqVar.d() && g().equals(bajqVar.g()) && bajw.f(b(), bajqVar.b());
    }

    public final String f(Locale locale) {
        return c().m(a(), locale);
    }

    public final bahp g() {
        return c().o();
    }

    public final int hashCode() {
        return (d() * 17) + g().hashCode() + b().hashCode();
    }

    public final String toString() {
        String n = c().n();
        StringBuilder sb = new StringBuilder(n.length() + 10);
        sb.append("Property[");
        sb.append(n);
        sb.append("]");
        return sb.toString();
    }
}
