package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aglb  reason: default package */
/* loaded from: classes.dex */
public final class aglb {
    public final agli a;
    public final List b = new ArrayList();
    private final azqb c;

    public aglb(agli agliVar, azqb azqbVar) {
        this.a = agliVar;
        this.c = azqbVar;
    }

    public static ContentValues a(agqa agqaVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", agqaVar.a);
        contentValues.put("offline_channel_data_proto", agqaVar.d.toByteArray());
        return contentValues;
    }

    public static final void e(SQLiteDatabase sQLiteDatabase) {
        try {
            if (!sQLiteDatabase.inTransaction()) {
                return;
            }
            sQLiteDatabase.endTransaction();
        } catch (SQLiteException e) {
            zep.n("Error while terminating OfflineChannels db transaction", e);
        }
    }

    public final agqa b(String str) {
        Cursor query = this.a.a().query("channelsV13", agla.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                return agks.a(query, (agpj) this.c.get(), query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("offline_channel_data_proto"));
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final void c(agqa agqaVar) {
        this.a.a().insertOrThrow("channelsV13", null, a(agqaVar));
    }

    public final void d(agqa agqaVar) {
        long update = this.a.a().update("channelsV13", a(agqaVar), "id = ?", new String[]{agqaVar.a});
        if (update == 1) {
            return;
        }
        StringBuilder sb = new StringBuilder(49);
        sb.append("Update channel affected ");
        sb.append(update);
        sb.append(" rows");
        throw new SQLException(sb.toString());
    }
}
