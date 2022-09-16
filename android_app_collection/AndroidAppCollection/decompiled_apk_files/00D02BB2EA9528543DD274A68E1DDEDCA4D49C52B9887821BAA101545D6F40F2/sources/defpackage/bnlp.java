package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnlp  reason: default package */
/* loaded from: classes3.dex */
public final class bnlp implements btzi<djio, djiq> {
    final /* synthetic */ bnlq a;
    private final btrm b;
    private final cqat c;
    private final dxio<ckcw> d;

    public bnlp(bnlq bnlqVar, btrm btrmVar, cqat cqatVar, dxio<ckcw> dxioVar) {
        this.a = bnlqVar;
        this.b = btrmVar;
        this.c = cqatVar;
        this.d = dxioVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djio> btzrVar, btzy btzyVar) {
        this.a.a = false;
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djio> btzrVar, djiq djiqVar) {
        djiq djiqVar2 = djiqVar;
        ((ckcn) this.d.a().a(ckjh.a)).b(djiqVar2.b.size());
        this.a.a = false;
        btrm btrmVar = this.b;
        this.c.e();
        btrmVar.b(new bnlj(djiqVar2));
    }
}
