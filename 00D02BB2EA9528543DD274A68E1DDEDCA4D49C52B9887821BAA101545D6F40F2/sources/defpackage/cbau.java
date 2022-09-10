package defpackage;
/* compiled from: PG */
/* renamed from: cbau  reason: default package */
/* loaded from: classes4.dex */
public class cbau implements cbqt {
    @dzsi
    private final dpsd a;
    private final dpvi b;
    @dzsi
    private final dpvi c;
    @dzsi
    private dpsd d;
    private dpvi e;
    @dzsi
    private dpvi f;

    public cbau(@dzsi dpsd dpsdVar, @dzsi dpsd dpsdVar2, dpvi dpviVar, dpvi dpviVar2, @dzsi dpvi dpviVar3, @dzsi dpvi dpviVar4) {
        this.a = dpsdVar;
        this.d = dpsdVar2;
        this.b = dpviVar;
        this.e = dpviVar2;
        this.c = dpviVar3;
        this.f = dpviVar4;
    }

    private static boolean o(@dzsi Object obj, @dzsi Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static dpvi p(dpvi dpviVar, dqjj dqjjVar) {
        dsqp dsqpVar = (dsqp) dpviVar.cu(5);
        dsqpVar.bC(dpviVar);
        dpvh dpvhVar = (dpvh) dsqpVar;
        int i = dqjjVar.b;
        if (dpvhVar.c) {
            dpvhVar.bF();
            dpvhVar.c = false;
        }
        dpvi dpviVar2 = (dpvi) dpvhVar.b;
        dpvi dpviVar3 = dpvi.g;
        int i2 = dpviVar2.a | 8;
        dpviVar2.a = i2;
        dpviVar2.e = i;
        int i3 = dqjjVar.c;
        dpviVar2.a = i2 | 16;
        dpviVar2.f = i3;
        return dpvhVar.bK();
    }

    private static dpvi q(dpvi dpviVar, dpvi dpviVar2) {
        dsqp dsqpVar = (dsqp) dpviVar.cu(5);
        dsqpVar.bC(dpviVar);
        dpvh dpvhVar = (dpvh) dsqpVar;
        int i = dpviVar2.b;
        if (dpvhVar.c) {
            dpvhVar.bF();
            dpvhVar.c = false;
        }
        dpvi dpviVar3 = (dpvi) dpvhVar.b;
        int i2 = dpviVar3.a | 1;
        dpviVar3.a = i2;
        dpviVar3.b = i;
        int i3 = dpviVar2.c;
        int i4 = i2 | 2;
        dpviVar3.a = i4;
        dpviVar3.c = i3;
        int i5 = dpviVar2.d;
        dpviVar3.a = i4 | 4;
        dpviVar3.d = i5;
        return dpvhVar.bK();
    }

    @Override // defpackage.cbqt
    @dzsi
    public dpsd a() {
        return this.d;
    }

    @Override // defpackage.cbqt
    public dpvi b() {
        return this.e;
    }

    @Override // defpackage.cbqt
    @dzsi
    public dpvi c() {
        return this.f;
    }

    @Override // defpackage.cbqt
    public void d(dpsd dpsdVar) {
        this.d = dpsdVar;
    }

    public void e() {
        this.d = null;
    }

    public void f(dpvi dpviVar) {
        this.e = dpviVar;
    }

    @Override // defpackage.cbrs
    public Boolean g() {
        return h();
    }

    public void i(dpvi dpviVar) {
        this.e = q(this.e, dpviVar);
    }

    @Override // defpackage.cbrp
    public Boolean j() {
        return Boolean.valueOf((!o(this.a, this.d)) | (!this.b.equals(this.e)) | (!o(this.c, this.f)));
    }

    public void k(dqjj dqjjVar) {
        this.e = p(this.e, dqjjVar);
    }

    public void l(@dzsi dpvi dpviVar) {
        this.f = dpviVar;
    }

    public void m(@dzsi dqjj dqjjVar) {
        dpvi dpviVar = this.f;
        if (dpviVar == null) {
            return;
        }
        if (dqjjVar == null) {
            dsqp dsqpVar = (dsqp) dpviVar.cu(5);
            dsqpVar.bC(dpviVar);
            dpvh dpvhVar = (dpvh) dsqpVar;
            if (dpvhVar.c) {
                dpvhVar.bF();
                dpvhVar.c = false;
            }
            dpvi dpviVar2 = (dpvi) dpvhVar.b;
            int i = dpviVar2.a & (-9);
            dpviVar2.a = i;
            dpviVar2.e = 0;
            dpviVar2.a = i & (-17);
            dpviVar2.f = 0;
            this.f = dpvhVar.bK();
            return;
        }
        this.f = p(dpviVar, dqjjVar);
    }

    public void n(dpvi dpviVar) {
        if (this.f == null) {
            this.f = dpvi.g;
        }
        this.f = q(this.f, dpviVar);
    }

    @Override // defpackage.cbrs
    public Boolean h() {
        dpsd dpsdVar = this.d;
        boolean z = false;
        if (dpsdVar != null && this.e != null && ((dpsdVar.a & 1) != 0 || dpsdVar.c.size() > 0 || this.d.d.size() > 0 || this.d.e.size() > 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
