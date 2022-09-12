package defpackage;
/* compiled from: PG */
/* renamed from: dcmc  reason: default package */
/* loaded from: classes5.dex */
final class dcmc extends dbyr {
    final Comparable a;
    final /* synthetic */ dcmg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcmc(dcmg dcmgVar, Comparable comparable) {
        super(comparable);
        this.b = dcmgVar;
        this.a = dcmgVar.last();
    }

    @Override // defpackage.dbyr
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (dcmg.W(comparable, this.a)) {
            return null;
        }
        return this.b.a.d(comparable);
    }
}
