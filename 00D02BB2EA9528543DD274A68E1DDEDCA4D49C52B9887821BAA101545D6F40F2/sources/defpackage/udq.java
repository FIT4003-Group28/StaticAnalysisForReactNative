package defpackage;
/* compiled from: PG */
/* renamed from: udq  reason: default package */
/* loaded from: classes7.dex */
final class udq extends udt {
    public final btlu a;
    public final amsy b;
    public final boolean c;
    public final int d;

    public udq(btlu btluVar, amsy amsyVar, boolean z, int i) {
        if (btluVar != null) {
            this.a = btluVar;
            if (amsyVar != null) {
                this.b = amsyVar;
                this.c = z;
                this.d = i;
                return;
            }
            throw new NullPointerException("Null directions");
        }
        throw new NullPointerException("Null account");
    }

    @Override // defpackage.udt
    public final btlu a() {
        return this.a;
    }

    @Override // defpackage.udt
    public final amsy b() {
        return this.b;
    }

    @Override // defpackage.udt
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.udt
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udt) {
            udt udtVar = (udt) obj;
            if (this.a.equals(udtVar.a()) && this.b.equals(udtVar.b()) && this.c == udtVar.c() && this.d == udtVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        int i = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 105 + String.valueOf(valueOf2).length());
        sb.append("PollingState{account=");
        sb.append(valueOf);
        sb.append(", directions=");
        sb.append(valueOf2);
        sb.append(", fetchFullDetailsForSelectedTrip=");
        sb.append(z);
        sb.append(", selectedTripIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
