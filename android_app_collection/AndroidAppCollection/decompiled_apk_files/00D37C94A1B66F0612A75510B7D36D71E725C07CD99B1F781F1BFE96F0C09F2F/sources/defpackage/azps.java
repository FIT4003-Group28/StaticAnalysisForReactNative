package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azps  reason: default package */
/* loaded from: classes2.dex */
final class azps extends AtomicReference {
    private static final long serialVersionUID = -733876083048047795L;
    final List a;
    volatile boolean b;
    volatile int c;

    public azps() {
        ayrd.c(16, "capacityHint");
        this.a = new ArrayList(16);
    }

    public final void a(Object obj) {
        this.a.add(obj);
        this.c++;
        this.b = true;
    }

    public final void b(azpr azprVar) {
        int i;
        if (azprVar.getAndIncrement() != 0) {
            return;
        }
        List list = this.a;
        ayom ayomVar = azprVar.a;
        Object obj = azprVar.c;
        int i2 = 0;
        if (obj != null) {
            i2 = ((Integer) obj).intValue();
        } else {
            azprVar.c = 0;
        }
        int i3 = 1;
        while (!azprVar.d) {
            int i4 = this.c;
            while (i4 != i2) {
                if (!azprVar.d) {
                    Object obj2 = list.get(i2);
                    if (!this.b || (i = i2 + 1) != i4 || i != (i4 = this.c)) {
                        ayomVar.c(obj2);
                        i2++;
                    } else {
                        if (azoq.g(obj2)) {
                            ayomVar.sm();
                        } else {
                            ayomVar.b(azoq.d(obj2));
                        }
                        azprVar.c = null;
                        azprVar.d = true;
                        return;
                    }
                } else {
                    azprVar.c = null;
                    return;
                }
            }
            if (i2 == this.c) {
                azprVar.c = Integer.valueOf(i2);
                i3 = azprVar.addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            }
        }
        azprVar.c = null;
    }
}
