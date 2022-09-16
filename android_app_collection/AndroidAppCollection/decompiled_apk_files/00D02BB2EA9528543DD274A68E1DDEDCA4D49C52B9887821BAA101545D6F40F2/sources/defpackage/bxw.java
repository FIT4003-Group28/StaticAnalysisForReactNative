package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bxw  reason: default package */
/* loaded from: classes.dex */
public class bxw implements bxn {
    private static final Bitmap.Config c = Bitmap.Config.ARGB_8888;
    public int a;
    public int b;
    private final bxx d;
    private final Set<Bitmap.Config> e;
    private final long f;
    private long g;
    private int h;
    private int i;

    public bxw(long j) {
        byc bycVar = new byc();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f = j;
        this.d = bycVar;
        this.e = unmodifiableSet;
    }

    private static Bitmap f(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = c;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private final synchronized void h(long j) {
        while (this.g > j) {
            bxx bxxVar = this.d;
            Bitmap c2 = ((byc) bxxVar).g.c();
            if (c2 != null) {
                ((byc) bxxVar).a(Integer.valueOf(cjp.a(c2)), c2);
            }
            if (c2 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    int i = this.a;
                    int i2 = this.b;
                    int i3 = this.h;
                    int i4 = this.i;
                    long j2 = this.g;
                    long j3 = this.f;
                    String valueOf = String.valueOf(this.d);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 151);
                    sb.append("Hits=");
                    sb.append(i);
                    sb.append(", misses=");
                    sb.append(i2);
                    sb.append(", puts=");
                    sb.append(i3);
                    sb.append(", evictions=");
                    sb.append(i4);
                    sb.append(", currentSize=");
                    sb.append(j2);
                    sb.append(", maxSize=");
                    sb.append(j3);
                    sb.append("\nStrategy=");
                    sb.append(valueOf);
                    sb.toString();
                }
                this.g = 0L;
                return;
            }
            this.g -= cjp.a(c2);
            this.i++;
            c2.recycle();
        }
    }

    @Override // defpackage.bxn
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap g = g(i, i2, config);
        if (g != null) {
            g.eraseColor(0);
            return g;
        }
        return f(i, i2, config);
    }

    @Override // defpackage.bxn
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        Bitmap g = g(i, i2, config);
        return g == null ? f(i, i2, config) : g;
    }

    @Override // defpackage.bxn
    public final void d() {
        h(0L);
    }

    @Override // defpackage.bxn
    public final void e(int i) {
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            d();
        } else if (i < 20 && i != 15) {
        } else {
            h(this.f / 2);
        }
    }

    @Override // defpackage.bxn
    public synchronized void a(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && cjp.a(bitmap) <= this.f && this.e.contains(bitmap.getConfig())) {
                int a = cjp.a(bitmap);
                bxx bxxVar = this.d;
                bya d = ((byc) bxxVar).f.d(cjp.a(bitmap), bitmap.getConfig());
                ((byc) bxxVar).g.a(d, bitmap);
                NavigableMap<Integer, Integer> b = ((byc) bxxVar).b(bitmap.getConfig());
                Integer num = (Integer) b.get(Integer.valueOf(d.a));
                b.put(Integer.valueOf(d.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                this.h++;
                this.g += a;
                h(this.f);
                return;
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized Bitmap g(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        Bitmap b;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            String valueOf = String.valueOf(config);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 176);
            sb.append("Cannot create a mutable Bitmap with config: ");
            sb.append(valueOf);
            sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb.toString());
        }
        bxx bxxVar = this.d;
        if (config == null) {
            config = c;
        }
        int i3 = i * i2;
        int i4 = cjo.a[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
        int i5 = i3 * (i4 != 1 ? (i4 == 2 || i4 == 3) ? 2 : i4 != 4 ? 4 : 8 : 1);
        bya d = ((byc) bxxVar).f.d(i5, config);
        int i6 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i7 = bxz.a[config.ordinal()];
            configArr = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? new Bitmap.Config[]{config} : byc.e : byc.d : byc.c : byc.a;
        } else {
            configArr = byc.b;
        }
        int length = configArr.length;
        while (true) {
            if (i6 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i6];
            Integer ceilingKey = ((byc) bxxVar).b(config2).ceilingKey(Integer.valueOf(i5));
            if (ceilingKey == null || ceilingKey.intValue() > i5 * 8) {
                i6++;
            } else {
                if (ceilingKey.intValue() == i5) {
                    if (config2 == null) {
                        if (config != null) {
                        }
                    } else if (config2.equals(config)) {
                    }
                }
                ((byc) bxxVar).f.b(d);
                d = ((byc) bxxVar).f.d(ceilingKey.intValue(), config2);
            }
        }
        b = ((byc) bxxVar).g.b(d);
        if (b != null) {
            ((byc) bxxVar).a(Integer.valueOf(d.a), b);
            b.reconfigure(i, i2, config);
        }
        if (b == null) {
            this.b++;
        } else {
            this.a++;
            this.g -= cjp.a(b);
            b.setHasAlpha(true);
            b.setPremultiplied(true);
        }
        return b;
    }
}
