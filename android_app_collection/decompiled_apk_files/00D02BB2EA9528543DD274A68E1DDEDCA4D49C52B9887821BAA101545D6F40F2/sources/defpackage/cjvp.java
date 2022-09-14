package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjvp  reason: default package */
/* loaded from: classes4.dex */
public final class cjvp extends cjvz {
    public final btlu a;
    public final dcdc<cjtk> b;
    public final cjwj c;

    public cjvp(@dzsi btlu btluVar, dcdc<cjtk> dcdcVar, cjwj cjwjVar) {
        this.a = btluVar;
        if (dcdcVar != null) {
            this.b = dcdcVar;
            if (cjwjVar != null) {
                this.c = cjwjVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null events");
    }

    @Override // defpackage.cjvz
    @dzsi
    public final btlu a() {
        return this.a;
    }

    @Override // defpackage.cjvz
    public final dcdc<cjtk> b() {
        return this.b;
    }

    @Override // defpackage.cjvz
    public final cjwj c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjvz) {
            cjvz cjvzVar = (cjvz) obj;
            btlu btluVar = this.a;
            if (btluVar != null ? btluVar.equals(cjvzVar.a()) : cjvzVar.a() == null) {
                if (dchl.m(this.b, cjvzVar.b()) && this.c.equals(cjvzVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        btlu btluVar = this.a;
        return (((((btluVar == null ? 0 : btluVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("LoggingRequest{gmmAccount=");
        sb.append(valueOf);
        sb.append(", events=");
        sb.append(valueOf2);
        sb.append(", priority=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
