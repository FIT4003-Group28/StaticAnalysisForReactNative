package defpackage;
/* compiled from: PG */
/* renamed from: dyei  reason: default package */
/* loaded from: classes6.dex */
public final class dyei implements dyeh {
    public static final cxmb<Boolean> a;

    static {
        cxml b = new cxml("com.google.android.libraries.surveys").a().b();
        b.d("16", true);
        a = b.d("14", true);
        b.e("17", "com.google.android.surveys.testapp,com.android.chrome,com.google.android.apps.chrome,com.chrome.canary,com.chrome.dev,com.chrome.beta");
        b.e("15", "com.google.android.surveys.testapp,com.google.android.projection.gearhead");
    }

    @Override // defpackage.dyeh
    public final boolean a(cxji cxjiVar) {
        return a.c(cxjiVar).booleanValue();
    }
}
