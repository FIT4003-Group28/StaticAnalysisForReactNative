package defpackage;
/* compiled from: PG */
/* renamed from: acdz  reason: default package */
/* loaded from: classes2.dex */
public final class acdz extends aceg {
    private final int a;
    private final dbsg<String> b;
    private final boolean c;

    public acdz(int i, dbsg<String> dbsgVar, boolean z) {
        this.a = i;
        this.b = dbsgVar;
        this.c = z;
    }

    @Override // defpackage.aceg
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aceg
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.aceg
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aceg) {
            aceg acegVar = (aceg) obj;
            if (this.a == acegVar.a() && this.b.equals(acegVar.b()) && this.c == acegVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
        sb.append("GroupingMetadata{clusterSize=");
        sb.append(i);
        sb.append(", photoContinuationToken=");
        sb.append(valueOf);
        sb.append(", isLastPage=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
