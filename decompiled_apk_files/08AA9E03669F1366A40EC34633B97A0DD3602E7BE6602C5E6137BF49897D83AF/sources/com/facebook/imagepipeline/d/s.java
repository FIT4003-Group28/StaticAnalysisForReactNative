package com.facebook.imagepipeline.d;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.facebook.imagepipeline.n.b;
import com.facebook.imagepipeline.n.d;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: MediaVariationsIndexDatabase.java */
/* loaded from: classes.dex */
public class s implements r {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2599a = "s";

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f2600b = {"cache_choice", "cache_key", "width", "height"};

    /* renamed from: c  reason: collision with root package name */
    private final b f2601c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f2602d;
    private final Executor e;

    public s(Context context, Executor executor, Executor executor2) {
        this.f2601c = new b(context);
        this.f2602d = executor;
        this.e = executor2;
    }

    @Override // com.facebook.imagepipeline.d.r
    public a.h<com.facebook.imagepipeline.n.d> a(final String str, final d.a aVar) {
        try {
            return a.h.a(new Callable<com.facebook.imagepipeline.n.d>() { // from class: com.facebook.imagepipeline.d.s.1
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public com.facebook.imagepipeline.n.d call() {
                    return s.this.b(str, aVar);
                }
            }, this.f2602d);
        } catch (Exception e) {
            com.facebook.common.e.a.a(f2599a, e, "Failed to schedule query task for %s", str);
            return a.h.a(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #2 {, blocks: (B:5:0x0005, B:12:0x002a, B:13:0x002d, B:25:0x007e, B:26:0x0081, B:41:0x00a2, B:42:0x00a5), top: B:47:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.facebook.imagepipeline.n.d b(java.lang.String r19, com.facebook.imagepipeline.n.d.a r20) {
        /*
            r18 = this;
            java.lang.Class<com.facebook.imagepipeline.d.s> r2 = com.facebook.imagepipeline.d.s.class
            monitor-enter(r2)
            r3 = r18
            com.facebook.imagepipeline.d.s$b r4 = r3.f2601c     // Catch: java.lang.Throwable -> La6
            android.database.sqlite.SQLiteDatabase r5 = r4.a()     // Catch: java.lang.Throwable -> La6
            r4 = 0
            r13 = 1
            java.lang.String r8 = "media_id = ?"
            java.lang.String[] r9 = new java.lang.String[r13]     // Catch: java.lang.Throwable -> L8a android.database.SQLException -> L8e
            r9[r4] = r19     // Catch: java.lang.Throwable -> L8a android.database.SQLException -> L8e
            java.lang.String r6 = "media_variations_index"
            java.lang.String[] r7 = com.facebook.imagepipeline.d.s.f2600b     // Catch: java.lang.Throwable -> L8a android.database.SQLException -> L8e
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L8a android.database.SQLException -> L8e
            int r6 = r5.getCount()     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            if (r6 != 0) goto L2f
            com.facebook.imagepipeline.n.d r6 = r20.a()     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            if (r5 == 0) goto L2d
            r5.close()     // Catch: java.lang.Throwable -> La6
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La6
            return r6
        L2f:
            java.lang.String r6 = "cache_key"
            int r6 = r5.getColumnIndexOrThrow(r6)     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            java.lang.String r7 = "width"
            int r7 = r5.getColumnIndexOrThrow(r7)     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            java.lang.String r8 = "height"
            int r8 = r5.getColumnIndexOrThrow(r8)     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            java.lang.String r9 = "cache_choice"
            int r9 = r5.getColumnIndexOrThrow(r9)     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
        L47:
            boolean r10 = r5.moveToNext()     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            if (r10 == 0) goto L76
            java.lang.String r10 = r5.getString(r9)     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            java.lang.String r11 = r5.getString(r6)     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            int r12 = r5.getInt(r7)     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            int r15 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            boolean r16 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            if (r16 == 0) goto L6b
            r10 = r20
            r14 = 0
            goto L72
        L6b:
            com.facebook.imagepipeline.n.b$a r10 = com.facebook.imagepipeline.n.b.a.valueOf(r10)     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            r14 = r10
            r10 = r20
        L72:
            r10.a(r11, r12, r15, r14)     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            goto L47
        L76:
            r10 = r20
            com.facebook.imagepipeline.n.d r6 = r20.a()     // Catch: java.lang.Throwable -> L83 android.database.SQLException -> L86
            if (r5 == 0) goto L81
            r5.close()     // Catch: java.lang.Throwable -> La6
        L81:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La6
            return r6
        L83:
            r0 = move-exception
            r1 = r0
            goto La0
        L86:
            r0 = move-exception
            r14 = r5
            r5 = r0
            goto L91
        L8a:
            r0 = move-exception
            r1 = r0
            r5 = 0
            goto La0
        L8e:
            r0 = move-exception
            r5 = r0
            r14 = 0
        L91:
            java.lang.String r6 = com.facebook.imagepipeline.d.s.f2599a     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = "Error reading for %s"
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L9d
            r8[r4] = r19     // Catch: java.lang.Throwable -> L9d
            com.facebook.common.e.a.b(r6, r5, r7, r8)     // Catch: java.lang.Throwable -> L9d
            throw r5     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            r1 = r0
            r5 = r14
        La0:
            if (r5 == 0) goto La5
            r5.close()     // Catch: java.lang.Throwable -> La6
        La5:
            throw r1     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La6
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.d.s.b(java.lang.String, com.facebook.imagepipeline.n.d$a):com.facebook.imagepipeline.n.d");
    }

    @Override // com.facebook.imagepipeline.d.r
    public void a(final String str, final b.a aVar, final com.facebook.b.a.d dVar, final com.facebook.imagepipeline.i.d dVar2) {
        this.e.execute(new Runnable() { // from class: com.facebook.imagepipeline.d.s.2
            @Override // java.lang.Runnable
            public void run() {
                s.this.b(str, aVar, dVar, dVar2);
            }
        });
    }

    protected void b(String str, b.a aVar, com.facebook.b.a.d dVar, com.facebook.imagepipeline.i.d dVar2) {
        synchronized (s.class) {
            SQLiteDatabase a2 = this.f2601c.a();
            try {
                a2.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put("media_id", str);
                contentValues.put("width", Integer.valueOf(dVar2.g()));
                contentValues.put("height", Integer.valueOf(dVar2.h()));
                contentValues.put("cache_choice", aVar.name());
                contentValues.put("cache_key", dVar.a());
                contentValues.put("resource_id", com.facebook.b.a.e.b(dVar));
                a2.replaceOrThrow("media_variations_index", null, contentValues);
                a2.setTransactionSuccessful();
            } catch (Exception e) {
                com.facebook.common.e.a.b(f2599a, e, "Error writing for %s", str);
            }
            a2.endTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaVariationsIndexDatabase.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f2610a;

        /* renamed from: b  reason: collision with root package name */
        private a f2611b;

        private b(Context context) {
            this.f2610a = context;
        }

        public synchronized SQLiteDatabase a() {
            if (this.f2611b == null) {
                this.f2611b = new a(this.f2610a);
            }
            return this.f2611b.getWritableDatabase();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaVariationsIndexDatabase.java */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {
        public a(Context context) {
            super(context, "FrescoMediaVariationsIndex.db", (SQLiteDatabase.CursorFactory) null, 2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("CREATE TABLE media_variations_index (_id INTEGER PRIMARY KEY,media_id TEXT,width INTEGER,height INTEGER,cache_choice TEXT,cache_key TEXT,resource_id TEXT UNIQUE )");
                sQLiteDatabase.execSQL("CREATE INDEX index_media_id ON media_variations_index (media_id)");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_variations_index");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                onCreate(sQLiteDatabase);
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            onUpgrade(sQLiteDatabase, i, i2);
        }
    }
}
