package defpackage;
/* compiled from: PG */
/* renamed from: ctxr  reason: default package */
/* loaded from: classes5.dex */
final class ctxr extends ctxz {
    private final dbsg<Integer> a;
    private final dbsg<Integer> b;
    private final dbsg<Long> c;

    public ctxr(dbsg<Integer> dbsgVar, dbsg<Integer> dbsgVar2, dbsg<Long> dbsgVar3) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dbsgVar3;
    }

    @Override // defpackage.ctxz
    public final dbsg<Integer> a() {
        return this.a;
    }

    @Override // defpackage.ctxz
    public final dbsg<Integer> b() {
        return this.b;
    }

    @Override // defpackage.ctxz
    public final dbsg<Long> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctxz) {
            ctxz ctxzVar = (ctxz) obj;
            if (this.a.equals(ctxzVar.a()) && this.b.equals(ctxzVar.b()) && this.c.equals(ctxzVar.c())) {
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
        StringBuilder sb = new StringBuilder(length + 94 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("BootstrapDetail{numberOfMessagesDeleted=");
        sb.append(valueOf);
        sb.append(", numberOfConversationDownloaded=");
        sb.append(valueOf2);
        sb.append(", bootstrapDuration=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
