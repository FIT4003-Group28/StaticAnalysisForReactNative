package defpackage;
/* compiled from: PG */
/* renamed from: adff  reason: default package */
/* loaded from: classes.dex */
public final class adff {
    public final boolean a;
    public final aifh b;

    public adff() {
    }

    public adff(boolean z, aifh aifhVar) {
        this.a = z;
        this.b = aifhVar;
    }

    public static adfe a() {
        adfe adfeVar = new adfe();
        adfeVar.b(false);
        adfeVar.c(aifh.DEFAULT);
        return adfeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adff) {
            adff adffVar = (adff) obj;
            if (this.a == adffVar.a && this.b.equals(adffVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
        sb.append("UnselectedRouteProperties{isUnselectUserInitiated=");
        sb.append(z);
        sb.append(", queueTransferType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
