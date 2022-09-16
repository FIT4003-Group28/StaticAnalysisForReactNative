package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: ras  reason: default package */
/* loaded from: classes4.dex */
public final class ras {
    private static Boolean e = null;
    private static String f = null;
    private static boolean g = false;
    private static int h = -1;
    private static rat l;
    private static rau m;
    public final Context d;
    private static final ThreadLocal i = new ThreadLocal();
    private static final ThreadLocal j = new raj();
    private static final rap k = new rak();
    public static final rar a = new ral(1);
    public static final rar b = new ral();
    public static final rar c = new ral(2);

    private ras(Context context) {
        qnm.b(context);
        this.d = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!tnk.j(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
                sb2.append("Module descriptor id '");
                sb2.append(valueOf);
                sb2.append("' didn't match expected id '");
                sb2.append(str);
                sb2.append("'");
                Log.e("DynamiteModule", sb2.toString());
                return 0;
            }
            return declaredField2.getInt(null);
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

    public static int b(Context context, String str) {
        return c(context, str, false);
    }

    public static int c(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        int readInt;
        rad rabVar;
        Cursor cursor;
        try {
            synchronized (ras.class) {
                Boolean bool = e;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        String valueOf = String.valueOf(e3);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(valueOf);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    h(classLoader);
                                } catch (rao unused) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else if (g || Boolean.TRUE.equals(null)) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                int f2 = f(context, str, z);
                                String str2 = f;
                                if (str2 != null && !str2.isEmpty()) {
                                    ClassLoader a2 = rah.a();
                                    if (a2 == null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            String str3 = f;
                                            qnm.b(str3);
                                            a2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                        } else {
                                            String str4 = f;
                                            qnm.b(str4);
                                            a2 = new rai(str4, ClassLoader.getSystemClassLoader());
                                        }
                                    }
                                    h(a2);
                                    declaredField.set(null, a2);
                                    e = Boolean.TRUE;
                                    return f2;
                                }
                                return f2;
                            } catch (rao unused2) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            }
                        }
                        e = bool;
                    }
                }
                if (!bool.booleanValue()) {
                    rat j2 = j(context);
                    try {
                        if (j2 == null) {
                            return 0;
                        }
                        try {
                            int a3 = j2.a();
                            if (a3 >= 3) {
                                ram ramVar = (ram) i.get();
                                if (ramVar == null || (cursor = ramVar.a) == null) {
                                    rad a4 = rac.a(context);
                                    long longValue = ((Long) j.get()).longValue();
                                    Parcel pv = j2.pv();
                                    dve.i(pv, a4);
                                    pv.writeString(str);
                                    dve.e(pv, z);
                                    pv.writeLong(longValue);
                                    Parcel pw = j2.pw(7, pv);
                                    IBinder readStrongBinder = pw.readStrongBinder();
                                    if (readStrongBinder == null) {
                                        rabVar = null;
                                    } else {
                                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        if (queryLocalInterface instanceof rad) {
                                            rabVar = (rad) queryLocalInterface;
                                        } else {
                                            rabVar = new rab(readStrongBinder);
                                        }
                                    }
                                    pw.recycle();
                                    Cursor cursor3 = (Cursor) rac.b(rabVar);
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                readInt = cursor3.getInt(0);
                                                if (readInt <= 0 || !i(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                            }
                                        } catch (RemoteException e4) {
                                            e2 = e4;
                                            cursor2 = cursor3;
                                            String valueOf2 = String.valueOf(e2.getMessage());
                                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                                            if (cursor2 == null) {
                                                return 0;
                                            }
                                            cursor2.close();
                                            return 0;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 == null) {
                                        return 0;
                                    }
                                    cursor3.close();
                                    return 0;
                                }
                                return cursor.getInt(0);
                            } else if (a3 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                rad a5 = rac.a(context);
                                Parcel pv2 = j2.pv();
                                dve.i(pv2, a5);
                                pv2.writeString(str);
                                dve.e(pv2, z);
                                Parcel pw2 = j2.pw(5, pv2);
                                readInt = pw2.readInt();
                                pw2.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                rad a6 = rac.a(context);
                                Parcel pv3 = j2.pv();
                                dve.i(pv3, a6);
                                pv3.writeString(str);
                                dve.e(pv3, z);
                                Parcel pw3 = j2.pw(3, pv3);
                                readInt = pw3.readInt();
                                pw3.recycle();
                            }
                            return readInt;
                        } catch (RemoteException e5) {
                            e2 = e5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    try {
                        return f(context, str, z);
                    } catch (rao e6) {
                        String valueOf3 = String.valueOf(e6.getMessage());
                        Log.w("DynamiteModule", valueOf3.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf3) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
            }
        } catch (Throwable th4) {
            trz.f(context);
            throw th4;
        }
    }

    public static ras e(Context context, rar rarVar, String str) {
        Boolean bool;
        ras rasVar;
        rau rauVar;
        Boolean valueOf;
        ThreadLocal threadLocal = i;
        ram ramVar = (ram) threadLocal.get();
        ram ramVar2 = new ram();
        threadLocal.set(ramVar2);
        ThreadLocal threadLocal2 = j;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            raq a2 = rarVar.a(context, str, k);
            String.valueOf(str).length();
            String.valueOf(str).length();
            int i2 = a2.c;
            if (i2 == 0 || ((i2 == -1 && a2.a == 0) || (i2 == 1 && a2.b == 0))) {
                int i3 = a2.a;
                int i4 = a2.b;
                StringBuilder sb = new StringBuilder(91);
                sb.append("No acceptable module found. Local version is ");
                sb.append(i3);
                sb.append(" and remote version is ");
                sb.append(i4);
                sb.append(".");
                throw new rao(sb.toString());
            } else if (i2 == -1) {
                ras g2 = g(context, str);
                if (longValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(longValue));
                }
                Cursor cursor = ramVar2.a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(ramVar);
                return g2;
            } else if (i2 != 1) {
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("VersionPolicy returned invalid code:");
                sb2.append(0);
                throw new rao(sb2.toString());
            } else {
                try {
                    int i5 = a2.b;
                    try {
                        synchronized (ras.class) {
                            bool = e;
                        }
                        if (bool == null) {
                            throw new rao("Failed to determine which loading route to use.");
                        }
                        rad radVar = null;
                        if (bool.booleanValue()) {
                            String.valueOf(str).length();
                            synchronized (ras.class) {
                                rauVar = m;
                            }
                            if (rauVar == null) {
                                throw new rao("DynamiteLoaderV2 was not cached.");
                            }
                            ram ramVar3 = (ram) threadLocal.get();
                            if (ramVar3 == null || ramVar3.a == null) {
                                throw new rao("No result cursor");
                            }
                            Context applicationContext = context.getApplicationContext();
                            Cursor cursor2 = ramVar3.a;
                            rac.a(null);
                            synchronized (ras.class) {
                                valueOf = Boolean.valueOf(h >= 2);
                            }
                            if (valueOf.booleanValue()) {
                                rad a3 = rac.a(applicationContext);
                                rad a4 = rac.a(cursor2);
                                Parcel pv = rauVar.pv();
                                dve.i(pv, a3);
                                pv.writeString(str);
                                pv.writeInt(i5);
                                dve.i(pv, a4);
                                Parcel pw = rauVar.pw(3, pv);
                                IBinder readStrongBinder = pw.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    radVar = queryLocalInterface instanceof rad ? (rad) queryLocalInterface : new rab(readStrongBinder);
                                }
                                pw.recycle();
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                rad a5 = rac.a(applicationContext);
                                rad a6 = rac.a(cursor2);
                                Parcel pv2 = rauVar.pv();
                                dve.i(pv2, a5);
                                pv2.writeString(str);
                                pv2.writeInt(i5);
                                dve.i(pv2, a6);
                                Parcel pw2 = rauVar.pw(2, pv2);
                                IBinder readStrongBinder2 = pw2.readStrongBinder();
                                if (readStrongBinder2 != null) {
                                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    radVar = queryLocalInterface2 instanceof rad ? (rad) queryLocalInterface2 : new rab(readStrongBinder2);
                                }
                                pw2.recycle();
                            }
                            Context context2 = (Context) rac.b(radVar);
                            if (context2 == null) {
                                throw new rao("Failed to get module context");
                            }
                            rasVar = new ras(context2);
                        } else {
                            String.valueOf(str).length();
                            rat j2 = j(context);
                            if (j2 == null) {
                                throw new rao("Failed to create IDynamiteLoader.");
                            }
                            int a7 = j2.a();
                            if (a7 >= 3) {
                                ram ramVar4 = (ram) threadLocal.get();
                                if (ramVar4 == null) {
                                    throw new rao("No cached result cursor holder");
                                }
                                rad a8 = rac.a(context);
                                rad a9 = rac.a(ramVar4.a);
                                Parcel pv3 = j2.pv();
                                dve.i(pv3, a8);
                                pv3.writeString(str);
                                pv3.writeInt(i5);
                                dve.i(pv3, a9);
                                Parcel pw3 = j2.pw(8, pv3);
                                IBinder readStrongBinder3 = pw3.readStrongBinder();
                                if (readStrongBinder3 != null) {
                                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    radVar = queryLocalInterface3 instanceof rad ? (rad) queryLocalInterface3 : new rab(readStrongBinder3);
                                }
                                pw3.recycle();
                            } else if (a7 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                rad a10 = rac.a(context);
                                Parcel pv4 = j2.pv();
                                dve.i(pv4, a10);
                                pv4.writeString(str);
                                pv4.writeInt(i5);
                                Parcel pw4 = j2.pw(4, pv4);
                                IBinder readStrongBinder4 = pw4.readStrongBinder();
                                if (readStrongBinder4 != null) {
                                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    radVar = queryLocalInterface4 instanceof rad ? (rad) queryLocalInterface4 : new rab(readStrongBinder4);
                                }
                                pw4.recycle();
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                rad a11 = rac.a(context);
                                Parcel pv5 = j2.pv();
                                dve.i(pv5, a11);
                                pv5.writeString(str);
                                pv5.writeInt(i5);
                                Parcel pw5 = j2.pw(2, pv5);
                                IBinder readStrongBinder5 = pw5.readStrongBinder();
                                if (readStrongBinder5 != null) {
                                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    radVar = queryLocalInterface5 instanceof rad ? (rad) queryLocalInterface5 : new rab(readStrongBinder5);
                                }
                                pw5.recycle();
                            }
                            if (rac.b(radVar) == null) {
                                throw new rao("Failed to load remote module.");
                            }
                            rasVar = new ras((Context) rac.b(radVar));
                        }
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor3 = ramVar2.a;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        threadLocal.set(ramVar);
                        return rasVar;
                    } catch (RemoteException e2) {
                        throw new rao("Failed to load remote module.", e2);
                    } catch (rao e3) {
                        throw e3;
                    } catch (Throwable th) {
                        trz.f(context);
                        throw new rao("Failed to load remote module.", th);
                    }
                } catch (rao e4) {
                    String valueOf2 = String.valueOf(e4.getMessage());
                    Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                    int i6 = a2.a;
                    if (i6 == 0 || rarVar.a(context, str, new ran(i6)).c != -1) {
                        throw new rao("Remote load failed. No local fallback found.", e4);
                    }
                    ras g3 = g(context, str);
                    if (longValue == 0) {
                        j.remove();
                    } else {
                        j.set(Long.valueOf(longValue));
                    }
                    Cursor cursor4 = ramVar2.a;
                    if (cursor4 != null) {
                        cursor4.close();
                    }
                    i.set(ramVar);
                    return g3;
                }
            }
        } catch (Throwable th2) {
            if (longValue == 0) {
                j.remove();
            } else {
                j.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = ramVar2.a;
            if (cursor5 != null) {
                cursor5.close();
            }
            i.set(ramVar);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
        if (i(r10) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = defpackage.ras.j     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            r12.<init>()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            if (r10 == 0) goto La2
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            if (r11 == 0) goto La2
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            if (r12 <= 0) goto L8d
            java.lang.Class<ras> r1 = defpackage.ras.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8a
            defpackage.ras.f = r2     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8a
            defpackage.ras.h = r2     // Catch: java.lang.Throwable -> L8a
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = 0
        L7f:
            defpackage.ras.g = r9     // Catch: java.lang.Throwable -> L8a
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            boolean r1 = i(r10)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            if (r1 == 0) goto L8d
            goto L8e
        L8a:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r11     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
        L8d:
            r0 = r10
        L8e:
            if (r11 != 0) goto L96
            if (r0 == 0) goto L95
            r0.close()
        L95:
            return r12
        L96:
            rao r10 = new rao     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            throw r10     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
        L9e:
            r10 = move-exception
            goto Lc6
        La0:
            r10 = move-exception
            goto Lb8
        La2:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            rao r11 = new rao     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            throw r11     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
        Lb1:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto Lc6
        Lb5:
            r11 = move-exception
            r0 = r10
            r10 = r11
        Lb8:
            boolean r11 = r10 instanceof defpackage.rao     // Catch: java.lang.Throwable -> L9e
            if (r11 == 0) goto Lbe
            throw r10     // Catch: java.lang.Throwable -> L9e
        Lbe:
            rao r11 = new rao     // Catch: java.lang.Throwable -> L9e
            java.lang.String r12 = "V2 version check failed"
            r11.<init>(r12, r10)     // Catch: java.lang.Throwable -> L9e
            throw r11     // Catch: java.lang.Throwable -> L9e
        Lc6:
            if (r0 == 0) goto Lcb
            r0.close()
        Lcb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ras.f(android.content.Context, java.lang.String, boolean):int");
    }

    private static ras g(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        }
        return new ras(context.getApplicationContext());
    }

    private static void h(ClassLoader classLoader) {
        rau rauVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                rauVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof rau) {
                    rauVar = (rau) queryLocalInterface;
                } else {
                    rauVar = new rau(iBinder);
                }
            }
            m = rauVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new rao("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean i(Cursor cursor) {
        ram ramVar = (ram) i.get();
        if (ramVar == null || ramVar.a != null) {
            return false;
        }
        ramVar.a = cursor;
        return true;
    }

    private static rat j(Context context) {
        rat ratVar;
        synchronized (ras.class) {
            rat ratVar2 = l;
            if (ratVar2 != null) {
                return ratVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    ratVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof rat) {
                        ratVar = (rat) queryLocalInterface;
                    } else {
                        ratVar = new rat(iBinder);
                    }
                }
                if (ratVar != null) {
                    l = ratVar;
                    return ratVar;
                }
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    public final IBinder d(String str) {
        try {
            return (IBinder) this.d.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new rao(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e2);
        }
    }
}
