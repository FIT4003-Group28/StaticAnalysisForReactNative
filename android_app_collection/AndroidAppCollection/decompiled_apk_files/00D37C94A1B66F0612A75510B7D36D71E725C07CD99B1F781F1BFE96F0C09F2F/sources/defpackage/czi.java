package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: czi  reason: default package */
/* loaded from: classes3.dex */
public final class czi {
    public final cyv a;
    public final cyr b;
    public final int c;
    public final int d;
    public final boolean e;
    public volatile boolean g;
    public final int h;
    public final String i;
    final /* synthetic */ ComponentTree k;
    public final aflw l;
    private final boolean o;
    private volatile Object p;
    private volatile Object q;
    private final AtomicInteger m = new AtomicInteger(-1);
    public final AtomicInteger f = new AtomicInteger(0);
    public volatile boolean j = false;
    private final FutureTask n = new FutureTask(new czh(this));

    public czi(ComponentTree componentTree, cyv cyvVar, cyr cyrVar, int i, int i2, boolean z, aflw aflwVar, int i3, String str, byte[] bArr) {
        this.k = componentTree;
        this.a = cyvVar;
        this.b = cyrVar;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.l = aflwVar;
        this.o = c(i3);
        this.h = i3;
        this.i = str;
    }

    private static final boolean c(int i) {
        return i == 0 || i == 2 || i == 4 || i == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0107 A[Catch: all -> 0x0080, TryCatch #11 {all -> 0x0080, blocks: (B:36:0x0071, B:104:0x00ff, B:106:0x0107, B:107:0x0109, B:108:0x010a, B:109:0x0113), top: B:125:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x010a A[Catch: all -> 0x0080, TryCatch #11 {all -> 0x0080, blocks: (B:36:0x0071, B:104:0x00ff, B:106:0x0107, B:107:0x0109, B:108:0x010a, B:109:0x0113), top: B:125:0x006f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dbq a(int r8) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czi.a(int):dbq");
    }

    public final synchronized void b() {
        if (this.j) {
            return;
        }
        this.q = null;
        this.p = null;
        this.j = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        czi cziVar = (czi) obj;
        return this.c == cziVar.c && this.d == cziVar.d && this.a.equals(cziVar.a) && this.b.k == cziVar.b.k;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.k) * 31) + this.c) * 31) + this.d;
    }
}
