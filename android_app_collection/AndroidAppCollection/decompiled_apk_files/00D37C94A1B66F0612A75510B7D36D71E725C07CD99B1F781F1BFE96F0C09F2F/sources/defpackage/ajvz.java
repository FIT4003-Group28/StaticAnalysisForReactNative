package defpackage;
/* compiled from: PG */
/* renamed from: ajvz  reason: default package */
/* loaded from: classes.dex */
public final class ajvz implements ajrv, ynl {
    public final ajyx a;
    public ajyv b;
    public final /* synthetic */ ajwb c;

    public ajvz(ajwb ajwbVar, ajyx ajyxVar) {
        this.c = ajwbVar;
        this.a = ajyxVar;
    }

    public final ajyv a(ajxf ajxfVar) {
        ajyu a = ajyv.a();
        a.a = ajxfVar;
        ajwb ajwbVar = this.c;
        a.b = ajwbVar.F;
        a.c = ajwbVar;
        a.d = ajwbVar;
        return a.a();
    }

    public final void b(ajfz ajfzVar) {
        if (this.a == null) {
            return;
        }
        athe atheVar = this.c.i.a().f;
        if (atheVar == null) {
            atheVar = athe.a;
        }
        boolean z = false;
        boolean z2 = !atheVar.i ? this.b != null || this.c.af(ajfy.NEXT) || (this.c.g.isEmpty() && this.c.af(ajfy.RELOAD)) : this.b != null || (ajfzVar != null ? ((ajgc) ajfzVar).b == ajfy.NEXT : this.c.af(ajfy.NEXT)) || (this.c.g.isEmpty() && (ajfzVar != null ? ((ajgc) ajfzVar).b == ajfy.RELOAD : this.c.af(ajfy.RELOAD)));
        if (this.c.e.i(this.a) != -1) {
            z = true;
        }
        if (z2 == z) {
            return;
        }
        if (z2) {
            ajwb ajwbVar = this.c;
            ajwbVar.e.n(ajwbVar.o(), this.a);
            if (!this.c.af(ajfy.NEXT)) {
                return;
            }
            if (this.b == null) {
                this.b = a(ajxe.a());
            }
            c(this.b.a);
            return;
        }
        this.c.e.q(this.a);
    }

    public final void c(ajxf ajxfVar) {
        if (this.a == null) {
            return;
        }
        ajyv ajyvVar = this.b;
        if (ajyvVar == null) {
            this.b = a(ajxfVar);
        } else if (ajyvVar.a != ajxfVar) {
            this.b = ajyvVar.b(ajxfVar);
        }
        if (ajxfVar instanceof ajwz) {
            if (this.c.af(ajfy.NEXT)) {
                ajyv b = this.b.b(ajxe.a());
                this.b = b;
                this.a.q(b);
                return;
            }
            this.a.q(null);
            return;
        }
        this.a.q(this.b);
    }

    public final void d(Object obj, Object obj2) {
        e();
        if (obj != null) {
            this.c.h.i(this, obj);
            if (obj2 == null || obj2 == obj) {
                return;
            }
            this.c.h.i(this, obj2);
            return;
        }
        this.c.h.g(this);
    }

    public final void e() {
        this.c.h.m(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                this.c.Q();
                c((ajwz) obj);
                return null;
            } else if (i == 1) {
                this.c.Q();
                c((ajxd) obj);
                return null;
            } else if (i == 2) {
                ajxe ajxeVar = (ajxe) obj;
                if (!this.c.k(ajxeVar)) {
                    return null;
                }
                c(ajxeVar);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ajwz.class, ajxd.class, ajxe.class};
    }

    @Override // defpackage.ajrv
    public final void m(ajru ajruVar, Object obj) {
        if (obj == this.b) {
            this.c.C();
        }
    }
}
