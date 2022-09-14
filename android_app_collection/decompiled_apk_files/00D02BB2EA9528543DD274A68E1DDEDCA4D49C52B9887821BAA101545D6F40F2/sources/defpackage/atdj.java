package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atdj  reason: default package */
/* loaded from: classes2.dex */
public final class atdj implements dbty<alfa> {
    final /* synthetic */ atdm a;

    public atdj(atdm atdmVar) {
        this.a = atdmVar;
    }

    @Override // defpackage.dbty
    /* renamed from: b */
    public final alfa a() {
        atdm atdmVar = this.a;
        atlq atlqVar = atdmVar.h;
        astg astgVar = atlqVar.d;
        return astgVar != null ? astgVar.b() : atdmVar.j(atlqVar);
    }
}
