package defpackage;
/* compiled from: PG */
/* renamed from: anat  reason: default package */
/* loaded from: classes.dex */
final class anat implements anai {
    private final anai a;
    private final Object b;

    public anat(anai anaiVar, Object obj) {
        anha.c(anaiVar, "log site key");
        this.a = anaiVar;
        anha.c(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anat)) {
            return false;
        }
        anat anatVar = (anat) obj;
        return this.a.equals(anatVar.a) && this.b.equals(anatVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + String.valueOf(valueOf2).length());
        sb.append("SpecializedLogSiteKey{ delegate='");
        sb.append(valueOf);
        sb.append("', qualifier='");
        sb.append(valueOf2);
        sb.append("' }");
        return sb.toString();
    }
}
