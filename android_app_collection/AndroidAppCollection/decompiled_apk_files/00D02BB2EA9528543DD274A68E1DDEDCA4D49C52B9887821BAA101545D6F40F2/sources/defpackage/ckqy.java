package defpackage;
/* compiled from: PG */
/* renamed from: ckqy  reason: default package */
/* loaded from: classes4.dex */
public final class ckqy<T> extends btrh<T> {
    private final int d;

    public ckqy(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            ((ckqx) this.a).g = ((amqo) obj).a();
        } else if (i != 1) {
            ckqx ckqxVar = (ckqx) this.a;
            crhp crhpVar = (crhp) obj;
            if (!crhpVar.d()) {
                ckqxVar.d = null;
                ckqxVar.e = null;
                ckqxVar.f = null;
                ckqxVar.a.c = 0;
                return;
            }
            ckqxVar.d = crhpVar.e();
            cray g = ckqxVar.d.g();
            cray crayVar = ckqxVar.e;
            if (crayVar == null || crayVar.a != g.a) {
                ckqxVar.f = null;
            }
            ckqxVar.e = g;
        } else {
            ckqx ckqxVar2 = (ckqx) this.a;
            ckqxVar2.f = ((cqzy) obj).a;
            if (!ckqxVar2.h) {
                return;
            }
            ((ckco) ckqxVar2.c.a.a(ckhi.ax)).a(ckre.a(ckqxVar2.o()));
            ckqxVar2.h = false;
        }
    }
}
