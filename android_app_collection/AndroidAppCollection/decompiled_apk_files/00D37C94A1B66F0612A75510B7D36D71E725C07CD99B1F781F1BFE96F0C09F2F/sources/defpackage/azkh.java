package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azkh  reason: default package */
/* loaded from: classes2.dex */
public final class azkh extends azkf {
    private static final long serialVersionUID = 1075119423897941642L;
    final ayre k;

    public azkh(ayre ayreVar, int i, azmk azmkVar, ayoq ayoqVar) {
        super(i, azmkVar, ayoqVar);
        this.k = ayreVar;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.e, bamfVar)) {
            this.e = bamfVar;
            this.k.f(this);
            bamfVar.sp(this.a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        int i = this.j;
        azmk azmkVar = this.c;
        ayre ayreVar = this.k;
        int i2 = this.b;
        int i3 = 1;
        while (true) {
            long j = this.h.get();
            long j2 = 0;
            while (j2 != j) {
                if (this.i) {
                    azmkVar.d();
                    return;
                }
                boolean z = this.f;
                if (!z || (th = this.g) == null) {
                    Object sl = azmkVar.sl();
                    if (!z) {
                        if (sl == null) {
                            break;
                        }
                    } else if (sl == null) {
                        ayreVar.sm();
                        this.d.qr();
                        return;
                    }
                    if (ayreVar.e(sl)) {
                        j2++;
                    }
                    i++;
                    if (i == i2) {
                        this.e.sp(i);
                        i = 0;
                    }
                } else {
                    azmkVar.d();
                    ayreVar.b(th);
                    this.d.qr();
                    return;
                }
            }
            if (j2 == j) {
                if (this.i) {
                    azmkVar.d();
                    return;
                } else if (this.f) {
                    Throwable th2 = this.g;
                    if (th2 == null) {
                        if (azmkVar.j()) {
                            ayreVar.sm();
                            this.d.qr();
                            return;
                        }
                    } else {
                        azmkVar.d();
                        ayreVar.b(th2);
                        this.d.qr();
                        return;
                    }
                }
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                this.h.addAndGet(-j2);
            }
            int i4 = get();
            if (i4 == i3) {
                this.j = i;
                i3 = addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            } else {
                i3 = i4;
            }
        }
    }
}
