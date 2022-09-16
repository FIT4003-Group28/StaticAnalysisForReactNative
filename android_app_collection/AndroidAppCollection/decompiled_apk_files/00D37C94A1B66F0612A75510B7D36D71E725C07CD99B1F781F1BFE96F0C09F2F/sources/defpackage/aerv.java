package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aerv  reason: default package */
/* loaded from: classes.dex */
public class aerv implements aere {
    public final oxe a;
    public final aflm b;
    public final aers c;
    public final aesk d;
    public final aeru e;
    public aerq f;
    public int g;
    public int h;
    public byte[] i;
    private final HashMap j;
    private final Handler k;
    private final amqo l;
    private HandlerThread m;
    private Handler n;
    private boolean o;
    private oxa p;
    private Exception q;
    private owv r;
    private int s = -1;

    public aerv(Looper looper, aesk aeskVar, HashMap hashMap, Handler handler, aerq aerqVar, amqo amqoVar, oxe oxeVar, aflm aflmVar) {
        this.d = aeskVar;
        this.j = hashMap;
        this.k = handler;
        this.f = aerqVar;
        afms.a(amqoVar);
        this.l = amqoVar;
        this.a = oxeVar;
        oxeVar.a(new aerr(this));
        this.b = aflmVar;
        this.c = new aers(this, looper);
        this.e = new aeru(this, looper);
        this.h = 1;
    }

    public static int i() {
        try {
            return r(new oxe(aeqw.a));
        } catch (UnsupportedSchemeException unused) {
            return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r5.equals("L1") != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int r(defpackage.oxe r5) {
        /*
            r0 = 0
            r1 = -1
            r2 = 1
            android.media.MediaDrm r5 = r5.a     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "securityLevel"
            java.lang.String r5 = r5.getPropertyString(r3)     // Catch: java.lang.Throwable -> L3c
            int r3 = r5.hashCode()     // Catch: java.lang.Throwable -> L3c
            r4 = 2
            switch(r3) {
                case 2405: goto L28;
                case 2406: goto L1e;
                case 2407: goto L14;
                default: goto L13;
            }
        L13:
            goto L31
        L14:
            java.lang.String r0 = "L3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L31
            r0 = 2
            goto L32
        L1e:
            java.lang.String r0 = "L2"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L31
            r0 = 1
            goto L32
        L28:
            java.lang.String r3 = "L1"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L31
            goto L32
        L31:
            r0 = -1
        L32:
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L3b
            if (r0 == r4) goto L39
            return r1
        L39:
            r5 = 3
            return r5
        L3b:
            return r2
        L3c:
            r5 = move-exception
            afki r3 = defpackage.afki.DRM
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r5.getLocalizedMessage()
            r2[r0] = r5
            java.lang.String r5 = "Cannot determine Widevine Security Level. Falling back to non-L1: %s"
            defpackage.afkj.e(r3, r5, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aerv.r(oxe):int");
    }

    private final void s(boolean z) {
        try {
            this.b.q();
            this.i = this.a.a.openSession();
            this.b.p();
            this.p = new oxa(new MediaCrypto(aeqw.a, this.i));
            this.h = 3;
            g();
        } catch (NotProvisionedException e) {
            if (z) {
                try {
                    p();
                    return;
                } catch (Exception e2) {
                    m(e2);
                    return;
                }
            }
            m(e);
        } catch (Exception e3) {
            m(e3);
        }
    }

    private final void t() {
        try {
            this.b.m();
            oxe oxeVar = this.a;
            byte[] bArr = this.i;
            owv owvVar = this.r;
            oxc oxcVar = new oxc(oxeVar.a.getKeyRequest(bArr, owvVar.b, owvVar.a, 1, this.j));
            this.b.l();
            this.b.o();
            this.n.obtainMessage(1, oxcVar).sendToTarget();
        } catch (NotProvisionedException e) {
            n(e);
        }
    }

    @Override // defpackage.owy
    public final int a() {
        return this.h;
    }

    @Override // defpackage.owy
    public final Exception b() {
        if (this.h == 0) {
            return this.q;
        }
        return null;
    }

    @Override // defpackage.owy
    public final void c() {
    }

    @Override // defpackage.owy
    public final void d(owx owxVar) {
        int i = this.g + 1;
        this.g = i;
        if (i != 1) {
            return;
        }
        if (this.n == null) {
            HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new aert(this, this.m.getLooper());
        }
        if (this.r == null) {
            owv a = owxVar.a(aeqw.a);
            this.r = a;
            if (a == null) {
                m(new IllegalStateException("Media does not support Widevine"));
                return;
            }
        }
        this.h = 2;
        s(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        long j;
        aerg aergVar = (aerg) this.l.get();
        if (aergVar != null) {
            try {
                this.a.a.restoreKeys(this.i, aergVar.a);
                try {
                    HashMap<String, String> queryKeyStatus = this.a.a.queryKeyStatus(this.i);
                    "Offline".equals(queryKeyStatus.get("LicenseType"));
                    "True".equals(queryKeyStatus.get("PersistAllowed"));
                    j = afeu.f(queryKeyStatus.get("LicenseDurationRemaining"), 0);
                    "True".equals(queryKeyStatus.get("RenewAllowed"));
                    afeu.f(queryKeyStatus.get("LicenseDurationRemaining"), Integer.MAX_VALUE);
                } catch (Exception unused) {
                    afkj.d(afki.DRM, "Unable to query key status for Offline License. Falling back to streaming mode.");
                    j = 0;
                }
                if (j > 0) {
                    this.h = 4;
                    this.d.d(aergVar.b, 0);
                    afki afkiVar = afki.ABR;
                    return;
                }
                afkj.d(afki.DRM, "Offline license expired. Trying with Streaming License");
            } catch (Exception e) {
                afkj.c(afki.DRM, e, "Error trying to restore Widevine keys. Falling back to streaming mode.", new Object[0]);
            }
        } else {
            afki afkiVar2 = afki.ABR;
        }
        t();
    }

    @Override // defpackage.aere
    public final int h() {
        int i = this.s;
        if (i == -1) {
            int r = r(this.a);
            this.s = r;
            return r;
        }
        return i;
    }

    @Override // defpackage.aere
    public final oxe j() {
        return this.a;
    }

    @Override // defpackage.owy
    /* renamed from: k */
    public final oxa f() {
        int i = this.h;
        if (i == 3 || i == 4) {
            return this.p;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.aere
    public final void l() {
        int i = this.g - 1;
        this.g = i;
        if (i != 0) {
            return;
        }
        this.h = 1;
        this.o = false;
        aers aersVar = this.c;
        if (aersVar != null) {
            aersVar.removeCallbacksAndMessages(null);
        }
        if (this.n != null) {
            this.e.removeCallbacksAndMessages(null);
            this.n.removeCallbacksAndMessages(null);
            this.n = null;
        }
        HandlerThread handlerThread = this.m;
        if (handlerThread != null) {
            handlerThread.quit();
            this.m = null;
        }
        this.r = null;
        this.p = null;
        this.q = null;
        if (this.i == null) {
            return;
        }
        this.k.postDelayed(new Runnable() { // from class: aerp
            @Override // java.lang.Runnable
            public final void run() {
                aerv aervVar = aerv.this;
                try {
                    oxe oxeVar = aervVar.a;
                    oxeVar.a.closeSession(aervVar.i);
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
                    sb.append("Exception while trying to close DRM Session with a delay of 100 ms: ");
                    sb.append(valueOf);
                    afus.b(1, 6, sb.toString());
                }
                aervVar.i = null;
            }
        }, 100L);
    }

    public final void m(final Exception exc) {
        this.q = exc;
        final aerq aerqVar = this.f;
        if (aerqVar != null) {
            afki afkiVar = afki.DRM;
            amzz amzzVar = new amzz() { // from class: aern
                @Override // defpackage.amzz
                public final Object a() {
                    return afca.e(aerv.this.a);
                }
            };
            afkj.g(amzzVar);
            afkj.e(afkiVar, "DRM Exception: %s; MediaDRM Metrics: %s", exc.getLocalizedMessage(), amzzVar);
            this.k.post(new Runnable() { // from class: aero
                @Override // java.lang.Runnable
                public final void run() {
                    aerq aerqVar2 = aerq.this;
                    Exception exc2 = exc;
                    aerx aerxVar = (aerx) aerqVar2;
                    aere aereVar = aerxVar.i;
                    if (aereVar != null) {
                        afca.e(aereVar.j());
                    }
                    WidevineHelper$Listener widevineHelper$Listener = aerxVar.a;
                    int i = aerxVar.b;
                    ylr.c();
                    afdv afdvVar = (afdv) widevineHelper$Listener;
                    if (i != afdvVar.u()) {
                        return;
                    }
                    afdvVar.F(true);
                    afdvVar.V(afgz.a(exc2, afdvVar.g(), afkl.DRM, "keyerror", null, false));
                }
            });
        }
        if (this.h != 4) {
            this.h = 0;
        }
    }

    public final void n(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            p();
        } else {
            m(exc);
        }
    }

    public final void o(Object obj) {
        this.o = false;
        int i = this.h;
        if (i == 2 || i == 3 || i == 4) {
            if (obj instanceof Exception) {
                m((Exception) obj);
                return;
            }
            try {
                this.a.a.provideProvisionResponse((byte[]) obj);
                if (this.h == 2) {
                    s(false);
                } else {
                    g();
                }
            } catch (DeniedByServerException | IllegalStateException e) {
                m(new Exception(e) { // from class: com.google.android.libraries.youtube.media.player.drm.WidevineHelper$DrmProvisionException
                });
            }
        }
    }

    public final void p() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.n.obtainMessage(0, new oxd(this.a.a.getProvisionRequest())).sendToTarget();
    }

    @Override // defpackage.owy
    public final boolean e(String str) {
        int i = this.h;
        if (i == 3 || i == 4) {
            return h() == 1 && this.p.a(str);
        }
        throw new IllegalStateException();
    }
}
