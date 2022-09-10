package defpackage;
/* compiled from: PG */
/* renamed from: cdjh  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdjh {
    public static cdjh e(bwrs<ilo> bwrsVar, int i) {
        cdiv cdivVar = new cdiv();
        cdivVar.a = bwrsVar;
        dmbc dmbcVar = dmbc.h;
        if (dmbcVar != null) {
            cdivVar.b = dmbcVar;
            cdivVar.d = i;
            String str = cdivVar.a == null ? " placemarkRef" : "";
            if (cdivVar.b == null) {
                str = str.concat(" mergedPost");
            }
            if (cdivVar.d == 0) {
                str = String.valueOf(str).concat(" eventType");
            }
            if (str.isEmpty()) {
                return new cdiw(cdivVar.a, cdivVar.b, cdivVar.c, cdivVar.d);
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null mergedPost");
    }

    public abstract bwrs<ilo> a();

    public abstract dmbc b();

    public abstract dbsg<djgl> c();

    public abstract int d();
}
