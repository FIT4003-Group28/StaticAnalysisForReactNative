package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: hfa  reason: default package */
/* loaded from: classes3.dex */
public final class hfa extends phm {
    private static final long b = TimeUnit.SECONDS.toMicros(1);
    public boolean a = true;
    private final long c;

    public hfa(hkl hklVar) {
        this.c = TimeUnit.MILLISECONDS.toMicros(hklVar.a()) + b;
    }

    @Override // defpackage.phm, defpackage.piv
    public final long a() {
        return this.c;
    }

    @Override // defpackage.phm, defpackage.piv
    public final boolean b(long j, long j2, float f) {
        return j2 <= this.c;
    }

    @Override // defpackage.phm, defpackage.piv
    public final boolean c(long j, float f, boolean z, long j2) {
        if (this.a) {
            return j >= this.c;
        }
        return super.c(j, f, z, j2);
    }
}
