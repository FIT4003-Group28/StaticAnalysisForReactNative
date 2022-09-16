package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
/* compiled from: PG */
/* renamed from: rvn  reason: default package */
/* loaded from: classes4.dex */
public final class rvn extends rvr {
    final /* synthetic */ rvh a;

    public rvn(rvh rvhVar) {
        this.a = rvhVar;
    }

    @Override // defpackage.rvr
    public final void a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        tgo.l(status, new qtd(new rvu(Status.a, usageReportingOptInOptions)), this.a);
    }
}
