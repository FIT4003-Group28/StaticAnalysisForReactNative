package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
@com.facebook.react.d0.a.a(name = AsyncStorageModule.NAME)
/* loaded from: classes.dex */
public final class AsyncStorageModule extends ReactContextBaseJavaModule implements com.facebook.react.e0.a.a {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNC_AsyncSQLiteDBStorage";
    private final g executor;
    private com.reactnativecommunity.asyncstorage.e mReactDatabaseSupplier;
    private boolean mShuttingDown;

    /* loaded from: classes.dex */
    class a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f9735a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f9736b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f9735a = callback;
            this.f9736b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c1 A[LOOP:3: B:21:0x00bb->B:23:0x00c1, LOOP_END] */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void doInBackgroundGuarded(java.lang.Void... r20) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.asyncstorage.AsyncStorageModule.a.doInBackgroundGuarded(java.lang.Void[]):void");
        }
    }

    /* loaded from: classes.dex */
    class b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f9738a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f9739b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f9738a = callback;
            this.f9739b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f9738a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.d().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.d().beginTransaction();
                    for (int i = 0; i < this.f9739b.size(); i++) {
                        if (this.f9739b.mo208getArray(i).size() != 2) {
                            WritableMap c2 = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                                return;
                            } catch (Exception e2) {
                                c.d.d.e.a.c("ReactNative", e2.getMessage(), e2);
                                if (c2 != null) {
                                    return;
                                }
                                com.reactnativecommunity.asyncstorage.b.a(null, e2.getMessage());
                                return;
                            }
                        } else if (this.f9739b.mo208getArray(i).getString(0) == null) {
                            WritableMap b2 = com.reactnativecommunity.asyncstorage.b.b(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                                return;
                            } catch (Exception e3) {
                                c.d.d.e.a.c("ReactNative", e3.getMessage(), e3);
                                if (b2 != null) {
                                    return;
                                }
                                com.reactnativecommunity.asyncstorage.b.a(null, e3.getMessage());
                                return;
                            }
                        } else if (this.f9739b.mo208getArray(i).getString(1) == null) {
                            WritableMap c3 = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                                return;
                            } catch (Exception e4) {
                                c.d.d.e.a.c("ReactNative", e4.getMessage(), e4);
                                if (c3 != null) {
                                    return;
                                }
                                com.reactnativecommunity.asyncstorage.b.a(null, e4.getMessage());
                                return;
                            }
                        } else {
                            compileStatement.clearBindings();
                            compileStatement.bindString(1, this.f9739b.mo208getArray(i).getString(0));
                            compileStatement.bindString(2, this.f9739b.mo208getArray(i).getString(1));
                            compileStatement.execute();
                        }
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.d().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                    } catch (Exception e5) {
                        c.d.d.e.a.c("ReactNative", e5.getMessage(), e5);
                        writableMap = com.reactnativecommunity.asyncstorage.b.a(null, e5.getMessage());
                    }
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                    } catch (Exception e6) {
                        c.d.d.e.a.c("ReactNative", e6.getMessage(), e6);
                        com.reactnativecommunity.asyncstorage.b.a(null, e6.getMessage());
                    }
                    throw th;
                }
            } catch (Exception e7) {
                c.d.d.e.a.c("ReactNative", e7.getMessage(), e7);
                WritableMap a2 = com.reactnativecommunity.asyncstorage.b.a(null, e7.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                } catch (Exception e8) {
                    c.d.d.e.a.c("ReactNative", e8.getMessage(), e8);
                    if (a2 == null) {
                        writableMap = com.reactnativecommunity.asyncstorage.b.a(null, e8.getMessage());
                    }
                }
                writableMap = a2;
            }
            Callback callback = this.f9738a;
            if (writableMap != null) {
                callback.invoke(writableMap);
            } else {
                callback.invoke(new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f9741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f9742b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f9741a = callback;
            this.f9742b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            try {
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    this.f9741a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                    return;
                }
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.d().beginTransaction();
                    for (int i = 0; i < this.f9742b.size(); i += AsyncStorageModule.MAX_SQL_KEYS) {
                        int min = Math.min(this.f9742b.size() - i, (int) AsyncStorageModule.MAX_SQL_KEYS);
                        AsyncStorageModule.this.mReactDatabaseSupplier.d().delete("catalystLocalStorage", com.reactnativecommunity.asyncstorage.a.a(min), com.reactnativecommunity.asyncstorage.a.a(this.f9742b, i, min));
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.d().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                    } catch (Exception e2) {
                        c.d.d.e.a.c("ReactNative", e2.getMessage(), e2);
                        writableMap = com.reactnativecommunity.asyncstorage.b.a(null, e2.getMessage());
                    }
                } catch (Exception e3) {
                    c.d.d.e.a.c("ReactNative", e3.getMessage(), e3);
                    WritableMap a2 = com.reactnativecommunity.asyncstorage.b.a(null, e3.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                    } catch (Exception e4) {
                        c.d.d.e.a.c("ReactNative", e4.getMessage(), e4);
                        if (a2 == null) {
                            writableMap = com.reactnativecommunity.asyncstorage.b.a(null, e4.getMessage());
                        }
                    }
                    writableMap = a2;
                }
                Callback callback = this.f9741a;
                if (writableMap != null) {
                    callback.invoke(writableMap);
                } else {
                    callback.invoke(new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                } catch (Exception e5) {
                    c.d.d.e.a.c("ReactNative", e5.getMessage(), e5);
                    com.reactnativecommunity.asyncstorage.b.a(null, e5.getMessage());
                }
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    class d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f9744a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f9745b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f9744a = callback;
            this.f9745b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            try {
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    this.f9744a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                    return;
                }
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.d().beginTransaction();
                    for (int i = 0; i < this.f9745b.size(); i++) {
                        if (this.f9745b.mo208getArray(i).size() != 2) {
                            WritableMap c2 = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                                return;
                            } catch (Exception e2) {
                                c.d.d.e.a.c("ReactNative", e2.getMessage(), e2);
                                if (c2 != null) {
                                    return;
                                }
                                com.reactnativecommunity.asyncstorage.b.a(null, e2.getMessage());
                                return;
                            }
                        } else if (this.f9745b.mo208getArray(i).getString(0) == null) {
                            WritableMap b2 = com.reactnativecommunity.asyncstorage.b.b(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                                return;
                            } catch (Exception e3) {
                                c.d.d.e.a.c("ReactNative", e3.getMessage(), e3);
                                if (b2 != null) {
                                    return;
                                }
                                com.reactnativecommunity.asyncstorage.b.a(null, e3.getMessage());
                                return;
                            }
                        } else if (this.f9745b.mo208getArray(i).getString(1) == null) {
                            WritableMap c3 = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                                return;
                            } catch (Exception e4) {
                                c.d.d.e.a.c("ReactNative", e4.getMessage(), e4);
                                if (c3 != null) {
                                    return;
                                }
                                com.reactnativecommunity.asyncstorage.b.a(null, e4.getMessage());
                                return;
                            }
                        } else if (!com.reactnativecommunity.asyncstorage.a.a(AsyncStorageModule.this.mReactDatabaseSupplier.d(), this.f9745b.mo208getArray(i).getString(0), this.f9745b.mo208getArray(i).getString(1))) {
                            WritableMap a2 = com.reactnativecommunity.asyncstorage.b.a(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                                return;
                            } catch (Exception e5) {
                                c.d.d.e.a.c("ReactNative", e5.getMessage(), e5);
                                if (a2 != null) {
                                    return;
                                }
                                com.reactnativecommunity.asyncstorage.b.a(null, e5.getMessage());
                                return;
                            }
                        }
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.d().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                    } catch (Exception e6) {
                        c.d.d.e.a.c("ReactNative", e6.getMessage(), e6);
                        writableMap = com.reactnativecommunity.asyncstorage.b.a(null, e6.getMessage());
                    }
                } catch (Exception e7) {
                    c.d.d.e.a.c("ReactNative", e7.getMessage(), e7);
                    WritableMap a3 = com.reactnativecommunity.asyncstorage.b.a(null, e7.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                    } catch (Exception e8) {
                        c.d.d.e.a.c("ReactNative", e8.getMessage(), e8);
                        if (a3 == null) {
                            writableMap = com.reactnativecommunity.asyncstorage.b.a(null, e8.getMessage());
                        }
                    }
                    writableMap = a3;
                }
                Callback callback = this.f9744a;
                if (writableMap != null) {
                    callback.invoke(writableMap);
                } else {
                    callback.invoke(new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.d().endTransaction();
                } catch (Exception e9) {
                    c.d.d.e.a.c("ReactNative", e9.getMessage(), e9);
                    com.reactnativecommunity.asyncstorage.b.a(null, e9.getMessage());
                }
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f9747a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f9747a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.c()) {
                this.f9747a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.a();
                this.f9747a.invoke(new Object[0]);
            } catch (Exception e2) {
                c.d.d.e.a.c("ReactNative", e2.getMessage(), e2);
                this.f9747a.invoke(com.reactnativecommunity.asyncstorage.b.a(null, e2.getMessage()));
            }
        }
    }

    /* loaded from: classes.dex */
    class f extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f9749a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f9749a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f9749a.invoke(com.reactnativecommunity.asyncstorage.b.a(null), null);
                return;
            }
            WritableArray createArray = Arguments.createArray();
            Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.d().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
            try {
                try {
                    if (!query.moveToFirst()) {
                        query.close();
                        this.f9749a.invoke(null, createArray);
                    }
                    do {
                        createArray.pushString(query.getString(0));
                    } while (query.moveToNext());
                    query.close();
                    this.f9749a.invoke(null, createArray);
                } catch (Exception e2) {
                    c.d.d.e.a.c("ReactNative", e2.getMessage(), e2);
                    this.f9749a.invoke(com.reactnativecommunity.asyncstorage.b.a(null, e2.getMessage()), null);
                    query.close();
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    private class g implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayDeque<Runnable> f9751a = new ArrayDeque<>();

        /* renamed from: b  reason: collision with root package name */
        private Runnable f9752b;

        /* renamed from: c  reason: collision with root package name */
        private final Executor f9753c;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Runnable f9754b;

            a(Runnable runnable) {
                this.f9754b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f9754b.run();
                } finally {
                    g.this.a();
                }
            }
        }

        g(AsyncStorageModule asyncStorageModule, Executor executor) {
            this.f9753c = executor;
        }

        synchronized void a() {
            Runnable poll = this.f9751a.poll();
            this.f9752b = poll;
            if (poll != null) {
                this.f9753c.execute(this.f9752b);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.f9751a.offer(new a(runnable));
            if (this.f9752b == null) {
                a();
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new g(this, executor);
        this.mReactDatabaseSupplier = com.reactnativecommunity.asyncstorage.e.a(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.c();
    }

    @ReactMethod
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.b();
    }

    @ReactMethod
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(com.reactnativecommunity.asyncstorage.b.b(null), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }
}
