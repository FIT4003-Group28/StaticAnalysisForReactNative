package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amxt  reason: default package */
/* loaded from: classes.dex */
public final class amxt extends amxu implements Serializable, ampt {
    public static final amxt a = new amxt(amsx.a, amsv.a);
    private static final long serialVersionUID = 0;
    public final amsz b;
    public final amsz c;

    private amxt(amsz amszVar, amsz amszVar2) {
        this.b = amszVar;
        this.c = amszVar2;
        if (amszVar.compareTo(amszVar2) > 0 || amszVar == amsv.a || amszVar2 == amsx.a) {
            String valueOf = String.valueOf(n(amszVar, amszVar2));
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid range: ".concat(valueOf) : new String("Invalid range: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static amxr c() {
        return amxs.a;
    }

    public static amxt d(Comparable comparable, Comparable comparable2) {
        return f(amsz.f(comparable), new amsw(comparable2));
    }

    public static amxt e(Comparable comparable, Comparable comparable2) {
        return f(amsz.f(comparable), amsz.f(comparable2));
    }

    public static amxt f(amsz amszVar, amsz amszVar2) {
        return new amxt(amszVar, amszVar2);
    }

    private static String n(amsz amszVar, amsz amszVar2) {
        StringBuilder sb = new StringBuilder(16);
        amszVar.c(sb);
        sb.append("..");
        amszVar2.d(sb);
        return sb.toString();
    }

    @Override // defpackage.ampt
    public final boolean equals(Object obj) {
        if (obj instanceof amxt) {
            amxt amxtVar = (amxt) obj;
            if (this.b.equals(amxtVar.b) && this.c.equals(amxtVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final Comparable g() {
        return this.b.b();
    }

    public final Comparable h() {
        return this.c.b();
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    @Override // defpackage.ampt
    /* renamed from: i */
    public final boolean a(Comparable comparable) {
        comparable.getClass();
        return this.b.e(comparable) && !this.c.e(comparable);
    }

    public final boolean j(amxt amxtVar) {
        return this.b.compareTo(amxtVar.b) <= 0 && this.c.compareTo(amxtVar.c) >= 0;
    }

    public final boolean k() {
        return this.c != amsv.a;
    }

    public final boolean l(amxt amxtVar) {
        return this.b.compareTo(amxtVar.c) <= 0 && amxtVar.b.compareTo(this.c) <= 0;
    }

    public final boolean m() {
        return this.b.equals(this.c);
    }

    Object readResolve() {
        amxt amxtVar = a;
        return equals(amxtVar) ? amxtVar : this;
    }

    public final String toString() {
        return n(this.b, this.c);
    }
}
