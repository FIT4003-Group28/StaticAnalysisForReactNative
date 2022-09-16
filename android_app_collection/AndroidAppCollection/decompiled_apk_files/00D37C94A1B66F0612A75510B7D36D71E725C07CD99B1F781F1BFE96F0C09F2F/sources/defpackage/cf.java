package defpackage;
/* compiled from: PG */
/* renamed from: cf  reason: default package */
/* loaded from: classes2.dex */
public final class cf extends cd {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private cc aj = this.j;
    public int ai = 0;

    public cf() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int i) {
        if (this.ai == i) {
            return;
        }
        this.ai = i;
        this.q.clear();
        if (this.ai == 1) {
            this.aj = this.i;
        } else {
            this.aj = this.j;
        }
        this.q.add(this.aj);
    }

    @Override // defpackage.cd
    public final cc u(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.ai != 0) {
                return null;
            }
            return this.aj;
        }
        if (this.ai == 1) {
            return this.aj;
        }
        return null;
    }

    @Override // defpackage.cd
    public final void y(bz bzVar) {
        cd cdVar = this.r;
        if (cdVar == null) {
            return;
        }
        cc u = cdVar.u(2);
        cc u2 = cdVar.u(4);
        if (this.ai == 0) {
            u = cdVar.u(3);
            u2 = cdVar.u(5);
        }
        if (this.ag != -1) {
            bzVar.g(bz.c(bzVar, bzVar.e(this.aj), bzVar.e(u), this.ag, false));
        } else if (this.ah != -1) {
            bzVar.g(bz.c(bzVar, bzVar.e(this.aj), bzVar.e(u2), -this.ah, false));
        } else if (this.af == -1.0f) {
        } else {
            cb e = bzVar.e(this.aj);
            cb e2 = bzVar.e(u);
            cb e3 = bzVar.e(u2);
            float f = this.af;
            bw a = bzVar.a();
            a.d.f(e, -1.0f);
            a.d.f(e2, 1.0f - f);
            a.d.f(e3, f);
            bzVar.g(a);
        }
    }

    @Override // defpackage.cd
    public final void z() {
        if (this.r == null) {
            return;
        }
        int p = bz.p(this.aj);
        if (this.ai != 1) {
            this.w = 0;
            this.x = p;
            q(this.r.h());
            k(0);
            return;
        }
        this.w = p;
        this.x = 0;
        k(this.r.d());
        q(0);
    }
}
