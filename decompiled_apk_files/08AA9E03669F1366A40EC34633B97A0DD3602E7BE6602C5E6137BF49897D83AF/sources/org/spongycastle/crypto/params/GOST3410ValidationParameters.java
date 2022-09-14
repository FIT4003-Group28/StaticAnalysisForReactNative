package org.spongycastle.crypto.params;
/* loaded from: classes.dex */
public class GOST3410ValidationParameters {

    /* renamed from: c  reason: collision with root package name */
    private int f5665c;
    private long cL;
    private int x0;
    private long x0L;

    public GOST3410ValidationParameters(int i, int i2) {
        this.x0 = i;
        this.f5665c = i2;
    }

    public GOST3410ValidationParameters(long j, long j2) {
        this.x0L = j;
        this.cL = j2;
    }

    public int getC() {
        return this.f5665c;
    }

    public int getX0() {
        return this.x0;
    }

    public long getCL() {
        return this.cL;
    }

    public long getX0L() {
        return this.x0L;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f5665c == this.f5665c && gOST3410ValidationParameters.x0 == this.x0 && gOST3410ValidationParameters.cL == this.cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int hashCode() {
        return ((((this.x0 ^ this.f5665c) ^ ((int) this.x0L)) ^ ((int) (this.x0L >> 32))) ^ ((int) this.cL)) ^ ((int) (this.cL >> 32));
    }
}
