package defpackage;
/* compiled from: PG */
/* renamed from: kez  reason: default package */
/* loaded from: classes3.dex */
public final class kez {
    public final kfe a;
    public final boolean b;

    public kez() {
    }

    public kez(kfe kfeVar, boolean z) {
        this.a = kfeVar;
        this.b = z;
    }

    public static kez a(kfe kfeVar, boolean z) {
        return new kez(kfeVar, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kez) {
            kez kezVar = (kez) obj;
            if (this.a.equals(kezVar.a) && this.b == kezVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("ResultState{midUiModel=");
        sb.append(valueOf);
        sb.append(", shouldAnimate=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
