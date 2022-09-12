package defpackage;

import android.database.sqlite.SQLiteDatabase;
/* renamed from: clhz  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class clhz implements clia {
    static final clia a = new clhz();

    private clhz() {
    }

    @Override // defpackage.clia
    public final void a(SQLiteDatabase sQLiteDatabase) {
        int i = clib.b;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }
}
