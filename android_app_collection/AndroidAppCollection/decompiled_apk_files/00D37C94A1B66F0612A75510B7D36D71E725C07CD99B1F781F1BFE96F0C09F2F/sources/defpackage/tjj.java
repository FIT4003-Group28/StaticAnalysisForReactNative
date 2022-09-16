package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.lens.sdk.PendingIntentConsumer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: tjj  reason: default package */
/* loaded from: classes4.dex */
public final class tjj extends dvs implements ServiceConnection, tjd {
    public final Executor a;
    public final Context b;
    public final tjc c;
    public int d;
    public int e;
    public dwb f;
    public dwa g;
    public int h;
    public dvq i;
    public dvr j;
    private final Executor k;
    private final tiy l;

    public tjj(Context context, tjc tjcVar, tiy tiyVar) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(pgw.c);
        this.a = new rzw(new Handler(Looper.getMainLooper()), 2);
        this.d = 1;
        this.h = 1;
        this.b = context;
        this.c = tjcVar;
        this.l = tiyVar;
        this.k = newSingleThreadExecutor;
    }

    private static boolean n(int i) {
        return i == 6 || i == 7 || i == 8;
    }

    private static boolean o(int i) {
        return i == 5;
    }

    @Override // defpackage.dvt
    public final void a(final byte[] bArr, final SystemParcelableWrapper systemParcelableWrapper) {
        this.a.execute(new Runnable() { // from class: tji
            @Override // java.lang.Runnable
            public final void run() {
                tjj tjjVar = tjj.this;
                byte[] bArr2 = bArr;
                SystemParcelableWrapper systemParcelableWrapper2 = systemParcelableWrapper;
                int i = tjjVar.d;
                if (i == 4 || i == 5) {
                    try {
                        dwf dwfVar = (dwf) aopi.parseFrom(dwf.a, bArr2, aoos.b());
                        int c = ehi.c(dwfVar.b);
                        if (c != 0 && c == 240) {
                            dwc dwcVar = (dwc) dwfVar.qm(dvy.a);
                            tjjVar.e = dwcVar.b;
                            dwb dwbVar = dwcVar.c;
                            if (dwbVar == null) {
                                dwbVar = dwb.a;
                            }
                            tjjVar.f = dwbVar;
                            dwa dwaVar = dwcVar.d;
                            if (dwaVar == null) {
                                dwaVar = dwa.a;
                            }
                            tjjVar.g = dwaVar;
                            int i2 = dwcVar.e;
                            tjjVar.h = 2;
                            tjjVar.i(5);
                            return;
                        }
                        int c2 = ehi.c(dwfVar.b);
                        if (c2 != 0 && c2 == 310) {
                            ((Bundle) systemParcelableWrapper2.a).getLong("session_id");
                            return;
                        }
                        tjc tjcVar = tjjVar.c;
                        int c3 = ehi.c(dwfVar.b);
                        if (c3 == 0 || c3 != 268) {
                            return;
                        }
                        Parcelable parcelable = systemParcelableWrapper2.a;
                        if (!(parcelable instanceof PendingIntent)) {
                            return;
                        }
                        PendingIntent pendingIntent = (PendingIntent) parcelable;
                        ((tjb) tjcVar).a.d();
                        PendingIntentConsumer pendingIntentConsumer = ((tjb) tjcVar).b;
                        if (pendingIntentConsumer != null) {
                            pendingIntentConsumer.onReceivedPendingIntent(pendingIntent);
                            return;
                        } else {
                            Log.e("LensServiceBridge", "PendingIntentConsumer cannot be null");
                            return;
                        }
                    } catch (aopx e) {
                        Log.e("LensServiceConnImpl", "Unable to parse the protobuf.", e);
                        tjjVar.h = 11;
                        tjjVar.i(8);
                        return;
                    }
                }
                Log.w("LensServiceConnImpl", "ServiceEvent received after connection disposed.");
            }
        });
    }

    @Override // defpackage.tjd
    public final int b() {
        tjk.a();
        tjk.b(l(), "Attempted to use lensServiceSession before ready.");
        return this.e;
    }

    @Override // defpackage.tjd
    public final void c(byte[] bArr, SystemParcelableWrapper systemParcelableWrapper) {
        tjk.a();
        tjk.b(f(), "Attempted to use lensServiceSession before ready.");
        dvr dvrVar = this.j;
        tjk.c(dvrVar);
        Parcel pv = dvrVar.pv();
        pv.writeByteArray(bArr);
        dve.g(pv, systemParcelableWrapper);
        dvrVar.py(2, pv);
    }

    @Override // defpackage.tjd
    public final void d() {
        tjk.a();
        tjk.b(f(), "Attempted to handover when not ready.");
        aopc aopcVar = (aopc) dvv.a.createBuilder();
        aopcVar.copyOnWrite();
        dvv dvvVar = (dvv) aopcVar.instance;
        dvvVar.c = 99;
        dvvVar.b |= 1;
        aopg aopgVar = dwd.a;
        aopa createBuilder = dwe.a.createBuilder();
        createBuilder.copyOnWrite();
        dwe dweVar = (dwe) createBuilder.instance;
        dweVar.b |= 1;
        dweVar.c = true;
        aopcVar.e(aopgVar, (dwe) createBuilder.mo39build());
        dvv dvvVar2 = (dvv) aopcVar.mo39build();
        try {
            dvr dvrVar = this.j;
            tjk.c(dvrVar);
            dvrVar.a(dvvVar2.toByteArray());
        } catch (RemoteException | SecurityException e) {
            Log.e("LensServiceConnImpl", "Unable to stop Lens service session.", e);
        }
        this.h = 12;
        i(8);
    }

    @Override // defpackage.tjd
    public final boolean e() {
        tjk.a();
        return n(this.d);
    }

    @Override // defpackage.tjd
    public final boolean f() {
        tjk.a();
        return o(this.d);
    }

    @Override // defpackage.tjd
    public final int g() {
        tjk.a();
        boolean z = true;
        if (!f() && !e()) {
            z = false;
        }
        tjk.b(z, "Attempted to use ServerFlags before ready or dead.");
        return this.h;
    }

    public final void h() {
        tjk.a();
        if (this.j == null) {
            this.h = 11;
            i(7);
            return;
        }
        this.h = 11;
        i(8);
    }

    public final void i(int i) {
        tjk.a();
        String.format("Transitioning from state %s to %s.", Integer.valueOf(this.d), Integer.valueOf(i));
        int i2 = this.d;
        this.d = i;
        if (o(i) && !o(i2)) {
            tjc tjcVar = this.c;
            tjk.a();
            ((tjb) tjcVar).b();
        }
        if (!n(i) || n(i2)) {
            return;
        }
        tjc tjcVar2 = this.c;
        tjk.a();
        ((tjb) tjcVar2).b();
    }

    public final boolean j() {
        return this.d == 2;
    }

    public final boolean k() {
        int i = this.d;
        return i == 3 || i == 4 || i == 5 || i == 7 || i == 8;
    }

    public final boolean l() {
        int i = this.d;
        return i == 5 || i == 8;
    }

    public final void m() {
        tjk.a();
        if (j() || k()) {
            return;
        }
        i(2);
        this.l.a(new tiv() { // from class: tje
            @Override // defpackage.tiv
            public final void a(tjl tjlVar) {
                tjj tjjVar = tjj.this;
                int c = tjw.c(tjlVar.e);
                if (c == 0 || c != 2) {
                    int c2 = tjw.c(tjlVar.e);
                    if (c2 == 0) {
                        c2 = 1;
                    }
                    tjjVar.h = c2;
                    tjjVar.i(6);
                    return;
                }
                Intent intent = new Intent("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
                intent.setPackage("com.google.android.googlequicksearchbox");
                try {
                    if (!tjjVar.b.bindService(intent, tjjVar, 65)) {
                        Log.e("LensServiceConnImpl", "Unable to bind Lens service.");
                        tjjVar.h = 11;
                        tjjVar.i(7);
                        return;
                    }
                    tjjVar.i(3);
                } catch (SecurityException e) {
                    Log.e("LensServiceConnImpl", "Unable to bind Lens service due to security exception.", e);
                    tjjVar.h = 11;
                    tjjVar.i(7);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        final dvq dvqVar;
        tjk.a();
        if (iBinder == null) {
            dvqVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            if (queryLocalInterface instanceof dvq) {
                dvqVar = (dvq) queryLocalInterface;
            } else {
                dvqVar = new dvq(iBinder);
            }
        }
        this.i = dvqVar;
        this.k.execute(new Runnable() { // from class: tjg
            @Override // java.lang.Runnable
            public final void run() {
                final tjj tjjVar = tjj.this;
                dvq dvqVar2 = dvqVar;
                try {
                    Parcel pv = dvqVar2.pv();
                    pv.writeString("LENS_SERVICE_SESSION");
                    dve.i(pv, tjjVar);
                    final dvr dvrVar = null;
                    pv.writeByteArray(null);
                    Parcel pw = dvqVar2.pw(1, pv);
                    IBinder readStrongBinder = pw.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
                        if (queryLocalInterface2 instanceof dvr) {
                            dvrVar = (dvr) queryLocalInterface2;
                        } else {
                            dvrVar = new dvr(readStrongBinder);
                        }
                    }
                    pw.recycle();
                    tjjVar.a.execute(new Runnable() { // from class: tjh
                        @Override // java.lang.Runnable
                        public final void run() {
                            tjj tjjVar2 = tjj.this;
                            dvr dvrVar2 = dvrVar;
                            tjk.a();
                            if (tjjVar2.i == null) {
                                Log.w("LensServiceConnImpl", "The service is no longer bound.");
                                tjjVar2.h();
                                return;
                            }
                            try {
                                tjjVar2.j = dvrVar2;
                                if (tjjVar2.j == null) {
                                    Log.e("LensServiceConnImpl", "Failed to create a Lens service session.");
                                    tjjVar2.h = 11;
                                    tjjVar2.i(7);
                                    return;
                                }
                                tjjVar2.i(4);
                                aopc aopcVar = (aopc) dvv.a.createBuilder();
                                aopcVar.copyOnWrite();
                                dvv dvvVar = (dvv) aopcVar.instance;
                                dvvVar.c = 98;
                                dvvVar.b |= 1;
                                aopc aopcVar2 = (aopc) dvv.a.createBuilder();
                                aopcVar2.copyOnWrite();
                                dvv dvvVar2 = (dvv) aopcVar2.instance;
                                dvvVar2.c = 348;
                                dvvVar2.b |= 1;
                                aopg aopgVar = dvw.a;
                                aopa createBuilder = dvx.a.createBuilder();
                                createBuilder.copyOnWrite();
                                dvx dvxVar = (dvx) createBuilder.instance;
                                dvxVar.b |= 1;
                                dvxVar.c = 2;
                                aopcVar2.e(aopgVar, (dvx) createBuilder.mo39build());
                                dvr dvrVar3 = tjjVar2.j;
                                tjk.c(dvrVar3);
                                dvrVar3.a(((dvv) aopcVar.mo39build()).toByteArray());
                                dvr dvrVar4 = tjjVar2.j;
                                tjk.c(dvrVar4);
                                dvrVar4.a(((dvv) aopcVar2.mo39build()).toByteArray());
                            } catch (RemoteException e) {
                                Log.w("LensServiceConnImpl", "Failed to call client event callbacks.", e);
                                tjjVar2.h();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    Log.w("LensServiceConnImpl", "Failed to create a Lens service session.", e);
                    tjjVar.a.execute(new Runnable() { // from class: tjf
                        @Override // java.lang.Runnable
                        public final void run() {
                            tjj.this.h();
                        }
                    });
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        tjk.a();
        this.h = 11;
        i(7);
    }
}
