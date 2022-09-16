package defpackage;

import java.util.Collections;
import java.util.PriorityQueue;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: pwx  reason: default package */
/* loaded from: classes4.dex */
public final class pwx {
    private final Object a = new Object();
    private final PriorityQueue b = new PriorityQueue(10, Collections.reverseOrder());
    private int c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;

    public final void a(int i) {
        synchronized (this.a) {
            this.b.add(Integer.valueOf(i));
            this.c = Math.max(this.c, i);
        }
    }

    public final void c(int i) {
        int intValue;
        synchronized (this.a) {
            this.b.remove(Integer.valueOf(i));
            if (this.b.isEmpty()) {
                intValue = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            } else {
                int i2 = pxi.a;
                intValue = ((Integer) this.b.peek()).intValue();
            }
            this.c = intValue;
            this.a.notifyAll();
        }
    }

    public final void d() {
        synchronized (this.a) {
            while (this.c != -10) {
                this.a.wait();
            }
        }
    }

    public final void b(int i) {
        synchronized (this.a) {
            int i2 = this.c;
            if (i2 != i) {
                throw new pww(i, i2);
            }
        }
    }
}
