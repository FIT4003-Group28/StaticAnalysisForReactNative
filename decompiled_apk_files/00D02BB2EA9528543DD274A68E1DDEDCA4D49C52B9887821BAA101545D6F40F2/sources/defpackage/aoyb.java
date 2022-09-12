package defpackage;
/* compiled from: PG */
/* renamed from: aoyb  reason: default package */
/* loaded from: classes2.dex */
final class aoyb implements btzi<djcq, djcu> {
    final /* synthetic */ aoyc a;
    final /* synthetic */ aoyc b;

    public aoyb(aoyc aoycVar, aoyc aoycVar2) {
        this.a = aoycVar;
        this.b = aoycVar2;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djcq> btzrVar, btzy btzyVar) {
        this.a.QY(btzrVar, btzyVar);
        this.b.QY(btzrVar, btzyVar);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djcq> btzrVar, djcu djcuVar) {
        djcu djcuVar2 = djcuVar;
        this.a.c(djcuVar2);
        this.b.c(djcuVar2);
    }
}
