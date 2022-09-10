package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgdo  reason: default package */
/* loaded from: classes4.dex */
public final class cgdo implements Runnable {
    final /* synthetic */ cgdv a;

    public cgdo(cgdv cgdvVar) {
        this.a = cgdvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        akqs a;
        cgdv cgdvVar = this.a;
        cgdvVar.c = null;
        if (cgdvVar.e.f().booleanValue()) {
            cgdvVar.e.s();
            return;
        }
        cgdvVar.e.V();
        cgdvVar.bz();
        if (cgdvVar.bx(true)) {
            cgdvVar.bj.c().l();
        } else if ((!cgdvVar.g.b().booleanValue() || !cgdvVar.g.c().booleanValue()) && (a = alao.a(cgdvVar.bj.d)) != null) {
            cgep cgepVar = cgdvVar.aw;
            dwsx dwsxVar = cgepVar.a.getUgcTasksParameters().c;
            if (dwsxVar == null) {
                dwsxVar = dwsx.f;
            }
            if (dwsxVar.a) {
                double g = a.g();
                double d = dcyn.a;
                for (cgeo cgeoVar : cgepVar.b) {
                    if (cgeoVar.b.g() <= 1.100000023841858d * g) {
                        d = Math.max(d, akqs.h(cgeoVar.b, a));
                    }
                }
                if (100.0f - ((float) ((d * 100.0d) / g)) > dwsxVar.b) {
                    cgdvVar.bt(false);
                    return;
                }
            }
            cgdvVar.bB();
        }
    }
}
