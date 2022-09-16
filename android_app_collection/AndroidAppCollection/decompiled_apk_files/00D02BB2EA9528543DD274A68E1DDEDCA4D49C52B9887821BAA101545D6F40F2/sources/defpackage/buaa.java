package defpackage;
/* compiled from: PG */
/* renamed from: buaa  reason: default package */
/* loaded from: classes4.dex */
public final class buaa<T> extends buab<T> {
    public final T a;
    private final String b;

    public buaa(String str, T t) {
        this.b = str;
        if (t != null) {
            this.a = t;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // defpackage.buab
    public final String a() {
        return this.b;
    }

    @Override // defpackage.buab
    public final T b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof buab) {
            buab buabVar = (buab) obj;
            if (this.b.equals(buabVar.a()) && this.a.equals(buabVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 22 + String.valueOf(valueOf).length());
        sb.append("Metadata{key=");
        sb.append(str);
        sb.append(", value=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
