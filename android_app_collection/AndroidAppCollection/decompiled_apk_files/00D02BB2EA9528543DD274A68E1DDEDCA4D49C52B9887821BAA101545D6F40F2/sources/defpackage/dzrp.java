package defpackage;
/* compiled from: PG */
/* renamed from: dzrp  reason: default package */
/* loaded from: classes6.dex */
public final class dzrp<K> extends dznx<K> {
    protected final dzrn<K> a;

    public dzrp(dzrn<K> dzrnVar) {
        this.a = dzrnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        return this.a.next();
    }
}
