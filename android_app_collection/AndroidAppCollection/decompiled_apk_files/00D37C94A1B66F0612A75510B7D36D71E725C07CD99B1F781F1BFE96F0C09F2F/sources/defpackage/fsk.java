package defpackage;
/* compiled from: PG */
/* renamed from: fsk  reason: default package */
/* loaded from: classes3.dex */
public final class fsk {
    public final boolean a;
    public final fsi b;
    public final boolean c;

    public fsk() {
    }

    public fsk(boolean z, fsi fsiVar, boolean z2) {
        this.a = z;
        this.b = fsiVar;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fsk) {
            fsk fskVar = (fsk) obj;
            if (this.a == fskVar.a && this.b.equals(fskVar.b) && this.c == fskVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 89);
        sb.append("MySubsFilterBarModel{isFilterApplied=");
        sb.append(z);
        sb.append(", shownCallback=");
        sb.append(valueOf);
        sb.append(", isAccessibilityEnabled=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
