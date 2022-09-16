package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gsp  reason: default package */
/* loaded from: classes3.dex */
public final class gsp {
    public final afvn a;
    public final zah b;
    public final yzj c;
    public final aaxt d;
    public final Executor e;
    private final yni f;
    private final aadd g;
    private final aagi h;

    public gsp(zah zahVar, yni yniVar, aaxt aaxtVar, yzj yzjVar, afvn afvnVar, aadd aaddVar, aagi aagiVar, Executor executor) {
        this.b = zahVar;
        this.f = yniVar;
        this.d = aaxtVar;
        this.c = yzjVar;
        this.a = afvnVar;
        this.g = aaddVar;
        this.h = aagiVar;
        this.e = executor;
    }

    public final void a(String str, aspb aspbVar) {
        if (eog.u(this.g)) {
            String f = aakj.f(62, str);
            aajs c = this.h.a(this.a.c()).c();
            asox f2 = asoy.f(f);
            f2.b(aspbVar);
            c.j(f2);
            c.b().Q();
            return;
        }
        this.f.f(new gaf(str, aspbVar, false));
    }
}
