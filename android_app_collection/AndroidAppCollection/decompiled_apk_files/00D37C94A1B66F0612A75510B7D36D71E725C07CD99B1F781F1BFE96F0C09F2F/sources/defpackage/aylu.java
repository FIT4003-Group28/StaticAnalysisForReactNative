package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: aylu  reason: default package */
/* loaded from: classes2.dex */
public final class aylu {
    final int a;
    final int b;
    final int c;
    final AtomicInteger d;

    public aylu(float f, float f2) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.d = atomicInteger;
        this.c = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.a = i;
        this.b = i / 2;
        atomicInteger.set(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.d.get() > this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        int i;
        int i2;
        do {
            i = this.d.get();
            if (i == 0) {
                return false;
            }
            i2 = i - 1000;
        } while (!this.d.compareAndSet(i, Math.max(i2, 0)));
        return i2 > this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aylu)) {
            return false;
        }
        aylu ayluVar = (aylu) obj;
        return this.a == ayluVar.a && this.c == ayluVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }
}
