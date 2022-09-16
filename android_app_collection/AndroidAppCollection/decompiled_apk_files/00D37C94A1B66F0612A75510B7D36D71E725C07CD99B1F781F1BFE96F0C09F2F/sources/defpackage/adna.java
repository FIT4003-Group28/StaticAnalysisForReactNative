package defpackage;
/* compiled from: PG */
/* renamed from: adna  reason: default package */
/* loaded from: classes.dex */
public final class adna {
    public final adit a;

    public adna() {
    }

    public adna(adit aditVar) {
        this.a = aditVar;
    }

    public static admz a() {
        admz admzVar = new admz();
        admzVar.b(new adit(""));
        return admzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adna)) {
            return false;
        }
        return this.a.equals(((adna) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("DialSessionInfo{hardwareDeviceId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
