package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: drl  reason: default package */
/* loaded from: classes6.dex */
public final class drl implements dqr, dqa {
    public final dqb a;
    public final dpw b;
    public final dxio<drg> c;
    public final dbsg<dyb> d;
    public final drj e;
    public boolean f = false;
    private final dbsg<dow> g;

    public drl(dqc dqcVar, Resources resources, final drh drhVar, final m mVar, dpw dpwVar, dhm dhmVar, dbsg<dow> dbsgVar, dbsg<dsf> dbsgVar2, final dbsg<dyb> dbsgVar3) {
        this.b = dpwVar;
        this.c = btsp.b(new dbty(drhVar, mVar, dbsgVar3) { // from class: dri
            private final drh a;
            private final m b;
            private final dbsg c;

            {
                this.a = drhVar;
                this.b = mVar;
                this.c = dbsgVar3;
            }

            @Override // defpackage.dbty
            public final Object a() {
                drh drhVar2 = this.a;
                m mVar2 = this.b;
                dbsg dbsgVar4 = this.c;
                Activity activity = (Activity) ((dxjd) drhVar2.a).a;
                drh.a(activity, 1);
                dkn a = drhVar2.b.a();
                drh.a(a, 2);
                dre a2 = drhVar2.c.a();
                drh.a(a2, 3);
                bvsl a3 = drhVar2.d.a();
                drh.a(a3, 4);
                bvlo a4 = drhVar2.e.a();
                drh.a(a4, 5);
                drh.a(mVar2, 6);
                drh.a(dbsgVar4, 7);
                return new drg(activity, a, a2, a3, a4, mVar2, dbsgVar4);
            }
        });
        this.g = dbsgVar;
        this.d = dbsgVar3;
        Executor a = dqcVar.a.a();
        dqc.a(a, 1);
        befw a2 = dqcVar.b.a();
        dqc.a(a2, 2);
        dqc.a(this, 3);
        this.a = new dqb(a, a2, this);
        if (dbsgVar3.a()) {
            z<dyf> zVar = dbsgVar3.b().a;
            drk drkVar = new drk(resources, dpwVar, dbsgVar2, dhmVar);
            zVar.b(mVar, drkVar);
            this.e = drkVar;
            return;
        }
        this.e = new drj(resources, dpwVar, dbsgVar2, dhmVar);
    }

    @Override // defpackage.dqa
    public final void a(ilo iloVar) {
        bvrj.UI_THREAD.c();
        if (this.f) {
            return;
        }
        drg a = this.c.a();
        if (!a.l) {
            if (iloVar != null) {
                a.k = iloVar;
            }
            a.d.setText(iloVar.n());
            String a2 = bnhr.a(a.a.getResources(), iloVar.h().T);
            if (a2.isEmpty()) {
                a.e.setText(iloVar.ar());
            } else {
                a.e.setText(a.a.getString(R.string.LH_PLACE_CARD_SUBTITLE_WITH_FLOOR, new Object[]{iloVar.B(), a2}));
                a.e.setMinLines(2);
            }
            a.j.d = iloVar;
        }
        this.e.b(iloVar);
        this.b.f = this.e;
        if (this.d.a()) {
            this.d.b().c(iloVar);
        }
        if (!this.g.a()) {
            return;
        }
        this.g.b();
        throw null;
    }

    @Override // defpackage.dqr
    public final void b() {
        dqb dqbVar = this.a;
        bvrj.UI_THREAD.c();
        dqbVar.d = true;
        ilo iloVar = dqbVar.c;
        if (iloVar == null || dqbVar.b != null) {
            return;
        }
        dqbVar.b(iloVar);
    }

    @Override // defpackage.dqr
    public final void c() {
        dqb dqbVar = this.a;
        bvrj.UI_THREAD.c();
        dqbVar.d = false;
    }
}
