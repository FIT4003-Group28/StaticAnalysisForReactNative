package defpackage;
/* compiled from: PG */
/* renamed from: byei  reason: default package */
/* loaded from: classes4.dex */
public final class byei<T> extends btrh<T> {
    private final int d;

    public byei(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        boolean z = true;
        if (this.d != 0) {
            byeh byehVar = (byeh) this.a;
            afwq afwqVar = (afwq) obj;
            int i = 2;
            if (byehVar.d != 2 && afwqVar.a(afwm.TRAFFIC)) {
                byehVar.c.g().d(cjtd.a(dtyi.dg));
            }
            if (true != afwqVar.a(afwm.TRAFFIC)) {
                i = 3;
            }
            byehVar.d = i;
            return;
        }
        byeh byehVar2 = (byeh) this.a;
        alaq alaqVar = ((alho) obj).a;
        if (!(alaqVar instanceof alav)) {
            byehVar2.f();
            return;
        }
        alav alavVar = (alav) alaqVar;
        amwb amwbVar = alavVar.a;
        akra akraVar = alavVar.r;
        if (amwbVar == null) {
            byehVar2.f();
        } else if (!byehVar2.b) {
        } else {
            fd K = byehVar2.a.K();
            if (K instanceof byky) {
                byky bykyVar = (byky) K;
                if (!bykyVar.aD || bykyVar.a.a() == amwbVar.a()) {
                    return;
                }
                bykyVar.a = amwbVar;
                bykyVar.c = akraVar;
                bykyVar.w();
                bykyVar.q();
                return;
            }
            if (!(K instanceof byet) && !(K instanceof byev)) {
                z = false;
            }
            byehVar2.a.D(byky.g(amwbVar, akraVar, null, z));
        }
    }
}
