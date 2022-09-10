package defpackage;
/* compiled from: PG */
/* renamed from: awor  reason: default package */
/* loaded from: classes3.dex */
final class awor implements awph {
    final /* synthetic */ awot a;

    public awor(awot awotVar) {
        this.a = awotVar;
    }

    @Override // defpackage.awph
    public final void k(int i) {
        synchronized (this.a.h) {
            if (i == 1) {
                awot awotVar = this.a;
                if (awotVar.k) {
                    awotVar.c.a(awotVar.m);
                    this.a.k = false;
                }
            }
            awot awotVar2 = this.a;
            if (!awotVar2.k) {
                btrm btrmVar = awotVar2.c;
                awos awosVar = awotVar2.m;
                dceq a = dcet.a();
                a.b(alhw.class, new awou(0, alhw.class, awosVar));
                a.b(alhx.class, new awou(1, alhx.class, awosVar));
                btrmVar.g(awosVar, a.a());
                this.a.k = true;
            }
        }
    }
}
