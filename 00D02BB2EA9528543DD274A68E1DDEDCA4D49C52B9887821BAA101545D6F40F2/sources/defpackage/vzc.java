package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vzc  reason: default package */
/* loaded from: classes7.dex */
public final class vzc {
    public final Executor a;
    private final dcdn<vzd, bwrg<vvy>> b;

    public vzc(Context context, Executor executor, Executor executor2) {
        vzd[] values;
        this.a = executor;
        dcdg p = dcdn.p();
        for (vzd vzdVar : vzd.values()) {
            p.f(vzdVar, new bwrg((dssr) vvy.j.cu(7), context, bwre.PERSISTENT_FILE, vzdVar.f, executor2));
        }
        this.b = p.b();
    }

    public final void a(vzd vzdVar) {
        bwrg<vvy> bwrgVar = this.b.get(vzdVar);
        dbsk.s(bwrgVar);
        bwrgVar.k();
    }

    public final void b(vzd vzdVar, vvy vvyVar) {
        bwrg<vvy> bwrgVar = this.b.get(vzdVar);
        dbsk.s(bwrgVar);
        bwrgVar.f(vvyVar);
    }

    public final void c(vzd vzdVar, final dbsz<vvy> dbszVar) {
        bwrg<vvy> bwrgVar = this.b.get(vzdVar);
        dbsk.s(bwrgVar);
        bwrgVar.h(new dbsz(this, dbszVar) { // from class: vza
            private final vzc a;
            private final dbsz b;

            {
                this.a = this;
                this.b = dbszVar;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                vzc vzcVar = this.a;
                final dbsz dbszVar2 = this.b;
                final vvy vvyVar = (vvy) obj;
                vzcVar.a.execute(new Runnable(dbszVar2, vvyVar) { // from class: vzb
                    private final dbsz a;
                    private final vvy b;

                    {
                        this.a = dbszVar2;
                        this.b = vvyVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.NU(this.b);
                    }
                });
            }
        });
    }

    @dzsi
    public final vvy d(vzd vzdVar) {
        bwrg<vvy> bwrgVar = this.b.get(vzdVar);
        dbsk.s(bwrgVar);
        vvy vvyVar = bwrgVar.i().a;
        if (vvyVar == null) {
            return null;
        }
        return vvyVar;
    }
}
