package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: be  reason: default package */
/* loaded from: classes3.dex */
public final class be implements Runnable {
    final /* synthetic */ bh a;

    public be(bh bhVar) {
        this.a = bhVar;
    }

    private final Set<Integer> a() {
        HashSet hashSet = new HashSet();
        Cursor q = this.a.c.q(new avt("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (q.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(q.getInt(0)));
            } catch (Throwable th) {
                q.close();
                throw th;
            }
        }
        q.close();
        if (!hashSet.isEmpty()) {
            this.a.i.a();
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.Set] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r3;
        bh bhVar;
        Lock A = this.a.c.A();
        A.lock();
        try {
            try {
                bhVar = this.a;
            } catch (SQLiteException | IllegalStateException unused) {
                r3 = 0;
            }
            if (bhVar.c.B()) {
                if (!bhVar.e) {
                    bhVar.c.c.b();
                }
                if (bhVar.e) {
                    if (!this.a.d.compareAndSet(true, false)) {
                        return;
                    }
                    if (this.a.c.o()) {
                        return;
                    }
                    bn bnVar = this.a.c;
                    r3 = bnVar.e;
                    if (r3 != 0) {
                        try {
                            avu b = bnVar.c.b();
                            b.b();
                            try {
                                r3 = a();
                                try {
                                    b.d();
                                    b.c();
                                } catch (Throwable th) {
                                    th = th;
                                    b.c();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (SQLiteException | IllegalStateException unused2) {
                        }
                    } else {
                        r3 = a();
                    }
                    if (r3 == 0 || r3.isEmpty()) {
                        return;
                    }
                    synchronized (this.a.f) {
                        Iterator<Map.Entry<Object, bg>> it = this.a.f.iterator();
                        if (it.hasNext()) {
                            it.next().getValue();
                            throw null;
                        }
                    }
                }
            }
        } finally {
            A.unlock();
        }
    }
}
