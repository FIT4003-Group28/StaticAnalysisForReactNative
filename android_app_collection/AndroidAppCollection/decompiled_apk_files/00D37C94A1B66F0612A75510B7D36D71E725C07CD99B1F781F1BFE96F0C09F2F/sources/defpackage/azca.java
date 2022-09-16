package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azca  reason: default package */
/* loaded from: classes2.dex */
public final class azca implements ayod {
    final ayod a;
    final AtomicReference b;
    private final /* synthetic */ int c;

    public azca(ayod ayodVar, AtomicReference atomicReference) {
        this.a = ayodVar;
        this.b = atomicReference;
    }

    public azca(ayod ayodVar, AtomicReference atomicReference, int i) {
        this.c = i;
        this.a = ayodVar;
        this.b = atomicReference;
    }

    public azca(AtomicReference atomicReference, ayod ayodVar, int i) {
        this.c = i;
        this.b = atomicReference;
        this.a = ayodVar;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        int i = this.c;
        if (i == 0) {
            this.a.b(th);
        } else if (i == 1) {
            this.a.b(th);
        } else if (i == 2) {
            this.a.b(th);
        } else {
            this.a.b(th);
        }
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        int i = this.c;
        if (i == 0) {
            this.a.sh(obj);
        } else if (i == 1) {
            this.a.sh(obj);
        } else if (i == 2) {
            this.a.sh(obj);
        } else {
            this.a.sh(obj);
        }
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        int i = this.c;
        if (i == 0) {
            ayqi.g(this.b, aypgVar);
        } else if (i == 1) {
            ayqi.i(this.b, aypgVar);
        } else if (i == 2) {
            ayqi.g(this.b, aypgVar);
        } else {
            ayqi.i(this.b, aypgVar);
        }
    }

    @Override // defpackage.ayod
    public final void sm() {
        int i = this.c;
        if (i == 0) {
            this.a.sm();
        } else if (i == 1) {
            this.a.sm();
        } else if (i == 2) {
            this.a.sm();
        } else {
            this.a.sm();
        }
    }
}
