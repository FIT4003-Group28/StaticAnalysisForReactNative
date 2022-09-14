package defpackage;
/* compiled from: PG */
/* renamed from: aqzy  reason: default package */
/* loaded from: classes2.dex */
public final class aqzy extends arah {
    @Override // defpackage.arah
    public final int a() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof arah) && ((arah) obj).a() == 0;
    }

    public final int hashCode() {
        return 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("State{permissionGrant=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
