package defpackage;
/* compiled from: PG */
/* renamed from: bbdp  reason: default package */
/* loaded from: classes3.dex */
final class bbdp implements btzi<djzw, djzy> {
    final /* synthetic */ deig a;
    final /* synthetic */ bbdq b;

    public bbdp(bbdq bbdqVar, deig deigVar) {
        this.b = bbdqVar;
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djzw> btzrVar, btzy btzyVar) {
        this.a.k(new btzz(btzyVar));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djzw> btzrVar, djzy djzyVar) {
        djzy djzyVar2 = djzyVar;
        anhk anhkVar = this.b.a;
        dnwb dnwbVar = djzyVar2.a;
        if (dnwbVar == null) {
            dnwbVar = dnwb.i;
        }
        anhkVar.h(dnwbVar.f);
        this.a.j(djzyVar2);
    }
}
