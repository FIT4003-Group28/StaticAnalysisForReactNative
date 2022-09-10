package defpackage;
/* compiled from: PG */
/* renamed from: atdk  reason: default package */
/* loaded from: classes2.dex */
final class atdk implements dbty<alfb> {
    final /* synthetic */ atdm a;

    public atdk(atdm atdmVar) {
        this.a = atdmVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ alfb a() {
        int a;
        atlq atlqVar = this.a.h;
        return (atlqVar == null || (a = dwan.a(atlqVar.m.f().l(0).J.n)) == 0 || a != 3) ? alfb.TIME : alfb.DISTANCE;
    }
}
