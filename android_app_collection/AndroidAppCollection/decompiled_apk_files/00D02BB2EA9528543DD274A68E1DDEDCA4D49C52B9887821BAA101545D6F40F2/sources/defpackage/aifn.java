package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: aifn  reason: default package */
/* loaded from: classes2.dex */
abstract class aifn {
    public final long a;
    public final TimeInterpolator b;
    public long c = 0;

    public aifn(long j, TimeInterpolator timeInterpolator) {
        this.a = j;
        this.b = timeInterpolator;
    }

    public abstract void a(aifp aifpVar, aifq aifqVar, aifq aifqVar2, float f);

    public final boolean b() {
        return this.c != 0;
    }

    public final void c(long j) {
        if (b()) {
            return;
        }
        this.c = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(long j) {
        long j2 = this.c;
        if (j2 != 0) {
            long j3 = this.a;
            if (j3 == 0 || j - j2 > j3) {
                return true;
            }
        }
        return false;
    }
}
