package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aagk  reason: default package */
/* loaded from: classes.dex */
public final class aagk implements aagi, afvu, afvr, ynl {
    private static final aagh a = new aagj();
    private final afvn b;
    private final azqb c;
    private final azqb d;
    private final aaki e;
    private final amup f;
    private final Executor g;
    private afvm h;
    private boolean i;
    private aagu j;

    public aagk(afvn afvnVar, azqb azqbVar, yni yniVar, azqb azqbVar2, aaki aakiVar, Map map, Executor executor) {
        this.b = afvnVar;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.e = aakiVar;
        this.f = amup.j(map);
        this.g = executor;
        yniVar.g(this);
    }

    @Override // defpackage.aagi
    public final synchronized aagh a(afvm afvmVar) {
        aagu d = d();
        afvm afvmVar2 = this.h;
        afvmVar2.getClass();
        if (abgb.g(afvmVar2, afvmVar)) {
            return d;
        }
        return a;
    }

    @Override // defpackage.afvr
    public final void b(afvm afvmVar) {
        e();
    }

    @Override // defpackage.aagi
    @Deprecated
    public final aagh c() {
        return d();
    }

    public final synchronized aagu d() {
        aagu aaguVar;
        e();
        aaguVar = this.j;
        aaguVar.getClass();
        return aaguVar;
    }

    public final synchronized void e() {
        afvm c = this.b.c();
        boolean g = c.g();
        afvm afvmVar = this.h;
        if (afvmVar == null || !abgb.g(afvmVar, c) || this.i != g) {
            aagu aaguVar = this.j;
            if (aaguVar != null) {
                aaguVar.m();
            }
            this.h = c;
            this.i = c.g();
            this.j = new aagu(this.d, this.e, this.f, this.g);
        }
    }

    @Override // defpackage.aajm
    public final void g() {
        ((afvt) this.c.get()).i(this);
    }

    @Override // defpackage.afvu
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.afvu
    public final void k() {
        e();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwd afwdVar = (afwd) obj;
                e();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwd.class};
    }

    @Override // defpackage.afvu
    public final /* synthetic */ void l() {
    }
}
