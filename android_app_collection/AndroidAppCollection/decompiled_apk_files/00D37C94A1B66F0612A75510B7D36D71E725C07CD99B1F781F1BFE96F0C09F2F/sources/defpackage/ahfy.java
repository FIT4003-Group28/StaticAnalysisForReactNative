package defpackage;
/* compiled from: PG */
/* renamed from: ahfy  reason: default package */
/* loaded from: classes.dex */
final class ahfy extends ahhn {
    private final String a;

    public ahfy(String str) {
        this.a = str;
    }

    @Override // defpackage.ahhn
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahhn)) {
            return false;
        }
        return this.a.equals(((ahhn) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("StaleConfigEvent{videoId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
