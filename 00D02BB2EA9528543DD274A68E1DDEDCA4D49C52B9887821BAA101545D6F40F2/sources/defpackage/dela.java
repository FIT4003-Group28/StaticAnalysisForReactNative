package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserManager;
import android.text.TextUtils;
import com.google.android.filament.R;
import com.google.firebase.components.ComponentDiscoveryService;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dela  reason: default package */
/* loaded from: classes6.dex */
public final class dela {
    public final depf c;
    private final Context g;
    private final String h;
    private final dele i;
    private final depn<deub> k;
    public static final Object a = new Object();
    private static final Executor f = new deky();
    static final Map<String, dela> b = new aif();
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean j = new AtomicBoolean();
    public final List<dekw> e = new CopyOnWriteArrayList();

    protected dela(final Context context, String str, dele deleVar) {
        new CopyOnWriteArrayList();
        cnwc.a(context);
        this.g = context;
        cnwc.l(str);
        this.h = str;
        cnwc.a(deleVar);
        this.i = deleVar;
        this.c = new depf(f, deoz.forContext(context, ComponentDiscoveryService.class).a(), deow.of(context, Context.class, new Class[0]), deow.of(this, dela.class, new Class[0]), deow.of(deleVar, dele.class, new Class[0]), devq.create("fire-android", ""), devq.create("fire-core", "19.3.2_1p"), null, devn.component(), derd.component());
        this.k = new depn<>(new desq(this, context) { // from class: dekv
            private final dela a;
            private final Context b;

            {
                this.a = this;
                this.b = context;
            }

            @Override // defpackage.desq
            public final Object a() {
                dela delaVar = this.a;
                Context context2 = this.b;
                String g = delaVar.g();
                deqz deqzVar = (deqz) delaVar.c.a(deqz.class);
                return new deub(context2, g);
            }
        });
    }

    public static void clearInstancesForTest() {
        synchronized (a) {
            b.clear();
        }
    }

    public static List<dela> getApps(Context context) {
        ArrayList arrayList;
        synchronized (a) {
            arrayList = new ArrayList(b.values());
        }
        return arrayList;
    }

    public static dela getInstance() {
        dela delaVar;
        BufferedReader bufferedReader;
        synchronized (a) {
            delaVar = b.get("[DEFAULT]");
            if (delaVar == null) {
                if (cnxt.a == null) {
                    if (cnxt.b == 0) {
                        cnxt.b = Process.myPid();
                    }
                    int i = cnxt.b;
                    String str = null;
                    str = null;
                    str = null;
                    BufferedReader bufferedReader2 = null;
                    if (i > 0) {
                        try {
                            StringBuilder sb = new StringBuilder(25);
                            sb.append("/proc/");
                            sb.append(i);
                            sb.append("/cmdline");
                            String sb2 = sb.toString();
                            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bufferedReader = new BufferedReader(new FileReader(sb2));
                                try {
                                    String readLine = bufferedReader.readLine();
                                    cnwc.a(readLine);
                                    str = readLine.trim();
                                } catch (IOException unused) {
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    cnxr.a(bufferedReader2);
                                    throw th;
                                }
                            } finally {
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            }
                        } catch (IOException unused2) {
                            bufferedReader = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        cnxr.a(bufferedReader);
                    }
                    cnxt.a = str;
                }
                String str2 = cnxt.a;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + R.styleable.AppCompatTheme_viewInflaterClass);
                sb3.append("Default FirebaseApp is not initialized in this process ");
                sb3.append(str2);
                sb3.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb3.toString());
            }
        }
        return delaVar;
    }

    public static String getPersistenceKey(String str, dele deleVar) {
        String a2 = cnxj.a(str.getBytes(Charset.defaultCharset()));
        String a3 = cnxj.a(deleVar.b.getBytes(Charset.defaultCharset()));
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 1 + String.valueOf(a3).length());
        sb.append(a2);
        sb.append("+");
        sb.append(a3);
        return sb.toString();
    }

    private final void i() {
        cnwc.c(!this.j.get(), "FirebaseApp was deleted");
    }

    public static dela initializeApp(Context context) {
        synchronized (a) {
            if (b.containsKey("[DEFAULT]")) {
                return getInstance();
            }
            dele fromResource = dele.fromResource(context);
            if (fromResource == null) {
                return null;
            }
            return initializeApp(context, fromResource);
        }
    }

    public final Context a() {
        i();
        return this.g;
    }

    public final String b() {
        i();
        return this.h;
    }

    public final dele c() {
        i();
        return this.i;
    }

    public final <T> T d(Class<T> cls) {
        i();
        return (T) this.c.a(cls);
    }

    public final boolean e() {
        i();
        return this.k.a().a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dela)) {
            return false;
        }
        return this.h.equals(((dela) obj).b());
    }

    public final boolean f() {
        return "[DEFAULT]".equals(b());
    }

    public final String g() {
        String a2 = cnxj.a(b().getBytes(Charset.defaultCharset()));
        String a3 = cnxj.a(c().b.getBytes(Charset.defaultCharset()));
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 1 + String.valueOf(a3).length());
        sb.append(a2);
        sb.append("+");
        sb.append(a3);
        return sb.toString();
    }

    public final void h() {
        Context context = this.g;
        if (Build.VERSION.SDK_INT < 24 || ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
            if (String.valueOf(b()).length() == 0) {
                new String("Device unlocked: initializing all Firebase APIs for app ");
            }
            this.c.c(f());
            return;
        }
        if (String.valueOf(b()).length() == 0) {
            new String("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        }
        Context context2 = this.g;
        if (dekz.a.get() != null) {
            return;
        }
        dekz dekzVar = new dekz(context2);
        if (!dekz.a.compareAndSet(null, dekzVar)) {
            return;
        }
        context2.registerReceiver(dekzVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        cnvu b2 = cnvv.b(this);
        b2.a("name", this.h);
        b2.a("options", this.i);
        return b2.toString();
    }

    public static dela initializeApp(Context context, dele deleVar) {
        return initializeApp(context, deleVar, "[DEFAULT]");
    }

    public static dela initializeApp(Context context, dele deleVar, String str) {
        dela delaVar;
        AtomicReference<dekx> atomicReference = dekx.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (dekx.a.get() == null) {
                dekx dekxVar = new dekx();
                if (dekx.a.compareAndSet(null, dekxVar)) {
                    cnpf.a(application);
                    cnpf.a.b(dekxVar);
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            Map<String, dela> map = b;
            StringBuilder sb = new StringBuilder(String.valueOf(trim).length() + 33);
            sb.append("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            cnwc.c(!map.containsKey(trim), sb.toString());
            cnwc.n(context, "Application context cannot be null.");
            delaVar = new dela(context, trim, deleVar);
            map.put(trim, delaVar);
        }
        delaVar.h();
        return delaVar;
    }

    public static dela getInstance(String str) {
        String str2;
        Object obj = a;
        synchronized (obj) {
            Map<String, dela> map = b;
            dela delaVar = map.get(str.trim());
            if (delaVar != null) {
                return delaVar;
            }
            ArrayList arrayList = new ArrayList();
            synchronized (obj) {
                for (dela delaVar2 : map.values()) {
                    arrayList.add(delaVar2.b());
                }
                Collections.sort(arrayList);
                if (!arrayList.isEmpty()) {
                    String valueOf = String.valueOf(TextUtils.join(", ", arrayList));
                    str2 = valueOf.length() != 0 ? "Available app names: ".concat(valueOf) : new String("Available app names: ");
                } else {
                    str2 = "";
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
    }
}
