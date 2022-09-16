package defpackage;
/* compiled from: PG */
/* renamed from: xox  reason: default package */
/* loaded from: classes4.dex */
final class xox extends xrf {
    private final xrp a;
    private final int b;

    public xox(xrp xrpVar, int i) {
        if (xrpVar != null) {
            this.a = xrpVar;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null updatedImage");
    }

    @Override // defpackage.xrf
    public int a() {
        return this.b;
    }

    @Override // defpackage.xrf
    public xrp b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xrf) {
            xrf xrfVar = (xrf) obj;
            if (this.a.equals(xrfVar.b()) && this.b == xrfVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("ImageItemUpdatedEvent{updatedImage=");
        sb.append(valueOf);
        sb.append(", index=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
