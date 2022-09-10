package defpackage;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bokp  reason: default package */
/* loaded from: classes3.dex */
public final class bokp {
    public static final String[] a = {"feature_id", "edit"};
    private final Context b;
    private final cqat c;
    private final afec d;
    @dzsi
    private boko e;

    public bokp(Application application, cqat cqatVar, afec afecVar) {
        this.b = application;
        this.c = cqatVar;
        this.d = afecVar;
    }

    public static void f(Cursor cursor, List<dlfh> list) {
        cursor.getString(0);
        dlfh dlfhVar = (dlfh) bvrs.b(cursor.getBlob(1), (dssr) dlfh.q.cu(7));
        if (dlfhVar != null) {
            list.add(dlfhVar);
        } else {
            dchl.b("message=gmm.EditPublishedNotificationClientData");
        }
    }

    public final synchronized void a() {
        boko bokoVar = this.e;
        if (bokoVar != null) {
            bokoVar.close();
        }
    }

    public final synchronized void b(@dzsi String str, dlfh dlfhVar) {
        bvrj.UI_THREAD.d();
        String e = dbsj.e(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_id", e);
        contentValues.put("feature_id", dlfhVar.a);
        contentValues.put("seen", (Boolean) false);
        contentValues.put("created_at", Long.valueOf(this.c.b()));
        contentValues.put("edit", dlfhVar.bS());
        try {
            d().b().insert("edits", null, contentValues);
        } catch (bvjv unused) {
        }
    }

    public final void c(@dzsi String str, List<String> list) {
        bvrj.UI_THREAD.d();
        String e = dbsj.e(str);
        try {
            SQLiteDatabase a2 = d().a();
            try {
                a2.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put("seen", (Boolean) true);
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    a2.update("edits", contentValues, "account_id = ? AND feature_id = ?", new String[]{e, it.next()});
                }
                a2.setTransactionSuccessful();
            } finally {
                a2.endTransaction();
            }
        } catch (bvjv unused) {
        }
    }

    public final synchronized boko d() {
        if (this.e == null) {
            this.e = new boko(this.b, this.d);
        }
        return this.e;
    }

    @dzsi
    public final dlfh e(String str) {
        bvrj.UI_THREAD.d();
        Cursor cursor = null;
        String e = dbsj.e(null);
        try {
            SQLiteDatabase a2 = d().a();
            ArrayList arrayList = new ArrayList();
            try {
                Cursor query = a2.query("edits", a, "feature_id = ? AND account_id = ? ", new String[]{str, e}, null, null, "created_at");
                while (query.moveToNext()) {
                    try {
                        f(query, arrayList);
                    } catch (Throwable th) {
                        cursor = query;
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return (dlfh) arrayList.get(0);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (bvjv unused) {
            return null;
        }
    }
}
