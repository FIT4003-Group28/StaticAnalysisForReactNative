package defpackage;
/* compiled from: PG */
/* renamed from: arxh  reason: default package */
/* loaded from: classes2.dex */
public final class arxh extends arxj {
    public final CharSequence a;
    public final cqtd b;
    public final String c;

    public arxh(@dzsi CharSequence charSequence, @dzsi cqtd cqtdVar, String str) {
        this.a = charSequence;
        this.b = cqtdVar;
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    @Override // defpackage.arxj
    @dzsi
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.arxj
    @dzsi
    public final cqtd b() {
        return this.b;
    }

    @Override // defpackage.arxj
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arxj) {
            arxj arxjVar = (arxj) obj;
            CharSequence charSequence = this.a;
            if (charSequence != null ? charSequence.equals(arxjVar.a()) : arxjVar.a() == null) {
                cqtd cqtdVar = this.b;
                if (cqtdVar != null ? cqtdVar.equals(arxjVar.b()) : arxjVar.b() == null) {
                    if (this.c.equals(arxjVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int i = 0;
        int hashCode = ((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003;
        cqtd cqtdVar = this.b;
        if (cqtdVar != null) {
            i = cqtdVar.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 52 + String.valueOf(valueOf2).length() + str.length());
        sb.append("MediaAppProperties{appName=");
        sb.append(valueOf);
        sb.append(", appIcon=");
        sb.append(valueOf2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
