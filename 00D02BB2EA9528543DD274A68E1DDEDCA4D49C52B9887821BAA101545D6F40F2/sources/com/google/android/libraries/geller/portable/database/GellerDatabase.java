package com.google.android.libraries.geller.portable.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GellerDatabase extends SQLiteOpenHelper {
    private static final String a = dsyl.UNKNOWN.name();
    private static final dcep<String> b = dcep.C(dsyl.TAPAS_REFLECTION_MODELS.name(), dsyl.TAPAS_REFLECTION_TRAINING_BUFFERS.name());
    private final Context c;
    private final cqzt d;
    private final cqzv e;
    private int f;

    public GellerDatabase(Context context, String str, boolean z) {
        super(context, String.format("portable_geller_%s.db", str), (SQLiteDatabase.CursorFactory) null, 8);
        this.f = 8;
        this.c = context;
        setWriteAheadLoggingEnabled(z);
        d();
        this.d = new cqzt();
        this.e = new cqzv(context, str);
    }

    public static void b(File file) {
        File[] listFiles;
        if (file == null) {
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                b(file2);
            }
        }
        try {
            if (!file.exists()) {
                return;
            }
            file.delete();
        } catch (RuntimeException unused) {
        }
    }

    public static final boolean h(String str) {
        return b.contains(str);
    }

    private final cqzs i(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -2065466828) {
            if (hashCode == 512429304 && str.equals("TAPAS_REFLECTION_TRAINING_BUFFERS")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("TAPAS_REFLECTION_MODELS")) {
                c = 0;
            }
            c = 65535;
        }
        return (c == 0 || c == 1) ? this.e : this.d;
    }

    private final long j(String str, String[] strArr) {
        String[] strArr2;
        SQLiteDatabase d = d();
        long j = 0;
        if (d != null) {
            for (String str2 : cqzu.a(d, "geller_file_table", "file_path", str, strArr, dbsg.i("timestamp_micro DESC"), dbpy.a)) {
                File file = new File(str2);
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                    strArr2 = new String[]{str2};
                    d.beginTransactionNonExclusive();
                } catch (RuntimeException unused) {
                }
                try {
                    long delete = d.delete("geller_file_table", "file_path = ?", strArr2);
                    d.setTransactionSuccessful();
                    d.endTransaction();
                    j += delete;
                } catch (Throwable th) {
                    d.endTransaction();
                    throw th;
                }
            }
        }
        return j;
    }

    private final long k(String str, String[] strArr) {
        SQLiteDatabase d = d();
        if (d == null) {
            return 0L;
        }
        try {
            d.beginTransactionNonExclusive();
            d.execSQL(String.format("DELETE FROM %s WHERE %s IN (SELECT %s FROM %s WHERE %s)", "geller_data_table", "_id", "data_id", "geller_key_table", str), strArr);
            long longForQuery = DatabaseUtils.longForQuery(d, "SELECT changes()", null);
            d.setTransactionSuccessful();
            return longForQuery;
        } finally {
            d.endTransaction();
        }
    }

    private final long l(String str, String[] strArr) {
        SQLiteDatabase d = d();
        if (d != null) {
            d.beginTransactionNonExclusive();
            try {
                long delete = d.delete("geller_metadata_table", str, strArr);
                d.setTransactionSuccessful();
                return delete;
            } finally {
                d.endTransaction();
            }
        }
        return 0L;
    }

    private final long m(String str, String[] strArr, long j) {
        SQLiteDatabase d = d();
        if (d == null) {
            return 0L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("num_times_used", Long.valueOf(j));
        return d.update("geller_key_table", contentValues, str, strArr);
    }

    private final byte[][] n(String str, String[] strArr, dbsg<Integer> dbsgVar) {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase d = d();
        if (d != null) {
            try {
                for (String str2 : cqzu.a(d, "geller_file_table", "file_path", str, strArr, dbsg.i("timestamp_micro DESC"), dbsgVar)) {
                    dbsg<byte[]> o = o(str2);
                    if (o.a()) {
                        arrayList.add(o.b());
                    }
                }
            } catch (SQLiteException | IllegalStateException e) {
                c(e);
            }
        }
        return (byte[][]) arrayList.toArray(new byte[arrayList.size()]);
    }

    private static dbsg<byte[]> o(String str) {
        File file = new File(str);
        file.getAbsolutePath();
        try {
            if (file.exists()) {
                return dbsg.i(ddau.d(file));
            }
        } catch (IOException | IllegalArgumentException | OutOfMemoryError | SecurityException unused) {
        }
        return dbpy.a;
    }

    private final byte[][] p(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase d = d();
        if (d != null) {
            try {
                Cursor rawQuery = d.rawQuery(String.format("SELECT %s FROM (%s) distinct_data_ids INNER JOIN %s ON %s = %s", t("data"), String.format("SELECT DISTINCT %s FROM %s WHERE %s ORDER BY %s DESC", "data_id", "geller_key_table", str, "timestamp_micro"), "geller_data_table", "distinct_data_ids.data_id", t("_id")), strArr);
                try {
                    int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("data");
                    while (rawQuery.moveToNext()) {
                        arrayList.add(rawQuery.getBlob(columnIndexOrThrow));
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } catch (Throwable th) {
                    if (rawQuery != null) {
                        try {
                            rawQuery.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (SQLiteException | IllegalStateException e) {
                c(e);
                throw new cqzl(drtc.ABORTED, e.getMessage());
            }
        }
        return (byte[][]) arrayList.toArray(new byte[arrayList.size()]);
    }

    private final boolean q(String str) {
        dtgp dtgpVar;
        Object b2;
        String name = dsyl.GELLER_CONFIG.name();
        dsvy bZ = dswb.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dswb dswbVar = (dswb) bZ.b;
        dswbVar.a |= 2;
        dswbVar.c = 1;
        byte[][] read = read(name, bZ.bK().bS());
        if (read.length == 0) {
            return true;
        }
        dsqa c = dsqa.c();
        try {
            dsyn dsynVar = (dsyn) dsqw.cr(dsyn.e, read[0], c);
            dsqv<dsyn, dtgp> dsqvVar = dtgp.c;
            dsynVar.f(dsqvVar);
            if (dsynVar.V.k(dsqvVar.d)) {
                dsqv<dsyn, dtgp> dsqvVar2 = dtgp.c;
                dsynVar.f(dsqvVar2);
                Object l = dsynVar.V.l(dsqvVar2.d);
                if (l == null) {
                    b2 = dsqvVar2.b;
                } else {
                    b2 = dsqvVar2.b(l);
                }
                dtgpVar = (dtgp) b2;
            } else {
                try {
                    dsok dsokVar = dsynVar.d;
                    if (dsokVar == null) {
                        dsokVar = dsok.c;
                    }
                    dspd dspdVar = dsokVar.b;
                    dtgp dtgpVar2 = dtgp.b;
                    try {
                        dspj s = dspdVar.s();
                        dsqw dsqwVar = (dsqw) dtgpVar2.cu(4);
                        try {
                            dstc b3 = dsst.a.b(dsqwVar);
                            b3.f(dsqwVar, dspk.n(s), c);
                            b3.j(dsqwVar);
                            try {
                                s.b(0);
                                dsqw.cv(dsqwVar);
                                dtgpVar = (dtgp) dsqwVar;
                            } catch (dsrm e) {
                                throw e;
                            }
                        } catch (IOException e2) {
                            if (e2.getCause() instanceof dsrm) {
                                throw ((dsrm) e2.getCause());
                            }
                            throw new dsrm(e2.getMessage());
                        } catch (RuntimeException e3) {
                            if (e3.getCause() instanceof dsrm) {
                                throw ((dsrm) e3.getCause());
                            }
                            throw e3;
                        }
                    } catch (dsrm e4) {
                        throw e4;
                    }
                } catch (dsrm e5) {
                    throw new IllegalStateException("Failed to unpack GellerClientConfig.", e5);
                }
            }
            dtgx dtgxVar = dtgpVar.a;
            if (dtgxVar == null) {
                dtgxVar = dtgx.b;
            }
            for (dtgw dtgwVar : dtgxVar.a) {
                dsyl b4 = dsyl.b(dtgwVar.a);
                if (b4 == null) {
                    b4 = dsyl.UNKNOWN;
                }
                if (dbqa.e(b4.name(), str)) {
                    dtgt dtgtVar = dtgwVar.b;
                    if (dtgtVar == null) {
                        dtgtVar = dtgt.b;
                    }
                    dtgr dtgrVar = dtgtVar.a;
                    if (dtgrVar == null) {
                        dtgrVar = dtgr.b;
                    }
                    return dtgrVar.a;
                }
            }
            return true;
        } catch (dsrm e6) {
            throw new IllegalStateException("Failed to parse an element.", e6);
        }
    }

    private static String r(List<cqzb> list, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                sb.append("( ");
            } else {
                sb.append(" OR ");
            }
            cqzb cqzbVar = list.get(i);
            String valueOf = String.valueOf(s("timestamp_micro", "=", dcdc.f(Long.valueOf(cqzbVar.b()))));
            String concat = valueOf.length() != 0 ? "( ".concat(valueOf) : new String("( ");
            if (!cqzbVar.a().isEmpty()) {
                String valueOf2 = String.valueOf(concat);
                String s = s("key", "=", dcdc.f(cqzbVar.a()));
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 5 + String.valueOf(s).length());
                sb2.append(valueOf2);
                sb2.append(" AND ");
                sb2.append(s);
                concat = sb2.toString();
            }
            sb.append(String.valueOf(concat).concat(" )"));
            if (i == list.size() - 1) {
                sb.append(" )");
            }
        }
        return sb.toString();
    }

    private static String s(String str, String str2, Iterable<?> iterable) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        Iterator<?> it = iterable.iterator();
        boolean z = true;
        while (true) {
            str3 = "(";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (true != z) {
                str3 = ", ";
            }
            sb.append(str3);
            if (next instanceof Number) {
                sb.append(next);
            } else {
                DatabaseUtils.appendEscapedSQLString(sb, String.valueOf(next));
            }
            z = false;
        }
        if (z) {
            sb.append(str3);
        }
        sb.append(")");
        return sb.toString();
    }

    private static String t(String str) {
        return str.length() != 0 ? "geller_data_table.".concat(str) : new String("geller_data_table.");
    }

    private static String u(String str) {
        return str.length() != 0 ? "geller_key_table.".concat(str) : new String("geller_key_table.");
    }

    public final long a(String str, dsvx dsvxVar) {
        long j;
        GellerDatabase gellerDatabase;
        int update;
        long j2;
        int update2;
        long j3;
        if (dsvxVar.c.size() == 0) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList();
        for (dsvh dsvhVar : dsvxVar.c) {
            arrayList.add(cqzb.c(dsvhVar.c, dsvhVar.b));
        }
        int a2 = dsvw.a(dsvxVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        String str2 = "DELETION_SYNCED";
        char c = 2;
        if (i == 1) {
            c = 1;
        } else if (i != 2) {
            int a3 = dsvw.a(dsvxVar.b);
            if (a3 == 0 || a3 == 1) {
                str2 = "UNKNOWN";
            } else if (a3 == 2) {
                str2 = "SYNCED";
            }
            StringBuilder sb = new StringBuilder(str2.length() + 41);
            sb.append("Marking data status to ");
            sb.append(str2);
            sb.append(" is not supported.");
            throw new UnsupportedOperationException(sb.toString());
        }
        boolean h = h(str);
        SQLiteDatabase d = d();
        if (d == null) {
            return 0L;
        }
        d.beginTransactionNonExclusive();
        try {
            try {
                String[] strArr = {str};
                ArrayList<String> arrayList2 = new ArrayList();
                for (List list : dchl.n(arrayList)) {
                    arrayList2.add(r(list, h));
                }
                if (h) {
                    long j4 = 0;
                    for (String str3 : arrayList2) {
                        try {
                            if (!str3.isEmpty()) {
                                String valueOf = String.valueOf(str3);
                                String concat = valueOf.length() != 0 ? "data_type = ? AND ".concat(valueOf) : new String("data_type = ? AND ");
                                if (c != 1) {
                                    SQLiteDatabase d2 = d();
                                    if (d2 != null) {
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("deletion_sync_status", str2);
                                        update2 = d2.update("geller_file_table", contentValues, concat, strArr);
                                        j3 = update2;
                                    }
                                    j3 = 0;
                                } else {
                                    SQLiteDatabase d3 = d();
                                    if (d3 == null) {
                                        j3 = 0;
                                    } else {
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("sync_status", "SYNCED");
                                        update2 = d3.update("geller_file_table", contentValues2, concat, strArr);
                                        j3 = update2;
                                    }
                                }
                                j4 += j3;
                            }
                        } catch (SQLiteException | IllegalStateException e) {
                            e = e;
                            gellerDatabase = this;
                            j = j4;
                            try {
                                gellerDatabase.c(e);
                                d.endTransaction();
                                return j;
                            } catch (Throwable th) {
                                th = th;
                                d.endTransaction();
                                throw th;
                            }
                        }
                    }
                    j = j4;
                } else {
                    j = 0;
                    for (String str4 : arrayList2) {
                        try {
                            String valueOf2 = String.valueOf(str4);
                            String concat2 = valueOf2.length() != 0 ? "data_type = ? AND ".concat(valueOf2) : new String("data_type = ? AND ");
                            if (c != 1) {
                                SQLiteDatabase d4 = d();
                                if (d4 != null) {
                                    ContentValues contentValues3 = new ContentValues();
                                    contentValues3.put("deletion_sync_status", str2);
                                    update = d4.update("geller_key_table", contentValues3, concat2, strArr);
                                    j2 = update;
                                }
                                j2 = 0;
                            } else {
                                SQLiteDatabase d5 = d();
                                if (d5 == null) {
                                    j2 = 0;
                                } else {
                                    ContentValues contentValues4 = new ContentValues();
                                    contentValues4.put("sync_status", "SYNCED");
                                    update = d5.update("geller_key_table", contentValues4, concat2, strArr);
                                    j2 = update;
                                }
                            }
                            j += j2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            gellerDatabase = this;
                            gellerDatabase.c(e);
                            d.endTransaction();
                            return j;
                        } catch (IllegalStateException e3) {
                            e = e3;
                            gellerDatabase = this;
                            gellerDatabase.c(e);
                            d.endTransaction();
                            return j;
                        }
                    }
                }
                d.setTransactionSuccessful();
                d.endTransaction();
                return j;
            } catch (Throwable th2) {
                th = th2;
                d.endTransaction();
                throw th;
            }
        } catch (SQLiteException | IllegalStateException e4) {
            e = e4;
            j = 0;
        }
    }

    public final void c(Exception exc) {
        SQLiteDatabase d;
        if ((exc instanceof IllegalStateException) || (exc instanceof SQLiteDatabaseLockedException) || (exc instanceof SQLiteDiskIOException) || (exc instanceof SQLiteFullException) || (exc instanceof SQLiteOutOfMemoryException) || (exc instanceof SQLiteTableLockedException) || (d = d()) == null) {
            return;
        }
        e(d);
    }

    @dzsi
    public final synchronized SQLiteDatabase d() {
        try {
        } catch (SQLiteException unused) {
            return null;
        }
        return getWritableDatabase();
    }

    public long delete(String str) {
        SQLiteDatabase d = d();
        long j = 0;
        try {
            if (d == null) {
                return 0L;
            }
            try {
                d.beginTransactionNonExclusive();
                l("data_type = ?", new String[]{str});
                j = i(str).a(dbsg.i(d), str);
                d.setTransactionSuccessful();
            } catch (SQLiteException | IllegalStateException e) {
                c(e);
            }
            return j;
        } finally {
            d.endTransaction();
        }
    }

    public long deleteMetadata(String str, String str2) {
        try {
            return l("data_type = ? AND key = ?", new String[]{str, str2});
        } catch (SQLiteException | IllegalStateException e) {
            c(e);
            return 0L;
        }
    }

    public long deleteOrphanedDataWithEquivalentTimestamp(String str, String str2) {
        SQLiteDatabase d;
        long j = 0;
        if (!str.equals(str2) && (d = d()) != null) {
            try {
                d.beginTransactionNonExclusive();
                boolean h = h(str);
                String str3 = "geller_key_table";
                String str4 = true != h(str2) ? str3 : "geller_file_table";
                if (true == h) {
                    str3 = "geller_file_table";
                }
                StringBuilder sb = new StringBuilder(str4.length() + 1 + "data_type".length());
                sb.append(str4);
                sb.append(".");
                sb.append("data_type");
                StringBuilder sb2 = new StringBuilder(str4.length() + 1 + "timestamp_micro".length());
                sb2.append(str4);
                sb2.append(".");
                sb2.append("timestamp_micro");
                new ContentValues().put("delete_status", "PENDING_DELETE");
                j = d.delete(str4, String.format("%s = ? AND %s NOT IN (SELECT p.%s FROM %s p WHERE p.%s = ? AND p.%s IS NOT NULL)", sb.toString(), sb2.toString(), "timestamp_micro", str3, "data_type", "delete_status"), new String[]{str2, str});
                d.setTransactionSuccessful();
                d.endTransaction();
            } catch (SQLiteException e) {
                e = e;
                try {
                    c(e);
                    d.endTransaction();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    d.endTransaction();
                    throw th;
                }
            } catch (IllegalStateException e2) {
                e = e2;
                c(e);
                d.endTransaction();
                return j;
            } catch (Throwable th2) {
                th = th2;
                d.endTransaction();
                throw th;
            }
            return j;
        }
        return 0L;
    }

    final void e(SQLiteDatabase sQLiteDatabase) {
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
            while (rawQuery.moveToNext()) {
                String valueOf = String.valueOf(rawQuery.getString(0));
                sQLiteDatabase.execSQL(valueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(valueOf) : new String("DROP TABLE IF EXISTS "));
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            b(new File(this.c.getFilesDir(), "geller"));
            onCreate(sQLiteDatabase);
        } catch (SQLiteException unused) {
        }
    }

    public final long f(String str, String[] strArr, @dzsi int i) {
        SQLiteDatabase d = d();
        if (d == null) {
            return 0L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_status", cqzr.a(1));
        return d.update("geller_key_table", contentValues, str, strArr);
    }

    public final long g(String str, String[] strArr, @dzsi int i) {
        SQLiteDatabase d = d();
        if (d == null) {
            return 0L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_status", cqzr.a(1));
        return d.update("geller_file_table", contentValues, str, strArr);
    }

    public byte[] getCorpusStats() {
        String format = String.format("SELECT %s, COUNT(*), COUNT(DISTINCT %s) FROM %s GROUP BY %s", "data_type", "data_id", "geller_key_table", "data_type");
        SQLiteDatabase d = d();
        if (d == null) {
            return new byte[0];
        }
        d.beginTransactionNonExclusive();
        try {
            Cursor rawQuery = d.rawQuery(format, null);
            try {
                HashMap hashMap = new HashMap();
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow("data_type"));
                    int i = rawQuery.getInt(1);
                    int i2 = rawQuery.getInt(2);
                    if (string != null) {
                        dsvi bZ = dsvj.f.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dsvj dsvjVar = (dsvj) bZ.b;
                        string.getClass();
                        int i3 = dsvjVar.a | 1;
                        dsvjVar.a = i3;
                        dsvjVar.b = string;
                        int i4 = i3 | 4;
                        dsvjVar.a = i4;
                        dsvjVar.d = i;
                        dsvjVar.a = i4 | 8;
                        dsvjVar.e = i2;
                        hashMap.put(string, bZ);
                    }
                }
                Cursor rawQuery2 = d.rawQuery(String.format("SELECT distinct_data_ids.%s, COUNT(*), SUM(LENGTH(%s)) FROM %s LEFT JOIN (SELECT DISTINCT %s, %s FROM %s) distinct_data_ids ON %s = distinct_data_ids.data_id GROUP BY distinct_data_ids.%s", "data_type", t("data"), "geller_data_table", "data_id", "data_type", "geller_key_table", t("_id"), "data_type"), null);
                while (rawQuery2.moveToNext()) {
                    String string2 = rawQuery2.getString(0);
                    int i5 = rawQuery2.getInt(1);
                    long j = rawQuery2.getLong(2);
                    if (rawQuery2.isNull(0)) {
                        String str = a;
                        dsvi bZ2 = dsvj.f.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dsvj dsvjVar2 = (dsvj) bZ2.b;
                        str.getClass();
                        int i6 = dsvjVar2.a | 1;
                        dsvjVar2.a = i6;
                        dsvjVar2.b = str;
                        int i7 = i6 | 4;
                        dsvjVar2.a = i7;
                        dsvjVar2.d = 1;
                        int i8 = i7 | 8;
                        dsvjVar2.a = i8;
                        dsvjVar2.e = i5;
                        dsvjVar2.a = i8 | 2;
                        dsvjVar2.c = j;
                        hashMap.put(str, bZ2);
                    } else if (!TextUtils.isEmpty(string2)) {
                        dsvi dsviVar = (dsvi) hashMap.get(string2);
                        if (dsviVar.c) {
                            dsviVar.bF();
                            dsviVar.c = false;
                        }
                        dsvj dsvjVar3 = (dsvj) dsviVar.b;
                        dsvj dsvjVar4 = dsvj.f;
                        dsvjVar3.a |= 2;
                        dsvjVar3.c = j;
                    }
                }
                if (rawQuery2 != null) {
                    rawQuery2.close();
                }
                d.setTransactionSuccessful();
                dsvk bZ3 = dsvl.b.bZ();
                for (dsvi dsviVar2 : hashMap.values()) {
                    dsvj bK = dsviVar2.bK();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dsvl dsvlVar = (dsvl) bZ3.b;
                    bK.getClass();
                    dsrj<dsvj> dsrjVar = dsvlVar.a;
                    if (!dsrjVar.a()) {
                        dsvlVar.a = dsqw.cl(dsrjVar);
                    }
                    dsvlVar.a.add(bK);
                }
                byte[] bS = bZ3.bK().bS();
                if (rawQuery != null) {
                    rawQuery.close();
                }
                d.endTransaction();
                return bS;
            } catch (Throwable th) {
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th2) {
                        deki.a(th, th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException e) {
            e = e;
            try {
                c(e);
                d.endTransaction();
                return new byte[0];
            } catch (Throwable th3) {
                th = th3;
                d.endTransaction();
                throw th;
            }
        } catch (IllegalStateException e2) {
            e = e2;
            c(e);
            d.endTransaction();
            return new byte[0];
        } catch (Throwable th4) {
            th = th4;
            d.endTransaction();
            throw th;
        }
    }

    public boolean getIsSoftDeletionEnabled() {
        return false;
    }

    public byte[] getSnapshot(String[] strArr, int i) {
        char c;
        String str;
        String str2;
        int i2;
        byte[][] p;
        String[] strArr2 = strArr;
        String str3 = " AND ";
        String str4 = "data_type = ? AND timestamp_micro > 0";
        int i3 = 1;
        boolean z = false;
        char c2 = i != 0 ? i != 1 ? (char) 0 : (char) 2 : (char) 1;
        if (c2 == 0) {
            return new byte[0];
        }
        Arrays.toString(strArr);
        dswm bZ = dswn.b.bZ();
        SQLiteDatabase d = d();
        if (d != null) {
            d.beginTransactionNonExclusive();
            try {
                int length = strArr2.length;
                int i4 = 0;
                while (i4 < length) {
                    String str5 = strArr2[i4];
                    h(str5);
                    String concat = str4.concat(str3);
                    dswk bZ2 = dswl.f.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = z;
                    }
                    dswl dswlVar = (dswl) bZ2.b;
                    str5.getClass();
                    dswlVar.a |= i3;
                    dswlVar.b = str5;
                    if (c2 == 2) {
                        dswo bZ3 = dswq.d.bZ();
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dswq dswqVar = (dswq) bZ3.b;
                        dswqVar.b = i3;
                        dswqVar.a |= i3;
                        if (!q(str5)) {
                            c = c2;
                            p = new byte[0];
                            str = str3;
                            str2 = str4;
                            i2 = length;
                        } else {
                            c = c2;
                            boolean h = h(str5);
                            String concat2 = str4.concat(str3);
                            str = str3;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(str5);
                            String valueOf = String.valueOf(concat2);
                            str2 = str4;
                            i2 = length;
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + "sync_status".length() + "delete_status".length());
                            sb.append(valueOf);
                            sb.append("sync_status");
                            sb.append(" = ? AND ");
                            sb.append("delete_status");
                            sb.append(" IS NOT NULL");
                            String sb2 = sb.toString();
                            arrayList.add("SYNCED");
                            if (h) {
                                p = n(sb2, (String[]) arrayList.toArray(new String[0]), dbpy.a);
                            } else {
                                p = p(sb2, (String[]) arrayList.toArray(new String[0]));
                            }
                        }
                        for (byte[] bArr : p) {
                            bZ3.a(dspd.x(bArr));
                        }
                        bZ2.a(bZ3);
                        dswo bZ4 = dswq.d.bZ();
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        dswq dswqVar2 = (dswq) bZ4.b;
                        dswqVar2.b = 4;
                        dswqVar2.a |= 1;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(concat).length() + 21 + "sync_status".length() + "delete_status".length());
                        sb3.append(concat);
                        sb3.append("sync_status");
                        sb3.append(" IS NULL AND ");
                        sb3.append("delete_status");
                        sb3.append(" IS NULL");
                        for (byte[] bArr2 : p(sb3.toString(), new String[]{str5})) {
                            bZ4.a(dspd.x(bArr2));
                        }
                        bZ2.a(bZ4);
                        String[] readMetadata = readMetadata(str5, "_version_info");
                        if (readMetadata.length > 0) {
                            String str6 = readMetadata[0];
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            dswl dswlVar2 = (dswl) bZ2.b;
                            str6.getClass();
                            dswlVar2.a |= 2;
                            dswlVar2.d = str6;
                        }
                        String[] readMetadata2 = readMetadata(str5, "_sync_token");
                        if (readMetadata2.length > 0) {
                            String str7 = readMetadata2[0];
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            dswl dswlVar3 = (dswl) bZ2.b;
                            str7.getClass();
                            dswlVar3.a = 4 | dswlVar3.a;
                            dswlVar3.e = str7;
                        }
                    } else {
                        c = c2;
                        str = str3;
                        str2 = str4;
                        i2 = length;
                    }
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dswn dswnVar = (dswn) bZ.b;
                    dswl bK = bZ2.bK();
                    bK.getClass();
                    dsrj<dswl> dsrjVar = dswnVar.a;
                    if (!dsrjVar.a()) {
                        dswnVar.a = dsqw.cl(dsrjVar);
                    }
                    dswnVar.a.add(bK);
                    i4++;
                    strArr2 = strArr;
                    c2 = c;
                    str3 = str;
                    str4 = str2;
                    length = i2;
                    i3 = 1;
                    z = false;
                }
                d.setTransactionSuccessful();
            } finally {
                d.endTransaction();
            }
        }
        return bZ.bK().bS();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:60:0x0070
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public boolean incrementUsage(java.lang.String r20, java.lang.String r21, long r22) {
        /*
            r19 = this;
            r1 = r19
            android.database.sqlite.SQLiteDatabase r2 = r19.d()
            r5 = 1
            r6 = 0
            if (r2 == 0) goto Lb3
            r2.beginTransactionNonExclusive()
            r0 = 3
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            r15[r6] = r20     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            r15[r5] = r21     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            r0 = 2
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            r15[r0] = r7     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            java.lang.String r0 = "num_times_used"
            java.lang.String r11 = "data_type = ? AND key = ? AND timestamp_micro = ?"
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            r14.<init>()     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            android.database.sqlite.SQLiteDatabase r7 = r19.d()     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            if (r7 == 0) goto L70
            java.lang.String[] r10 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            r10[r6] = r0     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            r8 = 1
            java.lang.String r9 = "geller_key_table"
            java.lang.String r13 = "data_id"
            r16 = 0
            java.lang.String r17 = "timestamp_micro DESC"
            r18 = 0
            r12 = r15
            r3 = r14
            r14 = r16
            r4 = r15
            r15 = r17
            r16 = r18
            android.database.Cursor r7 = r7.query(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.IllegalArgumentException -> L72 java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
        L46:
            boolean r8 = r7.moveToNext()     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto L5c
            int r8 = r7.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L62
            long r8 = r7.getLong(r8)     // Catch: java.lang.Throwable -> L62
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L62
            r3.add(r8)     // Catch: java.lang.Throwable -> L62
            goto L46
        L5c:
            if (r7 == 0) goto L72
            r7.close()     // Catch: java.lang.IllegalArgumentException -> L72 java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            goto L72
        L62:
            r0 = move-exception
            r8 = r0
            if (r7 == 0) goto L6f
            r7.close()     // Catch: java.lang.Throwable -> L6a
            goto L6f
        L6a:
            r0 = move-exception
            r7 = r0
            defpackage.deki.a(r8, r7)     // Catch: java.lang.IllegalArgumentException -> L72 java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
        L6f:
            throw r8     // Catch: java.lang.IllegalArgumentException -> L72 java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
        L70:
            r3 = r14
            r4 = r15
        L72:
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            if (r0 == 0) goto L7c
            r2.endTransaction()
            return r6
        L7c:
            int r0 = r3.size()     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            if (r0 <= r5) goto L86
            r2.endTransaction()
            return r6
        L86:
            java.lang.String r0 = "data_type = ? AND key = ? AND timestamp_micro = ?"
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            long r7 = r3.longValue()     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            r9 = 1
            long r7 = r7 + r9
            long r3 = r1.m(r0, r4, r7)     // Catch: java.lang.Throwable -> La1 android.database.sqlite.SQLiteException -> La3 java.lang.IllegalStateException -> La5
            r2.setTransactionSuccessful()     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.IllegalStateException -> L9f java.lang.Throwable -> La1
            goto Lab
        L9d:
            r0 = move-exception
            goto La8
        L9f:
            r0 = move-exception
            goto La8
        La1:
            r0 = move-exception
            goto Laf
        La3:
            r0 = move-exception
            goto La6
        La5:
            r0 = move-exception
        La6:
            r3 = 0
        La8:
            r1.c(r0)     // Catch: java.lang.Throwable -> La1
        Lab:
            r2.endTransaction()
            goto Lb5
        Laf:
            r2.endTransaction()
            throw r0
        Lb3:
            r3 = 0
        Lb5:
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto Lbc
            return r5
        Lbc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.database.GellerDatabase.incrementUsage(java.lang.String, java.lang.String, long):boolean");
    }

    public long markSyncStatus(String str, byte[] bArr) {
        try {
            return a(str, (dsvx) dsqw.cr(dsvx.d, bArr, dsqa.c()));
        } catch (dsrm unused) {
            return 0L;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_data_table (_id INTEGER PRIMARY KEY, data BLOB NOT NULL);");
        int i = this.f;
        if (i == 1) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
        } else if (i <= 5) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, deletion_sync_status TEXT, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
        }
        sQLiteDatabase.execSQL("CREATE INDEX datatype_key_dataid ON geller_key_table (data_type, key, delete_status, data_id);");
        if (this.f >= 3) {
            sQLiteDatabase.execSQL("CREATE INDEX datatype_dataid ON geller_key_table (data_type, data_id);");
        }
        int i2 = this.f;
        if (i2 >= 5 && i2 <= 7) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, file_path TEXT NOT NULL);");
        }
        if (this.f >= 7) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_metadata_table (data_type TEXT NOT NULL, key TEXT NOT NULL, metadata TEXT NOT NULL);");
        }
        if (this.f >= 8) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, deletion_sync_status TEXT, file_path TEXT NOT NULL);");
        }
        sQLiteDatabase.setVersion(this.f);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f = i2;
        e(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        while (i < i2) {
            if (i == 1) {
                sQLiteDatabase.execSQL("ALTER TABLE geller_key_table ADD COLUMN num_times_used INTEGER;");
            } else if (i == 2) {
                sQLiteDatabase.execSQL("CREATE INDEX datatype_dataid ON geller_key_table (data_type, data_id);");
            } else if (i == 4) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, file_path TEXT NOT NULL);");
            } else if (i == 5) {
                sQLiteDatabase.execSQL("ALTER TABLE geller_key_table ADD COLUMN deletion_sync_status TEXT;");
            } else if (i == 6) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_metadata_table (data_type TEXT NOT NULL, key TEXT NOT NULL, metadata TEXT NOT NULL);");
            } else if (i == 7) {
                sQLiteDatabase.execSQL("ALTER TABLE geller_file_table ADD COLUMN deletion_sync_status TEXT;");
            }
            i++;
        }
        this.f = i2;
        sQLiteDatabase.setVersion(i2);
    }

    public byte[][] read(String str, String str2) {
        String[] strArr = {str, str2};
        if (h(str)) {
            return n("data_type = ? AND key = ? AND delete_status IS NULL", strArr, dbpy.a);
        }
        return p("data_type = ? AND key = ? AND delete_status IS NULL", strArr);
    }

    public byte[][] readAll(String str) {
        String[] strArr = {str};
        if (h(str)) {
            return n("data_type = ? AND timestamp_micro > 0", strArr, dbpy.a);
        }
        return p("data_type = ? AND timestamp_micro > 0", strArr);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:72:0x0122
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public byte[] readAndClearKeyUsage(java.lang.String r24, java.lang.String[] r25) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.database.GellerDatabase.readAndClearKeyUsage(java.lang.String, java.lang.String[]):byte[]");
    }

    public long readDataUsage(String str, String str2, long j) {
        try {
            String[] strArr = {str, str2, String.valueOf(j)};
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase d = d();
            if (d != null) {
                Cursor rawQuery = d.rawQuery(String.format("SELECT SUM(%s) AS num_times_used FROM (SELECT DISTINCT %s FROM %s WHERE %s) distinct_data_ids INNER JOIN %s on %s = %s", u("num_times_used"), "data_id", "geller_key_table", "data_type = ? AND key = ? AND timestamp_micro = ?", "geller_key_table", "distinct_data_ids.data_id", u("data_id")), strArr);
                int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("num_times_used");
                while (rawQuery.moveToNext()) {
                    arrayList.add(Long.valueOf(rawQuery.getLong(columnIndexOrThrow)));
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            }
            if (arrayList.size() != 1) {
                return -1L;
            }
            return ((Long) arrayList.get(0)).longValue();
        } catch (SQLiteException | IllegalStateException e) {
            c(e);
            return -1L;
        }
    }

    public String[] readKeys(String str) {
        List<String> a2;
        SQLiteDatabase d = d();
        if (d != null) {
            try {
                String[] strArr = {str};
                new ArrayList();
                if (h(str)) {
                    a2 = cqzu.a(d, "geller_file_table", "key", "data_type = ? AND timestamp_micro > 0 AND delete_status IS NULL", strArr, dbpy.a, dbpy.a);
                } else {
                    a2 = cqzu.a(d, "geller_key_table", "key", "data_type = ? AND timestamp_micro > 0 AND delete_status IS NULL", strArr, dbpy.a, dbpy.a);
                }
                return (String[]) a2.toArray(new String[a2.size()]);
            } catch (SQLiteException | IllegalStateException e) {
                c(e);
            }
        }
        return new String[0];
    }

    public String[] readMetadata(String str, String str2) {
        SQLiteDatabase d = d();
        if (d != null) {
            try {
                List<String> a2 = cqzu.a(d, "geller_metadata_table", "metadata", "data_type = ? AND key = ?", new String[]{str, str2}, dbpy.a, dbpy.a);
                return (String[]) a2.toArray(new String[a2.size()]);
            } catch (SQLiteException | IllegalStateException e) {
                c(e);
            }
        }
        return new String[0];
    }

    public byte[][] readOutdatedData(String str) {
        boolean h = h(str);
        StringBuilder sb = new StringBuilder("data_type = ? AND timestamp_micro > 0".length() + 9 + "delete_status".length());
        sb.append("data_type = ? AND timestamp_micro > 0");
        sb.append(" AND ");
        sb.append("delete_status");
        sb.append(" = ?");
        String sb2 = sb.toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add("DELETION_PROCESSED");
        try {
            if (q(str)) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 14 + "deletion_sync_status".length());
                sb3.append(valueOf);
                sb3.append(" AND (( ");
                sb3.append("deletion_sync_status");
                sb3.append(" = ? )");
                String sb4 = sb3.toString();
                arrayList.add("DELETION_SYNCED");
                String valueOf2 = String.valueOf(sb4);
                int length = String.valueOf(valueOf2).length();
                StringBuilder sb5 = new StringBuilder(length + 30 + "deletion_sync_status".length() + "sync_status".length());
                sb5.append(valueOf2);
                sb5.append(" OR ( ");
                sb5.append("deletion_sync_status");
                sb5.append(" IS NULL AND ");
                sb5.append("sync_status");
                sb5.append(" IS NULL ))");
                sb2 = sb5.toString();
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (h) {
                return n(sb2, strArr, dbpy.a);
            }
            return p(sb2, strArr);
        } catch (IllegalStateException unused) {
            return new byte[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x017d A[Catch: all -> 0x018e, SQLiteException -> 0x0190, SQLiteException | IllegalStateException -> 0x0192, TryCatch #4 {all -> 0x018e, blocks: (B:8:0x002e, B:11:0x0039, B:12:0x004c, B:14:0x0052, B:15:0x0061, B:17:0x0067, B:18:0x0079, B:19:0x0081, B:21:0x0087, B:23:0x008d, B:25:0x0099, B:27:0x00bc, B:28:0x00c1, B:71:0x018a, B:79:0x0195, B:36:0x00d0, B:38:0x00dc, B:40:0x00e0, B:42:0x00e7, B:44:0x00ef, B:67:0x017d, B:68:0x0182, B:41:0x00e5, B:45:0x00f4, B:47:0x00f8, B:49:0x00ff, B:52:0x010b, B:54:0x011b, B:55:0x0120, B:56:0x0126, B:58:0x012e, B:60:0x0134, B:61:0x013c, B:63:0x0150, B:64:0x0155, B:65:0x015a, B:48:0x00fd), top: B:86:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0182 A[Catch: all -> 0x018e, SQLiteException -> 0x0190, SQLiteException | IllegalStateException -> 0x0192, TRY_LEAVE, TryCatch #4 {all -> 0x018e, blocks: (B:8:0x002e, B:11:0x0039, B:12:0x004c, B:14:0x0052, B:15:0x0061, B:17:0x0067, B:18:0x0079, B:19:0x0081, B:21:0x0087, B:23:0x008d, B:25:0x0099, B:27:0x00bc, B:28:0x00c1, B:71:0x018a, B:79:0x0195, B:36:0x00d0, B:38:0x00dc, B:40:0x00e0, B:42:0x00e7, B:44:0x00ef, B:67:0x017d, B:68:0x0182, B:41:0x00e5, B:45:0x00f4, B:47:0x00f8, B:49:0x00ff, B:52:0x010b, B:54:0x011b, B:55:0x0120, B:56:0x0126, B:58:0x012e, B:60:0x0134, B:61:0x013c, B:63:0x0150, B:64:0x0155, B:65:0x015a, B:48:0x00fd), top: B:86:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long softDelete(java.lang.String r16, byte[] r17) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.portable.database.GellerDatabase.softDelete(java.lang.String, byte[]):long");
    }

    public boolean write(String str, String[] strArr, long j, boolean z, byte[] bArr) {
        if (strArr.length == 0) {
            return false;
        }
        int length = bArr.length;
        Arrays.toString(strArr);
        SQLiteDatabase d = d();
        if (d == null) {
            return false;
        }
        try {
            return i(str).b(dbsg.i(d), str, strArr, j, z, bArr);
        } catch (SQLiteException e) {
            c(e);
            return false;
        }
    }

    public boolean writeMetadata(String str, String str2, String str3) {
        SQLiteDatabase d = d();
        if (d != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("data_type", str);
                contentValues.put("key", str2);
                contentValues.put("metadata", str3);
                return d.insertOrThrow("geller_metadata_table", null, contentValues) >= 0;
            } catch (SQLiteException e) {
                c(e);
            }
        }
        return false;
    }

    public byte[][] read(String str, boolean z, boolean z2) {
        String sb;
        String sb2;
        boolean h = h(str);
        String concat = "data_type = ? AND timestamp_micro > 0".concat(" AND ");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (z) {
            String valueOf = String.valueOf(concat);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 9 + "sync_status".length());
            sb3.append(valueOf);
            sb3.append("sync_status");
            sb3.append(" = ? AND ");
            sb = sb3.toString();
            arrayList.add("SYNCED");
        } else {
            String valueOf2 = String.valueOf(concat);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 13 + "sync_status".length());
            sb4.append(valueOf2);
            sb4.append("sync_status");
            sb4.append(" IS NULL AND ");
            sb = sb4.toString();
        }
        if (z2) {
            String valueOf3 = String.valueOf(sb);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 4 + "delete_status".length());
            sb5.append(valueOf3);
            sb5.append("delete_status");
            sb5.append(" = ?");
            sb2 = sb5.toString();
            arrayList.add("PENDING_DELETE");
        } else {
            String valueOf4 = String.valueOf(sb);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf4).length() + 8 + "delete_status".length());
            sb6.append(valueOf4);
            sb6.append("delete_status");
            sb6.append(" IS NULL");
            sb2 = sb6.toString();
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (h) {
            return n(sb2, strArr, dbpy.a);
        }
        return p(sb2, strArr);
    }

    public long delete(String str, String str2) {
        dcqe.b.u(TimeUnit.MILLISECONDS);
        try {
            if (h(str)) {
                return j("data_type = ? AND key = ?", new String[]{str, str2});
            }
            return k("data_type = ? AND key = ?", new String[]{str, str2});
        } catch (SQLiteException | IllegalStateException e) {
            c(e);
            return 0L;
        }
    }

    public long delete(String str, String[] strArr, long j) {
        int length = strArr.length;
        Arrays.toString(strArr);
        try {
            String str2 = "data_type = ? AND timestamp_micro = ?";
            if (h(str)) {
                if (strArr != null && length > 0) {
                    String s = s("key", "IN", Arrays.asList(strArr));
                    StringBuilder sb = new StringBuilder(42 + String.valueOf(s).length());
                    sb.append(str2);
                    sb.append(" AND ");
                    sb.append(s);
                    str2 = sb.toString();
                }
                return j(str2, new String[]{str, String.valueOf(j)});
            }
            if (strArr != null && length > 0) {
                String s2 = s("key", "IN", Arrays.asList(strArr));
                StringBuilder sb2 = new StringBuilder(42 + String.valueOf(s2).length());
                sb2.append(str2);
                sb2.append(" AND ");
                sb2.append(s2);
                str2 = sb2.toString();
            }
            return k(str2, new String[]{str, String.valueOf(j)});
        } catch (SQLiteException | IllegalStateException e) {
            c(e);
            return 0L;
        }
    }

    public byte[][] read(String str, byte[] bArr) {
        dbsg<Integer> dbsgVar;
        try {
            dswb dswbVar = (dswb) dsqw.cr(dswb.e, bArr, dsqa.c());
            boolean h = h(str);
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(str);
                String str2 = "data_type = ? AND timestamp_micro > 0 AND delete_status IS NULL";
                if ((dswbVar.a & 1) != 0) {
                    str2 = str2.concat(" AND key = ?");
                    arrayList.add(dswbVar.b);
                }
                if ((dswbVar.a & 4) != 0) {
                    String valueOf = String.valueOf(str2);
                    str2 = " AND timestamp_micro >= ? AND timestamp_micro <= ?".length() != 0 ? valueOf.concat(" AND timestamp_micro >= ? AND timestamp_micro <= ?") : new String(valueOf);
                    dswa dswaVar = dswbVar.d;
                    if (dswaVar == null) {
                        dswaVar = dswa.c;
                    }
                    arrayList.add(String.valueOf(dswaVar.a));
                    dswa dswaVar2 = dswbVar.d;
                    if (dswaVar2 == null) {
                        dswaVar2 = dswa.c;
                    }
                    arrayList.add(String.valueOf(dswaVar2.b));
                }
                if (h) {
                    if ((dswbVar.a & 2) != 0) {
                        dbsgVar = dbsg.i(Integer.valueOf(dswbVar.c));
                    } else {
                        dbsgVar = dbpy.a;
                    }
                    return n(str2, (String[]) arrayList.toArray(new String[arrayList.size()]), dbsgVar);
                } else if ((dswbVar.a & 2) != 0) {
                    String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                    int i = dswbVar.c;
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase d = d();
                    if (d != null) {
                        String format = String.format("SELECT %s FROM (%s) distinct_data_ids INNER JOIN %s ON %s = %s", t("data"), String.format("SELECT DISTINCT %s FROM %s T1 WHERE (%s) AND %s IN (SELECT %s FROM %s WHERE (%s) AND %s = T1.%s ORDER BY %s DESC LIMIT %s) ORDER BY %s DESC", "data_id", "geller_key_table", str2, "data_id", "data_id", "geller_key_table", str2, "key", "key", "timestamp_micro", String.valueOf(i), "timestamp_micro"), "geller_data_table", "distinct_data_ids.data_id", t("_id"));
                        dccx F = dcdc.F();
                        F.i(Arrays.asList(strArr));
                        F.i(Arrays.asList(strArr));
                        try {
                            Cursor rawQuery = d.rawQuery(format, (String[]) F.f().toArray(new String[0]));
                            try {
                                int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("data");
                                while (rawQuery.moveToNext()) {
                                    arrayList2.add(rawQuery.getBlob(columnIndexOrThrow));
                                }
                                if (rawQuery != null) {
                                    rawQuery.close();
                                }
                            } catch (Throwable th) {
                                if (rawQuery != null) {
                                    try {
                                        rawQuery.close();
                                    } catch (Throwable th2) {
                                        deki.a(th, th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (SQLiteException | IllegalStateException e) {
                            c(e);
                            throw new cqzl(drtc.ABORTED, e.getMessage());
                        }
                    }
                    return (byte[][]) arrayList2.toArray(new byte[arrayList2.size()]);
                } else {
                    return p(str2, (String[]) arrayList.toArray(new String[arrayList.size()]));
                }
            } catch (dsrm unused) {
                return readAll(str);
            }
        } catch (dsrm unused2) {
        }
    }
}
