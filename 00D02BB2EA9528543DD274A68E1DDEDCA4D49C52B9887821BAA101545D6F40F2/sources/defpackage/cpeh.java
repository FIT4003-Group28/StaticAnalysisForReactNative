package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
/* compiled from: PG */
/* renamed from: cpeh  reason: default package */
/* loaded from: classes5.dex */
public final class cpeh extends cpep<Status> {
    final /* synthetic */ UdcWriteLocalSettingsRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpeh(GoogleApiClient googleApiClient, UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest) {
        super(googleApiClient);
        this.a = udcWriteLocalSettingsRequest;
    }

    @Override // defpackage.cpep
    protected final void a(Context context, cpeb cpebVar) {
        cpebVar.h(new cpeg(this), this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return status;
    }
}
