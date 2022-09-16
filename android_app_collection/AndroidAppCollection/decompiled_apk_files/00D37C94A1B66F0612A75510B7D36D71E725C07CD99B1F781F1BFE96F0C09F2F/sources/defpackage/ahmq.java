package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: ahmq  reason: default package */
/* loaded from: classes.dex */
public final class ahmq {
    public final Handler a;
    public final afio b;
    public final ahmp c;
    public float d;
    public float e;
    public final boolean f;

    public ahmq(afio afioVar, afiy afiyVar, boolean z) {
        this.b = afioVar;
        this.f = z;
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = handler;
        if (z) {
            this.c = new ahmp(handler, afiyVar);
        } else {
            this.c = null;
        }
    }

    public final void a() {
        if (this.f) {
            ahmp ahmpVar = this.c;
            Handler handler = ahmpVar.a;
            if (handler != null) {
                handler.removeCallbacks(ahmpVar.h);
            }
            ahmpVar.i = true;
            ahmpVar.c(0L);
        }
    }
}
