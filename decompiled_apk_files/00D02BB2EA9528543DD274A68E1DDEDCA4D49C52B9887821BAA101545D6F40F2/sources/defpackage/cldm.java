package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cldm  reason: default package */
/* loaded from: classes5.dex */
public final class cldm extends cldw {
    private final List<cled> a;

    public cldm(List<cled> list) {
        this.a = list;
    }

    @Override // defpackage.cldw
    public final List<cled> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cldw)) {
            return false;
        }
        return this.a.equals(((cldw) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("BatchedLogRequest{logRequests=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
