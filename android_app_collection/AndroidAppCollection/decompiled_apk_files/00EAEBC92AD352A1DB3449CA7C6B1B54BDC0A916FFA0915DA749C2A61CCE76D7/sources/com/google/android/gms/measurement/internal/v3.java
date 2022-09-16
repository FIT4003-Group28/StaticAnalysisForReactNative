package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class v3 extends f5 {

    /* renamed from: c  reason: collision with root package name */
    private final y3 f7734c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7735d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v3(d5 d5Var) {
        super(d5Var);
        this.f7734c = new y3(this, d(), "google_app_measurement_local.db");
    }

    private final SQLiteDatabase E() {
        if (this.f7735d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f7734c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f7735d = true;
        return null;
    }

    private final boolean F() {
        return d().getDatabasePath("google_app_measurement_local.db").exists();
    }

    private static long a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                return cursor.getLong(0);
            }
            if (cursor == null) {
                return -1L;
            }
            cursor.close();
            return -1L;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean a(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v3.a(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean A() {
        return false;
    }

    public final void B() {
        e();
        g();
        try {
            int delete = E().delete("messages", null, null) + 0;
            if (delete <= 0) {
                return;
            }
            c().B().a("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e2) {
            c().s().a("Error resetting local analytics data. error", e2);
        }
    }

    public final boolean C() {
        return a(3, new byte[0]);
    }

    public final boolean D() {
        g();
        e();
        if (!this.f7735d && F()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase E = E();
                        if (E == null) {
                            this.f7735d = true;
                            if (E != null) {
                                E.close();
                            }
                            return false;
                        }
                        E.beginTransaction();
                        E.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        E.setTransactionSuccessful();
                        E.endTransaction();
                        if (E != null) {
                            E.close();
                        }
                        return true;
                    } catch (SQLiteException e2) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        c().s().a("Error deleting app launch break from local database", e2);
                        this.f7735d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e3) {
                    c().s().a("Error deleting app launch break from local database", e3);
                    this.f7735d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            c().v().a("Error deleting app launch break from local database in reasonable time");
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.common.internal.x.a> a(int r22) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v3.a(int):java.util.List");
    }

    public final boolean a(oa oaVar) {
        j();
        byte[] a2 = z9.a((Parcelable) oaVar);
        if (a2.length > 131072) {
            c().t().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return a(2, a2);
    }

    public final boolean a(p pVar) {
        Parcel obtain = Parcel.obtain();
        pVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            c().t().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return a(0, marshall);
    }

    public final boolean a(y9 y9Var) {
        Parcel obtain = Parcel.obtain();
        y9Var.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            c().t().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return a(1, marshall);
    }
}
