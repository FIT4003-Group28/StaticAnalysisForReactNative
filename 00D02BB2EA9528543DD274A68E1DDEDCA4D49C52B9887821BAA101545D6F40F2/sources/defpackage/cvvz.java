package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: cvvz  reason: default package */
/* loaded from: classes.dex */
public final class cvvz<AccountT> {
    public final CopyOnWriteArrayList<cvvn<cvvx, AccountT>> a = new CopyOnWriteArrayList<>();
    public cvvn<cvvx, AccountT> b;
    public AccountT c;
    private final cvvl<cvvx> d;

    public cvvz(cvvl<cvvx> cvvlVar) {
        this.d = cvvlVar;
    }

    public final Iterable<cvvn<cvvx, AccountT>> a() {
        cvvn<cvvx, AccountT> cvvnVar = this.b;
        return cvvnVar == null ? this.a : dcbg.d(dcdc.f(cvvnVar), this.a);
    }

    public final void b(cvvn<cvvx, AccountT> cvvnVar, AccountT accountt) {
        cvvm<cvvx> a;
        if (accountt == null || (a = cvvnVar.a(accountt)) == null) {
            return;
        }
        a.a(this.d);
    }

    public final void c(cvvn<cvvx, AccountT> cvvnVar, AccountT accountt) {
        cvvm<cvvx> a;
        if (accountt == null || (a = cvvnVar.a(accountt)) == null) {
            return;
        }
        a.b(this.d);
    }
}
