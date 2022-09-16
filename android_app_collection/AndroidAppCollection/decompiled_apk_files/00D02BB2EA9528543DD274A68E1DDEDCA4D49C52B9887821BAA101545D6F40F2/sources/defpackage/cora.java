package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.ReportingState;
/* compiled from: PG */
/* renamed from: cora  reason: default package */
/* loaded from: classes5.dex */
public final class cora implements cnom {
    public final Status a;
    private final ReportingState b;

    public cora(Status status, ReportingState reportingState) {
        this.a = status;
        if (status.g == 0) {
            cnwc.a(reportingState);
        }
        this.b = reportingState;
    }

    private final void k() {
        Status status = this.a;
        if (status.g == 0) {
            return;
        }
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("Illegal to call this method when status is failure: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }

    public final int b() {
        k();
        return this.b.a();
    }

    public final boolean c() {
        return coqe.a(b());
    }

    public final int d() {
        k();
        return this.b.b();
    }

    public final boolean e() {
        return coqe.a(d());
    }

    public final boolean f() {
        k();
        return this.b.a;
    }

    public final boolean g() {
        k();
        return this.b.b;
    }

    public final boolean h() {
        k();
        return this.b.c();
    }

    public final int i() {
        k();
        return corc.a(this.b.d());
    }

    public final boolean j() {
        k();
        ReportingState reportingState = this.b;
        return !reportingState.c() && reportingState.d() == 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length());
        sb.append("ReportingStateResultImpl{mStatus=");
        sb.append(valueOf);
        sb.append(", mReportingState=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
