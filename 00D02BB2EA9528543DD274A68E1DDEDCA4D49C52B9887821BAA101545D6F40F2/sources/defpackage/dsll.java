package defpackage;
/* compiled from: PG */
/* renamed from: dsll  reason: default package */
/* loaded from: classes6.dex */
public final class dsll {
    public static volatile dyib<dslp, dslt> a;
    private static volatile dyib<dsml, dsmn> b;
    private static volatile dyib<dslv, dslz> c;

    private dsll() {
    }

    public static dyib<dsml, dsmn> a() {
        dyib<dsml, dsmn> dyibVar = b;
        if (dyibVar == null) {
            synchronized (dsll.class) {
                dyibVar = b;
                if (dyibVar == null) {
                    dyhx c2 = dyib.c();
                    c2.c = dyhz.UNARY;
                    c2.d = dyib.b("footprints.oneplatform.FootprintsService", "UpdateActivityControlsSettings");
                    c2.e = true;
                    c2.a = dyyq.b(dsml.g);
                    c2.b = dyyq.b(dsmn.b);
                    dyibVar = c2.a();
                    b = dyibVar;
                }
            }
        }
        return dyibVar;
    }

    public static dyib<dslv, dslz> b() {
        dyib<dslv, dslz> dyibVar = c;
        if (dyibVar == null) {
            synchronized (dsll.class) {
                dyibVar = c;
                if (dyibVar == null) {
                    dyhx c2 = dyib.c();
                    c2.c = dyhz.UNARY;
                    c2.d = dyib.b("footprints.oneplatform.FootprintsService", "GetSettingText");
                    c2.e = true;
                    c2.a = dyyq.b(dslv.f);
                    c2.b = dyyq.b(dslz.g);
                    dyibVar = c2.a();
                    c = dyibVar;
                }
            }
        }
        return dyibVar;
    }

    public static dslj c(dyeu dyeuVar) {
        return (dslj) dslj.b(new dslh(), dyeuVar);
    }

    public static dslk d(dyeu dyeuVar) {
        return (dslk) dslk.e(new dsli(), dyeuVar);
    }
}
