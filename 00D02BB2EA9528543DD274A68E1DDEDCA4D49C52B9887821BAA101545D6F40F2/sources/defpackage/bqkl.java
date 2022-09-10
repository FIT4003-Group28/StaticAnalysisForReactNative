package defpackage;
/* compiled from: PG */
/* renamed from: bqkl  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqkl {
    public static bqkl i(bbtm bbtmVar) {
        return new bqiu(bbtmVar.A(), dbsg.i(bbtmVar), dbpy.a);
    }

    public static bqkl j(dnwl dnwlVar) {
        String str;
        dfxs dfxsVar = dnwlVar.c;
        if (dfxsVar == null) {
            dfxsVar = dfxs.h;
        }
        dfwp dfwpVar = dfxsVar.b;
        if (dfwpVar == null) {
            dfwpVar = dfwp.d;
        }
        if ((dfwpVar.a & 2) != 0) {
            dfxs dfxsVar2 = dnwlVar.c;
            if (dfxsVar2 == null) {
                dfxsVar2 = dfxs.h;
            }
            dfwp dfwpVar2 = dfxsVar2.b;
            if (dfwpVar2 == null) {
                dfwpVar2 = dfwp.d;
            }
            str = dfwpVar2.c;
        } else {
            dnwr dnwrVar = dnwlVar.e;
            if (dnwrVar == null) {
                dnwrVar = dnwr.c;
            }
            str = dnwrVar.b;
        }
        return new bqiu(str, dbpy.a, dbsg.i(dnwlVar));
    }

    public abstract String a();

    public abstract dbsg<bbtm> b();

    public abstract dbsg<dnwl> c();

    public bbtm d() {
        throw null;
    }

    public dnwl e() {
        throw null;
    }

    public final boolean f() {
        return d().l().a();
    }

    public final dggg g() {
        dbsk.l(d().l().a());
        dggf bZ = dggg.d.bZ();
        dgge dggeVar = dgge.MEDIA_GUESSABLE_FIFE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dggg dgggVar = (dggg) bZ.b;
        dgggVar.b = dggeVar.l;
        dgggVar.a |= 1;
        String b = d().l().b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dggg dgggVar2 = (dggg) bZ.b;
        b.getClass();
        dgggVar2.a |= 2;
        dgggVar2.c = b;
        return bZ.bK();
    }

    public final String h() {
        return d().e();
    }
}
