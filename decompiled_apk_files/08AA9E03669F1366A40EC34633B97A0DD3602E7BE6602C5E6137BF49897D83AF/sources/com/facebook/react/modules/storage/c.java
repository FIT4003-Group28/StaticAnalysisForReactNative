package com.facebook.react.modules.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: ReactDatabaseSupplier.java */
/* loaded from: classes.dex */
public class c extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static c f3684a;

    /* renamed from: b  reason: collision with root package name */
    private Context f3685b;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f3686c;

    /* renamed from: d  reason: collision with root package name */
    private long f3687d;

    private c(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f3687d = 6291456L;
        this.f3685b = context;
    }

    public static c a(Context context) {
        if (f3684a == null) {
            f3684a = new c(context.getApplicationContext());
        }
        return f3684a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            e();
            onCreate(sQLiteDatabase);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a() {
        if (this.f3686c == null || !this.f3686c.isOpen()) {
            SQLiteException e = null;
            for (int i = 0; i < 2; i++) {
                if (i > 0) {
                    try {
                        e();
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            Thread.sleep(30L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                this.f3686c = getWritableDatabase();
            }
            if (this.f3686c == null) {
                throw e;
            }
            this.f3686c.setMaximumSize(this.f3687d);
            return true;
        }
        return true;
    }

    public synchronized SQLiteDatabase b() {
        a();
        return this.f3686c;
    }

    public synchronized void c() {
        try {
            d();
            f();
            com.facebook.common.e.a.a("ReactNative", "Cleaned RKStorage");
        } catch (Exception unused) {
            if (e()) {
                com.facebook.common.e.a.a("ReactNative", "Deleted Local Database RKStorage");
                return;
            }
            throw new RuntimeException("Clearing and deleting database RKStorage failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d() {
        b().delete("catalystLocalStorage", null, null);
    }

    private synchronized boolean e() {
        f();
        return this.f3685b.deleteDatabase("RKStorage");
    }

    private synchronized void f() {
        if (this.f3686c != null && this.f3686c.isOpen()) {
            this.f3686c.close();
            this.f3686c = null;
        }
    }
}
