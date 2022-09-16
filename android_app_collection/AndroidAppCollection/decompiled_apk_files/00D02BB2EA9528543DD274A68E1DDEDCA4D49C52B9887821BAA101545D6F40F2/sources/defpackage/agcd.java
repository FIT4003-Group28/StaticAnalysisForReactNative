package defpackage;
/* compiled from: PG */
/* renamed from: agcd  reason: default package */
/* loaded from: classes2.dex */
final class agcd extends agha {
    private final boolean a;
    private final boolean b;
    private final ddho c;

    public agcd(boolean z, boolean z2, ddho ddhoVar) {
        this.a = z;
        this.b = z2;
        this.c = ddhoVar;
    }

    @Override // defpackage.agha
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.agha
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.agha
    public final ddho c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agha) {
            agha aghaVar = (agha) obj;
            if (this.a == aghaVar.a() && this.b == aghaVar.b() && this.c.equals(aghaVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
        sb.append("Options{showCoverPhoto=");
        sb.append(z);
        sb.append(", showFixedHeightSpaceForSnippet=");
        sb.append(z2);
        sb.append(", veType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
