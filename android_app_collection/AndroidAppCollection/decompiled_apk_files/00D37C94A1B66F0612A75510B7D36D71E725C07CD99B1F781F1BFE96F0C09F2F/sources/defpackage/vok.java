package defpackage;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
@Deprecated
/* renamed from: vok  reason: default package */
/* loaded from: classes4.dex */
public final class vok implements ComponentCallbacks2 {
    public static final amzy a = amzy.l("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper");
    public final Context b;
    public final ScheduledExecutorService c;
    public final voj d;
    public final ampq e;
    public final List f;
    public final List g;
    public final Executor j;
    public ankt k;
    public boolean n;
    public final afzp p;
    private final aniq q;
    private ScheduledFuture t;
    public final Set h = new HashSet();
    public final Object i = new Object();
    public final vod o = new vod(this);
    private final ankb r = new voe(this, 1);
    public int l = 0;
    private boolean s = false;
    public boolean m = false;

    @Deprecated
    public vok(Context context, ScheduledExecutorService scheduledExecutorService, voj vojVar, aniq aniqVar, vor vorVar) {
        this.q = aniqVar;
        this.c = scheduledExecutorService;
        this.d = vojVar;
        this.j = anlz.g(scheduledExecutorService);
        this.b = context;
        this.e = vorVar.a;
        this.f = vorVar.b;
        this.g = vorVar.c;
        this.p = vorVar.d;
    }

    public static anjd a(final ankt anktVar, Closeable... closeableArr) {
        anktVar.getClass();
        return new anjd(new vnz(closeableArr), anjk.a).c(new aniz() { // from class: vny
            @Override // defpackage.aniz
            public final anjd a(anjb anjbVar, Object obj) {
                Void r2 = (Void) obj;
                return anjd.b(ankt.this);
            }
        }, anjk.a);
    }

    public static SQLiteDatabase e(Context context, File file, afzp afzpVar, ampq ampqVar, List list, List list2) {
        SQLiteDatabase h = h(context, afzpVar, file);
        try {
            if (i(h, afzpVar, list, list2)) {
                h.close();
                h = h(context, afzpVar, file);
                try {
                    amlp l = amna.l("Configuring reopened database.");
                    try {
                        aqxo.z(!i(h, afzpVar, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                        l.close();
                    } catch (Throwable th) {
                        try {
                            l.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    h.close();
                    throw new vof("Failed to open database.", e);
                } catch (IllegalStateException e2) {
                    e = e2;
                    h.close();
                    throw new vof("Failed to open database.", e);
                } catch (Throwable th2) {
                    h.close();
                    throw th2;
                }
            }
            return h;
        } catch (SQLiteException e3) {
            h.close();
            throw new vof("Failed to open database.", e3);
        } catch (Throwable th3) {
            h.close();
            throw th3;
        }
    }

    public static boolean f(Context context, afzp afzpVar) {
        int i = afzpVar.b;
        return !((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    private static boolean g(SQLiteDatabase sQLiteDatabase, List list, List list2) {
        int version = sQLiteDatabase.getVersion();
        ((amzw) ((amzw) a.c()).i("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "upgradeDatabase", 736, "AsyncSQLiteOpenHelper.java")).r("Database version is %d", version);
        int i = ((amxx) list).c;
        aqxo.C(version <= i, "Can't downgrade from version %s to version %s", version, i);
        vox voxVar = new vox(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            try {
                try {
                    if (version != ((amxx) list).c) {
                        amlp l = amna.l("Applying upgrade steps");
                        try {
                            for (voq voqVar : ((amuk) list).subList(version, ((amxx) list).c)) {
                                voqVar.a(voxVar);
                            }
                            l.close();
                            sQLiteDatabase.setVersion(((amxx) list).c);
                        } catch (Throwable th) {
                            try {
                                l.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                    amzt listIterator = ((amuk) list2).listIterator();
                    if (listIterator.hasNext()) {
                        uyr uyrVar = (uyr) listIterator.next();
                        throw null;
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    return version != sQLiteDatabase.getVersion();
                } catch (SQLiteDiskIOException e) {
                    e = e;
                    throw new voi("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (Throwable th2) {
                    throw new voh(th2);
                }
            } catch (SQLiteDatabaseLockedException e2) {
                e = e2;
                throw new voi("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (SQLiteFullException e3) {
                e = e3;
                throw new voi("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (SQLiteOutOfMemoryException e4) {
                e = e4;
                throw new voi("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (SQLiteTableLockedException e5) {
                e = e5;
                throw new voi("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (InterruptedException e6) {
                throw new voi("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e6);
            }
        } catch (Throwable th3) {
            sQLiteDatabase.endTransaction();
            throw th3;
        }
    }

    private static SQLiteDatabase h(Context context, afzp afzpVar, File file) {
        boolean f = f(context, afzpVar);
        int i = f ? 805306368 : 268435456;
        file.getParentFile().mkdirs();
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, i, null);
            if (f) {
                openDatabase.enableWriteAheadLogging();
            }
            return openDatabase;
        } catch (Throwable th) {
            throw new vof("Failed to open database.", th);
        }
    }

    private static boolean i(SQLiteDatabase sQLiteDatabase, afzp afzpVar, List list, List list2) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        for (String str : afzpVar.a) {
            String valueOf = String.valueOf(str);
            sQLiteDatabase.execSQL(valueOf.length() != 0 ? "PRAGMA ".concat(valueOf) : new String("PRAGMA "));
        }
        return g(sQLiteDatabase, list, list2);
    }

    public final anjd b() {
        ankt anktVar;
        ankt p;
        WeakHashMap weakHashMap = amna.a;
        amlp amlpVar = null;
        try {
            synchronized (this.i) {
                int i = this.l + 1;
                this.l = i;
                if (this.k == null) {
                    aqxo.z(i == 1, "DB was null with nonzero refcount");
                    amlpVar = amna.l("Opening database");
                    try {
                        ankt v = anlz.v(this.q, this.j);
                        anlz.A(v, this.r, this.c);
                        p = anii.h(v, ammo.a(new ampg() { // from class: vnw
                            @Override // defpackage.ampg
                            public final Object apply(Object obj) {
                                SQLiteDatabase e;
                                vok vokVar = vok.this;
                                File databasePath = vokVar.b.getDatabasePath((String) obj);
                                if (!vokVar.m) {
                                    voj vojVar = vokVar.d;
                                    String path = databasePath.getPath();
                                    if (vojVar.a.add(path)) {
                                        vokVar.m = true;
                                        boolean f = vok.f(vokVar.b, vokVar.p);
                                        vokVar.n = f;
                                        if (f) {
                                            try {
                                                vokVar.n = databasePath.getCanonicalPath().startsWith(vokVar.b.getCacheDir().getCanonicalPath());
                                            } catch (IOException unused) {
                                            }
                                        }
                                    } else {
                                        StringBuilder sb = new StringBuilder(String.valueOf(path).length() + 89);
                                        sb.append("DB ");
                                        sb.append(path);
                                        sb.append(" opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?");
                                        throw new IllegalStateException(sb.toString());
                                    }
                                }
                                Set set = vokVar.h;
                                if (!set.isEmpty()) {
                                    Iterator it = set.iterator();
                                    while (it.hasNext()) {
                                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((WeakReference) it.next()).get();
                                        if (sQLiteDatabase != null) {
                                            if (sQLiteDatabase.isOpen()) {
                                                String path2 = sQLiteDatabase.getPath();
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(path2).length() + 103);
                                                sb2.append("Open database reference to ");
                                                sb2.append(path2);
                                                sb2.append(" already exists. Follow instructions in source to file a bug against TikTok.");
                                                throw new IllegalStateException(sb2.toString());
                                            }
                                        } else {
                                            it.remove();
                                        }
                                    }
                                }
                                try {
                                    try {
                                        e = vok.e(vokVar.b, databasePath, vokVar.p, vokVar.e, vokVar.f, vokVar.g);
                                    } catch (vof | voh | voi unused2) {
                                        e = vok.e(vokVar.b, databasePath, vokVar.p, vokVar.e, vokVar.f, vokVar.g);
                                    }
                                    vokVar.h.add(new WeakReference(e));
                                    vokVar.b.registerComponentCallbacks(vokVar);
                                    return e;
                                } catch (voh e2) {
                                    ((amzw) ((amzw) ((amzw) vok.a.f()).h(e2)).i("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "lambda$innerOpenDatabase$4", (char) 437, "AsyncSQLiteOpenHelper.java")).q("Fatal Exception when trying to upgrade database. Proceeding to delete.");
                                    try {
                                        File file = new File(String.valueOf(databasePath.getPath()).concat("-wal"));
                                        File file2 = new File(String.valueOf(databasePath.getPath()).concat("-journal"));
                                        File file3 = new File(String.valueOf(databasePath.getPath()).concat("-shm"));
                                        if ((!file.exists() || file.delete()) && ((!file2.exists() || file2.delete()) && ((!file3.exists() || file3.delete()) && databasePath.delete()))) {
                                            throw new vof("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", e2);
                                        }
                                        throw new vog(String.format("Unable to clean up database %s", databasePath.getAbsolutePath()));
                                    } catch (Throwable th) {
                                        throw new vof("Recovery by deletion failed.", th);
                                    }
                                } catch (voi e3) {
                                    throw new vof("Probably-recoverable database upgrade failure.", e3);
                                }
                            }
                        }), this.j);
                    } catch (Exception e) {
                        p = anlz.p(e);
                    }
                    this.k = p;
                }
                anktVar = this.k;
                ScheduledFuture scheduledFuture = this.t;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
            }
            ankt r = anlz.r(anktVar);
            if (amlpVar != null) {
                amlpVar.a(r);
            }
            return a(r, new Closeable() { // from class: vob
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    vok vokVar = vok.this;
                    synchronized (vokVar.i) {
                        int i2 = vokVar.l;
                        aqxo.A(i2 > 0, "Refcount went negative!", i2);
                        vokVar.l--;
                        vokVar.c();
                    }
                }
            }).c(ammo.d(new aniz() { // from class: vnx
                @Override // defpackage.aniz
                public final anjd a(anjb anjbVar, Object obj) {
                    final vnv vnvVar;
                    vok vokVar = vok.this;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                    Executor executor = vokVar.j;
                    if (!sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                        vnvVar = new vnv(sQLiteDatabase, executor, executor, vokVar.o);
                    } else {
                        vnvVar = new vnv(sQLiteDatabase, vokVar.c, executor, vokVar.o);
                    }
                    return vok.a(anlz.q(vnvVar), new Closeable() { // from class: voa
                        @Override // java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                            vnv.this.d = true;
                        }
                    });
                }
            }), anjk.a);
        } finally {
            if (amlpVar != null) {
                amlpVar.close();
            }
        }
    }

    public final void c() {
        if (this.l != 0 || this.k == null) {
            return;
        }
        if (this.s) {
            d();
            return;
        }
        this.t = this.c.schedule(new voc(this, 1), 60L, TimeUnit.SECONDS);
        if (this.n) {
            return;
        }
        anlz.A(this.k, new voe(this), this.j);
    }

    public final void d() {
        this.j.execute(new voc(this));
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        synchronized (this.i) {
            this.s = i >= 40;
            c();
        }
    }
}
