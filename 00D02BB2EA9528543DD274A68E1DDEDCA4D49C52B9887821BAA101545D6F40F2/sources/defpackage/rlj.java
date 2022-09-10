package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rlj  reason: default package */
/* loaded from: classes7.dex */
public final class rlj extends rlm {
    private final dbsg<dnlg> a;
    private final dbsg<amub> b;
    private final rll c;

    public rlj(dbsg<dnlg> dbsgVar, dbsg<amub> dbsgVar2, rll rllVar) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        if (rllVar != null) {
            this.c = rllVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // defpackage.rlm
    public final dbsg<dnlg> a() {
        return this.a;
    }

    @Override // defpackage.rlm
    public final dbsg<amub> b() {
        return this.b;
    }

    @Override // defpackage.rlm
    public final rll c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rlm) {
            rlm rlmVar = (rlm) obj;
            if (this.a.equals(rlmVar.a()) && this.b.equals(rlmVar.b()) && this.c.equals(rlmVar.c())) {
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
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ReverserResult{frequentRoute=");
        sb.append(valueOf);
        sb.append(", routeDescription=");
        sb.append(valueOf2);
        sb.append(", status=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
