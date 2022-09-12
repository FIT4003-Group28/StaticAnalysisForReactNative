package defpackage;
/* compiled from: PG */
/* renamed from: cukj  reason: default package */
/* loaded from: classes5.dex */
final class cukj extends cukn {
    private final String a;
    private final int b;

    public cukj(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.cukn
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cukn
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cukn) {
            cukn cuknVar = (cukn) obj;
            if (this.a.equals(cuknVar.a()) && this.b == cuknVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
        sb.append("LighterMediaId{resourceId=");
        sb.append(str);
        sb.append(", resourceRegion=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
