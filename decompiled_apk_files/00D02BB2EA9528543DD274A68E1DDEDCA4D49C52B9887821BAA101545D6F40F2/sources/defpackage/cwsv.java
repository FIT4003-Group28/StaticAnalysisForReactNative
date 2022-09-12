package defpackage;
/* compiled from: PG */
/* renamed from: cwsv  reason: default package */
/* loaded from: classes.dex */
public final class cwsv {
    public final String a;

    public cwsv(String str) {
        this.a = str;
    }

    public static cwsv a(String str) {
        return new cwsv(str);
    }

    public static cwsv b(Enum<?> r3) {
        if (!dbsj.d(null)) {
            String valueOf = String.valueOf(r3.name());
            return new cwsv(valueOf.length() != 0 ? "null".concat(valueOf) : new String("null"));
        }
        return new cwsv(r3.name());
    }

    public static cwsv c(cwsv cwsvVar, cwsv cwsvVar2) {
        String valueOf = String.valueOf(cwsvVar.a);
        String valueOf2 = String.valueOf(cwsvVar2.a);
        return new cwsv(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public static String d(cwsv cwsvVar) {
        if (cwsvVar == null) {
            return null;
        }
        return cwsvVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cwsv) {
            return this.a.equals(((cwsv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
