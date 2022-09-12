package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cpcq  reason: default package */
/* loaded from: classes.dex */
public abstract class cpcq<TResult> {
    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract TResult d();

    public abstract Exception e();

    public <TContinuationResult> cpcq<TContinuationResult> f(cpbu<TResult, TContinuationResult> cpbuVar) {
        throw null;
    }

    public <TContinuationResult> cpcq<TContinuationResult> g(Executor executor, cpbu<TResult, TContinuationResult> cpbuVar) {
        throw null;
    }

    public <TContinuationResult> cpcq<TContinuationResult> h(Executor executor, cpbu<TResult, cpcq<TContinuationResult>> cpbuVar) {
        throw null;
    }

    public <TContinuationResult> cpcq<TContinuationResult> i(cpcp<TResult, TContinuationResult> cpcpVar) {
        throw null;
    }

    public <TContinuationResult> cpcq<TContinuationResult> j(Executor executor, cpcp<TResult, TContinuationResult> cpcpVar) {
        throw null;
    }

    public void k(cpcc cpccVar) {
        throw null;
    }

    public void l(Executor executor, cpcc cpccVar) {
        throw null;
    }

    public void m(cpcf<TResult> cpcfVar) {
        throw null;
    }

    public void n(Executor executor, cpcf<TResult> cpcfVar) {
        throw null;
    }

    public abstract void o(Executor executor, cpci cpciVar);

    public abstract void p(Executor executor, cpcl<? super TResult> cpclVar);

    public <TContinuationResult> void q(cpbu<TResult, cpcq<TContinuationResult>> cpbuVar) {
        throw null;
    }

    public abstract void r(cpci cpciVar);

    public abstract void s(cpcl<? super TResult> cpclVar);
}
