package defpackage;
/* compiled from: PG */
/* renamed from: vrz  reason: default package */
/* loaded from: classes4.dex */
public final class vrz {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public vrz() {
    }

    public vrz(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static vry a() {
        vry vryVar = new vry();
        vryVar.c(false);
        vryVar.b(false);
        vryVar.a = false;
        vryVar.d(false);
        return vryVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vrz) {
            vrz vrzVar = (vrz) obj;
            if (this.a == vrzVar.a && this.b == vrzVar.b && this.c == vrzVar.c && this.d == vrzVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        StringBuilder sb = new StringBuilder(134);
        sb.append("Options{enableExtractorValidation=");
        sb.append(z);
        sb.append(", allowMetadataTracks=");
        sb.append(z2);
        sb.append(", allowMultipleVideoTracks=");
        sb.append(z3);
        sb.append(", useShortestTrackForDuration=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
