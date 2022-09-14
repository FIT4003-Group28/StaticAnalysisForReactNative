package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import c.e.a.b.d.g.cb;
import c.e.a.b.d.g.r0;
import com.facebook.react.modules.appstate.AppStateModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends o9 {

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f7257f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f7258g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f7259h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    private static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d  reason: collision with root package name */
    private final f f7260d;

    /* renamed from: e  reason: collision with root package name */
    private final k9 f7261e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(r9 r9Var) {
        super(r9Var);
        this.f7261e = new k9(b());
        this.f7260d = new f(this, d(), "google_app_measurement.db");
    }

    private final boolean O() {
        return d().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long a(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            try {
                cursor = u().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j2;
            } catch (SQLiteException e2) {
                c().s().a("Database error", str, e2);
                throw e2;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final Object a(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            c().s().a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                c().s().a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            c().s().a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    private static void a(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        } else {
            contentValues.put(str, (Double) obj);
        }
    }

    private final boolean a(String str, int i2, c.e.a.b.d.g.r0 r0Var) {
        q();
        g();
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.a(r0Var);
        Integer num = null;
        if (TextUtils.isEmpty(r0Var.p())) {
            b4 v = c().v();
            Object a2 = z3.a(str);
            Integer valueOf = Integer.valueOf(i2);
            if (r0Var.n()) {
                num = Integer.valueOf(r0Var.o());
            }
            v.a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", a2, valueOf, String.valueOf(num));
            return false;
        }
        byte[] f2 = r0Var.f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", r0Var.n() ? Integer.valueOf(r0Var.o()) : null);
        contentValues.put("event_name", r0Var.p());
        contentValues.put("session_scoped", r0Var.x() ? Boolean.valueOf(r0Var.y()) : null);
        contentValues.put("data", f2);
        try {
            if (u().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            c().s().a("Failed to insert event filter (got -1). appId", z3.a(str));
            return true;
        } catch (SQLiteException e2) {
            c().s().a("Error storing event filter. appId", z3.a(str), e2);
            return false;
        }
    }

    private final boolean a(String str, int i2, c.e.a.b.d.g.u0 u0Var) {
        q();
        g();
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.a(u0Var);
        Integer num = null;
        if (TextUtils.isEmpty(u0Var.p())) {
            b4 v = c().v();
            Object a2 = z3.a(str);
            Integer valueOf = Integer.valueOf(i2);
            if (u0Var.n()) {
                num = Integer.valueOf(u0Var.o());
            }
            v.a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", a2, valueOf, String.valueOf(num));
            return false;
        }
        byte[] f2 = u0Var.f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", u0Var.n() ? Integer.valueOf(u0Var.o()) : null);
        contentValues.put("property_name", u0Var.p());
        contentValues.put("session_scoped", u0Var.t() ? Boolean.valueOf(u0Var.u()) : null);
        contentValues.put("data", f2);
        try {
            if (u().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            c().s().a("Failed to insert property filter (got -1). appId", z3.a(str));
            return false;
        } catch (SQLiteException e2) {
            c().s().a("Error storing property filter. appId", z3.a(str), e2);
            return false;
        }
    }

    private final long b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = u().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            } catch (SQLiteException e2) {
                c().s().a("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean b(String str, List<Integer> list) {
        com.google.android.gms.common.internal.s.b(str);
        q();
        g();
        SQLiteDatabase u = u();
        try {
            long b2 = b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, l().b(str, r.F)));
            if (b2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return u.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            c().s().a("Database error querying filters. appId", z3.a(str), e2);
            return false;
        }
    }

    public final boolean A() {
        return b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B() {
        int delete;
        g();
        q();
        if (!O()) {
            return;
        }
        long a2 = k().f7489h.a();
        long b2 = b().b();
        if (Math.abs(b2 - a2) <= r.y.a(null).longValue()) {
            return;
        }
        k().f7489h.a(b2);
        g();
        q();
        if (!O() || (delete = u().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(b().a()), String.valueOf(qa.v())})) <= 0) {
            return;
        }
        c().B().a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
    }

    public final long C() {
        return a("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    public final long D() {
        return a("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final boolean E() {
        return b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean F() {
        return b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long a(c.e.a.b.d.g.m1 m1Var) {
        g();
        q();
        com.google.android.gms.common.internal.s.a(m1Var);
        com.google.android.gms.common.internal.s.b(m1Var.p0());
        byte[] f2 = m1Var.f();
        long a2 = m().a(f2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", m1Var.p0());
        contentValues.put("metadata_fingerprint", Long.valueOf(a2));
        contentValues.put("metadata", f2);
        try {
            u().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return a2;
        } catch (SQLiteException e2) {
            c().s().a("Error storing raw event metadata. appId", z3.a(m1Var.p0()), e2);
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<c.e.a.b.d.g.i1, java.lang.Long> a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.g()
            r7.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.u()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7b
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7b
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7b
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7b
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            if (r2 != 0) goto L37
            com.google.android.gms.measurement.internal.z3 r8 = r7.c()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.b4 r8 = r8.B()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            c.e.a.b.d.g.i1$a r4 = c.e.a.b.d.g.i1.x()     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.v9.a(r4, r2)     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            c.e.a.b.d.g.i1$a r4 = (c.e.a.b.d.g.i1.a) r4     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            c.e.a.b.d.g.k6 r2 = r4.i()     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            c.e.a.b.d.g.b5 r2 = (c.e.a.b.d.g.b5) r2     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            c.e.a.b.d.g.i1 r2 = (c.e.a.b.d.g.i1) r2     // Catch: java.io.IOException -> L5e android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            return r8
        L5e:
            r2 = move-exception
            com.google.android.gms.measurement.internal.z3 r3 = r7.c()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.b4 r3 = r3.s()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.z3.a(r8)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            r3.a(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L90
            if (r1 == 0) goto L75
            r1.close()
        L75:
            return r0
        L76:
            r8 = move-exception
            goto L7d
        L78:
            r8 = move-exception
            r1 = r0
            goto L91
        L7b:
            r8 = move-exception
            r1 = r0
        L7d:
            com.google.android.gms.measurement.internal.z3 r9 = r7.c()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.b4 r9 = r9.s()     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "Error selecting main event"
            r9.a(r2, r8)     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8f
            r1.close()
        L8f:
            return r0
        L90:
            r8 = move-exception
        L91:
            if (r1 == 0) goto L96
            r1.close()
        L96:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final d a(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        com.google.android.gms.common.internal.s.b(str);
        g();
        q();
        String[] strArr = {str};
        d dVar = new d();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase u = u();
                Cursor query = u.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    c().v().a("Not updating daily counts, app is not known. appId", z3.a(str));
                    if (query != null) {
                        query.close();
                    }
                    return dVar;
                }
                if (query.getLong(0) == j2) {
                    dVar.f7227b = query.getLong(1);
                    dVar.f7226a = query.getLong(2);
                    dVar.f7228c = query.getLong(3);
                    dVar.f7229d = query.getLong(4);
                    dVar.f7230e = query.getLong(5);
                }
                if (z) {
                    dVar.f7227b += j3;
                }
                if (z2) {
                    dVar.f7226a += j3;
                }
                if (z3) {
                    dVar.f7228c += j3;
                }
                if (z4) {
                    dVar.f7229d += j3;
                }
                if (z5) {
                    dVar.f7230e += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(dVar.f7226a));
                contentValues.put("daily_events_count", Long.valueOf(dVar.f7227b));
                contentValues.put("daily_conversions_count", Long.valueOf(dVar.f7228c));
                contentValues.put("daily_error_events_count", Long.valueOf(dVar.f7229d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(dVar.f7230e));
                u.update("apps", contentValues, "app_id=?", strArr);
                if (query != null) {
                    query.close();
                }
                return dVar;
            } catch (SQLiteException e2) {
                c().s().a("Error updating daily counts. appId", z3.a(str), e2);
                if (0 != 0) {
                    cursor.close();
                }
                return dVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final d a(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return a(j2, str, 1L, false, false, z3, false, z5);
    }

    public final l a(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        boolean z;
        Cursor query;
        Boolean bool;
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.b(str2);
        g();
        q();
        try {
            try {
                z = false;
                query = u().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (!query.moveToFirst()) {
                    if (query != null) {
                        query.close();
                    }
                    return null;
                }
                long j2 = query.getLong(0);
                long j3 = query.getLong(1);
                long j4 = query.getLong(2);
                long j5 = query.isNull(3) ? 0L : query.getLong(3);
                Long valueOf = query.isNull(4) ? null : Long.valueOf(query.getLong(4));
                Long valueOf2 = query.isNull(5) ? null : Long.valueOf(query.getLong(5));
                Long valueOf3 = query.isNull(6) ? null : Long.valueOf(query.getLong(6));
                if (!query.isNull(7)) {
                    if (query.getLong(7) == 1) {
                        z = true;
                    }
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                cursor2 = query;
                try {
                    l lVar = new l(str, str2, j2, j3, query.isNull(8) ? 0L : query.getLong(8), j4, j5, valueOf, valueOf2, valueOf3, bool);
                    if (cursor2.moveToNext()) {
                        c().s().a("Got multiple records for event aggregates, expected one. appId", z3.a(str));
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return lVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    c().s().a("Error querying events. appId", z3.a(str), i().a(str2), e);
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursor2 = query;
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor2 = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(long r5) {
        /*
            r4 = this;
            r4.g()
            r4.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.u()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L43
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L43
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L43
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L43
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L43
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L58
            if (r1 != 0) goto L34
            com.google.android.gms.measurement.internal.z3 r6 = r4.c()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L58
            com.google.android.gms.measurement.internal.b4 r6 = r6.B()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L58
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L58
            if (r5 == 0) goto L33
            r5.close()
        L33:
            return r0
        L34:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L58
            if (r5 == 0) goto L3d
            r5.close()
        L3d:
            return r6
        L3e:
            r6 = move-exception
            goto L45
        L40:
            r6 = move-exception
            r5 = r0
            goto L59
        L43:
            r6 = move-exception
            r5 = r0
        L45:
            com.google.android.gms.measurement.internal.z3 r1 = r4.c()     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.measurement.internal.b4 r1 = r1.s()     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "Error selecting expired configs"
            r1.a(r2, r6)     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L57
            r5.close()
        L57:
            return r0
        L58:
            r6 = move-exception
        L59:
            if (r5 == 0) goto L5e
            r5.close()
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.a(long):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.aa> a(java.lang.String r14) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.s.b(r14)
            r13.g()
            r13.q()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.u()     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L85
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L85
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L85
            r12 = 0
            r6[r12] = r14     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L85
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L85
            boolean r3 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
            if (r3 != 0) goto L3f
            if (r2 == 0) goto L3e
            r2.close()
        L3e:
            return r0
        L3f:
            java.lang.String r7 = r2.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
            java.lang.String r3 = r2.getString(r11)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
            if (r3 != 0) goto L4b
            java.lang.String r3 = ""
        L4b:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
            r3 = 3
            java.lang.Object r10 = r13.a(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
            if (r10 != 0) goto L6a
            com.google.android.gms.measurement.internal.z3 r3 = r13.c()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
            com.google.android.gms.measurement.internal.b4 r3 = r3.s()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.z3.a(r14)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
            r3.a(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
            goto L74
        L6a:
            com.google.android.gms.measurement.internal.aa r3 = new com.google.android.gms.measurement.internal.aa     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
            r0.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
        L74:
            boolean r3 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lba
            if (r3 != 0) goto L3f
            if (r2 == 0) goto L7f
            r2.close()
        L7f:
            return r0
        L80:
            r0 = move-exception
            goto L87
        L82:
            r14 = move-exception
            r2 = r1
            goto Lbb
        L85:
            r0 = move-exception
            r2 = r1
        L87:
            com.google.android.gms.measurement.internal.z3 r3 = r13.c()     // Catch: java.lang.Throwable -> Lba
            com.google.android.gms.measurement.internal.b4 r3 = r3.s()     // Catch: java.lang.Throwable -> Lba
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.z3.a(r14)     // Catch: java.lang.Throwable -> Lba
            r3.a(r4, r5, r0)     // Catch: java.lang.Throwable -> Lba
            boolean r0 = c.e.a.b.d.g.ja.a()     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto Lb4
            com.google.android.gms.measurement.internal.qa r0 = r13.l()     // Catch: java.lang.Throwable -> Lba
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.r.T0     // Catch: java.lang.Throwable -> Lba
            boolean r14 = r0.e(r14, r3)     // Catch: java.lang.Throwable -> Lba
            if (r14 == 0) goto Lb4
            java.util.List r14 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto Lb3
            r2.close()
        Lb3:
            return r14
        Lb4:
            if (r2 == 0) goto Lb9
            r2.close()
        Lb9:
            return r1
        Lba:
            r14 = move-exception
        Lbb:
            if (r2 == 0) goto Lc0
            r2.close()
        Lc0:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.a(java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6 A[EDGE_INSN: B:57:0x00c6->B:39:0x00c6 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<android.util.Pair<c.e.a.b.d.g.m1, java.lang.Long>> a(java.lang.String r13, int r14, int r15) {
        /*
            r12 = this;
            r12.g()
            r12.q()
            r0 = 1
            r1 = 0
            if (r14 <= 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            com.google.android.gms.common.internal.s.a(r2)
            if (r15 <= 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            com.google.android.gms.common.internal.s.a(r2)
            com.google.android.gms.common.internal.s.b(r13)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.u()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            java.lang.String r4 = "queue"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "data"
            java.lang.String r7 = "retry_count"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r7[r1] = r13     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r11 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            boolean r14 = r2.moveToFirst()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            if (r14 != 0) goto L4e
            java.util.List r13 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            if (r2 == 0) goto L4d
            r2.close()
        L4d:
            return r13
        L4e:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r14.<init>()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r3 = 0
        L54:
            long r4 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            byte[] r6 = r2.getBlob(r0)     // Catch: java.io.IOException -> Lae java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            com.google.android.gms.measurement.internal.v9 r7 = r12.m()     // Catch: java.io.IOException -> Lae java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            byte[] r6 = r7.b(r6)     // Catch: java.io.IOException -> Lae java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            boolean r7 = r14.isEmpty()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            if (r7 != 0) goto L6e
            int r7 = r6.length     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            int r7 = r7 + r3
            if (r7 > r15) goto Lc6
        L6e:
            c.e.a.b.d.g.m1$a r7 = c.e.a.b.d.g.m1.s0()     // Catch: java.io.IOException -> L9b java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            com.google.android.gms.measurement.internal.v9.a(r7, r6)     // Catch: java.io.IOException -> L9b java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            c.e.a.b.d.g.m1$a r7 = (c.e.a.b.d.g.m1.a) r7     // Catch: java.io.IOException -> L9b java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r8 = 2
            boolean r9 = r2.isNull(r8)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            if (r9 != 0) goto L85
            int r8 = r2.getInt(r8)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r7.i(r8)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
        L85:
            int r6 = r6.length     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            int r3 = r3 + r6
            c.e.a.b.d.g.k6 r6 = r7.i()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            c.e.a.b.d.g.b5 r6 = (c.e.a.b.d.g.b5) r6     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            c.e.a.b.d.g.m1 r6 = (c.e.a.b.d.g.m1) r6     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            android.util.Pair r4 = android.util.Pair.create(r6, r4)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            r14.add(r4)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            goto Lbe
        L9b:
            r4 = move-exception
            com.google.android.gms.measurement.internal.z3 r5 = r12.c()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            com.google.android.gms.measurement.internal.b4 r5 = r5.s()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            java.lang.String r6 = "Failed to merge queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.z3.a(r13)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
        Laa:
            r5.a(r6, r7, r4)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            goto Lbe
        Lae:
            r4 = move-exception
            com.google.android.gms.measurement.internal.z3 r5 = r12.c()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            com.google.android.gms.measurement.internal.b4 r5 = r5.s()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            java.lang.String r6 = "Failed to unzip queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.z3.a(r13)     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            goto Laa
        Lbe:
            boolean r4 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lcc android.database.sqlite.SQLiteException -> Lce
            if (r4 == 0) goto Lc6
            if (r3 <= r15) goto L54
        Lc6:
            if (r2 == 0) goto Lcb
            r2.close()
        Lcb:
            return r14
        Lcc:
            r13 = move-exception
            goto Lea
        Lce:
            r14 = move-exception
            com.google.android.gms.measurement.internal.z3 r15 = r12.c()     // Catch: java.lang.Throwable -> Lcc
            com.google.android.gms.measurement.internal.b4 r15 = r15.s()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = "Error querying bundles. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.z3.a(r13)     // Catch: java.lang.Throwable -> Lcc
            r15.a(r0, r13, r14)     // Catch: java.lang.Throwable -> Lcc
            java.util.List r13 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lcc
            if (r2 == 0) goto Le9
            r2.close()
        Le9:
            return r13
        Lea:
            if (r2 == 0) goto Lef
            r2.close()
        Lef:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.a(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
        c().s().a("Read more than the max allowed user properties, ignoring excess", java.lang.Integer.valueOf((int) com.reactnativecommunity.webview.RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.aa> a(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        c().s().a("Read more than the max allowed conditional properties, ignoring extra", java.lang.Integer.valueOf((int) com.reactnativecommunity.webview.RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.oa> a(java.lang.String r25, java.lang.String[] r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.a(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void a(f4 f4Var) {
        com.google.android.gms.common.internal.s.a(f4Var);
        g();
        q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f4Var.l());
        contentValues.put("app_instance_id", f4Var.m());
        contentValues.put("gmp_app_id", f4Var.n());
        contentValues.put("resettable_device_id_hash", f4Var.q());
        contentValues.put("last_bundle_index", Long.valueOf(f4Var.B()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(f4Var.s()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(f4Var.t()));
        contentValues.put("app_version", f4Var.u());
        contentValues.put("app_store", f4Var.w());
        contentValues.put("gmp_version", Long.valueOf(f4Var.x()));
        contentValues.put("dev_cert_hash", Long.valueOf(f4Var.y()));
        contentValues.put("measurement_enabled", Boolean.valueOf(f4Var.A()));
        contentValues.put("day", Long.valueOf(f4Var.F()));
        contentValues.put("daily_public_events_count", Long.valueOf(f4Var.G()));
        contentValues.put("daily_events_count", Long.valueOf(f4Var.H()));
        contentValues.put("daily_conversions_count", Long.valueOf(f4Var.I()));
        contentValues.put("config_fetched_time", Long.valueOf(f4Var.C()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(f4Var.D()));
        contentValues.put("app_version_int", Long.valueOf(f4Var.v()));
        contentValues.put("firebase_instance_id", f4Var.r());
        contentValues.put("daily_error_events_count", Long.valueOf(f4Var.c()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(f4Var.b()));
        contentValues.put("health_monitor_sample", f4Var.d());
        contentValues.put("android_id", Long.valueOf(f4Var.f()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(f4Var.g()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(f4Var.h()));
        contentValues.put("admob_app_id", f4Var.o());
        contentValues.put("dynamite_version", Long.valueOf(f4Var.z()));
        if (f4Var.j() != null) {
            if (f4Var.j().size() == 0) {
                c().v().a("Safelisted events should not be an empty list. appId", f4Var.l());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", f4Var.j()));
            }
        }
        if (cb.a() && l().e(f4Var.l(), r.o0)) {
            contentValues.put("ga_app_id", f4Var.p());
        }
        try {
            SQLiteDatabase u = u();
            if (u.update("apps", contentValues, "app_id = ?", new String[]{f4Var.l()}) != 0 || u.insertWithOnConflict("apps", null, contentValues, 5) != -1) {
                return;
            }
            c().s().a("Failed to insert/update app (got -1). appId", z3.a(f4Var.l()));
        } catch (SQLiteException e2) {
            c().s().a("Error storing app. appId", z3.a(f4Var.l()), e2);
        }
    }

    public final void a(l lVar) {
        com.google.android.gms.common.internal.s.a(lVar);
        g();
        q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", lVar.f7437a);
        contentValues.put("name", lVar.f7438b);
        contentValues.put("lifetime_count", Long.valueOf(lVar.f7439c));
        contentValues.put("current_bundle_count", Long.valueOf(lVar.f7440d));
        contentValues.put("last_fire_timestamp", Long.valueOf(lVar.f7442f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(lVar.f7443g));
        contentValues.put("last_bundled_day", lVar.f7444h);
        contentValues.put("last_sampled_complex_event_id", lVar.i);
        contentValues.put("last_sampling_rate", lVar.j);
        contentValues.put("current_session_count", Long.valueOf(lVar.f7441e));
        Boolean bool = lVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (u().insertWithOnConflict("events", null, contentValues, 5) != -1) {
                return;
            }
            c().s().a("Failed to insert/update event aggregates (got -1). appId", z3.a(lVar.f7437a));
        } catch (SQLiteException e2) {
            c().s().a("Error storing event aggregates. appId", z3.a(lVar.f7437a), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0159, code lost:
        r8.a(r10, r11, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r18, java.util.List<c.e.a.b.d.g.q0> r19) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.a(java.lang.String, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(List<Long> list) {
        g();
        q();
        com.google.android.gms.common.internal.s.a(list);
        com.google.android.gms.common.internal.s.a(list.size());
        if (!O()) {
            return;
        }
        String join = TextUtils.join(",", list);
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
        sb.append("(");
        sb.append(join);
        sb.append(")");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
        sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
        sb3.append(sb2);
        sb3.append(" AND retry_count =  2147483647 LIMIT 1");
        if (b(sb3.toString(), (String[]) null) > 0) {
            c().v().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            SQLiteDatabase u = u();
            StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
            sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
            sb4.append(sb2);
            sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
            u.execSQL(sb4.toString());
        } catch (SQLiteException e2) {
            c().s().a("Error incrementing retry count. error", e2);
        }
    }

    public final boolean a(c.e.a.b.d.g.m1 m1Var, boolean z) {
        b4 s;
        Object a2;
        String str;
        ContentValues contentValues;
        g();
        q();
        com.google.android.gms.common.internal.s.a(m1Var);
        com.google.android.gms.common.internal.s.b(m1Var.p0());
        com.google.android.gms.common.internal.s.b(m1Var.d0());
        B();
        long a3 = b().a();
        if (m1Var.e0() < a3 - qa.v() || m1Var.e0() > qa.v() + a3) {
            c().v().a("Storing bundle outside of the max uploading time span. appId, now, timestamp", z3.a(m1Var.p0()), Long.valueOf(a3), Long.valueOf(m1Var.e0()));
        }
        try {
            byte[] c2 = m().c(m1Var.f());
            c().B().a("Saving bundle, size", Integer.valueOf(c2.length));
            contentValues = new ContentValues();
            contentValues.put("app_id", m1Var.p0());
            contentValues.put("bundle_end_timestamp", Long.valueOf(m1Var.e0()));
            contentValues.put("data", c2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (m1Var.O()) {
                contentValues.put("retry_count", Integer.valueOf(m1Var.Q()));
            }
        } catch (IOException e2) {
            e = e2;
            s = c().s();
            a2 = z3.a(m1Var.p0());
            str = "Data loss. Failed to serialize bundle. appId";
        }
        try {
            if (u().insert("queue", null, contentValues) != -1) {
                return true;
            }
            c().s().a("Failed to insert bundle (got -1). appId", z3.a(m1Var.p0()));
            return false;
        } catch (SQLiteException e3) {
            e = e3;
            s = c().s();
            a2 = z3.a(m1Var.p0());
            str = "Error storing bundle. appId";
            s.a(str, a2, e);
            return false;
        }
    }

    public final boolean a(aa aaVar) {
        com.google.android.gms.common.internal.s.a(aaVar);
        g();
        q();
        if (c(aaVar.f7173a, aaVar.f7175c) == null) {
            if (z9.e(aaVar.f7175c)) {
                if (b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{aaVar.f7173a}) >= l().d(aaVar.f7173a)) {
                    return false;
                }
            } else if (!"_npa".equals(aaVar.f7175c) && b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{aaVar.f7173a, aaVar.f7174b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", aaVar.f7173a);
        contentValues.put("origin", aaVar.f7174b);
        contentValues.put("name", aaVar.f7175c);
        contentValues.put("set_timestamp", Long.valueOf(aaVar.f7176d));
        a(contentValues, "value", aaVar.f7177e);
        try {
            if (u().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                c().s().a("Failed to insert/update user property (got -1). appId", z3.a(aaVar.f7173a));
            }
        } catch (SQLiteException e2) {
            c().s().a("Error storing user property. appId", z3.a(aaVar.f7173a), e2);
        }
        return true;
    }

    public final boolean a(m mVar, long j2, boolean z) {
        g();
        q();
        com.google.android.gms.common.internal.s.a(mVar);
        com.google.android.gms.common.internal.s.b(mVar.f7474a);
        byte[] f2 = m().a(mVar).f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", mVar.f7474a);
        contentValues.put("name", mVar.f7475b);
        contentValues.put("timestamp", Long.valueOf(mVar.f7477d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", f2);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (u().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            c().s().a("Failed to insert raw event (got -1). appId", z3.a(mVar.f7474a));
            return false;
        } catch (SQLiteException e2) {
            c().s().a("Error storing raw event. appId", z3.a(mVar.f7474a), e2);
            return false;
        }
    }

    public final boolean a(oa oaVar) {
        com.google.android.gms.common.internal.s.a(oaVar);
        g();
        q();
        if (c(oaVar.f7562b, oaVar.f7564d.f7816c) != null || b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{oaVar.f7562b}) < 1000) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", oaVar.f7562b);
            contentValues.put("origin", oaVar.f7563c);
            contentValues.put("name", oaVar.f7564d.f7816c);
            a(contentValues, "value", oaVar.f7564d.f());
            contentValues.put(AppStateModule.APP_STATE_ACTIVE, Boolean.valueOf(oaVar.f7566f));
            contentValues.put("trigger_event_name", oaVar.f7567g);
            contentValues.put("trigger_timeout", Long.valueOf(oaVar.i));
            j();
            contentValues.put("timed_out_event", z9.a((Parcelable) oaVar.f7568h));
            contentValues.put("creation_timestamp", Long.valueOf(oaVar.f7565e));
            j();
            contentValues.put("triggered_event", z9.a((Parcelable) oaVar.j));
            contentValues.put("triggered_timestamp", Long.valueOf(oaVar.f7564d.f7817d));
            contentValues.put("time_to_live", Long.valueOf(oaVar.k));
            j();
            contentValues.put("expired_event", z9.a((Parcelable) oaVar.l));
            try {
                if (u().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                    c().s().a("Failed to insert/update conditional user property (got -1)", z3.a(oaVar.f7562b));
                }
            } catch (SQLiteException e2) {
                c().s().a("Error storing conditional user property", z3.a(oaVar.f7562b), e2);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String str, Bundle bundle) {
        g();
        q();
        byte[] f2 = m().a(new m(this.f7802a, "", str, "dep", 0L, 0L, bundle)).f();
        c().B().a("Saving default event parameters, appId, data size", i().a(str), Integer.valueOf(f2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", f2);
        try {
            if (u().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            c().s().a("Failed to insert default event parameters (got -1). appId", z3.a(str));
            return false;
        } catch (SQLiteException e2) {
            c().s().a("Error storing default event parameters. appId", z3.a(str), e2);
            return false;
        }
    }

    public final boolean a(String str, Long l2, long j2, c.e.a.b.d.g.i1 i1Var) {
        g();
        q();
        com.google.android.gms.common.internal.s.a(i1Var);
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.a(l2);
        byte[] f2 = i1Var.f();
        c().B().a("Saving complex main event, appId, data size", i().a(str), Integer.valueOf(f2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", f2);
        try {
            if (u().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            c().s().a("Failed to insert complex main event (got -1). appId", z3.a(str));
            return false;
        } catch (SQLiteException e2) {
            c().s().a("Error storing complex main event. appId", z3.a(str), e2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011f A[Catch: SQLiteException -> 0x0200, all -> 0x022a, TryCatch #2 {SQLiteException -> 0x0200, blocks: (B:11:0x006f, B:13:0x00d0, B:18:0x00da, B:22:0x0124, B:24:0x0159, B:28:0x0167, B:27:0x0163, B:29:0x016a, B:31:0x0172, B:36:0x017c, B:38:0x0187, B:42:0x018f, B:46:0x01a8, B:48:0x01b3, B:49:0x01c5, B:51:0x01cb, B:53:0x01d7, B:54:0x01e0, B:56:0x01e9, B:45:0x01a4, B:21:0x011f), top: B:78:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0159 A[Catch: SQLiteException -> 0x0200, all -> 0x022a, TryCatch #2 {SQLiteException -> 0x0200, blocks: (B:11:0x006f, B:13:0x00d0, B:18:0x00da, B:22:0x0124, B:24:0x0159, B:28:0x0167, B:27:0x0163, B:29:0x016a, B:31:0x0172, B:36:0x017c, B:38:0x0187, B:42:0x018f, B:46:0x01a8, B:48:0x01b3, B:49:0x01c5, B:51:0x01cb, B:53:0x01d7, B:54:0x01e0, B:56:0x01e9, B:45:0x01a4, B:21:0x011f), top: B:78:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0187 A[Catch: SQLiteException -> 0x0200, all -> 0x022a, TryCatch #2 {SQLiteException -> 0x0200, blocks: (B:11:0x006f, B:13:0x00d0, B:18:0x00da, B:22:0x0124, B:24:0x0159, B:28:0x0167, B:27:0x0163, B:29:0x016a, B:31:0x0172, B:36:0x017c, B:38:0x0187, B:42:0x018f, B:46:0x01a8, B:48:0x01b3, B:49:0x01c5, B:51:0x01cb, B:53:0x01d7, B:54:0x01e0, B:56:0x01e9, B:45:0x01a4, B:21:0x011f), top: B:78:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a4 A[Catch: SQLiteException -> 0x0200, all -> 0x022a, TryCatch #2 {SQLiteException -> 0x0200, blocks: (B:11:0x006f, B:13:0x00d0, B:18:0x00da, B:22:0x0124, B:24:0x0159, B:28:0x0167, B:27:0x0163, B:29:0x016a, B:31:0x0172, B:36:0x017c, B:38:0x0187, B:42:0x018f, B:46:0x01a8, B:48:0x01b3, B:49:0x01c5, B:51:0x01cb, B:53:0x01d7, B:54:0x01e0, B:56:0x01e9, B:45:0x01a4, B:21:0x011f), top: B:78:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b3 A[Catch: SQLiteException -> 0x0200, all -> 0x022a, TryCatch #2 {SQLiteException -> 0x0200, blocks: (B:11:0x006f, B:13:0x00d0, B:18:0x00da, B:22:0x0124, B:24:0x0159, B:28:0x0167, B:27:0x0163, B:29:0x016a, B:31:0x0172, B:36:0x017c, B:38:0x0187, B:42:0x018f, B:46:0x01a8, B:48:0x01b3, B:49:0x01c5, B:51:0x01cb, B:53:0x01d7, B:54:0x01e0, B:56:0x01e9, B:45:0x01a4, B:21:0x011f), top: B:78:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cb A[Catch: SQLiteException -> 0x0200, all -> 0x022a, TryCatch #2 {SQLiteException -> 0x0200, blocks: (B:11:0x006f, B:13:0x00d0, B:18:0x00da, B:22:0x0124, B:24:0x0159, B:28:0x0167, B:27:0x0163, B:29:0x016a, B:31:0x0172, B:36:0x017c, B:38:0x0187, B:42:0x018f, B:46:0x01a8, B:48:0x01b3, B:49:0x01c5, B:51:0x01cb, B:53:0x01d7, B:54:0x01e0, B:56:0x01e9, B:45:0x01a4, B:21:0x011f), top: B:78:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e9 A[Catch: SQLiteException -> 0x0200, all -> 0x022a, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0200, blocks: (B:11:0x006f, B:13:0x00d0, B:18:0x00da, B:22:0x0124, B:24:0x0159, B:28:0x0167, B:27:0x0163, B:29:0x016a, B:31:0x0172, B:36:0x017c, B:38:0x0187, B:42:0x018f, B:46:0x01a8, B:48:0x01b3, B:49:0x01c5, B:51:0x01cb, B:53:0x01d7, B:54:0x01e0, B:56:0x01e9, B:45:0x01a4, B:21:0x011f), top: B:78:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.f4 b(java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.b(java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    public final List<oa> b(String str, String str2, String str3) {
        com.google.android.gms.common.internal.s.b(str);
        g();
        q();
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
        return a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void b(String str, String str2) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.b(str2);
        g();
        q();
        try {
            u().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            c().s().a("Error deleting user property. appId", z3.a(str), i().c(str2), e2);
        }
    }

    public final long c(String str) {
        com.google.android.gms.common.internal.s.b(str);
        g();
        q();
        try {
            return u().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, l().b(str, r.p))))});
        } catch (SQLiteException e2) {
            c().s().a("Error deleting over the limit events. appId", z3.a(str), e2);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.aa c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.s.b(r19)
            com.google.android.gms.common.internal.s.b(r20)
            r18.g()
            r18.q()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.u()     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L83
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L83
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L83
            r1 = 0
            r14[r1] = r19     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L83
            r2 = 1
            r14[r2] = r8     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L83
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L83
            boolean r3 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L7a
            if (r3 != 0) goto L3f
            if (r10 == 0) goto L3e
            r10.close()
        L3e:
            return r9
        L3f:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L7a
            r11 = r18
            java.lang.Object r7 = r11.a(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La6
            java.lang.String r3 = r10.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.aa r0 = new com.google.android.gms.measurement.internal.aa     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La6
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La6
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La6
            if (r1 == 0) goto L6e
            com.google.android.gms.measurement.internal.z3 r1 = r18.c()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.b4 r1 = r1.s()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La6
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.z3.a(r19)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La6
            r1.a(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La6
        L6e:
            if (r10 == 0) goto L73
            r10.close()
        L73:
            return r0
        L74:
            r0 = move-exception
            goto L87
        L76:
            r0 = move-exception
            r11 = r18
            goto La7
        L7a:
            r0 = move-exception
            r11 = r18
            goto L87
        L7e:
            r0 = move-exception
            r11 = r18
            r10 = r9
            goto La7
        L83:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L87:
            com.google.android.gms.measurement.internal.z3 r1 = r18.c()     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.b4 r1 = r1.s()     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.z3.a(r19)     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.x3 r4 = r18.i()     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = r4.c(r8)     // Catch: java.lang.Throwable -> La6
            r1.a(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> La6
            if (r10 == 0) goto La5
            r10.close()
        La5:
            return r9
        La6:
            r0 = move-exception
        La7:
            if (r10 == 0) goto Lac
            r10.close()
        Lac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.c(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.aa");
    }

    public final oa d(String str, String str2) {
        Cursor cursor;
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.b(str2);
        g();
        q();
        try {
            try {
                cursor = u().query("conditional_properties", new String[]{"origin", "value", AppStateModule.APP_STATE_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                String string = cursor.getString(0);
                try {
                    Object a2 = a(cursor, 1);
                    oa oaVar = new oa(str, string, new y9(str2, cursor.getLong(8), a2, string), cursor.getLong(6), cursor.getInt(2) != 0, cursor.getString(3), (p) m().a(cursor.getBlob(5), p.CREATOR), cursor.getLong(4), (p) m().a(cursor.getBlob(7), p.CREATOR), cursor.getLong(9), (p) m().a(cursor.getBlob(10), p.CREATOR));
                    if (cursor.moveToNext()) {
                        c().s().a("Got multiple records for conditional property, expected one", z3.a(str), i().c(str2));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return oaVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    c().s().a("Error querying conditional property", z3.a(str), i().c(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] d(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.s.b(r11)
            r10.g()
            r10.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.u()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            r9 = 0
            r5[r9] = r11     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L70
            if (r2 != 0) goto L31
            if (r1 == 0) goto L30
            r1.close()
        L30:
            return r0
        L31:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L70
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L70
            if (r3 == 0) goto L4c
            com.google.android.gms.measurement.internal.z3 r3 = r10.c()     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L70
            com.google.android.gms.measurement.internal.b4 r3 = r3.s()     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L70
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.z3.a(r11)     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L70
            r3.a(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L70
        L4c:
            if (r1 == 0) goto L51
            r1.close()
        L51:
            return r2
        L52:
            r2 = move-exception
            goto L59
        L54:
            r11 = move-exception
            r1 = r0
            goto L71
        L57:
            r2 = move-exception
            r1 = r0
        L59:
            com.google.android.gms.measurement.internal.z3 r3 = r10.c()     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.measurement.internal.b4 r3 = r3.s()     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.z3.a(r11)     // Catch: java.lang.Throwable -> L70
            r3.a(r4, r11, r2)     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L6f
            r1.close()
        L6f:
            return r0
        L70:
            r11 = move-exception
        L71:
            if (r1 == 0) goto L76
            r1.close()
        L76:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.d(java.lang.String):byte[]");
    }

    public final int e(String str, String str2) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.b(str2);
        g();
        q();
        try {
            return u().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            c().s().a("Error deleting conditional property", z3.a(str), i().c(str2), e2);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<c.e.a.b.d.g.r0>> e(String str) {
        com.google.android.gms.common.internal.s.b(str);
        a.e.a aVar = new a.e.a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = u().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<c.e.a.b.d.g.r0>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    byte[] blob = query.getBlob(1);
                    try {
                        r0.a z = c.e.a.b.d.g.r0.z();
                        v9.a(z, blob);
                        c.e.a.b.d.g.r0 r0Var = (c.e.a.b.d.g.r0) ((c.e.a.b.d.g.b5) z.i());
                        if (r0Var.s()) {
                            int i2 = query.getInt(0);
                            List list = (List) aVar.get(Integer.valueOf(i2));
                            if (list == null) {
                                list = new ArrayList();
                                aVar.put(Integer.valueOf(i2), list);
                            }
                            list.add(r0Var);
                        }
                    } catch (IOException e2) {
                        c().s().a("Failed to merge filter. appId", z3.a(str), e2);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return aVar;
            } catch (SQLiteException e3) {
                c().s().a("Database error querying filters. appId", z3.a(str), e3);
                Map<Integer, List<c.e.a.b.d.g.r0>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> f(java.lang.String r8) {
        /*
            r7 = this;
            r7.q()
            r7.g()
            com.google.android.gms.common.internal.s.b(r8)
            a.e.a r0 = new a.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.u()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r6 = 1
            r4[r6] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            if (r3 != 0) goto L32
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            if (r1 == 0) goto L31
            r1.close()
        L31:
            return r8
        L32:
            int r3 = r1.getInt(r5)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            if (r4 != 0) goto L4e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
        L4e:
            int r3 = r1.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9f
            if (r3 != 0) goto L32
            if (r1 == 0) goto L64
            r1.close()
        L64:
            return r0
        L65:
            r0 = move-exception
            goto L6c
        L67:
            r8 = move-exception
            r1 = r2
            goto La0
        L6a:
            r0 = move-exception
            r1 = r2
        L6c:
            com.google.android.gms.measurement.internal.z3 r3 = r7.c()     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.measurement.internal.b4 r3 = r3.s()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.z3.a(r8)     // Catch: java.lang.Throwable -> L9f
            r3.a(r4, r5, r0)     // Catch: java.lang.Throwable -> L9f
            boolean r0 = c.e.a.b.d.g.ja.a()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L99
            com.google.android.gms.measurement.internal.qa r0 = r7.l()     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.r.T0     // Catch: java.lang.Throwable -> L9f
            boolean r8 = r0.e(r8, r3)     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto L99
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L98
            r1.close()
        L98:
            return r8
        L99:
            if (r1 == 0) goto L9e
            r1.close()
        L9e:
            return r2
        L9f:
            r8 = move-exception
        La0:
            if (r1 == 0) goto La5
            r1.close()
        La5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.f(java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<c.e.a.b.d.g.r0>> f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.q()
            r12.g()
            com.google.android.gms.common.internal.s.b(r13)
            com.google.android.gms.common.internal.s.b(r14)
            a.e.a r0 = new a.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.u()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L9a
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L9a
            r10 = 0
            r5[r10] = r13     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L9a
            r11 = 1
            r5[r11] = r14     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L9a
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L9a
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            if (r1 != 0) goto L42
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            if (r14 == 0) goto L41
            r14.close()
        L41:
            return r13
        L42:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            c.e.a.b.d.g.r0$a r2 = c.e.a.b.d.g.r0.z()     // Catch: java.io.IOException -> L77 android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.v9.a(r2, r1)     // Catch: java.io.IOException -> L77 android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            c.e.a.b.d.g.r0$a r2 = (c.e.a.b.d.g.r0.a) r2     // Catch: java.io.IOException -> L77 android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            c.e.a.b.d.g.k6 r1 = r2.i()     // Catch: java.io.IOException -> L77 android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            c.e.a.b.d.g.b5 r1 = (c.e.a.b.d.g.b5) r1     // Catch: java.io.IOException -> L77 android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            c.e.a.b.d.g.r0 r1 = (c.e.a.b.d.g.r0) r1     // Catch: java.io.IOException -> L77 android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            if (r3 != 0) goto L73
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
        L73:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            goto L89
        L77:
            r1 = move-exception
            com.google.android.gms.measurement.internal.z3 r2 = r12.c()     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.b4 r2 = r2.s()     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.z3.a(r13)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            r2.a(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
        L89:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            if (r1 != 0) goto L42
            if (r14 == 0) goto L94
            r14.close()
        L94:
            return r0
        L95:
            r0 = move-exception
            goto L9c
        L97:
            r13 = move-exception
            r14 = r9
            goto Ld0
        L9a:
            r0 = move-exception
            r14 = r9
        L9c:
            com.google.android.gms.measurement.internal.z3 r1 = r12.c()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.b4 r1 = r1.s()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.z3.a(r13)     // Catch: java.lang.Throwable -> Lcf
            r1.a(r2, r3, r0)     // Catch: java.lang.Throwable -> Lcf
            boolean r0 = c.e.a.b.d.g.ja.a()     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lc9
            com.google.android.gms.measurement.internal.qa r0 = r12.l()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.r.T0     // Catch: java.lang.Throwable -> Lcf
            boolean r13 = r0.e(r13, r1)     // Catch: java.lang.Throwable -> Lcf
            if (r13 == 0) goto Lc9
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Lcf
            if (r14 == 0) goto Lc8
            r14.close()
        Lc8:
            return r13
        Lc9:
            if (r14 == 0) goto Lce
            r14.close()
        Lce:
            return r9
        Lcf:
            r13 = move-exception
        Ld0:
            if (r14 == 0) goto Ld5
            r14.close()
        Ld5:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, c.e.a.b.d.g.o1> g(java.lang.String r12) {
        /*
            r11 = this;
            r11.q()
            r11.g()
            com.google.android.gms.common.internal.s.b(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.u()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9c
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9c
            r10 = 0
            r4[r10] = r12     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9c
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L99 android.database.sqlite.SQLiteException -> L9c
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            if (r1 != 0) goto L4f
            boolean r1 = c.e.a.b.d.g.ja.a()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            if (r1 == 0) goto L49
            com.google.android.gms.measurement.internal.qa r1 = r11.l()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.r.T0     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            boolean r1 = r1.e(r12, r2)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            if (r1 == 0) goto L49
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            if (r0 == 0) goto L48
            r0.close()
        L48:
            return r12
        L49:
            if (r0 == 0) goto L4e
            r0.close()
        L4e:
            return r8
        L4f:
            a.e.a r1 = new a.e.a     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
        L54:
            int r2 = r0.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            byte[] r3 = r0.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            c.e.a.b.d.g.o1$a r4 = c.e.a.b.d.g.o1.v()     // Catch: java.io.IOException -> L75 android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            com.google.android.gms.measurement.internal.v9.a(r4, r3)     // Catch: java.io.IOException -> L75 android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            c.e.a.b.d.g.o1$a r4 = (c.e.a.b.d.g.o1.a) r4     // Catch: java.io.IOException -> L75 android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            c.e.a.b.d.g.k6 r3 = r4.i()     // Catch: java.io.IOException -> L75 android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            c.e.a.b.d.g.b5 r3 = (c.e.a.b.d.g.b5) r3     // Catch: java.io.IOException -> L75 android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            c.e.a.b.d.g.o1 r3 = (c.e.a.b.d.g.o1) r3     // Catch: java.io.IOException -> L75 android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            r1.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            goto L8b
        L75:
            r3 = move-exception
            com.google.android.gms.measurement.internal.z3 r4 = r11.c()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            com.google.android.gms.measurement.internal.b4 r4 = r4.s()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.z3.a(r12)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            r4.a(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
        L8b:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.Throwable -> Ld1
            if (r2 != 0) goto L54
            if (r0 == 0) goto L96
            r0.close()
        L96:
            return r1
        L97:
            r1 = move-exception
            goto L9e
        L99:
            r12 = move-exception
            r0 = r8
            goto Ld2
        L9c:
            r1 = move-exception
            r0 = r8
        L9e:
            com.google.android.gms.measurement.internal.z3 r2 = r11.c()     // Catch: java.lang.Throwable -> Ld1
            com.google.android.gms.measurement.internal.b4 r2 = r2.s()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.z3.a(r12)     // Catch: java.lang.Throwable -> Ld1
            r2.a(r3, r4, r1)     // Catch: java.lang.Throwable -> Ld1
            boolean r1 = c.e.a.b.d.g.ja.a()     // Catch: java.lang.Throwable -> Ld1
            if (r1 == 0) goto Lcb
            com.google.android.gms.measurement.internal.qa r1 = r11.l()     // Catch: java.lang.Throwable -> Ld1
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.r.T0     // Catch: java.lang.Throwable -> Ld1
            boolean r12 = r1.e(r12, r2)     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Lcb
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto Lca
            r0.close()
        Lca:
            return r12
        Lcb:
            if (r0 == 0) goto Ld0
            r0.close()
        Ld0:
            return r8
        Ld1:
            r12 = move-exception
        Ld2:
            if (r0 == 0) goto Ld7
            r0.close()
        Ld7:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.g(java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<c.e.a.b.d.g.u0>> g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.q()
            r12.g()
            com.google.android.gms.common.internal.s.b(r13)
            com.google.android.gms.common.internal.s.b(r14)
            a.e.a r0 = new a.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.u()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L9a
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L9a
            r10 = 0
            r5[r10] = r13     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L9a
            r11 = 1
            r5[r11] = r14     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L9a
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L9a
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            if (r1 != 0) goto L42
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            if (r14 == 0) goto L41
            r14.close()
        L41:
            return r13
        L42:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            c.e.a.b.d.g.u0$a r2 = c.e.a.b.d.g.u0.v()     // Catch: java.io.IOException -> L77 android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.v9.a(r2, r1)     // Catch: java.io.IOException -> L77 android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            c.e.a.b.d.g.u0$a r2 = (c.e.a.b.d.g.u0.a) r2     // Catch: java.io.IOException -> L77 android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            c.e.a.b.d.g.k6 r1 = r2.i()     // Catch: java.io.IOException -> L77 android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            c.e.a.b.d.g.b5 r1 = (c.e.a.b.d.g.b5) r1     // Catch: java.io.IOException -> L77 android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            c.e.a.b.d.g.u0 r1 = (c.e.a.b.d.g.u0) r1     // Catch: java.io.IOException -> L77 android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            if (r3 != 0) goto L73
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
        L73:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            goto L89
        L77:
            r1 = move-exception
            com.google.android.gms.measurement.internal.z3 r2 = r12.c()     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.b4 r2 = r2.s()     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.z3.a(r13)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            r2.a(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
        L89:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L95 java.lang.Throwable -> Lcf
            if (r1 != 0) goto L42
            if (r14 == 0) goto L94
            r14.close()
        L94:
            return r0
        L95:
            r0 = move-exception
            goto L9c
        L97:
            r13 = move-exception
            r14 = r9
            goto Ld0
        L9a:
            r0 = move-exception
            r14 = r9
        L9c:
            com.google.android.gms.measurement.internal.z3 r1 = r12.c()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.b4 r1 = r1.s()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.z3.a(r13)     // Catch: java.lang.Throwable -> Lcf
            r1.a(r2, r3, r0)     // Catch: java.lang.Throwable -> Lcf
            boolean r0 = c.e.a.b.d.g.ja.a()     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lc9
            com.google.android.gms.measurement.internal.qa r0 = r12.l()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.r.T0     // Catch: java.lang.Throwable -> Lcf
            boolean r13 = r0.e(r13, r1)     // Catch: java.lang.Throwable -> Lcf
            if (r13 == 0) goto Lc9
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Lcf
            if (r14 == 0) goto Lc8
            r14.close()
        Lc8:
            return r13
        Lc9:
            if (r14 == 0) goto Lce
            r14.close()
        Lce:
            return r9
        Lcf:
            r13 = move-exception
        Ld0:
            if (r14 == 0) goto Ld5
            r14.close()
        Ld5:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.g(java.lang.String, java.lang.String):java.util.Map");
    }

    public final long h(String str) {
        com.google.android.gms.common.internal.s.b(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long h(String str, String str2) {
        long j2;
        ContentValues contentValues;
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.b(str2);
        g();
        q();
        SQLiteDatabase u = u();
        u.beginTransaction();
        try {
            try {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
                sb.append("select ");
                sb.append(str2);
                sb.append(" from app2 where app_id=?");
                try {
                    j2 = a(sb.toString(), new String[]{str}, -1L);
                    if (j2 == -1) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str);
                        contentValues2.put("first_open_count", (Integer) 0);
                        contentValues2.put("previous_install_count", (Integer) 0);
                        if (u.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                            c().s().a("Failed to insert column (got -1). appId", z3.a(str), str2);
                            u.endTransaction();
                            return -1L;
                        }
                        j2 = 0;
                    }
                    try {
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put(str2, Long.valueOf(1 + j2));
                    } catch (SQLiteException e2) {
                        e = e2;
                        c().s().a("Error inserting column. appId", z3.a(str), str2, e);
                        u.endTransaction();
                        return j2;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    j2 = 0;
                    c().s().a("Error inserting column. appId", z3.a(str), str2, e);
                    u.endTransaction();
                    return j2;
                }
            } catch (Throwable th) {
                th = th;
                u.endTransaction();
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
        } catch (Throwable th2) {
            th = th2;
            u.endTransaction();
            throw th;
        }
        if (u.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
            c().s().a("Failed to update column (got 0). appId", z3.a(str), str2);
            u.endTransaction();
            return -1L;
        }
        u.setTransactionSuccessful();
        u.endTransaction();
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle i(java.lang.String r8) {
        /*
            r7 = this;
            r7.g()
            r7.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.u()     // Catch: java.lang.Throwable -> Lbd android.database.sqlite.SQLiteException -> Lc0
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lbd android.database.sqlite.SQLiteException -> Lc0
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lbd android.database.sqlite.SQLiteException -> Lc0
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lbd android.database.sqlite.SQLiteException -> Lc0
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            if (r2 != 0) goto L30
            com.google.android.gms.measurement.internal.z3 r8 = r7.c()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.b4 r8 = r8.B()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            if (r1 == 0) goto L2f
            r1.close()
        L2f:
            return r0
        L30:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            c.e.a.b.d.g.i1$a r3 = c.e.a.b.d.g.i1.x()     // Catch: java.io.IOException -> La3 android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.v9.a(r3, r2)     // Catch: java.io.IOException -> La3 android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            c.e.a.b.d.g.i1$a r3 = (c.e.a.b.d.g.i1.a) r3     // Catch: java.io.IOException -> La3 android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            c.e.a.b.d.g.k6 r2 = r3.i()     // Catch: java.io.IOException -> La3 android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            c.e.a.b.d.g.b5 r2 = (c.e.a.b.d.g.b5) r2     // Catch: java.io.IOException -> La3 android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            c.e.a.b.d.g.i1 r2 = (c.e.a.b.d.g.i1) r2     // Catch: java.io.IOException -> La3 android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            r7.m()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            java.util.List r8 = r2.n()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
        L55:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            c.e.a.b.d.g.k1 r3 = (c.e.a.b.d.g.k1) r3     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            java.lang.String r4 = r3.o()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            boolean r5 = r3.v()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            if (r5 == 0) goto L73
            double r5 = r3.x()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            goto L55
        L73:
            boolean r5 = r3.t()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            if (r5 == 0) goto L81
            float r3 = r3.u()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            goto L55
        L81:
            boolean r5 = r3.p()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            if (r5 == 0) goto L8f
            java.lang.String r3 = r3.q()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            goto L55
        L8f:
            boolean r5 = r3.r()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            if (r5 == 0) goto L55
            long r5 = r3.s()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            goto L55
        L9d:
            if (r1 == 0) goto La2
            r1.close()
        La2:
            return r2
        La3:
            r2 = move-exception
            com.google.android.gms.measurement.internal.z3 r3 = r7.c()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.b4 r3 = r3.s()     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.z3.a(r8)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            r3.a(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lbb java.lang.Throwable -> Ld5
            if (r1 == 0) goto Lba
            r1.close()
        Lba:
            return r0
        Lbb:
            r8 = move-exception
            goto Lc2
        Lbd:
            r8 = move-exception
            r1 = r0
            goto Ld6
        Lc0:
            r8 = move-exception
            r1 = r0
        Lc2:
            com.google.android.gms.measurement.internal.z3 r2 = r7.c()     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.b4 r2 = r2.s()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "Error selecting default event parameters"
            r2.a(r3, r8)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Ld4
            r1.close()
        Ld4:
            return r0
        Ld5:
            r8 = move-exception
        Ld6:
            if (r1 == 0) goto Ldb
            r1.close()
        Ldb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.i(java.lang.String):android.os.Bundle");
    }

    @Override // com.google.android.gms.measurement.internal.o9
    protected final boolean s() {
        return false;
    }

    public final void t() {
        q();
        u().setTransactionSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase u() {
        g();
        try {
            return this.f7260d.getWritableDatabase();
        } catch (SQLiteException e2) {
            c().v().a("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String v() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.u()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L29
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
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
            goto L2b
        L24:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3f
        L29:
            r2 = move-exception
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.z3 r3 = r6.c()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.b4 r3 = r3.s()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.a(r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            r1 = move-exception
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.v():java.lang.String");
    }

    public final long x() {
        Cursor cursor = null;
        try {
            try {
                cursor = u().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j2 = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j2;
            } catch (SQLiteException e2) {
                c().s().a("Error querying raw events", e2);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void y() {
        q();
        u().beginTransaction();
    }

    public final void z() {
        q();
        u().endTransaction();
    }
}
