package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: avzl  reason: default package */
/* loaded from: classes3.dex */
public final class avzl {
    public final dlug a;
    private final Random b;
    private final dbty<dcdc<akqs>> c;

    public avzl(final avoo avooVar, final dlug dlugVar) {
        Random random = new Random();
        this.a = dlugVar;
        this.b = random;
        this.c = dbud.a(new dbty(avooVar, dlugVar) { // from class: avzk
            private final avoo a;
            private final dlug b;

            {
                this.a = avooVar;
                this.b = dlugVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dlox dloxVar;
                dluc dlucVar;
                avoo avooVar2 = this.a;
                dlug dlugVar2 = this.b;
                dccx F = dcdc.F();
                int i = dlugVar2.a;
                if (i == 2) {
                    try {
                        dloxVar = (dlox) dsqw.cq(dlox.b, avooVar2.a.c(dlugVar2.bS()));
                    } catch (Exception e) {
                        avoo.b("interiorS2RectCovering", e);
                        dloxVar = dlox.b;
                    }
                    dbsk.s(dloxVar);
                    for (dluc dlucVar2 : dloxVar.a) {
                        dwzj dwzjVar = dlucVar2.b;
                        if (dwzjVar == null) {
                            dwzjVar = dwzj.d;
                        }
                        akqq q = akqq.q(dwzjVar);
                        dbsk.s(q);
                        dwzj dwzjVar2 = dlucVar2.c;
                        if (dwzjVar2 == null) {
                            dwzjVar2 = dwzj.d;
                        }
                        akqq q2 = akqq.q(dwzjVar2);
                        dbsk.s(q2);
                        akqr a = akqs.a();
                        a.d(q);
                        a.d(q2);
                        F.g(a.b());
                    }
                } else {
                    if (i == 1) {
                        dlucVar = (dluc) dlugVar2.b;
                    } else {
                        dlucVar = dluc.d;
                    }
                    dwzj dwzjVar3 = dlucVar.b;
                    if (dwzjVar3 == null) {
                        dwzjVar3 = dwzj.d;
                    }
                    akqq q3 = akqq.q(dwzjVar3);
                    dbsk.s(q3);
                    dwzj dwzjVar4 = dlucVar.c;
                    if (dwzjVar4 == null) {
                        dwzjVar4 = dwzj.d;
                    }
                    akqq q4 = akqq.q(dwzjVar4);
                    dbsk.s(q4);
                    akqr a2 = akqs.a();
                    a2.d(q3);
                    a2.d(q4);
                    F.g(a2.b());
                }
                return F.f();
            }
        });
    }

    public final boolean a(akqq akqqVar) {
        dcdc<akqs> a = this.c.a();
        int size = a.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (a.get(i).b(akqqVar)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public final dcdc<akqs> b() {
        return this.c.a();
    }

    @dzsi
    public final akqs c() {
        if (this.c.a().isEmpty()) {
            return null;
        }
        akqr a = akqs.a();
        dcdc<akqs> a2 = this.c.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            akqs akqsVar = a2.get(i);
            a.d(akqsVar.j());
            a.d(akqsVar.k());
        }
        return a.b();
    }

    public final dspd d() {
        dluc dlucVar;
        dspd bR;
        dlug dlugVar = this.a;
        int i = dlugVar.a;
        if (i != 2) {
            if (i == 1) {
                dlucVar = (dluc) dlugVar.b;
            } else {
                dlucVar = dluc.d;
            }
            bR = dlucVar.bR();
        } else {
            bR = ((dluf) dlugVar.b).a;
        }
        String i2 = ddae.e.i(bR.G());
        int nextInt = this.b.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 12);
        sb.append(i2);
        sb.append("$");
        sb.append(nextInt);
        return dspd.B(sb.toString());
    }
}
