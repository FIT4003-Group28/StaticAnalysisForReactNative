package defpackage;
/* compiled from: PG */
/* renamed from: qju  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class qju implements Runnable {
    public final /* synthetic */ qjy a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ qju(qjy qjyVar, int i) {
        this.a = qjyVar;
        this.b = i;
    }

    public /* synthetic */ qju(qjy qjyVar, int i, int i2) {
        this.c = i2;
        this.a = qjyVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            qjy qjyVar = this.a;
            int i2 = this.b;
            if (i2 == 0) {
                qjz qjzVar = qjyVar.a;
                qjzVar.u = 2;
                qjzVar.c = true;
                qjzVar.d = true;
                synchronized (qjzVar.t) {
                    for (tgo tgoVar : qjyVar.a.t) {
                        tgoVar.a();
                    }
                }
                return;
            }
            qjz qjzVar2 = qjyVar.a;
            qjzVar2.u = 1;
            synchronized (qjzVar2.t) {
                for (tgo tgoVar2 : qjyVar.a.t) {
                    tgoVar2.b(i2);
                }
            }
            qjyVar.a.g();
        } else if (i == 1) {
            qjy qjyVar2 = this.a;
            qjyVar2.a.v.b(this.b);
        } else if (i == 2) {
            qjy qjyVar3 = this.a;
            int i3 = this.b;
            qjz qjzVar3 = qjyVar3.a;
            qjzVar3.n = -1;
            qjzVar3.o = -1;
            qjzVar3.j = null;
            qjzVar3.k = null;
            qjzVar3.l = 0.0d;
            qjzVar3.m();
            qjzVar3.m = false;
            qjzVar3.p = null;
            qjz qjzVar4 = qjyVar3.a;
            qjzVar4.u = 1;
            synchronized (qjzVar4.t) {
                for (tgo tgoVar3 : qjyVar3.a.t) {
                    tgoVar3.d(i3);
                }
            }
            qjyVar3.a.g();
            qjz qjzVar5 = qjyVar3.a;
            qjzVar5.n(qjzVar5.b);
        } else {
            qjy qjyVar4 = this.a;
            int i4 = this.b;
            qjz qjzVar6 = qjyVar4.a;
            qjzVar6.u = 3;
            synchronized (qjzVar6.t) {
                for (tgo tgoVar4 : qjyVar4.a.t) {
                    tgoVar4.c(i4);
                }
            }
        }
    }
}
