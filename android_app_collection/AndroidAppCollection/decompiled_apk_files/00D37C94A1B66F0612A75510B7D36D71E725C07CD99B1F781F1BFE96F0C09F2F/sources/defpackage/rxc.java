package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
/* compiled from: PG */
/* renamed from: rxc  reason: default package */
/* loaded from: classes4.dex */
public final class rxc extends rxb {
    private final qtu a;

    public rxc(qtu qtuVar) {
        this.a = qtuVar;
    }

    @Override // defpackage.rxb
    public final void b(Status status, GetClientTokenResponse getClientTokenResponse) {
        this.a.d(new rww(status, getClientTokenResponse));
    }
}
