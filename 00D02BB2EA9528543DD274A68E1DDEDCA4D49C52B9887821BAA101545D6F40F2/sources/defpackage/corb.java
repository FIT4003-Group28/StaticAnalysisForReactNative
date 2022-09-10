package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: corb  reason: default package */
/* loaded from: classes5.dex */
public final class corb implements cnom {
    public final Status a;
    public final long b;

    public corb(Status status, long j) {
        this.a = status;
        this.b = j;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
        sb.append("ReportingUploadResultImpl{mStatus=");
        sb.append(valueOf);
        sb.append(", mRequestId=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }
}
