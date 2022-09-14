package c.a.a.x;

import c.a.a.x.k0.c;
/* loaded from: classes.dex */
class k {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f2643a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.c a(c.a.a.x.k0.c cVar) {
        cVar.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f2 = 0.0f;
        while (cVar.f()) {
            int a2 = cVar.a(f2643a);
            if (a2 == 0) {
                str = cVar.z();
            } else if (a2 == 1) {
                str2 = cVar.z();
            } else if (a2 == 2) {
                str3 = cVar.z();
            } else if (a2 != 3) {
                cVar.B();
                cVar.C();
            } else {
                f2 = (float) cVar.h();
            }
        }
        cVar.d();
        return new c.a.a.v.c(str, str2, str3, f2);
    }
}
