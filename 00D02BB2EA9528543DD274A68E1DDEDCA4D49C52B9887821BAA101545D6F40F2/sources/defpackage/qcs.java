package defpackage;
/* compiled from: PG */
/* renamed from: qcs  reason: default package */
/* loaded from: classes7.dex */
public final class qcs {
    public qcr a;
    private final amte b;
    private boolean c;
    private int d = 0;

    public qcs(qcr qcrVar, amte amteVar) {
        this.a = qcrVar;
        this.b = amteVar;
    }

    @dzsi
    public final qct a(@dzsi qbj qbjVar) {
        if (qbjVar == null) {
            return null;
        }
        amvh[] amvhVarArr = this.b.c;
        vum vumVar = new vum();
        vumVar.a = this.b.i();
        vumVar.p = false;
        for (amvh amvhVar : amvhVarArr) {
            vumVar.b(amvhVar);
        }
        qbn j = qbjVar.j(vumVar.a(), this.b, this.c, this.d);
        qcr qcrVar = this.a;
        ((qao) qcrVar).e = j;
        return qcrVar.a();
    }

    public final void b(@dzsi Integer num) {
        this.d = num.intValue();
    }

    public final void c() {
        qcr qcrVar = this.a;
        qcrVar.e(true);
        this.a = qcrVar;
    }

    public final void d(qbs qbsVar) {
        qcr qcrVar = this.a;
        qcrVar.f(qbsVar);
        this.a = qcrVar;
    }

    public final void e(boolean z) {
        qcr qcrVar = this.a;
        qcrVar.g(z);
        this.a = qcrVar;
    }

    public final void f() {
        this.c = true;
    }
}
