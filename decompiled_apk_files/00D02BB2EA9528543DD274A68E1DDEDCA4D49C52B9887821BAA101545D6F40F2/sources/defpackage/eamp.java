package defpackage;

import java.lang.ref.SoftReference;
/* compiled from: PG */
/* renamed from: eamp  reason: default package */
/* loaded from: classes6.dex */
public final class eamp {
    static final int a;
    static final int b;
    protected static final ThreadLocal<SoftReference<eaod>> c;
    public final eanv d;
    protected final eant e;
    public final int f;
    public int g;

    static {
        eamv[] values;
        eamr[] values2;
        int i = 0;
        for (eamv eamvVar : eamv.values()) {
            if (eamvVar.k) {
                i |= eamvVar.b();
            }
        }
        a = i;
        int i2 = 0;
        for (eamr eamrVar : eamr.values()) {
            if (eamrVar.h) {
                i2 |= eamrVar.i;
            }
        }
        b = i2;
        c = new ThreadLocal<>();
    }

    public eamp() {
        eanv eanvVar = eanv.a;
        this.d = new eanv(null, true, true, eanvVar.e, eanvVar.f, eanvVar.g);
        this.e = new eant();
        this.f = a;
        this.g = b;
    }

    public static final eanm c(Object obj, boolean z) {
        ThreadLocal<SoftReference<eaod>> threadLocal = c;
        SoftReference<eaod> softReference = threadLocal.get();
        eaod eaodVar = softReference == null ? null : softReference.get();
        if (eaodVar == null) {
            eaodVar = new eaod();
            threadLocal.set(new SoftReference<>(eaodVar));
        }
        return new eanm(eaodVar, obj, z);
    }

    public final boolean a(eamv eamvVar) {
        return (eamvVar.b() & this.f) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
        if (r4.a(r12) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
        if (r4.a((r2[r6 + 1] & 255) | ((r2[r6] & 255) << 8)) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eamw b(java.io.InputStream r23) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eamp.b(java.io.InputStream):eamw");
    }
}
