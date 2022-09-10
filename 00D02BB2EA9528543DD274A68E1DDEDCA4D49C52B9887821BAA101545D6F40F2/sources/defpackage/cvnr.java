package defpackage;
/* compiled from: PG */
/* renamed from: cvnr  reason: default package */
/* loaded from: classes5.dex */
final class cvnr extends cvns {
    private final dsef a;
    private final String b;
    private final int c;

    public cvnr(dsef dsefVar, String str, int i) {
        if (dsefVar != null) {
            this.a = dsefVar;
            if (str != null) {
                this.b = str;
                this.c = i;
                return;
            }
            throw new NullPointerException("Null actionId");
        }
        throw new NullPointerException("Null threadStateUpdate");
    }

    @Override // defpackage.cvns
    public final dsef a() {
        return this.a;
    }

    @Override // defpackage.cvns
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cvns
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvns) {
            cvns cvnsVar = (cvns) obj;
            if (this.a.equals(cvnsVar.a()) && this.b.equals(cvnsVar.b()) && this.c == cvnsVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dsef dsefVar = this.a;
        int i = dsefVar.bC;
        if (i == 0) {
            i = dsst.a.b(dsefVar).c(dsefVar);
            dsefVar.bC = i;
        }
        return this.c ^ ((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(Integer.toString(this.c - 1));
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 62 + str.length() + String.valueOf(valueOf2).length());
        sb.append("SdkBatchUpdateKey{threadStateUpdate=");
        sb.append(valueOf);
        sb.append(", actionId=");
        sb.append(str);
        sb.append(", eventSource=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
