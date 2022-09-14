package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: snl  reason: default package */
/* loaded from: classes7.dex */
public final class snl extends spv {
    private final boolean a;
    private final dnus b;

    public snl(boolean z, @dzsi dnus dnusVar) {
        this.a = z;
        this.b = dnusVar;
    }

    @Override // defpackage.spv
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.spv
    @dzsi
    public final dnus b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        dnus dnusVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof spv) {
            spv spvVar = (spv) obj;
            if (this.a == spvVar.a() && ((dnusVar = this.b) != null ? dnusVar.equals(spvVar.b()) : spvVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        dnus dnusVar = this.b;
        if (dnusVar == null) {
            i = 0;
        } else {
            int i3 = dnusVar.bC;
            if (i3 == 0) {
                i3 = dsst.a.b(dnusVar).c(dnusVar);
                dnusVar.bC = i3;
            }
            i = i3;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
        sb.append("SavedDestinationsContent{isDirectionsDataFresh=");
        sb.append(z);
        sb.append(", content=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
