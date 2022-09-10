package defpackage;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aznn  reason: default package */
/* loaded from: classes.dex */
public final class aznn {
    public static final String[] a = {"rowid", "corpus", "client_id", "server_id", "timestamp", "feature_fprint", "latitude_e6", "longitude_e6", "sync_state", "item_proto", "numerical_index", "string_index"};
    private static final String b = "aznn";
    @dzsi
    private static aznk c;

    public aznn(Application application, afec afecVar) {
        a(application, afecVar);
    }

    static synchronized void a(Application application, afec afecVar) {
        synchronized (aznn.class) {
            if (c == null) {
                c = new aznk(application, afecVar);
            }
        }
    }

    public static SQLiteDatabase b(boolean z) {
        synchronized (aznn.class) {
            try {
                try {
                    if (z) {
                        aznk aznkVar = c;
                        dbsk.s(aznkVar);
                        return aznkVar.b();
                    }
                    aznk aznkVar2 = c;
                    dbsk.s(aznkVar2);
                    return aznkVar2.a();
                } catch (bvjv e) {
                    bvoq.a();
                    throw new azom("Failed to open database", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Cursor c(String str, String[] strArr, @dzsi String str2) {
        return b(false).query("sync_item_data", a, str, strArr, null, null, str2);
    }

    public static boolean d(Cursor cursor) {
        try {
            return cursor.moveToNext();
        } catch (SQLiteCantOpenDatabaseException e) {
            throw new azom("Failed to open database", e);
        } catch (RuntimeException e2) {
            if ("android.database.CursorWindowAllocationException".equals(e2.getClass().getCanonicalName())) {
                throw new azom("Failed to allocate memory for database cursor", e2);
            }
            throw e2;
        }
    }

    public static List<aznp> e(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (d(cursor)) {
            arrayList.add(f(cursor));
        }
        return arrayList;
    }

    public static aznp f(Cursor cursor) {
        try {
            azno aznoVar = new azno(azxm.a(cursor.getInt(1)).b(), cursor.getString(2), cursor.getBlob(9), aznl.a(cursor.getInt(8)));
            aznoVar.a = cursor.getLong(0);
            aznoVar.b = cursor.getString(3);
            aznoVar.c = cursor.getLong(4);
            String str = null;
            aznoVar.d = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
            Integer valueOf = cursor.isNull(6) ? null : Integer.valueOf(cursor.getInt(6));
            Integer valueOf2 = cursor.isNull(7) ? null : Integer.valueOf(cursor.getInt(7));
            aznoVar.e = valueOf;
            aznoVar.f = valueOf2;
            aznoVar.g = cursor.isNull(10) ? null : Long.valueOf(cursor.getLong(10));
            if (!cursor.isNull(11)) {
                str = cursor.getString(11);
            }
            aznoVar.h = str;
            return aznoVar.a();
        } catch (IllegalStateException e) {
            throw new azom("Failed to read row at cursor", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static final <T> T g(aznm<T> aznmVar) {
        T a2;
        synchronized (aznn.class) {
            try {
                try {
                    aznk aznkVar = c;
                    dbsk.s(aznkVar);
                    SQLiteDatabase b2 = aznkVar.b();
                    b2.beginTransaction();
                    try {
                        a2 = aznmVar.a();
                        b2.setTransactionSuccessful();
                        try {
                            b2.endTransaction();
                        } catch (SQLiteException e) {
                            bvoo.f(e);
                        }
                    } catch (Exception e2) {
                        throw new azom("Error occurred while applying transaction", e2);
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    bvoq.a();
                    throw new azom("Unable to begin database transaction", e);
                } catch (bvjv e4) {
                    e = e4;
                    bvoq.a();
                    throw new azom("Unable to begin database transaction", e);
                }
            } finally {
            }
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void h() {
        try {
            SQLiteDatabase b2 = b(true);
            b2.delete("sync_item_data", null, null);
            b2.delete("sync_corpus_metadata", null, null);
            b2.delete("sync_metadata", null, null);
        } catch (SQLiteCantOpenDatabaseException e) {
            throw new azom("Failed to open database", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean i(long j, boolean z) {
        String str;
        String l = Long.toString(j);
        String[] strArr = {l};
        if (z) {
            strArr = new String[]{l, Integer.toString(aznl.SYNCED.e)};
            str = "rowid = ? AND sync_state = ?";
        } else {
            str = "rowid = ?";
        }
        try {
            return b(true).delete("sync_item_data", str, strArr) == 1;
        } catch (SQLiteCantOpenDatabaseException e) {
            throw new azom("Failed to open database", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean j(azxl azxlVar, String str, boolean z) {
        String str2;
        String[] strArr = {Integer.toString(azxlVar.n), str};
        if (z) {
            String[] strArr2 = {strArr[0], str, Integer.toString(aznl.SYNCED.e)};
            str2 = "corpus = ? AND client_id = ? AND sync_state = ?";
            strArr = strArr2;
        } else {
            str2 = "corpus = ? AND client_id = ?";
        }
        try {
            return b(true).delete("sync_item_data", str2, strArr) == 1;
        } catch (SQLiteCantOpenDatabaseException e) {
            throw new azom("Failed to open database", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean k(azxl azxlVar, String str, boolean z) {
        String str2;
        String[] strArr = {Integer.toString(azxlVar.n), str};
        if (z) {
            String[] strArr2 = {strArr[0], str, Integer.toString(aznl.SYNCED.e)};
            str2 = "corpus = ? AND server_id = ? AND sync_state = ?";
            strArr = strArr2;
        } else {
            str2 = "corpus = ? AND server_id = ?";
        }
        try {
            return b(true).delete("sync_item_data", str2, strArr) == 1;
        } catch (SQLiteCantOpenDatabaseException e) {
            throw new azom("Failed to open database", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int l(azxl azxlVar, Long l, boolean z) {
        String str;
        dbsk.b(true, "NumericalIndex is null");
        String l2 = l.toString();
        String[] strArr = {Integer.toString(azxlVar.n), l2};
        if (z) {
            String[] strArr2 = {strArr[0], l2, Integer.toString(aznl.SYNCED.e)};
            str = "corpus = ? AND numerical_index = ? AND sync_state = ?";
            strArr = strArr2;
        } else {
            str = "corpus = ? AND numerical_index = ?";
        }
        try {
            return b(true).delete("sync_item_data", str, strArr);
        } catch (SQLiteCantOpenDatabaseException e) {
            throw new azom("Failed to open database", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int m(azxl azxlVar, String str, boolean z) {
        String str2;
        dbsk.b(true, "StringIndex is null");
        String[] strArr = {Integer.toString(azxlVar.n), str};
        if (z) {
            String[] strArr2 = {strArr[0], str, Integer.toString(aznl.SYNCED.e)};
            str2 = "corpus = ? AND string_index = ? AND sync_state = ?";
            strArr = strArr2;
        } else {
            str2 = "corpus = ? AND string_index = ?";
        }
        try {
            return b(true).delete("sync_item_data", str2, strArr);
        } catch (SQLiteCantOpenDatabaseException e) {
            throw new azom("Failed to open database", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int n(azxl azxlVar) {
        try {
            return b(true).delete("sync_item_data", "corpus = ? AND sync_state = ?", new String[]{Integer.toString(azxlVar.n), Integer.toString(aznl.SYNCED.e)});
        } catch (SQLiteCantOpenDatabaseException e) {
            throw new azom("Failed to open database", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final aznp o(long j) {
        aznp f;
        String[] strArr = {Long.toString(j)};
        synchronized (aznn.class) {
            Cursor c2 = c("rowid = ? ", strArr, null);
            if (d(c2)) {
                f = f(c2);
                if (c2 != null) {
                    c2.close();
                }
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Item for id=%d not found", Long.valueOf(j)));
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final aznp p(azxl azxlVar, String str) {
        aznp f;
        String[] strArr = {Integer.toString(azxlVar.n), str};
        synchronized (aznn.class) {
            Cursor c2 = c("corpus = ? AND client_id = ? ", strArr, null);
            if (d(c2)) {
                f = f(c2);
                if (c2 != null) {
                    c2.close();
                }
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Item for corpus=%s, clientId=%s not found", azxlVar.name(), str));
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final long q(aznp aznpVar) {
        SQLiteDatabase b2 = b(true);
        ContentValues contentValues = new ContentValues();
        contentValues.put("corpus", Integer.valueOf(aznpVar.b.n));
        contentValues.put("client_id", aznpVar.c);
        String str = aznpVar.g;
        if (str != null) {
            contentValues.put("server_id", str);
        }
        contentValues.put("timestamp", Long.valueOf(aznpVar.d));
        contentValues.put("sync_state", Integer.valueOf(aznpVar.e.e));
        Long l = aznpVar.h;
        if (l != null) {
            contentValues.put("feature_fprint", l);
        }
        Integer num = aznpVar.i;
        if (num != null) {
            contentValues.put("latitude_e6", num);
        }
        Integer num2 = aznpVar.j;
        if (num2 != null) {
            contentValues.put("longitude_e6", num2);
        }
        Long l2 = aznpVar.k;
        if (l2 != null) {
            contentValues.put("numerical_index", l2);
        }
        String str2 = aznpVar.l;
        if (str2 != null) {
            contentValues.put("string_index", str2);
        }
        contentValues.put("item_proto", aznpVar.f);
        return b2.replaceOrThrow("sync_item_data", null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean r(azxl azxlVar, String str) {
        String[] strArr = {Integer.toString(azxlVar.n), str};
        Cursor c2 = c("corpus = ? AND client_id = ?", strArr, null);
        try {
            if (!d(c2)) {
                if (c2 != null) {
                    c2.close();
                }
                return false;
            }
            if (c2 != null) {
                c2.close();
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("sync_state", Integer.valueOf(aznl.DELETE.e));
            return ((long) b(true).update("sync_item_data", contentValues, "corpus = ? AND client_id = ?", strArr)) == 1;
        } catch (Throwable th) {
            if (c2 != null) {
                try {
                    c2.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }
}
