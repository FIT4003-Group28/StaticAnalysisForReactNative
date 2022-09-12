package defpackage;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: aznk  reason: default package */
/* loaded from: classes.dex */
final class aznk extends bvjw {
    public aznk(Application application, afec afecVar) {
        super(application, afecVar, "gmm_sync.db", 9);
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sync_item_data;");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sync_corpus_metadata;");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sync_metadata;");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE sync_item_data (corpus INTEGER NOT NULL, client_id TEXT NOT NULL, server_id TEXT, timestamp BIGINT DEFAULT 0, feature_fprint BIGINT, latitude_e6 INTEGER, longitude_e6 INTEGER, numerical_index BIGINT, string_index TEXT, sync_state INTEGER DEFAULT 0, item_proto BLOB, PRIMARY KEY (corpus, client_id));");
        sQLiteDatabase.execSQL("CREATE INDEX idx_sync_item_server_id ON sync_item_data (corpus, server_id);");
        sQLiteDatabase.execSQL("CREATE INDEX idx_sync_item_timestamp ON sync_item_data (corpus, timestamp);");
        sQLiteDatabase.execSQL("CREATE INDEX idx_sync_item_feature_fprint ON sync_item_data (corpus, feature_fprint);");
        sQLiteDatabase.execSQL("CREATE INDEX idx_sync_item_lat_long ON sync_item_data (corpus, latitude_e6, longitude_e6);");
        sQLiteDatabase.execSQL("CREATE TABLE sync_corpus_metadata (corpus INTEGER, sync_token STRING, unique_id_provider BIGINT DEFAULT 0, pagination_token STRING, last_sync_time_for_corpus BIGINT, PRIMARY KEY (corpus));");
        sQLiteDatabase.execSQL("CREATE TABLE sync_metadata (metadata_key STRING, numerical_value BIGINT);");
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
