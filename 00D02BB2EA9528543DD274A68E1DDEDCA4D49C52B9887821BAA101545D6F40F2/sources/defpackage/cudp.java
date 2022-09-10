package defpackage;
/* compiled from: PG */
/* renamed from: cudp  reason: default package */
/* loaded from: classes5.dex */
final class cudp extends cugf {
    private final String a;
    private final ctzl b;
    private final dbsg<byte[]> c;

    public cudp(String str, ctzl ctzlVar, dbsg<byte[]> dbsgVar) {
        this.a = str;
        this.b = ctzlVar;
        this.c = dbsgVar;
    }

    @Override // defpackage.cugf
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cugf
    public final ctzl b() {
        return this.b;
    }

    @Override // defpackage.cugf
    public final dbsg<byte[]> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cugf) {
            cugf cugfVar = (cugf) obj;
            if (this.a.equals(cugfVar.a()) && this.b.equals(cugfVar.b()) && this.c.equals(cugfVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 42 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("LighterMenuItem{menuName=");
        sb.append(str);
        sb.append(", action=");
        sb.append(valueOf);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
