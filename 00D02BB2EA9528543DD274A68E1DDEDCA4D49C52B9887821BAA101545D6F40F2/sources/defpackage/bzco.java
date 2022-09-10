package defpackage;
/* compiled from: PG */
/* renamed from: bzco  reason: default package */
/* loaded from: classes4.dex */
public final class bzco extends bzcn {
    private final bzdg b;

    public bzco(bzdg bzdgVar) {
        this.b = bzdgVar;
    }

    @Override // defpackage.bzdh
    public final bzdg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bzcn)) {
            return false;
        }
        return this.b.equals(((bzcn) obj).b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("ArrivedEndState{stage=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
