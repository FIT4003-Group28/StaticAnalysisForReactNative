package defpackage;

import java.security.SecureRandom;
import java.util.Random;
/* compiled from: PG */
/* renamed from: dbsx  reason: default package */
/* loaded from: classes5.dex */
final class dbsx extends Random {
    private final boolean a = true;

    static final SecureRandom a() {
        return dbsy.c.get();
    }

    @Override // java.util.Random
    protected final int next(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return a().nextBoolean();
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        a().nextBytes(bArr);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return a().nextDouble();
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return a().nextFloat();
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        return a().nextGaussian();
    }

    @Override // java.util.Random
    public final int nextInt() {
        return a().nextInt();
    }

    @Override // java.util.Random
    public final long nextLong() {
        return a().nextLong();
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        return a().nextInt(i);
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.a) {
            throw new UnsupportedOperationException("Setting the seed on a thread-local Random object is not permitted");
        }
        super.setSeed(j);
    }
}
