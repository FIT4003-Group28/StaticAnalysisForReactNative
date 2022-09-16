package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: qjz  reason: default package */
/* loaded from: classes4.dex */
public final class qjz extends qst implements qjj {
    private static final qso F;
    private static final tzc H;
    public static final qpu a = new qpu("CastClient");
    private Handler G;
    public final qjy b;
    public boolean c;
    public boolean d;
    rvh e;
    rvh f;
    public final AtomicLong g;
    public final Object h;
    public final Object i;
    public ApplicationMetadata j;
    public String k;
    public double l;
    public boolean m;
    public int n;
    public int o;
    public EqualizerSettings p;
    public final CastDevice q;
    final Map r;
    public final Map s;
    public final List t;
    public int u;
    public final tfo v;

    static {
        qjt qjtVar = new qjt();
        H = qjtVar;
        F = new qso("Cast.API_CXLESS", qjtVar, qpt.b, null, null, null);
    }

    public qjz(Context context, qjg qjgVar) {
        super(context, F, qjgVar, qss.a);
        this.b = new qjy(this);
        this.h = new Object();
        this.i = new Object();
        this.t = Collections.synchronizedList(new ArrayList());
        qnm.n(context, "context cannot be null");
        this.v = qjgVar.e;
        this.q = qjgVar.a;
        this.r = new HashMap();
        this.s = new HashMap();
        this.g = new AtomicLong(0L);
        this.u = 1;
        m();
    }

    public static qsp e(int i) {
        return tjk.h(new Status(i));
    }

    @Override // defpackage.qjj
    public final rve a(String str, String str2) {
        qpl.i(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str2.length() > 524288) {
            a.d("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        qvx b = qvy.b();
        b.a = new qjs(this, str, str2);
        b.c = 8405;
        return v(b.a());
    }

    @Override // defpackage.qjj
    public final void b() {
        qvx b = qvy.b();
        b.a = qjn.b;
        b.c = 8403;
        v(b.a());
        g();
        n(this.b);
    }

    @Override // defpackage.qjj
    public final void c(String str, qjh qjhVar) {
        qpl.i(str);
        if (qjhVar != null) {
            synchronized (this.s) {
                this.s.put(str, qjhVar);
            }
        }
        qvx b = qvy.b();
        b.a = new qjq(this, str, qjhVar);
        b.c = 8413;
        v(b.a());
    }

    public final Handler d() {
        if (this.G == null) {
            this.G = new rfm(this.B);
        }
        return this.G;
    }

    public final void f() {
        qnm.k(this.u == 2, "Not connected to device");
    }

    public final void g() {
        synchronized (this.s) {
            this.s.clear();
        }
    }

    public final void h(rvh rvhVar) {
        synchronized (this.h) {
            if (this.e != null) {
                i(2477);
            }
            this.e = rvhVar;
        }
    }

    public final void i(int i) {
        synchronized (this.h) {
            rvh rvhVar = this.e;
            if (rvhVar != null) {
                rvhVar.a(e(i));
            }
            this.e = null;
        }
    }

    public final void j(long j, int i) {
        rvh rvhVar;
        synchronized (this.r) {
            Map map = this.r;
            Long valueOf = Long.valueOf(j);
            rvhVar = (rvh) map.get(valueOf);
            this.r.remove(valueOf);
        }
        if (rvhVar != null) {
            if (i == 0) {
                rvhVar.b(null);
            } else {
                rvhVar.a(e(i));
            }
        }
    }

    public final void k(int i) {
        synchronized (this.i) {
            rvh rvhVar = this.f;
            if (rvhVar == null) {
                return;
            }
            if (i == 0) {
                rvhVar.b(new Status(0));
            } else {
                rvhVar.a(e(i));
            }
            this.f = null;
        }
    }

    public final void l() {
        boolean z = true;
        if (this.u == 1) {
            z = false;
        }
        qnm.k(z, "Not active connection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        if (!this.q.d(2048) && this.q.d(4) && !this.q.d(1)) {
            "Chromecast Audio".equals(this.q.e);
        }
    }

    public final void n(qpr qprVar) {
        qvb qvbVar = p(qprVar, "castDeviceControllerListenerKey").b;
        qnm.n(qvbVar, "Key must not be null");
        u(qvbVar, 8415);
    }
}
