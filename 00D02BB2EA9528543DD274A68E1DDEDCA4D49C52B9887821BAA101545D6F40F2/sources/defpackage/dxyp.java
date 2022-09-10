package defpackage;
/* compiled from: PG */
/* renamed from: dxyp  reason: default package */
/* loaded from: classes6.dex */
public final class dxyp implements dxyn {
    public static final cxmb<dtbm> a;
    private final dbsg<cxji> b;

    static {
        cxml a2 = new cxml("com.google.android.apps.gmm.recovery").a();
        try {
            a = a2.f("1", (dtbm) dsqw.cq(dtbm.c, new byte[0]), dxyo.a);
        } catch (dsrm unused) {
            throw new AssertionError("Could not parse proto flag \"1\"");
        }
    }

    public dxyp(dbsg<cxji> dbsgVar) {
        this.b = dbsgVar;
    }

    @Override // defpackage.dxyn
    public final dtbm a() {
        return a.a();
    }
}
