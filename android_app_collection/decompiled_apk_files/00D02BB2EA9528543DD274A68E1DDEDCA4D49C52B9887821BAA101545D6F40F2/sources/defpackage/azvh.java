package defpackage;
/* compiled from: PG */
/* renamed from: azvh  reason: default package */
/* loaded from: classes3.dex */
final class azvh extends azws {
    private final String a;
    private final String b;
    private final dpuk c;

    public azvh(String str, String str2, dpuk dpukVar) {
        this.a = str;
        this.b = str2;
        this.c = dpukVar;
    }

    @Override // defpackage.azws
    public final String a() {
        return this.a;
    }

    @Override // defpackage.azws
    public final String b() {
        return this.b;
    }

    @Override // defpackage.azws
    public final dpuk c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azws) {
            azws azwsVar = (azws) obj;
            if (this.a.equals(azwsVar.a()) && this.b.equals(azwsVar.b()) && this.c.equals(azwsVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("ExperienceMetadata{name=");
        sb.append(str);
        sb.append(", mid=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
