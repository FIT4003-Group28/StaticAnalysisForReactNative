package defpackage;
/* compiled from: PG */
/* renamed from: lrs  reason: default package */
/* loaded from: classes7.dex */
final class lrs implements Runnable {
    final /* synthetic */ lrt a;

    public lrs(lrt lrtVar) {
        this.a = lrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.a.p().r().booleanValue()) {
            lrt lrtVar = this.a;
            lrtVar.c.post(lrtVar.b);
            return;
        }
        lrt lrtVar2 = this.a;
        lrtVar2.e.e(lrtVar2.f);
    }
}
