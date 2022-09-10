package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: rez  reason: default package */
/* loaded from: classes7.dex */
public class rez implements rei {
    public final ivf a;
    public final dxio<qbt> b;
    public final amte c;
    public final int d;
    izy e;
    private final jbk f;
    private final zqa g;
    private final reh h;
    private final Activity i;
    @dzsi
    private final qbo j;
    private final amub k;
    private final zfe l;

    public rez(Activity activity, ivg ivgVar, cqhn cqhnVar, dxio<qbt> dxioVar, zpy zpyVar, dxio<reu> dxioVar2, amte amteVar, int i, long j) {
        rew rewVar = new rew(this);
        this.l = rewVar;
        rex rexVar = new rex(this);
        this.e = rexVar;
        this.i = activity;
        this.a = ivgVar.a(rexVar);
        this.j = dxioVar.a().f();
        this.b = dxioVar;
        this.c = amteVar;
        this.d = i;
        this.f = new rey(activity, amteVar.g(), amteVar.b, amteVar.i());
        amub b = amteVar.b(i, activity);
        dbsk.s(b);
        this.k = b;
        amve amveVar = b.d;
        this.g = new zqa(activity, zpyVar.b, zpyVar.a(activity, b, iva.a().booleanValue(), false, rewVar), zpyVar.b(b), zpyVar.c(b, null), zpyVar.d(activity, amveVar), true, null, zpyVar.e(b, amveVar, false), zpy.f(activity, zpyVar.a, b, null, iva.a().booleanValue()), null, null, null, null, null, null, zpyVar.c);
        this.h = dxioVar2.a().a(amteVar, i, null, true, false, j, null, dbpy.a);
    }

    @Override // defpackage.rei
    public jbk a() {
        return this.f;
    }

    @Override // defpackage.rei
    public reh b() {
        return this.h;
    }

    public void d() {
        this.e.c();
    }

    public void e() {
        this.e.d();
    }

    @Override // defpackage.rei
    /* renamed from: f */
    public zqa c() {
        return this.g;
    }

    public void g() {
        if (this.j == null || !btpf.b(this.i) || this.i.getResources().getConfiguration().orientation != 2) {
            return;
        }
        qbo qboVar = this.j;
        vut I = vuv.I();
        I.A(amuh.e(0, this.k));
        I.o(this.k.ag());
        I.H(albo.a);
        I.E(false);
        I.F(true);
        I.x(false);
        I.v(false);
        I.Q(alfa.SHOW_NONE);
        I.D(true);
        qboVar.e(I.O());
    }
}
