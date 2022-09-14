package defpackage;
/* compiled from: PG */
/* renamed from: cues  reason: default package */
/* loaded from: classes5.dex */
final class cues extends cuie {
    private final String a;
    private final int b;

    public cues(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.cuie
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cuie
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuie) {
            cuie cuieVar = (cuie) obj;
            if (this.a.equals(cuieVar.a()) && this.b == cuieVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
        sb.append("UrlContentReplacement{pattern=");
        sb.append(str);
        sb.append(", substitute=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
