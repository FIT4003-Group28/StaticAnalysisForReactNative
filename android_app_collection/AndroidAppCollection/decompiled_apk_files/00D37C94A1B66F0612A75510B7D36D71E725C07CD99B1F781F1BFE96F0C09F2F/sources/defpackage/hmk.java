package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hmk  reason: default package */
/* loaded from: classes3.dex */
public final class hmk implements ajgw {
    final /* synthetic */ hml a;

    public hmk(hml hmlVar) {
        this.a = hmlVar;
    }

    @Override // defpackage.ajgw
    public final void a() {
        apok apokVar = this.a.aq.i;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 16384) != 0) {
            hml hmlVar = this.a;
            aafo aafoVar = hmlVar.c;
            apok apokVar2 = hmlVar.aq.i;
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
        this.a.as.c();
    }
}
