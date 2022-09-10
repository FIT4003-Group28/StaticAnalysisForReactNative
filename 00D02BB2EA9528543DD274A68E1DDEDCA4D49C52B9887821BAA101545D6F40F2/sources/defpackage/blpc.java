package defpackage;
/* compiled from: PG */
/* renamed from: blpc  reason: default package */
/* loaded from: classes3.dex */
final class blpc implements Runnable {
    final /* synthetic */ btzr a;
    final /* synthetic */ dvre b;
    final /* synthetic */ blpe c;

    public blpc(blpe blpeVar, btzr btzrVar, dvre dvreVar) {
        this.c = blpeVar;
        this.a = btzrVar;
        this.b = dvreVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.QZ(this.a, this.b);
        this.c.b.l();
    }
}
