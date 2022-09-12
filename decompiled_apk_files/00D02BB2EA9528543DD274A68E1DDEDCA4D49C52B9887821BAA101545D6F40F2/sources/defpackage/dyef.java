package defpackage;
/* compiled from: PG */
/* renamed from: dyef  reason: default package */
/* loaded from: classes6.dex */
public final class dyef implements dyee {
    public static final cxmb<Boolean> a;
    public static final cxmb<Boolean> b;

    static {
        cxml b2 = new cxml("com.google.android.libraries.surveys").a().b();
        a = b2.d("13", false);
        b = b2.d("10", false);
    }

    @Override // defpackage.dyee
    public final boolean a(cxji cxjiVar) {
        return a.c(cxjiVar).booleanValue();
    }

    @Override // defpackage.dyee
    public final boolean b(cxji cxjiVar) {
        return b.c(cxjiVar).booleanValue();
    }
}
