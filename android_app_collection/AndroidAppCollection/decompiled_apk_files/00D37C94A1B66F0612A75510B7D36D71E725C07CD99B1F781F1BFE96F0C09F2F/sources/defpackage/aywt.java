package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aywt  reason: default package */
/* loaded from: classes2.dex */
final class aywt extends ayws {
    private static final long serialVersionUID = -6022804456014692607L;
    final ayre d;

    public aywt(ayre ayreVar, Iterator it) {
        super(it);
        this.d = ayreVar;
    }

    @Override // defpackage.ayws
    public final void b() {
        Iterator it = this.a;
        ayre ayreVar = this.d;
        while (!this.b) {
            try {
                Object next = it.next();
                if (this.b) {
                    return;
                }
                if (next != null) {
                    ayreVar.e(next);
                    if (this.b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.b) {
                                return;
                            }
                            ayreVar.sm();
                            return;
                        }
                    } catch (Throwable th) {
                        bapv.j(th);
                        ayreVar.b(th);
                        return;
                    }
                } else {
                    ayreVar.b(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
            } catch (Throwable th2) {
                bapv.j(th2);
                ayreVar.b(th2);
                return;
            }
        }
    }

    @Override // defpackage.ayws
    public final void f(long j) {
        Iterator it = this.a;
        ayre ayreVar = this.d;
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
                            boolean e = ayreVar.e(next);
                            if (this.b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.b) {
                                        return;
                                    }
                                    ayreVar.sm();
                                    return;
                                } else if (e) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                bapv.j(th);
                                ayreVar.b(th);
                                return;
                            }
                        } else {
                            ayreVar.b(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                    } catch (Throwable th2) {
                        bapv.j(th2);
                        ayreVar.b(th2);
                        return;
                    }
                }
            }
        } while (j != 0);
    }
}
