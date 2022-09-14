package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: apna  reason: default package */
/* loaded from: classes2.dex */
public final class apna extends bvwn<dmjb> {
    private static final dcqe b = dcqe.c("apna");
    private final anhg c;

    public apna(anhg anhgVar) {
        super(dmjb.e);
        this.c = anhgVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmjb dmjbVar) {
        dmjb dmjbVar2 = dmjbVar;
        int i = dmjbVar2.a;
        int i2 = i != 0 ? i != 1 ? i != 4 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                this.c.G(i == 1 ? (drqz) dmjbVar2.b : drqz.e, dbpy.a);
                return;
            } else if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                this.c.C();
                return;
            } else {
                anhq j = anhy.n(TimeUnit.SECONDS.toMillis((dmjbVar2.a == 4 ? (dqjt) dmjbVar2.b : dqjt.d).b), "", dbpy.a).j();
                int a = dmja.a(dmjbVar2.c);
                if (a == 0) {
                    a = 1;
                }
                int i4 = a - 1;
                if (i4 == 0 || i4 == 1) {
                    j.i(2);
                } else {
                    j.i(1);
                    Object[] objArr = new Object[1];
                    int a2 = dmja.a(dmjbVar2.c);
                    objArr[0] = (a2 == 0 || a2 == 1) ? "UNKNOWN_TRANSITION" : a2 != 2 ? a2 != 3 ? "REPLACE" : "POP_TO_ROOT" : "PUSH";
                    bvoo.h("Transition %s is not supported yet in aGMM.", objArr);
                }
                this.c.D(j.k());
                return;
            }
        }
        throw null;
    }
}
