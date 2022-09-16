package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: agwx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agwx implements ylw {
    public final /* synthetic */ agxa a;
    private final /* synthetic */ int b;

    public /* synthetic */ agwx(agxa agxaVar, int i) {
        this.b = i;
        this.a = agxaVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            agxa agxaVar = this.a;
            atso atsoVar = (atso) obj;
            if (atsoVar == null) {
                return;
            }
            String d = ((agrf) agxaVar.e.get()).d();
            agvq agvqVar = (agvq) agxaVar.c.get();
            agvqVar.B(d, atsoVar.d);
            agvqVar.I(d, atsoVar.c);
        } else if (i == 1) {
            agxa agxaVar2 = this.a;
            ampq ampqVar = (ampq) obj;
            if (ampqVar == null || !ampqVar.h()) {
                return;
            }
            ((agrf) agxaVar2.e.get()).a().m().D(((agqv) ampqVar.c()).m(), 0L);
        } else {
            agwh m = ((agrf) this.a.e.get()).a().m();
            for (agqv agqvVar : (Collection) obj) {
                m.D(agqvVar.m(), 0L);
            }
        }
    }
}
