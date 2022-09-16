package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
/* compiled from: PG */
/* renamed from: qly  reason: default package */
/* loaded from: classes4.dex */
public final class qly {
    public static final qpu a = new qpu("ApplicationAnalytics");
    public final qlv b;
    public final qma c;
    public final SharedPreferences d;
    public qlz e;
    private final Handler g = new rfm(Looper.getMainLooper());
    private final Runnable f = new Runnable() { // from class: qlw
        @Override // java.lang.Runnable
        public final void run() {
            qly qlyVar = qly.this;
            qlz qlzVar = qlyVar.e;
            if (qlzVar != null) {
                qlyVar.b.a(qlyVar.c.b(qlzVar), 223);
            }
            qlyVar.g();
        }
    };

    public qly(SharedPreferences sharedPreferences, qlv qlvVar, Bundle bundle, String str) {
        this.d = sharedPreferences;
        this.b = qlvVar;
        this.c = new qma(bundle, str);
    }

    public static String a() {
        qkp a2 = qkp.a();
        qnm.b(a2);
        return a2.c().a;
    }

    private final void i(CastDevice castDevice) {
        qlz qlzVar = this.e;
        if (qlzVar == null) {
            return;
        }
        qlzVar.c = castDevice.k;
        qlzVar.g = castDevice.h;
        qlzVar.h = castDevice.e;
    }

    private final boolean j() {
        String a2;
        String str;
        if (this.e == null || (a2 = a()) == null || (str = this.e.b) == null || !TextUtils.equals(str, a2)) {
            return false;
        }
        qnm.b(this.e);
        return true;
    }

    public final void b() {
        this.g.removeCallbacks(this.f);
    }

    public final void c(qku qkuVar) {
        if (j()) {
            CastDevice b = qkuVar != null ? qkuVar.b() : null;
            if (b != null && !TextUtils.equals(this.e.c, b.k)) {
                i(b);
            }
            qnm.b(this.e);
            return;
        }
        a.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
        d(qkuVar);
    }

    public final void d(qku qkuVar) {
        qlz a2 = qlz.a();
        this.e = a2;
        a2.b = a();
        CastDevice b = qkuVar == null ? null : qkuVar.b();
        if (b != null) {
            i(b);
        }
        qnm.b(this.e);
        qlz qlzVar = this.e;
        int i = 0;
        if (qkuVar != null) {
            qnm.g("Must be called from the main thread.");
            qlh qlhVar = qkuVar.g;
            if (qlhVar != null) {
                try {
                    if (qlhVar.a() >= 211100000) {
                        i = qkuVar.g.f();
                    }
                } catch (RemoteException unused) {
                }
            }
        }
        qlzVar.i = i;
        qnm.b(this.e);
    }

    public final void e(qku qkuVar, int i) {
        c(qkuVar);
        this.b.a(this.c.c(this.e, i), 228);
        b();
        this.e = null;
    }

    public final void f() {
        qlz qlzVar = this.e;
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", qlzVar.b);
        edit.putString("receiver_metrics_id", qlzVar.c);
        edit.putLong("analytics_session_id", qlzVar.d);
        edit.putInt("event_sequence_number", qlzVar.e);
        edit.putString("receiver_session_id", qlzVar.f);
        edit.putInt("device_capabilities", qlzVar.g);
        edit.putString("device_model_name", qlzVar.h);
        edit.putInt("analytics_session_start_type", qlzVar.i);
        edit.apply();
    }

    public final void g() {
        Handler handler = this.g;
        Runnable runnable = this.f;
        qnm.b(runnable);
        handler.postDelayed(runnable, 300000L);
    }

    public final boolean h(String str) {
        String str2;
        if (!j()) {
            return false;
        }
        qnm.b(this.e);
        return (str == null || (str2 = this.e.f) == null || !TextUtils.equals(str2, str)) ? false : true;
    }
}
