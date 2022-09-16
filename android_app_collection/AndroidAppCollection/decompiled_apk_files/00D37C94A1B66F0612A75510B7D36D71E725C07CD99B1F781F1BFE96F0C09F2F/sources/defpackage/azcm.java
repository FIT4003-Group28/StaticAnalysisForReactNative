package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azcm  reason: default package */
/* loaded from: classes2.dex */
public final class azcm implements ayot {
    final ayot a;
    final AtomicReference b;
    private final /* synthetic */ int c;

    public azcm(ayot ayotVar, AtomicReference atomicReference) {
        this.a = ayotVar;
        this.b = atomicReference;
    }

    public azcm(AtomicReference atomicReference, ayot ayotVar, int i) {
        this.c = i;
        this.b = atomicReference;
        this.a = ayotVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        int i = this.c;
        if (i == 0) {
            this.a.b(th);
        } else if (i == 1) {
            this.a.b(th);
        } else {
            this.a.b(th);
        }
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        int i = this.c;
        if (i == 0) {
            this.a.sh(obj);
        } else if (i == 1) {
            this.a.sh(obj);
        } else {
            this.a.sh(obj);
        }
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        int i = this.c;
        if (i == 0) {
            ayqi.g(this.b, aypgVar);
        } else if (i == 1) {
            ayqi.i(this.b, aypgVar);
        } else {
            ayqi.i(this.b, aypgVar);
        }
    }
}
