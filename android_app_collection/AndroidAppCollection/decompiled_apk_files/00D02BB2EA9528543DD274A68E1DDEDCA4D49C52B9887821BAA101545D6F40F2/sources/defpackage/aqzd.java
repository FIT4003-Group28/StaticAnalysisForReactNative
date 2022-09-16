package defpackage;
/* compiled from: PG */
/* renamed from: aqzd  reason: default package */
/* loaded from: classes.dex */
public final class aqzd<T> extends btrh<T> {
    private final int d;

    public aqzd(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            aqzc aqzcVar = (aqzc) this.a;
            ardp ardpVar = (ardp) obj;
            aqzcVar.f();
            aqzcVar.t.g = aqzcVar.o();
            aral aralVar = aqzcVar.t;
            aralVar.c.W(bvjk.dt, aralVar.g() + 1);
            aqzcVar.s.a().a(aqzcVar.t);
        } else if (i == 1) {
            ((aqzc) this.a).t.f = ((alhj) obj).a;
        } else if (i == 2) {
            ((aqzc) this.a).e.k = ((ardq) obj).a;
        } else if (i != 3) {
            aqzc aqzcVar2 = (aqzc) this.a;
            crhp crhpVar = (crhp) obj;
            aqzcVar2.w = crhpVar.b();
            aqzcVar2.x = crhpVar.d();
            aqzcVar2.y = crhpVar.f();
        } else {
            aqzc aqzcVar3 = (aqzc) this.a;
            aqzcVar3.b = ((ahlc) obj).a;
            if (!aqzcVar3.g.m(bvjk.bf, false)) {
                return;
            }
            bvrb bvrbVar = aqzcVar3.h;
            gga ggaVar = aqzcVar3.a;
            int i2 = aqzcVar3.b;
            StringBuilder sb = new StringBuilder(29);
            sb.append("Magnetometer acc: ");
            sb.append(i2);
            cjxu.k(bvrbVar, ggaVar, sb.toString());
        }
    }

    public aqzd(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }
}
