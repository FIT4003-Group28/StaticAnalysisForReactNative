package defpackage;
/* compiled from: PG */
/* renamed from: asl  reason: default package */
/* loaded from: classes2.dex */
final class asl implements Runnable {
    final /* synthetic */ asm a;

    public asl(asm asmVar) {
        this.a = asmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        asm asmVar = this.a;
        ast astVar = asmVar.h;
        if (astVar.m == asmVar) {
            astVar.o();
        }
    }
}
