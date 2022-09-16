package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: cobp  reason: default package */
/* loaded from: classes.dex */
public final class cobp {
    private static Boolean f = null;
    private static String g = null;
    private static int h = -1;
    private static cobq l;
    private static cobr m;
    public final Context e;
    private static final ThreadLocal<cobj> i = new ThreadLocal<>();
    private static final ThreadLocal<Long> j = new cobd();
    private static final cobm k = new cobe();
    public static final cobo a = new cobf();
    public static final cobo b = new cobg();
    public static final cobo c = new cobh();
    public static final cobo d = new cobi();

    private cobp(Context context) {
        cnwc.a(context);
        this.e = context;
    }

    public static cobp a(Context context, cobo coboVar, String str) {
        Boolean bool;
        coba g2;
        cobp cobpVar;
        cobr cobrVar;
        Boolean valueOf;
        ThreadLocal<cobj> threadLocal = i;
        cobj cobjVar = threadLocal.get();
        cobj cobjVar2 = new cobj();
        threadLocal.set(cobjVar2);
        ThreadLocal<Long> threadLocal2 = j;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            cobn a2 = coboVar.a(context, str, k);
            int i2 = a2.a;
            int i3 = a2.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            sb.toString();
            int i4 = a2.c;
            if (i4 == 0 || ((i4 == -1 && a2.a == 0) || (i4 == 1 && a2.b == 0))) {
                int i5 = a2.a;
                int i6 = a2.b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i5);
                sb2.append(" and remote version is ");
                sb2.append(i6);
                sb2.append(".");
                throw new cobl(sb2.toString());
            } else if (i4 == -1) {
                cobp h2 = h(context, str);
                if (longValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(longValue));
                }
                Cursor cursor = cobjVar2.a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(cobjVar);
                return h2;
            } else if (i4 != 1) {
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(0);
                throw new cobl(sb3.toString());
            } else {
                try {
                    int i7 = a2.b;
                    try {
                        synchronized (cobp.class) {
                            bool = f;
                        }
                        if (bool == null) {
                            throw new cobl("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 51);
                            sb4.append("Selected remote version of ");
                            sb4.append(str);
                            sb4.append(", version >= ");
                            sb4.append(i7);
                            sb4.toString();
                            synchronized (cobp.class) {
                                cobrVar = m;
                            }
                            if (cobrVar == null) {
                                throw new cobl("DynamiteLoaderV2 was not cached.");
                            }
                            cobj cobjVar3 = threadLocal.get();
                            if (cobjVar3 == null || cobjVar3.a == null) {
                                throw new cobl("No result cursor");
                            }
                            Context applicationContext = context.getApplicationContext();
                            Cursor cursor2 = cobjVar3.a;
                            cobb.b(null);
                            synchronized (cobp.class) {
                                valueOf = Boolean.valueOf(h >= 2);
                            }
                            Context context2 = (Context) cobb.c(valueOf.booleanValue() ? cobrVar.f(cobb.b(applicationContext), str, i7, cobb.b(cursor2)) : cobrVar.e(cobb.b(applicationContext), str, i7, cobb.b(cursor2)));
                            if (context2 == null) {
                                throw new cobl("Failed to get module context");
                            }
                            cobpVar = new cobp(context2);
                        } else {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 51);
                            sb5.append("Selected remote version of ");
                            sb5.append(str);
                            sb5.append(", version >= ");
                            sb5.append(i7);
                            sb5.toString();
                            cobq j2 = j(context);
                            if (j2 == null) {
                                throw new cobl("Failed to create IDynamiteLoader.");
                            }
                            int i8 = j2.i();
                            if (i8 >= 3) {
                                cobj cobjVar4 = threadLocal.get();
                                if (cobjVar4 == null) {
                                    throw new cobl("No cached result cursor holder");
                                }
                                g2 = j2.k(cobb.b(context), str, i7, cobb.b(cobjVar4.a));
                            } else {
                                g2 = i8 == 2 ? j2.g(cobb.b(context), str, i7) : j2.e(cobb.b(context), str, i7);
                            }
                            if (cobb.c(g2) == null) {
                                throw new cobl("Failed to load remote module.");
                            }
                            cobpVar = new cobp((Context) cobb.c(g2));
                        }
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor3 = cobjVar2.a;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        threadLocal.set(cobjVar);
                        return cobpVar;
                    } catch (RemoteException e) {
                        throw new cobl("Failed to load remote module.", e);
                    } catch (cobl e2) {
                        throw e2;
                    } catch (Throwable th) {
                        cnxm.a(context);
                        throw new cobl("Failed to load remote module.", th);
                    }
                } catch (cobl e3) {
                    if (String.valueOf(e3.getMessage()).length() == 0) {
                        new String("Failed to load remote module: ");
                    }
                    int i9 = a2.a;
                    if (i9 == 0 || coboVar.a(context, str, new cobk(i9)).c != -1) {
                        throw new cobl("Remote load failed. No local fallback found.", e3);
                    }
                    cobp h3 = h(context, str);
                    if (longValue == 0) {
                        j.remove();
                    } else {
                        j.set(Long.valueOf(longValue));
                    }
                    Cursor cursor4 = cobjVar2.a;
                    if (cursor4 != null) {
                        cursor4.close();
                    }
                    i.set(cobjVar);
                    return h3;
                }
            }
        } catch (Throwable th2) {
            if (longValue == 0) {
                j.remove();
            } else {
                j.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = cobjVar2.a;
            if (cursor5 != null) {
                cursor5.close();
            }
            i.set(cobjVar);
            throw th2;
        }
    }

    public static int b(Context context, String str) {
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
            if (!cnvv.a(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
                sb2.append("Module descriptor id '");
                sb2.append(valueOf);
                sb2.append("' didn't match expected id '");
                sb2.append(str);
                sb2.append("'");
                sb2.toString();
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            sb3.toString();
            return 0;
        } catch (Exception e) {
            if (String.valueOf(e.getMessage()).length() == 0) {
                new String("Failed to load module descriptor class: ");
            }
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
        if (g(r10) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cobp.c(android.content.Context, java.lang.String, boolean):int");
    }

    public static int d(Context context, String str) {
        return c(context, str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (g(r9) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int f(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = defpackage.cobp.j     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            java.lang.String r9 = "api_force_staging"
            java.lang.String r4 = "api"
            r5 = 1
            if (r5 == r11) goto L19
            r9 = r4
        L19:
            android.net.Uri$Builder r11 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            r11.<init>()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            java.lang.String r4 = "content"
            android.net.Uri$Builder r11 = r11.scheme(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r11 = r11.authority(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            android.net.Uri$Builder r9 = r11.path(r9)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            android.net.Uri$Builder r9 = r9.appendPath(r10)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            java.lang.String r10 = "requestStartTime"
            java.lang.String r11 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r10, r11)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            android.net.Uri r4 = r9.build()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            if (r9 == 0) goto L81
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            if (r10 == 0) goto L81
            r10 = 0
            int r10 = r9.getInt(r10)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            if (r10 <= 0) goto L7a
            java.lang.Class<cobp> r11 = defpackage.cobp.class
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r1 = 2
            java.lang.String r1 = r9.getString(r1)     // Catch: java.lang.Throwable -> L77
            defpackage.cobp.g = r1     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = "loaderVersion"
            int r1 = r9.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L77
            if (r1 < 0) goto L6f
            int r1 = r9.getInt(r1)     // Catch: java.lang.Throwable -> L77
            defpackage.cobp.h = r1     // Catch: java.lang.Throwable -> L77
        L6f:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L77
            boolean r11 = g(r9)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            if (r11 == 0) goto L7a
            goto L7b
        L77:
            r10 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L77
            throw r10     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
        L7a:
            r0 = r9
        L7b:
            if (r0 == 0) goto L80
            r0.close()
        L80:
            return r10
        L81:
            cobl r10 = new cobl     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.lang.String r11 = "Failed to connect to dynamite module ContentResolver."
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            throw r10     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
        L89:
            r10 = move-exception
            r0 = r9
            goto La2
        L8c:
            r10 = move-exception
            r0 = r9
            goto L94
        L8f:
            r9 = move-exception
            r10 = r9
            goto La2
        L92:
            r9 = move-exception
            r10 = r9
        L94:
            boolean r9 = r10 instanceof defpackage.cobl     // Catch: java.lang.Throwable -> L8f
            if (r9 == 0) goto L9a
            throw r10     // Catch: java.lang.Throwable -> L8f
        L9a:
            cobl r9 = new cobl     // Catch: java.lang.Throwable -> L8f
            java.lang.String r11 = "V2 version check failed"
            r9.<init>(r11, r10)     // Catch: java.lang.Throwable -> L8f
            throw r9     // Catch: java.lang.Throwable -> L8f
        La2:
            if (r0 == 0) goto La7
            r0.close()
        La7:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cobp.f(android.content.Context, java.lang.String, boolean):int");
    }

    private static boolean g(Cursor cursor) {
        cobj cobjVar = i.get();
        if (cobjVar == null || cobjVar.a != null) {
            return false;
        }
        cobjVar.a = cursor;
        return true;
    }

    private static cobp h(Context context, String str) {
        if (String.valueOf(str).length() == 0) {
            new String("Selected local version of ");
        }
        return new cobp(context.getApplicationContext());
    }

    private static void i(ClassLoader classLoader) {
        cobr cobrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                cobrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof cobr) {
                    cobrVar = (cobr) queryLocalInterface;
                } else {
                    cobrVar = new cobr(iBinder);
                }
            }
            m = cobrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new cobl("Failed to instantiate dynamite loader", e);
        }
    }

    private static cobq j(Context context) {
        cobq cobqVar;
        synchronized (cobp.class) {
            cobq cobqVar2 = l;
            if (cobqVar2 != null) {
                return cobqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    cobqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof cobq) {
                        cobqVar = (cobq) queryLocalInterface;
                    } else {
                        cobqVar = new cobq(iBinder);
                    }
                }
                if (cobqVar != null) {
                    l = cobqVar;
                    return cobqVar;
                }
            } catch (Exception e) {
                if (String.valueOf(e.getMessage()).length() == 0) {
                    new String("Failed to load IDynamiteLoader from GmsCore: ");
                }
            }
            return null;
        }
    }

    public final IBinder e(String str) {
        try {
            return (IBinder) this.e.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new cobl(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e);
        }
    }
}
