package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acfa  reason: default package */
/* loaded from: classes2.dex */
public final class acfa implements acey {
    public final cxgn a;
    private final Executor b;

    public acfa(Context context, cqat cqatVar, dewl dewlVar, Executor executor) {
        cxgr cxgrVar = new cxgr();
        cxgrVar.a = 300000L;
        cxgrVar.c = context;
        cxgrVar.d = "gmm-inmemory-facs-cache";
        cxgrVar.e = cqatVar;
        if (dewlVar != null) {
            cxgrVar.b = dewlVar;
            String str = cxgrVar.d;
            if (!(str == null ? dbpy.a : dbsg.i(str)).a()) {
                cxgrVar.d = "common";
            }
            cxgq cxgqVar = cxgrVar.f;
            if (!(cxgqVar == null ? dbpy.a : dbsg.i(cxgqVar)).a()) {
                cxgrVar.f = new cxgp();
            }
            cxgj cxgjVar = cxgrVar.g;
            if (!(cxgjVar == null ? dbpy.a : dbsg.i(cxgjVar)).a()) {
                Context context2 = cxgrVar.c;
                if (context2 == null) {
                    throw new IllegalStateException("Property \"context\" has not been set");
                }
                cxgrVar.g = new cxgj(context2);
            }
            String str2 = cxgrVar.a == null ? " ttlMillis" : "";
            str2 = cxgrVar.b == null ? str2.concat(" channelProvider") : str2;
            str2 = cxgrVar.c == null ? String.valueOf(str2).concat(" context") : str2;
            str2 = cxgrVar.d == null ? String.valueOf(str2).concat(" instanceId") : str2;
            str2 = cxgrVar.e == null ? String.valueOf(str2).concat(" clock") : str2;
            str2 = cxgrVar.g == null ? String.valueOf(str2).concat(" loggerFactory") : str2;
            str2 = cxgrVar.f == null ? String.valueOf(str2).concat(" flags") : str2;
            if (!str2.isEmpty()) {
                String valueOf = String.valueOf(str2);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            this.a = new cxhe(new cxgs(cxgrVar.a.longValue(), cxgrVar.b, cxgrVar.c, cxgrVar.d, cxgrVar.e, cxgrVar.g, cxgrVar.f));
            this.b = executor;
            return;
        }
        throw new NullPointerException("Null channelProvider");
    }

    @Override // defpackage.acey
    public final dehn<Boolean> a(final Account account) {
        return deew.g(this.a.a(account).b(), new defg(this, account) { // from class: acez
            private final acfa a;
            private final Account b;

            {
                this.a = this;
                this.b = account;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                acfa acfaVar = this.a;
                Void r3 = (Void) obj;
                return acfaVar.a.a(this.b).a(dskf.WEB_AND_APP_ACTIVITY);
            }
        }, this.b);
    }
}
