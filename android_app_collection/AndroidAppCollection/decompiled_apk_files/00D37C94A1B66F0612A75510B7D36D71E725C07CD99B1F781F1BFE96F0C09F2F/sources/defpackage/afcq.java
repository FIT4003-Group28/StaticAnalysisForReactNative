package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afcq  reason: default package */
/* loaded from: classes.dex */
public class afcq extends ppa {
    private final pnp d;
    private final afci e;
    public final Handler f;
    public final aflm g;
    public final pjc h;
    public volatile afcn i;
    private final afbi j;
    private final afbq k;
    private atk l;

    public afcq(Executor executor, pnp pnpVar, afci afciVar, Handler handler, final afbi afbiVar, aflm aflmVar, afbq afbqVar) {
        this.d = pnpVar;
        this.e = afciVar;
        this.f = handler;
        this.j = afbiVar;
        pix pixVar = new pix();
        pixVar.b("VodMediaSource");
        pixVar.a = Uri.EMPTY;
        pixVar.b = afbiVar;
        this.h = pixVar.a();
        this.g = aflmVar;
        this.k = afbqVar;
        executor.execute(new Runnable() { // from class: afco
            @Override // java.lang.Runnable
            public final void run() {
                afbi afbiVar2 = afbi.this;
                afbiVar2.b().f(afbiVar2.a);
            }
        });
    }

    @Override // defpackage.pqb
    public final pjc r() {
        return this.h;
    }

    @Override // defpackage.ppa
    protected final void rA() {
    }

    @Override // defpackage.ppa
    protected final void rz(atk atkVar) {
        this.l = atkVar;
        rF(new afcr(this.h));
    }

    @Override // defpackage.pqb
    public final void s() {
    }

    public final void t() {
        if (this.i != null) {
            this.f.post(new afcp(this, 1));
        }
    }

    @Override // defpackage.pqb
    public final void u(ppy ppyVar) {
        this.g.aO();
        for (prx prxVar : ((afcn) ppyVar).b) {
            prxVar.i();
        }
        this.g.aN();
    }

    @Override // defpackage.pqb
    public final ppy v(ppz ppzVar, axf axfVar, long j) {
        this.g.aM();
        synchronized (this.j) {
            this.i = new afcn(axfVar, this.j, this.d, n(ppzVar), this.e, rJ(ppzVar), this.g, this.l, this.k);
        }
        this.g.aL();
        return this.i;
    }
}
