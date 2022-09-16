package defpackage;

import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: ymo  reason: default package */
/* loaded from: classes4.dex */
public final class ymo implements ymu {
    private final String a;
    private final /* synthetic */ int b;

    public ymo(int i) {
        this.b = i;
        this.a = "ScheduledTaskProto";
    }

    public ymo(String str) {
        this.a = str;
    }

    @Override // defpackage.ymu
    public final void a(SQLiteDatabase sQLiteDatabase) {
        if (this.b == 0) {
            String str = this.a;
            StringBuilder sb = new StringBuilder(str.length() + 127);
            sb.append("CREATE TABLE ");
            sb.append(str);
            sb.append(" (insertionOrder INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT KEY,value BLOB NOT NULL,sortingValue INTEGER NOT NULL)");
            sQLiteDatabase.execSQL(sb.toString());
            return;
        }
        String str2 = this.a;
        sQLiteDatabase.execSQL(str2.length() != 0 ? "DROP TABLE IF EXISTS ".concat(str2) : new String("DROP TABLE IF EXISTS "));
    }
}
