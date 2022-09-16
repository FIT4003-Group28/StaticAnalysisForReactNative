package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aavl  reason: default package */
/* loaded from: classes.dex */
public final class aavl implements aavp {
    public static final long a = TimeUnit.HOURS.toSeconds(20);
    public static final long b = TimeUnit.HOURS.toSeconds(4);
    public static final long c = TimeUnit.HOURS.toSeconds(24);
    private final azqb d;
    private final aacz e;
    private final yjs f;

    public aavl(azqb azqbVar, yjs yjsVar, aacz aaczVar) {
        this.d = azqbVar;
        this.f = yjsVar;
        this.e = aaczVar;
    }

    private static int c(auml aumlVar) {
        int i = aumlVar.b;
        if (i > 0) {
            return i;
        }
        return 86400;
    }

    private final void d(int i, boolean z) {
        yjs yjsVar = this.f;
        long j = a;
        long j2 = b;
        yjsVar.d("innertube_config_fetch_charging", i + j + j2, j2 + j, z, 1, true, null, null);
    }

    private final void e(int i, boolean z, long j) {
        this.f.d("innertube_config_fetch", b + i + a, j, z, 1, false, null, null);
    }

    @Override // defpackage.aavp
    public final void a() {
        ylr.b();
        aavo aavoVar = (aavo) this.d.get();
        aavn a2 = aavoVar.a();
        a2.i();
        aavoVar.b(a2);
        atfw atfwVar = this.e.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        auml aumlVar = atfwVar.d;
        if (aumlVar == null) {
            aumlVar = auml.a;
        }
        int c2 = c(aumlVar);
        try {
            d(c2, true);
            e(c2, true, b);
        } catch (UnsupportedOperationException unused) {
            e(c2, true, c);
        }
    }

    @Override // defpackage.aavp
    public final void b() {
        atfw atfwVar = this.e.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        auml aumlVar = atfwVar.d;
        if (aumlVar == null) {
            aumlVar = auml.a;
        }
        int c2 = c(aumlVar);
        try {
            d(c2, false);
            e(c2, false, b);
        } catch (UnsupportedOperationException unused) {
            e(c2, false, c);
        }
    }
}
