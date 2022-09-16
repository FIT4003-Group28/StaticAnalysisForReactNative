package defpackage;
/* compiled from: PG */
/* renamed from: abvp  reason: default package */
/* loaded from: classes.dex */
final class abvp implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ abvq b;

    public abvp(abvq abvqVar, int i) {
        this.b = abvqVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a > 0) {
            abvq abvqVar = this.b;
            abvqVar.a.i(abvqVar.g);
            abvq abvqVar2 = this.b;
            abvqVar2.b.a(abvqVar2.f);
            return;
        }
        abvq abvqVar3 = this.b;
        abvqVar3.b.a(abvqVar3.f);
        abvq abvqVar4 = this.b;
        abvqVar4.a.i(abvqVar4.g);
    }
}
