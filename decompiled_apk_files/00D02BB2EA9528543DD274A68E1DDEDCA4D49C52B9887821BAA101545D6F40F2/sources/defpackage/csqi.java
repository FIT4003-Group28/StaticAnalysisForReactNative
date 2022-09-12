package defpackage;
/* compiled from: PG */
/* renamed from: csqi  reason: default package */
/* loaded from: classes5.dex */
public final class csqi extends csqm {
    @Override // defpackage.csqm
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof csqm) && !((csqm) obj).a();
    }

    public final int hashCode() {
        return 1001110;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("PhotoOptions{allowDefaultImage=");
        sb.append(false);
        sb.append("}");
        return sb.toString();
    }
}
