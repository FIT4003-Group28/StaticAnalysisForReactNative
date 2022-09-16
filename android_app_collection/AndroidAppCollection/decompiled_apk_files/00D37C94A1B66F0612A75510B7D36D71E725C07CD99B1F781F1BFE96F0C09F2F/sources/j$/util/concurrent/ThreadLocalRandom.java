package j$.util.concurrent;

import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes5.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;
    boolean initialized;
    int threadLocalRandomProbe;
    long threadLocalRandomSeed;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};
    private static final ThreadLocal nextLocalGaussian = new ThreadLocal();
    private static final AtomicInteger probeGenerator = new AtomicInteger();
    private static final ThreadLocal instances = new ThreadLocal() { // from class: j$.util.concurrent.ThreadLocalRandom.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue */
        public ThreadLocalRandom mo420initialValue() {
            return new ThreadLocalRandom();
        }
    };
    private static final AtomicLong seeder = new AtomicLong(mix64(System.currentTimeMillis()) ^ mix64(System.nanoTime()));

    private static int mix32(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long mix64(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private ThreadLocalRandom() {
        this.initialized = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void localInit() {
        int addAndGet = probeGenerator.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long mix64 = mix64(seeder.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) instances.get();
        threadLocalRandom.threadLocalRandomSeed = mix64;
        threadLocalRandom.threadLocalRandomProbe = addAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) instances.get();
        if (threadLocalRandom.threadLocalRandomProbe == 0) {
            localInit();
        }
        return threadLocalRandom;
    }

    @Override // java.util.Random
    public void setSeed(long j) {
        if (!this.initialized) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    final long nextSeed() {
        long j = this.threadLocalRandomSeed - 7046029254386353131L;
        this.threadLocalRandomSeed = j;
        return j;
    }

    @Override // java.util.Random
    protected int next(int i) {
        return nextInt() >>> (32 - i);
    }

    final int internalNextInt(int i, int i2) {
        int i3;
        int mix32 = mix32(nextSeed());
        if (i < i2) {
            int i4 = i2 - i;
            int i5 = i4 - 1;
            if ((i4 & i5) == 0) {
                i3 = mix32 & i5;
            } else if (i4 > 0) {
                int i6 = mix32 >>> 1;
                while (true) {
                    int i7 = i6 + i5;
                    i3 = i6 % i4;
                    if (i7 - i3 >= 0) {
                        break;
                    }
                    i6 = mix32(nextSeed()) >>> 1;
                }
            } else {
                while (true) {
                    if (mix32 >= i && mix32 < i2) {
                        return mix32;
                    }
                    mix32 = mix32(nextSeed());
                }
            }
            return i3 + i;
        }
        return mix32;
    }

    @Override // java.util.Random
    public int nextInt() {
        return mix32(nextSeed());
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int mix32 = mix32(nextSeed());
        int i2 = i - 1;
        if ((i & i2) == 0) {
            return mix32 & i2;
        }
        while (true) {
            int i3 = mix32 >>> 1;
            int i4 = i3 + i2;
            int i5 = i3 % i;
            if (i4 - i5 >= 0) {
                return i5;
            }
            mix32 = mix32(nextSeed());
        }
    }

    public int nextInt(int i, int i2) {
        if (i >= i2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return internalNextInt(i, i2);
    }

    @Override // java.util.Random
    public long nextLong() {
        return mix64(nextSeed());
    }

    @Override // java.util.Random
    public double nextDouble() {
        double mix64 = mix64(nextSeed()) >>> 11;
        Double.isNaN(mix64);
        return mix64 * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return mix32(nextSeed()) < 0;
    }

    @Override // java.util.Random
    public float nextFloat() {
        return (mix32(nextSeed()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public double nextGaussian() {
        ThreadLocal threadLocal = nextLocalGaussian;
        Double d = (Double) threadLocal.get();
        if (d != null) {
            threadLocal.set(null);
            return d.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d2 = (nextDouble * nextDouble) + (nextDouble2 * nextDouble2);
            if (d2 < 1.0d && d2 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d2) * (-2.0d)) / d2);
                nextLocalGaussian.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int getProbe() {
        return ((ThreadLocalRandom) instances.get()).threadLocalRandomProbe;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int advanceProbe(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((ThreadLocalRandom) instances.get()).threadLocalRandomProbe = i4;
        return i4;
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: j$.util.concurrent.ThreadLocalRandom.2
            @Override // java.security.PrivilegedAction
            /* renamed from: run */
            public Boolean mo421run() {
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
            }
        })).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = seed[0] & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (seed[i] & 255);
            }
            seeder.set(j);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.threadLocalRandomSeed);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}
