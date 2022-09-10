package defpackage;
/* compiled from: PG */
/* renamed from: ajqg  reason: default package */
/* loaded from: classes2.dex */
public final class ajqg {
    public final ajzg a;
    private final dcqe b;

    public ajqg(ajzg ajzgVar) {
        dzvx.c(ajzgVar, "batterySaverEnabledChecker");
        this.a = ajzgVar;
        this.b = dcqe.b();
    }

    public final dyzp a(gga ggaVar) {
        dyzr d;
        dzvx.c(ggaVar, "activity");
        if (!this.a.a()) {
            bvoo.h("Battery saver check is not enabled.", new Object[0]);
            return dyzp.d(new IllegalStateException("Battery saver check is not enabled."));
        } else if (!this.a.b()) {
            dyzp dyzpVar = dzcd.a;
            dzfy.d();
            return dyzpVar;
        } else {
            ajqq ajqqVar = new ajqq();
            dzvx.c(ggaVar, "activity");
            if (ajqqVar.b.a.get().length == 0) {
                dzgl dzglVar = ajqqVar.b;
                if (dzglVar.a.get() != dzgl.c || dzglVar.e != null) {
                    dzgl dzglVar2 = ajqqVar.b;
                    if (dzglVar2.a.get() != dzgl.c || dzglVar2.e == null) {
                        if (!gei.a(ggaVar, ajqqVar)) {
                            d = dyzp.d(new ahwp());
                        } else {
                            ggaVar.g().aq();
                            d = ajqqVar.b;
                        }
                        dzcc dzccVar = new dzcc(new ajqf(this, ggaVar));
                        dzfy.d();
                        dzcb dzcbVar = new dzcb(new dyzr[]{d, dzccVar});
                        dzfy.d();
                        return dzcbVar;
                    }
                }
            }
            bvoo.h("Has already been shown", new Object[0]);
            d = dyzp.d(new ahwp());
            dzcc dzccVar2 = new dzcc(new ajqf(this, ggaVar));
            dzfy.d();
            dzcb dzcbVar2 = new dzcb(new dyzr[]{d, dzccVar2});
            dzfy.d();
            return dzcbVar2;
        }
    }
}
