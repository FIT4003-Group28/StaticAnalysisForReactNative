package defpackage;
/* compiled from: PG */
/* renamed from: cviz  reason: default package */
/* loaded from: classes5.dex */
public final class cviz extends cvje {
    public final cvjg a;
    private final int b;

    public cviz(cvjg cvjgVar, int i) {
        this.a = cvjgVar;
        this.b = i;
    }

    @Override // defpackage.cvje
    public final cvjg a() {
        return this.a;
    }

    @Override // defpackage.cvje
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvje) {
            cvje cvjeVar = (cvje) obj;
            if (this.a.equals(cvjeVar.a())) {
                int i = this.b;
                int b = cvjeVar.b();
                if (i == 0) {
                    throw null;
                }
                if (i == b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.b;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "NOTIFY" : "DROP" : "UNKNOWN_PREFERENCE";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + str.length());
        sb.append("PreferenceEntry{preferenceKey=");
        sb.append(valueOf);
        sb.append(", preference=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
