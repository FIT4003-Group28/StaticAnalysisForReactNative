package defpackage;
/* compiled from: PG */
/* renamed from: anvg  reason: default package */
/* loaded from: classes2.dex */
final class anvg extends bbf {
    final /* synthetic */ cjqy a;
    final /* synthetic */ anvj b;

    public anvg(anvj anvjVar, cjqy cjqyVar) {
        this.b = anvjVar;
        this.a = cjqyVar;
    }

    @Override // defpackage.bbf, defpackage.bbb
    public final void b(int i) {
        dead deadVar;
        anvj anvjVar = this.b;
        if (anvjVar.c == i) {
            return;
        }
        cjtd c = anvjVar.m().c();
        if (this.b.d && c != null) {
            cjqy cjqyVar = this.a;
            deaf deafVar = deaf.SWIPE;
            if (i < this.b.c) {
                deadVar = dead.RIGHT;
            } else {
                deadVar = dead.LEFT;
            }
            cjqyVar.m(new cjte(deafVar, deadVar), c);
        }
        anvj anvjVar2 = this.b;
        anvjVar2.c = i;
        anvjVar2.t();
        cqkx.p(this.b);
    }
}
