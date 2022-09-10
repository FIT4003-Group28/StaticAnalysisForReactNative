package defpackage;
/* compiled from: PG */
/* renamed from: amal  reason: default package */
/* loaded from: classes2.dex */
final class amal implements Runnable {
    final /* synthetic */ amaw a;

    public amal(amaw amawVar) {
        this.a = amawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.v.b.r();
        this.a.u.execute(new Runnable(this) { // from class: amak
            private final amal a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                for (amcn amcnVar : this.a.a.g.a()) {
                    amcnVar.m();
                }
            }
        });
    }
}
