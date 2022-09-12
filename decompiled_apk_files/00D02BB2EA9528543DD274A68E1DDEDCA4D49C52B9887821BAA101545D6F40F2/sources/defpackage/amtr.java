package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amtr  reason: default package */
/* loaded from: classes2.dex */
public final class amtr {
    public final dpbp a;
    @dzsi
    public volatile dpcg b;
    @dzsi
    public volatile doub c;
    private amuq[] d;
    private amvd[] e;

    public amtr(dpbp dpbpVar) {
        dote doteVar;
        this.a = dpbpVar;
        if ((dpbpVar.a & 16) != 0) {
            dpcg dpcgVar = dpbpVar.e;
            this.b = dpcgVar == null ? dpcg.a : dpcgVar;
        }
        doup doupVar = dpbpVar.d;
        if (((doupVar == null ? doup.e : doupVar).a & 32) != 0) {
            doup doupVar2 = dpbpVar.d;
            doub doubVar = (doupVar2 == null ? doup.e : doupVar2).d;
            this.c = doubVar == null ? doub.f : doubVar;
        }
        if ((dpbpVar.a & 64) != 0) {
            dotf dotfVar = dpbpVar.h;
            dotfVar = dotfVar == null ? dotf.b : dotfVar;
            dpec dpecVar = dpbpVar.b;
            dpecVar = dpecVar == null ? dpec.o : dpecVar;
            dccx F = dcdc.F();
            loop0: while (true) {
                doteVar = null;
                for (dote doteVar2 : dotfVar.a) {
                    int a = dotc.a(doteVar2.a);
                    a = a == 0 ? 1 : a;
                    if (a == 2) {
                        if (doteVar != null) {
                            bvoo.i(new IllegalArgumentException());
                        }
                        doteVar = doteVar2;
                    } else if (a == 3) {
                        if (doteVar == null) {
                            bvoo.i(new IllegalArgumentException());
                        } else {
                            h(F, doteVar, doteVar2.b, doteVar2.c);
                        }
                    }
                }
                break loop0;
            }
            if (doteVar != null) {
                dowb dowbVar = dpecVar.d;
                int i = (dowbVar == null ? dowb.d : dowbVar).b;
                dgas dgasVar = dpecVar.e;
                h(F, doteVar, i, (dgasVar == null ? dgas.e : dgasVar).b);
            }
            F.f();
        } else {
            dcdc.e();
        }
        if ((dpbpVar.a & 32) == 0 || dpbpVar.g != null) {
            return;
        }
        doxl doxlVar = doxl.b;
    }

    public final dpec a() {
        dpec dpecVar = this.a.b;
        return dpecVar == null ? dpec.o : dpecVar;
    }

    public final boolean b() {
        return (this.a.a & 1) != 0;
    }

    public final synchronized amuq[] c() {
        if (this.d == null) {
            this.d = new amuq[e()];
            for (int i = 0; i < this.a.c.size(); i++) {
                this.d[i] = new amuq(this.a.c.get(i), i);
            }
        }
        return this.d;
    }

    public final amuq d(int i) {
        return c()[i];
    }

    public final int e() {
        return this.a.c.size();
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof amtr) {
            return dbsd.a(this.a, ((amtr) obj).a);
        }
        return false;
    }

    public final synchronized amvd[] f() {
        if (this.e == null) {
            this.e = new amvd[g()];
            for (int i = 0; i < g(); i++) {
                this.e[i] = new amvd(this.a.f.get(i));
            }
        }
        return this.e;
    }

    public final int g() {
        return this.a.f.size();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    private static void h(dccx<amsi> dccxVar, dote doteVar, int i, int i2) {
        amsj amsjVar = new amsj();
        amsjVar.a = Integer.valueOf(doteVar.b);
        amsjVar.b = Integer.valueOf(doteVar.c);
        amsjVar.c = Integer.valueOf(i - doteVar.b);
        amsjVar.d = Integer.valueOf(i2 - doteVar.c);
        String str = amsjVar.a == null ? " offsetMeters" : "";
        if (amsjVar.b == null) {
            str = str.concat(" offsetSeconds");
        }
        if (amsjVar.c == null) {
            str = String.valueOf(str).concat(" lengthMeters");
        }
        if (amsjVar.d == null) {
            str = String.valueOf(str).concat(" lengthSeconds");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        } else {
            dccxVar.g(new amsk(amsjVar.a.intValue(), amsjVar.b.intValue(), amsjVar.c.intValue(), amsjVar.d.intValue()));
        }
    }
}
