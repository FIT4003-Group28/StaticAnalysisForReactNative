package defpackage;
/* compiled from: PG */
/* renamed from: rcb  reason: default package */
/* loaded from: classes7.dex */
public final class rcb implements qcy<rca> {
    private final vxa a;
    private final cqat b;
    private final vxl c;

    public rcb(vxa vxaVar, cqat cqatVar, vxl vxlVar) {
        this.a = vxaVar;
        this.b = cqatVar;
        this.c = vxlVar;
    }

    private final rca c(@dzsi amvh amvhVar, dcdc<amvh> dcdcVar, @dzsi dqvj dqvjVar, @dzsi dwao dwaoVar, @dzsi amte amteVar, @dzsi duqc duqcVar) {
        dqek dqekVar;
        dqvj a = this.c.a(dqvjVar, dqvj.DRIVE);
        dwao d = this.a.d(dwaoVar, a, 3, vul.COMMUTE_IMMERSIVE);
        cqat cqatVar = this.b;
        if (duqcVar == null || (duqcVar.a & 2) == 0) {
            dqekVar = null;
        } else {
            dqek b = dqek.b(duqcVar.c);
            if (b == null) {
                b = dqek.UNKNOWN_PREDICTION_JUSTIFICATION_TYPE;
            }
            dqekVar = b;
        }
        return new rbz(amvhVar, dcdcVar, a, bvrt.b(d), cqatVar.e(), amteVar, dqekVar);
    }

    @Override // defpackage.qcy
    public final /* bridge */ /* synthetic */ rca a(qct qctVar) {
        qbn n = qctVar.n();
        dbsk.s(n);
        qbm a = n.a();
        dbsk.l(!a.a());
        dbsk.l(a.f());
        vun g = a.g();
        dcdc<amvh> i = a.i();
        amvj.k(i.size());
        amvh amvhVar = i.get(0);
        dcdc<amvh> i2 = a.i();
        amvj.k(i2.size());
        return c(amvhVar, i2.subList(1, i2.size()), a.l(), g == null ? null : g.b, a.n(), qctVar.r());
    }

    @Override // defpackage.qcy
    public final /* bridge */ /* synthetic */ rca b(qcx qcxVar) {
        return c(qcxVar.g(), qcxVar.h(), qcxVar.f(), qcxVar.y(), null, qcxVar.z());
    }
}
