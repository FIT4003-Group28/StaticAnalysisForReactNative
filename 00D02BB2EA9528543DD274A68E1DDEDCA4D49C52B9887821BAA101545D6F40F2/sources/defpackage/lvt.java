package defpackage;
/* compiled from: PG */
/* renamed from: lvt  reason: default package */
/* loaded from: classes7.dex */
final class lvt implements Runnable {
    final /* synthetic */ lvu a;

    public lvt(lvu lvuVar) {
        this.a = lvuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lvu lvuVar = this.a;
        lvuVar.e.e(lvuVar.f);
        lvu lvuVar2 = this.a;
        if (lvuVar2.i) {
            boolean a = lvuVar2.c.a();
            this.a.g.r(a);
            if (!a) {
                return;
            }
            lvu lvuVar3 = this.a;
            lta ltaVar = lvuVar3.g;
            boolean z = true;
            if (!lvuVar3.d.e() && !this.a.d.f()) {
                z = false;
            }
            ltaVar.s(z);
        }
    }
}
