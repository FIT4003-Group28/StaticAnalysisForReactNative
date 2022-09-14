package defpackage;
/* compiled from: PG */
/* renamed from: rma  reason: default package */
/* loaded from: classes7.dex */
public final class rma extends roe {
    private final dopk a;
    private final boolean b;
    private final int c;

    public rma(@dzsi dopk dopkVar, boolean z, int i) {
        this.a = dopkVar;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.roe
    @dzsi
    public final dopk a() {
        return this.a;
    }

    @Override // defpackage.roe
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.roe
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof roe) {
            roe roeVar = (roe) obj;
            dopk dopkVar = this.a;
            if (dopkVar != null ? dopkVar.equals(roeVar.a()) : roeVar.a() == null) {
                if (this.b == roeVar.b() && this.c == roeVar.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        dopk dopkVar = this.a;
        if (dopkVar == null) {
            i = 0;
        } else {
            int i2 = dopkVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dopkVar).c(dopkVar);
                dopkVar.bC = i2;
            }
            i = i2;
        }
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93);
        sb.append("StationPickerSetupFragmentResult{transitStation=");
        sb.append(valueOf);
        sb.append(", isStartStation=");
        sb.append(z);
        sb.append(", legIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
