package defpackage;
/* compiled from: PG */
/* renamed from: anid  reason: default package */
/* loaded from: classes2.dex */
final class anid implements dbsl<anie> {
    final /* synthetic */ Comparable a;

    public anid(Comparable comparable) {
        this.a = comparable;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(anie anieVar) {
        return this.a.equals(anieVar.a);
    }
}
