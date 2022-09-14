package defpackage;
/* compiled from: PG */
/* renamed from: andz  reason: default package */
/* loaded from: classes2.dex */
public final class andz extends anec {
    private final int a;
    private final akqq b;

    public andz(int i, akqq akqqVar) {
        this.a = i;
        this.b = akqqVar;
    }

    @Override // defpackage.anec
    public final int a() {
        return this.a;
    }

    @Override // defpackage.anec
    public final akqq b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anec) {
            anec anecVar = (anec) obj;
            if (this.a == anecVar.a() && this.b.equals(anecVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("MapMarker{pinDrawable=");
        sb.append(i);
        sb.append(", position=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
