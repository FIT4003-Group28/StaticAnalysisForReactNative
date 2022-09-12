package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbxd  reason: default package */
/* loaded from: classes5.dex */
final class dbxd<K, V> extends dbxg<K, V> {
    private static final long serialVersionUID = 0;

    public dbxd(Map<K, V> map, dbxg<V, K> dbxgVar) {
        super((Map) map, (dbxg) dbxgVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = (dbxg) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.b);
    }

    @Override // defpackage.dbxg
    public final K a(K k) {
        return this.b.b(k);
    }

    @Override // defpackage.dbxg
    public final V b(V v) {
        return this.b.a(v);
    }

    Object readResolve() {
        return this.b.i();
    }
}
