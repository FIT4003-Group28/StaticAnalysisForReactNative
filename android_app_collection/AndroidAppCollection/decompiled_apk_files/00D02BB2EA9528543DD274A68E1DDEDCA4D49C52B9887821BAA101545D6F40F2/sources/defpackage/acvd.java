package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acvd  reason: default package */
/* loaded from: classes2.dex */
public final class acvd extends acve {
    private final String a;
    private final byee b;

    public acvd(String str, byee byeeVar) {
        if (str != null) {
            this.a = str;
            if (byeeVar != null) {
                this.b = byeeVar;
                return;
            }
            throw new NullPointerException("Null placemarkOpenHours");
        }
        throw new NullPointerException("Null name");
    }

    @Override // defpackage.acve
    public final String a() {
        return this.a;
    }

    @Override // defpackage.acve
    public final byee b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acve) {
            acve acveVar = (acve) obj;
            if (this.a.equals(acveVar.a()) && this.b.equals(acveVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 42 + String.valueOf(valueOf).length());
        sb.append("NamedOpenHours{name=");
        sb.append(str);
        sb.append(", placemarkOpenHours=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
