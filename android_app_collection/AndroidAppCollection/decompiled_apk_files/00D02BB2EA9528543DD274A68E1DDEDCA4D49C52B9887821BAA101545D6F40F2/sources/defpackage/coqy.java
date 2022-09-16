package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceReport;
/* compiled from: PG */
/* renamed from: coqy  reason: default package */
/* loaded from: classes5.dex */
public final class coqy extends coqj<Status> {
    final /* synthetic */ Account a;
    final /* synthetic */ PlaceReport k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coqy(GoogleApiClient googleApiClient, Account account, PlaceReport placeReport) {
        super(googleApiClient);
        this.a = account;
        this.k = placeReport;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(coqt coqtVar) {
        coqt coqtVar2 = coqtVar;
        Account account = this.a;
        PlaceReport placeReport = this.k;
        coqtVar2.K();
        int i = ((coqr) coqtVar2.L()).i(account, placeReport);
        p(new Status(i != 0 ? i != 1 ? 8 : 3504 : 0));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return status;
    }
}
