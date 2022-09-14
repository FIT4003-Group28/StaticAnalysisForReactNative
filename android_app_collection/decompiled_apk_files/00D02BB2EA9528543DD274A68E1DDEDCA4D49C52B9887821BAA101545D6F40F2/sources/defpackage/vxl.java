package defpackage;

import java.util.Collection;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: vxl  reason: default package */
/* loaded from: classes7.dex */
public final class vxl {
    public static final dcep<dqvj> b = dcnm.a(dqvj.DRIVE, dqvj.BICYCLE, dqvj.WALK, dqvj.TRANSIT, dqvj.TAXI);
    public final dbty<dcep<dqvj>> a;

    public vxl(final qeg qegVar) {
        this.a = dbud.a(new dbty(qegVar) { // from class: vxk
            private final qeg a;

            {
                this.a = qegVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                qeg qegVar2 = this.a;
                EnumSet copyOf = EnumSet.copyOf((Collection) vxl.b);
                if (qegVar2.b()) {
                    copyOf.add(dqvj.TWO_WHEELER);
                }
                return dcnm.b(copyOf);
            }
        });
    }

    public final dqvj a(@dzsi dqvj dqvjVar, dqvj dqvjVar2) {
        return (dqvjVar == null || !this.a.a().contains(dqvjVar)) ? dqvjVar2 : dqvjVar;
    }
}
