package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azoz  reason: default package */
/* loaded from: classes2.dex */
public final class azoz extends AtomicLong implements bamf, azog {
    private static final long serialVersionUID = 3293175281126227086L;
    final bame a;
    final azpa b;
    boolean c;
    boolean d;
    azoh e;
    boolean f;
    volatile boolean g;
    long h;

    public azoz(bame bameVar, azpa azpaVar) {
        this.a = bameVar;
        this.b = azpaVar;
    }

    @Override // defpackage.azog, defpackage.ayqf
    public final boolean a(Object obj) {
        if (this.g) {
            return true;
        }
        if (azoq.g(obj)) {
            this.a.sm();
            return true;
        } else if (azoq.h(obj)) {
            this.a.b(azoq.d(obj));
            return true;
        } else {
            long j = get();
            if (j != 0) {
                this.a.c(obj);
                if (j == Long.MAX_VALUE) {
                    return false;
                }
                decrementAndGet();
                return false;
            }
            si();
            this.a.b(new aypp("Could not deliver value due to lack of requests"));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Object obj, long j) {
        if (this.g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                if (this.h == j) {
                    return;
                }
                if (this.d) {
                    azoh azohVar = this.e;
                    if (azohVar == null) {
                        azohVar = new azoh();
                        this.e = azohVar;
                    }
                    azohVar.a(obj);
                    return;
                }
                this.c = true;
                this.f = true;
            }
        }
        a(obj);
    }

    @Override // defpackage.bamf
    public final void si() {
        if (!this.g) {
            this.g = true;
            this.b.au(this);
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this, j);
        }
    }
}
