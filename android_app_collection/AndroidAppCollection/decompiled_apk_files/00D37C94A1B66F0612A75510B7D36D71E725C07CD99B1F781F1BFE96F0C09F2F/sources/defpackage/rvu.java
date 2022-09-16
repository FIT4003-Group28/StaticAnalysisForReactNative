package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
/* compiled from: PG */
/* renamed from: rvu  reason: default package */
/* loaded from: classes4.dex */
public final class rvu implements qte {
    public final UsageReportingOptInOptions a;
    private final Status b;

    public rvu(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        this.b = status;
        this.a = usageReportingOptInOptions;
    }

    @Override // defpackage.qte
    public final Status a() {
        return this.b;
    }

    public final String toString() {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.a.a != 1) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        return String.format("OptInOptionsResultImpl[%s]", objArr);
    }
}
