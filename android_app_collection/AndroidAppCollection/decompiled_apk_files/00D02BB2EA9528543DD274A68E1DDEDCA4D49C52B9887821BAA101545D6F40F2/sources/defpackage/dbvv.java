package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dbvv  reason: default package */
/* loaded from: classes5.dex */
class dbvv<K, V> extends dbuu<K, V> implements Serializable {
    private static final long serialVersionUID = 1;
    final dbvz b;
    final dbvz c;
    final dbrl<Object> d;
    final dbrl<Object> e;
    final long f;
    final long g;
    final long h;
    final dbwz<K, V> i;
    final int j;
    final dbwx<? super K, ? super V> k;
    final dbug l;
    final dbus<? super K, V> m;
    transient dbuj<K, V> n;

    public dbvv(dbwu<K, V> dbwuVar) {
        dbvz dbvzVar = dbwuVar.h;
        dbvz dbvzVar2 = dbwuVar.i;
        dbrl<Object> dbrlVar = dbwuVar.f;
        dbrl<Object> dbrlVar2 = dbwuVar.g;
        long j = dbwuVar.m;
        long j2 = dbwuVar.l;
        long j3 = dbwuVar.j;
        dbwz<K, V> dbwzVar = dbwuVar.k;
        int i = dbwuVar.e;
        dbug dbugVar = dbwuVar.q;
        dbus<? super K, V> dbusVar = dbwuVar.s;
        this.b = dbvzVar;
        this.c = dbvzVar2;
        this.d = dbrlVar;
        this.e = dbrlVar2;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = dbwzVar;
        this.j = i;
        this.k = (dbwx<K, V>) dbwuVar.p;
        this.l = (dbugVar == dbug.b || dbugVar == dbuo.b) ? null : dbugVar;
        this.m = dbusVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.n = (dbuj<K, V>) h().e();
    }

    private Object readResolve() {
        return this.n;
    }

    @Override // defpackage.dbuu, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbuo<K, V> h() {
        dbuo<K, V> dbuoVar = (dbuo<K, V>) dbuo.a();
        dbuoVar.l(this.b);
        dbvz dbvzVar = this.c;
        dbvz dbvzVar2 = dbuoVar.j;
        boolean z = true;
        dbsk.p(dbvzVar2 == null, "Value strength was already set to %s", dbvzVar2);
        dbsk.s(dbvzVar);
        dbuoVar.j = dbvzVar;
        dbrl<Object> dbrlVar = this.d;
        dbrl<Object> dbrlVar2 = dbuoVar.m;
        dbsk.p(dbrlVar2 == null, "key equivalence was already set to %s", dbrlVar2);
        dbsk.s(dbrlVar);
        dbuoVar.m = dbrlVar;
        dbrl<Object> dbrlVar3 = this.e;
        dbrl<Object> dbrlVar4 = dbuoVar.n;
        dbsk.p(dbrlVar4 == null, "value equivalence was already set to %s", dbrlVar4);
        dbsk.s(dbrlVar3);
        dbuoVar.n = dbrlVar3;
        dbuoVar.f(this.j);
        dbuoVar.k(this.k);
        dbuoVar.c = false;
        long j = this.f;
        if (j > 0) {
            dbuoVar.h(j, TimeUnit.NANOSECONDS);
        }
        long j2 = this.g;
        if (j2 > 0) {
            dbuoVar.g(j2, TimeUnit.NANOSECONDS);
        }
        if (this.i != dbun.a) {
            dbwz dbwzVar = (dbwz<K, V>) this.i;
            dbsk.l(dbuoVar.h == null);
            if (dbuoVar.c) {
                long j3 = dbuoVar.f;
                dbsk.o(j3 == -1, "weigher can not be combined with maximum size", j3);
            }
            dbsk.s(dbwzVar);
            dbuoVar.h = dbwzVar;
            long j4 = this.h;
            if (j4 != -1) {
                long j5 = dbuoVar.g;
                dbsk.o(j5 == -1, "maximum weight was already set to %s", j5);
                long j6 = dbuoVar.f;
                dbsk.o(j6 == -1, "maximum size was already set to %s", j6);
                if (j4 < 0) {
                    z = false;
                }
                dbsk.b(z, "maximum weight must not be negative");
                dbuoVar.g = j4;
            }
        } else {
            long j7 = this.h;
            if (j7 != -1) {
                dbuoVar.j(j7);
            }
        }
        dbug dbugVar = this.l;
        if (dbugVar != null) {
            dbuoVar.m(dbugVar);
        }
        return dbuoVar;
    }
}
