package defpackage;

import com.google.apps.tiktok.account.AccountId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amgw  reason: default package */
/* loaded from: classes.dex */
public final class amgw extends a {
    final /* synthetic */ amgy a;
    private final AccountId b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amgw(amgy amgyVar, AccountId accountId) {
        super(amgyVar.b, null);
        this.a = amgyVar;
        this.b = accountId;
    }

    @Override // defpackage.a
    public final ac d(Class cls, x xVar) {
        aqxo.y(cls.equals(amgx.class));
        return new amgx(xVar, this.a.a, this.b);
    }
}
