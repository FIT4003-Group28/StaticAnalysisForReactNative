package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: apjf  reason: default package */
/* loaded from: classes2.dex */
public class apjf implements aphu {
    public final bwrs<aoyg> a;
    public final aphj b;
    private final apho c;
    private final aphn d;

    public apjf(apid apidVar, apiy apiyVar, aphy aphyVar, aphj aphjVar, final bwrs<aoyg> bwrsVar, dcdn<aoxp, bwrs<aoyg>> dcdnVar) {
        gga a = apidVar.a.a();
        apid.a(a, 1);
        bwqv a2 = apidVar.b.a();
        apid.a(a2, 2);
        aphj a3 = apidVar.c.a();
        apid.a(a3, 3);
        aoxq a4 = apidVar.d.a();
        apid.a(a4, 4);
        apid.a(dcdnVar, 5);
        this.c = new apic(a, a2, a3, a4, dcdnVar);
        angv a5 = apiyVar.a.a();
        apiy.a(a5, 1);
        cqat a6 = apiyVar.b.a();
        apiy.a(a6, 2);
        cqhn a7 = apiyVar.c.a();
        apiy.a(a7, 3);
        gga a8 = apiyVar.d.a();
        apiy.a(a8, 4);
        dxio a9 = ((dxjh) apiyVar.e).a();
        apiy.a(a9, 5);
        bmnj a10 = apiyVar.f.a();
        apiy.a(a10, 6);
        Executor a11 = apiyVar.g.a();
        apiy.a(a11, 7);
        anhg a12 = apiyVar.h.a();
        apiy.a(a12, 8);
        begg a13 = apiyVar.i.a();
        apiy.a(a13, 9);
        new apix(a5, a6, a7, a8, a9, a10, a11, a12, a13);
        this.d = aphyVar.a(new Callable(bwrsVar) { // from class: apjd
            private final bwrs a;

            {
                this.a = bwrsVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a;
            }
        });
        this.a = bwrsVar;
        this.b = aphjVar;
    }

    @Override // defpackage.aphu
    public aphw a() {
        return new apje(this);
    }

    @Override // defpackage.aphu
    public apho b() {
        return this.c;
    }

    @Override // defpackage.aphu
    public aphn c() {
        return this.d;
    }
}
