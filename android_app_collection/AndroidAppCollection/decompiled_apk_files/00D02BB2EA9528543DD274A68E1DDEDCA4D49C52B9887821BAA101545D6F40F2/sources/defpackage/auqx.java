package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: auqx  reason: default package */
/* loaded from: classes2.dex */
final class auqx extends bvjw {
    public auqx(Context context, afec afecVar) {
        super(context, afecVar, "inbox_notifications.db", 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table inboxNotifications(id text not null PRIMARY KEY, system_tray_id text not null, account_id text not null, read_state integer not null, timestamp_ms bigint not null, proto blob not null)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 > i) {
            dcdn<Integer, dcep<String>> dcdnVar = auqy.a;
            Integer valueOf = Integer.valueOf(i2);
            dcep<String> dcepVar = dcdnVar.get(valueOf);
            dcep<String> dcepVar2 = auqy.a.get(Integer.valueOf(i));
            if (dcepVar2 == null) {
                throw new RuntimeException(String.format("Missing documented columns for old database version %s, please add the old columns to DATABASE_COLUMN_BY_VERSION", valueOf));
            }
            if (dcepVar == null) {
                throw new RuntimeException(String.format("Missing documented columns for new database version %s, please add the new columns to DATABASE_COLUMN_BY_VERSION", valueOf));
            }
            dcen N = dcep.N();
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(inboxNotifications)", null);
            while (rawQuery != null && rawQuery.moveToNext()) {
                N.b(rawQuery.getString(rawQuery.getColumnIndex("name")));
            }
            rawQuery.close();
            dcep f = N.f();
            dcpd it = ((dcng) dcnm.p(dcepVar, dcepVar2)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!f.contains(str)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
                    sb.append("ALTER TABLE inboxNotifications ADD ");
                    sb.append(str);
                    sb.append(" TEXT");
                    sQLiteDatabase.execSQL(sb.toString());
                }
            }
        }
    }
}
