package defpackage;
/* compiled from: PG */
/* renamed from: ghz  reason: default package */
/* loaded from: classes6.dex */
final class ghz extends gic {
    private final int a;
    private final dcep<String> b;
    private final int c;
    private final int d;

    public ghz(int i, int i2, int i3, dcep<String> dcepVar) {
        this.c = i;
        this.a = i2;
        this.d = i3;
        if (dcepVar != null) {
            this.b = dcepVar;
            return;
        }
        throw new NullPointerException("Null keywords");
    }

    @Override // defpackage.gic
    public final int a() {
        return this.a;
    }

    @Override // defpackage.gic
    public final dcep<String> b() {
        return this.b;
    }

    @Override // defpackage.gic
    public final int c() {
        return this.c;
    }

    @Override // defpackage.gic
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gic) {
            gic gicVar = (gic) obj;
            if (this.c == gicVar.c() && this.a == gicVar.a() && this.d == gicVar.d() && this.b.equals(gicVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.c ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.d) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.c;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "BLUE" : "GREY" : "WHITE" : "BLACK" : "UNKNOWN_TINT";
        int i2 = this.a;
        switch (this.d) {
            case 1:
                str = "UNKNOWN_CATEGORY";
                break;
            case 2:
                str = "SYSTEM_AND_PLATFORM";
                break;
            case 3:
                str = "LOCATION_AND_ORIENTATION";
                break;
            case 4:
                str = "TRANSPORTATION";
                break;
            case 5:
                str = "NAVIGATION";
                break;
            case 6:
                str = "IMAGERY_AND_UGC";
                break;
            case 7:
                str = "PERSONAL_PLACES";
                break;
            case 8:
                str = "ALERTS_AND_INFO";
                break;
            case 9:
                str = "AVATARS_AND_BRANDING";
                break;
            case 10:
                str = "DINING";
                break;
            case 11:
                str = "AMENITIES";
                break;
            case 12:
                str = "LOCAL_HIGHLIGHTS";
                break;
            default:
                str = "PLACES_AND_TTD";
                break;
        }
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str2.length() + 71 + str.length() + String.valueOf(valueOf).length());
        sb.append("IconMetadata{iconTint=");
        sb.append(str2);
        sb.append(", iconSize=");
        sb.append(i2);
        sb.append(", iconCategory=");
        sb.append(str);
        sb.append(", keywords=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
