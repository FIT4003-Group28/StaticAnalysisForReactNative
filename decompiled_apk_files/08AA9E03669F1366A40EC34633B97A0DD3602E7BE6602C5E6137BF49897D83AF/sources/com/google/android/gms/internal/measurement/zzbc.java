package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbc extends zzar implements Closeable {
    private static final String zzwu = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    private static final String zzwv = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    private final zzbd zzww;
    private final zzcz zzwx;
    private final zzcz zzwy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbc(zzat zzatVar) {
        super(zzatVar);
        this.zzwx = new zzcz(zzbt());
        this.zzwy = new zzcz(zzbt());
        this.zzww = new zzbd(this, zzatVar.getContext(), "google_analytics_v4.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.measurement.zzbc, com.google.android.gms.internal.measurement.zzaq] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zza(java.lang.String r4, java.lang.String[] r5) {
        /*
            r3 = this;
            android.database.sqlite.SQLiteDatabase r5 = r3.getWritableDatabase()
            r0 = 0
            android.database.Cursor r5 = r5.rawQuery(r4, r0)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L29
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            if (r0 == 0) goto L1a
            r0 = 0
            long r0 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            if (r5 == 0) goto L19
            r5.close()
        L19:
            return r0
        L1a:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            java.lang.String r1 = "Database returned empty set"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            throw r0     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
        L22:
            r4 = move-exception
            goto L33
        L24:
            r0 = move-exception
            goto L2d
        L26:
            r4 = move-exception
            r5 = r0
            goto L33
        L29:
            r5 = move-exception
            r2 = r0
            r0 = r5
            r5 = r2
        L2d:
            java.lang.String r1 = "Database error"
            r3.zzd(r1, r4, r0)     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L33:
            if (r5 == 0) goto L38
            r5.close()
        L38:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbc.zza(java.lang.String, java.lang.String[]):long");
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor rawQuery;
        Cursor cursor = null;
        try {
            try {
                rawQuery = getWritableDatabase().rawQuery(str, strArr);
            } catch (SQLiteException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            } else if (rawQuery == null) {
                return 0L;
            } else {
                rawQuery.close();
                return 0L;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = rawQuery;
            zzd("Database error", str, e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            cursor = rawQuery;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.lang.Long> zzc(long r14) {
        /*
            r13 = this;
            com.google.android.gms.analytics.zzk.zzab()
            r13.zzch()
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 > 0) goto L11
            java.util.List r14 = java.util.Collections.emptyList()
            return r14
        L11:
            android.database.sqlite.SQLiteDatabase r0 = r13.getWritableDatabase()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = 0
            java.lang.String r1 = "hits2"
            java.lang.String r2 = "hit_id"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L62
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "%s ASC"
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L62
            java.lang.String r11 = "hit_id"
            r12 = 0
            r8[r12] = r11     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L62
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L62
            java.lang.String r8 = java.lang.Long.toString(r14)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L62
            android.database.Cursor r14 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L62
            boolean r15 = r14.moveToFirst()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5d
            if (r15 == 0) goto L54
        L43:
            long r0 = r14.getLong(r12)     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5d
            java.lang.Long r15 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5d
            r9.add(r15)     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5d
            boolean r15 = r14.moveToNext()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5d
            if (r15 != 0) goto L43
        L54:
            if (r14 == 0) goto L6d
            r14.close()
            return r9
        L5a:
            r15 = move-exception
            r10 = r14
            goto L6e
        L5d:
            r15 = move-exception
            r10 = r14
            goto L63
        L60:
            r15 = move-exception
            goto L6e
        L62:
            r15 = move-exception
        L63:
            java.lang.String r14 = "Error selecting hit ids"
            r13.zzd(r14, r15)     // Catch: java.lang.Throwable -> L60
            if (r10 == 0) goto L6d
            r10.close()
        L6d:
            return r9
        L6e:
            if (r10 == 0) goto L73
            r10.close()
        L73:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbc.zzc(long):java.util.List");
    }

    private final long zzcr() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        return zza("SELECT COUNT(*) FROM hits2", (String[]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzcz() {
        return "google_analytics_v4.db";
    }

    @VisibleForTesting
    private final Map<String, String> zzu(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                String valueOf = String.valueOf(str);
                str = valueOf.length() != 0 ? "?".concat(valueOf) : new String("?");
            }
            return HttpUtils.parse(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            zze("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    @VisibleForTesting
    private final Map<String, String> zzv(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            String valueOf = String.valueOf(str);
            return HttpUtils.parse(new URI(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")), "UTF-8");
        } catch (URISyntaxException e) {
            zze("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    public final void beginTransaction() {
        zzch();
        getWritableDatabase().beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        String str;
        try {
            this.zzww.close();
        } catch (SQLiteException e) {
            e = e;
            str = "Sql error closing database";
            zze(str, e);
        } catch (IllegalStateException e2) {
            e = e2;
            str = "Error closing database";
            zze(str, e);
        }
    }

    public final void endTransaction() {
        zzch();
        getWritableDatabase().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return this.zzww.getWritableDatabase();
        } catch (SQLiteException e) {
            zzd("Error opening database", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isEmpty() {
        return zzcr() == 0;
    }

    public final void setTransactionSuccessful() {
        zzch();
        getWritableDatabase().setTransactionSuccessful();
    }

    public final long zza(long j, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzch();
        com.google.android.gms.analytics.zzk.zzab();
        return zza("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{String.valueOf(j), str, str2}, 0L);
    }

    public final void zza(List<Long> list) {
        Preconditions.checkNotNull(list);
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("hit_id");
        sb.append(" in (");
        for (int i = 0; i < list.size(); i++) {
            Long l = list.get(i);
            if (l == null || l.longValue() == 0) {
                throw new SQLiteException("Invalid hit id");
            }
            if (i > 0) {
                sb.append(",");
            }
            sb.append(l);
        }
        sb.append(")");
        String sb2 = sb.toString();
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            zza("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int delete = writableDatabase.delete("hits2", sb2, null);
            if (delete == list.size()) {
                return;
            }
            zzb("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
        } catch (SQLiteException e) {
            zze("Error deleting hits", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
    }

    public final void zzc(zzch zzchVar) {
        Preconditions.checkNotNull(zzchVar);
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        Preconditions.checkNotNull(zzchVar);
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : zzchVar.zzcs().entrySet()) {
            String key = entry.getKey();
            if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key)) {
                builder.appendQueryParameter(key, entry.getValue());
            }
        }
        String encodedQuery = builder.build().getEncodedQuery();
        if (encodedQuery == null) {
            encodedQuery = "";
        }
        if (encodedQuery.length() > 8192) {
            zzbu().zza(zzchVar, "Hit length exceeds the maximum allowed size");
            return;
        }
        int intValue = zzcc.zzyp.get().intValue();
        long zzcr = zzcr();
        if (zzcr > intValue - 1) {
            List<Long> zzc = zzc((zzcr - intValue) + 1);
            zzd("Store full, deleting hits to make room, count", Integer.valueOf(zzc.size()));
            zza(zzc);
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_string", encodedQuery);
        contentValues.put("hit_time", Long.valueOf(zzchVar.zzen()));
        contentValues.put("hit_app_id", Integer.valueOf(zzchVar.zzel()));
        contentValues.put("hit_url", zzchVar.zzep() ? zzbu.zzdz() : zzbu.zzea());
        try {
            long insert = writableDatabase.insert("hits2", null, contentValues);
            if (insert == -1) {
                zzt("Failed to insert a hit (got -1)");
            } else {
                zzb("Hit saved to database. db-id, hit", Long.valueOf(insert), zzchVar);
            }
        } catch (SQLiteException e) {
            zze("Error storing a hit", e);
        }
    }

    public final int zzcx() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        if (!this.zzwx.zzj(86400000L)) {
            return 0;
        }
        this.zzwx.start();
        zzp("Deleting stale hits (if any)");
        int delete = getWritableDatabase().delete("hits2", "hit_time < ?", new String[]{Long.toString(zzbt().currentTimeMillis() - 2592000000L)});
        zza("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    public final long zzcy() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        return zza(zzwv, (String[]) null, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzch> zzd(long r14) {
        /*
            r13 = this;
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 < 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            com.google.android.gms.analytics.zzk.zzab()
            r13.zzch()
            android.database.sqlite.SQLiteDatabase r3 = r13.getWritableDatabase()
            r0 = 0
            java.lang.String r4 = "hits2"
            java.lang.String r5 = "hit_id"
            java.lang.String r6 = "hit_time"
            java.lang.String r7 = "hit_string"
            java.lang.String r8 = "hit_url"
            java.lang.String r9 = "hit_app_id"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9}     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "%s ASC"
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            java.lang.String r12 = "hit_id"
            r11[r1] = r12     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            java.lang.String r10 = java.lang.String.format(r10, r11)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            java.lang.String r11 = java.lang.Long.toString(r14)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            android.database.Cursor r14 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L89
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            r15.<init>()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            boolean r0 = r14.moveToFirst()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            if (r0 == 0) goto L7b
        L4c:
            long r9 = r14.getLong(r1)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            long r6 = r14.getLong(r2)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            r0 = 2
            java.lang.String r0 = r14.getString(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            r3 = 3
            java.lang.String r3 = r14.getString(r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            r4 = 4
            int r11 = r14.getInt(r4)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            java.util.Map r5 = r13.zzu(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            boolean r8 = com.google.android.gms.internal.measurement.zzdd.zzag(r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            com.google.android.gms.internal.measurement.zzch r0 = new com.google.android.gms.internal.measurement.zzch     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            r3 = r0
            r4 = r13
            r3.<init>(r4, r5, r6, r8, r9, r11)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            r15.add(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            boolean r0 = r14.moveToNext()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L84
            if (r0 != 0) goto L4c
        L7b:
            if (r14 == 0) goto L80
            r14.close()
        L80:
            return r15
        L81:
            r15 = move-exception
            r0 = r14
            goto L90
        L84:
            r15 = move-exception
            r0 = r14
            goto L8a
        L87:
            r15 = move-exception
            goto L90
        L89:
            r15 = move-exception
        L8a:
            java.lang.String r14 = "Error loading hits from the database"
            r13.zze(r14, r15)     // Catch: java.lang.Throwable -> L87
            throw r15     // Catch: java.lang.Throwable -> L87
        L90:
            if (r0 == 0) goto L95
            r0.close()
        L95:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbc.zzd(long):java.util.List");
    }

    public final void zze(long j) {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        zza("Deleting hit, id", Long.valueOf(j));
        zza(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092 A[Catch: SQLiteException -> 0x009d, all -> 0x00ac, TRY_LEAVE, TryCatch #1 {all -> 0x00ac, blocks: (B:4:0x003a, B:6:0x0045, B:10:0x0059, B:12:0x006e, B:15:0x0075, B:17:0x0086, B:16:0x0081, B:19:0x008c, B:21:0x0092, B:31:0x00a6, B:32:0x00ab), top: B:37:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.internal.measurement.zzbc, com.google.android.gms.internal.measurement.zzar, com.google.android.gms.internal.measurement.zzaq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzaw> zzf(long r12) {
        /*
            r11 = this;
            r11.zzch()
            com.google.android.gms.analytics.zzk.zzab()
            android.database.sqlite.SQLiteDatabase r0 = r11.getWritableDatabase()
            r12 = 0
            java.lang.String r13 = "cid"
            java.lang.String r1 = "tid"
            java.lang.String r2 = "adid"
            java.lang.String r3 = "hits_count"
            java.lang.String r4 = "params"
            java.lang.String[] r2 = new java.lang.String[]{r13, r1, r2, r3, r4}     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La3
            com.google.android.gms.internal.measurement.zzcd<java.lang.Integer> r13 = com.google.android.gms.internal.measurement.zzcc.zzyr     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La3
            java.lang.Object r13 = r13.get()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La3
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La3
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La3
            java.lang.String r8 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La3
            java.lang.String r3 = "app_uid=?"
            java.lang.String r1 = "0"
            java.lang.String[] r4 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La3
            java.lang.String r1 = "properties"
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La3
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            r12.<init>()     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            if (r1 == 0) goto L8c
        L45:
            r1 = 0
            java.lang.String r5 = r0.getString(r1)     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            r2 = 1
            java.lang.String r6 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            r3 = 2
            int r3 = r0.getInt(r3)     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            if (r3 == 0) goto L58
            r7 = 1
            goto L59
        L58:
            r7 = 0
        L59:
            r1 = 3
            int r1 = r0.getInt(r1)     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            long r8 = (long) r1     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            r1 = 4
            java.lang.String r1 = r0.getString(r1)     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            java.util.Map r10 = r11.zzv(r1)     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            if (r1 != 0) goto L81
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            if (r1 == 0) goto L75
            goto L81
        L75:
            com.google.android.gms.internal.measurement.zzaw r1 = new com.google.android.gms.internal.measurement.zzaw     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            r3 = 0
            r2 = r1
            r2.<init>(r3, r5, r6, r7, r8, r10)     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            r12.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            goto L86
        L81:
            java.lang.String r1 = "Read property with empty client id or tracker id"
            r11.zzc(r1, r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
        L86:
            boolean r1 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            if (r1 != 0) goto L45
        L8c:
            int r1 = r12.size()     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
            if (r1 < r13) goto L97
            java.lang.String r13 = "Sending hits to too many properties. Campaign report might be incorrect"
            r11.zzs(r13)     // Catch: android.database.sqlite.SQLiteException -> L9d java.lang.Throwable -> Lac
        L97:
            if (r0 == 0) goto L9c
            r0.close()
        L9c:
            return r12
        L9d:
            r12 = move-exception
            goto La6
        L9f:
            r13 = move-exception
            r0 = r12
            r12 = r13
            goto Lad
        La3:
            r13 = move-exception
            r0 = r12
            r12 = r13
        La6:
            java.lang.String r13 = "Error loading hits from the database"
            r11.zze(r13, r12)     // Catch: java.lang.Throwable -> Lac
            throw r12     // Catch: java.lang.Throwable -> Lac
        Lac:
            r12 = move-exception
        Lad:
            if (r0 == 0) goto Lb2
            r0.close()
        Lb2:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbc.zzf(long):java.util.List");
    }
}
