package defpackage;
/* compiled from: PG */
/* renamed from: dydq  reason: default package */
/* loaded from: classes6.dex */
public final class dydq implements dydp {
    public static final cxmb<String> a;
    public static final cxmb<Boolean> b;
    public static final cxmb<Boolean> c;

    static {
        cxml b2 = new cxml("com.google.android.libraries.surveys").a().b();
        a = b2.e("7", "SURVEYS");
        b = b2.d("9", true);
        c = b2.d("6", false);
    }

    @Override // defpackage.dydp
    public final String a(cxji cxjiVar) {
        return a.c(cxjiVar);
    }

    @Override // defpackage.dydp
    public final boolean b(cxji cxjiVar) {
        return b.c(cxjiVar).booleanValue();
    }

    @Override // defpackage.dydp
    public final boolean c(cxji cxjiVar) {
        return c.c(cxjiVar).booleanValue();
    }
}
