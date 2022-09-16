package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajdu  reason: default package */
/* loaded from: classes.dex */
public final class ajdu implements Runnable {
    public ScheduledFuture a;
    public asaa b;
    public apzg c;
    public arzs d;
    public boolean e;
    public final List f;
    final /* synthetic */ ajdz g;
    private final String h;
    private final byte[] i;
    private aoob j;
    private final String k;
    private final atzm l;

    public ajdu(ajdz ajdzVar, ajdy ajdyVar) {
        this.g = ajdzVar;
        String str = ajdyVar.a;
        str.getClass();
        this.h = str;
        this.b = ajdyVar.c;
        this.f = new ArrayList();
        this.i = ajdyVar.b;
        this.j = ajdyVar.f;
        this.l = ajdyVar.g;
        this.k = ajdyVar.i;
    }

    public final ajeb a() {
        azqb azqbVar = new azqb() { // from class: ajdt
            @Override // defpackage.azqb
            public final Object get() {
                return Boolean.valueOf(ajdu.this.e);
            }
        };
        String str = this.h;
        ajeb ajebVar = new ajeb();
        ajebVar.a = azqbVar;
        ajebVar.b = str;
        ajebVar.f = this.l;
        return ajebVar;
    }

    public final void b() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.a = null;
        }
        this.f.clear();
    }

    public final boolean c() {
        ScheduledFuture scheduledFuture;
        return !this.e && (scheduledFuture = this.a) != null && !scheduledFuture.isDone();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return akzj.f(this.b, ((ajdu) obj).b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        asaa asaaVar;
        apzg apzgVar;
        boolean z;
        ylr.b();
        if (this.e) {
            return;
        }
        aaww a = ((ajdv) this.g.b.get()).a();
        a.t(this.h);
        a.k(this.i);
        ajdw ajdwVar = (ajdw) a;
        ajdwVar.d = this.f;
        ajdwVar.s = this.j;
        ajdwVar.t = this.k;
        aikd aikdVar = null;
        r1 = null;
        arzs arzsVar = null;
        try {
            arzf b = ((ajdv) this.g.b.get()).b(a);
            if (b == null || (b.b & 2) == 0) {
                asaaVar = null;
            } else {
                asaaVar = b.d;
                if (asaaVar == null) {
                    asaaVar = asaa.a;
                }
            }
            this.b = asaaVar;
            if (b == null || (b.b & 16) == 0) {
                apzgVar = null;
            } else {
                apzgVar = b.e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            }
            this.c = apzgVar;
            if (b != null && (b.b & 64) != 0 && (arzsVar = b.g) == null) {
                arzsVar = arzs.a;
            }
            this.d = arzsVar;
            if (b != null && (b.b & 256) != 0) {
                this.j = b.h;
            }
            if (!this.e) {
                ajdz ajdzVar = this.g;
                ajeb a2 = a();
                a2.c = asaaVar;
                a2.d = this.c;
                a2.e = this.d;
                z = ajdzVar.F(a2.a());
            } else {
                z = true;
            }
            ajdz ajdzVar2 = this.g;
            ajdzVar2.e = ajdzVar2.w(b);
            if (!z) {
                return;
            }
            ajdz ajdzVar3 = this.g;
            ajdzVar3.C(this, ajdzVar3.e);
        } catch (aart e) {
            Iterator it = this.g.d.iterator();
            while (true) {
                if (it.hasNext()) {
                    aikd d = ((ajed) it.next()).d(e);
                    if (d != null) {
                        aikdVar = d;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (aikdVar != null) {
                this.g.D(aikdVar);
                return;
            }
            ajdz ajdzVar4 = this.g;
            ajdzVar4.C(this, ajdzVar4.e);
        }
    }
}
