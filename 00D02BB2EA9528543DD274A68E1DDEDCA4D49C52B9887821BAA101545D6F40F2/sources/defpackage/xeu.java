package defpackage;

import com.google.commerce.tapandpay.android.seclient.GetSeCardBalanceResponse;
/* compiled from: PG */
/* renamed from: xeu  reason: default package */
/* loaded from: classes7.dex */
final class xeu extends dbor {
    final /* synthetic */ dice a;
    final /* synthetic */ String b;
    final /* synthetic */ ckcv c;
    final /* synthetic */ xew d;

    public xeu(xew xewVar, dice diceVar, String str, ckcv ckcvVar) {
        this.d = xewVar;
        this.a = diceVar;
        this.b = str;
        this.c = ckcvVar;
    }

    @Override // defpackage.dbor, defpackage.dboq
    public final void b(GetSeCardBalanceResponse getSeCardBalanceResponse) {
        this.d.k(ckkm.m);
        this.d.f(this.a, getSeCardBalanceResponse, this.b);
        this.c.a((ckcr) this.d.d.a(ckkm.p));
    }
}
