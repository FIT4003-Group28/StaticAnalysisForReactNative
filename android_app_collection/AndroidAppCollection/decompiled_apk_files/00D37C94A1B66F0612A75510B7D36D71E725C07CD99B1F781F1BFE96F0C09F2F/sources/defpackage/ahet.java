package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahet  reason: default package */
/* loaded from: classes.dex */
public final class ahet {
    public final Executor a;
    protected final azqb b;
    final aynx c;
    final aynx d;
    protected final axnm e;
    final aypf f = new aypf();
    public boolean g;
    protected final aiqp h;
    private final aisp i;

    public ahet(aiqp aiqpVar, aisp aispVar, axnm axnmVar, Executor executor, azqb azqbVar, aynx aynxVar, aynx aynxVar2) {
        this.h = aiqpVar;
        this.i = aispVar;
        this.e = axnmVar;
        this.a = executor;
        this.b = azqbVar;
        this.c = aynxVar;
        this.d = aynxVar2;
    }

    public final void a() {
        if (this.f.a() == 0) {
            this.f.d(this.i.a.aa(new aher(this, 1), aaga.j));
            this.f.d(this.d.aa(new aher(this), aaga.j));
            this.f.d(this.c.aa(new aher(this), aaga.j));
        }
    }
}
