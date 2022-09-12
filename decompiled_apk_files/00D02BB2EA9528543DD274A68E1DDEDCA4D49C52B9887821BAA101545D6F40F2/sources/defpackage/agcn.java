package defpackage;
/* compiled from: PG */
/* renamed from: agcn  reason: default package */
/* loaded from: classes2.dex */
final class agcn extends agre {
    private final boolean a;
    private final boolean b;
    private final float c;
    private final int d;
    private final int e;
    private final int f;
    private final Object g;

    public agcn(boolean z, boolean z2, float f, int i, int i2, int i3, @dzsi Object obj) {
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = obj;
    }

    @Override // defpackage.agre
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.agre
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.agre
    public final float c() {
        return this.c;
    }

    @Override // defpackage.agre
    public final int d() {
        return this.d;
    }

    @Override // defpackage.agre
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agre) {
            agre agreVar = (agre) obj;
            if (this.a == agreVar.a() && this.b == agreVar.b() && Float.floatToIntBits(this.c) == Float.floatToIntBits(agreVar.c()) && this.d == agreVar.d() && this.e == agreVar.e() && this.f == agreVar.f() && ((obj2 = this.g) != null ? obj2.equals(agreVar.g()) : agreVar.g() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.agre
    public final int f() {
        return this.f;
    }

    @Override // defpackage.agre
    @dzsi
    public final Object g() {
        return this.g;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        int floatToIntBits = (((((((((i2 ^ i) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003;
        Object obj = this.g;
        return floatToIntBits ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        float f = this.c;
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        String valueOf = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 176);
        sb.append("Options{fillParentWidth=");
        sb.append(z);
        sb.append(", fillParentHeight=");
        sb.append(z2);
        sb.append(", layoutWeight=");
        sb.append(f);
        sb.append(", marginTopDp=");
        sb.append(i);
        sb.append(", marginBottomDp=");
        sb.append(i2);
        sb.append(", marginEndDp=");
        sb.append(i3);
        sb.append(", layoutSubId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
