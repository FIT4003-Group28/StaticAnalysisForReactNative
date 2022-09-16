package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetActiveAccountResponse;
/* compiled from: PG */
/* renamed from: cpbp  reason: default package */
/* loaded from: classes5.dex */
final class cpbp extends cpbe {
    final /* synthetic */ cpct a;

    public cpbp(cpct cpctVar) {
        this.a = cpctVar;
    }

    @Override // defpackage.cpbe, defpackage.cpbd
    public final void c(Status status, GetActiveAccountResponse getActiveAccountResponse) {
        cntf.c(status, getActiveAccountResponse.a, this.a);
    }
}
