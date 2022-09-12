package defpackage;
/* compiled from: PG */
/* renamed from: cvom  reason: default package */
/* loaded from: classes5.dex */
public final class cvom extends cvoq {
    private final String a;
    private final boolean b;

    public cvom(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.cvoq
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cvoq
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvoq) {
            cvoq cvoqVar = (cvoq) obj;
            if (this.a.equals(cvoqVar.a()) && this.b == cvoqVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append("ChimeNotificationChannelGroup{id=");
        sb.append(str);
        sb.append(", blocked=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
