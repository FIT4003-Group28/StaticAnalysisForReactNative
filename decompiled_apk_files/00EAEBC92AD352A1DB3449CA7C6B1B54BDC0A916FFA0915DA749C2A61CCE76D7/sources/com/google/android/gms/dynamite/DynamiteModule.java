package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f7126b = null;

    /* renamed from: c  reason: collision with root package name */
    private static i f7127c = null;

    /* renamed from: d  reason: collision with root package name */
    private static k f7128d = null;

    /* renamed from: e  reason: collision with root package name */
    private static String f7129e = null;

    /* renamed from: f  reason: collision with root package name */
    private static int f7130f = -1;

    /* renamed from: g  reason: collision with root package name */
    private static final ThreadLocal<c> f7131g = new ThreadLocal<>();

    /* renamed from: h  reason: collision with root package name */
    private static final b.a f7132h = new com.google.android.gms.dynamite.a();
    public static final b i;
    public static final b j;
    public static final b k;

    /* renamed from: a  reason: collision with root package name */
    private final Context f7133a;

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes.dex */
    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        /* synthetic */ a(String str, com.google.android.gms.dynamite.a aVar) {
            this(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ a(String str, Throwable th, com.google.android.gms.dynamite.a aVar) {
            this(str, th);
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public interface a {
            int a(Context context, String str);

            int a(Context context, String str, boolean z);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0151b {

            /* renamed from: a  reason: collision with root package name */
            public int f7134a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f7135b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f7136c = 0;
        }

        C0151b a(Context context, String str, a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Cursor f7137a;

        private c() {
        }

        /* synthetic */ c(com.google.android.gms.dynamite.a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f7138a;

        public d(int i, int i2) {
            this.f7138a = i;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
        public final int a(Context context, String str) {
            return this.f7138a;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
        public final int a(Context context, String str, boolean z) {
            return 0;
        }
    }

    static {
        new com.google.android.gms.dynamite.b();
        i = new com.google.android.gms.dynamite.c();
        new com.google.android.gms.dynamite.d();
        j = new e();
        k = new f();
        new g();
    }

    private DynamiteModule(Context context) {
        s.a(context);
        this.f7133a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int a(Context context, String str, boolean z) {
        Class<?> loadClass;
        Field declaredField;
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool2 = f7126b;
                if (bool2 == null) {
                    try {
                        loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                        declaredField = loadClass.getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String valueOf = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(valueOf);
                        Log.w("DynamiteModule", sb.toString());
                        bool2 = Boolean.FALSE;
                    }
                    synchronized (loadClass) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader != ClassLoader.getSystemClassLoader()) {
                                try {
                                    a(classLoader);
                                } catch (a unused) {
                                }
                                bool = Boolean.TRUE;
                                bool2 = bool;
                                f7126b = bool2;
                            }
                        } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                        } else {
                            try {
                                int c2 = c(context, str, z);
                                if (f7129e != null && !f7129e.isEmpty()) {
                                    h hVar = new h(f7129e, ClassLoader.getSystemClassLoader());
                                    a(hVar);
                                    declaredField.set(null, hVar);
                                    f7126b = Boolean.TRUE;
                                    return c2;
                                }
                                return c2;
                            } catch (a unused2) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                            }
                        }
                        bool = Boolean.FALSE;
                        bool2 = bool;
                        f7126b = bool2;
                    }
                }
                if (!bool2.booleanValue()) {
                    return b(context, str, z);
                }
                try {
                    return c(context, str, z);
                } catch (a e3) {
                    String valueOf2 = String.valueOf(e3.getMessage());
                    Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                    return 0;
                }
            }
        } catch (Throwable th) {
            com.google.android.gms.common.util.g.a(context, th);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r11 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
        if (r11 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule a(android.content.Context r10, com.google.android.gms.dynamite.DynamiteModule.b r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    private static DynamiteModule a(Context context, String str, int i2) {
        Boolean bool;
        c.e.a.b.c.a b2;
        try {
            synchronized (DynamiteModule.class) {
                bool = f7126b;
            }
            if (bool == null) {
                throw new a("Failed to determine which loading route to use.", (com.google.android.gms.dynamite.a) null);
            }
            if (bool.booleanValue()) {
                return b(context, str, i2);
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("Selected remote version of ");
            sb.append(str);
            sb.append(", version >= ");
            sb.append(i2);
            Log.i("DynamiteModule", sb.toString());
            i a2 = a(context);
            if (a2 == null) {
                throw new a("Failed to create IDynamiteLoader.", (com.google.android.gms.dynamite.a) null);
            }
            if (a2.d() >= 2) {
                b2 = a2.a(c.e.a.b.c.b.a(context), str, i2);
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                b2 = a2.b(c.e.a.b.c.b.a(context), str, i2);
            }
            if (c.e.a.b.c.b.a(b2) == null) {
                throw new a("Failed to load remote module.", (com.google.android.gms.dynamite.a) null);
            }
            return new DynamiteModule((Context) c.e.a.b.c.b.a(b2));
        } catch (RemoteException e2) {
            throw new a("Failed to load remote module.", e2, null);
        } catch (a e3) {
            throw e3;
        } catch (Throwable th) {
            com.google.android.gms.common.util.g.a(context, th);
            throw new a("Failed to load remote module.", th, null);
        }
    }

    private static i a(Context context) {
        i jVar;
        synchronized (DynamiteModule.class) {
            if (f7127c != null) {
                return f7127c;
            } else if (com.google.android.gms.common.f.a().b(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        jVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        jVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new j(iBinder);
                    }
                    if (jVar != null) {
                        f7127c = jVar;
                        return jVar;
                    }
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
                }
                return null;
            }
        }
    }

    private static Boolean a() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f7130f >= 2);
        }
        return valueOf;
    }

    private static void a(ClassLoader classLoader) {
        k lVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                lVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                lVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new l(iBinder);
            }
            f7128d = lVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, null);
        }
    }

    public static int b(Context context, String str) {
        return a(context, str, false);
    }

    private static int b(Context context, String str, boolean z) {
        i a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        try {
            if (a2.d() >= 2) {
                return a2.a(c.e.a.b.c.b.a(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a2.b(c.e.a.b.c.b.a(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    private static DynamiteModule b(Context context, String str, int i2) {
        k kVar;
        c.e.a.b.c.a a2;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            kVar = f7128d;
        }
        if (kVar != null) {
            c cVar = f7131g.get();
            if (cVar == null || cVar.f7137a == null) {
                throw new a("No result cursor", (com.google.android.gms.dynamite.a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.f7137a;
            c.e.a.b.c.b.a((Object) null);
            if (a().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                a2 = kVar.b(c.e.a.b.c.b.a(applicationContext), str, i2, c.e.a.b.c.b.a(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                a2 = kVar.a(c.e.a.b.c.b.a(applicationContext), str, i2, c.e.a.b.c.b.a(cursor));
            }
            Context context2 = (Context) c.e.a.b.c.b.a(a2);
            if (context2 == null) {
                throw new a("Failed to get module context", (com.google.android.gms.dynamite.a) null);
            }
            return new DynamiteModule(context2);
        }
        throw new a("DynamiteLoaderV2 was not cached.", (com.google.android.gms.dynamite.a) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int c(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            if (r10 == 0) goto La
            java.lang.String r8 = "api_force_staging"
            goto Lc
        La:
            java.lang.String r8 = "api"
        Lc:
            int r10 = r8.length()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r2.append(r8)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r2.append(r9)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            if (r8 == 0) goto L83
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            if (r9 == 0) goto L83
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            if (r9 <= 0) goto L7d
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.dynamite.DynamiteModule.f7129e = r1     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L7a
            if (r1 < 0) goto L67
            int r1 = r8.getInt(r1)     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.dynamite.DynamiteModule.f7130f = r1     // Catch: java.lang.Throwable -> L7a
        L67:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7a
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = com.google.android.gms.dynamite.DynamiteModule.f7131g     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.c) r10     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            if (r10 == 0) goto L7d
            android.database.Cursor r1 = r10.f7137a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            if (r1 != 0) goto L7d
            r10.f7137a = r8     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            r8 = r0
            goto L7d
        L7a:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7a
            throw r9     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
        L7d:
            if (r8 == 0) goto L82
            r8.close()
        L82:
            return r9
        L83:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
            throw r9     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L96
        L92:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto Lae
        L96:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L9f
        L9b:
            r8 = move-exception
            goto Lae
        L9d:
            r8 = move-exception
            r9 = r0
        L9f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch: java.lang.Throwable -> Lac
            if (r10 == 0) goto La4
            throw r8     // Catch: java.lang.Throwable -> Lac
        La4:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch: java.lang.Throwable -> Lac
            throw r10     // Catch: java.lang.Throwable -> Lac
        Lac:
            r8 = move-exception
            r0 = r9
        Lae:
            if (r0 == 0) goto Lb3
            r0.close()
        Lb3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule c(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    public final IBinder a(String str) {
        try {
            return (IBinder) this.f7133a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            throw new a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e2, null);
        }
    }
}
