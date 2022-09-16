package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: agxj  reason: default package */
/* loaded from: classes.dex */
public final class agxj implements agxr {
    private static final String[] b = {"file_path", "status", "status_reason", "bytes_transferred", "bytes_total", "extras", "output_extras", "accountname", "priority", "failure_count"};
    SQLiteDatabase a;
    private final Context c;
    private final Object d;

    public agxj(Context context) {
        Object obj = new Object();
        this.c = context;
        this.d = obj;
    }

    private static agxe h(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("file_path");
        int columnIndex2 = cursor.getColumnIndex("status");
        int columnIndex3 = cursor.getColumnIndex("status_reason");
        int columnIndex4 = cursor.getColumnIndex("bytes_transferred");
        int columnIndex5 = cursor.getColumnIndex("bytes_total");
        int columnIndex6 = cursor.getColumnIndex("extras");
        int columnIndex7 = cursor.getColumnIndex("output_extras");
        int columnIndex8 = cursor.getColumnIndex("accountname");
        int columnIndex9 = cursor.getColumnIndex("priority");
        int columnIndex10 = cursor.getColumnIndex("failure_count");
        String string = cursor.getString(columnIndex);
        int i = new int[]{1, 2, 3, 4, 5}[cursor.getInt(columnIndex2)];
        int i2 = cursor.getInt(columnIndex3);
        long j = cursor.getLong(columnIndex4);
        long j2 = cursor.getLong(columnIndex5);
        agqy agqyVar = new agqy(cursor.getBlob(columnIndex6));
        agqy agqyVar2 = new agqy(cursor.getBlob(columnIndex7));
        agxe agxeVar = new agxe(cursor.getString(columnIndex8), string, cursor.getInt(columnIndex9), agqyVar, cursor.getInt(columnIndex10));
        int i3 = i - 1;
        avkl avklVar = avkl.TRANSFER_STATE_UNKNOWN;
        if (i != 0) {
            agxeVar.j = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? avkl.TRANSFER_STATE_UNKNOWN : avkl.TRANSFER_STATE_PAUSED_BY_USER : avkl.TRANSFER_STATE_FAILED : avkl.TRANSFER_STATE_COMPLETE : avkl.TRANSFER_STATE_TRANSFERRING : avkl.TRANSFER_STATE_TRANSFER_IN_QUEUE;
            agxeVar.b = i2;
            agxeVar.d = j2;
            agxeVar.c = j;
            agxeVar.f = agqyVar2;
            return agxeVar;
        }
        throw null;
    }

    private static void i() {
        zep.d("[Offline] Attempting to access closed or null database.", new NullPointerException());
    }

    private static final ContentValues j(agxe agxeVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("file_path", agxeVar.a);
        avkl avklVar = agxeVar.j;
        avkl avklVar2 = avkl.TRANSFER_STATE_UNKNOWN;
        int ordinal = avklVar.ordinal();
        int i = 5;
        if (ordinal == 3) {
            i = 2;
        } else if (ordinal != 4) {
            i = ordinal != 5 ? ordinal != 6 ? 1 : 3 : 4;
        }
        contentValues.put("status", Integer.valueOf(i - 1));
        contentValues.put("status_reason", Integer.valueOf(agxeVar.b));
        contentValues.put("bytes_transferred", Long.valueOf(agxeVar.c));
        contentValues.put("bytes_total", Long.valueOf(agxeVar.d));
        contentValues.put("extras", ((agqy) agxeVar.e).d());
        agpw agpwVar = agxeVar.f;
        if (agpwVar instanceof agqy) {
            contentValues.put("output_extras", ((agqy) agpwVar).d());
        }
        contentValues.put("accountname", agxeVar.g);
        contentValues.put("priority", Integer.valueOf(agxeVar.h));
        contentValues.put("failure_count", Integer.valueOf(agxeVar.i));
        return contentValues;
    }

    @Override // defpackage.agxr
    public final ampq a(String str) {
        agxe h;
        if (this.a == null) {
            i();
            return amon.a;
        }
        synchronized (this.d) {
            Cursor query = this.a.query("transfers", b, "file_path=?", new String[]{str}, null, null, null);
            h = query.moveToNext() ? h(query) : null;
            query.close();
        }
        return ampq.i(h);
    }

    @Override // defpackage.agxr
    public final List b(afvm afvmVar) {
        String d = afvmVar.d();
        ArrayList arrayList = new ArrayList();
        if (this.a == null) {
            i();
            return arrayList;
        }
        synchronized (this.d) {
            Cursor query = this.a.query("transfers", b, "accountname=?", new String[]{d}, null, null, null);
            while (query.moveToNext()) {
                arrayList.add(h(query));
            }
            query.close();
        }
        return arrayList;
    }

    @Override // defpackage.agxr
    public final void d() {
        boolean z;
        synchronized (this.d) {
            synchronized (this.d) {
                SQLiteDatabase sQLiteDatabase = this.a;
                z = false;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    z = true;
                }
            }
            if (!z) {
                this.a = new agxi(this.c).getWritableDatabase();
            }
        }
    }

    @Override // defpackage.agxr
    public final void e(agxe agxeVar) {
        f(agxeVar.a);
    }

    @Override // defpackage.agxr
    public final void c(agxe agxeVar) {
        synchronized (this.d) {
            SQLiteDatabase sQLiteDatabase = this.a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.insert("transfers", null, j(agxeVar));
            } else {
                i();
            }
        }
    }

    @Override // defpackage.agxr
    public final void f(String str) {
        synchronized (this.d) {
            SQLiteDatabase sQLiteDatabase = this.a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.delete("transfers", "file_path = ?", new String[]{str});
            } else {
                i();
            }
        }
    }

    @Override // defpackage.agxr
    public final void g(agxe agxeVar) {
        synchronized (this.d) {
            SQLiteDatabase sQLiteDatabase = this.a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.update("transfers", j(agxeVar), "file_path = ?", new String[]{agxeVar.a});
            } else {
                i();
            }
        }
    }
}
