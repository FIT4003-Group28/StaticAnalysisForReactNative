package defpackage;
/* compiled from: PG */
/* renamed from: xoz  reason: default package */
/* loaded from: classes4.dex */
final class xoz extends xrj {
    private final amuk a;

    public xoz(amuk amukVar) {
        if (amukVar != null) {
            this.a = amukVar;
            return;
        }
        throw new NullPointerException("Null setImages");
    }

    @Override // defpackage.xrj
    public amuk a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xrj)) {
            return false;
        }
        return amxp.v(this.a, ((xrj) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("ImagesSetEvent{setImages=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
