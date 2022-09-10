package defpackage;
/* compiled from: PG */
/* renamed from: bmng  reason: default package */
/* loaded from: classes3.dex */
public final class bmng extends bmoa {
    private final dtcc a;
    private final dbsg<bmnz> b;

    public bmng(dtcc dtccVar, dbsg<bmnz> dbsgVar) {
        if (dtccVar != null) {
            this.a = dtccVar;
            this.b = dbsgVar;
            return;
        }
        throw new NullPointerException("Null locationSurvey");
    }

    @Override // defpackage.bmoa
    public final dtcc a() {
        return this.a;
    }

    @Override // defpackage.bmoa
    public final dbsg<bmnz> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmoa) {
            bmoa bmoaVar = (bmoa) obj;
            if (this.a.equals(bmoaVar.a()) && this.b.equals(bmoaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dtcc dtccVar = this.a;
        int i = dtccVar.bC;
        if (i == 0) {
            i = dsst.a.b(dtccVar).c(dtccVar);
            dtccVar.bC = i;
        }
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
        sb.append("ScheduleStatus{locationSurvey=");
        sb.append(valueOf);
        sb.append(", scheduleError=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
