package defpackage;
/* compiled from: PG */
/* renamed from: acqc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acqc implements Runnable {
    public final /* synthetic */ abtv a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ acqc(abtv abtvVar, int i) {
        this.a = abtvVar;
        this.b = i;
    }

    public /* synthetic */ acqc(abtv abtvVar, int i, int i2) {
        this.c = i2;
        this.a = abtvVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            abtv abtvVar = this.a;
            int i = this.b;
            if (abtvVar == null) {
                return;
            }
            abtvVar.a(i);
            return;
        }
        abtv abtvVar2 = this.a;
        int i2 = this.b;
        if (abtvVar2 == null) {
            return;
        }
        abtvVar2.a(i2);
    }
}
