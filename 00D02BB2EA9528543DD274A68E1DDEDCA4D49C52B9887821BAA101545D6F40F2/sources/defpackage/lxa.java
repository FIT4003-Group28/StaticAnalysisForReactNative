package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: lxa  reason: default package */
/* loaded from: classes.dex */
public final class lxa implements btph {
    public final dbty<arzw> a;
    public final dxio<bvsl> b;
    public final Executor c;
    public final cqat d;
    public final Context e;
    public final atln f;
    public final AtomicInteger g = new AtomicInteger(0);
    public final AtomicInteger h = new AtomicInteger(0);
    public final lwu i;
    private Maneuvers$Maneuver j;
    private CarInstrumentClusterConfig k;
    private byte[] l;

    public lxa(lwu lwuVar, Application application, dxio dxioVar, dxio dxioVar2, cqat cqatVar, Executor executor) {
        this.i = lwuVar;
        this.b = dxioVar;
        this.d = cqatVar;
        this.e = application.getApplicationContext();
        this.f = new atln(application, dxioVar2);
        this.c = dehx.b(executor);
        this.a = dbud.a(new lwy(application, dxioVar, dxioVar2, cqatVar));
    }

    public static int a(bvsp bvspVar) {
        ateb atebVar = ateb.STRAIGHT;
        bvsp bvspVar2 = bvsp.METERS;
        switch (bvspVar.ordinal()) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 7;
            case 6:
                return 6;
            default:
                throw new AssertionError("unknown RoundedDistance.Unit");
        }
    }

    public static boolean e(crqf crqfVar, amuo amuoVar) {
        return crqfVar.d() && amux.j(amuoVar) != null;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    final synchronized boolean b(Maneuvers$Maneuver maneuvers$Maneuver, CarInstrumentClusterConfig carInstrumentClusterConfig) {
        boolean z = true;
        if (Objects.equals(maneuvers$Maneuver, this.j)) {
            CarInstrumentClusterConfig carInstrumentClusterConfig2 = this.k;
            if (carInstrumentClusterConfig2 != null) {
                if (carInstrumentClusterConfig.b == carInstrumentClusterConfig2.b && carInstrumentClusterConfig.c == carInstrumentClusterConfig2.c) {
                    if (carInstrumentClusterConfig.d == carInstrumentClusterConfig2.d) {
                        return true;
                    }
                }
            }
            return z;
        }
        z = false;
        return z;
    }

    public final synchronized byte[] d(amuo amuoVar, CarInstrumentClusterConfig carInstrumentClusterConfig) {
        Bitmap.Config config;
        Maneuvers$Maneuver c = vrv.c(amuoVar);
        if (this.l != null && b(c, carInstrumentClusterConfig)) {
            this.g.incrementAndGet();
            return this.l;
        }
        this.h.incrementAndGet();
        this.j = c;
        this.k = carInstrumentClusterConfig;
        int i = carInstrumentClusterConfig.b;
        int i2 = carInstrumentClusterConfig.c;
        int i3 = carInstrumentClusterConfig.d;
        if (i3 == 8) {
            config = Bitmap.Config.ALPHA_8;
        } else if (i3 == 16) {
            config = Bitmap.Config.RGB_565;
        } else if (i3 == 32) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unexpected bit depth: ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        }
        byte[] l = vrv.l(amuoVar, -1, i, i2, config, Bitmap.CompressFormat.PNG);
        this.l = l;
        return l;
    }
}
