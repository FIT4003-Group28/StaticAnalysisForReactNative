package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: qbg  reason: default package */
/* loaded from: classes7.dex */
public final class qbg extends qec {
    private final List<dopk> a;

    public qbg(List<dopk> list) {
        this.a = list;
    }

    @Override // defpackage.qec
    public final List<dopk> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qec)) {
            return false;
        }
        return this.a.equals(((qec) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Response{stationsList=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
