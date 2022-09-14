package defpackage;

import android.database.sqlite.SQLiteDatabase;
/* renamed from: clhy  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class clhy implements clia {
    static final clia a = new clhy();

    private clhy() {
    }

    @Override // defpackage.clia
    public final void a(SQLiteDatabase sQLiteDatabase) {
        int i = clib.b;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
