package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: akti  reason: default package */
/* loaded from: classes.dex */
public final class akti extends aksz {
    private boolean a = false;
    private final axnm b;

    public akti(axnm axnmVar) {
        this.b = axnmVar;
    }

    @Override // defpackage.aktk
    public final void d(avff avffVar) {
        avfd avfdVar = avffVar.e;
        if (avfdVar == null) {
            avfdVar = avfd.a;
        }
        boolean z = false;
        if (avfdVar.b && (avfdVar.c || avfdVar.e || avfdVar.f || avfdVar.g || avfdVar.p || avfdVar.n || avfdVar.o || avfdVar.r)) {
            z = true;
        }
        this.a = z;
        if (!z) {
            return;
        }
        utd utdVar = (utd) this.b.get();
        if (avfdVar.f) {
            utdVar.a.c();
        }
        if (!avfdVar.c) {
            return;
        }
        utdVar.a.b();
    }

    @Override // defpackage.aktk
    public final boolean e() {
        return this.a;
    }

    @Override // defpackage.aktk
    public final boolean f(Context context, aopa aopaVar) {
        return false;
    }
}
