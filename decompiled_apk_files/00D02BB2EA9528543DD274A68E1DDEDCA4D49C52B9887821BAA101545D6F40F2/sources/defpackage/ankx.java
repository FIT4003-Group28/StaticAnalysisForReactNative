package defpackage;
/* compiled from: PG */
/* renamed from: ankx  reason: default package */
/* loaded from: classes2.dex */
final class ankx implements btzi<duzc, duzk> {
    final /* synthetic */ btzi a;
    final /* synthetic */ ankz b;

    public ankx(ankz ankzVar, btzi btziVar) {
        this.b = ankzVar;
        this.a = btziVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<duzc> btzrVar, btzy btzyVar) {
        this.a.QY(btzrVar, btzyVar);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<duzc> btzrVar, duzk duzkVar) {
        duzk duzkVar2 = duzkVar;
        this.b.a.QZ(btzrVar, duzkVar2);
        this.a.QZ(btzrVar, duzkVar2);
    }
}
