package defpackage;
/* compiled from: PG */
/* renamed from: cwfi  reason: default package */
/* loaded from: classes5.dex */
abstract class cwfi implements dbrn<cwls, cwfm> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ cwfm a(cwls cwlsVar) {
        cwls cwlsVar2 = cwlsVar;
        cwfj cwfjVar = new cwfj();
        cwfjVar.b(false);
        cwfjVar.a(false);
        cwfjVar.c(1);
        cwfjVar.a = cwlsVar2.b();
        String a = cwlsVar2.a();
        if (a != null) {
            cwfjVar.b = a;
            cwfjVar.c = cwlsVar2.c();
            cwfjVar.d = cwlsVar2.d();
            cwfjVar.b(cwlsVar2.f());
            cwfjVar.a(cwlsVar2.g());
            cwfjVar.g = cwlsVar2.e();
            cwfjVar.h = cwlsVar2.h();
            b(cwlsVar2, cwfjVar);
            String str = cwfjVar.b == null ? " accountName" : "";
            if (cwfjVar.e == null) {
                str = str.concat(" isG1User");
            }
            if (cwfjVar.f == null) {
                str = String.valueOf(str).concat(" isDasherUser");
            }
            if (cwfjVar.i == 0) {
                str = String.valueOf(str).concat(" isUnicornUser");
            }
            if (str.isEmpty()) {
                return new cwfk(cwfjVar.a, cwfjVar.b, cwfjVar.c, cwfjVar.d, cwfjVar.e.booleanValue(), cwfjVar.f.booleanValue(), cwfjVar.g, cwfjVar.h, cwfjVar.i);
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null accountName");
    }

    public abstract void b(cwls cwlsVar, cwfl cwflVar);
}
