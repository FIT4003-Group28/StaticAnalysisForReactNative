package defpackage;
/* compiled from: PG */
/* renamed from: dcmo  reason: default package */
/* loaded from: classes5.dex */
final class dcmo extends dcfi {
    final /* synthetic */ dcmq a;

    public dcmo(dcmq dcmqVar) {
        this.a = dcmqVar;
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return true;
    }

    @Override // defpackage.dcfi
    public final Object b(int i) {
        return this.a.b.c(i);
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b.c;
    }
}
