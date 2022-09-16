package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: dbvs  reason: default package */
/* loaded from: classes.dex */
public final class dbvs<K, V> extends dbvu<K, V> implements dbuv<K, V> {
    private static final long serialVersionUID = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbvs(dbuo<? super K, ? super V> dbuoVar, dbus<? super K, V> dbusVar) {
        super(new dbwu(dbuoVar, dbusVar));
        dbsk.s(dbusVar);
    }

    @Override // defpackage.dbrn
    public final V a(K k) {
        return g(k);
    }

    @Override // defpackage.dbuv
    public final V f(K k) {
        dbwu<K, V> dbwuVar = this.a;
        return dbwuVar.q(k, dbwuVar.s);
    }

    @Override // defpackage.dbuv
    public final V g(K k) {
        try {
            return f(k);
        } catch (ExecutionException e) {
            throw new deiw(e.getCause());
        }
    }

    @Override // defpackage.dbvu
    Object writeReplace() {
        return new dbvp(this.a);
    }
}
