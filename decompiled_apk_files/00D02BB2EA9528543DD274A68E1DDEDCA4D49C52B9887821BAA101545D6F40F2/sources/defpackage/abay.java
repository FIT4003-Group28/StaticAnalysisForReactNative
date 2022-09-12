package defpackage;
/* compiled from: PG */
/* renamed from: abay  reason: default package */
/* loaded from: classes2.dex */
final class abay extends abbk {
    private final String a;
    private final boolean b;
    private final Runnable c;

    public abay(String str, boolean z, Runnable runnable) {
        this.a = str;
        this.b = z;
        this.c = runnable;
    }

    @Override // defpackage.abbk
    public final String a() {
        return this.a;
    }

    @Override // defpackage.abbk
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.abbk
    public final Runnable c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abbk) {
            abbk abbkVar = (abbk) obj;
            if (this.a.equals(abbkVar.a()) && this.b == abbkVar.b() && this.c.equals(abbkVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47 + String.valueOf(valueOf).length());
        sb.append("Options{mid=");
        sb.append(str);
        sb.append(", fromMapClick=");
        sb.append(z);
        sb.append(", pickHandler=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
