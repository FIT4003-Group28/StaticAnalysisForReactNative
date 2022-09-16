package defpackage;
/* compiled from: PG */
/* renamed from: abub  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abub implements Runnable {
    public final /* synthetic */ abus a;
    public final /* synthetic */ abtv b;
    private final /* synthetic */ int c;

    public /* synthetic */ abub(abus abusVar, abtv abtvVar) {
        this.a = abusVar;
        this.b = abtvVar;
    }

    public /* synthetic */ abub(abus abusVar, abtv abtvVar, int i) {
        this.c = i;
        this.a = abusVar;
        this.b = abtvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = 0;
        if (i == 0) {
            abus abusVar = this.a;
            abtv abtvVar = this.b;
            ylr.b();
            if (abusVar.w != 2 || !abusVar.y() || !abusVar.j.j() || !abusVar.k.j() || !abusVar.o.k()) {
                abusVar.u(2, abtvVar);
                return;
            }
            abusVar.i = false;
            abusVar.x();
            boolean k = abusVar.j.k();
            boolean g = abusVar.q.g();
            boolean k2 = abusVar.k.k();
            if (abusVar.s != null) {
                abusVar.s.d(true);
            }
            if (!k2 || !k || !g) {
                i2 = 7;
            }
            abusVar.u(i2, abtvVar);
        } else if (i != 1) {
            abus abusVar2 = this.a;
            abtv abtvVar2 = this.b;
            ylr.b();
            if (abusVar2.w != 2 || !abusVar2.y() || !abusVar2.j.j() || !abusVar2.k.j() || !abusVar2.o.k()) {
                abusVar2.u(2, abtvVar2);
            } else if (!((acbo) abusVar2.j).a.m()) {
                abusVar2.u(7, abtvVar2);
            } else if (!abusVar2.q.e()) {
                abusVar2.j.k();
                abusVar2.u(7, abtvVar2);
            } else if (!abusVar2.k.m()) {
                abusVar2.j.k();
                abusVar2.q.g();
                abusVar2.u(7, abtvVar2);
            } else {
                abusVar2.i = true;
                abusVar2.x();
                abusVar2.u(0, abtvVar2);
            }
        } else {
            abus abusVar3 = this.a;
            abtv abtvVar3 = this.b;
            ylr.b();
            abusVar3.t();
            abusVar3.u(0, abtvVar3);
        }
    }
}
