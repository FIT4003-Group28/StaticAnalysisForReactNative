package defpackage;
/* compiled from: PG */
/* renamed from: bbds  reason: default package */
/* loaded from: classes3.dex */
final class bbds extends bbdx {
    private final bwrs<ilo> a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public bbds(bwrs<ilo> bwrsVar, boolean z, boolean z2, boolean z3) {
        this.a = bwrsVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // defpackage.bbdx
    public final bwrs<ilo> a() {
        return this.a;
    }

    @Override // defpackage.bbdx
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bbdx
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.bbdx
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbdx) {
            bbdx bbdxVar = (bbdx) obj;
            if (this.a.equals(bbdxVar.a()) && this.b == bbdxVar.b() && this.c == bbdxVar.c() && this.d == bbdxVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 162);
        sb.append("PersonalizationFeedbackBottomSheetParams{placemark=");
        sb.append(valueOf);
        sb.append(", filterPlaceSentimentFeedback=");
        sb.append(z);
        sb.append(", enablePersonalizationFeedback=");
        sb.append(z2);
        sb.append(", enableDiningPreferencesOption=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
