package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahwi  reason: default package */
/* loaded from: classes.dex */
public final class ahwi implements ahvz {
    public final Executor a;
    public final bame b;
    public final aizl c;
    public ajbj d;
    public ajbg e;
    public ajbg f;
    public ajbg g;
    public ajfj h;
    public boolean i = false;
    private final bame j;

    public ahwi(aynx aynxVar, aynx aynxVar2, Executor executor, bame bameVar, bame bameVar2, aizl aizlVar) {
        aynxVar.aa(new ahwa(this, 1), ahqs.h);
        aynxVar2.aa(new ahwa(this), ahqs.h);
        this.a = executor;
        this.b = bameVar;
        this.j = bameVar2;
        this.c = aizlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(int i) {
        c();
        this.i = false;
        this.b.c(ahvy.b(i));
    }

    @Override // defpackage.ahvz
    public final void a() {
        if (this.i) {
            c();
            this.i = false;
            this.b.c(ahvy.b(2));
        }
    }

    @Override // defpackage.ahvz
    public final void b(final long j, long j2) {
        this.d.getClass();
        if (!this.i) {
            this.a.execute(new Runnable() { // from class: ahwb
                @Override // java.lang.Runnable
                public final void run() {
                    ahwi ahwiVar = ahwi.this;
                    ahwiVar.c.V(j);
                    ahwiVar.c.b();
                }
            });
            this.i = true;
        }
        c();
        ahwd ahwdVar = new ahwd(this, j - 1, j);
        this.e = ahwdVar;
        this.d.c(ahwdVar);
        ahwf ahwfVar = new ahwf(this, j2, j);
        this.f = ahwfVar;
        this.d.c(ahwfVar);
        ahwh ahwhVar = new ahwh(this, j);
        this.g = ahwhVar;
        this.d.c(ahwhVar);
        this.j.c(ahwj.c(j, j2));
    }

    public final void c() {
        ajbj ajbjVar = this.d;
        if (ajbjVar != null) {
            ajbjVar.i(this.e);
            this.d.i(this.f);
            this.d.i(this.g);
        }
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final void d(long j) {
        if (j < this.h.g) {
            f(1);
        } else {
            this.c.V(j);
        }
    }
}
