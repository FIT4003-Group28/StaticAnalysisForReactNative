package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dbup  reason: default package */
/* loaded from: classes5.dex */
final class dbup<K, V> extends dbus<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final dbrn<K, V> a;

    public dbup(dbrn<K, V> dbrnVar) {
        dbsk.s(dbrnVar);
        this.a = dbrnVar;
    }

    @Override // defpackage.dbus
    public final V b(K k) {
        dbrn<K, V> dbrnVar = this.a;
        dbsk.s(k);
        return dbrnVar.a(k);
    }
}
