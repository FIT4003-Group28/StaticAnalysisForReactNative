package defpackage;

import java.io.Serializable;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: easr  reason: default package */
/* loaded from: classes6.dex */
public abstract class easr implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    public abstract eaon a();

    public abstract long b();

    protected eaok c() {
        throw null;
    }

    public final eaop e() {
        return a().a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof easr)) {
            return false;
        }
        easr easrVar = (easr) obj;
        return f() == easrVar.f() && e().equals(easrVar.e()) && easy.g(c(), easrVar.c());
    }

    public final int f() {
        return a().d(b());
    }

    public final String g(Locale locale) {
        return a().e(b(), locale);
    }

    public final String h(Locale locale) {
        return a().h(b(), locale);
    }

    public final int hashCode() {
        return (f() * 17) + e().hashCode() + c().hashCode();
    }

    public final String toString() {
        String b = a().b();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 10);
        sb.append("Property[");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
}
