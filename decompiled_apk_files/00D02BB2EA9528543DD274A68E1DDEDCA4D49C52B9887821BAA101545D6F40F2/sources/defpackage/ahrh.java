package defpackage;

import android.hardware.Sensor;
import android.os.Build;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahrh  reason: default package */
/* loaded from: classes.dex */
public final class ahrh implements Runnable {
    final /* synthetic */ ahkj a;
    final /* synthetic */ int b;
    final /* synthetic */ ahrl c;

    public ahrh(ahrl ahrlVar, ahkj ahkjVar, int i) {
        this.c = ahrlVar;
        this.a = ahkjVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahrl ahrlVar = this.c;
        ahkj ahkjVar = this.a;
        int i = this.b;
        synchronized (ahrlVar.b) {
            if ("goldfish".equals(Build.HARDWARE)) {
                return;
            }
            if (!ahrlVar.f) {
                return;
            }
            if (i != ahrlVar.S.get()) {
                return;
            }
            if (ahrlVar.g == ahkjVar) {
                return;
            }
            ahrlVar.g = ahkjVar;
            int i2 = ahkjVar.d;
            if (i2 == 0) {
                i2 = 3;
            }
            ahrlVar.i();
            if (ahrlVar.o()) {
                return;
            }
            Sensor h = ahrlVar.h(i2, 11);
            if (h != null) {
                ahrlVar.F = h;
                Sensor h2 = ahrlVar.h(i2, 2);
                if (h2 != null) {
                    ahrlVar.v = h2;
                } else if (ahrlVar.r) {
                    ahrlVar.p = null;
                    ahrlVar.T = Long.MIN_VALUE;
                }
                if (ahrlVar.r) {
                    Sensor h3 = ahrlVar.h(i2, 15);
                    if (h3 != null) {
                        ahrlVar.u = h3;
                    } else {
                        ahrlVar.p = null;
                        ahrlVar.T = Long.MIN_VALUE;
                    }
                }
                return;
            }
            Sensor h4 = ahrlVar.h(i2, 2);
            Sensor h5 = ahrlVar.h(i2, 1);
            if (h4 != null && h5 != null) {
                ahrlVar.o = h4;
                ahrlVar.w = h5;
                if (ahrlVar.r) {
                    Sensor h6 = ahrlVar.h(0, 4);
                    if (h6 != null) {
                        ahrlVar.t = h6;
                    } else {
                        ahrlVar.p = null;
                        ahrlVar.T = Long.MIN_VALUE;
                    }
                }
                return;
            }
            if (h4 != null || h5 != null) {
                ahrlVar.i();
            }
            if (ahrlVar.r) {
                ahrlVar.p = null;
                ahrlVar.T = Long.MIN_VALUE;
            }
            Sensor h7 = ahrlVar.h(i2, 3);
            if (h7 != null) {
                ahrlVar.m = h7;
                ahrlVar.h = ahrl.e.contains(h7.getVendor());
            }
        }
    }
}
