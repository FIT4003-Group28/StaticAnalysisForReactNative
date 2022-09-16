package defpackage;
/* compiled from: PG */
/* renamed from: sgo  reason: default package */
/* loaded from: classes4.dex */
public final class sgo {
    static final sha a;
    public static final /* synthetic */ int b = 0;

    static {
        try {
            snr snrVar = (snr) Class.forName("com.google.android.libraries.aplos.common.GaAnalyticsProxy").newInstance();
        } catch (Exception unused) {
        }
        a = new sha("aplos.analytics");
    }

    public static sgn a(sai saiVar) {
        sha shaVar = a;
        sgn sgnVar = (sgn) saiVar.s(shaVar);
        if (sgnVar == null) {
            sgn sgnVar2 = new sgn();
            saiVar.z.put(shaVar, sgnVar2);
            return sgnVar2;
        }
        return sgnVar;
    }

    public static void b(sai saiVar) {
        sgn a2 = a(saiVar);
        long currentTimeMillis = System.currentTimeMillis();
        long j = a2.a;
        a2.a = currentTimeMillis;
    }
}
