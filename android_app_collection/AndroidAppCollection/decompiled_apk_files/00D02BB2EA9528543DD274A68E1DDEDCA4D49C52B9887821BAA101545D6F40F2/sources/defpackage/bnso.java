package defpackage;
/* compiled from: PG */
/* renamed from: bnso  reason: default package */
/* loaded from: classes.dex */
public final class bnso {
    public long a;
    public long b;

    public bnso(boolean z) {
        if (z) {
            this.a = -2L;
            this.b = -1L;
            return;
        }
        this.a = -1L;
        this.b = -2L;
    }

    public final float a(long j) {
        long j2 = this.a;
        return Math.max(Math.min(1.0f, ((float) (j - j2)) / ((float) (this.b - j2))), 0.0f);
    }

    public final boolean b(long j) {
        return j >= this.a && j >= this.b;
    }
}
