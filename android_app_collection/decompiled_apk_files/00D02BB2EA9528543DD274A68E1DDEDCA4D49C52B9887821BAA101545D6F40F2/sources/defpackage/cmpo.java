package defpackage;

import android.content.Context;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cmpo  reason: default package */
/* loaded from: classes.dex */
public final class cmpo {
    public cnml a;
    public boolean b;
    public final Object c = new Object();
    public final Context d;
    public cmpq e;

    public cmpo(Context context) {
        cnwc.a(context);
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext != null ? applicationContext : context;
        this.b = false;
    }

    public static final void b(cmpn cmpnVar, long j, Throwable th) {
        String str;
        if (Math.random() <= dcyn.a) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("app_context", str2);
            if (cmpnVar != null) {
                if (true != cmpnVar.b) {
                    str2 = "0";
                }
                hashMap.put("limit_ad_tracking", str2);
            }
            if (cmpnVar != null && (str = cmpnVar.a) != null) {
                hashMap.put("ad_id_size", Integer.toString(str.length()));
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new cmpm(hashMap).start();
        }
    }

    public final void a() {
        cnwc.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.d == null || this.a == null) {
                return;
            }
            try {
                if (this.b) {
                    cnxg.a().c(this.d, this.a);
                }
            } catch (Throwable unused) {
            }
            this.b = false;
            this.e = null;
            this.a = null;
        }
    }

    protected final void finalize() {
        a();
        super.finalize();
    }
}
