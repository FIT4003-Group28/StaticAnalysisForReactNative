package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: adzy  reason: default package */
/* loaded from: classes.dex */
public final class adzy implements Comparable {
    public final long a;
    public long b;

    public adzy(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean a(adzy adzyVar) {
        return adzyVar != null && this.b >= adzyVar.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        adzy adzyVar = (adzy) obj;
        int compareTo = Long.valueOf(this.a).compareTo(Long.valueOf(adzyVar.a));
        return compareTo == 0 ? Long.valueOf(this.b).compareTo(Long.valueOf(adzyVar.b)) : compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adzy) {
            adzy adzyVar = (adzy) obj;
            return this.a == adzyVar.a && this.b == adzyVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }
}
