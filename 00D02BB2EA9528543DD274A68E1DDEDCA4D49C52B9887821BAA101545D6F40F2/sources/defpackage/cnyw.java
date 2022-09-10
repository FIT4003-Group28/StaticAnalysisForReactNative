package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cnyw  reason: default package */
/* loaded from: classes5.dex */
public abstract class cnyw extends cnpg<Status, cnyz> {
    public cnyw(GoogleApiClient googleApiClient) {
        super(cnyj.a, googleApiClient);
    }

    @Override // defpackage.cnpg, defpackage.cnph
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.p((cnom) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return status;
    }
}
