package defpackage;

import android.content.Context;
import dagger.internal.Factory;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: clep  reason: default package */
/* loaded from: classes5.dex */
final class clep extends cley {
    public final dzsj<clex> a;
    private final dzsj<Executor> b;
    private final dzsj<Context> c;
    private final dzsj d;
    private final dzsj e;
    private final dzsj f;
    private final dzsj<clhu> g;
    private final dzsj<clge> h;
    private final dzsj<clgq> i;
    private final dzsj<clfq> j;
    private final dzsj<clgk> k;
    private final dzsj<clgo> l;

    public clep(Context context) {
        dzsj<Executor> b = dxjc.b(clet.a);
        this.b = b;
        Factory b2 = dxjd.b(context);
        this.c = b2;
        clfk clfkVar = new clfk(b2);
        this.d = clfkVar;
        dzsj b3 = dxjc.b(new clfn(b2, clfkVar));
        this.e = b3;
        clic clicVar = new clic(b2);
        this.f = clicVar;
        dzsj<clhu> b4 = dxjc.b(new clhv(clicVar));
        this.g = b4;
        this.h = new clfs();
        clft clftVar = new clft(b2, b4);
        this.i = clftVar;
        clfr clfrVar = new clfr(b, b3, clftVar, b4, b4);
        this.j = clfrVar;
        clgl clglVar = new clgl(b2, b3, b4, clftVar, b, b4);
        this.k = clglVar;
        clgp clgpVar = new clgp(b, b4, clftVar, b4);
        this.l = clgpVar;
        this.a = dxjc.b(new clez(clfrVar, clglVar, clgpVar));
    }

    @Override // defpackage.cley
    public final clgu a() {
        return this.g.a();
    }
}
