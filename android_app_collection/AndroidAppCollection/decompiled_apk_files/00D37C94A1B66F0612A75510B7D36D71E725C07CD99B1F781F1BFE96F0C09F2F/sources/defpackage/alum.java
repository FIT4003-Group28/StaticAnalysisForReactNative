package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: alum  reason: default package */
/* loaded from: classes.dex */
public final class alum implements alto {
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    public final Context b;
    public final alry c;
    public final alry d;
    public final Executor e;
    public final altc f;
    public final Set g;
    public final Set h;
    public final AtomicBoolean i;
    private final Handler j;
    private final altm k;
    private final axnm l;
    private final alvj m;
    private final File n;
    private final AtomicReference o;

    public alum(Context context, File file, altm altmVar, axnm axnmVar) {
        if (anlz.a == null) {
            anlz.a = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new pgw(6));
            anlz.a.allowCoreThreadTimeOut(true);
        }
        ThreadPoolExecutor threadPoolExecutor = anlz.a;
        alvj alvjVar = new alvj(context);
        this.j = new Handler(Looper.getMainLooper());
        this.o = new AtomicReference();
        this.g = Collections.synchronizedSet(new HashSet());
        this.h = Collections.synchronizedSet(new HashSet());
        this.i = new AtomicBoolean(false);
        this.b = context;
        this.n = file;
        this.k = altmVar;
        this.l = axnmVar;
        this.e = threadPoolExecutor;
        this.m = alvjVar;
        this.d = new alry();
        this.c = new alry();
        this.f = alth.a;
    }

    public static String d(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    private final altf f() {
        altf a2 = this.k.a();
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
    }

    private final synchronized altz g(alul alulVar) {
        altz c = c();
        altz a2 = alulVar.a(c);
        if (this.o.compareAndSet(c, a2)) {
            return a2;
        }
        return null;
    }

    private final alvd h(final int i) {
        g(new alul() { // from class: aluf
            @Override // defpackage.alul
            public final altz a(altz altzVar) {
                int i2 = i;
                long j = alum.a;
                if (altzVar == null) {
                    return null;
                }
                return altz.a(altzVar.a, 6, i2, altzVar.c, altzVar.d, altzVar.d(), altzVar.c());
            }
        });
        return anqx.i(new altl(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x015c, code lost:
        if (r6.contains(r5) == false) goto L54;
     */
    @Override // defpackage.alto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.alvd a(final defpackage.altv r21) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alum.a(altv):alvd");
    }

    @Override // defpackage.alto
    public final Set b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.k.b());
        hashSet.addAll(this.g);
        return hashSet;
    }

    public final altz c() {
        return (altz) this.o.get();
    }

    public final void e(final int i, final int i2, final Long l, final Long l2, final List list, final Integer num, final List list2) {
        final altz g = g(new alul() { // from class: aluh
            @Override // defpackage.alul
            public final altz a(altz altzVar) {
                long longValue;
                long longValue2;
                Integer num2 = num;
                int i3 = i;
                int i4 = i2;
                Long l3 = l;
                Long l4 = l2;
                List list3 = list;
                List list4 = list2;
                long j = alum.a;
                altz a2 = altzVar == null ? altz.a(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : altzVar;
                int intValue = num2 == null ? a2.a : num2.intValue();
                if (l3 == null) {
                    longValue = a2.c;
                } else {
                    longValue = l3.longValue();
                }
                if (l4 == null) {
                    longValue2 = a2.d;
                } else {
                    longValue2 = l4.longValue();
                }
                return altz.a(intValue, i3, i4, longValue, longValue2, list3 == null ? a2.d() : list3, list4 == null ? a2.c() : list4);
            }
        });
        if (g != null) {
            this.j.post(new Runnable() { // from class: aluj
                @Override // java.lang.Runnable
                public final void run() {
                    alum alumVar = alum.this;
                    altz altzVar = g;
                    alumVar.c.a(altzVar);
                    alumVar.d.a(altzVar);
                }
            });
        }
    }
}
