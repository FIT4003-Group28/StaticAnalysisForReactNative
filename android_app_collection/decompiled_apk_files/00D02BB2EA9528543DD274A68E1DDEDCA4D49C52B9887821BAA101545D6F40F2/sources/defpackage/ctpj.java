package defpackage;
/* compiled from: PG */
/* renamed from: ctpj  reason: default package */
/* loaded from: classes5.dex */
public final class ctpj extends ctql {
    private final ctqk a;

    public ctpj(ctqk ctqkVar) {
        this.a = ctqkVar;
    }

    @Override // defpackage.ctql
    public final ctqk a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ctql)) {
            return false;
        }
        return this.a.equals(((ctql) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("CloudUpdate{oneOfType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
