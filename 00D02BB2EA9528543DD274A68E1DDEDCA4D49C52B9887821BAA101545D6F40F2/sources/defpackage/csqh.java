package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Pair;
import defpackage.dssj;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: csqh  reason: default package */
/* loaded from: classes5.dex */
public final class csqh<T extends dssj> implements cspt<Void, Collection<cspy<T>>> {
    private static final Object g = new Object();
    public final cspx a;
    private final Executor b;
    private final dewl c;
    private final String d;
    private final dspy<dtrw, T> e;
    private final Context f;
    private final Map<Account, csps<Void, Collection<cspy<T>>>> h = new HashMap();

    public csqh(dewl dewlVar, Executor executor, Context context, String str, dspy<dtrw, T> dspyVar, cspx cspxVar) {
        this.b = executor;
        this.c = dewlVar;
        this.f = context;
        this.d = str;
        this.e = dspyVar;
        this.a = cspxVar;
    }

    @Override // defpackage.cspt
    public final csps<Void, Collection<cspy<T>>> a(Account account) {
        csps<Void, Collection<cspy<T>>> cspsVar;
        synchronized (g) {
            cspsVar = this.h.get(account);
            if (cspsVar == null) {
                int i = cqaz.a;
                new dcrc(new dctb("InfiniteDataGaiaMultiValueLookupMoonLanderWithInMemoryCache"));
                csow b = csox.b();
                b.b = account;
                b.b(this.c);
                b.c = this.f;
                b.a = this.b;
                b.d(this.d);
                b.c();
                cspsVar = new csqe<>(new csop(b.a(), new csoe(this.a.a(), new dbty(this) { // from class: csqg
                    private final csqh a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        csqh csqhVar = this.a;
                        return Pair.create(Long.valueOf(csqhVar.a.b()), csqhVar.a.c());
                    }
                })), this.d, this.e);
                this.h.put(account, cspsVar);
            }
        }
        return cspsVar;
    }
}
