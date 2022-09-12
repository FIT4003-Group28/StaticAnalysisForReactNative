package defpackage;
/* compiled from: PG */
/* renamed from: bvle  reason: default package */
/* loaded from: classes.dex */
final class bvle extends bvlw {
    private final Integer c;
    private final Integer d;
    private final boolean e;
    private final boolean f;
    private final ggt g;

    public bvle(@dzsi Integer num, @dzsi Integer num2, boolean z, boolean z2, @dzsi ggt ggtVar) {
        this.c = num;
        this.d = num2;
        this.e = z;
        this.f = z2;
        this.g = ggtVar;
    }

    @Override // defpackage.bvlw
    @dzsi
    public final Integer a() {
        return this.c;
    }

    @Override // defpackage.bvlw
    @dzsi
    public final Integer b() {
        return this.d;
    }

    @Override // defpackage.bvlw
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.bvlw
    public final boolean d() {
        return this.f;
    }

    @Override // defpackage.bvlw
    @dzsi
    public final ggt e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        ggt ggtVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvlw) {
            bvlw bvlwVar = (bvlw) obj;
            Integer num = this.c;
            if (num != null ? num.equals(bvlwVar.a()) : bvlwVar.a() == null) {
                Integer num2 = this.d;
                if (num2 != null ? num2.equals(bvlwVar.b()) : bvlwVar.b() == null) {
                    if (this.e == bvlwVar.c() && this.f == bvlwVar.d() && ((ggtVar = this.g) != null ? ggtVar.equals(bvlwVar.e()) : bvlwVar.e() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.c;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        Integer num2 = this.d;
        int i2 = 1237;
        int hashCode2 = (((hashCode ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i2 = 1231;
        }
        int i3 = (hashCode2 ^ i2) * 1000003;
        ggt ggtVar = this.g;
        if (ggtVar != null) {
            i = ggtVar.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        boolean z = this.e;
        boolean z2 = this.f;
        String valueOf3 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 75 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("SvgOptions{width=");
        sb.append(valueOf);
        sb.append(", height=");
        sb.append(valueOf2);
        sb.append(", isOpaque=");
        sb.append(z);
        sb.append(", isAlphaMask=");
        sb.append(z2);
        sb.append(", drawBounds=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
