package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: aksh  reason: default package */
/* loaded from: classes2.dex */
public final class aksh {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final int e;
    @dzsi
    private final dnbc f;

    public aksh(String str, String str2, String str3, int i, int i2, @dzsi dnbc dnbcVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = dnbcVar;
    }

    public static aksh a(dmlm dmlmVar, @dzsi dnbc dnbcVar) {
        return new aksh(dmlmVar.b, dmlmVar.c, dmlmVar.d, dmlmVar.e, dmlmVar.f, dnbcVar);
    }

    @dzsi
    private final cjtd d(int i, String str, @dzsi String str2, @dzsi decs decsVar) {
        ddho d;
        dbsg dbsgVar;
        if (!dbsj.d(str2) || i != 0) {
            cjta b = cjtd.b();
            ddxx c = cjrx.c(str2);
            if (i != 0) {
                d = cjth.d(i);
            } else if (c != null) {
                d = (c.a & 8) != 0 ? cjth.d(c.d) : dtxx.bZ;
            } else {
                d = dtxx.bZ;
            }
            b.d = d;
            if (c != null) {
                ddxz e = cjra.e(str);
                boolean z = (e == null && (c.a & 2048) == 0) ? false : true;
                int i2 = c.a;
                boolean z2 = ((i2 & 1) == 0 && (i2 & 2) == 0 && (i2 & 4) == 0) ? false : true;
                if (z && z2) {
                    dsqp dsqpVar = (dsqp) c.cu(5);
                    dsqpVar.bC(c);
                    ddxw ddxwVar = (ddxw) dsqpVar;
                    if ((c.a & 2048) == 0) {
                        dbsk.s(e);
                        if (ddxwVar.c) {
                            ddxwVar.bF();
                            ddxwVar.c = false;
                        }
                        ddxx ddxxVar = (ddxx) ddxwVar.b;
                        e.getClass();
                        ddxxVar.i = e;
                        ddxxVar.a |= 2048;
                    }
                    int b2 = d.b();
                    if (ddxwVar.c) {
                        ddxwVar.bF();
                        ddxwVar.c = false;
                    }
                    ddxx ddxxVar2 = (ddxx) ddxwVar.b;
                    ddxxVar2.a |= 8;
                    ddxxVar2.d = b2;
                    dbsgVar = dbsg.i(cjrx.b(ddxwVar.bK()));
                } else {
                    dbsgVar = dbpy.a;
                }
                if (dbsgVar.a()) {
                    b.g((String) dbsgVar.b());
                }
            }
            b.g = decsVar;
            dnbc dnbcVar = this.f;
            if (dnbcVar != null && (dnbcVar.a & 1) != 0) {
                dnpo dnpoVar = dnbcVar.b;
                if (dnpoVar == null) {
                    dnpoVar = dnpo.t;
                }
                b.s(cjss.a(dnpoVar));
                dnpo dnpoVar2 = this.f.b;
                if (dnpoVar2 == null) {
                    dnpoVar2 = dnpo.t;
                }
                b.u(cjss.c(dnpoVar2));
            }
            return b.a();
        }
        return null;
    }

    @dzsi
    public final cjtd b(@dzsi decs decsVar) {
        return d(this.d, this.a, this.b, decsVar);
    }

    @dzsi
    public final cjtd c(@dzsi decs decsVar) {
        return d(this.e, this.a, this.c, decsVar);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("ei", this.a);
        b.b("primaryLabelGroupVed", this.b);
        b.b("secondaryLabelGroupVed", this.c);
        return b.toString();
    }
}
