package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.common.Feature;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: qkp  reason: default package */
/* loaded from: classes4.dex */
public final class qkp {
    public static final qpu a = new qpu("CastContext");
    public static final Object b = new Object();
    public static qkp c;
    public final Context d;
    public final qkz e;
    public final qls f;
    public final qkv g;
    public final CastOptions h;
    private final List i;
    private final qmg j;
    private qlu k;

    public qkp(Context context, CastOptions castOptions, List list, qmg qmgVar) {
        this.d = context.getApplicationContext();
        this.h = castOptions;
        this.j = qmgVar;
        this.i = list;
        g();
        HashMap hashMap = new HashMap();
        qlu qluVar = this.k;
        if (qluVar != null) {
            hashMap.put(qluVar.b, qluVar.d);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qlu qluVar2 = (qlu) it.next();
                qnm.n(qluVar2, "Additional SessionProvider must not be null.");
                String str = qluVar2.b;
                qnm.m(str, "Category for SessionProvider must not be null or empty string.");
                qnm.d(!hashMap.containsKey(str), String.format("SessionProvider for category %s already added", str));
                hashMap.put(str, qluVar2.d);
            }
        }
        try {
            Context context2 = this.d;
            qkz a2 = qmd.c(context2).a(rac.a(context2.getApplicationContext()), castOptions, qmgVar, hashMap);
            this.e = a2;
            try {
                this.g = new qkv(a2.a());
                try {
                    qls qlsVar = new qls(a2.f(), this.d);
                    this.f = qlsVar;
                    e(this.d);
                    new qpu("PrecacheManager");
                    qmu qmuVar = qmgVar.b;
                    if (qmuVar != null) {
                        qmuVar.d = qlsVar;
                    }
                    qpa e = e(this.d);
                    qvx b2 = qvy.b();
                    b2.a = new qov(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}, 1);
                    b2.b = new Feature[]{qjm.d};
                    b2.b();
                    b2.c = 8425;
                    e.s(b2.a()).r(new ruz() { // from class: qkm
                        @Override // defpackage.ruz
                        public final void d(Object obj) {
                            final qkp qkpVar = qkp.this;
                            Bundle bundle = (Bundle) obj;
                            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
                            boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
                            if (!z) {
                                if (!z2) {
                                    return;
                                }
                                z2 = true;
                            }
                            String packageName = qkpVar.d.getPackageName();
                            String format = String.format(Locale.ROOT, "%s.%s", qkpVar.d.getPackageName(), "client_cast_analytics_data");
                            osq.b(qkpVar.d);
                            oso a3 = osq.a().c().a("CAST_SENDER_SDK", aocc.b);
                            long j = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE");
                            final SharedPreferences sharedPreferences = qkpVar.d.getApplicationContext().getSharedPreferences(format, 0);
                            final qlv qlvVar = new qlv(sharedPreferences, a3, j);
                            if (z) {
                                qpa e2 = qkp.e(qkpVar.d);
                                qvx b3 = qvy.b();
                                b3.a = new qov(new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 2);
                                b3.b = new Feature[]{qjm.g};
                                b3.b();
                                b3.c = 8426;
                                e2.s(b3.a()).r(new ruz() { // from class: qkn
                                    @Override // defpackage.ruz
                                    public final void d(Object obj2) {
                                        qkp qkpVar2 = qkp.this;
                                        qkpVar2.f.c(new qlx(new qly(sharedPreferences, qlvVar, (Bundle) obj2, qkpVar2.d.getPackageName())), qku.class);
                                    }
                                });
                            }
                            if (z2) {
                                qnm.b(sharedPreferences);
                                qmc.e(sharedPreferences, qlvVar, packageName);
                                qmc.d(anfx.CAST_CONTEXT);
                            }
                        }
                    });
                    qpa e2 = e(this.d);
                    qvx b3 = qvy.b();
                    b3.a = new qov(new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                    b3.b = new Feature[]{qjm.h};
                    b3.b();
                    b3.c = 8427;
                    e2.s(b3.a()).r(new ruz() { // from class: qkl
                        @Override // defpackage.ruz
                        public final void d(Object obj) {
                            tnk.l((Bundle) obj, "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES");
                        }
                    });
                } catch (RemoteException e3) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e3);
                }
            } catch (RemoteException e4) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e4);
            }
        } catch (RemoteException e5) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e5);
        }
    }

    public static qkp a() {
        qnm.g("Must be called from the main thread.");
        return c;
    }

    public static qkp b(Context context) {
        qnm.g("Must be called from the main thread.");
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    qlo h = h(context.getApplicationContext());
                    CastOptions castOptions = h.getCastOptions(context.getApplicationContext());
                    try {
                        c = new qkp(context, castOptions, h.getAdditionalSessionProviders(context.getApplicationContext()), new qmg(bhd.b(context), castOptions));
                    } catch (qln e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return c;
    }

    public static qpa e(Context context) {
        return new qpa(context);
    }

    public static rve f(final Context context, Executor executor) {
        qnm.g("Must be called from the main thread.");
        qkp qkpVar = c;
        if (qkpVar == null) {
            final qlo h = h(context.getApplicationContext());
            final CastOptions castOptions = h.getCastOptions(context.getApplicationContext());
            final qmg qmgVar = new qmg(bhd.b(context), castOptions);
            return rwd.a(executor, new Callable() { // from class: qko
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = context;
                    CastOptions castOptions2 = castOptions;
                    qlo qloVar = h;
                    qmg qmgVar2 = qmgVar;
                    synchronized (qkp.b) {
                        if (qkp.c == null) {
                            qkp.c = new qkp(context2, castOptions2, qloVar.getAdditionalSessionProviders(context2.getApplicationContext()), qmgVar2);
                        }
                    }
                    return qkp.c;
                }
            });
        }
        return rwd.c(qkpVar);
    }

    private static qlo h(Context context) {
        try {
            Bundle bundle = qyr.b(context).c(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                a.b("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string == null) {
                throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
            }
            return (qlo) Class.forName(string).asSubclass(qlo.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final CastOptions c() {
        qnm.g("Must be called from the main thread.");
        return this.h;
    }

    public final qls d() {
        qnm.g("Must be called from the main thread.");
        return this.f;
    }

    public final void g() {
        this.k = !TextUtils.isEmpty(this.h.a) ? new qlu(this.d, this.h, this.j) : null;
    }
}
