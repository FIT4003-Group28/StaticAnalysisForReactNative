package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: kcw  reason: default package */
/* loaded from: classes7.dex */
public final class kcw implements kqm {
    public final Deque<kqn> a;
    @dzsi
    public kql b;
    @dzsi
    public lkf c;
    @dzsi
    public lkg d;
    private final Deque<kqm> e;
    private final Deque<kqo> f;

    public kcw(kqm kqmVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        arrayDeque.push(kqmVar);
        this.a = new ArrayDeque();
        this.f = new ArrayDeque();
    }

    @Override // defpackage.kqm
    public final void a() {
        kqm peek = this.e.peek();
        dbsk.s(peek);
        peek.a();
    }

    public final void b(kqn kqnVar) {
        dbsk.s(kqnVar);
        this.a.push(kqnVar);
    }

    public final void c(kqn kqnVar) {
        dbsk.l(!this.a.isEmpty());
        if (this.a.peek() != kqnVar) {
            throw new IllegalArgumentException("Only remove the most recent navigation intent interceptor.");
        }
        this.a.pop();
    }

    public final void d(kqm kqmVar) {
        this.e.push(kqmVar);
    }

    public final void e(kqm kqmVar) {
        dbsk.l(this.e.peek() == kqmVar);
        try {
            this.e.pop();
        } catch (NoSuchElementException e) {
            throw new IllegalStateException("Illegal call to popOverrideMyLocationHandler. Calls to this method should be symmetric to calls to pushOverrideMyLocationHandler.", e);
        }
    }

    public final void f(kql kqlVar) {
        dbsk.l(this.b == null);
        this.b = kqlVar;
    }

    public final void g() {
        dbsk.l(this.b != null);
        this.b = null;
    }

    public final void h(kqo kqoVar) {
        dbsk.s(kqoVar);
        this.f.push(kqoVar);
    }

    public final boolean i(aryn arynVar) {
        for (kqo kqoVar : this.f) {
            if (kqoVar.a(arynVar)) {
                return true;
            }
        }
        return false;
    }

    public final void j(kqo kqoVar) {
        dbsk.l(!this.f.isEmpty());
        if (this.f.peek() != kqoVar) {
            throw new IllegalArgumentException("Only remove the most recent navigation POI map click interceptor");
        }
        this.f.pop();
    }
}
