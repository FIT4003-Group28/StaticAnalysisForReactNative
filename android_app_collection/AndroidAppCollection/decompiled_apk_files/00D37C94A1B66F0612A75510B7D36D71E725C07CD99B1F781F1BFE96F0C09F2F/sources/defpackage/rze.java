package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: rze  reason: default package */
/* loaded from: classes4.dex */
final class rze extends axyj {
    final /* synthetic */ rzf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rze(rzf rzfVar, axyg axygVar) {
        super(axygVar);
        this.a = rzfVar;
    }

    @Override // defpackage.axyj
    protected final void a(axzl axzlVar, ayat ayatVar) {
        try {
            rzf rzfVar = this.a;
            String e = qhz.e(rzfVar.b, rzfVar.c, "oauth2:https://www.googleapis.com/auth/oauth_integrations");
            ayaq c = ayaq.c("Authorization", ayat.a);
            String valueOf = String.valueOf(e);
            ayatVar.f(c, valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
        } catch (IOException | qhr e2) {
            ((anav) ((anav) ((anav) rzf.a.g()).h(e2)).i("com/google/android/libraries/accountlinking/rpc/AuthClientInterceptor$1", "checkedStart", 50, "AuthClientInterceptor.java")).q("Failed to get an auth token via GoogleAuthUtil#getToken()");
        }
        this.b.k(axzlVar, ayatVar);
    }
}
