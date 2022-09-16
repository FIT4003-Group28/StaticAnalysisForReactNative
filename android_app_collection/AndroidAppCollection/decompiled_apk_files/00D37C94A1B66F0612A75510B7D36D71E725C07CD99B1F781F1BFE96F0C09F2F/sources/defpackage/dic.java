package defpackage;
/* compiled from: PG */
/* renamed from: dic  reason: default package */
/* loaded from: classes3.dex */
public final class dic {
    public final int a;
    public final int b;
    public final dif c;
    public int d;
    public int e;
    public final dnt f;

    @Deprecated
    public dic() {
        int i = dib.g;
        throw null;
    }

    @Deprecated
    public dic(int i, int i2, dif difVar, dnt dntVar, byte[] bArr, byte[] bArr2) {
        this.d = Integer.MAX_VALUE;
        this.e = 1;
        if (i != 1 || i2 == Integer.MIN_VALUE || i2 == -1) {
            this.a = i;
            this.b = i2;
            this.c = difVar == null ? dib.a : difVar;
            this.f = dntVar == null ? dib.e : dntVar;
            return;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }
}
