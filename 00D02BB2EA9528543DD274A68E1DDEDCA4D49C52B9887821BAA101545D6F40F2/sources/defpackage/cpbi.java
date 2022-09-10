package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
/* compiled from: PG */
/* renamed from: cpbi  reason: default package */
/* loaded from: classes5.dex */
public final class cpbi implements cnom {
    public final Status a;
    public final GetAllCardsResponse b;

    public cpbi(Status status, GetAllCardsResponse getAllCardsResponse) {
        this.a = status;
        this.b = getAllCardsResponse;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }
}
