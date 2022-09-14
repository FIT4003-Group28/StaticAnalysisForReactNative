package a.e;

import java.util.LinkedHashMap;
import java.util.Locale;
/* loaded from: classes.dex */
public class e<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f138a;

    /* renamed from: b  reason: collision with root package name */
    private int f139b;

    /* renamed from: c  reason: collision with root package name */
    private int f140c;

    /* renamed from: d  reason: collision with root package name */
    private int f141d;

    /* renamed from: e  reason: collision with root package name */
    private int f142e;

    /* renamed from: f  reason: collision with root package name */
    private int f143f;

    /* renamed from: g  reason: collision with root package name */
    private int f144g;

    /* renamed from: h  reason: collision with root package name */
    private int f145h;

    public e(int i) {
        if (i > 0) {
            this.f140c = i;
            this.f138a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int c(K k, V v) {
        int b2 = b(k, v);
        if (b2 >= 0) {
            return b2;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    protected V a(K k) {
        return null;
    }

    public final V a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f141d++;
            this.f139b += c(k, v);
            put = this.f138a.put(k, v);
            if (put != null) {
                this.f139b -= c(k, put);
            }
        }
        if (put != null) {
            a(false, k, put, v);
        }
        a(this.f140c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f139b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f138a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f139b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f139b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f138a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f138a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f138a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f139b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.c(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f139b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f143f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f143f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.a(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.e.a(int):void");
    }

    protected void a(boolean z, K k, V v, V v2) {
    }

    protected int b(K k, V v) {
        return 1;
    }

    public final V b(K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                V v = this.f138a.get(k);
                if (v != null) {
                    this.f144g++;
                    return v;
                }
                this.f145h++;
                V a2 = a((e<K, V>) k);
                if (a2 == null) {
                    return null;
                }
                synchronized (this) {
                    this.f142e++;
                    put = this.f138a.put(k, a2);
                    if (put != null) {
                        this.f138a.put(k, put);
                    } else {
                        this.f139b += c(k, a2);
                    }
                }
                if (put != null) {
                    a(false, k, a2, put);
                    return put;
                }
                a(this.f140c);
                return a2;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        int i;
        i = this.f144g + this.f145h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f140c), Integer.valueOf(this.f144g), Integer.valueOf(this.f145h), Integer.valueOf(i != 0 ? (this.f144g * 100) / i : 0));
    }
}
