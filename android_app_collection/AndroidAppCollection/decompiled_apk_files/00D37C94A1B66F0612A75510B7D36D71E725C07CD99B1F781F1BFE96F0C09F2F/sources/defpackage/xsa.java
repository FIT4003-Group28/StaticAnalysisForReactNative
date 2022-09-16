package defpackage;
/* compiled from: PG */
/* renamed from: xsa  reason: default package */
/* loaded from: classes4.dex */
final class xsa extends xsd {
    private final ampq a;

    public xsa(ampq ampqVar) {
        this.a = ampqVar;
    }

    @Override // defpackage.xsd
    public ampq a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xsd)) {
            return false;
        }
        return this.a.equals(((xsd) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("FooterSetEvent{renderer=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
