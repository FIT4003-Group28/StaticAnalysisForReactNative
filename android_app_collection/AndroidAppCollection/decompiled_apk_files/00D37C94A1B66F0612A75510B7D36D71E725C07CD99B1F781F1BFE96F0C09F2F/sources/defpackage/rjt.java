package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rjt  reason: default package */
/* loaded from: classes4.dex */
public final class rjt extends rpf {
    public static final String[] a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] b = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] c = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};
    public static final String[] d = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] e = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] f = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] g = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] h = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public final rpb i;
    private final rjs k;

    public rjt(rpn rpnVar) {
        super(rpnVar);
        Q();
        this.i = new rpb();
        l();
        this.k = new rjs(this, I());
    }

    static final void H(ContentValues contentValues, Object obj) {
        qnm.l("value");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean A() {
        return I().getDatabasePath(l()).exists();
    }

    public final boolean B(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        n();
        V();
        String str = conditionalUserPropertyParcel.a;
        qnm.b(str);
        if (j(str, conditionalUserPropertyParcel.c.b) == null) {
            long a2 = a("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            J();
            if (a2 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", conditionalUserPropertyParcel.b);
        contentValues.put("name", conditionalUserPropertyParcel.c.b);
        Object a3 = conditionalUserPropertyParcel.c.a();
        qnm.b(a3);
        H(contentValues, a3);
        contentValues.put("active", Boolean.valueOf(conditionalUserPropertyParcel.e));
        contentValues.put("trigger_event_name", conditionalUserPropertyParcel.f);
        contentValues.put("trigger_timeout", Long.valueOf(conditionalUserPropertyParcel.h));
        contentValues.put("timed_out_event", N().at(conditionalUserPropertyParcel.g));
        contentValues.put("creation_timestamp", Long.valueOf(conditionalUserPropertyParcel.d));
        contentValues.put("triggered_event", N().at(conditionalUserPropertyParcel.i));
        contentValues.put("triggered_timestamp", Long.valueOf(conditionalUserPropertyParcel.c.c));
        contentValues.put("time_to_live", Long.valueOf(conditionalUserPropertyParcel.j));
        contentValues.put("expired_event", N().at(conditionalUserPropertyParcel.k));
        try {
            if (d().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                aG().c.b("Failed to insert/update conditional user property (got -1)", rks.a(str));
            }
        } catch (SQLiteException e2) {
            aG().c.c("Error storing conditional user property", rks.a(str), e2);
        }
        return true;
    }

    public final boolean C(rpq rpqVar) {
        n();
        V();
        if (j(rpqVar.a, rpqVar.c) == null) {
            if (rps.ao(rpqVar.c)) {
                if (a("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{rpqVar.a}) >= J().f(rpqVar.a, rkg.G, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(rpqVar.c)) {
                long a2 = a("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{rpqVar.a, rpqVar.b});
                J();
                if (a2 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", rpqVar.a);
        contentValues.put("origin", rpqVar.b);
        contentValues.put("name", rpqVar.c);
        contentValues.put("set_timestamp", Long.valueOf(rpqVar.d));
        H(contentValues, rpqVar.e);
        try {
            if (d().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                aG().c.b("Failed to insert/update user property (got -1). appId", rks.a(rpqVar.a));
            }
        } catch (SQLiteException e2) {
            aG().c.c("Error storing user property. appId", rks.a(rpqVar.a), e2);
        }
        return true;
    }

    public final rjr D(long j, String str, boolean z, boolean z2) {
        return h(j, str, 1L, false, false, z, false, z2);
    }

    public final void E(String str, String str2) {
        qnm.l(str);
        qnm.l(str2);
        n();
        V();
        try {
            d().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            aG().c.d("Error deleting conditional property", rks.a(str), L().e(str2), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x02b9: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:122:0x02b9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    public final void F(long j, long j2, rpm rpmVar) {
        ?? r3;
        Cursor cursor;
        Cursor rawQuery;
        String string;
        String str;
        String[] strArr;
        rqg rqgVar;
        n();
        V();
        Cursor cursor2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        try {
            try {
                SQLiteDatabase d2 = d();
                r3 = TextUtils.isEmpty(null);
                String str3 = "";
                ?? r12 = -1;
                ?? r122 = -1;
                try {
                    if (r3 != 0) {
                        String[] strArr2 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                        if (j2 != -1) {
                            str3 = "rowid <= ? and ";
                        }
                        StringBuilder sb = new StringBuilder(str3.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str3);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        rawQuery = d2.rawQuery(sb.toString(), strArr2);
                        if (!rawQuery.moveToFirst()) {
                            if (rawQuery == null) {
                                return;
                            }
                            rawQuery.close();
                            return;
                        }
                        str2 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        String[] strArr3 = j2 != -1 ? new String[]{null, String.valueOf(j2)} : new String[]{null};
                        if (j2 != -1) {
                            str3 = " and rowid <= ?";
                        }
                        StringBuilder sb2 = new StringBuilder(str3.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str3);
                        sb2.append(" order by rowid limit 1;");
                        rawQuery = d2.rawQuery(sb2.toString(), strArr3);
                        if (!rawQuery.moveToFirst()) {
                            if (rawQuery == null) {
                                return;
                            }
                            rawQuery.close();
                            return;
                        }
                        string = rawQuery.getString(0);
                        rawQuery.close();
                    }
                    Cursor cursor3 = rawQuery;
                    String str4 = string;
                    try {
                        Cursor query = d2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, str4}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                aG().c.b("Raw event metadata record is missing. appId", rks.a(str2));
                                if (query == null) {
                                    return;
                                }
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    rqk rqkVar = (rqk) ((aopa) rpp.h(rqk.a.createBuilder(), query.getBlob(0))).mo39build();
                                    if (query.moveToNext()) {
                                        aG().f.b("Get multiple raw event metadata records, expected one. appId", rks.a(str2));
                                    }
                                    query.close();
                                    qnm.b(rqkVar);
                                    rpmVar.a = rqkVar;
                                    if (j2 != -1) {
                                        str = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{str2, str4, String.valueOf(j2)};
                                    } else {
                                        str = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{str2, str4};
                                    }
                                    Cursor query2 = d2.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str, strArr, null, null, "rowid", null);
                                    if (!query2.moveToFirst()) {
                                        aG().f.b("Raw event data disappeared while in transaction. appId", rks.a(str2));
                                        if (query2 == null) {
                                            return;
                                        }
                                        query2.close();
                                        return;
                                    }
                                    do {
                                        long j3 = query2.getLong(0);
                                        try {
                                            rqf rqfVar = (rqf) rpp.h(rqg.e(), query2.getBlob(3));
                                            String string2 = query2.getString(1);
                                            rqfVar.copyOnWrite();
                                            ((rqg) rqfVar.instance).z(string2);
                                            long j4 = query2.getLong(2);
                                            rqfVar.copyOnWrite();
                                            ((rqg) rqfVar.instance).C(j4);
                                            rqgVar = (rqg) rqfVar.mo39build();
                                            qnm.b(rqgVar);
                                            if (rpmVar.c == null) {
                                                rpmVar.c = new ArrayList();
                                            }
                                            if (rpmVar.b == null) {
                                                rpmVar.b = new ArrayList();
                                            }
                                        } catch (IOException e2) {
                                            aG().c.c("Data loss. Failed to merge raw event. appId", rks.a(str2), e2);
                                        }
                                        if (rpmVar.c.size() <= 0 || rpm.a((rqg) rpmVar.c.get(0)) == rpm.a(rqgVar)) {
                                            long serializedSize = rpmVar.d + rqgVar.getSerializedSize();
                                            rpmVar.e.f();
                                            if (serializedSize < Math.max(0, ((Integer) rkg.i.a()).intValue())) {
                                                rpmVar.d = serializedSize;
                                                rpmVar.c.add(rqgVar);
                                                rpmVar.b.add(Long.valueOf(j3));
                                                int size = rpmVar.c.size();
                                                rpmVar.e.f();
                                                if (size >= Math.max(1, ((Integer) rkg.j.a()).intValue())) {
                                                }
                                            }
                                        }
                                        if (query2 == null) {
                                            return;
                                        }
                                        query2.close();
                                        return;
                                    } while (query2.moveToNext());
                                    if (query2 == null) {
                                        return;
                                    }
                                    query2.close();
                                } catch (IOException e3) {
                                    aG().c.c("Data loss. Failed to merge raw event metadata. appId", rks.a(str2), e3);
                                    if (query == null) {
                                        return;
                                    }
                                    query.close();
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                r3 = r122;
                                aG().c.c("Data loss. Error selecting raw event. appId", rks.a(str2), e);
                                if (r3 == 0) {
                                    return;
                                }
                                r3.close();
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = r12;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                            r122 = query;
                        } catch (Throwable th2) {
                            th = th2;
                            r12 = query;
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        r3 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e8) {
            e = e8;
            r3 = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void G(String str, Long l, long j, rqg rqgVar) {
        n();
        V();
        qnm.b(rqgVar);
        qnm.l(str);
        byte[] byteArray = rqgVar.toByteArray();
        aG().k.c("Saving complex main event, appId, data size", L().c(str), Integer.valueOf(byteArray.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", byteArray);
        try {
            if (d().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return;
            }
            aG().c.b("Failed to insert complex main event (got -1). appId", rks.a(str));
        } catch (SQLiteException e2) {
            aG().c.c("Error storing complex main event. appId", rks.a(str), e2);
        }
    }

    public final long a(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = d().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e2) {
                aG().c.c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // defpackage.rpf
    protected final void b() {
    }

    public final long c(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = d().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e2) {
                aG().c.c("Database error", str, e2);
                throw e2;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase d() {
        n();
        try {
            return this.k.getWritableDatabase();
        } catch (SQLiteException e2) {
            aG().f.b("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00be: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:47:0x00be */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle e(java.lang.String r8) {
        /*
            r7 = this;
            r7.n()
            r7.V()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.d()     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteException -> Laa
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteException -> Laa
            r3 = 0
            r2[r3] = r8     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteException -> Laa
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteException -> Laa
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            if (r2 != 0) goto L2e
            rks r8 = r7.aG()     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            rkq r8 = r8.k     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            if (r1 == 0) goto L2d
            r1.close()
        L2d:
            return r0
        L2e:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            rqf r3 = defpackage.rqg.e()     // Catch: java.io.IOException -> L90 android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            aoqt r2 = defpackage.rpp.h(r3, r2)     // Catch: java.io.IOException -> L90 android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            rqf r2 = (defpackage.rqf) r2     // Catch: java.io.IOException -> L90 android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            aopi r2 = r2.mo39build()     // Catch: java.io.IOException -> L90 android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            rqg r2 = (defpackage.rqg) r2     // Catch: java.io.IOException -> L90 android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            r7.U()     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            java.util.List r8 = r2.i()     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
        L52:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            rqi r3 = (defpackage.rqi) r3     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            java.lang.String r4 = r3.c     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            int r5 = r3.b     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            r6 = r5 & 16
            if (r6 == 0) goto L6c
            double r5 = r3.g     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            goto L52
        L6c:
            r6 = r5 & 8
            if (r6 == 0) goto L76
            float r3 = r3.f     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            goto L52
        L76:
            r6 = r5 & 2
            if (r6 == 0) goto L80
            java.lang.String r3 = r3.d     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            goto L52
        L80:
            r5 = r5 & 4
            if (r5 == 0) goto L52
            long r5 = r3.e     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            goto L52
        L8a:
            if (r1 == 0) goto L8f
            r1.close()
        L8f:
            return r2
        L90:
            r2 = move-exception
            rks r3 = r7.aG()     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            rkq r3 = r3.c     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = defpackage.rks.a(r8)     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            r3.c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> La6 java.lang.Throwable -> Lbd
            if (r1 == 0) goto La5
            r1.close()
        La5:
            return r0
        La6:
            r8 = move-exception
            goto Lac
        La8:
            r8 = move-exception
            goto Lbf
        Laa:
            r8 = move-exception
            r1 = r0
        Lac:
            rks r2 = r7.aG()     // Catch: java.lang.Throwable -> Lbd
            rkq r2 = r2.c     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> Lbd
            if (r1 == 0) goto Lbc
            r1.close()
        Lbc:
            return r0
        Lbd:
            r8 = move-exception
            r0 = r1
        Lbf:
            if (r0 == 0) goto Lc4
            r0.close()
        Lc4:
            goto Lc6
        Lc5:
            throw r8
        Lc6:
            goto Lc5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjt.e(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01dc A[Catch: SQLiteException -> 0x02e5, all -> 0x030c, TryCatch #1 {SQLiteException -> 0x02e5, blocks: (B:11:0x00ea, B:13:0x0145, B:18:0x014f, B:22:0x0168, B:26:0x0183, B:30:0x019e, B:34:0x01b9, B:38:0x01e1, B:42:0x0203, B:46:0x021e, B:48:0x0238, B:52:0x0247, B:51:0x0243, B:53:0x024a, B:55:0x0252, B:60:0x025c, B:64:0x0277, B:66:0x0282, B:68:0x029e, B:70:0x02a2, B:72:0x02a9, B:73:0x02ab, B:75:0x02ba, B:76:0x02c3, B:78:0x02d0, B:63:0x0273, B:37:0x01dc), top: B:101:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0238 A[Catch: SQLiteException -> 0x02e5, all -> 0x030c, TryCatch #1 {SQLiteException -> 0x02e5, blocks: (B:11:0x00ea, B:13:0x0145, B:18:0x014f, B:22:0x0168, B:26:0x0183, B:30:0x019e, B:34:0x01b9, B:38:0x01e1, B:42:0x0203, B:46:0x021e, B:48:0x0238, B:52:0x0247, B:51:0x0243, B:53:0x024a, B:55:0x0252, B:60:0x025c, B:64:0x0277, B:66:0x0282, B:68:0x029e, B:70:0x02a2, B:72:0x02a9, B:73:0x02ab, B:75:0x02ba, B:76:0x02c3, B:78:0x02d0, B:63:0x0273, B:37:0x01dc), top: B:101:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0273 A[Catch: SQLiteException -> 0x02e5, all -> 0x030c, TryCatch #1 {SQLiteException -> 0x02e5, blocks: (B:11:0x00ea, B:13:0x0145, B:18:0x014f, B:22:0x0168, B:26:0x0183, B:30:0x019e, B:34:0x01b9, B:38:0x01e1, B:42:0x0203, B:46:0x021e, B:48:0x0238, B:52:0x0247, B:51:0x0243, B:53:0x024a, B:55:0x0252, B:60:0x025c, B:64:0x0277, B:66:0x0282, B:68:0x029e, B:70:0x02a2, B:72:0x02a9, B:73:0x02ab, B:75:0x02ba, B:76:0x02c3, B:78:0x02d0, B:63:0x0273, B:37:0x01dc), top: B:101:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0282 A[Catch: SQLiteException -> 0x02e5, all -> 0x030c, TryCatch #1 {SQLiteException -> 0x02e5, blocks: (B:11:0x00ea, B:13:0x0145, B:18:0x014f, B:22:0x0168, B:26:0x0183, B:30:0x019e, B:34:0x01b9, B:38:0x01e1, B:42:0x0203, B:46:0x021e, B:48:0x0238, B:52:0x0247, B:51:0x0243, B:53:0x024a, B:55:0x0252, B:60:0x025c, B:64:0x0277, B:66:0x0282, B:68:0x029e, B:70:0x02a2, B:72:0x02a9, B:73:0x02ab, B:75:0x02ba, B:76:0x02c3, B:78:0x02d0, B:63:0x0273, B:37:0x01dc), top: B:101:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ba A[Catch: SQLiteException -> 0x02e5, all -> 0x030c, TryCatch #1 {SQLiteException -> 0x02e5, blocks: (B:11:0x00ea, B:13:0x0145, B:18:0x014f, B:22:0x0168, B:26:0x0183, B:30:0x019e, B:34:0x01b9, B:38:0x01e1, B:42:0x0203, B:46:0x021e, B:48:0x0238, B:52:0x0247, B:51:0x0243, B:53:0x024a, B:55:0x0252, B:60:0x025c, B:64:0x0277, B:66:0x0282, B:68:0x029e, B:70:0x02a2, B:72:0x02a9, B:73:0x02ab, B:75:0x02ba, B:76:0x02c3, B:78:0x02d0, B:63:0x0273, B:37:0x01dc), top: B:101:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d0 A[Catch: SQLiteException -> 0x02e5, all -> 0x030c, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x02e5, blocks: (B:11:0x00ea, B:13:0x0145, B:18:0x014f, B:22:0x0168, B:26:0x0183, B:30:0x019e, B:34:0x01b9, B:38:0x01e1, B:42:0x0203, B:46:0x021e, B:48:0x0238, B:52:0x0247, B:51:0x0243, B:53:0x024a, B:55:0x0252, B:60:0x025c, B:64:0x0277, B:66:0x0282, B:68:0x029e, B:70:0x02a2, B:72:0x02a9, B:73:0x02ab, B:75:0x02ba, B:76:0x02c3, B:78:0x02d0, B:63:0x0273, B:37:0x01dc), top: B:101:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rix f(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjt.f(java.lang.String):rix");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel g(java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjt.g(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rjr h(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjt.h(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):rjr");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rjy i(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjt.i(java.lang.String, java.lang.String):rjy");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rpq j(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            defpackage.qnm.l(r19)
            defpackage.qnm.l(r20)
            r18.n()
            r18.V()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.d()     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            r14[r1] = r19     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            r14[r2] = r8     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            java.lang.String r11 = "user_attributes"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L85
            if (r0 != 0) goto L44
            if (r10 == 0) goto L43
            r10.close()
        L43:
            return r9
        L44:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L85
            r11 = r18
            java.lang.Object r7 = r11.k(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> Lae
            if (r7 != 0) goto L56
            if (r10 == 0) goto L55
            r10.close()
        L55:
            return r9
        L56:
            java.lang.String r3 = r10.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> Lae
            rpq r0 = new rpq     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> Lae
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> Lae
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> Lae
            if (r1 == 0) goto L79
            rks r1 = r18.aG()     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> Lae
            rkq r1 = r1.c     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> Lae
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = defpackage.rks.a(r19)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> Lae
            r1.b(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> Lae
        L79:
            if (r10 == 0) goto L7e
            r10.close()
        L7e:
            return r0
        L7f:
            r0 = move-exception
            goto L91
        L81:
            r0 = move-exception
            r11 = r18
            goto Laf
        L85:
            r0 = move-exception
            r11 = r18
            goto L91
        L89:
            r0 = move-exception
            r11 = r18
            goto Lb0
        L8d:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L91:
            rks r1 = r18.aG()     // Catch: java.lang.Throwable -> Lae
            rkq r1 = r1.c     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = defpackage.rks.a(r19)     // Catch: java.lang.Throwable -> Lae
            rkn r4 = r18.L()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r4 = r4.e(r8)     // Catch: java.lang.Throwable -> Lae
            r1.d(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Lae
            if (r10 == 0) goto Lad
            r10.close()
        Lad:
            return r9
        Lae:
            r0 = move-exception
        Laf:
            r9 = r10
        Lb0:
            if (r9 == 0) goto Lb5
            r9.close()
        Lb5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjt.j(java.lang.String, java.lang.String):rpq");
    }

    final Object k(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            aG().c.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type == 4) {
                aG().c.a("Loaded invalid blob type value, ignoring it");
                return null;
            }
            aG().c.b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String l() {
        J();
        return "google_app_measurement.db";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.d()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L26
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3a
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3a
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L29
        L24:
            r0 = move-exception
            goto L3e
        L26:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L29:
            rks r3 = r6.aG()     // Catch: java.lang.Throwable -> L3a
            rkq r3 = r3.c     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjt.m():java.lang.String");
    }

    public final List o(String str, String str2, String str3) {
        qnm.l(str);
        n();
        V();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return p(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x008a, code lost:
        r2 = aG().c;
        J();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List p(java.lang.String r44, java.lang.String[] r45) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjt.p(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List q(java.lang.String r23) {
        /*
            r22 = this;
            defpackage.qnm.l(r23)
            r22.n()
            r22.V()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r9 = "1000"
            r10 = 0
            android.database.sqlite.SQLiteDatabase r1 = r22.d()     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            java.lang.String r2 = "user_attributes"
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            java.lang.String r4 = "name"
            r11 = 0
            r3[r11] = r4     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            java.lang.String r4 = "origin"
            r12 = 1
            r3[r12] = r4     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            java.lang.String r4 = "set_timestamp"
            r13 = 2
            r3[r13] = r4     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            java.lang.String r4 = "value"
            r14 = 3
            r3[r14] = r4     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            r5[r11] = r23     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            java.lang.String r8 = "rowid"
            r22.J()     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            if (r1 == 0) goto L8a
        L45:
            java.lang.String r18 = r10.getString(r11)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            java.lang.String r1 = r10.getString(r12)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            if (r1 != 0) goto L51
            java.lang.String r1 = ""
        L51:
            r17 = r1
            long r19 = r10.getLong(r13)     // Catch: java.lang.Throwable -> L92 android.database.sqlite.SQLiteException -> L96
            r1 = r22
            java.lang.Object r21 = r1.k(r10, r14)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            if (r21 != 0) goto L6f
            rks r2 = r22.aG()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            rkq r2 = r2.c     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            java.lang.String r3 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r4 = defpackage.rks.a(r23)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            r2.b(r3, r4)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            goto L7a
        L6f:
            rpq r2 = new rpq     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            r15 = r2
            r16 = r23
            r15.<init>(r16, r17, r18, r19, r21)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            r0.add(r2)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
        L7a:
            boolean r2 = r10.moveToNext()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            if (r2 != 0) goto L45
            if (r10 == 0) goto L85
            r10.close()
        L85:
            return r0
        L86:
            r0 = move-exception
            goto Lb2
        L88:
            r0 = move-exception
            goto L99
        L8a:
            r1 = r22
            if (r10 == 0) goto L91
            r10.close()
        L91:
            return r0
        L92:
            r0 = move-exception
            r1 = r22
            goto Lb2
        L96:
            r0 = move-exception
            r1 = r22
        L99:
            rks r2 = r22.aG()     // Catch: java.lang.Throwable -> L86
            rkq r2 = r2.c     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = "Error querying user properties. appId"
            java.lang.Object r4 = defpackage.rks.a(r23)     // Catch: java.lang.Throwable -> L86
            r2.c(r3, r4, r0)     // Catch: java.lang.Throwable -> L86
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L86
            if (r10 == 0) goto Lb1
            r10.close()
        Lb1:
            return r0
        Lb2:
            if (r10 == 0) goto Lb7
            r10.close()
        Lb7:
            goto Lb9
        Lb8:
            throw r0
        Lb9:
            goto Lb8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjt.q(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
        r2 = aG().c;
        J();
        r2.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List r(java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjt.r(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void s() {
        V();
        d().beginTransaction();
    }

    public final void t() {
        V();
        d().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        n();
        V();
        if (!A()) {
            return;
        }
        long a2 = T().a.a();
        Q();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(elapsedRealtime - a2);
        J();
        if (abs <= ((Long) rkg.y.a()).longValue()) {
            return;
        }
        T().a.b(elapsedRealtime);
        n();
        V();
        if (!A()) {
            return;
        }
        SQLiteDatabase d2 = d();
        Q();
        J();
        int delete = d2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(rjp.v())});
        if (delete <= 0) {
            return;
        }
        aG().k.b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
    }

    public final void v(String str, String str2) {
        qnm.l(str);
        qnm.l(str2);
        n();
        V();
        try {
            d().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            aG().c.d("Error deleting user property. appId", rks.a(str), L().e(str2), e2);
        }
    }

    public final void w() {
        V();
        d().setTransactionSuccessful();
    }

    public final void x(rix rixVar) {
        n();
        V();
        String m = rixVar.m();
        qnm.b(m);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", m);
        contentValues.put("app_instance_id", rixVar.n());
        contentValues.put("gmp_app_id", rixVar.s());
        contentValues.put("resettable_device_id_hash", rixVar.t());
        contentValues.put("last_bundle_index", Long.valueOf(rixVar.i()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(rixVar.j()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(rixVar.h()));
        contentValues.put("app_version", rixVar.p());
        contentValues.put("app_store", rixVar.o());
        contentValues.put("gmp_version", Long.valueOf(rixVar.g()));
        contentValues.put("dev_cert_hash", Long.valueOf(rixVar.d()));
        contentValues.put("measurement_enabled", Boolean.valueOf(rixVar.S()));
        rixVar.a.r();
        contentValues.put("day", Long.valueOf(rixVar.d));
        rixVar.a.r();
        contentValues.put("daily_public_events_count", Long.valueOf(rixVar.e));
        rixVar.a.r();
        contentValues.put("daily_events_count", Long.valueOf(rixVar.f));
        rixVar.a.r();
        contentValues.put("daily_conversions_count", Long.valueOf(rixVar.g));
        contentValues.put("config_fetched_time", Long.valueOf(rixVar.c()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(rixVar.f()));
        contentValues.put("app_version_int", Long.valueOf(rixVar.b()));
        contentValues.put("firebase_instance_id", rixVar.q());
        rixVar.a.r();
        contentValues.put("daily_error_events_count", Long.valueOf(rixVar.h));
        rixVar.a.r();
        contentValues.put("daily_realtime_events_count", Long.valueOf(rixVar.i));
        rixVar.a.r();
        contentValues.put("health_monitor_sample", rixVar.j);
        contentValues.put("android_id", Long.valueOf(rixVar.a()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(rixVar.R()));
        contentValues.put("admob_app_id", rixVar.l());
        contentValues.put("dynamite_version", Long.valueOf(rixVar.e()));
        List u = rixVar.u();
        if (u != null) {
            if (u.size() == 0) {
                aG().f.b("Safelisted events should not be an empty list. appId", m);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", u));
            }
        }
        axtf.b();
        if (J().p(m, rkg.ae)) {
            contentValues.put("ga_app_id", rixVar.r());
        }
        try {
            SQLiteDatabase d2 = d();
            if (d2.update("apps", contentValues, "app_id = ?", new String[]{m}) != 0 || d2.insertWithOnConflict("apps", null, contentValues, 5) != -1) {
                return;
            }
            aG().c.b("Failed to insert/update app (got -1). appId", rks.a(m));
        } catch (SQLiteException e2) {
            aG().c.c("Error storing app. appId", rks.a(m), e2);
        }
    }

    public final void y(rjy rjyVar) {
        qnm.b(rjyVar);
        n();
        V();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", rjyVar.a);
        contentValues.put("name", rjyVar.b);
        contentValues.put("lifetime_count", Long.valueOf(rjyVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(rjyVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rjyVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rjyVar.g));
        contentValues.put("last_bundled_day", rjyVar.h);
        contentValues.put("last_sampled_complex_event_id", rjyVar.i);
        contentValues.put("last_sampling_rate", rjyVar.j);
        contentValues.put("current_session_count", Long.valueOf(rjyVar.e));
        Boolean bool = rjyVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (d().insertWithOnConflict("events", null, contentValues, 5) != -1) {
                return;
            }
            aG().c.b("Failed to insert/update event aggregates (got -1). appId", rks.a(rjyVar.a));
        } catch (SQLiteException e2) {
            aG().c.c("Error storing event aggregates. appId", rks.a(rjyVar.a), e2);
        }
    }

    public final void z(String str, byte[] bArr, String str2) {
        qnm.l(str);
        n();
        V();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (d().update("apps", contentValues, "app_id = ?", new String[]{str}) != 0) {
                return;
            }
            aG().c.b("Failed to update remote config (got 0). appId", rks.a(str));
        } catch (SQLiteException e2) {
            aG().c.c("Error storing remote config. appId", rks.a(str), e2);
        }
    }
}
