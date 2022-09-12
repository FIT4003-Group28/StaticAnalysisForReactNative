package defpackage;
/* compiled from: PG */
/* renamed from: tn  reason: default package */
/* loaded from: classes7.dex */
public final class tn implements ty {
    final ty a;
    int b = 0;
    int c = -1;
    int d = -1;
    Object e = null;

    public tn(ty tyVar) {
        this.a = tyVar;
    }

    @Override // defpackage.ty
    public final void a(int i, int i2) {
        throw null;
    }

    @Override // defpackage.ty
    public final void b(int i, int i2) {
        throw null;
    }

    public final void c() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.a.a(this.c, this.d);
        } else if (i != 2) {
            ty tyVar = this.a;
            ((tm) tyVar).a.u(this.c, this.d, this.e);
        } else {
            this.a.b(this.c, this.d);
        }
        this.e = null;
        this.b = 0;
    }

    public final void d(int i, int i2) {
        c();
        ((tm) this.a).a.v(i, i2);
    }

    public final void e(int i, Object obj) {
        int i2;
        int i3;
        int i4;
        if (this.b == 3 && i <= (i3 = this.d + (i2 = this.c)) && (i4 = i + 1) >= i2 && this.e == obj) {
            this.c = Math.min(i, i2);
            this.d = Math.max(i3, i4) - this.c;
            return;
        }
        c();
        this.c = i;
        this.d = 1;
        this.e = obj;
        this.b = 3;
    }
}
