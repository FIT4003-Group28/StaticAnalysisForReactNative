package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import java.io.File;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ymp  reason: default package */
/* loaded from: classes4.dex */
public abstract class ymp implements ymt {
    public final ymq a;
    public final String b;

    public ymp(ymq ymqVar, String str) {
        ymqVar.getClass();
        this.a = ymqVar;
        this.b = str;
    }

    private final Cursor o() {
        String str;
        Cursor query = this.a.getReadableDatabase().query(this.b, new String[]{"value", "key"}, null, null, null, null, "sortingValue ASC, insertionOrder ASC");
        try {
            query.getCount();
            return query;
        } catch (SQLException e) {
            ymq ymqVar = this.a;
            String str2 = "";
            if (ymqVar instanceof ymv) {
                ymv ymvVar = (ymv) ymqVar;
                str2 = ymvVar.getDatabaseName();
                File databasePath = ymvVar.b.getDatabasePath(ymvVar.getDatabaseName());
                if (databasePath == null) {
                    str = " is null";
                } else if (databasePath.exists()) {
                    str = !databasePath.canRead() ? String.format("%s is not readable", databasePath.getAbsolutePath()) : String.format("%s is readable", databasePath.getAbsolutePath());
                } else {
                    str = String.format("%s doesn't exist", databasePath.getAbsolutePath());
                }
            } else {
                str = str2;
            }
            throw new ymn(String.format(Locale.US, "%s trying to access db %s: %s", e.toString(), str2, str));
        }
    }

    protected abstract long a(Object obj);

    @Override // defpackage.ymt
    public final yms b() {
        Cursor cursor;
        ylr.b();
        try {
            cursor = o();
        } catch (IllegalStateException e) {
            zep.d("Failed to read values from database.", e);
            cursor = null;
        }
        return new yml(this, cursor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object c(byte[] bArr);

    @Override // defpackage.ymt
    public final void d() {
        e(true);
    }

    public final void e(boolean z) {
        if (z) {
            ylr.b();
        }
        this.a.getWritableDatabase().beginTransaction();
    }

    @Override // defpackage.ymt
    public final void f() {
        g(true);
    }

    public final void g(boolean z) {
        if (z) {
            ylr.b();
        }
        this.a.getWritableDatabase().endTransaction();
    }

    public final void h(ymm ymmVar, boolean z) {
        Object obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", ymmVar.a);
        contentValues.put("value", m(ymmVar.b));
        contentValues.put("sortingValue", Long.valueOf(a(ymmVar.b)));
        String str = ymmVar.a;
        if (z) {
            ylr.b();
        }
        Cursor query = this.a.getReadableDatabase().query(this.b, new String[]{"value"}, "key=?", new String[]{str}, null, null, null, null);
        if (query.moveToNext()) {
            obj = c(query.getBlob(0));
            query.close();
        } else {
            query.close();
            obj = null;
        }
        if (obj == null) {
            this.a.getWritableDatabase().insert(this.b, null, contentValues);
        } else {
            this.a.getWritableDatabase().update(this.b, contentValues, "key = ?", new String[]{ymmVar.a});
        }
    }

    @Override // defpackage.ymt
    public final void i() {
        j(true);
    }

    public final void j(boolean z) {
        if (z) {
            ylr.b();
        }
        this.a.getWritableDatabase().setTransactionSuccessful();
    }

    public final void k(ymm ymmVar, boolean z) {
        if (z) {
            ylr.b();
        }
        e(z);
        try {
            h(ymmVar, z);
            j(z);
        } finally {
            g(z);
        }
    }

    @Override // defpackage.ymt
    public final void l(String str, Object obj) {
        k(ymm.a(str, obj), true);
    }

    protected abstract byte[] m(Object obj);

    @Override // defpackage.ymt
    public final void n(String str) {
        ylr.b();
        this.a.getWritableDatabase().delete(this.b, "key = ?", new String[]{str});
    }
}
