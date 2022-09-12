package defpackage;
/* compiled from: PG */
/* renamed from: bbsx  reason: default package */
/* loaded from: classes3.dex */
final class bbsx extends bbvb {
    private final dbsg<String> a;
    private final boolean b;

    public bbsx(dbsg<String> dbsgVar, boolean z) {
        this.a = dbsgVar;
        this.b = z;
    }

    @Override // defpackage.bbvb
    public final dbsg<String> a() {
        return this.a;
    }

    @Override // defpackage.bbvb
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbvb) {
            bbvb bbvbVar = (bbvb) obj;
            if (this.a.equals(bbvbVar.a()) && this.b == bbvbVar.b()) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93);
        sb.append("PhotoPickerAppearanceOptions{standAloneTitleText=");
        sb.append(valueOf);
        sb.append(", shouldShowPostingPubliclyDisclaimer=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
