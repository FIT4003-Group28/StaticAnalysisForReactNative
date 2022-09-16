package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdxr  reason: default package */
/* loaded from: classes3.dex */
public final class bdxr implements alht {
    final /* synthetic */ bdyb a;

    public bdxr(bdyb bdybVar) {
        this.a = bdybVar;
    }

    @Override // defpackage.alht
    public final boolean a(alhr alhrVar) {
        bdyb bdybVar = this.a;
        gga ggaVar = bdybVar.aE;
        if (!bdybVar.aD || bdybVar.D() || ggaVar == null) {
            return false;
        }
        if (this.a.bs() || this.a.bo().l || this.a.bo().i) {
            this.a.Nw(new befs());
            ggaVar.z(bdyb.class);
            ggaVar.g().f();
            return true;
        }
        this.a.bG();
        return false;
    }
}
