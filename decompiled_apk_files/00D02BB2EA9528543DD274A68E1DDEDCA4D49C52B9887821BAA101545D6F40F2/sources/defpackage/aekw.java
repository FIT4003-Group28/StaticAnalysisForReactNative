package defpackage;
/* compiled from: PG */
/* renamed from: aekw  reason: default package */
/* loaded from: classes2.dex */
final class aekw extends aekz {
    private final ddho a;
    private final ddho b;
    private final ddho c;

    public aekw(@dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, ddho ddhoVar3) {
        this.a = ddhoVar;
        this.b = ddhoVar2;
        this.c = ddhoVar3;
    }

    @Override // defpackage.aekz
    @dzsi
    public final ddho a() {
        return this.a;
    }

    @Override // defpackage.aekz
    @dzsi
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.aekz
    public final ddho c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aekz) {
            aekz aekzVar = (aekz) obj;
            ddho ddhoVar = this.a;
            if (ddhoVar != null ? ddhoVar.equals(aekzVar.a()) : aekzVar.a() == null) {
                ddho ddhoVar2 = this.b;
                if (ddhoVar2 != null ? ddhoVar2.equals(aekzVar.b()) : aekzVar.b() == null) {
                    if (this.c.equals(aekzVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ddho ddhoVar = this.a;
        int i = 0;
        int hashCode = ((ddhoVar == null ? 0 : ddhoVar.hashCode()) ^ 1000003) * 1000003;
        ddho ddhoVar2 = this.b;
        if (ddhoVar2 != null) {
            i = ddhoVar2.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DatepickerConfig{prevArrowVeType=");
        sb.append(valueOf);
        sb.append(", nextArrowVeType=");
        sb.append(valueOf2);
        sb.append(", veType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
