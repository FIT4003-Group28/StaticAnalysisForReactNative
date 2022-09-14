package defpackage;
/* compiled from: PG */
/* renamed from: ctpd  reason: default package */
/* loaded from: classes5.dex */
public final class ctpd extends ctqe {
    private final boolean a;

    public ctpd(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ctqe
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ctqe) && this.a == ((ctqe) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(40);
        sb.append("BlockUnblockUsers{syncBlockStatus=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
