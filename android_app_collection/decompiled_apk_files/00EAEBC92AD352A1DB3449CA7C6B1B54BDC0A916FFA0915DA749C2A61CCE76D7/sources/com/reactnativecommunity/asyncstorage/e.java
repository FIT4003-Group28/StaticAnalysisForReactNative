package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
/* loaded from: classes.dex */
public class e extends SQLiteOpenHelper {

    /* renamed from: e  reason: collision with root package name */
    private static e f9757e;

    /* renamed from: b  reason: collision with root package name */
    private Context f9758b;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f9759c;

    /* renamed from: d  reason: collision with root package name */
    private long f9760d;

    private e(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f9760d = d.f9756a.longValue() * 1024 * 1024;
        this.f9758b = context;
    }

    public static e a(Context context) {
        if (f9757e == null) {
            f9757e = new e(context.getApplicationContext());
        }
        return f9757e;
    }

    private synchronized void e() {
        if (this.f9759c != null && this.f9759c.isOpen()) {
            this.f9759c.close();
            this.f9759c = null;
        }
    }

    private synchronized boolean f() {
        e();
        return this.f9758b.deleteDatabase("RKStorage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        d().delete("catalystLocalStorage", null, null);
    }

    public synchronized void b() {
        try {
            a();
            e();
            c.d.d.e.a.a("ReactNative", "Cleaned RKStorage");
        } catch (Exception unused) {
            if (!f()) {
                throw new RuntimeException("Clearing and deleting database RKStorage failed");
            }
            c.d.d.e.a.a("ReactNative", "Deleted Local Database RKStorage");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean c() {
        if (this.f9759c == null || !this.f9759c.isOpen()) {
            SQLiteException e2 = null;
            for (int i = 0; i < 2; i++) {
                if (i > 0) {
                    try {
                        f();
                    } catch (SQLiteException e3) {
                        e2 = e3;
                        try {
                            Thread.sleep(30L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                this.f9759c = getWritableDatabase();
            }
            if (this.f9759c == null) {
                throw e2;
            }
            this.f9759c.setMaximumSize(this.f9760d);
            return true;
        }
        return true;
    }

    public synchronized SQLiteDatabase d() {
        c();
        return this.f9759c;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            f();
            onCreate(sQLiteDatabase);
        }
    }
}
