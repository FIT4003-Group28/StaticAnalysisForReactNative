package defpackage;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
/* compiled from: PG */
/* renamed from: azol  reason: default package */
/* loaded from: classes.dex */
final class azol {
    private static final String a = "azol";
    private final azoi b;

    public azol(Application application, afec afecVar) {
        synchronized (azol.class) {
            this.b = new azoi(application, afecVar);
        }
    }

    public static boolean c(Cursor cursor) {
        try {
            return cursor.moveToNext();
        } catch (SQLiteException e) {
            throw new azom("Failed to move cursor", e);
        } catch (RuntimeException e2) {
            if ("android.database.CursorWindowAllocationException".equals(e2.getClass().getCanonicalName())) {
                throw new azom("Failed to allocate memory for database cursor", e2);
            }
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> T a(azok<T> azokVar) {
        T a2;
        synchronized (azol.class) {
            try {
                try {
                    SQLiteDatabase b = this.b.b();
                    b.beginTransaction();
                    try {
                        a2 = azokVar.a();
                        b.setTransactionSuccessful();
                        try {
                            b.endTransaction();
                        } catch (SQLiteException e) {
                            bvoo.f(e);
                        }
                    } catch (batj e2) {
                        throw e2;
                    } catch (Exception e3) {
                        throw new azom("Error occurred while applying transaction", e3);
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    bvoq.a();
                    throw new azom("Unable to begin database transaction", e);
                } catch (bvjv e5) {
                    e = e5;
                    bvoq.a();
                    throw new azom("Unable to begin database transaction", e);
                }
            } finally {
            }
        }
        return a2;
    }

    public final SQLiteDatabase b(boolean z) {
        synchronized (azol.class) {
            try {
                try {
                    if (z) {
                        return this.b.b();
                    }
                    return this.b.a();
                } catch (bvjv e) {
                    bvoq.a();
                    throw new azom("Failed to open database", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(azoj azojVar) {
        byte[] bS = azojVar.i.bS();
        ContentValues contentValues = new ContentValues();
        contentValues.put("corpus", Integer.valueOf(azojVar.a.k));
        contentValues.put("key_string", azojVar.b);
        contentValues.put("timestamp", Long.valueOf(azojVar.c));
        contentValues.put("merge_key", Long.valueOf(azojVar.d));
        Long l = azojVar.e;
        if (l != null) {
            contentValues.put("feature_fprint", l);
        }
        Integer num = azojVar.f;
        if (num != null) {
            contentValues.put("latitude", num);
        }
        Integer num2 = azojVar.g;
        if (num2 != null) {
            contentValues.put("longitude", num2);
        }
        contentValues.put("is_local", Boolean.valueOf(azojVar.h));
        contentValues.put("sync_item", bS);
        try {
            b(true).replaceOrThrow("sync_item", null, contentValues);
        } catch (SQLException e) {
            throw new azom("Failed to write to database", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e(dxby dxbyVar, boolean z) {
        return b(true).delete("sync_item", true != z ? "corpus = ?" : "corpus = ? AND is_local", new String[]{Integer.toString(dxbyVar.k)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(dxby dxbyVar, long j) {
        b(true).delete("sync_item", "corpus = ? AND merge_key = ?", new String[]{Integer.toString(dxbyVar.k), Long.toString(j)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(dxby dxbyVar, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("corpus", Integer.valueOf(dxbyVar.k));
        contentValues.put("last_sync_time", Long.valueOf(j));
        try {
            b(true).replaceOrThrow("sync_corpus", null, contentValues);
        } catch (SQLException e) {
            throw new azom("Failed to write to database", e);
        }
    }
}
