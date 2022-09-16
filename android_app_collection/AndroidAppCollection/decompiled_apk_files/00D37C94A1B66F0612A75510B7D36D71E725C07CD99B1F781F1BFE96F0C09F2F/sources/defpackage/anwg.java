package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.UserManager;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: anwg  reason: default package */
/* loaded from: classes.dex */
public final class anwg {
    public final anxv c;
    private final Context g;
    private final String h;
    private final anwk i;
    private final anye k;
    public static final Object a = new Object();
    private static final Executor f = new anwe();
    public static final Map b = new afw();
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean j = new AtomicBoolean();
    public final List e = new CopyOnWriteArrayList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0165 A[LOOP:1: B:35:0x015f->B:37:0x0165, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected anwg(final android.content.Context r10, java.lang.String r11, defpackage.anwk r12) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anwg.<init>(android.content.Context, java.lang.String, anwk):void");
    }

    public static anwg b() {
        anwg anwgVar;
        synchronized (a) {
            anwgVar = (anwg) b.get("[DEFAULT]");
            if (anwgVar == null) {
                String a2 = qyl.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 116);
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(a2);
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return anwgVar;
    }

    public static anwg c(Context context, anwk anwkVar) {
        return d(context, anwkVar, "[DEFAULT]");
    }

    public static anwg d(Context context, anwk anwkVar, String str) {
        anwg anwgVar;
        AtomicReference atomicReference = anwd.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (anwd.a.get() == null) {
                anwd anwdVar = new anwd();
                if (anwd.a.compareAndSet(null, anwdVar)) {
                    qts.b(application);
                    qts.a.a(anwdVar);
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            Map map = b;
            StringBuilder sb = new StringBuilder(String.valueOf(trim).length() + 33);
            sb.append("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            qnm.k(!map.containsKey(trim), sb.toString());
            qnm.n(context, "Application context cannot be null.");
            anwgVar = new anwg(context, trim, anwkVar);
            map.put(trim, anwgVar);
        }
        anwgVar.i();
        return anwgVar;
    }

    private final void l() {
        qnm.k(!this.j.get(), "FirebaseApp was deleted");
    }

    public final Context a() {
        l();
        return this.g;
    }

    public final anwk e() {
        l();
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anwg)) {
            return false;
        }
        return this.h.equals(((anwg) obj).g());
    }

    public final Object f(Class cls) {
        l();
        return this.c.a(cls);
    }

    public final String g() {
        l();
        return this.h;
    }

    public final String h() {
        String e = tqn.e(g().getBytes(Charset.defaultCharset()));
        String e2 = tqn.e(e().b.getBytes(Charset.defaultCharset()));
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 1 + String.valueOf(e2).length());
        sb.append(e);
        sb.append("+");
        sb.append(e2);
        return sb.toString();
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final void i() {
        HashMap hashMap;
        Context context = this.g;
        if (Build.VERSION.SDK_INT < 24 || ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
            String valueOf = String.valueOf(g());
            if (valueOf.length() != 0) {
                "Device unlocked: initializing all Firebase APIs for app ".concat(valueOf);
            }
            anxv anxvVar = this.c;
            boolean k = k();
            if (!anxvVar.b.compareAndSet(null, Boolean.valueOf(k))) {
                return;
            }
            synchronized (anxvVar) {
                hashMap = new HashMap(anxvVar.a);
            }
            anxvVar.d(hashMap, k);
            return;
        }
        String valueOf2 = String.valueOf(g());
        if (valueOf2.length() != 0) {
            "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ".concat(valueOf2);
        }
        Context context2 = this.g;
        if (anwf.a.get() != null) {
            return;
        }
        anwf anwfVar = new anwf(context2);
        if (!anwf.a.compareAndSet(null, anwfVar)) {
            return;
        }
        context2.registerReceiver(anwfVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
    }

    public final boolean j() {
        l();
        return ((aobf) this.k.a()).a();
    }

    public final boolean k() {
        return "[DEFAULT]".equals(g());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("name", this.h, arrayList);
        tjk.g("options", this.i, arrayList);
        return tjk.f(arrayList, this);
    }
}
