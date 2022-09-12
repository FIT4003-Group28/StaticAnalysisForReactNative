package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: avsj  reason: default package */
/* loaded from: classes.dex */
final class avsj {
    public final bvoh a;
    public final avzj b;
    public final Context c;
    public final dbty<Boolean> d;
    public final avpn e;
    public final dzsj<String> f;
    public final awfh g;
    public final bvjj h;

    public avsj(bvoh bvohVar, avzj avzjVar, Context context, avpn avpnVar, dbty<Boolean> dbtyVar, dzsj<String> dzsjVar, awfh awfhVar, bvjj bvjjVar) {
        this.a = bvohVar;
        this.b = avzjVar;
        this.c = context;
        this.g = awfhVar;
        this.h = bvjjVar;
        this.e = avpnVar;
        this.d = dbtyVar;
        this.f = dzsjVar;
    }

    public final avzg a() {
        avzj avzjVar = this.b;
        avzf c = avzg.c();
        avzb f = avzc.f();
        f.b(avzjVar.b(btlu.a));
        f.d(false);
        f.c(false);
        c.b(f.a());
        c.c(avze.a);
        return c.a();
    }

    public final boolean b(@dzsi btlu btluVar) {
        return !btlu.p(btluVar) || this.g.b();
    }
}
