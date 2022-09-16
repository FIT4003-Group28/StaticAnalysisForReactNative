package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zol  reason: default package */
/* loaded from: classes4.dex */
public final class zol extends Handler {
    private final WeakReference a;

    public zol(Looper looper, zou zouVar) {
        super(looper);
        this.a = new WeakReference(zouVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        SurfaceTexture surfaceTexture;
        zra zraVar;
        zqn zqnVar;
        zqn zqnVar2;
        zou zouVar = (zou) this.a.get();
        if (zouVar == null) {
            zep.b("handleMessage: glThreadReference is Null!");
            return;
        }
        boolean z = false;
        switch (message.what) {
            case 1:
                zop zopVar = (zop) message.obj;
                aqxo.y(!zouVar.e);
                zpq zpqVar = zouVar.C;
                zpq zpqVar2 = zopVar.a;
                if (zpqVar != zpqVar2) {
                    zouVar.C = zpqVar2;
                }
                zouVar.e = zopVar.b.a();
                return;
            case 2:
                String.valueOf(String.valueOf(zouVar.m)).length();
                zouVar.d = false;
                zouVar.D = false;
                zor zorVar = zouVar.k;
                zorVar.e.b.removeCallbacks(zorVar.d);
                return;
            case 3:
                String.valueOf(String.valueOf(zouVar.m)).length();
                zouVar.g.e();
                ask askVar = zouVar.l;
                if (askVar == null || zouVar.m == null) {
                    if (askVar != null) {
                        askVar.d();
                    }
                    zouVar.l = new ask(asc.b(), 36197, true);
                    SurfaceTexture surfaceTexture2 = zouVar.m;
                    if (surfaceTexture2 != null) {
                        surfaceTexture2.release();
                    }
                    try {
                        zouVar.m = new SurfaceTexture(zouVar.l.a);
                    } catch (RuntimeException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
                        sb.append("DrishtiGlThread: internalResumeGraph: new SurfaceTexture error: ");
                        sb.append(valueOf);
                        zep.b(sb.toString());
                    }
                    zouVar.n = false;
                    zouVar.m.setOnFrameAvailableListener(zouVar, zouVar.b);
                    String.valueOf(String.valueOf(zouVar.m)).length();
                }
                if (zouVar.q == null) {
                    zouVar.q = ask.b();
                }
                synchronized (zouVar.a) {
                    if (!zouVar.f && !zouVar.d && (surfaceTexture = zouVar.m) != null && (zraVar = zouVar.x) != null) {
                        zraVar.a(surfaceTexture, zouVar.l.a);
                    }
                }
                zouVar.c.b();
                zouVar.d = true;
                zor zorVar2 = zouVar.k;
                if (zorVar2.b == null) {
                    return;
                }
                zorVar2.d.run();
                return;
            case 4:
                zouVar.d = false;
                zouVar.b();
                zpq zpqVar3 = zouVar.C;
                if (zpqVar3 != null) {
                    zpqVar3.f();
                }
                zouVar.b.sendEmptyMessage(5);
                return;
            case 5:
                try {
                    zouVar.g.e();
                } catch (RuntimeException e2) {
                    zep.d("internalTearDown: focus failed: ", e2);
                }
                zouVar.g();
                for (zon zonVar : zouVar.r) {
                    if (zonVar != null) {
                        zonVar.a();
                    }
                }
                zou.j(zouVar.q);
                zouVar.q = null;
                zou.j(zouVar.l);
                zouVar.l = null;
                SurfaceTexture surfaceTexture3 = zouVar.m;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.setOnFrameAvailableListener(null);
                    zouVar.m.release();
                    zouVar.m = null;
                    zouVar.n = false;
                }
                zom zomVar = zouVar.y;
                if (zomVar != null) {
                    synchronized (((zqq) zomVar).m) {
                        for (zod zodVar : ((zqq) zomVar).m.values()) {
                            zou.i(zodVar);
                        }
                        ((zqq) zomVar).m.clear();
                    }
                }
                try {
                    zod.f();
                } catch (RuntimeException e3) {
                    zep.d("internalTearDown: focusNone failed: ", e3);
                }
                zod zodVar2 = zouVar.g;
                if (zodVar2 != null) {
                    zodVar2.g();
                    zouVar.g = null;
                }
                zom zomVar2 = zouVar.y;
                if (zomVar2 != null) {
                    zqq zqqVar = (zqq) zomVar2;
                    zqqVar.i.B = null;
                    zqqVar.h.quit();
                    zqqVar.k = null;
                    zouVar.y = null;
                }
                zouVar.f274J = null;
                return;
            case 6:
                Surface surface = (Surface) message.obj;
                String.valueOf(String.valueOf(surface)).length();
                if (surface == null) {
                    zouVar.h();
                    return;
                } else if (surface.equals(zouVar.s)) {
                    return;
                } else {
                    zouVar.g();
                    zouVar.s = surface;
                    if (zouVar.v <= 0 || zouVar.w <= 0) {
                        return;
                    }
                    zouVar.p();
                    return;
                }
            case 7:
                SurfaceTexture surfaceTexture4 = (SurfaceTexture) message.obj;
                String.valueOf(String.valueOf(surfaceTexture4)).length();
                if (surfaceTexture4 == null) {
                    zouVar.e("DrishtiGlThread::internalSetOutputTarget::outputTarget is null");
                    zouVar.h();
                    return;
                } else if (surfaceTexture4.equals(zouVar.t)) {
                    zouVar.e("DrishtiGlThread::internalSetOutputTarget::same outputTarget already set");
                    return;
                } else {
                    zouVar.g();
                    zouVar.t = surfaceTexture4;
                    if (zouVar.v <= 0 || zouVar.w <= 0) {
                        return;
                    }
                    zouVar.p();
                    return;
                }
            case 8:
                ask askVar2 = (ask) message.obj;
                int i = message.arg1;
                int i2 = message.arg2;
                if (askVar2 == null || !zouVar.d || zouVar.u == null) {
                    z = true;
                }
                aqxo.y(z);
                zouVar.g();
                if (askVar2 == null) {
                    return;
                }
                try {
                    askVar2.c(i, i2);
                    zouVar.u = zod.k(askVar2);
                    return;
                } catch (RuntimeException e4) {
                    zep.d("internalSetOutputTarget: forTexture failed: ", e4);
                    zouVar.u = null;
                    return;
                }
            case 9:
                zouVar.h();
                return;
            case 10:
                int i3 = message.arg1;
                int i4 = message.arg2;
                aqxo.p(i3 > 0);
                if (i4 > 0) {
                    z = true;
                }
                aqxo.p(z);
                if (zouVar.v == i3 && zouVar.w == i4) {
                    return;
                }
                zouVar.v = i3;
                zouVar.w = i4;
                if (zouVar.t != null || zouVar.s != null) {
                    zouVar.p();
                }
                if (!zouVar.d) {
                    return;
                }
                zouVar.k();
                return;
            case 11:
                int intValue = ((Integer) message.obj).intValue();
                if (zouVar.z == 0) {
                    zouVar.i = intValue;
                    return;
                }
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("Ignoring setMaxProcessingResolution: ");
                sb2.append(intValue);
                zep.l(sb2.toString());
                return;
            case 12:
                zouVar.d(((Integer) message.obj).intValue());
                return;
            case 13:
                zouVar.n = true;
                if (!zouVar.q(false) || (zqnVar = zouVar.f274J) == null) {
                    return;
                }
                zqnVar.a(System.currentTimeMillis());
                return;
            case 14:
                if (!zouVar.q(((Boolean) message.obj).booleanValue()) || (zqnVar2 = zouVar.f274J) == null) {
                    return;
                }
                zqnVar2.a(System.currentTimeMillis());
                return;
            case 15:
                zouVar.o = ((Integer) message.obj).intValue();
                return;
            case 16:
                zouVar.p = ((Float) message.obj).floatValue();
                return;
            case 17:
                zouVar.E = true;
                return;
            default:
                String valueOf2 = String.valueOf(message.toString());
                zep.l(valueOf2.length() != 0 ? "Unhandled message: ".concat(valueOf2) : new String("Unhandled message: "));
                return;
        }
    }
}
