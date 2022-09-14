package defpackage;
/* compiled from: PG */
/* renamed from: dcmt  reason: default package */
/* loaded from: classes5.dex */
final class dcmt extends dcfi<dcot> {
    final /* synthetic */ dcmv a;

    public dcmt(dcmv dcmvVar) {
        this.a = dcmvVar;
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return false;
    }

    @Override // defpackage.dcfi
    public final /* bridge */ /* synthetic */ dcot b(int i) {
        return this.a.m(i);
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof dcot) {
            dcot dcotVar = (dcot) obj;
            V b = this.a.b(dcotVar.a(), dcotVar.b());
            if (b != 0 && b.equals(dcotVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.l();
    }
}
