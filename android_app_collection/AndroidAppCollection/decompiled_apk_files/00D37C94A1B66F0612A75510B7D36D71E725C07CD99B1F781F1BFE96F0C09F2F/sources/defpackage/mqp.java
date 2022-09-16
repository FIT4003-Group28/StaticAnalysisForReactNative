package defpackage;
/* compiled from: PG */
/* renamed from: mqp  reason: default package */
/* loaded from: classes3.dex */
public final class mqp {
    public final int a;
    public final int b;
    private final int c;
    private final int d;

    public mqp() {
    }

    public mqp(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mqp) {
            mqp mqpVar = (mqp) obj;
            if (this.a == mqpVar.a && this.b == mqpVar.b && this.c == mqpVar.c && this.d == mqpVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(176);
        sb.append("SlimMetadataToggleButtonColorConfiguration{defaultIconColorRes=");
        sb.append(i);
        sb.append(", selectedIconColorRes=");
        sb.append(i2);
        sb.append(", defaultTextColorRes=");
        sb.append(i3);
        sb.append(", selectedTextColorRes=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
