package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aexx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aexx implements Callable {
    public final /* synthetic */ aeyc a;
    private final /* synthetic */ int b;

    public /* synthetic */ aexx(aeyc aeycVar, int i) {
        this.b = i;
        this.a = aeycVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.b != 0) {
            aeyc aeycVar = this.a;
            if (aeycVar.g == null) {
                return false;
            }
            aeycVar.e.c(-1L);
            aeya aeyaVar = aeycVar.g;
            if (aeyaVar.c == null) {
                if (!aeycVar.h || aeycVar.f.contains(aeyaVar)) {
                    aeycVar.y(aeycVar.g);
                } else {
                    aeycVar.d.g(new afkn("player.exception", aeycVar.e.b, "c.clearNextMediaSource"));
                }
                aeycVar.f.remove(aeycVar.g);
            } else {
                aeyaVar.d = true;
            }
            aeycVar.g = null;
            return true;
        }
        aeyc aeycVar2 = this.a;
        if (aeycVar2.g == null) {
            return false;
        }
        aeya aeyaVar2 = aeycVar2.e;
        if (aeyaVar2.c == null) {
            if (!aeycVar2.h || aeycVar2.f.contains(aeyaVar2)) {
                aeycVar2.y(aeycVar2.e);
            } else {
                aeycVar2.d.g(new afkn("player.exception", aeycVar2.e.f, "c.doPostTransitionCleanup"));
            }
            aeycVar2.f.remove(aeycVar2.e);
        } else {
            aeyaVar2.d = true;
        }
        aeycVar2.e = aeycVar2.g;
        aeycVar2.g = null;
        aeycVar2.e.b(0L);
        return true;
    }
}
