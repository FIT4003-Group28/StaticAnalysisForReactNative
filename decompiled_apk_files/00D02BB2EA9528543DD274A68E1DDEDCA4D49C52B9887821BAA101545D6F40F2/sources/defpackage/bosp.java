package defpackage;
/* compiled from: PG */
/* renamed from: bosp  reason: default package */
/* loaded from: classes3.dex */
final class bosp implements Runnable {
    final /* synthetic */ bosr a;

    public bosp(bosr bosrVar) {
        this.a = bosrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bosr bosrVar = this.a;
        if (bosrVar.b.aD) {
            bosr bosrVar2 = this.a;
            bosrVar.a.a().U(bosrVar2.c, bosrVar2.b, dwyd.REPORT_A_PROBLEM);
        }
    }
}
