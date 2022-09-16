package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
/* compiled from: PG */
/* renamed from: rww  reason: default package */
/* loaded from: classes4.dex */
public final class rww implements qte {
    public final GetClientTokenResponse a;
    private final Status b;

    public rww(Status status, GetClientTokenResponse getClientTokenResponse) {
        this.b = status;
        this.a = getClientTokenResponse;
    }

    @Override // defpackage.qte
    public final Status a() {
        return this.b;
    }
}
