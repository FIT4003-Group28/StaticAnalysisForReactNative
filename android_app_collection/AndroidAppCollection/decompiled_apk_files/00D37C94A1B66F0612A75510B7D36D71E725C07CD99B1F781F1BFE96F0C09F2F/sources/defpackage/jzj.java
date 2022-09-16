package defpackage;
/* compiled from: PG */
/* renamed from: jzj  reason: default package */
/* loaded from: classes3.dex */
public final class jzj extends ajxh {
    public jzi a;

    public jzj(abeb abebVar, yni yniVar, yzj yzjVar, acti actiVar) {
        super(abebVar, yniVar, yni.c(), yzjVar, actiVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final void lj(cff cffVar, ajfz ajfzVar) {
        super.lj(cffVar, ajfzVar);
        ajfy ajfyVar = ajfy.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ void lz(Object obj, ajfy ajfyVar) {
        jzi jziVar;
        aubk aubkVar = (aubk) obj;
        super.lz(aubkVar, ajfyVar);
        if (ajfyVar != ajfy.NEXT || aubkVar == null || (jziVar = this.a) == null) {
            return;
        }
        ((aigi) jziVar).b(aubkVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ Object np(auna aunaVar) {
        if (aunaVar == null || !aunaVar.qn(aubk.b)) {
            return null;
        }
        return (aubk) aunaVar.qm(aubk.b);
    }
}
