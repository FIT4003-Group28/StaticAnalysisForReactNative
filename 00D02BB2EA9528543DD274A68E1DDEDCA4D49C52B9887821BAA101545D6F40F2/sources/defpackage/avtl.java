package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: avtl  reason: default package */
/* loaded from: classes3.dex */
public final class avtl extends bvjw {
    public avtl(@dzsi Context context, @dzsi String str, afec afecVar) {
        super(context, afecVar, str, 30);
    }

    private static Set<String> c(SQLiteDatabase sQLiteDatabase, String str) {
        dcen N = dcep.N();
        StringBuilder sb = new StringBuilder(str.length() + 19);
        sb.append("PRAGMA table_info(");
        sb.append(str);
        sb.append(")");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        while (rawQuery != null && rawQuery.moveToNext()) {
            N.b(rawQuery.getString(rawQuery.getColumnIndex("name")));
        }
        return N.f();
    }

    private static void d(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, @dzsi String str4) {
        String str5;
        String concat = str.concat("_backup");
        StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 27 + String.valueOf(str2).length());
        sb.append("CREATE TEMPORARY TABLE ");
        sb.append(concat);
        sb.append(" (");
        sb.append(str2);
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
        if (str4 == null || str4.isEmpty()) {
            str5 = ");";
            int length = String.valueOf(concat).length();
            int length2 = String.valueOf(str3).length();
            StringBuilder sb2 = new StringBuilder(length + 30 + length2 + String.valueOf(str3).length() + str.length());
            sb2.append("INSERT INTO ");
            sb2.append(concat);
            sb2.append(" (");
            sb2.append(str3);
            sb2.append(") SELECT ");
            sb2.append(str3);
            sb2.append(" FROM ");
            sb2.append(str);
            sb2.append(";");
            sQLiteDatabase.execSQL(sb2.toString());
        } else {
            int length3 = String.valueOf(concat).length();
            int length4 = String.valueOf(str3).length();
            int length5 = String.valueOf(str3).length();
            str5 = ");";
            StringBuilder sb3 = new StringBuilder(length3 + 41 + length4 + length5 + str.length() + str4.length());
            sb3.append("INSERT OR IGNORE INTO ");
            sb3.append(concat);
            sb3.append(" (");
            sb3.append(str3);
            sb3.append(") SELECT ");
            sb3.append(str3);
            sb3.append(" FROM ");
            sb3.append(str);
            sb3.append(" ");
            sb3.append(str4);
            sb3.append(";");
            sQLiteDatabase.execSQL(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(str.length() + 12);
        sb4.append("DROP TABLE ");
        sb4.append(str);
        sb4.append(";");
        sQLiteDatabase.execSQL(sb4.toString());
        StringBuilder sb5 = new StringBuilder(str.length() + 17 + String.valueOf(str2).length());
        sb5.append("CREATE TABLE ");
        sb5.append(str);
        sb5.append(" (");
        sb5.append(str2);
        sb5.append(str5);
        sQLiteDatabase.execSQL(sb5.toString());
        int length6 = str.length();
        int length7 = String.valueOf(str3).length();
        StringBuilder sb6 = new StringBuilder(length6 + 30 + length7 + String.valueOf(str3).length() + String.valueOf(concat).length());
        sb6.append("INSERT INTO ");
        sb6.append(str);
        sb6.append(" (");
        sb6.append(str3);
        sb6.append(") SELECT ");
        sb6.append(str3);
        sb6.append(" FROM ");
        sb6.append(concat);
        sb6.append(";");
        sQLiteDatabase.execSQL(sb6.toString());
        StringBuilder sb7 = new StringBuilder(String.valueOf(concat).length() + 12);
        sb7.append("DROP TABLE ");
        sb7.append(concat);
        sb7.append(";");
        sQLiteDatabase.execSQL(sb7.toString());
    }

    private static void e(SQLiteDatabase sQLiteDatabase, String str, avth avthVar, String str2, Map<String, dssr<? extends dssj>> map, List<String> list) {
        ArrayList arrayList = new ArrayList();
        dbrz e = dbrz.e(",");
        dccx F = dcdc.F();
        F.g(str2);
        F.i(map.keySet());
        F.i(list);
        String g = e.g(F.f());
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 13 + str.length());
        sb.append("SELECT ");
        sb.append(g);
        sb.append(" FROM ");
        sb.append(str);
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        while (rawQuery.moveToNext()) {
            try {
                avtk avtkVar = new avtk(rawQuery.getString(rawQuery.getColumnIndexOrThrow(str2)));
                for (Map.Entry<String, dssr<? extends dssj>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    dssr<? extends dssj> value = entry.getValue();
                    try {
                        String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow(key));
                        if (string != null) {
                            Map<String, dssj> map2 = avtkVar.b;
                            String str3 = avtm.b;
                            map2.put(key, value.l(dspd.P(string)));
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException("Error parsing proto", e2);
                    }
                }
                for (String str4 : list) {
                    String string2 = rawQuery.getString(rawQuery.getColumnIndexOrThrow(str4));
                    if (string2 != null) {
                        try {
                            Map<String, dspd> map3 = avtkVar.c;
                            String str5 = avtm.b;
                            map3.put(str4, dspd.P(string2));
                        } catch (Exception e3) {
                            throw new RuntimeException("Error parsing byte string", e3);
                        }
                    }
                }
                arrayList.add(avtkVar);
            } catch (Throwable th) {
                avtm.g(rawQuery);
                throw th;
            }
        }
        avtm.g(rawQuery);
        d(sQLiteDatabase, str, avthVar.a(), avthVar.b(map.keySet()), null);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            avtk avtkVar2 = (avtk) arrayList.get(i);
            ContentValues contentValues = new ContentValues();
            for (String str6 : map.keySet()) {
                dssj dssjVar = avtkVar2.b.get(str6);
                contentValues.put(str6, dssjVar != null ? dssjVar.bS() : null);
            }
            for (String str7 : list) {
                dspd dspdVar = avtkVar2.c.get(str7);
                contentValues.put(str7, dspdVar != null ? dspdVar.G() : null);
            }
            sQLiteDatabase.update(str, contentValues, str2.concat(" = ?"), new String[]{avtkVar2.a});
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String str = avtm.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("CREATE TABLE offlineRegions (");
        sb.append(str);
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
        String str2 = avtm.b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 33);
        sb2.append("CREATE TABLE inProcessRegions (");
        sb2.append(str2);
        sb2.append(");");
        sQLiteDatabase.execSQL(sb2.toString());
        String str3 = avtm.c;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 33);
        sb3.append("CREATE TABLE offlineResources (");
        sb3.append(str3);
        sb3.append(");");
        sQLiteDatabase.execSQL(sb3.toString());
        sQLiteDatabase.execSQL("CREATE INDEX ix_offlineResources_status_failureReason ON offlineResources (status, failureReason)");
        sQLiteDatabase.execSQL("CREATE INDEX ix_offlineResources_lastModifiedMs ON offlineResources (lastModifiedMs)");
        String str4 = avtm.d;
        StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 33);
        sb4.append("CREATE TABLE resourceToRegion (");
        sb4.append(str4);
        sb4.append(");");
        sQLiteDatabase.execSQL(sb4.toString());
        String str5 = avtm.d;
        StringBuilder sb5 = new StringBuilder(String.valueOf(str5).length() + 42);
        sb5.append("CREATE TABLE inProcessResourceToRegion (");
        sb5.append(str5);
        sb5.append(");");
        sQLiteDatabase.execSQL(sb5.toString());
        sQLiteDatabase.execSQL("CREATE INDEX ix_resourceToRegion_regionId ON resourceToRegion (regionId)");
        sQLiteDatabase.execSQL("CREATE INDEX ix_inProcessResourceToRegion_regionId ON inProcessResourceToRegion (regionId)");
        String str6 = avtm.e;
        StringBuilder sb6 = new StringBuilder(String.valueOf(str6).length() + 31);
        sb6.append("CREATE TABLE inProcessUpdate(");
        sb6.append(str6);
        sb6.append(");");
        sQLiteDatabase.execSQL(sb6.toString());
        String str7 = avtm.f;
        StringBuilder sb7 = new StringBuilder(String.valueOf(str7).length() + 52);
        sb7.append("CREATE TABLE IF NOT EXISTS regionIndependentState(");
        sb7.append(str7);
        sb7.append(");");
        sQLiteDatabase.execSQL(sb7.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offlineRegions;");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS inProcessRegions;");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offlineResources;");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS resourceToRegion;");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS inProcessResourceToRegion;");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS inProcessUpdate;");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS regionIndependentState;");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS ix_offlineResources_status_failureReason;");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS ix_offlineResources_lastModifiedMs;");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS ix_resourceToRegion_regionId;");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS ix_inProcessResourceToRegion_regionId;");
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        SQLiteDatabase sQLiteDatabase2;
        int i3;
        int i4;
        SQLiteDatabase sQLiteDatabase3;
        SQLiteDatabase sQLiteDatabase4 = sQLiteDatabase;
        String str = avtm.b;
        new Exception("Not a real exception - just for the stack trace.");
        int i5 = i2;
        int i6 = i + 1;
        while (i6 <= i5) {
            switch (i6) {
                case 2:
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i3 = i6;
                    i4 = i;
                    sQLiteDatabase2.execSQL("CREATE INDEX ix_offlineResources_status ON offlineResources (status)");
                    sQLiteDatabase2.execSQL("CREATE INDEX ix_offlineResources_downloadId ON offlineResources (downloadId)");
                    sQLiteDatabase2.execSQL("CREATE INDEX ix_resourceToRegion_regionId ON resourceToRegion (regionId)");
                    continue;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 3:
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i3 = i6;
                    i4 = i;
                    sQLiteDatabase2.execSQL("ALTER TABLE offlineRegions ADD estimatedSize INT");
                    sQLiteDatabase2.execSQL("ALTER TABLE offlineRegions ADD currentSize INT");
                    sQLiteDatabase2.execSQL("ALTER TABLE offlineRegions ADD onDiskSize INT");
                    sQLiteDatabase2.execSQL("ALTER TABLE offlineResources ADD estimatedSize INT");
                    sQLiteDatabase2.execSQL("ALTER TABLE offlineResources ADD onDiskSize INT");
                    continue;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 4:
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i3 = i6;
                    i4 = i;
                    sQLiteDatabase2.execSQL("ALTER TABLE offlineResources ADD failureReason INT");
                    continue;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 5:
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i3 = i6;
                    i4 = i;
                    sQLiteDatabase2.execSQL("ALTER TABLE offlineRegions ADD resourceVersion TEXT");
                    continue;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 6:
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i3 = i6;
                    i4 = i;
                    sQLiteDatabase2.execSQL("ALTER TABLE offlineRegions ADD failureReason INT");
                    sQLiteDatabase2.execSQL("DROP INDEX ix_offlineResources_status");
                    sQLiteDatabase2.execSQL("CREATE INDEX ix_offlineResources_status_failureReason ON offlineResources (status, failureReason)");
                    continue;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 7:
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i3 = i6;
                    i4 = i;
                    sQLiteDatabase2.execSQL("CREATE TABLE inProcessRegions (regionId TEXT PRIMARY KEY, status INT, failureReason INT, geometry TEXT, implicitRegion TEXT, name TEXT, expirationTimeMs INT, estimatedSize INT, currentSize INT, onDiskSize INT, resourceVersion TEXT, paintMinEpoch INT, routingMinEpoch  INT, searchMinEpoch INT);");
                    sQLiteDatabase2.execSQL("CREATE TABLE inProcessResourceToRegion (resourceId TEXT, variant TEXT, regionId TEXT, PRIMARY KEY (resourceId, variant, regionId));");
                    sQLiteDatabase2.execSQL("CREATE INDEX ix_inProcessResourceToRegion_regionId ON inProcessResourceToRegion (regionId)");
                    continue;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 8:
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i3 = i6;
                    i4 = i;
                    sQLiteDatabase2.execSQL("ALTER TABLE offlineResources ADD nextRetry DATETIME");
                    sQLiteDatabase2.execSQL("ALTER TABLE offlineResources ADD retryCount INT");
                    continue;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 9:
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i3 = i6;
                    i4 = i;
                    sQLiteDatabase2.execSQL("ALTER TABLE offlineRegions ADD totalNumFiles INT");
                    sQLiteDatabase2.execSQL("ALTER TABLE offlineRegions ADD numFilesToDownload INT");
                    sQLiteDatabase2.execSQL("ALTER TABLE inProcessRegions ADD totalNumFiles INT");
                    sQLiteDatabase2.execSQL("ALTER TABLE inProcessRegions ADD numFilesToDownload INT");
                    continue;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 10:
                    sQLiteDatabase3 = sQLiteDatabase4;
                    i3 = i6;
                    i4 = i;
                    if (i4 == 9) {
                        try {
                            sQLiteDatabase2 = sQLiteDatabase3;
                        } catch (SQLiteException unused) {
                            sQLiteDatabase2 = sQLiteDatabase3;
                        }
                        try {
                            Cursor query = sQLiteDatabase.query("inProcessRegions", new String[]{"totalNumFiles"}, null, null, null, null, null);
                            query.getCount();
                            avtm.g(query);
                            continue;
                        } catch (SQLiteException unused2) {
                            sQLiteDatabase2.execSQL("ALTER TABLE inProcessRegions ADD totalNumFiles INT");
                            sQLiteDatabase2.execSQL("ALTER TABLE inProcessRegions ADD numFilesToDownload INT");
                            i6 = i3 + 1;
                            i5 = i2;
                            sQLiteDatabase4 = sQLiteDatabase2;
                        }
                        i6 = i3 + 1;
                        i5 = i2;
                        sQLiteDatabase4 = sQLiteDatabase2;
                    }
                    break;
                case 11:
                    sQLiteDatabase3 = sQLiteDatabase4;
                    i3 = i6;
                    sQLiteDatabase3.execSQL("ALTER TABLE offlineRegions ADD estimatedBytesProcessed INT");
                    sQLiteDatabase3.execSQL("ALTER TABLE offlineRegions ADD numFilesProcessed INT");
                    sQLiteDatabase3.execSQL("ALTER TABLE inProcessRegions ADD estimatedBytesProcessed INT");
                    sQLiteDatabase3.execSQL("ALTER TABLE inProcessRegions ADD numFilesProcessed INT");
                    i4 = i;
                    break;
                case 12:
                    sQLiteDatabase3 = sQLiteDatabase4;
                    i3 = i6;
                    sQLiteDatabase3.execSQL("ALTER TABLE offlineResources ADD encryptionKey TEXT");
                    i4 = i;
                    break;
                case 13:
                    sQLiteDatabase3 = sQLiteDatabase4;
                    i3 = i6;
                    sQLiteDatabase3.execSQL("ALTER TABLE offlineResources ADD diffUrl TEXT");
                    i4 = i;
                    break;
                case 14:
                    i3 = i6;
                    avth avthVar = new avth();
                    avthVar.c("resourceId", "TEXT", avth.a);
                    avthVar.c("url", "TEXT", new avtf[0]);
                    avthVar.c("diffUrl", "TEXT", new avtf[0]);
                    avthVar.c("type", "INT", new avtf[0]);
                    avthVar.c("status", "INT", new avtf[0]);
                    avthVar.c("failureReason", "INT", new avtf[0]);
                    avthVar.c("filePath", "TEXT", new avtf[0]);
                    avthVar.c("downloadId", "INT", new avtf[0]);
                    avthVar.c("estimatedSize", "INT", new avtf[0]);
                    avthVar.c("onDiskSize", "INT", new avtf[0]);
                    avthVar.c("nextRetry", "DATETIME", new avtf[0]);
                    avthVar.c("retryCount", "INT", new avtf[0]);
                    avthVar.c("encryptionKey", "TEXT", new avtf[0]);
                    sQLiteDatabase3 = sQLiteDatabase;
                    sQLiteDatabase3.execSQL("DROP INDEX ix_offlineResources_status_failureReason;");
                    sQLiteDatabase3.execSQL("DROP INDEX ix_offlineResources_downloadId;");
                    d(sQLiteDatabase3, "offlineResources", avthVar.a(), avthVar.b(dcmr.a), "ORDER BY variant ASC");
                    sQLiteDatabase3.execSQL("CREATE INDEX ix_offlineResources_status_failureReason ON offlineResources (status, failureReason);");
                    sQLiteDatabase3.execSQL("CREATE INDEX ix_offlineResources_downloadId ON offlineResources (downloadId);");
                    avth avthVar2 = new avth();
                    avthVar2.c("resourceId", "TEXT", avth.a);
                    avthVar2.c("regionId", "TEXT", avth.a);
                    sQLiteDatabase3.execSQL("DROP INDEX ix_resourceToRegion_regionId;");
                    d(sQLiteDatabase3, "resourceToRegion", avthVar2.a(), avthVar2.b(dcmr.a), "ORDER BY variant ASC");
                    sQLiteDatabase3.execSQL("CREATE INDEX ix_resourceToRegion_regionId ON resourceToRegion (regionId);");
                    sQLiteDatabase3.execSQL("DROP INDEX ix_inProcessResourceToRegion_regionId;");
                    d(sQLiteDatabase3, "inProcessResourceToRegion", avthVar2.a(), avthVar2.b(dcmr.a), "ORDER BY variant ASC");
                    sQLiteDatabase3.execSQL("CREATE INDEX ix_inProcessResourceToRegion_regionId ON inProcessResourceToRegion (regionId);");
                    i4 = i;
                    break;
                case 15:
                    sQLiteDatabase3 = sQLiteDatabase4;
                    i3 = i6;
                    sQLiteDatabase3.execSQL("ALTER TABLE offlineRegions ADD regionVersion TEXT");
                    sQLiteDatabase3.execSQL("ALTER TABLE inProcessRegions ADD regionVersion TEXT");
                    i4 = i;
                    break;
                case 16:
                    sQLiteDatabase3 = sQLiteDatabase4;
                    i3 = i6;
                    sQLiteDatabase3.execSQL("ALTER TABLE offlineResources ADD lastModifiedMs INT");
                    sQLiteDatabase3.execSQL("CREATE INDEX ix_offlineResources_lastModifiedMs ON offlineResources (lastModifiedMs)");
                    i4 = i;
                    break;
                case 17:
                    sQLiteDatabase3 = sQLiteDatabase4;
                    i3 = i6;
                    sQLiteDatabase3.execSQL("ALTER TABLE offlineResources ADD overrideWifiOnly INT DEFAULT 0");
                    i4 = i;
                    break;
                case 18:
                    sQLiteDatabase3 = sQLiteDatabase4;
                    i3 = i6;
                    sQLiteDatabase3.execSQL("ALTER TABLE offlineRegions ADD overrideWifiOnlyForRegion INT DEFAULT 0");
                    sQLiteDatabase3.execSQL("ALTER TABLE inProcessRegions ADD overrideWifiOnlyForRegion INT DEFAULT 0");
                    i4 = i;
                    break;
                case 19:
                    sQLiteDatabase3 = sQLiteDatabase4;
                    i3 = i6;
                    avth avthVar3 = new avth();
                    avthVar3.c("regionId", "TEXT", avth.a);
                    avthVar3.c("status", "INT", new avtf[0]);
                    avthVar3.c("failureReason", "INT", new avtf[0]);
                    avthVar3.c("geometry", "TEXT", new avtf[0]);
                    avthVar3.c("implicitRegion", "TEXT", new avtf[0]);
                    avthVar3.c("name", "TEXT", new avtf[0]);
                    avthVar3.c("expirationTimeMs", "INT", new avtf[0]);
                    avthVar3.c("estimatedSize", "INT", new avtf[0]);
                    avthVar3.c("currentSize", "INT", new avtf[0]);
                    avthVar3.c("estimatedBytesProcessed", "INT", new avtf[0]);
                    avthVar3.c("onDiskSize", "INT", new avtf[0]);
                    avthVar3.c("totalNumFiles", "INT", new avtf[0]);
                    avthVar3.c("numFilesToDownload", "INT", new avtf[0]);
                    avthVar3.c("numFilesProcessed", "INT", new avtf[0]);
                    avthVar3.c("regionVersion", "TEXT", new avtf[0]);
                    avthVar3.c("overrideWifiOnlyForRegion", "INT", avth.d());
                    d(sQLiteDatabase3, "offlineRegions", avthVar3.a(), avthVar3.b(dcmr.a), null);
                    d(sQLiteDatabase3, "inProcessRegions", avthVar3.a(), avthVar3.b(dcmr.a), null);
                    i4 = i;
                    break;
                case 20:
                    sQLiteDatabase3 = sQLiteDatabase4;
                    i3 = i6;
                    sQLiteDatabase3.execSQL("ALTER TABLE offlineRegions ADD expiringNotificationShown INT DEFAULT 0");
                    sQLiteDatabase3.execSQL("ALTER TABLE inProcessRegions ADD expiringNotificationShown INT DEFAULT 0");
                    i4 = i;
                    break;
                case 21:
                    sQLiteDatabase3 = sQLiteDatabase4;
                    i3 = i6;
                    avth avthVar4 = new avth();
                    avthVar4.c("updateId", "INT", avth.a);
                    avthVar4.c("type", "INT", new avtf[0]);
                    String a = avthVar4.a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 31);
                    sb.append("CREATE TABLE inProcessUpdate(");
                    sb.append(a);
                    sb.append(");");
                    sQLiteDatabase3.execSQL(sb.toString());
                    i4 = i;
                    break;
                case 22:
                    sQLiteDatabase3 = sQLiteDatabase4;
                    i3 = i6;
                    sQLiteDatabase3.execSQL("ALTER TABLE inProcessUpdate ADD overrideWifiOnlyForUpdate INT DEFAULT 0");
                    i4 = i;
                    break;
                case 23:
                    i3 = i6;
                    sQLiteDatabase4.execSQL("DROP INDEX ix_offlineResources_downloadId;");
                    avth avthVar5 = new avth();
                    avthVar5.c("resourceId", "TEXT", avth.a);
                    avthVar5.c("url", "TEXT", new avtf[0]);
                    avthVar5.c("diffUrl", "TEXT", new avtf[0]);
                    avthVar5.c("type", "INT", new avtf[0]);
                    avthVar5.c("status", "INT", new avtf[0]);
                    avthVar5.c("failureReason", "INT", new avtf[0]);
                    avthVar5.c("filePath", "TEXT", new avtf[0]);
                    avthVar5.c("estimatedSize", "INT", new avtf[0]);
                    avthVar5.c("onDiskSize", "INT", new avtf[0]);
                    avthVar5.c("nextRetry", "DATETIME", new avtf[0]);
                    avthVar5.c("retryCount", "INT", new avtf[0]);
                    avthVar5.c("encryptionKey", "TEXT", new avtf[0]);
                    avthVar5.c("lastModifiedMs", "INT", new avtf[0]);
                    avthVar5.c("overrideWifiOnly", "INT", avth.d());
                    sQLiteDatabase3 = sQLiteDatabase;
                    sQLiteDatabase3.execSQL("DROP INDEX ix_offlineResources_status_failureReason;");
                    sQLiteDatabase3.execSQL("DROP INDEX ix_offlineResources_lastModifiedMs;");
                    d(sQLiteDatabase3, "offlineResources", avthVar5.a(), avthVar5.b(dcmr.a), null);
                    sQLiteDatabase3.execSQL("CREATE INDEX ix_offlineResources_status_failureReason ON offlineResources (status, failureReason);");
                    sQLiteDatabase3.execSQL("CREATE INDEX ix_offlineResources_lastModifiedMs ON offlineResources (lastModifiedMs)");
                    i4 = i;
                    break;
                case 24:
                    i3 = i6;
                    sQLiteDatabase4.execSQL("ALTER TABLE offlineRegions ADD hasFailedProcessing INT DEFAULT 0");
                    sQLiteDatabase4.execSQL("ALTER TABLE inProcessRegions ADD hasFailedProcessing INT DEFAULT 0");
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i4 = i;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 25:
                    i3 = i6;
                    sQLiteDatabase4.execSQL("ALTER TABLE inProcessUpdate ADD state INT DEFAULT 0");
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i4 = i;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 26:
                    i3 = i6;
                    sQLiteDatabase4.execSQL("ALTER TABLE offlineResources ADD verificationKey TEXT");
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i4 = i;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 27:
                    i3 = i6;
                    sQLiteDatabase4.execSQL("ALTER TABLE inProcessUpdate ADD willDownloadRegion INT DEFAULT 0");
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i4 = i;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 28:
                    avth avthVar6 = new avth();
                    i3 = i6;
                    avthVar6.c("regionId", "TEXT", avth.a);
                    avthVar6.c("status", "INT", new avtf[0]);
                    avthVar6.c("failureReason", "INT", new avtf[0]);
                    avthVar6.c("geometry", "BLOB", new avtf[0]);
                    avthVar6.c("implicitRegion", "BLOB", new avtf[0]);
                    avthVar6.c("name", "TEXT", new avtf[0]);
                    avthVar6.c("expirationTimeMs", "INT", new avtf[0]);
                    avthVar6.c("estimatedSize", "INT", new avtf[0]);
                    avthVar6.c("currentSize", "INT", new avtf[0]);
                    avthVar6.c("estimatedBytesProcessed", "INT", new avtf[0]);
                    avthVar6.c("onDiskSize", "INT", new avtf[0]);
                    avthVar6.c("totalNumFiles", "INT", new avtf[0]);
                    avthVar6.c("numFilesToDownload", "INT", new avtf[0]);
                    avthVar6.c("numFilesProcessed", "INT", new avtf[0]);
                    avthVar6.c("regionVersion", "BLOB", new avtf[0]);
                    avthVar6.c("overrideWifiOnlyForRegion", "INT", avth.d());
                    avthVar6.c("expiringNotificationShown", "INT", avth.d());
                    avthVar6.c("hasFailedProcessing", "INT", avth.d());
                    avth avthVar7 = new avth();
                    avthVar7.c("resourceId", "TEXT", avth.a);
                    avthVar7.c("url", "TEXT", new avtf[0]);
                    avthVar7.c("diffUrl", "TEXT", new avtf[0]);
                    avthVar7.c("type", "INT", new avtf[0]);
                    avthVar7.c("status", "INT", new avtf[0]);
                    avthVar7.c("failureReason", "INT", new avtf[0]);
                    avthVar7.c("filePath", "TEXT", new avtf[0]);
                    avthVar7.c("estimatedSize", "INT", new avtf[0]);
                    avthVar7.c("onDiskSize", "INT", new avtf[0]);
                    avthVar7.c("nextRetry", "DATETIME", new avtf[0]);
                    avthVar7.c("retryCount", "INT", new avtf[0]);
                    avthVar7.c("encryptionKey", "BLOB", new avtf[0]);
                    avthVar7.c("verificationKey", "BLOB", new avtf[0]);
                    avthVar7.c("lastModifiedMs", "INT", new avtf[0]);
                    avthVar7.c("overrideWifiOnly", "INT", avth.d());
                    dcdg p = dcdn.p();
                    p.f("geometry", (dssr) dlug.c.cu(7));
                    p.f("implicitRegion", (dssr) dvfe.d.cu(7));
                    dcdn b = p.b();
                    e(sQLiteDatabase, "offlineRegions", avthVar6, "regionId", b, dcdc.f("regionVersion"));
                    e(sQLiteDatabase, "inProcessRegions", avthVar6, "regionId", b, dcdc.f("regionVersion"));
                    e(sQLiteDatabase, "offlineResources", avthVar7, "resourceId", dcmn.a, dcdc.g("encryptionKey", "verificationKey"));
                    sQLiteDatabase4 = sQLiteDatabase;
                    sQLiteDatabase4.execSQL("CREATE INDEX ix_offlineResources_status_failureReason ON offlineResources (status, failureReason)");
                    sQLiteDatabase4.execSQL("CREATE INDEX ix_offlineResources_lastModifiedMs ON offlineResources (lastModifiedMs)");
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i4 = i;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case 29:
                    avth avthVar8 = new avth();
                    avthVar8.c("regionIndependentStateId", "INT", avth.a);
                    avthVar8.c("serializedRegionIndependentState", "BLOB", new avtf[0]);
                    String a2 = avthVar8.a();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 52);
                    sb2.append("CREATE TABLE IF NOT EXISTS regionIndependentState(");
                    sb2.append(a2);
                    sb2.append(");");
                    sQLiteDatabase4.execSQL(sb2.toString());
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i3 = i6;
                    i4 = i;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    Set<String> c = c(sQLiteDatabase4, "offlineRegions");
                    Set<String> c2 = c(sQLiteDatabase4, "inProcessRegions");
                    if (!c.contains("upcomingTripNotificationShown")) {
                        sQLiteDatabase4.execSQL("ALTER TABLE offlineRegions ADD upcomingTripNotificationShown INT DEFAULT 0");
                    }
                    if (!c2.contains("upcomingTripNotificationShown")) {
                        sQLiteDatabase4.execSQL("ALTER TABLE inProcessRegions ADD upcomingTripNotificationShown INT DEFAULT 0");
                    }
                    if (!c.contains("currentTripNotificationShown")) {
                        sQLiteDatabase4.execSQL("ALTER TABLE offlineRegions ADD currentTripNotificationShown INT DEFAULT 0");
                    }
                    if (!c2.contains("currentTripNotificationShown")) {
                        sQLiteDatabase4.execSQL("ALTER TABLE inProcessRegions ADD currentTripNotificationShown INT DEFAULT 0");
                    }
                    sQLiteDatabase2 = sQLiteDatabase4;
                    i3 = i6;
                    i4 = i;
                    i6 = i3 + 1;
                    i5 = i2;
                    sQLiteDatabase4 = sQLiteDatabase2;
                default:
                    StringBuilder sb3 = new StringBuilder(51);
                    sb3.append("Unsupported upgrade to database version ");
                    sb3.append(i6);
                    throw new RuntimeException(sb3.toString());
            }
            sQLiteDatabase2 = sQLiteDatabase3;
            i6 = i3 + 1;
            i5 = i2;
            sQLiteDatabase4 = sQLiteDatabase2;
        }
    }
}
