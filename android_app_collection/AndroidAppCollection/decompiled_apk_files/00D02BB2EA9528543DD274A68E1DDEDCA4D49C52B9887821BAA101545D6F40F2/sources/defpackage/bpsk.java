package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bpsk  reason: default package */
/* loaded from: classes4.dex */
public class bpsk extends bptp {
    private final bowv a;
    private final bwrs<ilo> b;
    private final akfa c;
    private final bbtk d;
    private final bbul e;

    public bpsk(bowv bowvVar, bwrs<ilo> bwrsVar, boxa boxaVar, akfa akfaVar, bbtk bbtkVar, bbul bbulVar) {
        super(boxaVar);
        this.a = bowvVar;
        this.b = bwrsVar;
        this.c = akfaVar;
        this.d = bbtkVar;
        this.e = bbulVar;
    }

    @Override // defpackage.bptp
    public final void b(dwhd dwhdVar, boolean z) {
        btlu j;
        if ((!this.a.u.b().isEmpty() || !this.a.v.b().isEmpty()) && (j = this.c.j()) != null) {
            String str = j.s().name;
            String str2 = dwhdVar.e;
            bows bowsVar = this.a.p;
            akqq akqqVar = bowsVar.a() ? bowsVar.b : bowsVar.a;
            ily ilyVar = new ily();
            ilyVar.k(str2);
            if (akqqVar != null) {
                ilyVar.q(akqqVar);
            }
            ArrayList arrayList = new ArrayList(this.a.u.b().size() + this.a.v.b().size());
            ArrayList<bbtm> b = this.a.u.b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(this.d.b(b.get(i)));
            }
            ArrayList<bbtm> b2 = this.a.v.b();
            int size2 = b2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bbtj b3 = this.d.b(b2.get(i2));
                b3.f(this.a.v.b);
                if ((dwhdVar.a & 4) != 0) {
                    b3.h(dwhdVar.d);
                }
                arrayList.add(b3);
            }
            this.e.h(str, dwyd.REPORT_A_PROBLEM, bbvh.e(ilyVar.d()).f(dgpu.LOCAL), arrayList, cjqm.a);
        }
        if (!this.a.y) {
            ilo c = this.b.c();
            dbsk.s(c);
            doas bZ = doav.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doav doavVar = (doav) bZ.b;
            doavVar.b = 1;
            doavVar.a = 1 | doavVar.a;
            dnvs a = bpvd.a(this.a, c);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doav doavVar2 = (doav) bZ.b;
            a.getClass();
            doavVar2.e = a;
            int i3 = doavVar2.a | 16;
            doavVar2.a = i3;
            doavVar2.a = i3 | 4;
            doavVar2.d = false;
            ily g = c.g();
            g.y(bZ.bK());
            this.b.d(g.d());
        }
        super.b(dwhdVar, z);
    }
}
