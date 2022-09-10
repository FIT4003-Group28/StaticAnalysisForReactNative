package defpackage;

import java.io.Serializable;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dbvu  reason: default package */
/* loaded from: classes.dex */
public class dbvu<K, V> implements Serializable, dbuj {
    private static final long serialVersionUID = 1;
    public final dbwu<K, V> a;

    public dbvu(dbwu<K, V> dbwuVar) {
        this.a = dbwuVar;
    }

    @Override // defpackage.dbuj
    public final V b(Object obj) {
        dbwu<K, V> dbwuVar = this.a;
        dbsk.s(obj);
        int j = dbwuVar.j(obj);
        return dbwuVar.k(j).c(obj, j);
    }

    @Override // defpackage.dbuj
    public final V c(K k, Callable<? extends V> callable) {
        dbsk.s(callable);
        return this.a.q(k, new dbvt(callable));
    }

    @Override // defpackage.dbuj
    public final void d(K k, V v) {
        this.a.put(k, v);
    }

    @Override // defpackage.dbuj
    public final void e() {
        this.a.clear();
    }

    Object writeReplace() {
        return new dbvv(this.a);
    }
}
