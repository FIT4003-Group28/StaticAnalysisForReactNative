package defpackage;
/* compiled from: PG */
/* renamed from: dcmu  reason: default package */
/* loaded from: classes5.dex */
final class dcmu extends dcdc {
    final /* synthetic */ dcmv a;

    public dcmu(dcmv dcmvVar) {
        this.a = dcmvVar;
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.n(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.l();
    }
}
