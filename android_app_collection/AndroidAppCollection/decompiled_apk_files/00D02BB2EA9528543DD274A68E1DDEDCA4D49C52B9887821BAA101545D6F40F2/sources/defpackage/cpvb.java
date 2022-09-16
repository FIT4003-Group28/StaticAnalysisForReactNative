package defpackage;
/* compiled from: PG */
/* renamed from: cpvb  reason: default package */
/* loaded from: classes5.dex */
public final class cpvb {
    public static cpuz a;
    static final cpqa<cpva> b;

    static {
        cpuz cpvcVar;
        try {
            cpvcVar = (cpuz) Class.forName("com.google.android.libraries.aplos.common.GaAnalyticsProxy").newInstance();
        } catch (Exception unused) {
            cpvcVar = new cpvc();
        }
        a = cpvcVar;
        b = new cpqa<>("aplos.analytics");
    }

    public static cpva a(cpoj<?, ?> cpojVar) {
        cpqa cpqaVar = b;
        cpva cpvaVar = (cpva) cpojVar.k(cpqaVar);
        if (cpvaVar == null) {
            cpva cpvaVar2 = new cpva();
            cpojVar.setExternalData(cpqaVar, cpvaVar2);
            return cpvaVar2;
        }
        return cpvaVar;
    }

    public static <T, D> void b(cpoj<T, D> cpojVar) {
        cpva a2 = a(cpojVar);
        long currentTimeMillis = System.currentTimeMillis();
        long j = a2.a;
        a2.a = currentTimeMillis;
        if (j + 3000 > currentTimeMillis) {
            return;
        }
        a.c();
    }
}
