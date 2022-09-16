package defpackage;
/* compiled from: PG */
/* renamed from: ef  reason: default package */
/* loaded from: classes6.dex */
public final class ef extends ed {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private ec aj = this.j;
    public int ai = 0;

    public ef() {
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

    @Override // defpackage.ed
    public final ec v(int i) {
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

    @Override // defpackage.ed
    public final void y(dy dyVar) {
        ed edVar = this.r;
        if (edVar == null) {
            return;
        }
        ec v = edVar.v(2);
        ec v2 = edVar.v(4);
        if (this.ai == 0) {
            v = edVar.v(3);
            v2 = edVar.v(5);
        }
        if (this.ag != -1) {
            dyVar.g(dy.k(dyVar, dyVar.b(this.aj), dyVar.b(v), this.ag, false));
        } else if (this.ah != -1) {
            dyVar.g(dy.k(dyVar, dyVar.b(this.aj), dyVar.b(v2), -this.ah, false));
        } else if (this.af == -1.0f) {
        } else {
            ea b = dyVar.b(this.aj);
            ea b2 = dyVar.b(v);
            ea b3 = dyVar.b(v2);
            float f = this.af;
            dv c = dyVar.c();
            c.d.a(b, -1.0f);
            c.d.a(b2, 1.0f - f);
            c.d.a(b3, f);
            dyVar.g(c);
        }
    }

    @Override // defpackage.ed
    public final void z() {
        if (this.r == null) {
            return;
        }
        int p = dy.p(this.aj);
        if (this.ai != 1) {
            this.w = 0;
            this.x = p;
            o(this.r.d());
            p(0);
            return;
        }
        this.w = p;
        this.x = 0;
        p(this.r.g());
        o(0);
    }
}
