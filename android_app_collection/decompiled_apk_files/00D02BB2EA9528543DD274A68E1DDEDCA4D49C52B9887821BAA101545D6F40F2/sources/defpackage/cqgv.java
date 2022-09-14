package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqgv  reason: default package */
/* loaded from: classes.dex */
public final class cqgv extends cqje {
    private final List<cqjd> b;

    public cqgv(List<cqjd> list) {
        if (list != null) {
            this.b = list;
            return;
        }
        throw new NullPointerException("Null verbRules");
    }

    @Override // defpackage.cqje
    public final List<cqjd> a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cqje)) {
            return false;
        }
        return this.b.equals(((cqje) obj).a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("RelativeLayoutRules{verbRules=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
