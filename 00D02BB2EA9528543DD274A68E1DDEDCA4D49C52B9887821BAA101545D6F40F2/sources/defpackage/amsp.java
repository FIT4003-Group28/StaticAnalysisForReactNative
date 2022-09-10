package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amsp  reason: default package */
/* loaded from: classes2.dex */
public final class amsp extends amvf {
    private final akqq a;
    private final int b;
    private final int c;

    public amsp(akqq akqqVar, int i, int i2) {
        this.a = akqqVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.amvf
    public final akqq a() {
        return this.a;
    }

    @Override // defpackage.amvf
    public final int b() {
        return this.b;
    }

    @Override // defpackage.amvf
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amvf) {
            amvf amvfVar = (amvf) obj;
            if (this.a.equals(amvfVar.a()) && this.b == amvfVar.b() && this.c == amvfVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77);
        sb.append("Viapoint{position=");
        sb.append(valueOf);
        sb.append(", afterWaypoint=");
        sb.append(i);
        sb.append(", distanceThreshold=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
