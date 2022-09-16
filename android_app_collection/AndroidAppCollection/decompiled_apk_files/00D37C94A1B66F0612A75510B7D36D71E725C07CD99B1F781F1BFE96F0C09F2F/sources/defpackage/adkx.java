package defpackage;
/* compiled from: PG */
/* renamed from: adkx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adkx implements ayqb {
    public final /* synthetic */ adla a;
    private final /* synthetic */ int b;

    public /* synthetic */ adkx(adla adlaVar) {
        this.a = adlaVar;
    }

    public /* synthetic */ adkx(adla adlaVar, int i) {
        this.b = i;
        this.a = adlaVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.a.s = (ahhx) obj;
        } else if (i == 1) {
            adla adlaVar = this.a;
            ahhp ahhpVar = (ahhp) obj;
            if (!adlaVar.a.ac()) {
                return;
            }
            adlaVar.a.g.U(ahhpVar.a());
        } else if (i == 2) {
            adla adlaVar2 = this.a;
            adlaVar2.a.h.b(new adkz(adlaVar2, ((Boolean) obj).booleanValue()));
        } else {
            adla adlaVar3 = this.a;
            adlaVar3.a.h.c(new adky(adlaVar3, ((Boolean) obj).booleanValue()));
        }
    }
}
