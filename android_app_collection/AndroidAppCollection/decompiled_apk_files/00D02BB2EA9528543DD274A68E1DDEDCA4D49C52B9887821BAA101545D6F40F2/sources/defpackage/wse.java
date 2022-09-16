package defpackage;
/* compiled from: PG */
/* renamed from: wse  reason: default package */
/* loaded from: classes7.dex */
public final class wse {
    public static cjtd a(dopk dopkVar) {
        cjta b = cjtd.b();
        b(b, dopkVar);
        return b.a();
    }

    public static void b(cjta cjtaVar, dopk dopkVar) {
        if ((dopkVar.a & 8192) != 0) {
            cjtaVar.g(dopkVar.n);
        }
        int i = dopkVar.a;
        if ((i & 4096) != 0) {
            cjtaVar.b = dopkVar.m;
        }
        if ((i & 4) != 0) {
            cjtaVar.g = decs.a(akqi.b(dopkVar.d).c);
        }
    }
}
