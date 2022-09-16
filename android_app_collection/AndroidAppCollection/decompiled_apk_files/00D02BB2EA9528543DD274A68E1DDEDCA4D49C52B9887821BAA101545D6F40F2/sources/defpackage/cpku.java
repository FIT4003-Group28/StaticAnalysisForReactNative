package defpackage;

import com.google.android.libraries.abuse.reporting.ReportAbuseActivity;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: cpku  reason: default package */
/* loaded from: classes5.dex */
public final class cpku extends cpkq<CronetEngine> {
    final /* synthetic */ ReportAbuseActivity a;

    public cpku(ReportAbuseActivity reportAbuseActivity) {
        this.a = reportAbuseActivity;
    }

    @Override // defpackage.cpkq
    protected final /* bridge */ /* synthetic */ CronetEngine a() {
        return new CronetEngine.Builder(this.a.k).mo32build();
    }
}
