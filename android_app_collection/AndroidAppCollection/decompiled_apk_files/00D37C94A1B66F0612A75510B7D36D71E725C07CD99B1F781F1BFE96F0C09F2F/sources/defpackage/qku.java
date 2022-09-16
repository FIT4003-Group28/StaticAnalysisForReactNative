package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.mediarouter.media.MediaTransferReceiver;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qku  reason: default package */
/* loaded from: classes4.dex */
public final class qku extends qlr {
    public static final /* synthetic */ int f = 0;
    public final Set a;
    public final qlb b;
    public qjj c;
    public qoh d;
    public qmu e;
    private final Context h;
    private final CastOptions i;
    private final qor j;
    private CastDevice k;

    static {
        new qpu("CastSession");
    }

    public qku(Context context, String str, String str2, CastOptions castOptions, qor qorVar) {
        super(context, str, str2);
        this.a = new HashSet();
        this.h = context.getApplicationContext();
        this.i = castOptions;
        this.j = qorVar;
        this.b = qmd.a(context, castOptions, m(), new qkw(this));
    }

    private final void p(Bundle bundle) {
        CastDevice a = CastDevice.a(bundle);
        this.k = a;
        if (a == null) {
            qnm.g("Must be called from the main thread.");
            qlh qlhVar = this.g;
            if (qlhVar != null) {
                try {
                    if (qlhVar.j()) {
                        qlh qlhVar2 = this.g;
                        if (qlhVar2 == null) {
                            return;
                        }
                        try {
                            qlhVar2.k();
                            return;
                        } catch (RemoteException unused) {
                            return;
                        }
                    }
                } catch (RemoteException unused2) {
                }
            }
            qlh qlhVar3 = this.g;
            if (qlhVar3 == null) {
                return;
            }
            try {
                qlhVar3.l();
                return;
            } catch (RemoteException unused3) {
                return;
            }
        }
        qjj qjjVar = this.c;
        NotificationOptions notificationOptions = null;
        if (qjjVar != null) {
            qjjVar.b();
            this.c = null;
        }
        CastDevice castDevice = this.k;
        qnm.b(castDevice);
        Bundle bundle2 = new Bundle();
        CastOptions castOptions = this.i;
        CastMediaOptions castMediaOptions = castOptions == null ? null : castOptions.e;
        if (castMediaOptions != null) {
            notificationOptions = castMediaOptions.c;
        }
        boolean z = castMediaOptions != null && castMediaOptions.d;
        Intent intent = new Intent(this.h, MediaTransferReceiver.class);
        intent.setPackage(this.h.getPackageName());
        boolean z2 = !this.h.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", notificationOptions != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", z2);
        qjf qjfVar = new qjf(castDevice, new qks(this), null, null, null);
        qjfVar.b = bundle2;
        qjj a2 = qji.a(this.h, new qjg(qjfVar));
        ((qjz) a2).t.add(new qkt(this));
        this.c = a2;
        final qjz qjzVar = (qjz) a2;
        qst qstVar = (qst) a2;
        qvd p = qstVar.p(qjzVar.b, "castDeviceControllerListenerKey");
        qvm a3 = qvn.a();
        qvo qvoVar = new qvo() { // from class: qjo
            @Override // defpackage.qvo
            public final void a(Object obj, Object obj2) {
                qjz qjzVar2 = qjz.this;
                qpk qpkVar = (qpk) obj;
                qpp qppVar = (qpp) qpkVar.D();
                qjy qjyVar = qjzVar2.b;
                Parcel pv = qppVar.pv();
                dve.i(pv, qjyVar);
                qppVar.py(18, pv);
                qpp qppVar2 = (qpp) qpkVar.D();
                qppVar2.py(17, qppVar2.pv());
                ((rvh) obj2).b(null);
            }
        };
        qjn qjnVar = qjn.a;
        a3.c = p;
        a3.a = qvoVar;
        a3.b = qjnVar;
        a3.d = new Feature[]{qjm.b};
        a3.e = 8428;
        qstVar.t(a3.a());
    }

    @Override // defpackage.qlr
    public final long a() {
        long g;
        qnm.g("Must be called from the main thread.");
        qoh qohVar = this.d;
        if (qohVar == null) {
            return 0L;
        }
        synchronized (qohVar.a) {
            qnm.g("Must be called from the main thread.");
            g = qohVar.b.g();
        }
        return g - this.d.c();
    }

    public final CastDevice b() {
        qnm.g("Must be called from the main thread.");
        return this.k;
    }

    public final qoh c() {
        qnm.g("Must be called from the main thread.");
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qlr
    public final void e(boolean z) {
        qlb qlbVar = this.b;
        if (qlbVar != null) {
            try {
                qlbVar.j(z);
            } catch (RemoteException unused) {
            }
            n(0);
            qmu qmuVar = this.e;
            if (qmuVar == null || qmuVar.c == 0 || qmuVar.f == null) {
                return;
            }
            Iterator it = new HashSet(qmuVar.b).iterator();
            if (it.hasNext()) {
                tjk tjkVar = (tjk) it.next();
                throw null;
            }
            qmuVar.c = 0;
            qmuVar.f = null;
            qmuVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qlr
    public final void f(Bundle bundle) {
        this.k = CastDevice.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qlr
    public final void g(Bundle bundle) {
        this.k = CastDevice.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qlr
    public final void h(Bundle bundle) {
        p(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qlr
    public final void i(Bundle bundle) {
        p(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qlr
    public final void j(Bundle bundle) {
        this.k = CastDevice.a(bundle);
    }

    public final void k(String str, String str2) {
        qnm.g("Must be called from the main thread.");
        qjj qjjVar = this.c;
        if (qjjVar == null) {
            new qvt(Looper.getMainLooper()).n(new Status(17));
            return;
        }
        rve a = qjjVar.a(str, str2);
        final qmr qmrVar = new qmr();
        a.r(new ruz() { // from class: qmq
            @Override // defpackage.ruz
            public final void d(Object obj) {
                Void r3 = (Void) obj;
                qmr.this.n(new Status(0));
            }
        });
        a.n(new ruw() { // from class: qmp
            @Override // defpackage.ruw
            public final void c(Exception exc) {
                qmr qmrVar2 = qmr.this;
                Status status = new Status(8, "unknown error");
                if (exc instanceof qsp) {
                    qsp qspVar = (qsp) exc;
                    status = new Status(qspVar.a(), qspVar.getMessage());
                }
                int i = qku.f;
                qmrVar2.n(status);
            }
        });
    }

    public final void l(rve rveVar) {
        CastOptions castOptions;
        if (this.b == null) {
            return;
        }
        try {
            if (!rveVar.k()) {
                Exception f2 = rveVar.f();
                if (!(f2 instanceof qsp)) {
                    this.b.f(2476);
                    return;
                } else {
                    this.b.f(((qsp) f2).a());
                    return;
                }
            }
            qpd qpdVar = (qpd) rveVar.g();
            if (!qpdVar.a.c()) {
                this.b.f(qpdVar.a.g);
                return;
            }
            qoh qohVar = new qoh(new qpy());
            this.d = qohVar;
            qohVar.j(this.c);
            this.d.i();
            qor qorVar = this.j;
            qoh qohVar2 = this.d;
            CastDevice b = b();
            if (!qorVar.i && (castOptions = qorVar.b) != null && castOptions.e != null && qohVar2 != null && b != null) {
                qorVar.e = qohVar2;
                qoh qohVar3 = qorVar.e;
                qnm.g("Must be called from the main thread.");
                qohVar3.c.add(qorVar);
                qorVar.f = b;
                ComponentName componentName = new ComponentName(qorVar.a, qorVar.b.e.a);
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                PendingIntent b2 = rfi.b(qorVar.a, 0, intent, rfi.a);
                if (qorVar.b.e.e) {
                    qorVar.g = new iz(qorVar.a, "CastMediaSession", componentName, b2);
                    qorVar.l(0, null);
                    CastDevice castDevice = qorVar.f;
                    if (castDevice != null && !TextUtils.isEmpty(castDevice.d)) {
                        iz izVar = qorVar.g;
                        aoce aoceVar = new aoce();
                        aoceVar.m("android.media.metadata.ALBUM_ARTIST", qorVar.a.getResources().getString(R.string.cast_casting_to_device, qorVar.f.d));
                        izVar.h(aoceVar.j());
                    }
                    qorVar.h = new qoq(qorVar);
                    qorVar.g.f(qorVar.h);
                    qorVar.g.e(true);
                    qmg qmgVar = qorVar.j;
                    bhd.m(qorVar.g);
                }
                qorVar.i = true;
                qorVar.m();
            }
            qlb qlbVar = this.b;
            ApplicationMetadata applicationMetadata = qpdVar.b;
            qnm.b(applicationMetadata);
            String str = qpdVar.c;
            String str2 = qpdVar.d;
            qnm.b(str2);
            qlbVar.a(applicationMetadata, str, str2, qpdVar.e);
        } catch (RemoteException unused) {
        }
    }

    public final void d(int i) {
        qor qorVar = this.j;
        if (qorVar.i) {
            qorVar.i = false;
            qoh qohVar = qorVar.e;
            if (qohVar != null) {
                qnm.g("Must be called from the main thread.");
                qohVar.c.remove(qorVar);
            }
            qmg qmgVar = qorVar.j;
            bhd.m(null);
            qorVar.c.a();
            qoj qojVar = qorVar.d;
            if (qojVar != null) {
                qojVar.a();
            }
            iz izVar = qorVar.g;
            if (izVar != null) {
                izVar.j(null);
                qorVar.g.f(null);
                qorVar.g.h(new aoce().j());
                qorVar.l(0, null);
                qorVar.g.e(false);
                qorVar.g.d();
                qorVar.g = null;
            }
            qorVar.e = null;
            qorVar.f = null;
            qorVar.h = null;
            qorVar.j();
            if (i == 0) {
                qorVar.k();
            }
        }
        qjj qjjVar = this.c;
        if (qjjVar != null) {
            qjjVar.b();
            this.c = null;
        }
        this.k = null;
        qoh qohVar2 = this.d;
        if (qohVar2 != null) {
            qohVar2.j(null);
            this.d = null;
        }
    }
}
