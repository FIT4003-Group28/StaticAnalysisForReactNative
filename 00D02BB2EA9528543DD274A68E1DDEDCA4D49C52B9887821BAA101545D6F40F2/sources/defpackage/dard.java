package defpackage;
/* compiled from: PG */
/* renamed from: dard  reason: default package */
/* loaded from: classes5.dex */
public final class dard implements darz, dase {
    @Override // defpackage.dase
    public final void a(dasc dascVar) {
        dascVar.a = this;
    }

    @Override // defpackage.darz
    public final void b(dasc dascVar) {
        String str = dascVar.f;
        if (str.equals("POST")) {
            return;
        }
        if ((!str.equals("GET") || dascVar.g.c().length() <= 2048) && dascVar.e.b(str)) {
            return;
        }
        String str2 = dascVar.f;
        dascVar.b("POST");
        dascVar.b.h("X-HTTP-Method-Override", str2);
        if (str2.equals("GET")) {
            dascVar.d = new dasp(dascVar.g.d());
            dascVar.g.clear();
        } else if (dascVar.d != null) {
        } else {
            dascVar.d = new dart();
        }
    }
}
