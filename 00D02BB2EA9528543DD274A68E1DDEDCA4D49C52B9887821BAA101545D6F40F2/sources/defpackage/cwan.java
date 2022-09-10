package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwan  reason: default package */
/* loaded from: classes5.dex */
public final class cwan extends cwbi {
    private final dbsg<cvvh<?>> a;
    private final dbsg<cvvx> b;

    public cwan(dbsg<cvvh<?>> dbsgVar, dbsg<cvvx> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.cwbi
    public final dbsg<cvvh<?>> a() {
        return this.a;
    }

    @Override // defpackage.cwbi
    public final dbsg<cvvx> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwbi) {
            cwbi cwbiVar = (cwbi) obj;
            if (this.a.equals(cwbiVar.a()) && this.b.equals(cwbiVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 78315041;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("DecorationContent{badgeContent=");
        sb.append(valueOf);
        sb.append(", ringContent=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
