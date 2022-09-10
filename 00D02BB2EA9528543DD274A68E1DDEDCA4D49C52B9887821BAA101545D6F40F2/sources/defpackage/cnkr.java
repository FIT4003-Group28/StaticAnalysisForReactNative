package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: cnkr  reason: default package */
/* loaded from: classes.dex */
public final class cnkr {
    public static final cnkc a = new cnkf(1);
    public static final Charset b = Charset.forName("UTF-8");
    public static final byte[] c = new byte[0];
    public static final cnkk d = new cnkk();
    public static final cnkk e = new cnkk();
    public static final Comparator f = new cnka();
    public final int g;
    public final ReentrantReadWriteLock h;
    public volatile int i;
    public long j;
    public Map<String, cnkb> k;
    public cnkk l;
    public Integer m;
    public final cnxn n;
    private final String o;
    private final cnjz p;
    private boolean q;
    private TreeMap<cnkk, Integer> r;
    private volatile cnkm s;

    public cnkr(cnjz cnjzVar, String str, int i) {
        this(cnjzVar, str, i, cnxn.a);
    }

    public static long a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(b));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final cnoh<Status> b() {
        this.h.writeLock().lock();
        try {
            cnkr cnkrVar = new cnkr(this);
            this.h.writeLock().unlock();
            int size = cnkrVar.r.size();
            cnjv[] cnjvVarArr = new cnjv[size];
            for (Map.Entry<cnkk, Integer> entry : cnkrVar.r.entrySet()) {
                cnjz cnjzVar = cnkrVar.p;
                byte[] bArr = entry.getKey().a;
                int intValue = entry.getValue().intValue();
                if (bArr == null) {
                    bArr = d.a;
                }
                cnjvVarArr[entry.getValue().intValue()] = cnjzVar.e(new cnkj(cnkrVar, bArr, Integer.valueOf(intValue)));
            }
            cnoh<Status> cnohVar = null;
            for (int i = 0; i < size; i++) {
                cnjv cnjvVar = cnjvVarArr[i];
                cnjvVar.i = cnkrVar.o;
                cnohVar = cnjvVar.a();
            }
            if (cnohVar != null) {
                return cnohVar;
            }
            Status status = Status.a;
            cnwc.n(status, "Result must not be null");
            cnsx cnsxVar = new cnsx(Looper.getMainLooper());
            cnsxVar.p(status);
            return cnsxVar;
        } catch (Throwable th) {
            this.h.writeLock().unlock();
            throw th;
        }
    }

    public final void c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            d(d);
        } else {
            d(new cnkk(bArr));
        }
    }

    public final void d(cnkk cnkkVar) {
        if (cnkkVar == null) {
            cnkkVar = d;
        }
        this.h.writeLock().lock();
        try {
            this.l = cnkkVar;
            this.m = null;
        } finally {
            this.h.writeLock().unlock();
        }
    }

    public final cnkh e(String str) {
        cnkh cnkhVar;
        ReentrantReadWriteLock reentrantReadWriteLock;
        this.h.writeLock().lock();
        try {
            cnkb cnkbVar = this.k.get(str);
            if (cnkbVar == null) {
                this.h.writeLock().lock();
                cnkhVar = new cnkh(this, str);
                this.k.put(str, cnkhVar);
                this.h.writeLock().unlock();
                reentrantReadWriteLock = this.h;
            } else {
                try {
                    cnkhVar = (cnkh) cnkbVar;
                    reentrantReadWriteLock = this.h;
                } catch (ClassCastException unused) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "another type of counter exists with name: ".concat(valueOf) : new String("another type of counter exists with name: "));
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
            return cnkhVar;
        } catch (Throwable th) {
            this.h.writeLock().unlock();
            throw th;
        }
    }

    public final Integer f(cnkk cnkkVar) {
        Integer num = this.r.get(cnkkVar);
        if (num == null) {
            Integer valueOf = Integer.valueOf(this.r.size());
            this.r.put(cnkkVar, valueOf);
            return valueOf;
        }
        return num;
    }

    public final Integer g(cnkk cnkkVar) {
        return this.r.get(cnkkVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.h.readLock().lock();
        try {
            sb.append("{");
            boolean z = true;
            for (Map.Entry<cnkk, Integer> entry : this.r.entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append("(");
                sb.append(entry.getKey());
                sb.append(") => ");
                sb.append(entry.getValue());
                z = false;
            }
            sb.append("}\n");
            for (cnkb cnkbVar : this.k.values()) {
                sb.append(cnkbVar.toString());
                sb.append("\n");
            }
            this.h.readLock().unlock();
            return sb.toString();
        } catch (Throwable th) {
            this.h.readLock().unlock();
            throw th;
        }
    }

    public cnkr(cnjz cnjzVar, String str, int i, cnxn cnxnVar) {
        this.h = new ReentrantReadWriteLock();
        this.k = new TreeMap();
        this.l = d;
        this.r = new TreeMap<>();
        this.m = null;
        this.s = null;
        cnwc.g(true);
        this.p = cnjzVar;
        this.o = str;
        this.g = i;
        this.n = cnxnVar;
        this.j = SystemClock.elapsedRealtime();
    }

    private cnkr(cnkr cnkrVar) {
        this(cnkrVar.p, cnkrVar.o, cnkrVar.g, cnkrVar.n);
        cnkb cnkeVar;
        ReentrantReadWriteLock.WriteLock writeLock = cnkrVar.h.writeLock();
        writeLock.lock();
        try {
            this.l = cnkrVar.l;
            this.m = cnkrVar.m;
            this.j = cnkrVar.j;
            this.k = new TreeMap();
            for (Map.Entry<String, cnkb> entry : cnkrVar.k.entrySet()) {
                Map<String, cnkb> map = this.k;
                String key = entry.getKey();
                cnkb value = entry.getValue();
                if (value instanceof cnkh) {
                    cnkeVar = new cnkh(this, (cnkh) value);
                } else if (value instanceof cnkq) {
                    cnkeVar = new cnkq(this, (cnkq) value);
                } else if (value instanceof cnkl) {
                    cnkeVar = new cnkl(this, (cnkl) value, true);
                } else if (value instanceof cnkn) {
                    cnkeVar = new cnkn(this, (cnkn) value);
                } else if (value instanceof cnke) {
                    cnkeVar = new cnke(this, (cnke) value);
                } else {
                    String valueOf = String.valueOf(value);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                    sb.append("Unknown counter type: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                map.put(key, cnkeVar);
            }
            TreeMap<cnkk, Integer> treeMap = this.r;
            this.r = cnkrVar.r;
            cnkrVar.r = treeMap;
            cnkrVar.m = null;
            cnkrVar.j = SystemClock.elapsedRealtime();
        } finally {
            writeLock.unlock();
        }
    }
}
