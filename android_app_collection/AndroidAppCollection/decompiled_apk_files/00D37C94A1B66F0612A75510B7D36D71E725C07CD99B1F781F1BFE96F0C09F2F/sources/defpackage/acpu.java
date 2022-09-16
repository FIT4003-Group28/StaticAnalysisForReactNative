package defpackage;
/* compiled from: PG */
/* renamed from: acpu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acpu implements Runnable {
    public final /* synthetic */ acqm a;
    public final /* synthetic */ abtv b;
    private final /* synthetic */ int c;

    public /* synthetic */ acpu(acqm acqmVar, abtv abtvVar) {
        this.a = acqmVar;
        this.b = abtvVar;
    }

    public /* synthetic */ acpu(acqm acqmVar, abtv abtvVar, int i) {
        this.c = i;
        this.a = acqmVar;
        this.b = abtvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            acqm acqmVar = this.a;
            abtv abtvVar = this.b;
            acqmVar.s();
            acqmVar.t(0, abtvVar);
        } else if (i == 1) {
            acqm acqmVar2 = this.a;
            abtv abtvVar2 = this.b;
            if (!acqmVar2.h.d(false)) {
                acqmVar2.t(7, abtvVar2);
                return;
            }
            acqmVar2.c.a(true);
            acqmVar2.o = true;
            acoe acoeVar = acqmVar2.k;
            if (acoeVar != null) {
                acoeVar.b(true);
            }
            acqmVar2.t(0, abtvVar2);
        } else if (i == 2) {
            acqm acqmVar3 = this.a;
            abtv abtvVar3 = this.b;
            acqmVar3.s();
            acqmVar3.t(0, abtvVar3);
        } else {
            acqm acqmVar4 = this.a;
            abtv abtvVar4 = this.b;
            if (!acqmVar4.h.d(acqmVar4.n)) {
                acqmVar4.t(7, abtvVar4);
                return;
            }
            acqmVar4.c.a(false);
            acqmVar4.o = false;
            acoe acoeVar2 = acqmVar4.k;
            if (acoeVar2 != null) {
                acoeVar2.b(false);
            }
            acqmVar4.t(0, abtvVar4);
        }
    }
}
