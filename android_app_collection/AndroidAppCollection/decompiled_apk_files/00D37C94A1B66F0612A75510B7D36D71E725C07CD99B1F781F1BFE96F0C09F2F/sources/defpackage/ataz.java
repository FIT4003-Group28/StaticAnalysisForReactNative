package defpackage;
/* compiled from: PG */
/* renamed from: ataz  reason: default package */
/* loaded from: classes2.dex */
public enum ataz implements aopm {
    MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN(0),
    MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_NORMAL(1),
    MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_LOW(2),
    MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_ULTRA_LOW(3);
    
    private final int f;

    ataz(int i) {
        this.f = i;
    }

    public static aopo a() {
        return atck.b;
    }

    public static ataz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_NORMAL;
            }
            if (i == 2) {
                return MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_LOW;
            }
            if (i == 3) {
                return MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_ULTRA_LOW;
            }
            return null;
        }
        return MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
