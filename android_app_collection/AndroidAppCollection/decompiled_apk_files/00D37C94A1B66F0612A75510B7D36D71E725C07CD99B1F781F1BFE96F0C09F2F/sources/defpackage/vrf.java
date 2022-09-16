package defpackage;

import java.nio.ShortBuffer;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vrf  reason: default package */
/* loaded from: classes4.dex */
public final class vrf implements vrb {
    public final vrg a = new vrg();
    public final float b;
    public final long c;
    public boolean d;
    private final vre e;
    private boolean f;

    public vrf(vre vreVar, float f, long j) {
        this.e = vreVar;
        this.b = f;
        this.c = (((float) j) / ((float) TimeUnit.SECONDS.toMicros(1L))) * 7056000.0f;
    }

    @Override // defpackage.vrb
    public final void a() {
        this.d = true;
        this.e.c();
    }

    @Override // defpackage.vrb
    public final void b(ShortBuffer shortBuffer, int i, int i2) {
        if (!this.f) {
            vrg vrgVar = this.a;
            int i3 = vrgVar.a;
            viu.f(i3 == 0, "ticksPerSample already set (%s)", Integer.valueOf(i3));
            viu.c(i > 0, "Invalid samplesPerSec (%s)", Integer.valueOf(i));
            vrgVar.a = 7056000 / i;
            vrg vrgVar2 = this.a;
            int e = vsc.e(i2);
            viu.e(vrgVar2.b == 0, "channelCount already set");
            vrgVar2.b = e;
            this.f = true;
        }
        viu.c(i == this.a.c(), "samplesPerSec changed from %s to %s", Integer.valueOf(this.a.c()), Integer.valueOf(i));
        int i4 = this.a.b;
        viu.c(i2 == i4, "channelCount changed from %s to %s", Integer.valueOf(i4), Integer.valueOf(i2));
        this.a.e(shortBuffer);
        this.e.c();
    }

    public final void c(long j) {
        this.a.f(j);
    }

    public final float d(int i) {
        return this.a.h(i) * this.b;
    }
}
