package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: csow  reason: default package */
/* loaded from: classes5.dex */
public final class csow {
    public Executor a;
    @dzsi
    public Account b;
    public Context c;
    private dewl d;
    private String e;
    private boolean f = true;

    public final csox a() {
        dbsk.t(this.a, "An executor is required. Please provide one by calling setExecutor().");
        dbsk.t(this.d, "A channel provider is required. Please provide one by calling setChannelProvider().");
        dbsk.t(this.e, "A table ID is required. Please provide one by calling setTableId().");
        dbsk.t(this.c, "A context is required. Please provide one by calling setContext().");
        dbsk.m(this.b != null, "Either an account (for authenticated calls) or an API key (for unauthenticated calls) is required.");
        dtcm dtcmVar = (dtcm) dtcm.e(new dtcl(), this.d.a(dtcz.c));
        final Context context = this.c;
        final cspo cspoVar = new cspo(context, cspq.a);
        final String str = this.e;
        final csnk a = csnl.a(new cqaz(), Settings.Secure.getString(context.getContentResolver(), "android_id"), decl.b(1000L));
        dbty dbtyVar = new dbty(context, str, a, cspoVar) { // from class: csou
            private final Context a;
            private final String b;
            private final csnk c;
            private final cspo d;

            {
                this.a = context;
                this.b = str;
                this.c = a;
                this.d = cspoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                Context context2 = this.a;
                String str2 = this.b;
                final cspo cspoVar2 = this.d;
                cspk.d(context2, str2);
                new dbty(cspoVar2) { // from class: csov
                    private final cspo a;

                    {
                        this.a = cspoVar2;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        return this.a.a();
                    }
                };
                return new cspm();
            }
        };
        if (this.b != null) {
            dtcmVar = (dtcm) dtcmVar.g(dexa.a, dexa.c(this.b.name));
        }
        return new csox(this.a, this.e, dtcmVar, this.f, dbtyVar);
    }

    public final void b(dewl dewlVar) {
        dbsk.s(dewlVar);
        this.d = dewlVar;
    }

    public final void c() {
        this.f = true;
    }

    public final void d(String str) {
        this.e = str;
    }
}
