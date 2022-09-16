package defpackage;
/* compiled from: PG */
/* renamed from: aosp  reason: default package */
/* loaded from: classes.dex */
public final class aosp extends aosq {
    public final long a;
    public final aorb b;

    public aosp(long j, aorb aorbVar) {
        this.a = j;
        if (aorbVar != null) {
            this.b = aorbVar;
            return;
        }
        throw new NullPointerException("Null parser");
    }

    @Override // defpackage.aosq
    public final long a() {
        return this.a;
    }

    @Override // defpackage.aosq
    public final aorb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aosq) {
            aosq aosqVar = (aosq) obj;
            if (this.a == aosqVar.a() && this.b.equals(aosqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("GeneratedAnyExtractor{typeHash=");
        sb.append(j);
        sb.append(", parser=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
