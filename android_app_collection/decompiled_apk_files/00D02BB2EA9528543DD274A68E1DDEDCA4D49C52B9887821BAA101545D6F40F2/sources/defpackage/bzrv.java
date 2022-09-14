package defpackage;
/* compiled from: PG */
/* renamed from: bzrv  reason: default package */
/* loaded from: classes4.dex */
final class bzrv extends bzsu {
    private final String a;

    public bzrv(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null selection");
    }

    @Override // defpackage.bztm
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bzsu)) {
            return false;
        }
        return this.a.equals(((bzsu) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("FilterImpl{selection=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
