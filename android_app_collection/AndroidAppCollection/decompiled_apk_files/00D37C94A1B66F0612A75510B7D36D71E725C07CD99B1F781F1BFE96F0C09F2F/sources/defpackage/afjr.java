package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: afjr  reason: default package */
/* loaded from: classes.dex */
public final class afjr implements Runnable {
    final /* synthetic */ afjs a;
    private final /* synthetic */ int b;

    public afjr(afjs afjsVar) {
        this.a = afjsVar;
    }

    public afjr(afjs afjsVar, int i) {
        this.b = i;
        this.a = afjsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            afjs afjsVar = this.a;
            afjsVar.d.unregisterListener(afjsVar);
            Looper.myLooper().quit();
            return;
        }
        Looper.prepare();
        this.a.g = new Handler();
        afjs afjsVar2 = this.a;
        if (!afjsVar2.d.registerListener(afjsVar2, afjsVar2.e, afjs.b, this.a.g)) {
            this.a.e = null;
        }
        Looper.loop();
    }
}
