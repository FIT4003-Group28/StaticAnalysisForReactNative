package defpackage;
/* compiled from: PG */
/* renamed from: xha  reason: default package */
/* loaded from: classes4.dex */
public final class xha {
    public final xgs a;

    public xha() {
    }

    public xha(xgs xgsVar) {
        this.a = xgsVar;
    }

    public static xgz a() {
        xgz xgzVar = new xgz();
        xgzVar.a = xgs.a;
        return xgzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xha)) {
            return false;
        }
        return this.a.equals(((xha) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("AdTitleOverlayState{adOverlayMetadata=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
