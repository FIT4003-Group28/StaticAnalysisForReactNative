package defpackage;
/* compiled from: PG */
/* renamed from: zaw  reason: default package */
/* loaded from: classes4.dex */
public final class zaw {
    public final yzr a;

    public zaw() {
    }

    public zaw(yzr yzrVar) {
        this.a = yzrVar;
    }

    public static zaw a(yzr yzrVar) {
        return new zaw(yzrVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zaw)) {
            return false;
        }
        return this.a.equals(((zaw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("WindowInsets{insets=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
