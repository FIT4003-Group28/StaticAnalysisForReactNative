package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dbvp  reason: default package */
/* loaded from: classes5.dex */
final class dbvp<K, V> extends dbvv<K, V> implements Serializable, dbuv {
    private static final long serialVersionUID = 1;
    transient dbuv<K, V> a;

    public dbvp(dbwu<K, V> dbwuVar) {
        super(dbwuVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = (dbuv<K, V>) h().d((dbus<? super K, V>) this.m);
    }

    private Object readResolve() {
        return this.a;
    }

    @Override // defpackage.dbrn
    public final V a(K k) {
        return (V) ((dbvs) this.a).g(k);
    }

    @Override // defpackage.dbuv
    public final V f(K k) {
        throw null;
    }

    @Override // defpackage.dbuv
    public final V g(K k) {
        throw null;
    }
}
