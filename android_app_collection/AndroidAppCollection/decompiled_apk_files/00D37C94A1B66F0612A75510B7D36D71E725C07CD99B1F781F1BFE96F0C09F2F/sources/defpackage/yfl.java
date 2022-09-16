package defpackage;
/* compiled from: PG */
/* renamed from: yfl  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class yfl implements akbi {
    public final /* synthetic */ yfn a;
    private final /* synthetic */ int b;

    public /* synthetic */ yfl(yfn yfnVar) {
        this.a = yfnVar;
    }

    public /* synthetic */ yfl(yfn yfnVar, int i) {
        this.b = i;
        this.a = yfnVar;
    }

    @Override // defpackage.akbi
    public final void oL(aopc aopcVar) {
        if (this.b != 0) {
            yfn yfnVar = this.a;
            avny avnyVar = yfnVar.a;
            if (avnyVar == null || (avnyVar.b & 4) == 0) {
                return;
            }
            apok apokVar = avnyVar.h;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            yfnVar.f(apojVar);
            return;
        }
        yfn yfnVar2 = this.a;
        avny avnyVar2 = yfnVar2.a;
        if (avnyVar2 == null || (avnyVar2.b & 2) == 0) {
            return;
        }
        apok apokVar2 = avnyVar2.g;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar2 = apokVar2.c;
        if (apojVar2 == null) {
            apojVar2 = apoj.a;
        }
        yfnVar2.f(apojVar2);
    }
}
