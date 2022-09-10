package defpackage;

import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cmqk  reason: default package */
/* loaded from: classes5.dex */
public final class cmqk extends cmqm<Status> {
    final /* synthetic */ UsageInfo[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmqk(GoogleApiClient googleApiClient, UsageInfo[] usageInfoArr) {
        super(googleApiClient);
        this.a = usageInfoArr;
    }

    @Override // defpackage.cmql
    protected final void a(cmqf cmqfVar) {
        cmqfVar.f(new cmqn(this), this.a);
    }
}
