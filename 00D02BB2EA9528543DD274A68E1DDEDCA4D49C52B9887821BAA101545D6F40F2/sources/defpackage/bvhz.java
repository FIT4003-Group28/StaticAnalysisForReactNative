package defpackage;
/* compiled from: PG */
/* renamed from: bvhz  reason: default package */
/* loaded from: classes4.dex */
final class bvhz extends bvin {
    private final CharSequence a;
    private final CharSequence b;
    private final cjtd c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public bvhz(CharSequence charSequence, CharSequence charSequence2, cjtd cjtdVar, boolean z, boolean z2, boolean z3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = cjtdVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // defpackage.bvin
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.bvin
    public final CharSequence b() {
        return this.b;
    }

    @Override // defpackage.bvin
    public final cjtd c() {
        return this.c;
    }

    @Override // defpackage.bvin
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.bvin
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvin) {
            bvin bvinVar = (bvin) obj;
            if (this.a.equals(bvinVar.a()) && this.b.equals(bvinVar.b()) && this.c.equals(bvinVar.c()) && this.d == bvinVar.d() && this.e == bvinVar.e() && this.f == bvinVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bvin
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 165 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Options{backwardContentDescription=");
        sb.append(valueOf);
        sb.append(", forwardContentDescription=");
        sb.append(valueOf2);
        sb.append(", ue3Params=");
        sb.append(valueOf3);
        sb.append(", shouldSupportLongPressToPause=");
        sb.append(z);
        sb.append(", isSwipeable=");
        sb.append(z2);
        sb.append(", isImageSlideshowFocusable=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
