package defpackage;
/* compiled from: PG */
/* renamed from: bqjd  reason: default package */
/* loaded from: classes4.dex */
public final class bqjd extends bqlh {
    public final dcdc<bbtm> a;
    private final bqlg b;

    public bqjd(bqlg bqlgVar, dcdc<bbtm> dcdcVar) {
        if (bqlgVar != null) {
            this.b = bqlgVar;
            if (dcdcVar != null) {
                this.a = dcdcVar;
                return;
            }
            throw new NullPointerException("Null photos");
        }
        throw new NullPointerException("Null status");
    }

    @Override // defpackage.bqlh
    public final bqlg a() {
        return this.b;
    }

    @Override // defpackage.bqlh
    public final dcdc<bbtm> b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqlh) {
            bqlh bqlhVar = (bqlh) obj;
            if (this.b.equals(bqlhVar.a()) && dchl.m(this.a, bqlhVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length());
        sb.append("SuggestedPhotos{status=");
        sb.append(valueOf);
        sb.append(", photos=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
