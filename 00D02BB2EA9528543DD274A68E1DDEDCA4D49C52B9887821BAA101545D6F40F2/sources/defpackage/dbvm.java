package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: PG */
/* renamed from: dbvm  reason: default package */
/* loaded from: classes5.dex */
abstract class dbvm<T> implements Iterator<T> {
    int a;
    int b = -1;
    dbvx c;
    AtomicReferenceArray<dbwv> d;
    dbwv e;
    dbwt f;
    dbwt g;
    final /* synthetic */ dbwu h;

    public dbvm(dbwu dbwuVar) {
        this.h = dbwuVar;
        this.a = dbwuVar.d.length - 1;
        a();
    }

    final void a() {
        this.f = null;
        if (!b() && !c()) {
            while (true) {
                int i = this.a;
                if (i < 0) {
                    return;
                }
                dbvx[] dbvxVarArr = this.h.d;
                this.a = i - 1;
                dbvx dbvxVar = dbvxVarArr[i];
                this.c = dbvxVar;
                if (dbvxVar.b != 0) {
                    AtomicReferenceArray<dbwv<K, V>> atomicReferenceArray = this.c.f;
                    this.d = atomicReferenceArray;
                    this.b = atomicReferenceArray.length() - 1;
                    if (c()) {
                        return;
                    }
                }
            }
        }
    }

    final boolean b() {
        dbwv dbwvVar = this.e;
        if (dbwvVar != null) {
            while (true) {
                this.e = dbwvVar.c();
                dbwv dbwvVar2 = this.e;
                if (dbwvVar2 == null) {
                    return false;
                }
                if (d(dbwvVar2)) {
                    return true;
                }
                dbwvVar = this.e;
            }
        } else {
            return false;
        }
    }

    final boolean c() {
        while (true) {
            int i = this.b;
            if (i >= 0) {
                AtomicReferenceArray<dbwv> atomicReferenceArray = this.d;
                this.b = i - 1;
                dbwv dbwvVar = atomicReferenceArray.get(i);
                this.e = dbwvVar;
                if (dbwvVar != null && (d(dbwvVar) || b())) {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        r6.f = new defpackage.dbwt(r6.h, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        r6.c.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean d(defpackage.dbwv r7) {
        /*
            r6 = this;
            dbwu r0 = r6.h     // Catch: java.lang.Throwable -> L42
            dbug r0 = r0.q     // Catch: java.lang.Throwable -> L42
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r7.e()     // Catch: java.lang.Throwable -> L42
            dbwu r3 = r6.h     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r7.e()     // Catch: java.lang.Throwable -> L42
            r5 = 0
            if (r4 != 0) goto L16
            goto L29
        L16:
            dbwg r4 = r7.a()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L21
            goto L29
        L21:
            boolean r7 = r3.l(r7, r0)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto L28
            goto L29
        L28:
            r5 = r4
        L29:
            if (r5 == 0) goto L3b
            dbwt r7 = new dbwt     // Catch: java.lang.Throwable -> L42
            dbwu r0 = r6.h     // Catch: java.lang.Throwable -> L42
            r7.<init>(r0, r2, r5)     // Catch: java.lang.Throwable -> L42
            r6.f = r7     // Catch: java.lang.Throwable -> L42
            dbvx r7 = r6.c
            r7.v()
            r7 = 1
            return r7
        L3b:
            dbvx r7 = r6.c
            r7.v()
            r7 = 0
            return r7
        L42:
            r7 = move-exception
            dbvx r0 = r6.c
            r0.v()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbvm.d(dbwv):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbwt e() {
        dbwt dbwtVar = this.f;
        if (dbwtVar != null) {
            this.g = dbwtVar;
            a();
            return this.g;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        dbsk.l(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
