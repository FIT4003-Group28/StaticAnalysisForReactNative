package defpackage;
/* compiled from: PG */
/* renamed from: cueu  reason: default package */
/* loaded from: classes5.dex */
final class cueu extends cuih {
    private final boolean a;

    public cueu(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cuih
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof cuih) && this.a == ((cuih) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(38);
        sb.append("UserProperties{readReceiptOptIn=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
