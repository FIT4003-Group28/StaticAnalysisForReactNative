package defpackage;
/* compiled from: PG */
/* renamed from: aktq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aktq implements Runnable {
    public final /* synthetic */ aktr a;
    private final /* synthetic */ int b;

    public /* synthetic */ aktq(aktr aktrVar, int i) {
        this.b = i;
        this.a = aktrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            aktr aktrVar = this.a;
            aktrVar.b.clear();
            aktrVar.c = amuk.q();
            return;
        }
        aktr aktrVar2 = this.a;
        aktrVar2.b.add(aktrVar2.a.call());
        aktrVar2.c = amuk.o(aktrVar2.b);
    }
}
