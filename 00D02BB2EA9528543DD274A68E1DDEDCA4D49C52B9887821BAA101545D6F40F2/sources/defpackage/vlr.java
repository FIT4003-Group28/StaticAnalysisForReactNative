package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vlr  reason: default package */
/* loaded from: classes7.dex */
public final class vlr extends vmd {
    public final dwaw a;
    public final buad b;
    public final boolean c;
    public final long d;
    public final int e;
    public final btzi<dwaw, dwbc> f;

    public vlr(dwaw dwawVar, buad buadVar, boolean z, long j, int i, btzi<dwaw, dwbc> btziVar) {
        this.a = dwawVar;
        this.b = buadVar;
        this.c = z;
        this.d = j;
        this.e = i;
        this.f = btziVar;
    }

    @Override // defpackage.vmd
    public final dwaw a() {
        return this.a;
    }

    @Override // defpackage.vmd
    public final buad b() {
        return this.b;
    }

    @Override // defpackage.vmd
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.vmd
    public final long d() {
        return this.d;
    }

    @Override // defpackage.vmd
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmd) {
            vmd vmdVar = (vmd) obj;
            if (this.a.equals(vmdVar.a()) && this.b.equals(vmdVar.b()) && this.c == vmdVar.c() && this.d == vmdVar.d() && this.e == vmdVar.e() && this.f.equals(vmdVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vmd
    public final btzi<dwaw, dwbc> f() {
        return this.f;
    }

    @Override // defpackage.vmd
    public final vmc g() {
        return new vlq(this);
    }

    public final int hashCode() {
        dwaw dwawVar = this.a;
        int i = dwawVar.bC;
        if (i == 0) {
            i = dsst.a.b(dwawVar).c(dwawVar);
            dwawVar.bC = i;
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i2 = true != this.c ? 1237 : 1231;
        long j = this.d;
        return this.f.hashCode() ^ ((((((hashCode ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        long j = this.d;
        int i = this.e;
        String valueOf3 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 139 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Request{proto=");
        sb.append(valueOf);
        sb.append(", options=");
        sb.append(valueOf2);
        sb.append(", hasUncertainFromPoint=");
        sb.append(z);
        sb.append(", creationTimeMillis=");
        sb.append(j);
        sb.append(", numRetriesAttempted=");
        sb.append(i);
        sb.append(", callback=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
