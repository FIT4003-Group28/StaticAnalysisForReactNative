package defpackage;
/* compiled from: PG */
/* renamed from: bvjy  reason: default package */
/* loaded from: classes.dex */
public final class bvjy extends bvku {
    public final durz a;
    public final afib b;
    public final boolean c;

    public bvjy(@dzsi durz durzVar, @dzsi afib afibVar, boolean z) {
        this.a = durzVar;
        this.b = afibVar;
        this.c = z;
    }

    @Override // defpackage.bvku
    @dzsi
    public final durz a() {
        return this.a;
    }

    @Override // defpackage.bvku
    @dzsi
    public final afib b() {
        return this.b;
    }

    @Override // defpackage.bvku
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvku) {
            bvku bvkuVar = (bvku) obj;
            durz durzVar = this.a;
            if (durzVar != null ? durzVar.equals(bvkuVar.a()) : bvkuVar.a() == null) {
                afib afibVar = this.b;
                if (afibVar != null ? afibVar.equals(bvkuVar.b()) : bvkuVar.b() == null) {
                    if (this.c == bvkuVar.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        durz durzVar = this.a;
        int i = 0;
        int hashCode = ((durzVar == null ? 0 : durzVar.hashCode()) ^ 1000003) * 1000003;
        afib afibVar = this.b;
        if (afibVar != null) {
            i = afibVar.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 87 + String.valueOf(valueOf2).length());
        sb.append("StartupIntentType{externalInvocationType=");
        sb.append(valueOf);
        sb.append(", intentActionType=");
        sb.append(valueOf2);
        sb.append(", isDelayedGmmIntent=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
