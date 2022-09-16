package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
@Deprecated
/* renamed from: acwi  reason: default package */
/* loaded from: classes.dex */
public final class acwi implements acvp {
    final List a;
    final List b;
    private final afvn c;
    private final amqo d;
    private final azqb e;
    private final yni f;
    private final Map g;
    private boolean h;

    public acwi(yni yniVar, afvn afvnVar, amqo amqoVar, azqb azqbVar) {
        yniVar.getClass();
        this.f = yniVar;
        this.c = afvnVar;
        this.d = amqoVar;
        this.e = azqbVar;
        this.g = new HashMap();
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    private final acvk n(Class cls) {
        for (acvk acvkVar : this.a) {
            if (acvkVar.getClass().equals(cls)) {
                return acvkVar;
            }
        }
        return null;
    }

    private final acvn o(Class cls, Class cls2, acvl acvlVar, ampt amptVar, boolean z) {
        acwf acwfVar = new acwf(this, acvlVar, cls2, amptVar, z);
        p(cls).a.add(acwfVar);
        return acwfVar;
    }

    private final acwa p(Class cls) {
        acwa acwaVar = (acwa) this.g.get(cls);
        if (acwaVar != null) {
            return acwaVar;
        }
        acwa acwaVar2 = new acwa(this);
        this.f.a(this, cls, acwaVar2);
        this.g.put(cls, acwaVar2);
        return acwaVar2;
    }

    @Override // defpackage.acvp
    public final yrj a() {
        return (yrj) this.e.get();
    }

    @Override // defpackage.acvp
    public final acvn b(Class cls, acvl acvlVar) {
        return d(cls, acvlVar, null);
    }

    @Override // defpackage.acvp
    public final acvn c(Class cls, Class cls2, acvl acvlVar, boolean z) {
        return o(cls, cls2, acvlVar, null, z);
    }

    @Override // defpackage.acvp
    public final acvn d(Class cls, acvl acvlVar, ampt amptVar) {
        return o(cls, null, acvlVar, amptVar, false);
    }

    @Override // defpackage.acvp
    public final afvn e() {
        return this.c;
    }

    @Override // defpackage.acvp
    public final synchronized void f() {
        this.h = true;
        m();
    }

    @Override // defpackage.acvp
    public final void g(Class cls, acvm acvmVar) {
        p(cls).e.add(new acwb(this, acvmVar));
    }

    @Override // defpackage.acvp
    public final void h(Class cls, String str) {
        p(cls).c.add(new acwg(this, str));
    }

    @Override // defpackage.acvp
    public final void i(Class cls, acvo acvoVar) {
        p(cls).d.add(new acwh(this, acvoVar));
    }

    @Override // defpackage.acvp
    public final boolean j(Class cls) {
        return n(cls) != null;
    }

    @Override // defpackage.acvp
    public final void k(Class cls, Class cls2, acvl acvlVar) {
        p(cls).b.add(new acwe(this, acvlVar, cls, cls2));
    }

    public final void l(acvk acvkVar, Class cls, boolean z) {
        acvk n;
        if (cls == null || (n = n(cls)) == null) {
            return;
        }
        acvkVar.d(n);
        if (!z) {
            return;
        }
        n.e();
        this.a.remove(n);
        this.b.remove(n);
    }

    public final synchronized void m() {
        if (!this.h) {
            return;
        }
        for (acvk acvkVar : this.b) {
            if (!acvkVar.a) {
                ((dvj) this.d.get()).b(acvkVar.b());
            }
        }
        this.b.clear();
    }
}
