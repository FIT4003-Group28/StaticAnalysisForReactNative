package defpackage;
/* compiled from: PG */
/* renamed from: asks  reason: default package */
/* loaded from: classes2.dex */
final class asks extends asku {
    private final dvdm a;
    private final boolean b;
    private final boolean c;

    public asks(dvdm dvdmVar, boolean z, boolean z2) {
        this.a = dvdmVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.asku
    public final dvdm a() {
        return this.a;
    }

    @Override // defpackage.asku
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.asku
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof asku) {
            asku askuVar = (asku) obj;
            if (this.a.equals(askuVar.a()) && this.b == askuVar.b() && this.c == askuVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("CameraOptions{cameraType=");
        sb.append(valueOf);
        sb.append(", isSatellite=");
        sb.append(z);
        sb.append(", isWalking=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
