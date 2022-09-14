package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.baidu.mapapi.UIMsg;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzeb implements zzcb {
    private static final String zzwu = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time");
    private final zzed zzazt;
    private volatile zzbe zzazu;
    private final zzcc zzazv;
    private final String zzazw;
    private long zzazx;
    private final int zzazy;
    private final Context zzqx;
    private Clock zzro;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeb(zzcc zzccVar, Context context) {
        this(zzccVar, context, "gtm_urls.db", UIMsg.m_AppUI.MSG_APP_DATA_OK);
    }

    @VisibleForTesting
    private zzeb(zzcc zzccVar, Context context, String str, int i) {
        this.zzqx = context.getApplicationContext();
        this.zzazw = str;
        this.zzazv = zzccVar;
        this.zzro = DefaultClock.getInstance();
        this.zzazt = new zzed(this, this.zzqx, this.zzazw);
        this.zzazu = new zzfu(this.zzqx, new zzec(this));
        this.zzazx = 0L;
        this.zzazy = UIMsg.m_AppUI.MSG_APP_DATA_OK;
    }

    private final void zza(String[] strArr) {
        SQLiteDatabase zzcv;
        if (strArr == null || strArr.length == 0 || (zzcv = zzcv("Error opening database for deleteHits.")) == null) {
            return;
        }
        boolean z = true;
        try {
            zzcv.delete("gtm_hits", String.format("HIT_ID in (%s)", TextUtils.join(",", Collections.nCopies(strArr.length, "?"))), strArr);
            zzcc zzccVar = this.zzazv;
            if (zzoc() != 0) {
                z = false;
            }
            zzccVar.zzo(z);
        } catch (SQLiteException unused) {
            zzdi.zzaa("Error deleting hits");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(long j, long j2) {
        SQLiteDatabase zzcv = zzcv("Error opening database for getNumStoredHits.");
        if (zzcv == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_first_send_time", Long.valueOf(j2));
        try {
            zzcv.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
        } catch (SQLiteException unused) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("Error setting HIT_FIRST_DISPATCH_TIME for hitId: ");
            sb.append(j);
            zzdi.zzaa(sb.toString());
            zze(j);
        }
    }

    private final SQLiteDatabase zzcv(String str) {
        try {
            return this.zzazt.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzdi.zzaa(str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(long j) {
        zza(new String[]{String.valueOf(j)});
    }

    private final int zzoc() {
        Cursor rawQuery;
        SQLiteDatabase zzcv = zzcv("Error opening database for getNumStoredHits.");
        int i = 0;
        if (zzcv == null) {
            return 0;
        }
        Cursor cursor = null;
        try {
            try {
                rawQuery = zzcv.rawQuery("SELECT COUNT(*) from gtm_hits", null);
            } catch (SQLiteException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (rawQuery.moveToFirst()) {
                i = (int) rawQuery.getLong(0);
            }
            if (rawQuery != null) {
                rawQuery.close();
                return i;
            }
        } catch (SQLiteException unused2) {
            cursor = rawQuery;
            zzdi.zzaa("Error getting numStoredHits");
            if (cursor != null) {
                cursor.close();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
            cursor = rawQuery;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return i;
    }

    private final int zzod() {
        Cursor query;
        SQLiteDatabase zzcv = zzcv("Error opening database for getNumStoredHits.");
        if (zzcv == null) {
            return 0;
        }
        Cursor cursor = null;
        try {
            try {
                query = zzcv.query("gtm_hits", new String[]{"hit_id", "hit_first_send_time"}, "hit_first_send_time=0", null, null, null, null);
            } catch (SQLiteException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            int count = query.getCount();
            if (query != null) {
                query.close();
            }
            return count;
        } catch (SQLiteException unused2) {
            cursor = query;
            zzdi.zzaa("Error getting num untried hits");
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
            cursor = query;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.lang.String> zzx(int r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r15 > 0) goto Ld
            java.lang.String r15 = "Invalid maxHits specified. Skipping"
            com.google.android.gms.tagmanager.zzdi.zzaa(r15)
            return r0
        Ld:
            java.lang.String r1 = "Error opening database for peekHitIds."
            android.database.sqlite.SQLiteDatabase r2 = r14.zzcv(r1)
            if (r2 != 0) goto L16
            return r0
        L16:
            r1 = 0
            java.lang.String r3 = "gtm_hits"
            java.lang.String r4 = "hit_id"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L5e android.database.sqlite.SQLiteException -> L60
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "%s ASC"
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L5e android.database.sqlite.SQLiteException -> L60
            java.lang.String r11 = "hit_id"
            r12 = 0
            r10[r12] = r11     // Catch: java.lang.Throwable -> L5e android.database.sqlite.SQLiteException -> L60
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch: java.lang.Throwable -> L5e android.database.sqlite.SQLiteException -> L60
            java.lang.String r10 = java.lang.Integer.toString(r15)     // Catch: java.lang.Throwable -> L5e android.database.sqlite.SQLiteException -> L60
            android.database.Cursor r15 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5e android.database.sqlite.SQLiteException -> L60
            boolean r1 = r15.moveToFirst()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> L59
            if (r1 == 0) goto L50
        L3f:
            long r1 = r15.getLong(r12)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> L59
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> L59
            r0.add(r1)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> L59
            boolean r1 = r15.moveToNext()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> L59
            if (r1 != 0) goto L3f
        L50:
            if (r15 == 0) goto L83
            r15.close()
            return r0
        L56:
            r0 = move-exception
            r1 = r15
            goto L84
        L59:
            r1 = move-exception
            r13 = r1
            r1 = r15
            r15 = r13
            goto L61
        L5e:
            r0 = move-exception
            goto L84
        L60:
            r15 = move-exception
        L61:
            java.lang.String r2 = "Error in peekHits fetching hitIds: "
            java.lang.String r15 = r15.getMessage()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch: java.lang.Throwable -> L5e
            int r3 = r15.length()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L76
            java.lang.String r15 = r2.concat(r15)     // Catch: java.lang.Throwable -> L5e
            goto L7b
        L76:
            java.lang.String r15 = new java.lang.String     // Catch: java.lang.Throwable -> L5e
            r15.<init>(r2)     // Catch: java.lang.Throwable -> L5e
        L7b:
            com.google.android.gms.tagmanager.zzdi.zzaa(r15)     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L83
            r1.close()
        L83:
            return r0
        L84:
            if (r1 == 0) goto L89
            r1.close()
        L89:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzeb.zzx(int):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d A[Catch: all -> 0x0148, TryCatch #3 {all -> 0x0148, blocks: (B:21:0x009c, B:24:0x00a3, B:26:0x00b0, B:28:0x00d9, B:27:0x00be, B:45:0x00fd, B:47:0x010d, B:49:0x0117, B:51:0x0129, B:55:0x013e, B:48:0x0112), top: B:89:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112 A[Catch: all -> 0x0148, TryCatch #3 {all -> 0x0148, blocks: (B:21:0x009c, B:24:0x00a3, B:26:0x00b0, B:28:0x00d9, B:27:0x00be, B:45:0x00fd, B:47:0x010d, B:49:0x0117, B:51:0x0129, B:55:0x013e, B:48:0x0112), top: B:89:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129 A[Catch: all -> 0x0148, TryCatch #3 {all -> 0x0148, blocks: (B:21:0x009c, B:24:0x00a3, B:26:0x00b0, B:28:0x00d9, B:27:0x00be, B:45:0x00fd, B:47:0x010d, B:49:0x0117, B:51:0x0129, B:55:0x013e, B:48:0x0112), top: B:89:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e A[Catch: all -> 0x0191, TryCatch #7 {all -> 0x0191, blocks: (B:76:0x016e, B:78:0x017e, B:80:0x0188, B:79:0x0183), top: B:94:0x016e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0183 A[Catch: all -> 0x0191, TryCatch #7 {all -> 0x0191, blocks: (B:76:0x016e, B:78:0x017e, B:80:0x0188, B:79:0x0183), top: B:94:0x016e }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.google.android.gms.tagmanager.zzbw> zzy(int r19) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzeb.zzy(int):java.util.List");
    }

    @Override // com.google.android.gms.tagmanager.zzcb
    public final void dispatch() {
        zzdi.v("GTM Dispatch running...");
        if (!this.zzazu.zzng()) {
            return;
        }
        List<zzbw> zzy = zzy(40);
        if (zzy.isEmpty()) {
            zzdi.v("...nothing to dispatch");
            this.zzazv.zzo(true);
            return;
        }
        this.zzazu.zze(zzy);
        if (zzod() <= 0) {
            return;
        }
        zzfn.zzox().dispatch();
    }

    @Override // com.google.android.gms.tagmanager.zzcb
    public final void zzb(long j, String str) {
        long currentTimeMillis = this.zzro.currentTimeMillis();
        if (currentTimeMillis > this.zzazx + 86400000) {
            this.zzazx = currentTimeMillis;
            SQLiteDatabase zzcv = zzcv("Error opening database for deleteStaleHits.");
            if (zzcv != null) {
                zzcv.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.zzro.currentTimeMillis() - 2592000000L)});
                this.zzazv.zzo(zzoc() == 0);
            }
        }
        int zzoc = (zzoc() - this.zzazy) + 1;
        if (zzoc > 0) {
            List<String> zzx = zzx(zzoc);
            int size = zzx.size();
            StringBuilder sb = new StringBuilder(51);
            sb.append("Store full, deleting ");
            sb.append(size);
            sb.append(" hits to make room.");
            zzdi.v(sb.toString());
            zza((String[]) zzx.toArray(new String[0]));
        }
        SQLiteDatabase zzcv2 = zzcv("Error opening database for putHit");
        if (zzcv2 != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_time", Long.valueOf(j));
            contentValues.put("hit_url", str);
            contentValues.put("hit_first_send_time", (Integer) 0);
            try {
                zzcv2.insert("gtm_hits", null, contentValues);
                this.zzazv.zzo(false);
            } catch (SQLiteException unused) {
                zzdi.zzaa("Error storing hit");
            }
        }
    }
}
