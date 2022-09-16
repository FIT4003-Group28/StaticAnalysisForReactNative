package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: uhr  reason: default package */
/* loaded from: classes4.dex */
public final class uhr {
    public static final uhr a = a("Content-Encoding");
    public final String b;

    static {
        a("Content-Type");
    }

    public uhr(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public static uhr a(String str) {
        aqxo.u(amoq.a.e(str), "Only ASCII characters are permitted in header keys: %s", str);
        return new uhr(str.toLowerCase(Locale.US));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uhr)) {
            return false;
        }
        return this.b.equals(((uhr) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("GnpHttpHeaderKey{key=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public uhr() {
    }
}
