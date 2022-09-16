package defpackage;
/* compiled from: PG */
/* renamed from: azqa  reason: default package */
/* loaded from: classes2.dex */
public final class azqa implements ayoa, bamf {
    final bame a;
    bamf b;
    boolean c;
    azoh d;
    volatile boolean e;

    public azqa(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.e) {
            azqc.d(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.e) {
                if (this.c) {
                    this.e = true;
                    azoh azohVar = this.d;
                    if (azohVar == null) {
                        azohVar = new azoh();
                        this.d = azohVar;
                    }
                    azohVar.c(azoq.b(th));
                    return;
                }
                this.e = true;
                this.c = true;
                z = false;
            }
            if (z) {
                azqc.d(th);
            } else {
                this.a.b(th);
            }
        }
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        azoh azohVar;
        if (this.e) {
            return;
        }
        if (obj == null) {
            this.b.si();
            b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                azoh azohVar2 = this.d;
                if (azohVar2 == null) {
                    azohVar2 = new azoh();
                    this.d = azohVar2;
                }
                azoq azoqVar = azoq.a;
                azohVar2.a(obj);
                return;
            }
            this.c = true;
            this.a.c(obj);
            do {
                synchronized (this) {
                    azohVar = this.d;
                    if (azohVar == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                }
            } while (!azohVar.d(this.a));
        }
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.b, bamfVar)) {
            this.b = bamfVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.b.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                azoh azohVar = this.d;
                if (azohVar == null) {
                    azohVar = new azoh();
                    this.d = azohVar;
                }
                azohVar.a(azoq.a);
                return;
            }
            this.e = true;
            this.c = true;
            this.a.sm();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        this.b.sp(j);
    }
}
