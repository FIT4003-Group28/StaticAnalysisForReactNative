package defpackage;
/* compiled from: PG */
/* renamed from: heq  reason: default package */
/* loaded from: classes3.dex */
final class heq implements ajgw {
    final /* synthetic */ hes a;

    public heq(hes hesVar) {
        this.a = hesVar;
    }

    @Override // defpackage.ajgw
    public final void a() {
        apok apokVar = this.a.ap.i;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 16384) != 0) {
            hes hesVar = this.a;
            aafo aafoVar = hesVar.af;
            apok apokVar2 = hesVar.ap.i;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            apzg apzgVar = apojVar2.o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }

    @Override // defpackage.ajgw
    public final void b() {
    }

    @Override // defpackage.ajgw
    public final void c(boolean z) {
        this.a.an.b(false);
    }
}
