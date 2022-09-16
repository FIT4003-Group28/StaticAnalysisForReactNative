package defpackage;

import android.os.Looper;
import android.util.Pair;
/* compiled from: PG */
/* renamed from: svw  reason: default package */
/* loaded from: classes4.dex */
final class svw extends azow {
    public final suv a;
    public final Object b = new Object();
    public volatile cyr c;
    public volatile boolean d;

    public svw(suv suvVar) {
        this.a = suvVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        throw azom.b(th);
    }

    @Override // defpackage.ayom
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Pair pair = (Pair) obj;
        if (!e()) {
            synchronized (this.b) {
                this.c = (cyr) pair.first;
                if (this.d && !e()) {
                    cyv cyvVar = (cyv) pair.second;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        int i = suf.A;
                        if (cyvVar.f != null) {
                            cyvVar.h(new ddk(0, new Object[0]), "updateState:ComponentType.triggerStateUpdate");
                        }
                    } else {
                        int i2 = suf.A;
                        if (cyvVar.f != null) {
                            cyvVar.g(new ddk(0, new Object[0]), "updateState:ComponentType.triggerStateUpdate");
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
    }
}
