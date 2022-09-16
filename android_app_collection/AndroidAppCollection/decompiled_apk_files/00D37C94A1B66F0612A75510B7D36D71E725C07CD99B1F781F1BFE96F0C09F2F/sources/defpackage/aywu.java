package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aywu  reason: default package */
/* loaded from: classes2.dex */
final class aywu extends ayws {
    private static final long serialVersionUID = -6022804456014692607L;
    final bame d;

    public aywu(bame bameVar, Iterator it) {
        super(it);
        this.d = bameVar;
    }

    @Override // defpackage.ayws
    public final void b() {
        Iterator it = this.a;
        bame bameVar = this.d;
        while (!this.b) {
            try {
                Object next = it.next();
                if (this.b) {
                    return;
                }
                if (next != null) {
                    bameVar.c(next);
                    if (this.b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.b) {
                                return;
                            }
                            bameVar.sm();
                            return;
                        }
                    } catch (Throwable th) {
                        bapv.j(th);
                        bameVar.b(th);
                        return;
                    }
                } else {
                    bameVar.b(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
            } catch (Throwable th2) {
                bapv.j(th2);
                bameVar.b(th2);
                return;
            }
        }
    }

    @Override // defpackage.ayws
    public final void f(long j) {
        Iterator it = this.a;
        bame bameVar = this.d;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    j = get();
                    if (j2 == j) {
                        j = addAndGet(-j2);
                    }
                } else if (this.b) {
                    return;
                } else {
                    try {
                        Object next = it.next();
                        if (this.b) {
                            return;
                        }
                        if (next != null) {
                            bameVar.c(next);
                            if (this.b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.b) {
                                        return;
                                    }
                                    bameVar.sm();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                bapv.j(th);
                                bameVar.b(th);
                                return;
                            }
                        } else {
                            bameVar.b(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                    } catch (Throwable th2) {
                        bapv.j(th2);
                        bameVar.b(th2);
                        return;
                    }
                }
            }
        } while (j != 0);
    }
}
