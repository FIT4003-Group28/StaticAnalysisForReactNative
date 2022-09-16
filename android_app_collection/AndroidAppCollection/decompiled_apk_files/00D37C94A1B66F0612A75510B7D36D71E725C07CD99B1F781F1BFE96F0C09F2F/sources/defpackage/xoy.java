package defpackage;
/* compiled from: PG */
/* renamed from: xoy  reason: default package */
/* loaded from: classes4.dex */
final class xoy extends xrh {
    private final amuk a;

    public xoy(amuk amukVar) {
        if (amukVar != null) {
            this.a = amukVar;
            return;
        }
        throw new NullPointerException("Null removedImages");
    }

    @Override // defpackage.xrh
    public amuk a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xrh)) {
            return false;
        }
        return amxp.v(this.a, ((xrh) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("ImagesRemovedEvent{removedImages=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
