package defpackage;
/* compiled from: PG */
/* renamed from: ysl  reason: default package */
/* loaded from: classes7.dex */
final class ysl extends ysx {
    private final dood a;

    public ysl(dood doodVar) {
        this.a = doodVar;
    }

    @Override // defpackage.ysx
    public final dood a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ysx)) {
            return false;
        }
        return this.a.equals(((ysx) obj).a());
    }

    public final int hashCode() {
        dood doodVar = this.a;
        int i = doodVar.bC;
        if (i == 0) {
            i = dsst.a.b(doodVar).c(doodVar);
            doodVar.bC = i;
        }
        return 1000003 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("FetchedDeparture{scheduleEvent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
