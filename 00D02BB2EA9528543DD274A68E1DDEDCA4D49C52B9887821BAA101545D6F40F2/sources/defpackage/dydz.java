package defpackage;
/* compiled from: PG */
/* renamed from: dydz  reason: default package */
/* loaded from: classes6.dex */
public final class dydz implements dydy {
    public static final cxmb<Boolean> a;
    public static final cxmb<Boolean> b;
    public static final cxmb<Boolean> c;

    static {
        cxml b2 = new cxml("com.google.android.libraries.surveys").a().b();
        a = b2.d("8", false);
        b = b2.d("5", false);
        c = b2.d("4", false);
    }

    @Override // defpackage.dydy
    public final boolean a(cxji cxjiVar) {
        return a.c(cxjiVar).booleanValue();
    }

    @Override // defpackage.dydy
    public final boolean b(cxji cxjiVar) {
        return b.c(cxjiVar).booleanValue();
    }

    @Override // defpackage.dydy
    public final boolean c(cxji cxjiVar) {
        return c.c(cxjiVar).booleanValue();
    }
}
