package defpackage;

import android.accounts.Account;
import android.content.Context;
import defpackage.dssj;
import java.util.Collection;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: csqf  reason: default package */
/* loaded from: classes5.dex */
public final class csqf<T extends dssj> implements cspt<Void, Collection<cspy<T>>> {
    private final Executor a;
    private final dewl b;
    private final String c;
    private final dspy<dtrw, T> d;
    private final Context e;

    public csqf(dewl dewlVar, Executor executor, Context context, String str, dspy<dtrw, T> dspyVar) {
        this.a = executor;
        this.b = dewlVar;
        this.e = context;
        this.c = str;
        this.d = dspyVar;
    }

    @Override // defpackage.cspt
    public final csps<Void, Collection<cspy<T>>> a(Account account) {
        csow b = csox.b();
        b.b = account;
        b.b(this.b);
        b.c = this.e;
        b.a = this.a;
        b.d(this.c);
        b.c();
        return new csqe(b.a(), this.c, this.d);
    }
}
