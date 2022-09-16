package defpackage;
/* compiled from: PG */
/* renamed from: aehx  reason: default package */
/* loaded from: classes2.dex */
public class aehx {
    public final dxio<ckcw> a;
    private final dxio<cvv> b;
    @dzsi
    private String c;
    @dzsi
    private String d;

    public aehx(dxio<cvv> dxioVar, dxio<ckcw> dxioVar2) {
        this.b = dxioVar;
        this.a = dxioVar2;
    }

    private static String c(String str) {
        debv debvVar = new debv();
        debvVar.a = "HTTPS".toLowerCase().replace('_', '.');
        debvVar.b = "www.google.com";
        debvVar.c = str;
        return debvVar.toString();
    }

    public final synchronized void a(dnng dnngVar) {
        if (dnngVar.g.isEmpty()) {
            return;
        }
        String str = dnngVar.g;
        String str2 = this.c;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        this.b.a().a(c(str), new aehw(this, ckfk.a));
        this.c = str;
    }

    public final synchronized void b(dnng dnngVar) {
        if (dnngVar.h.isEmpty()) {
            this.d = null;
            return;
        }
        String str = dnngVar.h;
        String str2 = this.d;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        this.b.a().a(c(str), new aehw(this, ckfk.b));
        this.d = str;
    }
}
