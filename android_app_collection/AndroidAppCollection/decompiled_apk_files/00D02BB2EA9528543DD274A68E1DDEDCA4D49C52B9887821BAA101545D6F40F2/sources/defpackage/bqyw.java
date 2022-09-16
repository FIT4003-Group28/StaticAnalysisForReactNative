package defpackage;
/* compiled from: PG */
/* renamed from: bqyw  reason: default package */
/* loaded from: classes4.dex */
final class bqyw extends bqyz {
    private final bwrs<brln> a;
    private final ddfv b;
    private final ddfv c;

    public bqyw(bwrs<brln> bwrsVar, ddfv ddfvVar, ddfv ddfvVar2) {
        if (bwrsVar != null) {
            this.a = bwrsVar;
            if (ddfvVar != null) {
                this.b = ddfvVar;
                if (ddfvVar2 != null) {
                    this.c = ddfvVar2;
                    return;
                }
                throw new NullPointerException("Null cancelVeType");
            }
            throw new NullPointerException("Null successVeType");
        }
        throw new NullPointerException("Null searchRequestRef");
    }

    @Override // defpackage.bqyz
    public final bwrs<brln> b() {
        return this.a;
    }

    @Override // defpackage.bqyz
    public final ddfv c() {
        return this.b;
    }

    @Override // defpackage.bqyz
    public final ddfv d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqyz) {
            bqyz bqyzVar = (bqyz) obj;
            if (this.a.equals(bqyzVar.b()) && this.b.equals(bqyzVar.c()) && this.c.equals(bqyzVar.d())) {
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
        StringBuilder sb = new StringBuilder(length + 60 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("SearchData{searchRequestRef=");
        sb.append(valueOf);
        sb.append(", successVeType=");
        sb.append(valueOf2);
        sb.append(", cancelVeType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
