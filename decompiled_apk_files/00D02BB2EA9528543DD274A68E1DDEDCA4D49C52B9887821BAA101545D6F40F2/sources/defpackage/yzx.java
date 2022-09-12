package defpackage;
/* compiled from: PG */
/* renamed from: yzx  reason: default package */
/* loaded from: classes7.dex */
public final class yzx {
    public static cqtd a(dozz dozzVar, vtn vtnVar, cqtd cqtdVar) {
        douj doujVar = dozzVar.v;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        return b(doujVar, vtnVar, cqtdVar);
    }

    public static cqtd b(douj doujVar, vtn vtnVar, cqtd cqtdVar) {
        dbsi<String, String> n = alca.n(doujVar);
        String str = n.a;
        String str2 = n.b;
        cqtd cqtdVar2 = null;
        cqtd e = str != null ? vtnVar.e(str, bvlw.a) : null;
        if (str2 != null) {
            cqtdVar2 = vtnVar.e(str2, bvlw.a);
        }
        return e == null ? cqtdVar : cqtdVar2 == null ? e : iva.e(e, cqtdVar2);
    }
}
