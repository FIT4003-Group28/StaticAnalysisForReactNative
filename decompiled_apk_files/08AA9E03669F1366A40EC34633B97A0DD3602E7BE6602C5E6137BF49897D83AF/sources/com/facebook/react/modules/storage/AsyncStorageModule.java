package com.facebook.react.modules.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.aq;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.d;
import com.facebook.react.bridge.j;
/* loaded from: classes.dex */
public final class AsyncStorageModule extends ReactContextBaseJavaModule {
    private static final int MAX_SQL_KEYS = 999;
    protected static final String NAME = "AsyncSQLiteDBStorage";
    private c mReactDatabaseSupplier;
    private boolean mShuttingDown;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public AsyncStorageModule(ah ahVar) {
        super(ahVar);
        this.mShuttingDown = false;
        this.mReactDatabaseSupplier = c.a(ahVar);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.c();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.react.modules.storage.AsyncStorageModule$1] */
    @al
    public void multiGet(final am amVar, final d dVar) {
        if (amVar == null) {
            dVar.a(b.a(null), null);
        } else {
            new j<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.storage.AsyncStorageModule.1
                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[LOOP:3: B:21:0x00bf->B:23:0x00c5, LOOP_END] */
                @Override // com.facebook.react.bridge.j
                /* renamed from: a */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void b(java.lang.Void... r22) {
                    /*
                        Method dump skipped, instructions count: 285
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.AsyncStorageModule.AnonymousClass1.b(java.lang.Void[]):void");
                }
            }.execute(new Void[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.react.modules.storage.AsyncStorageModule$2] */
    @al
    public void multiSet(final am amVar, final d dVar) {
        if (amVar.size() == 0) {
            dVar.a(b.a(null));
        } else {
            new j<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.storage.AsyncStorageModule.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.facebook.react.bridge.j
                /* renamed from: a */
                public void b(Void... voidArr) {
                    ar arVar = null;
                    if (!AsyncStorageModule.this.ensureDatabase()) {
                        dVar.a(b.c(null));
                        return;
                    }
                    SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.b().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
                    try {
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.b().beginTransaction();
                            for (int i = 0; i < amVar.size(); i++) {
                                if (amVar.d(i).size() != 2) {
                                    ar b2 = b.b(null);
                                    try {
                                        AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                        return;
                                    } catch (Exception e) {
                                        com.facebook.common.e.a.a("ReactNative", e.getMessage(), e);
                                        if (b2 != null) {
                                            return;
                                        }
                                        b.a(null, e.getMessage());
                                        return;
                                    }
                                } else if (amVar.d(i).getString(0) == null) {
                                    ar a2 = b.a(null);
                                    try {
                                        AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                        return;
                                    } catch (Exception e2) {
                                        com.facebook.common.e.a.a("ReactNative", e2.getMessage(), e2);
                                        if (a2 != null) {
                                            return;
                                        }
                                        b.a(null, e2.getMessage());
                                        return;
                                    }
                                } else if (amVar.d(i).getString(1) == null) {
                                    ar b3 = b.b(null);
                                    try {
                                        AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                        return;
                                    } catch (Exception e3) {
                                        com.facebook.common.e.a.a("ReactNative", e3.getMessage(), e3);
                                        if (b3 != null) {
                                            return;
                                        }
                                        b.a(null, e3.getMessage());
                                        return;
                                    }
                                } else {
                                    compileStatement.clearBindings();
                                    compileStatement.bindString(1, amVar.d(i).getString(0));
                                    compileStatement.bindString(2, amVar.d(i).getString(1));
                                    compileStatement.execute();
                                }
                            }
                            AsyncStorageModule.this.mReactDatabaseSupplier.b().setTransactionSuccessful();
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                            } catch (Exception e4) {
                                com.facebook.common.e.a.a("ReactNative", e4.getMessage(), e4);
                                arVar = b.a(null, e4.getMessage());
                            }
                        } catch (Exception e5) {
                            com.facebook.common.e.a.a("ReactNative", e5.getMessage(), e5);
                            ar a3 = b.a(null, e5.getMessage());
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                            } catch (Exception e6) {
                                com.facebook.common.e.a.a("ReactNative", e6.getMessage(), e6);
                                if (a3 == null) {
                                    a3 = b.a(null, e6.getMessage());
                                }
                            }
                            arVar = a3;
                        }
                        if (arVar != null) {
                            dVar.a(arVar);
                        } else {
                            dVar.a(new Object[0]);
                        }
                    } catch (Throwable th) {
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                        } catch (Exception e7) {
                            com.facebook.common.e.a.a("ReactNative", e7.getMessage(), e7);
                            b.a(null, e7.getMessage());
                        }
                        throw th;
                    }
                }
            }.execute(new Void[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.react.modules.storage.AsyncStorageModule$3] */
    @al
    public void multiRemove(final am amVar, final d dVar) {
        if (amVar.size() == 0) {
            dVar.a(b.a(null));
        } else {
            new j<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.storage.AsyncStorageModule.3
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.facebook.react.bridge.j
                /* renamed from: a */
                public void b(Void... voidArr) {
                    ar arVar = null;
                    try {
                        if (AsyncStorageModule.this.ensureDatabase()) {
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.b().beginTransaction();
                                for (int i = 0; i < amVar.size(); i += AsyncStorageModule.MAX_SQL_KEYS) {
                                    int min = Math.min(amVar.size() - i, (int) AsyncStorageModule.MAX_SQL_KEYS);
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().delete("catalystLocalStorage", a.a(min), a.a(amVar, i, min));
                                }
                                AsyncStorageModule.this.mReactDatabaseSupplier.b().setTransactionSuccessful();
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                } catch (Exception e) {
                                    com.facebook.common.e.a.a("ReactNative", e.getMessage(), e);
                                    arVar = b.a(null, e.getMessage());
                                }
                            } catch (Exception e2) {
                                com.facebook.common.e.a.a("ReactNative", e2.getMessage(), e2);
                                ar a2 = b.a(null, e2.getMessage());
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                } catch (Exception e3) {
                                    com.facebook.common.e.a.a("ReactNative", e3.getMessage(), e3);
                                    if (a2 == null) {
                                        a2 = b.a(null, e3.getMessage());
                                    }
                                }
                                arVar = a2;
                            }
                            if (arVar != null) {
                                dVar.a(arVar);
                                return;
                            } else {
                                dVar.a(new Object[0]);
                                return;
                            }
                        }
                        dVar.a(b.c(null));
                    } catch (Throwable th) {
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                        } catch (Exception e4) {
                            com.facebook.common.e.a.a("ReactNative", e4.getMessage(), e4);
                            b.a(null, e4.getMessage());
                        }
                        throw th;
                    }
                }
            }.execute(new Void[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.react.modules.storage.AsyncStorageModule$4] */
    @al
    public void multiMerge(final am amVar, final d dVar) {
        new j<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.storage.AsyncStorageModule.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.j
            /* renamed from: a */
            public void b(Void... voidArr) {
                ar arVar = null;
                try {
                    if (!AsyncStorageModule.this.ensureDatabase()) {
                        dVar.a(b.c(null));
                        return;
                    }
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.b().beginTransaction();
                        for (int i = 0; i < amVar.size(); i++) {
                            if (amVar.d(i).size() != 2) {
                                ar b2 = b.b(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                    return;
                                } catch (Exception e) {
                                    com.facebook.common.e.a.a("ReactNative", e.getMessage(), e);
                                    if (b2 != null) {
                                        return;
                                    }
                                    b.a(null, e.getMessage());
                                    return;
                                }
                            } else if (amVar.d(i).getString(0) == null) {
                                ar a2 = b.a(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                    return;
                                } catch (Exception e2) {
                                    com.facebook.common.e.a.a("ReactNative", e2.getMessage(), e2);
                                    if (a2 != null) {
                                        return;
                                    }
                                    b.a(null, e2.getMessage());
                                    return;
                                }
                            } else if (amVar.d(i).getString(1) == null) {
                                ar b3 = b.b(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                    return;
                                } catch (Exception e3) {
                                    com.facebook.common.e.a.a("ReactNative", e3.getMessage(), e3);
                                    if (b3 != null) {
                                        return;
                                    }
                                    b.a(null, e3.getMessage());
                                    return;
                                }
                            } else if (!a.b(AsyncStorageModule.this.mReactDatabaseSupplier.b(), amVar.d(i).getString(0), amVar.d(i).getString(1))) {
                                ar c2 = b.c(null);
                                try {
                                    AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                                    return;
                                } catch (Exception e4) {
                                    com.facebook.common.e.a.a("ReactNative", e4.getMessage(), e4);
                                    if (c2 != null) {
                                        return;
                                    }
                                    b.a(null, e4.getMessage());
                                    return;
                                }
                            }
                        }
                        AsyncStorageModule.this.mReactDatabaseSupplier.b().setTransactionSuccessful();
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                        } catch (Exception e5) {
                            com.facebook.common.e.a.a("ReactNative", e5.getMessage(), e5);
                            arVar = b.a(null, e5.getMessage());
                        }
                    } catch (Exception e6) {
                        com.facebook.common.e.a.a("ReactNative", e6.getMessage(), e6);
                        ar a3 = b.a(null, e6.getMessage());
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                        } catch (Exception e7) {
                            com.facebook.common.e.a.a("ReactNative", e7.getMessage(), e7);
                            if (a3 == null) {
                                a3 = b.a(null, e7.getMessage());
                            }
                        }
                        arVar = a3;
                    }
                    if (arVar != null) {
                        dVar.a(arVar);
                    } else {
                        dVar.a(new Object[0]);
                    }
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.b().endTransaction();
                    } catch (Exception e8) {
                        com.facebook.common.e.a.a("ReactNative", e8.getMessage(), e8);
                        b.a(null, e8.getMessage());
                    }
                    throw th;
                }
            }
        }.execute(new Void[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.react.modules.storage.AsyncStorageModule$5] */
    @al
    public void clear(final d dVar) {
        new j<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.storage.AsyncStorageModule.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.j
            /* renamed from: a */
            public void b(Void... voidArr) {
                if (AsyncStorageModule.this.mReactDatabaseSupplier.a()) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.d();
                        dVar.a(new Object[0]);
                        return;
                    } catch (Exception e) {
                        com.facebook.common.e.a.a("ReactNative", e.getMessage(), e);
                        dVar.a(b.a(null, e.getMessage()));
                        return;
                    }
                }
                dVar.a(b.c(null));
            }
        }.execute(new Void[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.react.modules.storage.AsyncStorageModule$6] */
    @al
    public void getAllKeys(final d dVar) {
        new j<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.storage.AsyncStorageModule.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.j
            /* renamed from: a */
            public void b(Void... voidArr) {
                if (!AsyncStorageModule.this.ensureDatabase()) {
                    dVar.a(b.c(null), null);
                    return;
                }
                aq a2 = com.facebook.react.bridge.b.a();
                Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.b().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
                try {
                    try {
                        if (query.moveToFirst()) {
                            do {
                                a2.pushString(query.getString(0));
                            } while (query.moveToNext());
                            query.close();
                            dVar.a(null, a2);
                        }
                        query.close();
                        dVar.a(null, a2);
                    } catch (Exception e) {
                        com.facebook.common.e.a.a("ReactNative", e.getMessage(), e);
                        dVar.a(b.a(null, e.getMessage()), null);
                        query.close();
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
        }.execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.a();
    }
}
