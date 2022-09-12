package defpackage;
/* compiled from: PG */
/* renamed from: boh  reason: default package */
/* loaded from: classes3.dex */
final class boh {
    private static final bph a = bph.a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static blw a(bpj bpjVar) {
        bpjVar.f();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (bpjVar.h()) {
            int j = bpjVar.j(a);
            if (j == 0) {
                str = bpjVar.l();
            } else if (j == 1) {
                str2 = bpjVar.l();
            } else if (j == 2) {
                str3 = bpjVar.l();
            } else if (j == 3) {
                bpjVar.n();
            } else {
                bpjVar.k();
                bpjVar.p();
            }
        }
        bpjVar.g();
        return new blw(str, str2, str3);
    }
}
