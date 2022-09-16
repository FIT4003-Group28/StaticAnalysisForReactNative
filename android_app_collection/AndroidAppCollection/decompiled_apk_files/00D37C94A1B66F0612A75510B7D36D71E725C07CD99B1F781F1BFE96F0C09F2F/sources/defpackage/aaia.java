package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aaia  reason: default package */
/* loaded from: classes.dex */
public final class aaia implements aahf, afvu, afvr, ynl {
    public final Context a;
    public final aakl b;
    private final aahe c;
    private final snc d;
    private final afvn e;
    private final azqb f;
    private final amup g;
    private final Executor h;
    private final Executor i;
    private final azqb j;
    private final aaki k;
    private final azqb l;
    private afvm m;
    private boolean n;
    private aaik o;
    private final aahc p;

    public aaia(Context context, snc sncVar, yni yniVar, afvn afvnVar, Map map, azqb azqbVar, Executor executor, Executor executor2, aakl aaklVar, azqb azqbVar2, aaki aakiVar, aahc aahcVar, azqb azqbVar3, byte[] bArr) {
        this.a = context;
        this.d = sncVar;
        map.getClass();
        this.g = amup.j(map);
        this.h = anlz.g(executor);
        this.i = executor2;
        this.b = aaklVar;
        this.j = azqbVar2;
        this.k = aakiVar;
        this.p = aahcVar;
        this.e = afvnVar;
        this.f = azqbVar;
        this.l = azqbVar3;
        this.m = null;
        this.o = null;
        this.n = false;
        this.c = new aahv();
        yniVar.g(this);
    }

    private final synchronized aaik e() {
        aaik aaikVar;
        d();
        aaikVar = this.o;
        aaikVar.getClass();
        return aaikVar;
    }

    @Override // defpackage.aahf
    public final synchronized aahe a(afvm afvmVar) {
        aaik e = e();
        afvm afvmVar2 = this.m;
        afvmVar2.getClass();
        if (abgb.g(afvmVar2, afvmVar)) {
            return e;
        }
        return this.c;
    }

    @Override // defpackage.afvr
    public final void b(final afvm afvmVar) {
        this.i.execute(new Runnable() { // from class: aahz
            @Override // java.lang.Runnable
            public final void run() {
                aaia aaiaVar = aaia.this;
                aaiaVar.b.b(aaiaVar.a, afvmVar);
            }
        });
    }

    @Override // defpackage.aahf
    public final aahe c() {
        return e();
    }

    public final synchronized void d() {
        afvm c = this.e.c();
        boolean g = c.g();
        afvm afvmVar = this.m;
        if (afvmVar == null || !abgb.g(c, afvmVar) || this.n != g) {
            aaik aaikVar = this.o;
            if (aaikVar != null) {
                if (this.n) {
                    final Context context = this.a;
                    try {
                        final aajb aajbVar = aaikVar.c;
                        try {
                            ((vno) aajbVar.c.get()).a(new vow() { // from class: aaiv
                                @Override // defpackage.vow
                                public final Object a(vox voxVar) {
                                    aajb aajbVar2 = aajb.this;
                                    Context context2 = context;
                                    aqxo.y(aajbVar2.b.z());
                                    aajbVar2.e.b(context2, aajbVar2.b);
                                    return true;
                                }
                            }).get();
                        } catch (InterruptedException | ExecutionException e) {
                            if (e instanceof InterruptedException) {
                                Thread.currentThread().interrupt();
                            }
                            throw aahd.a(e, 5);
                        }
                    } catch (aahd e2) {
                        aaikVar.o(e2);
                    }
                }
                aaik aaikVar2 = this.o;
                aaikVar2.f = true;
                for (aajy aajyVar : aaikVar2.a.values()) {
                    aajyVar.sm();
                }
                aaikVar2.a.clear();
                for (aajy aajyVar2 : aaikVar2.b.values()) {
                    aajyVar2.sm();
                }
                aaikVar2.b.clear();
            }
            this.m = c;
            this.n = g;
            afvm afvmVar2 = this.m;
            afvmVar2.getClass();
            this.o = new aaik(afvmVar2, this.h, this.d, this.g, this.b, this.j, this.k, this.p, this.l, null);
        }
    }

    @Override // defpackage.aajm
    public final void g() {
        ((afvt) this.f.get()).i(this);
    }

    @Override // defpackage.afvu
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.afvu
    public final void k() {
        d();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwd afwdVar = (afwd) obj;
                d();
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
