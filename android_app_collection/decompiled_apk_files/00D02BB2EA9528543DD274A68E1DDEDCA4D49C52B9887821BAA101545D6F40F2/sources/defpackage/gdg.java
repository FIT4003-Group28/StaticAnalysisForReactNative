package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gdg  reason: default package */
/* loaded from: classes6.dex */
public final class gdg extends gdi {
    public final cqtd a;
    public final boolean b;
    private final boolean c;

    public gdg(@dzsi cqtd cqtdVar, boolean z, boolean z2) {
        this.a = cqtdVar;
        this.c = z;
        this.b = z2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gdi
    @dzsi
    public final cqtd a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gdi
    public final boolean b() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gdi
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gdi) {
            gdi gdiVar = (gdi) obj;
            cqtd cqtdVar = this.a;
            if (cqtdVar != null ? cqtdVar.equals(gdiVar.a()) : gdiVar.a() == null) {
                if (this.c == gdiVar.b() && this.b == gdiVar.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        cqtd cqtdVar = this.a;
        int i = 1237;
        int hashCode = ((((cqtdVar == null ? 0 : cqtdVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.c;
        boolean z2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 105);
        sb.append("RippleDrawableProperties{getMask=");
        sb.append(valueOf);
        sb.append(", shouldFallbackToMaskedDrawable=");
        sb.append(z);
        sb.append(", shouldUseMaskAsBackground=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
