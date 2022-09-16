package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bzke  reason: default package */
/* loaded from: classes4.dex */
final class bzke extends bzlh {
    private final bzlj a;
    private final List<bzjh> b;
    private final dbsg<Long> c;
    private final List<bzjd> d;

    public bzke(bzlj bzljVar, List<bzjh> list, dbsg<Long> dbsgVar, List<bzjd> list2) {
        this.a = bzljVar;
        this.b = list;
        this.c = dbsgVar;
        this.d = list2;
    }

    @Override // defpackage.bzlh
    public final bzlj a() {
        return this.a;
    }

    @Override // defpackage.bzlh
    public final List<bzjh> b() {
        return this.b;
    }

    @Override // defpackage.bzlh
    public final dbsg<Long> c() {
        return this.c;
    }

    @Override // defpackage.bzlh
    public final List<bzjd> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzlh) {
            bzlh bzlhVar = (bzlh) obj;
            if (this.a.equals(bzlhVar.a()) && this.b.equals(bzlhVar.b()) && this.c.equals(bzlhVar.c()) && this.d.equals(bzlhVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("TransitChipData{transitContext=");
        sb.append(valueOf);
        sb.append(", departures=");
        sb.append(valueOf2);
        sb.append(", transitDeparturePeriod=");
        sb.append(valueOf3);
        sb.append(", alerts=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
