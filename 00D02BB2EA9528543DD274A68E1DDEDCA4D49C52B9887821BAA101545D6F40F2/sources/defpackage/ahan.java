package defpackage;
/* compiled from: PG */
/* renamed from: ahan  reason: default package */
/* loaded from: classes2.dex */
final class ahan extends ahbv {
    private final akqs a;
    private final dlbu b;

    public ahan(akqs akqsVar, dlbu dlbuVar) {
        if (akqsVar != null) {
            this.a = akqsVar;
            if (dlbuVar != null) {
                this.b = dlbuVar;
                return;
            }
            throw new NullPointerException("Null localStreamVerifyAreaResponse");
        }
        throw new NullPointerException("Null latLngBounds");
    }

    @Override // defpackage.ahbv
    public final akqs a() {
        return this.a;
    }

    @Override // defpackage.ahbv
    public final dlbu b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahbv) {
            ahbv ahbvVar = (ahbv) obj;
            if (this.a.equals(ahbvVar.a()) && this.b.equals(ahbvVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dlbu dlbuVar = this.b;
        int i = dlbuVar.bC;
        if (i == 0) {
            i = dsst.a.b(dlbuVar).c(dlbuVar);
            dlbuVar.bC = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62 + String.valueOf(valueOf2).length());
        sb.append("VerifyAreaEntry{latLngBounds=");
        sb.append(valueOf);
        sb.append(", localStreamVerifyAreaResponse=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
