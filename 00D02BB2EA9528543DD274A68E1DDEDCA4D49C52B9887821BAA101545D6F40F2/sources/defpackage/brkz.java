package defpackage;
/* compiled from: PG */
/* renamed from: brkz  reason: default package */
/* loaded from: classes4.dex */
final class brkz extends brlk {
    private final bwrs<brln> a;
    private final bwrs<brlu> b;

    public brkz(bwrs<brln> bwrsVar, bwrs<brlu> bwrsVar2) {
        this.a = bwrsVar;
        this.b = bwrsVar2;
    }

    @Override // defpackage.brlk
    public final bwrs<brln> a() {
        return this.a;
    }

    @Override // defpackage.brlk
    public final bwrs<brlu> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brlk) {
            brlk brlkVar = (brlk) obj;
            if (this.a.equals(brlkVar.a()) && this.b.equals(brlkVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + String.valueOf(valueOf2).length());
        sb.append("SearchContext{searchRequestRef=");
        sb.append(valueOf);
        sb.append(", searchResultRef=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
