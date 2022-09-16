package defpackage;
/* compiled from: PG */
/* renamed from: aias  reason: default package */
/* loaded from: classes.dex */
public class aias implements aiap, airt, ynl {
    private final airr a;
    private final aire b;
    private final aiaq c;
    private boolean d;
    private boolean e;
    private aizx f;
    private aizw g;

    public aias(airr airrVar, aire aireVar, aiaq aiaqVar) {
        airrVar.getClass();
        this.a = airrVar;
        aireVar.getClass();
        this.b = aireVar;
        aiaqVar.getClass();
        this.c = aiaqVar;
        aiaqVar.pD(this);
    }

    private final void h() {
        boolean i;
        aizw aizwVar = this.g;
        if (aizwVar != null) {
            i = aizwVar.c();
        } else {
            i = this.b.i(aiqk.a);
        }
        if (this.e != i) {
            this.e = i;
            this.c.pB(i);
        }
    }

    private final void i() {
        boolean i;
        aizx aizxVar = this.f;
        if (aizxVar != null) {
            i = aizxVar.d();
        } else {
            i = this.b.i(aiqk.b);
        }
        if (this.d != i) {
            this.d = i;
            this.c.nK(i);
        }
    }

    @Override // defpackage.aiap
    public void a() {
        aizw aizwVar = this.g;
        if (aizwVar != null) {
            aizwVar.a();
        } else {
            this.b.a(aiqk.a);
        }
    }

    @Override // defpackage.aiap
    public void b() {
        aizx aizxVar = this.f;
        if (aizxVar == null) {
            if (!this.b.i(aiqk.b)) {
                this.a.V(0L);
                return;
            } else {
                this.b.a(aiqk.b);
                return;
            }
        }
        aizxVar.b();
    }

    public final void c(aizw aizwVar) {
        this.g = aizwVar;
        h();
    }

    public final void d(aizx aizxVar) {
        this.f = aizxVar;
        i();
    }

    public final void e() {
        if (this.f == null) {
            i();
        }
        if (this.g == null) {
            h();
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.am().h(aiwv.n(airwVar.aB(), 262144L)).h(aiwv.l(1)).aa(new ayqb() { // from class: aiar
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ahhl ahhlVar = (ahhl) obj;
                aias.this.e();
            }
        }, aiax.b)};
    }

    @Override // defpackage.ynl
    public Class[] ky(Class cls, Object obj, int i) {
        return ahfc.c(this, obj, i);
    }
}
