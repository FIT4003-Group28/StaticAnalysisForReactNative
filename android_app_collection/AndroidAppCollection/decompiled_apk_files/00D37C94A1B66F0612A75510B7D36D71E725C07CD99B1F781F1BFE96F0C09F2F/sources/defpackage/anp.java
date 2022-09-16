package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: anp  reason: default package */
/* loaded from: classes.dex */
public final class anp {
    private static final Object k = new Object();
    private static volatile anp l;
    public final ReadWriteLock a;
    public final Set b;
    public int c;
    public final Handler d;
    public final anj e;
    final ann f;
    public final boolean g;
    final boolean h;
    final int[] i;
    public final anl j;

    private anp(ank ankVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        this.g = ankVar.b;
        this.h = ankVar.c;
        this.i = ankVar.d;
        this.f = ankVar.a;
        this.j = ankVar.f;
        this.d = new Handler(Looper.getMainLooper());
        afy afyVar = new afy();
        this.b = afyVar;
        Set set = ankVar.e;
        if (set != null && !set.isEmpty()) {
            afyVar.addAll(ankVar.e);
        }
        ani aniVar = new ani(this);
        this.e = aniVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.c = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (a() != 0) {
                return;
            }
            try {
                ani aniVar2 = aniVar;
                ano anoVar = new ano(aniVar);
                ani aniVar3 = aniVar;
                ann annVar = aniVar.c.f;
                synchronized (((any) annVar).a) {
                    if (((any) annVar).b == null) {
                        ((any) annVar).c = new HandlerThread("emojiCompat", 10);
                        ((any) annVar).c.start();
                        ((any) annVar).b = new Handler(((any) annVar).c.getLooper());
                    }
                    ((any) annVar).b.post(new anv((any) annVar, anoVar));
                }
            } catch (Throwable unused) {
                aniVar.c.h();
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public static anp b() {
        anp anpVar;
        synchronized (k) {
            hz.d(l != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            anpVar = l;
        }
        return anpVar;
    }

    public static void f(ank ankVar) {
        if (l == null) {
            synchronized (k) {
                if (l == null) {
                    l = new anp(ankVar);
                }
            }
        }
    }

    public final int a() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        return d(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public final CharSequence d(CharSequence charSequence, int i, int i2) {
        return g(charSequence, i, i2, Integer.MAX_VALUE);
    }

    public final boolean e() {
        return a() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0166, code lost:
        ((defpackage.aoq) r17).b();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[Catch: all -> 0x016e, TryCatch #0 {all -> 0x016e, blocks: (B:25:0x006b, B:28:0x0070, B:30:0x0074, B:32:0x0083, B:35:0x008e, B:37:0x0098, B:41:0x009e, B:43:0x00aa, B:44:0x00ad, B:46:0x00ba, B:52:0x00c9, B:53:0x00d7, B:56:0x00f0, B:61:0x00fc, B:64:0x0108, B:65:0x010d, B:67:0x0118, B:69:0x011f, B:70:0x0124, B:72:0x012f, B:74:0x0136, B:78:0x0140, B:81:0x014c, B:82:0x0151, B:33:0x0089), top: B:97:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014c A[Catch: all -> 0x016e, TryCatch #0 {all -> 0x016e, blocks: (B:25:0x006b, B:28:0x0070, B:30:0x0074, B:32:0x0083, B:35:0x008e, B:37:0x0098, B:41:0x009e, B:43:0x00aa, B:44:0x00ad, B:46:0x00ba, B:52:0x00c9, B:53:0x00d7, B:56:0x00f0, B:61:0x00fc, B:64:0x0108, B:65:0x010d, B:67:0x0118, B:69:0x011f, B:70:0x0124, B:72:0x012f, B:74:0x0136, B:78:0x0140, B:81:0x014c, B:82:0x0151, B:33:0x0089), top: B:97:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d  */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence g(java.lang.CharSequence r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anp.g(java.lang.CharSequence, int, int, int):java.lang.CharSequence");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new anm(arrayList, this.c));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(hz hzVar) {
        hz.h(hzVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            int i = this.c;
            if (i != 1 && i != 2) {
                this.b.add(hzVar);
            }
            Handler handler = this.d;
            hz.h(hzVar, "initCallback cannot be null");
            handler.post(new anm(Arrays.asList(hzVar), i));
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
