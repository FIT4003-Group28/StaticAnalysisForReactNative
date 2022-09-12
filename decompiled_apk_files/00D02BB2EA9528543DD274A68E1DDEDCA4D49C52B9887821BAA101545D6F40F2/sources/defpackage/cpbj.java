package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
/* compiled from: PG */
/* renamed from: cpbj  reason: default package */
/* loaded from: classes5.dex */
final class cpbj extends cpbe {
    private final cnph<cpbi> a;

    public cpbj(cnph<cpbi> cnphVar) {
        this.a = cnphVar;
    }

    @Override // defpackage.cpbe, defpackage.cpbd
    public final void b(Status status, GetAllCardsResponse getAllCardsResponse) {
        this.a.c(new cpbi(status, getAllCardsResponse));
    }
}
