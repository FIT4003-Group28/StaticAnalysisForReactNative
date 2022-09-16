package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
/* compiled from: PG */
/* renamed from: vox  reason: default package */
/* loaded from: classes4.dex */
public final class vox {
    final CancellationSignal a = new CancellationSignal();
    public final SQLiteDatabase b;

    public vox(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    public static void c() {
        if (!Thread.interrupted()) {
            return;
        }
        throw new InterruptedException();
    }

    public final Cursor a(vot votVar) {
        c();
        String valueOf = String.valueOf(votVar.a);
        amlp l = amna.l(valueOf.length() != 0 ? "Query: ".concat(valueOf) : new String("Query: "));
        try {
            Cursor rawQueryWithFactory = this.b.rawQueryWithFactory(new vov(votVar.b), votVar.a, null, null, this.a);
            l.close();
            return rawQueryWithFactory;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @SafeVarargs
    public final Cursor b(String str, String... strArr) {
        c();
        amlp l = amna.l(str.length() != 0 ? "Query: ".concat(str) : new String("Query: "));
        try {
            Cursor rawQuery = this.b.rawQuery(str, strArr, this.a);
            l.close();
            return rawQuery;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void d(vot votVar) {
        c();
        String valueOf = String.valueOf(votVar.a);
        amlp l = amna.l(valueOf.length() != 0 ? "execSQL: ".concat(valueOf) : new String("execSQL: "));
        try {
            this.b.execSQL(votVar.a, votVar.b);
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @SafeVarargs
    public final void e(String str, String... strArr) {
        c();
        amlp l = amna.l(str.length() != 0 ? "execSQL: ".concat(str) : new String("execSQL: "));
        try {
            this.b.execSQL(str, strArr);
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final long f(String str, ContentValues contentValues) {
        c();
        amlp l = amna.l(str.length() != 0 ? "INSERT WITH ON CONFLICT ".concat(str) : new String("INSERT WITH ON CONFLICT "));
        try {
            long insertWithOnConflict = this.b.insertWithOnConflict(str, null, contentValues, 5);
            l.close();
            return insertWithOnConflict;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
