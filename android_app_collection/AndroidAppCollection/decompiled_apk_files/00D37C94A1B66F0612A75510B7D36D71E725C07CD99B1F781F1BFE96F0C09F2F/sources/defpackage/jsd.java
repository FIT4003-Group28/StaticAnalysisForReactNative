package defpackage;
/* compiled from: PG */
/* renamed from: jsd  reason: default package */
/* loaded from: classes3.dex */
public final class jsd {
    private final fbw a;

    public jsd(fbw fbwVar) {
        this.a = fbwVar;
    }

    public static final awnc c(ajhh ajhhVar) {
        try {
            awow awowVar = ((awnn) aopi.parseFrom(awnn.a, ajhhVar.b, aoos.b())).c;
            if (awowVar == null) {
                awowVar = awow.a;
            }
            awnc awncVar = ((awmx) awowVar.qm(awmx.b)).e;
            return awncVar == null ? awnc.a : awncVar;
        } catch (aopx unused) {
            return null;
        }
    }

    private static String d(String str, fbw fbwVar) {
        awbp k = hhw.k(str, fbwVar);
        return k == null ? "" : k.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(ajhh ajhhVar) {
        awnc c = c(ajhhVar);
        return (c == null || !c.qn(aqpq.b)) ? "" : d(((aqpq) c.qm(aqpq.b)).d, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b(ajhh ajhhVar) {
        awnc c = c(ajhhVar);
        if (c == null) {
            return "";
        }
        if (c.qn(aqqj.b)) {
            return d(((aqqj) c.qm(aqqj.b)).d, this.a);
        }
        return c.qn(aqpv.b) ? d(((aqpv) c.qm(aqpv.b)).d, this.a) : "";
    }
}
