package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crwu  reason: default package */
/* loaded from: classes5.dex */
public final class crwu extends crxb {
    public final String a;
    public final crti b;
    public final dcdc<String> c;
    public final Long d;

    public crwu(String str, crti crtiVar, dcdc<String> dcdcVar, Long l) {
        this.a = str;
        this.b = crtiVar;
        this.c = dcdcVar;
        this.d = l;
    }

    @Override // defpackage.crxb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.crxb
    public final crti b() {
        return this.b;
    }

    @Override // defpackage.crxb
    public final dcdc<String> c() {
        return this.c;
    }

    @Override // defpackage.crxb
    public final Long d() {
        return this.d;
    }

    @Override // defpackage.crxb
    public final crxa e() {
        return new crwt(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crxb) {
            crxb crxbVar = (crxb) obj;
            if (this.a.equals(crxbVar.a()) && this.b.equals(crxbVar.b()) && dchl.m(this.c, crxbVar.c()) && this.d.equals(crxbVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        crti crtiVar = this.b;
        int i = crtiVar.bC;
        if (i == 0) {
            i = dsst.a.b(crtiVar).c(crtiVar);
            crtiVar.bC = i;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 68 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RequestInfo{requestId=");
        sb.append(str);
        sb.append(", requestData=");
        sb.append(valueOf);
        sb.append(", gpuMediaIdList=");
        sb.append(valueOf2);
        sb.append(", requestTime=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
