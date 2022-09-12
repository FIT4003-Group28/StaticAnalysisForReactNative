package defpackage;
/* compiled from: PG */
/* renamed from: cuis  reason: default package */
/* loaded from: classes5.dex */
public final class cuis extends cuiu {
    public final cukn a;
    public final int b;

    public cuis(cukn cuknVar, int i) {
        this.a = cuknVar;
        this.b = i;
    }

    @Override // defpackage.cuiu
    public final cukn a() {
        return this.a;
    }

    @Override // defpackage.cuiu
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuiu) {
            cuiu cuiuVar = (cuiu) obj;
            if (this.a.equals(cuiuVar.a()) && this.b == cuiuVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
        sb.append("ImageDownloadRequestArgs{lighterMediaId=");
        sb.append(valueOf);
        sb.append(", downloadRequestType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
