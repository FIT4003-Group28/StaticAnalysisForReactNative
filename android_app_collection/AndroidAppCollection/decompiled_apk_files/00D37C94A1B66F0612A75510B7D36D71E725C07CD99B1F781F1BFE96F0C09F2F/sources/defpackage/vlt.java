package defpackage;
/* compiled from: PG */
/* renamed from: vlt  reason: default package */
/* loaded from: classes4.dex */
public final class vlt implements vmr {
    public final vls a;

    public vlt() {
    }

    public vlt(vls vlsVar) {
        this.a = vlsVar;
    }

    @Override // defpackage.vmr
    public final String a() {
        return "signal";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vlt)) {
            return false;
        }
        return this.a.equals(((vlt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("SignallingConfig{service=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
