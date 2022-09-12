package defpackage;
/* compiled from: PG */
/* renamed from: cllv  reason: default package */
/* loaded from: classes5.dex */
public final class cllv {
    public final cmkk a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public int g;
    public boolean h;

    public cllv() {
        cmkk cmkkVar = new cmkk();
        b(2500, 0, "bufferForPlaybackMs", "0");
        b(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        b(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        b(50000, 50000, "maxBufferMs", "minBufferMs");
        b(0, 0, "backBufferDurationMs", "0");
        this.a = cmkkVar;
        this.b = cllt.b(50000L);
        this.c = cllt.b(50000L);
        this.d = cllt.b(2500L);
        this.e = cllt.b(5000L);
        this.g = 13107200;
        this.f = cllt.b(0L);
    }

    private static void b(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        cmmn.b(z, sb.toString());
    }

    public final void a(boolean z) {
        this.g = 13107200;
        this.h = false;
        if (z) {
            this.a.a();
        }
    }
}
