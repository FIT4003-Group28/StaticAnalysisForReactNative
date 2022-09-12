package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cjvv  reason: default package */
/* loaded from: classes.dex */
public final class cjvv {
    public static final String[] a = {"_id", "user_account_id", "ue3", "timestamp"};
    public final bvjw b;
    public final cqat c;
    public volatile boolean d = false;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public cjvv(Context context, cqat cqatVar, afec afecVar) {
        this.c = cqatVar;
        this.b = new cjvt(context, afecVar);
    }

    public static String b(@dzsi btlu btluVar) {
        if (btlu.p(btluVar)) {
            return "";
        }
        dbsk.s(btluVar);
        return btluVar.d;
    }

    public static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table userevent3_table(_id integer primary key autoincrement, user_account_id text not null, ue3 blob not null, timestamp bigint not null); ");
        sQLiteDatabase.execSQL("create index account_timestamp_idx on userevent3_table(user_account_id, timestamp);");
    }

    public static void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS userevent3_table;");
        c(sQLiteDatabase);
    }

    public final dcdc<cjvu> a(dbrn<SQLiteDatabase, Cursor> dbrnVar) {
        SQLiteDatabase b;
        Cursor a2;
        int count;
        ArrayList arrayList;
        cjtz cjtzVar;
        if (this.d) {
            return dcdc.e();
        }
        dccx F = dcdc.F();
        try {
            b = this.b.b();
            b.beginTransaction();
            a2 = dbrnVar.a(b);
            count = a2.getCount();
            arrayList = new ArrayList(count);
        } catch (Exception e) {
            this.d = true;
            bvoo.j(e);
        }
        if (count == 0) {
            b.setTransactionSuccessful();
            dcdc<cjvu> f = F.f();
            if (a2 != null) {
                a2.close();
            }
            b.endTransaction();
            return f;
        }
        a2.moveToFirst();
        for (long j = 0; j < count; j++) {
            int i = a2.getInt(a2.getColumnIndex("_id"));
            String string = a2.getString(a2.getColumnIndex("user_account_id"));
            byte[] blob = a2.getBlob(a2.getColumnIndex("ue3"));
            long j2 = a2.getLong(a2.getColumnIndex("timestamp"));
            dwun dwunVar = (dwun) bvrs.b(blob, (dssr) dwun.w.cu(7));
            if (dwunVar != null) {
                cjtzVar = new cjtz(this.c, dwunVar, this.c.b() - j2);
                if (!dwunVar.d.isEmpty()) {
                    cjtzVar.n(dwunVar.d);
                }
            } else {
                dchl.b("message=gmm.UserEvent3");
                cjtzVar = null;
            }
            dbsg j3 = dbsg.j(cjtzVar);
            arrayList.add(Integer.toString(i));
            if (j3.a()) {
                F.g(new cjvo(string, (cjtk) j3.b()));
            }
            a2.moveToNext();
        }
        StringBuilder sb = new StringBuilder("_id = ? ");
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            sb.append(" OR _id = ? ");
        }
        b.delete("userevent3_table", sb.toString(), (String[]) arrayList.toArray(new String[0]));
        b.setTransactionSuccessful();
        if (a2 != null) {
            a2.close();
        }
        b.endTransaction();
        return F.f();
    }
}
