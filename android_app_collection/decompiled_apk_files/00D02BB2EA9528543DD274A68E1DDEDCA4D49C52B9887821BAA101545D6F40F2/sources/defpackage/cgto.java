package defpackage;
/* compiled from: PG */
/* renamed from: cgto  reason: default package */
/* loaded from: classes4.dex */
public final class cgto extends cgtt {
    private final cgtv a;
    private final String b;
    private final cgtu c;

    public cgto(cgtv cgtvVar, String str, @dzsi cgtu cgtuVar) {
        if (cgtvVar != null) {
            this.a = cgtvVar;
            if (str != null) {
                this.b = str;
                this.c = cgtuVar;
                return;
            }
            throw new NullPointerException("Null featureId");
        }
        throw new NullPointerException("Null requestType");
    }

    @Override // defpackage.cgtt
    public final cgtv a() {
        return this.a;
    }

    @Override // defpackage.cgtt
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cgtt
    @dzsi
    public final cgtu c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgtt) {
            cgtt cgttVar = (cgtt) obj;
            if (this.a.equals(cgttVar.a()) && this.b.equals(cgttVar.b()) && this.c.equals(cgttVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 56 + str.length() + String.valueOf(valueOf2).length());
        sb.append("ReminderRequestInfo{requestType=");
        sb.append(valueOf);
        sb.append(", featureId=");
        sb.append(str);
        sb.append(", listener=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
