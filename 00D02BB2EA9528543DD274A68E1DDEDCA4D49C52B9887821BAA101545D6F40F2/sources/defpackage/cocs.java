package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cocs  reason: default package */
/* loaded from: classes5.dex */
public abstract class cocs extends cnpg<Status, codb> {
    public cocs(GoogleApiClient googleApiClient) {
        super(coct.a, googleApiClient);
    }

    @Override // defpackage.cnpg, defpackage.cnph
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.p((cnom) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return status == null ? Status.c : status;
    }
}
