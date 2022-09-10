package defpackage;
/* compiled from: PG */
/* renamed from: bzcs  reason: default package */
/* loaded from: classes4.dex */
public final class bzcs extends bzde {
    private final bzdg b;

    public bzcs(bzdg bzdgVar) {
        if (bzdgVar != null) {
            this.b = bzdgVar;
            return;
        }
        throw new NullPointerException("Null stage");
    }

    @Override // defpackage.bzdh
    public final bzdg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bzde)) {
            return false;
        }
        return this.b.equals(((bzde) obj).b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("StoppedEndState{stage=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
