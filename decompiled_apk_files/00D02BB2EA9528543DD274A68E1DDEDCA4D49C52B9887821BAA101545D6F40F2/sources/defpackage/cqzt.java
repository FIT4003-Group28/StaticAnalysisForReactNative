package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqzt  reason: default package */
/* loaded from: classes5.dex */
public final class cqzt implements cqzs {
    private static void c(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        long d = d(sQLiteDatabase, bArr);
        for (String str2 : strArr) {
            Long valueOf = Long.valueOf(j);
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str2);
            contentValues.put("data_id", Long.valueOf(d));
            contentValues.put("data_type", str);
            contentValues.put("timestamp_micro", valueOf);
            contentValues.put("num_times_used", (Integer) 0);
            if (z) {
                contentValues.put("sync_status", "SYNCED");
            }
            sQLiteDatabase.insertOrThrow("geller_key_table", null, contentValues);
        }
    }

    private static long d(SQLiteDatabase sQLiteDatabase, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", bArr);
        return sQLiteDatabase.insertOrThrow("geller_data_table", null, contentValues);
    }

    private static long e(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            long delete = sQLiteDatabase.delete("geller_data_table", str, strArr);
            sQLiteDatabase.setTransactionSuccessful();
            return delete;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // defpackage.cqzs
    public final long a(dbsg<SQLiteDatabase> dbsgVar, String str) {
        dbsk.l(true);
        return e((SQLiteDatabase) ((dbsu) dbsgVar).a, String.format("%s IN (SELECT %s FROM %s WHERE %s = ?)", "_id", "data_id", "geller_key_table", "data_type"), new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.cqzs
    public final boolean b(dbsg<SQLiteDatabase> dbsgVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase = 1;
        boolean z2 = true;
        sQLiteDatabase = 1;
        dbsk.l(true);
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) ((dbsu) dbsgVar).a;
        sQLiteDatabase2.beginTransactionNonExclusive();
        try {
            String b = cqzu.b("key", Arrays.asList(strArr));
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 42);
            sb.append("data_type = ? AND ");
            sb.append(b);
            sb.append(" AND ");
            sb.append("timestamp_micro");
            sb.append(" = ?");
            String sb2 = sb.toString();
            char c = 2;
            String[] strArr2 = {str, String.valueOf(j)};
            ArrayList arrayList = new ArrayList();
            try {
                Cursor query = sQLiteDatabase2.query(true, "geller_key_table", new String[]{"data_id"}, sb2, strArr2, "data_id", null, "timestamp_micro DESC", null);
                while (query.moveToNext()) {
                    try {
                        arrayList.add(Long.valueOf(query.getLong(query.getColumnIndexOrThrow("data_id"))));
                    } catch (Throwable th) {
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Throwable th2) {
                                deki.a(th, th2);
                            }
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (IllegalArgumentException unused) {
            }
            try {
                if (arrayList.size() == 1) {
                    String[] strArr3 = {String.valueOf(arrayList.get(0))};
                    List<String> a = cqzu.a(sQLiteDatabase2, "geller_key_table", "key", "data_id = ?", strArr3, dbpy.a, dbpy.a);
                    if (new HashSet(a).equals(new HashSet(Arrays.asList(strArr)))) {
                        long d = d(sQLiteDatabase2, bArr);
                        long j2 = 0;
                        for (String str2 : a) {
                            String[] strArr4 = new String[3];
                            strArr4[0] = str;
                            char c2 = z2 ? 1 : 0;
                            char c3 = z2 ? 1 : 0;
                            strArr4[c2] = str2;
                            strArr4[c] = String.valueOf(j);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("data_id", Long.valueOf(d));
                            j2 += sQLiteDatabase2.update("geller_key_table", contentValues, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr4);
                            c = 2;
                            z2 = true;
                        }
                        e(sQLiteDatabase2, cqzu.b("_id", arrayList), null);
                        if (j2 <= 0) {
                            sQLiteDatabase2.endTransaction();
                            return false;
                        }
                        Iterator<String> it = a.iterator();
                        while (it.hasNext()) {
                            String[] strArr5 = {str, it.next(), String.valueOf(j)};
                            ContentValues contentValues2 = new ContentValues();
                            if (z) {
                                contentValues2.put("sync_status", "SYNCED");
                            } else {
                                contentValues2.putNull("sync_status");
                            }
                            if (sQLiteDatabase2.update("geller_key_table", contentValues2, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr5) > 0) {
                                ContentValues contentValues3 = new ContentValues();
                                contentValues3.putNull("delete_status");
                                if (sQLiteDatabase2.update("geller_key_table", contentValues3, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr5) > 0) {
                                    ContentValues contentValues4 = new ContentValues();
                                    contentValues4.put("num_times_used", (Long) 0L);
                                    if (sQLiteDatabase2.update("geller_key_table", contentValues4, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr5) <= 0) {
                                    }
                                }
                            }
                            sQLiteDatabase2.endTransaction();
                            return false;
                        }
                        sQLiteDatabase = sQLiteDatabase2;
                    } else {
                        e(sQLiteDatabase2, "_id = ?", strArr3);
                        sQLiteDatabase = sQLiteDatabase2;
                        c(sQLiteDatabase2, str, strArr, j, z, bArr);
                    }
                } else {
                    SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase2;
                    if (arrayList.isEmpty()) {
                        c(sQLiteDatabase3, str, strArr, j, z, bArr);
                        sQLiteDatabase = sQLiteDatabase3;
                    } else {
                        e(sQLiteDatabase3, cqzu.b("_id", arrayList), null);
                        c(sQLiteDatabase3, str, strArr, j, z, bArr);
                        sQLiteDatabase = sQLiteDatabase3;
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
            } catch (IllegalStateException unused2) {
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase.endTransaction();
                throw th;
            }
        } catch (IllegalStateException unused3) {
            sQLiteDatabase = sQLiteDatabase2;
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase = sQLiteDatabase2;
        }
        sQLiteDatabase.endTransaction();
        return true;
    }
}
