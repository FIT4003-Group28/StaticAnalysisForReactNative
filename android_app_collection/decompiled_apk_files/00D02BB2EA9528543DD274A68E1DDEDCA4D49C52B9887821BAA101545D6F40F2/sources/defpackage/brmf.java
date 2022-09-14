package defpackage;
/* compiled from: PG */
/* renamed from: brmf  reason: default package */
/* loaded from: classes4.dex */
final class brmf extends brmj {
    private final boolean a;
    private final Float b;
    private final akqq c;

    public brmf(boolean z, Float f, akqq akqqVar) {
        this.a = z;
        this.b = f;
        this.c = akqqVar;
    }

    @Override // defpackage.brmj
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.brmj
    public final Float b() {
        return this.b;
    }

    @Override // defpackage.brmj
    public final akqq c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Float f;
        akqq akqqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof brmj) {
            brmj brmjVar = (brmj) obj;
            if (this.a == brmjVar.a() && ((f = this.b) != null ? f.equals(brmjVar.b()) : brmjVar.b() == null) && ((akqqVar = this.c) != null ? akqqVar.equals(brmjVar.c()) : brmjVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        Float f = this.b;
        int i2 = 0;
        int hashCode = (i ^ (f == null ? 0 : f.hashCode())) * 1000003;
        akqq akqqVar = this.c;
        if (akqqVar != null) {
            i2 = akqqVar.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + String.valueOf(valueOf2).length());
        sb.append("ResultMetadata{isTopResult=");
        sb.append(z);
        sb.append(", score=");
        sb.append(valueOf);
        sb.append(", latLng=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
