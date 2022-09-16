package defpackage;
/* compiled from: PG */
/* renamed from: isl  reason: default package */
/* loaded from: classes3.dex */
public final class isl implements acue {
    private final isr a;

    public isl(isr isrVar) {
        this.a = isrVar;
    }

    @Override // defpackage.acue
    public final void a(asik asikVar) {
        aoob aoobVar;
        awbs awbsVar = asikVar.d;
        if (awbsVar == null) {
            awbsVar = awbs.a;
        }
        if ((awbsVar.b & 1) != 0) {
            awbs awbsVar2 = asikVar.d;
            if (awbsVar2 == null) {
                awbsVar2 = awbs.a;
            }
            aoobVar = awbsVar2.c;
        } else {
            awbs awbsVar3 = asikVar.d;
            if (awbsVar3 == null) {
                awbsVar3 = awbs.a;
            }
            awbs awbsVar4 = awbsVar3.g;
            if (awbsVar4 == null) {
                awbsVar4 = awbs.a;
            }
            if ((awbsVar4.b & 1) != 0) {
                awbs awbsVar5 = asikVar.d;
                if (awbsVar5 == null) {
                    awbsVar5 = awbs.a;
                }
                awbs awbsVar6 = awbsVar5.g;
                if (awbsVar6 == null) {
                    awbsVar6 = awbs.a;
                }
                aoobVar = awbsVar6.c;
            } else {
                aoobVar = null;
            }
        }
        if (aoobVar != null) {
            this.a.b(aoobVar);
        }
    }

    @Override // defpackage.acue
    public final void b() {
    }
}
