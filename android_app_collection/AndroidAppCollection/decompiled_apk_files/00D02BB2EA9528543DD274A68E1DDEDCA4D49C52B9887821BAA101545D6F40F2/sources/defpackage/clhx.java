package defpackage;

import android.database.sqlite.SQLiteDatabase;
/* renamed from: clhx  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class clhx implements clia {
    static final clia a = new clhx();

    private clhx() {
    }

    @Override // defpackage.clia
    public final void a(SQLiteDatabase sQLiteDatabase) {
        int i = clib.b;
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
