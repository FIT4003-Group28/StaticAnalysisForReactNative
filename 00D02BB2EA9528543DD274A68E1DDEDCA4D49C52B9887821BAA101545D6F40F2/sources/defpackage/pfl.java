package defpackage;
/* compiled from: PG */
/* renamed from: pfl  reason: default package */
/* loaded from: classes7.dex */
public final class pfl {
    public static final <V> pfm<V> a(dfok dfokVar, dspy<dfok, V> dspyVar) {
        Object obj;
        dzvx.c(dfokVar, "proto");
        dzvx.c(dspyVar, "extension");
        dsqv dsqvVar = (dsqv) dspyVar;
        dfokVar.f(dsqvVar);
        if (dfokVar.V.k(dsqvVar.d)) {
            dfokVar.f(dsqvVar);
            Object l = dfokVar.V.l(dsqvVar.d);
            if (l == null) {
                obj = dsqvVar.b;
            } else {
                obj = dsqvVar.b(l);
            }
        } else {
            obj = null;
        }
        Object obj2 = obj;
        dfoc dfocVar = dfokVar.b;
        if (dfocVar == null) {
            dfocVar = dfoc.d;
        }
        dfoc dfocVar2 = dfocVar;
        dzvx.b(dfocVar2, "proto.corpus");
        String str = dfokVar.c;
        dzvx.b(str, "proto.key");
        dfoo dfooVar = dfokVar.e;
        if (dfooVar == null) {
            dfooVar = dfoo.e;
        }
        dfoo dfooVar2 = dfooVar;
        ddyb ddybVar = dfokVar.d;
        if (ddybVar == null) {
            ddybVar = ddyb.e;
        }
        return new pfm<>(dfocVar2, str, dfooVar2, ddybVar, obj2);
    }
}
