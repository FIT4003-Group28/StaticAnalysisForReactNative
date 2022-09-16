package com.facebook.react.modules.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
/* loaded from: classes.dex */
public class c extends SQLiteOpenHelper {

    /* renamed from: e  reason: collision with root package name */
    private static c f5772e;

    /* renamed from: b  reason: collision with root package name */
    private Context f5773b;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f5774c;

    /* renamed from: d  reason: collision with root package name */
    private long f5775d;

    private c(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f5775d = 6291456L;
        this.f5773b = context;
    }

    public static c a(Context context) {
        if (f5772e == null) {
            f5772e = new c(context.getApplicationContext());
        }
        return f5772e;
    }

    private synchronized void e() {
        if (this.f5774c != null && this.f5774c.isOpen()) {
            this.f5774c.close();
            this.f5774c = null;
        }
    }

    private synchronized boolean f() {
        e();
        return this.f5773b.deleteDatabase("RKStorage");
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
        if (this.f5774c == null || !this.f5774c.isOpen()) {
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
                this.f5774c = getWritableDatabase();
            }
            if (this.f5774c == null) {
                throw e2;
            }
            this.f5774c.setMaximumSize(this.f5775d);
            return true;
        }
        return true;
    }

    public synchronized SQLiteDatabase d() {
        c();
        return this.f5774c;
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
