package defpackage;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: azoi  reason: default package */
/* loaded from: classes.dex */
final class azoi extends bvjw {
    public azoi(Application application, afec afecVar) {
        super(application, afecVar, "gmm_myplaces.db", 5);
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sync_item;");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sync_corpus;");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE sync_item (corpus INTEGER, key_string TEXT, timestamp BIGINT, merge_key BIGINT, feature_fprint BIGINT, latitude INTEGER, longitude INTEGER, is_local BOOLEAN, sync_item BLOB, PRIMARY KEY (corpus, key_string));");
        sQLiteDatabase.execSQL("CREATE INDEX idx_sync_item_timestamp ON sync_item (corpus, timestamp);");
        sQLiteDatabase.execSQL("CREATE INDEX idx_sync_item_merge_key ON sync_item (corpus, merge_key);");
        sQLiteDatabase.execSQL("CREATE INDEX idx_sync_item_feature_fprint ON sync_item (corpus, feature_fprint);");
        sQLiteDatabase.execSQL("CREATE INDEX idx_sync_item_lat_long ON sync_item (corpus, latitude, longitude);");
        sQLiteDatabase.execSQL("CREATE TABLE sync_corpus (corpus INTEGER PRIMARY KEY, last_sync_time BIGINT);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }
}
