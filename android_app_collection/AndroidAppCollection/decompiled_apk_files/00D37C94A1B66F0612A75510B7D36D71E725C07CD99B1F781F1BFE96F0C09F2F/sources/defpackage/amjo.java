package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: amjo  reason: default package */
/* loaded from: classes.dex */
public final class amjo {
    public static final amzy a = amzy.l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore");
    public final ankw c;
    public final snc d;
    private final Context g;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public long f = -1;

    public amjo(Context context, ankw ankwVar, snc sncVar) {
        this.d = sncVar;
        this.g = context;
        this.c = ankwVar;
    }

    public final amkh a() {
        FileInputStream fileInputStream;
        File file = new File(this.g.getFilesDir(), "103795117");
        this.b.readLock().lock();
        try {
            amkh amkhVar = null;
            FileInputStream fileInputStream2 = null;
            if (file.exists()) {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    amkhVar = (amkh) amkh.parseDelimitedFrom(amkh.a, fileInputStream);
                    uut.q(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    uut.q(fileInputStream2);
                    throw th;
                }
            }
            return amkhVar == null ? amkh.a : amkhVar;
        } finally {
            this.b.readLock().unlock();
        }
    }

    public final ankt b() {
        return anii.h(c(), ammo.a(new ampg() { // from class: amji
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                amjo amjoVar = amjo.this;
                Long l = (Long) obj;
                afw afwVar = new afw();
                amkh amkhVar = amkh.a;
                try {
                    for (amkg amkgVar : amjoVar.a().d) {
                        long j = amkgVar.e;
                        amkj amkjVar = amkgVar.c;
                        if (amkjVar == null) {
                            amkjVar = amkj.a;
                        }
                        amjv a2 = amjv.a(amkjVar);
                        if (j <= 0) {
                            j = l.longValue();
                        }
                        afwVar.put(a2, Long.valueOf(j));
                    }
                } catch (IOException e) {
                    amjoVar.f(e);
                }
                return afwVar;
            }
        }), this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt c() {
        if (this.e.get()) {
            return anlz.q(Long.valueOf(this.f));
        }
        return this.c.qp(ammo.g(new amjl(this)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt d(final amjv amjvVar, final long j, final boolean z) {
        return this.c.qo(new Runnable() { // from class: amjj
            @Override // java.lang.Runnable
            public final void run() {
                ReentrantReadWriteLock reentrantReadWriteLock;
                amkh a2;
                amjo amjoVar = amjo.this;
                amjv amjvVar2 = amjvVar;
                long j2 = j;
                boolean z2 = z;
                amjoVar.b.writeLock().lock();
                try {
                    amkh amkhVar = amkh.a;
                    try {
                        a2 = amjoVar.a();
                    } catch (IOException e) {
                        if (!amjoVar.f(e)) {
                            ((amzw) ((amzw) ((amzw) amjo.a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$updateLastSyncTime$4", (char) 285, "SyncManagerDataStore.java")).q("Unable to read or clear store, will not update sync time. Sync may run too frequently.");
                        }
                    }
                    aopa createBuilder = amkh.a.createBuilder();
                    createBuilder.mergeFrom((aopi) a2);
                    createBuilder.copyOnWrite();
                    ((amkh) createBuilder.instance).d = amkh.emptyProtobufList();
                    amkg amkgVar = null;
                    for (amkg amkgVar2 : a2.d) {
                        amkj amkjVar = amkgVar2.c;
                        if (amkjVar == null) {
                            amkjVar = amkj.a;
                        }
                        if (amjvVar2.equals(amjv.a(amkjVar))) {
                            amkgVar = amkgVar2;
                        } else {
                            createBuilder.I(amkgVar2);
                        }
                    }
                    if (amkgVar != null) {
                        if (a2.c < 0) {
                            long j3 = amjoVar.f;
                            if (j3 < 0) {
                                j3 = amjoVar.d.c();
                                amjoVar.f = j3;
                            }
                            createBuilder.copyOnWrite();
                            amkh amkhVar2 = (amkh) createBuilder.instance;
                            amkhVar2.b |= 1;
                            amkhVar2.c = j3;
                        }
                        aopa createBuilder2 = amkg.a.createBuilder();
                        amkj amkjVar2 = amjvVar2.a;
                        createBuilder2.copyOnWrite();
                        amkg amkgVar3 = (amkg) createBuilder2.instance;
                        amkjVar2.getClass();
                        amkgVar3.c = amkjVar2;
                        amkgVar3.b |= 1;
                        createBuilder2.copyOnWrite();
                        amkg amkgVar4 = (amkg) createBuilder2.instance;
                        amkgVar4.b |= 4;
                        amkgVar4.e = j2;
                        if (z2) {
                            createBuilder2.copyOnWrite();
                            amkg amkgVar5 = (amkg) createBuilder2.instance;
                            amkgVar5.b |= 2;
                            amkgVar5.d = j2;
                            createBuilder2.copyOnWrite();
                            amkg amkgVar6 = (amkg) createBuilder2.instance;
                            amkgVar6.b |= 8;
                            amkgVar6.f = 0;
                        } else {
                            long j4 = amkgVar.d;
                            createBuilder2.copyOnWrite();
                            amkg amkgVar7 = (amkg) createBuilder2.instance;
                            amkgVar7.b |= 2;
                            amkgVar7.d = j4;
                            createBuilder2.copyOnWrite();
                            amkg amkgVar8 = (amkg) createBuilder2.instance;
                            amkgVar8.b |= 8;
                            amkgVar8.f = amkgVar.f + 1;
                        }
                        createBuilder.I((amkg) createBuilder2.mo39build());
                        try {
                            amjoVar.e((amkh) createBuilder.mo39build());
                        } catch (IOException e2) {
                            ((amzw) ((amzw) ((amzw) amjo.a.f()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$updateLastSyncTime$4", (char) 345, "SyncManagerDataStore.java")).q("Error writing sync data file after sync. Sync may run too frequently.");
                        }
                        reentrantReadWriteLock = amjoVar.b;
                    } else {
                        reentrantReadWriteLock = amjoVar.b;
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    amjoVar.b.writeLock().unlock();
                    throw th;
                }
            }
        });
    }

    public final void e(amkh amkhVar) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(new File(this.g.getFilesDir(), "103795117"));
            try {
                amkhVar.writeDelimitedTo(fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public final boolean f(Throwable th) {
        ((amzw) ((amzw) ((amzw) a.g()).h(th)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 515, "SyncManagerDataStore.java")).q("Could not read sync datastore. There was probably a write error. Wiping store.");
        this.b.writeLock().lock();
        try {
            boolean z = false;
            this.e.set(false);
            long j = this.f;
            if (j <= 0) {
                j = this.d.c();
            }
            aopa createBuilder = amkh.a.createBuilder();
            createBuilder.copyOnWrite();
            amkh amkhVar = (amkh) createBuilder.instance;
            amkhVar.b |= 1;
            amkhVar.c = j;
            try {
                e((amkh) createBuilder.mo39build());
                this.e.set(true);
                z = true;
            } catch (IOException e) {
                ((amzw) ((amzw) ((amzw) a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 535, "SyncManagerDataStore.java")).q("Could not write to datastore to clear store.");
                this.e.set(false);
            }
            return z;
        } finally {
            this.b.writeLock().unlock();
        }
    }
}
