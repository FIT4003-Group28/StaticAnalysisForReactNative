package defpackage;
/* compiled from: PG */
/* renamed from: ajri  reason: default package */
/* loaded from: classes.dex */
public final class ajri implements ajql {
    public final ajqm a;
    public int b;
    final /* synthetic */ ajrj c;
    private int d;

    public ajri(ajrj ajrjVar, ajqm ajqmVar) {
        this.c = ajrjVar;
        ajqmVar.getClass();
        this.a = ajqmVar;
        this.b = 0;
        this.d = ajqmVar.a();
    }

    @Override // defpackage.ymy
    public final void d(int i, int i2) {
        this.c.s();
        this.c.z(this.b + i, i2);
        this.d = this.a.a();
    }

    @Override // defpackage.ymy
    public final void e(int i, int i2) {
        this.c.s();
        ajrj ajrjVar = this.c;
        int i3 = this.b;
        ajrjVar.A(i + i3, i3 + i2);
        this.d = this.a.a();
    }

    public final int f(int i) {
        return i - this.b;
    }

    public final int g() {
        return this.b + this.a.a();
    }

    @Override // defpackage.ajql
    public final void pi() {
        this.c.s();
        int a = this.a.a();
        int min = Math.min(this.d, a);
        if (min > 0) {
            this.c.x(this.b, min);
        }
        int i = this.d;
        if (i > min) {
            this.c.z(this.b + min, i - min);
        } else if (a > min) {
            this.c.y(this.b + min, a - min);
        }
        this.d = a;
    }

    @Override // defpackage.ymy
    public final void pj(int i, int i2) {
        this.c.s();
        this.c.x(this.b + i, i2);
        this.d = this.a.a();
    }

    @Override // defpackage.ymy
    public final void pk(int i, int i2) {
        this.c.s();
        this.c.y(this.b + i, i2);
        this.d = this.a.a();
    }
}
