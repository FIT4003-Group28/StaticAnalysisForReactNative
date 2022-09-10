package defpackage;
/* compiled from: PG */
/* renamed from: dyec  reason: default package */
/* loaded from: classes6.dex */
public final class dyec implements dyeb {
    public static final cxmb<Boolean> a;
    public static final cxmb<Boolean> b;

    static {
        cxml b2 = new cxml("com.google.android.libraries.surveys").a().b();
        a = b2.d("12", true);
        b = b2.d("11", true);
    }

    @Override // defpackage.dyeb
    public final boolean a(cxji cxjiVar) {
        return a.c(cxjiVar).booleanValue();
    }

    @Override // defpackage.dyeb
    public final boolean b(cxji cxjiVar) {
        return b.c(cxjiVar).booleanValue();
    }
}
