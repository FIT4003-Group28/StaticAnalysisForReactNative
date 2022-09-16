package defpackage;
/* compiled from: PG */
/* renamed from: ndp  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ndp implements ndu {
    public final /* synthetic */ ndv a;
    private final /* synthetic */ int b;

    public /* synthetic */ ndp(ndv ndvVar, int i) {
        this.b = i;
        this.a = ndvVar;
    }

    @Override // defpackage.ndu
    public final void a(boolean z) {
        apzg apzgVar;
        if (this.b == 0) {
            this.a.g(z);
            return;
        }
        ndv ndvVar = this.a;
        aafo aafoVar = ndvVar.c;
        if (z) {
            apok apokVar = ndvVar.d.d;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            apzgVar = apojVar.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apok apokVar2 = ndvVar.d.e;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            apzgVar = apojVar2.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        }
        aafoVar.a(apzgVar);
    }
}
