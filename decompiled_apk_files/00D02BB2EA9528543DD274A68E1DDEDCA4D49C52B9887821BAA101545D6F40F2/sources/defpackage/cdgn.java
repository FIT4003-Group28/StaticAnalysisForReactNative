package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cdgn  reason: default package */
/* loaded from: classes4.dex */
public final class cdgn extends cdgq {
    private final List<cdgp> a;

    public cdgn(List<cdgp> list) {
        this.a = list;
    }

    @Override // defpackage.cdgq
    public final List<cdgp> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdgq)) {
            return false;
        }
        return this.a.equals(((cdgq) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("PhotoTakenSubscribersProvider{subscribers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
